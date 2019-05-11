package com.etilk.travel.whereto;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.InteresResourceApi;
import io.swagger.client.api.LocationResourceApi;
import io.swagger.client.api.UserDetailsResourceApi;
import io.swagger.client.model.InteresDTO;
import io.swagger.client.model.LocationDTO;
import io.swagger.client.model.TagDTO;
import io.swagger.client.model.UserDetailsDTO;

public class Client {
    public static ApiClient authenticatedApiClient;
    public static String username;
    private static UserDetailsDTO user;

    @SuppressWarnings("unchecked")
    public static void getPreferedLocation(final ApiCallback<List<LocationDTO>> callback, final int count) {
        AsyncTask asyncTask = new AsyncTask() {

            @Override
            protected Object doInBackground(Object[] objects) {
                try {
                    // Get locations
                    LocationResourceApi locationResourceApi = new LocationResourceApi(authenticatedApiClient);
                    List<LocationDTO> locations = locationResourceApi.getAllLocationsUsingGET(true, 0, 100000, new ArrayList<String>());
                    // Get user details
                    UserDetailsResourceApi userDetailsResourceApi = new UserDetailsResourceApi(authenticatedApiClient);
                    UserDetailsDTO userDetails = userDetailsResourceApi.getUserDetailsByUserUsingGET(username);

                    InteresResourceApi interesResourceApi = new InteresResourceApi(Client.authenticatedApiClient);
                    List<InteresDTO> interests = interesResourceApi.getAllInteresByUserIdUsingGET(Client.user.getId(), 0, 10000, new ArrayList<String>());

                    List<LocationDTO> bestLocations = findBestLocation(interests, locations, count);
                    callback.onSuccess(bestLocations, 200, new HashMap<String, List<String>>());

                } catch (ApiException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }.execute("");
    }

    public static void getPreferedGroupLocation(final ApiCallback<List<LocationDTO>> callback, final int count) {
        AsyncTask asyncTask = new AsyncTask() {
            @Override
            protected Object doInBackground(Object[] objects) {
                try {
                    // Get locations
                    LocationResourceApi locationResourceApi = new LocationResourceApi(authenticatedApiClient);
                    List<LocationDTO> locations = locationResourceApi.getAllLocationsUsingGET(true, 0, 100000, new ArrayList<String>());
                    // Get user details
                    UserDetailsResourceApi userDetailsResourceApi = new UserDetailsResourceApi(authenticatedApiClient);
                    UserDetailsDTO userDetails = userDetailsResourceApi.getUserDetailsByUserUsingGET(username);
                    List<InteresDTO> interests = userDetails.getInterests();
                    List<InteresDTO> mergedInterests = mergeInterests(interests, userDetails.getFriends());
                    List<LocationDTO> bestLocations = findBestLocation(mergedInterests, locations, count);
                    callback.onSuccess(bestLocations, 200, new HashMap<String, List<String>>());

                } catch (ApiException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
    }

    private static List<InteresDTO> mergeInterests(List<InteresDTO> interests, List<UserDetailsDTO> friends) {
        List<InteresDTO> summedInterests = new ArrayList<>(interests);
        for (UserDetailsDTO friend : friends) {
            for (InteresDTO friendsInterest : friend.getInterests()) {
                String tagName = friendsInterest.getTagName();
                for (InteresDTO sumInterest : summedInterests) {
                    if (sumInterest.getTagName().equals(tagName)) {
                        sumInterest.setValue(sumInterest.getValue() + friendsInterest.getValue());
                        break;
                    }
                }
            }
        }
        return summedInterests;
    }

    private static List<LocationDTO> findBestLocation(List<InteresDTO> interests, List<LocationDTO> locations, int count) {
        List<LocationDTO> bestLocations = new LinkedList<>();
        while (count > 0) {
            LocationDTO bestLocation = locations.get(0);
            int sum = 0;
            for (InteresDTO interest : interests) {
                sum += interest.getValue();
            }
            double bestDistance = distance(bestLocation, interests, sum);
            for (LocationDTO location : locations) {
                double currentDistance = distance(location, interests, sum);
                if (currentDistance < bestDistance) {
                    bestDistance = currentDistance;
                    bestLocation = location;
                }
            }
            bestLocations.add(bestLocation);
            locations.remove(bestLocation);
            count--;
        }
        locations.addAll(bestLocations);
        return bestLocations;
    }

    private static double distance(LocationDTO location, List<InteresDTO> interests, double sum) {
        double distance = 0d;
        for (InteresDTO interest : interests) {
            boolean exists = false;
            for (TagDTO tag : location.getTags()) {
                if (tag.getName().equals(interest.getTagName())) {
                    exists = true;
                    break;
                }
            }
            if (exists) {
                double difference = 1 - (interest.getValue() / sum);
                distance += difference * difference;
            } else {
                double difference = 0 - (interest.getValue() / sum);
                distance += difference * difference;
            }
        }
        return distance;
    }

    public static UserDetailsDTO getUser() {
        return user;
    }

    public static void setUser(UserDetailsDTO user) {
        Client.user = user;
    }
}

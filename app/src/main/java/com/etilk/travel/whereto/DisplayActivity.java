package com.etilk.travel.whereto;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiException;
import io.swagger.client.api.DisplayResourceApi;
import io.swagger.client.api.InteresResourceApi;
import io.swagger.client.model.DisplayDTO;
import io.swagger.client.model.InteresDTO;
import io.swagger.client.model.TagDTO;
import io.swagger.client.model.UserDetailsDTO;

public class DisplayActivity extends AppCompatActivity {

    ImageView displayImageView;
    Button btnLike;
    Button btnDislike;

    Integer count = 0;

    DisplayDTO displayDTO;

    private void initViews() {
        displayImageView = findViewById(R.id.displayImageView);
        btnLike = findViewById(R.id.btnLike);
        btnDislike = findViewById(R.id.btnDislike);
    }

    private void initListeners() {
        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liked();
            }
        });

        btnDislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disliked();
            }
        });
    }

    private void disliked() {
        btnDislike.setEnabled(false);
        btnLike.setEnabled(false);
        count++;
        getLocations(count);
    }

    private void liked() {
        btnDislike.setEnabled(false);
        btnLike.setEnabled(false);
        count++;
        saveUser(displayDTO.getTags());
        getLocations(count);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        initViews();
        initListeners();
        getLocations(0);
    }

    public void setDisplayDTO(List<DisplayDTO> locationDTOS) {
        this.displayDTO = locationDTOS.get(0);
    }

    public void getLocations(Integer i) {
        DisplayResourceApi displayResourceApi = new DisplayResourceApi(Client.authenticatedApiClient);
        try {
            displayResourceApi.getAllDisplaysUsingGETAsync(true, i, 1, new ArrayList<String>(), new ApiCallback<List<DisplayDTO>>() {

                @Override
                public void onFailure(ApiException e, int i, Map<String, List<String>> map) {
                    e.printStackTrace();
                }

                @Override
                public void onSuccess(List<DisplayDTO> displayDTOS, int i, Map<String, List<String>> map) {
                    setDisplayDTO(displayDTOS);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            readyView();
                        }
                    });
                }

                @Override
                public void onUploadProgress(long l, long l1, boolean b) {

                }

                @Override
                public void onDownloadProgress(long l, long l1, boolean b) {

                }
            });
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    public void saveUser(final List<TagDTO> tagDTOS) {
        increaseTags(Client.getUser(), tagDTOS);
    }

    private void increaseTags(UserDetailsDTO userDetailsDTO, final List<TagDTO> tagDTOS) {
        try {
            InteresResourceApi interesResourceApi1 = new InteresResourceApi(Client.authenticatedApiClient);
            interesResourceApi1.getAllInteresByUserIdUsingGETAsync(Client.getUser().getId(), 0, 10000, new ArrayList<String>(), new ApiCallback<List<InteresDTO>>() {
                @Override
                public void onFailure(ApiException e, int i, Map<String, List<String>> map) {

                }

                @Override
                public void onSuccess(List<InteresDTO> interesDTOS, int i, Map<String, List<String>> map) {

                    for (TagDTO tagDTO : tagDTOS) {
                        Boolean interestFound = false;
                        for (InteresDTO interesDTO : interesDTOS) {
                            if (interesDTO.getTagName().equals(tagDTO.getName())) {
                                interesDTO.setValue(interesDTO.getValue() + 1);
                                interestFound = true;
                                InteresResourceApi interesResourceApi = new InteresResourceApi(Client.authenticatedApiClient);
                                try {
                                    interesResourceApi.updateInteresUsingPUTAsync(interesDTO, new ApiCallback<InteresDTO>() {
                                        @Override
                                        public void onFailure(ApiException e, int i, Map<String, List<String>> map) {

                                        }

                                        @Override
                                        public void onSuccess(InteresDTO interesDTO, int i, Map<String, List<String>> map) {

                                        }

                                        @Override
                                        public void onUploadProgress(long l, long l1, boolean b) {

                                        }

                                        @Override
                                        public void onDownloadProgress(long l, long l1, boolean b) {

                                        }
                                    });
                                } catch (ApiException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        if (!interestFound) {
                            //todo: check
                            InteresDTO newInteres = new InteresDTO();
                            newInteres.setValue(1);
                            newInteres.setTagId(tagDTO.getId());
                            newInteres.setUserId(Client.getUser().getId());
                            newInteres.setUserName(Client.getUser().getName());
                            newInteres.setTagName(tagDTO.getName());
                            InteresResourceApi interesResourceApi = new InteresResourceApi(Client.authenticatedApiClient);
                            try {
                                interesResourceApi.createInteresUsingPOSTAsync(newInteres, new ApiCallback<InteresDTO>() {
                                    @Override
                                    public void onFailure(ApiException e, int i, Map<String, List<String>> map) {

                                    }

                                    @Override
                                    public void onSuccess(InteresDTO interesDTO, int i, Map<String, List<String>> map) {

                                    }

                                    @Override
                                    public void onUploadProgress(long l, long l1, boolean b) {

                                    }

                                    @Override
                                    public void onDownloadProgress(long l, long l1, boolean b) {

                                    }
                                });
                            } catch (ApiException e) {
                                e.printStackTrace();
                            }
                            Client.getUser().getInterests().add(newInteres);
                        }
                    }
                }

                @Override
                public void onUploadProgress(long l, long l1, boolean b) {

                }

                @Override
                public void onDownloadProgress(long l, long l1, boolean b) {

                }
            });
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private void readyView() {

        byte[] decodedString = Base64.decode(displayDTO.getImage(), Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);

        btnDislike.setEnabled(true);
        btnLike.setEnabled(true);
        displayImageView.setImageBitmap(decodedByte);

        System.out.println("ok");
    }
}

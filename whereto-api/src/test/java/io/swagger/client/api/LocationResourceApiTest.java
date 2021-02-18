/*
 * WhereTo API
 * WhereTo API documentation
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.LocationDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationResourceApi
 */
@Ignore
public class LocationResourceApiTest {

    private final LocationResourceApi api = new LocationResourceApi();

    /**
     * createLocation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLocationUsingPOSTTest() throws ApiException {
        LocationDTO body = null;
        LocationDTO response = api.createLocationUsingPOST(body);

        // TODO: test validations
    }
    /**
     * deleteLocation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLocationUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteLocationUsingDELETE(id);

        // TODO: test validations
    }
    /**
     * getAllLocations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllLocationsUsingGETTest() throws ApiException {
        Boolean eagerload = null;
        Integer page = null;
        Integer size = null;
        List<String> sort = null;
        List<LocationDTO> response = api.getAllLocationsUsingGET(eagerload, page, size, sort);

        // TODO: test validations
    }
    /**
     * getLocation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationUsingGETTest() throws ApiException {
        Long id = null;
        LocationDTO response = api.getLocationUsingGET(id);

        // TODO: test validations
    }
    /**
     * updateLocation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLocationUsingPUTTest() throws ApiException {
        LocationDTO body = null;
        LocationDTO response = api.updateLocationUsingPUT(body);

        // TODO: test validations
    }
}

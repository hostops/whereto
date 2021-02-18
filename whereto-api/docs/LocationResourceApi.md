# LocationResourceApi

All URIs are relative to *//travel.etilk.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLocationUsingPOST**](LocationResourceApi.md#createLocationUsingPOST) | **POST** /api/locations | createLocation
[**deleteLocationUsingDELETE**](LocationResourceApi.md#deleteLocationUsingDELETE) | **DELETE** /api/locations/{id} | deleteLocation
[**getAllLocationsUsingGET**](LocationResourceApi.md#getAllLocationsUsingGET) | **GET** /api/locations | getAllLocations
[**getLocationUsingGET**](LocationResourceApi.md#getLocationUsingGET) | **GET** /api/locations/{id} | getLocation
[**updateLocationUsingPUT**](LocationResourceApi.md#updateLocationUsingPUT) | **PUT** /api/locations | updateLocation

<a name="createLocationUsingPOST"></a>
# **createLocationUsingPOST**
> LocationDTO createLocationUsingPOST(body)

createLocation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationResourceApi;


LocationResourceApi apiInstance = new LocationResourceApi();
LocationDTO body = new LocationDTO(); // LocationDTO | locationDTO
try {
    LocationDTO result = apiInstance.createLocationUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationResourceApi#createLocationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationDTO**](LocationDTO.md)| locationDTO |

### Return type

[**LocationDTO**](LocationDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteLocationUsingDELETE"></a>
# **deleteLocationUsingDELETE**
> deleteLocationUsingDELETE(id)

deleteLocation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationResourceApi;


LocationResourceApi apiInstance = new LocationResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteLocationUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationResourceApi#deleteLocationUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllLocationsUsingGET"></a>
# **getAllLocationsUsingGET**
> List&lt;LocationDTO&gt; getAllLocationsUsingGET(eagerload, page, size, sort)

getAllLocations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationResourceApi;


LocationResourceApi apiInstance = new LocationResourceApi();
Boolean eagerload = true; // Boolean | eagerload
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<LocationDTO> result = apiInstance.getAllLocationsUsingGET(eagerload, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationResourceApi#getAllLocationsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eagerload** | **Boolean**| eagerload | [optional]
 **page** | **Integer**| Page number of the requested page | [optional]
 **size** | **Integer**| Size of a page | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**List&lt;LocationDTO&gt;**](LocationDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLocationUsingGET"></a>
# **getLocationUsingGET**
> LocationDTO getLocationUsingGET(id)

getLocation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationResourceApi;


LocationResourceApi apiInstance = new LocationResourceApi();
Long id = 789L; // Long | id
try {
    LocationDTO result = apiInstance.getLocationUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationResourceApi#getLocationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**LocationDTO**](LocationDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateLocationUsingPUT"></a>
# **updateLocationUsingPUT**
> LocationDTO updateLocationUsingPUT(body)

updateLocation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationResourceApi;


LocationResourceApi apiInstance = new LocationResourceApi();
LocationDTO body = new LocationDTO(); // LocationDTO | locationDTO
try {
    LocationDTO result = apiInstance.updateLocationUsingPUT(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationResourceApi#updateLocationUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationDTO**](LocationDTO.md)| locationDTO |

### Return type

[**LocationDTO**](LocationDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


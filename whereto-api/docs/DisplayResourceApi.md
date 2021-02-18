# DisplayResourceApi

All URIs are relative to *//travel.etilk.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDisplayUsingPOST**](DisplayResourceApi.md#createDisplayUsingPOST) | **POST** /api/displays | createDisplay
[**deleteDisplayUsingDELETE**](DisplayResourceApi.md#deleteDisplayUsingDELETE) | **DELETE** /api/displays/{id} | deleteDisplay
[**getAllDisplaysUsingGET**](DisplayResourceApi.md#getAllDisplaysUsingGET) | **GET** /api/displays | getAllDisplays
[**getDisplayUsingGET**](DisplayResourceApi.md#getDisplayUsingGET) | **GET** /api/displays/{id} | getDisplay
[**updateDisplayUsingPUT**](DisplayResourceApi.md#updateDisplayUsingPUT) | **PUT** /api/displays | updateDisplay

<a name="createDisplayUsingPOST"></a>
# **createDisplayUsingPOST**
> DisplayDTO createDisplayUsingPOST(body)

createDisplay

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DisplayResourceApi;


DisplayResourceApi apiInstance = new DisplayResourceApi();
DisplayDTO body = new DisplayDTO(); // DisplayDTO | displayDTO
try {
    DisplayDTO result = apiInstance.createDisplayUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisplayResourceApi#createDisplayUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DisplayDTO**](DisplayDTO.md)| displayDTO |

### Return type

[**DisplayDTO**](DisplayDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteDisplayUsingDELETE"></a>
# **deleteDisplayUsingDELETE**
> deleteDisplayUsingDELETE(id)

deleteDisplay

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DisplayResourceApi;


DisplayResourceApi apiInstance = new DisplayResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteDisplayUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DisplayResourceApi#deleteDisplayUsingDELETE");
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

<a name="getAllDisplaysUsingGET"></a>
# **getAllDisplaysUsingGET**
> List&lt;DisplayDTO&gt; getAllDisplaysUsingGET(eagerload, page, size, sort)

getAllDisplays

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DisplayResourceApi;


DisplayResourceApi apiInstance = new DisplayResourceApi();
Boolean eagerload = true; // Boolean | eagerload
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<DisplayDTO> result = apiInstance.getAllDisplaysUsingGET(eagerload, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisplayResourceApi#getAllDisplaysUsingGET");
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

[**List&lt;DisplayDTO&gt;**](DisplayDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDisplayUsingGET"></a>
# **getDisplayUsingGET**
> DisplayDTO getDisplayUsingGET(id)

getDisplay

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DisplayResourceApi;


DisplayResourceApi apiInstance = new DisplayResourceApi();
Long id = 789L; // Long | id
try {
    DisplayDTO result = apiInstance.getDisplayUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisplayResourceApi#getDisplayUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**DisplayDTO**](DisplayDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateDisplayUsingPUT"></a>
# **updateDisplayUsingPUT**
> DisplayDTO updateDisplayUsingPUT(body)

updateDisplay

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DisplayResourceApi;


DisplayResourceApi apiInstance = new DisplayResourceApi();
DisplayDTO body = new DisplayDTO(); // DisplayDTO | displayDTO
try {
    DisplayDTO result = apiInstance.updateDisplayUsingPUT(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisplayResourceApi#updateDisplayUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DisplayDTO**](DisplayDTO.md)| displayDTO |

### Return type

[**DisplayDTO**](DisplayDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


# InteresResourceApi

All URIs are relative to *//travel.etilk.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInteresUsingPOST**](InteresResourceApi.md#createInteresUsingPOST) | **POST** /api/interes | createInteres
[**deleteInteresUsingDELETE**](InteresResourceApi.md#deleteInteresUsingDELETE) | **DELETE** /api/interes/{id} | deleteInteres
[**getAllInteresByUserIdUsingGET**](InteresResourceApi.md#getAllInteresByUserIdUsingGET) | **GET** /api/interes/by-user-id/:id | getAllInteresByUserId
[**getAllInteresUsingGET**](InteresResourceApi.md#getAllInteresUsingGET) | **GET** /api/interes | getAllInteres
[**getInteresUsingGET**](InteresResourceApi.md#getInteresUsingGET) | **GET** /api/interes/{id} | getInteres
[**updateInteresUsingPUT**](InteresResourceApi.md#updateInteresUsingPUT) | **PUT** /api/interes | updateInteres

<a name="createInteresUsingPOST"></a>
# **createInteresUsingPOST**
> InteresDTO createInteresUsingPOST(body)

createInteres

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InteresResourceApi;


InteresResourceApi apiInstance = new InteresResourceApi();
InteresDTO body = new InteresDTO(); // InteresDTO | interesDTO
try {
    InteresDTO result = apiInstance.createInteresUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteresResourceApi#createInteresUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InteresDTO**](InteresDTO.md)| interesDTO |

### Return type

[**InteresDTO**](InteresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteInteresUsingDELETE"></a>
# **deleteInteresUsingDELETE**
> deleteInteresUsingDELETE(id)

deleteInteres

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InteresResourceApi;


InteresResourceApi apiInstance = new InteresResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteInteresUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InteresResourceApi#deleteInteresUsingDELETE");
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

<a name="getAllInteresByUserIdUsingGET"></a>
# **getAllInteresByUserIdUsingGET**
> List&lt;InteresDTO&gt; getAllInteresByUserIdUsingGET(id, page, size, sort)

getAllInteresByUserId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InteresResourceApi;


InteresResourceApi apiInstance = new InteresResourceApi();
Long id = 789L; // Long | id
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<InteresDTO> result = apiInstance.getAllInteresByUserIdUsingGET(id, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteresResourceApi#getAllInteresByUserIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id | [optional]
 **page** | **Integer**| Page number of the requested page | [optional]
 **size** | **Integer**| Size of a page | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**List&lt;InteresDTO&gt;**](InteresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllInteresUsingGET"></a>
# **getAllInteresUsingGET**
> List&lt;InteresDTO&gt; getAllInteresUsingGET(page, size, sort)

getAllInteres

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InteresResourceApi;


InteresResourceApi apiInstance = new InteresResourceApi();
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<InteresDTO> result = apiInstance.getAllInteresUsingGET(page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteresResourceApi#getAllInteresUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number of the requested page | [optional]
 **size** | **Integer**| Size of a page | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**List&lt;InteresDTO&gt;**](InteresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInteresUsingGET"></a>
# **getInteresUsingGET**
> InteresDTO getInteresUsingGET(id)

getInteres

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InteresResourceApi;


InteresResourceApi apiInstance = new InteresResourceApi();
Long id = 789L; // Long | id
try {
    InteresDTO result = apiInstance.getInteresUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteresResourceApi#getInteresUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**InteresDTO**](InteresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateInteresUsingPUT"></a>
# **updateInteresUsingPUT**
> InteresDTO updateInteresUsingPUT(body)

updateInteres

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InteresResourceApi;


InteresResourceApi apiInstance = new InteresResourceApi();
InteresDTO body = new InteresDTO(); // InteresDTO | interesDTO
try {
    InteresDTO result = apiInstance.updateInteresUsingPUT(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InteresResourceApi#updateInteresUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InteresDTO**](InteresDTO.md)| interesDTO |

### Return type

[**InteresDTO**](InteresDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


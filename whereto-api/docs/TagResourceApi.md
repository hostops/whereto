# TagResourceApi

All URIs are relative to *//travel.etilk.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTagUsingPOST**](TagResourceApi.md#createTagUsingPOST) | **POST** /api/tags | createTag
[**deleteTagUsingDELETE**](TagResourceApi.md#deleteTagUsingDELETE) | **DELETE** /api/tags/{id} | deleteTag
[**getAllTagsUsingGET**](TagResourceApi.md#getAllTagsUsingGET) | **GET** /api/tags | getAllTags
[**getTagUsingGET**](TagResourceApi.md#getTagUsingGET) | **GET** /api/tags/{id} | getTag
[**updateTagUsingPUT**](TagResourceApi.md#updateTagUsingPUT) | **PUT** /api/tags | updateTag

<a name="createTagUsingPOST"></a>
# **createTagUsingPOST**
> TagDTO createTagUsingPOST(body)

createTag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagResourceApi;


TagResourceApi apiInstance = new TagResourceApi();
TagDTO body = new TagDTO(); // TagDTO | tagDTO
try {
    TagDTO result = apiInstance.createTagUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagResourceApi#createTagUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagDTO**](TagDTO.md)| tagDTO |

### Return type

[**TagDTO**](TagDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteTagUsingDELETE"></a>
# **deleteTagUsingDELETE**
> deleteTagUsingDELETE(id)

deleteTag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagResourceApi;


TagResourceApi apiInstance = new TagResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteTagUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagResourceApi#deleteTagUsingDELETE");
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

<a name="getAllTagsUsingGET"></a>
# **getAllTagsUsingGET**
> List&lt;TagDTO&gt; getAllTagsUsingGET(page, size, sort)

getAllTags

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagResourceApi;


TagResourceApi apiInstance = new TagResourceApi();
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<TagDTO> result = apiInstance.getAllTagsUsingGET(page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagResourceApi#getAllTagsUsingGET");
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

[**List&lt;TagDTO&gt;**](TagDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTagUsingGET"></a>
# **getTagUsingGET**
> TagDTO getTagUsingGET(id)

getTag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagResourceApi;


TagResourceApi apiInstance = new TagResourceApi();
Long id = 789L; // Long | id
try {
    TagDTO result = apiInstance.getTagUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagResourceApi#getTagUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**TagDTO**](TagDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateTagUsingPUT"></a>
# **updateTagUsingPUT**
> TagDTO updateTagUsingPUT(body)

updateTag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TagResourceApi;


TagResourceApi apiInstance = new TagResourceApi();
TagDTO body = new TagDTO(); // TagDTO | tagDTO
try {
    TagDTO result = apiInstance.updateTagUsingPUT(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagResourceApi#updateTagUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagDTO**](TagDTO.md)| tagDTO |

### Return type

[**TagDTO**](TagDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


# UserDetailsResourceApi

All URIs are relative to *//travel.etilk.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserDetailsUsingPOST**](UserDetailsResourceApi.md#createUserDetailsUsingPOST) | **POST** /api/user-details | createUserDetails
[**deleteUserDetailsUsingDELETE**](UserDetailsResourceApi.md#deleteUserDetailsUsingDELETE) | **DELETE** /api/user-details/{id} | deleteUserDetails
[**getAllUserDetailsUsingGET**](UserDetailsResourceApi.md#getAllUserDetailsUsingGET) | **GET** /api/user-details | getAllUserDetails
[**getUserDetailsByUserUsingGET**](UserDetailsResourceApi.md#getUserDetailsByUserUsingGET) | **GET** /api/user-details/by-login/{login} | getUserDetailsByUser
[**getUserDetailsUsingGET**](UserDetailsResourceApi.md#getUserDetailsUsingGET) | **GET** /api/user-details/{id} | getUserDetails
[**updateUserDetailsUsingPUT**](UserDetailsResourceApi.md#updateUserDetailsUsingPUT) | **PUT** /api/user-details | updateUserDetails

<a name="createUserDetailsUsingPOST"></a>
# **createUserDetailsUsingPOST**
> UserDetailsDTO createUserDetailsUsingPOST(body)

createUserDetails

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserDetailsResourceApi;


UserDetailsResourceApi apiInstance = new UserDetailsResourceApi();
UserDetailsDTO body = new UserDetailsDTO(); // UserDetailsDTO | userDetailsDTO
try {
    UserDetailsDTO result = apiInstance.createUserDetailsUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDetailsResourceApi#createUserDetailsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserDetailsDTO**](UserDetailsDTO.md)| userDetailsDTO |

### Return type

[**UserDetailsDTO**](UserDetailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUserDetailsUsingDELETE"></a>
# **deleteUserDetailsUsingDELETE**
> deleteUserDetailsUsingDELETE(id)

deleteUserDetails

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserDetailsResourceApi;


UserDetailsResourceApi apiInstance = new UserDetailsResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteUserDetailsUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDetailsResourceApi#deleteUserDetailsUsingDELETE");
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

<a name="getAllUserDetailsUsingGET"></a>
# **getAllUserDetailsUsingGET**
> List&lt;UserDetailsDTO&gt; getAllUserDetailsUsingGET(eagerload, page, size, sort)

getAllUserDetails

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserDetailsResourceApi;


UserDetailsResourceApi apiInstance = new UserDetailsResourceApi();
Boolean eagerload = true; // Boolean | eagerload
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<UserDetailsDTO> result = apiInstance.getAllUserDetailsUsingGET(eagerload, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDetailsResourceApi#getAllUserDetailsUsingGET");
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

[**List&lt;UserDetailsDTO&gt;**](UserDetailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserDetailsByUserUsingGET"></a>
# **getUserDetailsByUserUsingGET**
> UserDetailsDTO getUserDetailsByUserUsingGET(login)

getUserDetailsByUser

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserDetailsResourceApi;


UserDetailsResourceApi apiInstance = new UserDetailsResourceApi();
String login = "login_example"; // String | login
try {
    UserDetailsDTO result = apiInstance.getUserDetailsByUserUsingGET(login);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDetailsResourceApi#getUserDetailsByUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**| login |

### Return type

[**UserDetailsDTO**](UserDetailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUserDetailsUsingGET"></a>
# **getUserDetailsUsingGET**
> UserDetailsDTO getUserDetailsUsingGET(id)

getUserDetails

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserDetailsResourceApi;


UserDetailsResourceApi apiInstance = new UserDetailsResourceApi();
Long id = 789L; // Long | id
try {
    UserDetailsDTO result = apiInstance.getUserDetailsUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDetailsResourceApi#getUserDetailsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**UserDetailsDTO**](UserDetailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateUserDetailsUsingPUT"></a>
# **updateUserDetailsUsingPUT**
> UserDetailsDTO updateUserDetailsUsingPUT(body)

updateUserDetails

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserDetailsResourceApi;


UserDetailsResourceApi apiInstance = new UserDetailsResourceApi();
UserDetailsDTO body = new UserDetailsDTO(); // UserDetailsDTO | userDetailsDTO
try {
    UserDetailsDTO result = apiInstance.updateUserDetailsUsingPUT(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDetailsResourceApi#updateUserDetailsUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserDetailsDTO**](UserDetailsDTO.md)| userDetailsDTO |

### Return type

[**UserDetailsDTO**](UserDetailsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


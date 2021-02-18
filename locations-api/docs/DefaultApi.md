# DefaultApi

All URIs are relative to *https://kiwicom-prod.apigee.net/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationsAnythingGet**](DefaultApi.md#locationsAnythingGet) | **GET** /locations/anything | Get by anything
[**locationsBoxGet**](DefaultApi.md#locationsBoxGet) | **GET** /locations/box | Search by box
[**locationsDumpGet**](DefaultApi.md#locationsDumpGet) | **GET** /locations/dump | Get dump
[**locationsHashtagGet**](DefaultApi.md#locationsHashtagGet) | **GET** /locations/hashtag | Search by hashtags
[**locationsIdGet**](DefaultApi.md#locationsIdGet) | **GET** /locations/id | Get by id
[**locationsQueryGet**](DefaultApi.md#locationsQueryGet) | **GET** /locations/query | Search by query
[**locationsRadiusGet**](DefaultApi.md#locationsRadiusGet) | **GET** /locations/radius | Search by radius
[**locationsSlugGet**](DefaultApi.md#locationsSlugGet) | **GET** /locations/slug | Search by seo url
[**locationsSubentityGet**](DefaultApi.md#locationsSubentityGet) | **GET** /locations/subentity | Get by subentity
[**locationsTopdestinationsGet**](DefaultApi.md#locationsTopdestinationsGet) | **GET** /locations/topdestinations | Search top destinations
[**locationsTophashtagsGet**](DefaultApi.md#locationsTophashtagsGet) | **GET** /locations/tophashtags | Top destinations&#x60; hashtags lookup

<a name="locationsAnythingGet"></a>
# **locationsAnythingGet**
> InlineResponse200 locationsAnythingGet(apikey, key, value, activeOnly)

Get by anything

Get locations specified by any of the following fields for example - id, int_id, code, icao, name, slug, etc.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | 
String key = "key_example"; // String | key is the field in response.  To be used in conjunction with the 'value' field.
String value = "value_example"; // String | value of the field selected in key.  To be used in conjunctions with the 'key' field.  It returns locations that match the specified conditions.
Boolean activeOnly = true; // Boolean | default value = true.  It displayes all active locations.
try {
    InlineResponse200 result = apiInstance.locationsAnythingGet(apikey, key, value, activeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationsAnythingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**|  |
 **key** | **String**| key is the field in response.  To be used in conjunction with the &#x27;value&#x27; field. |
 **value** | **String**| value of the field selected in key.  To be used in conjunctions with the &#x27;key&#x27; field.  It returns locations that match the specified conditions. |
 **activeOnly** | **Boolean**| default value &#x3D; true.  It displayes all active locations. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationsBoxGet"></a>
# **locationsBoxGet**
> InlineResponse200 locationsBoxGet(apikey, lowLat, lowLon, highLat, highLon, locale, locationTypes, limit, sort, activeOnly)

Search by box

Get all locations within the specified box.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | 
String lowLat = "lowLat_example"; // String | latitude of southwest corner of geo box search; `40.2` is also acceptable.
String lowLon = "lowLon_example"; // String | longitude of southwest corner of geo box search; `-74.6` is also acceptable.
String highLat = "highLat_example"; // String | latitude of northeast corner of geo box search; `44.7` is also acceptable.
String highLon = "highLon_example"; // String | longitude of northeast corner of geo box search; `-73.3` is also acceptable.
String locale = "locale_example"; // String | desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used.
String locationTypes = "locationTypes_example"; // String | desired location output, accepted values: `station`, `airport`, `bus_station`, `city`, `autonomous_territory`, `subdivision`, `country`, `region`, `continent`. To use more than one `location_types`, use multiple `&location_types=`
Integer limit = 56; // Integer | default value = 20. Desired number of results in the output.
String sort = "sort_example"; // String | desired order of the output.  For A->Z use 'sort=name', for Z->A use 'sort=-name'.
Boolean activeOnly = true; // Boolean | default value = true.  It displayes all active locations.
try {
    InlineResponse200 result = apiInstance.locationsBoxGet(apikey, lowLat, lowLon, highLat, highLon, locale, locationTypes, limit, sort, activeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationsBoxGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**|  |
 **lowLat** | **String**| latitude of southwest corner of geo box search; &#x60;40.2&#x60; is also acceptable. |
 **lowLon** | **String**| longitude of southwest corner of geo box search; &#x60;-74.6&#x60; is also acceptable. |
 **highLat** | **String**| latitude of northeast corner of geo box search; &#x60;44.7&#x60; is also acceptable. |
 **highLon** | **String**| longitude of northeast corner of geo box search; &#x60;-73.3&#x60; is also acceptable. |
 **locale** | **String**| desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used. | [optional]
 **locationTypes** | **String**| desired location output, accepted values: &#x60;station&#x60;, &#x60;airport&#x60;, &#x60;bus_station&#x60;, &#x60;city&#x60;, &#x60;autonomous_territory&#x60;, &#x60;subdivision&#x60;, &#x60;country&#x60;, &#x60;region&#x60;, &#x60;continent&#x60;. To use more than one &#x60;location_types&#x60;, use multiple &#x60;&amp;location_types&#x3D;&#x60; | [optional]
 **limit** | **Integer**| default value &#x3D; 20. Desired number of results in the output. | [optional]
 **sort** | **String**| desired order of the output.  For A-&gt;Z use &#x27;sort&#x3D;name&#x27;, for Z-&gt;A use &#x27;sort&#x3D;-name&#x27;. | [optional]
 **activeOnly** | **Boolean**| default value &#x3D; true.  It displayes all active locations. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationsDumpGet"></a>
# **locationsDumpGet**
> InlineResponse200 locationsDumpGet(apikey, locale, locationTypes, limit, sort, activeOnly)

Get dump

Get dump of locations data in specified language.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | 
String locale = "locale_example"; // String | desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used.
String locationTypes = "locationTypes_example"; // String | desired location output, accepted values: `station`, `airport`, `bus_station`, `city`, `autonomous_territory`, `subdivision`, `country`, `region`, `continent`. To use more than one `location_types`, use multiple `&location_types=`
Integer limit = 56; // Integer | default value = 20. Desired number of results in the output.
String sort = "sort_example"; // String | desired order of the output.  For A->Z use 'sort=name', for Z->A use 'sort=-name'.
Boolean activeOnly = true; // Boolean | default value = true.  It displayes all active locations.
try {
    InlineResponse200 result = apiInstance.locationsDumpGet(apikey, locale, locationTypes, limit, sort, activeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationsDumpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**|  |
 **locale** | **String**| desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used. | [optional]
 **locationTypes** | **String**| desired location output, accepted values: &#x60;station&#x60;, &#x60;airport&#x60;, &#x60;bus_station&#x60;, &#x60;city&#x60;, &#x60;autonomous_territory&#x60;, &#x60;subdivision&#x60;, &#x60;country&#x60;, &#x60;region&#x60;, &#x60;continent&#x60;. To use more than one &#x60;location_types&#x60;, use multiple &#x60;&amp;location_types&#x3D;&#x60; | [optional]
 **limit** | **Integer**| default value &#x3D; 20. Desired number of results in the output. | [optional]
 **sort** | **String**| desired order of the output.  For A-&gt;Z use &#x27;sort&#x3D;name&#x27;, for Z-&gt;A use &#x27;sort&#x3D;-name&#x27;. | [optional]
 **activeOnly** | **Boolean**| default value &#x3D; true.  It displayes all active locations. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationsHashtagGet"></a>
# **locationsHashtagGet**
> InlineResponse200 locationsHashtagGet(apikey, hashtag, term, month, locale, limit, sort, activeOnly)

Search by hashtags

This type of request returns a list of destinations most searched / clicked on / booked from the starting point &#x60;term&#x60;.  The &#x60;limit&#x60; is used to limit the range of results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | 
String hashtag = "hashtag_example"; // String | hashtag that the returned location have to be tagged with.
String term = "term_example"; // String | identifier of the location the returned locations should be part of - id (`airport`, `station`, `bus_station`, `city`, `subdivision`, `autonomous_territory`, `country`).
Integer month = 56; // Integer | the month in which the hashtag should be valid. Multiple values are allowed.
String locale = "locale_example"; // String | desired locale output - this is the language of the results. Should any other locale be used other than the specified locales, en-US is used.
Integer limit = 56; // Integer | default value = 100. Desired number of results in the output.
String sort = "sort_example"; // String | 
Boolean activeOnly = true; // Boolean | default value = true.  It displays all active locations.
try {
    InlineResponse200 result = apiInstance.locationsHashtagGet(apikey, hashtag, term, month, locale, limit, sort, activeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationsHashtagGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**|  |
 **hashtag** | **String**| hashtag that the returned location have to be tagged with. |
 **term** | **String**| identifier of the location the returned locations should be part of - id (&#x60;airport&#x60;, &#x60;station&#x60;, &#x60;bus_station&#x60;, &#x60;city&#x60;, &#x60;subdivision&#x60;, &#x60;autonomous_territory&#x60;, &#x60;country&#x60;). | [optional]
 **month** | **Integer**| the month in which the hashtag should be valid. Multiple values are allowed. | [optional]
 **locale** | **String**| desired locale output - this is the language of the results. Should any other locale be used other than the specified locales, en-US is used. | [optional]
 **limit** | **Integer**| default value &#x3D; 100. Desired number of results in the output. | [optional]
 **sort** | **String**|  | [optional]
 **activeOnly** | **Boolean**| default value &#x3D; true.  It displays all active locations. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationsIdGet"></a>
# **locationsIdGet**
> InlineResponse200 locationsIdGet(apikey, id, limit, locale, activeOnly)

Get by id

Get location specified by its id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | 
String id = "id_example"; // String | this is the exact IATA airport or ISO3166 location code - `station`, `airport`, `city`, `autonomous_territory`, `subdivision`, `country`, `region`, `continent`. Multiple ids can be specified by appending `&id={id}`.
Integer limit = 56; // Integer | default value = 20. Desired number of results in the output.
String locale = "locale_example"; // String | desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used.
Boolean activeOnly = true; // Boolean | default value = true.  It displayes all active locations.
try {
    InlineResponse200 result = apiInstance.locationsIdGet(apikey, id, limit, locale, activeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**|  |
 **id** | **String**| this is the exact IATA airport or ISO3166 location code - &#x60;station&#x60;, &#x60;airport&#x60;, &#x60;city&#x60;, &#x60;autonomous_territory&#x60;, &#x60;subdivision&#x60;, &#x60;country&#x60;, &#x60;region&#x60;, &#x60;continent&#x60;. Multiple ids can be specified by appending &#x60;&amp;id&#x3D;{id}&#x60;. |
 **limit** | **Integer**| default value &#x3D; 20. Desired number of results in the output. | [optional]
 **locale** | **String**| desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used. | [optional]
 **activeOnly** | **Boolean**| default value &#x3D; true.  It displayes all active locations. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationsQueryGet"></a>
# **locationsQueryGet**
> InlineResponse200 locationsQueryGet(apikey, term, locale, locationTypes, limit, activeOnly, sort)

Search by query

Type of request used mainly for suggestions (based on incomplete names)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | 
String term = "term_example"; // String | searched term (for suggestions).  This parameter expects a full IATA code. If IATA code is not given, the search will go through other available fields: 'id', 'name' or 'code' of the location. It also depends on the 'location_types' specified eg. airport, city, country.  The search that is used behind the scenes is elasticsearch.  It returns data based on relevancy and many other factors.
String locale = "locale_example"; // String | desired locale output - this is the language of the results. Should any other locale be used other than the specified locales, en-US is used.
String locationTypes = "locationTypes_example"; // String | desired location output, accepted values: `station`, `airport`, `bus_station`, `city`, `autonomous_territory`, `subdivision`, `country`, `region`, `continent`. To use more than one `location_types`, use multiple `&location_types=`
Integer limit = 56; // Integer | default value = 10. Desired number of results in the output.
Boolean activeOnly = true; // Boolean | default value = true.  It displayes all active locations.
String sort = "sort_example"; // String | desired order of the output.  For A->Z use 'sort=name', for Z->A use 'sort=-name'.
try {
    InlineResponse200 result = apiInstance.locationsQueryGet(apikey, term, locale, locationTypes, limit, activeOnly, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationsQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**|  |
 **term** | **String**| searched term (for suggestions).  This parameter expects a full IATA code. If IATA code is not given, the search will go through other available fields: &#x27;id&#x27;, &#x27;name&#x27; or &#x27;code&#x27; of the location. It also depends on the &#x27;location_types&#x27; specified eg. airport, city, country.  The search that is used behind the scenes is elasticsearch.  It returns data based on relevancy and many other factors. |
 **locale** | **String**| desired locale output - this is the language of the results. Should any other locale be used other than the specified locales, en-US is used. | [optional]
 **locationTypes** | **String**| desired location output, accepted values: &#x60;station&#x60;, &#x60;airport&#x60;, &#x60;bus_station&#x60;, &#x60;city&#x60;, &#x60;autonomous_territory&#x60;, &#x60;subdivision&#x60;, &#x60;country&#x60;, &#x60;region&#x60;, &#x60;continent&#x60;. To use more than one &#x60;location_types&#x60;, use multiple &#x60;&amp;location_types&#x3D;&#x60; | [optional]
 **limit** | **Integer**| default value &#x3D; 10. Desired number of results in the output. | [optional]
 **activeOnly** | **Boolean**| default value &#x3D; true.  It displayes all active locations. | [optional]
 **sort** | **String**| desired order of the output.  For A-&gt;Z use &#x27;sort&#x3D;name&#x27;, for Z-&gt;A use &#x27;sort&#x3D;-name&#x27;. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationsRadiusGet"></a>
# **locationsRadiusGet**
> InlineResponse200 locationsRadiusGet(apikey, lat, lon, term, radius, locale, locationTypes, limit, sort, activeOnly)

Search by radius

This type of request supports either specification of location by coordinates (&#x60;lat&#x60;, &#x60;lon&#x60;) or by identifier (slug or id of location - &#x60;term&#x60;)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | 
String lat = "lat_example"; // String | latitude of the centre point of the search.  `40.7` is also acceptable.
String lon = "lon_example"; // String | longitude of the centre point of the search.  `-73.9` is also acceptable.
String term = "term_example"; // String | identifier of the location - slug or id (you cannot specify  coordinates & term in the same request)
String radius = "radius_example"; // String | the radious defaults to 250 km but can be changed
String locale = "locale_example"; // String | desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used.
String locationTypes = "locationTypes_example"; // String | desired location output, accepted values: `station`, `airport`, `bus_station`, `city`, `autonomous_territory`, `subdivision`, `country`, `region`, `continent`. To use more than one `location_types`, use multiple `&location_types=`
Integer limit = 56; // Integer | default value = 20. Desired number of results in the output.
String sort = "sort_example"; // String | desired order of the output.  For A->Z use 'sort=name', for Z->A use 'sort=-name'.
Boolean activeOnly = true; // Boolean | default value = true.  It displayes all active locations.
try {
    InlineResponse200 result = apiInstance.locationsRadiusGet(apikey, lat, lon, term, radius, locale, locationTypes, limit, sort, activeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationsRadiusGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**|  |
 **lat** | **String**| latitude of the centre point of the search.  &#x60;40.7&#x60; is also acceptable. | [optional]
 **lon** | **String**| longitude of the centre point of the search.  &#x60;-73.9&#x60; is also acceptable. | [optional]
 **term** | **String**| identifier of the location - slug or id (you cannot specify  coordinates &amp; term in the same request) | [optional]
 **radius** | **String**| the radious defaults to 250 km but can be changed | [optional]
 **locale** | **String**| desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used. | [optional]
 **locationTypes** | **String**| desired location output, accepted values: &#x60;station&#x60;, &#x60;airport&#x60;, &#x60;bus_station&#x60;, &#x60;city&#x60;, &#x60;autonomous_territory&#x60;, &#x60;subdivision&#x60;, &#x60;country&#x60;, &#x60;region&#x60;, &#x60;continent&#x60;. To use more than one &#x60;location_types&#x60;, use multiple &#x60;&amp;location_types&#x3D;&#x60; | [optional]
 **limit** | **Integer**| default value &#x3D; 20. Desired number of results in the output. | [optional]
 **sort** | **String**| desired order of the output.  For A-&gt;Z use &#x27;sort&#x3D;name&#x27;, for Z-&gt;A use &#x27;sort&#x3D;-name&#x27;. | [optional]
 **activeOnly** | **Boolean**| default value &#x3D; true.  It displayes all active locations. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationsSlugGet"></a>
# **locationsSlugGet**
> InlineResponse200 locationsSlugGet(apikey, term, locale, activeOnly)

Search by seo url

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | 
String term = "term_example"; // String | this field expects the exact slug code of the `airport`, `station`, `bus_station`, `city`, `autonomous_territory`, `subdivision`, `country`, `region`, `continent`.
String locale = "locale_example"; // String | desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used.
Boolean activeOnly = true; // Boolean | default value = true.  It displayes all active locations.
try {
    InlineResponse200 result = apiInstance.locationsSlugGet(apikey, term, locale, activeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationsSlugGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**|  |
 **term** | **String**| this field expects the exact slug code of the &#x60;airport&#x60;, &#x60;station&#x60;, &#x60;bus_station&#x60;, &#x60;city&#x60;, &#x60;autonomous_territory&#x60;, &#x60;subdivision&#x60;, &#x60;country&#x60;, &#x60;region&#x60;, &#x60;continent&#x60;. |
 **locale** | **String**| desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used. | [optional]
 **activeOnly** | **Boolean**| default value &#x3D; true.  It displayes all active locations. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationsSubentityGet"></a>
# **locationsSubentityGet**
> InlineResponse200 locationsSubentityGet(apikey, term, locale, locationTypes, limit, sort, activeOnly)

Get by subentity

Get all locations that are below (in hierarchy) the one specified by id - e.g. for &#x60;?type&#x3D;subentity&amp;term&#x3D;london_gb&#x60; all locations in London are returned (as London is &#x60;city&#x60;, &#x60;airports&#x60;, &#x60;stations&#x60; and &#x60;bus_stations&#x60; are returned).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | 
String term = "term_example"; // String | this is the exact IATA airport or ISO3166 location code - station, airport, bus_station, city, autonomous_territory, subdivision, country
String locale = "locale_example"; // String | desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used.
String locationTypes = "locationTypes_example"; // String | desired location output, accepted values: `station`, `airport`, `bus_station`, `city`, `autonomous_territory`, `subdivision`, `country`, `region`, `continent`. To use more than one `location_types`, use multiple `&location_types=`
Integer limit = 56; // Integer | default value = 20. Desired number of results in the output.
String sort = "sort_example"; // String | desired order of the output.  For A->Z use 'sort=name', for Z->A use 'sort=-name'.
Boolean activeOnly = true; // Boolean | default value = true.  It displayes all active locations.
try {
    InlineResponse200 result = apiInstance.locationsSubentityGet(apikey, term, locale, locationTypes, limit, sort, activeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationsSubentityGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**|  |
 **term** | **String**| this is the exact IATA airport or ISO3166 location code - station, airport, bus_station, city, autonomous_territory, subdivision, country |
 **locale** | **String**| desired locale output - this is the the language of the results. Should any other locale be used other than the specified locales, en-US is used. | [optional]
 **locationTypes** | **String**| desired location output, accepted values: &#x60;station&#x60;, &#x60;airport&#x60;, &#x60;bus_station&#x60;, &#x60;city&#x60;, &#x60;autonomous_territory&#x60;, &#x60;subdivision&#x60;, &#x60;country&#x60;, &#x60;region&#x60;, &#x60;continent&#x60;. To use more than one &#x60;location_types&#x60;, use multiple &#x60;&amp;location_types&#x3D;&#x60; | [optional]
 **limit** | **Integer**| default value &#x3D; 20. Desired number of results in the output. | [optional]
 **sort** | **String**| desired order of the output.  For A-&gt;Z use &#x27;sort&#x3D;name&#x27;, for Z-&gt;A use &#x27;sort&#x3D;-name&#x27;. | [optional]
 **activeOnly** | **Boolean**| default value &#x3D; true.  It displayes all active locations. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationsTopdestinationsGet"></a>
# **locationsTopdestinationsGet**
> InlineResponse200 locationsTopdestinationsGet(apikey, term, locale, limit, sort, activeOnly, sourcePopularity)

Search top destinations

This type of request returns a list of destinations most searched / clicked on / booked from the starting point &#x60;term&#x60;.  The &#x60;limit&#x60; is used to limit the range of results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | 
String term = "term_example"; // String | identifier of the start point - slug or id (`airport`, `station`, `bus_station`, `city`, `subdivision`, `autonomous_territory`, `country`) More than one is possible.
String locale = "locale_example"; // String | desired locale output - this is the language of the results. Should any other locale be used other than the specified locales, en-US is used.
Integer limit = 56; // Integer | default value = 100. Desired number of results in the output.
String sort = "sort_example"; // String | 
Boolean activeOnly = true; // Boolean | default value = true.  It displays all active locations.
String sourcePopularity = "sourcePopularity_example"; // String | based on `searches` (default), `bookings` or `clicks`
try {
    InlineResponse200 result = apiInstance.locationsTopdestinationsGet(apikey, term, locale, limit, sort, activeOnly, sourcePopularity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationsTopdestinationsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**|  |
 **term** | **String**| identifier of the start point - slug or id (&#x60;airport&#x60;, &#x60;station&#x60;, &#x60;bus_station&#x60;, &#x60;city&#x60;, &#x60;subdivision&#x60;, &#x60;autonomous_territory&#x60;, &#x60;country&#x60;) More than one is possible. |
 **locale** | **String**| desired locale output - this is the language of the results. Should any other locale be used other than the specified locales, en-US is used. | [optional]
 **limit** | **Integer**| default value &#x3D; 100. Desired number of results in the output. | [optional]
 **sort** | **String**|  | [optional]
 **activeOnly** | **Boolean**| default value &#x3D; true.  It displays all active locations. | [optional]
 **sourcePopularity** | **String**| based on &#x60;searches&#x60; (default), &#x60;bookings&#x60; or &#x60;clicks&#x60; | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locationsTophashtagsGet"></a>
# **locationsTophashtagsGet**
> InlineResponse2001 locationsTophashtagsGet(apikey, term, limit, sourcePopularity, fallbackPopularity)

Top destinations&#x60; hashtags lookup

This type of request returns a list of destinations&#x27; hashtags most searched / clicked on / booked from the starting point &#x60;term&#x60;. In other words it can be understood as following: What are the most popular activies at the places that customers tend to search for / click / book when flying from &#x60;term&#x60; ? The &#x60;limit&#x60; is used to limit the range of results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String apikey = "apikey_example"; // String | 
String term = "term_example"; // String | identifier of the start point - id (`airport`, `station`, `bus_station`, `city`, `subdivision`, `autonomous_territory`, `country`) More than one is possible.
Integer limit = 56; // Integer | default value = 100. Desired number of results in the output.
String sourcePopularity = "sourcePopularity_example"; // String | based on `searches` (default), `bookings` or `clicks`
String fallbackPopularity = "fallbackPopularity_example"; // String | ... based on `searches`, `bookings` or `clicks`.  Can be left blank.  Used if not enough results is returned by `source_popularity`
try {
    InlineResponse2001 result = apiInstance.locationsTophashtagsGet(apikey, term, limit, sourcePopularity, fallbackPopularity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#locationsTophashtagsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**|  |
 **term** | **String**| identifier of the start point - id (&#x60;airport&#x60;, &#x60;station&#x60;, &#x60;bus_station&#x60;, &#x60;city&#x60;, &#x60;subdivision&#x60;, &#x60;autonomous_territory&#x60;, &#x60;country&#x60;) More than one is possible. |
 **limit** | **Integer**| default value &#x3D; 100. Desired number of results in the output. | [optional]
 **sourcePopularity** | **String**| based on &#x60;searches&#x60; (default), &#x60;bookings&#x60; or &#x60;clicks&#x60; | [optional]
 **fallbackPopularity** | **String**| ... based on &#x60;searches&#x60;, &#x60;bookings&#x60; or &#x60;clicks&#x60;.  Can be left blank.  Used if not enough results is returned by &#x60;source_popularity&#x60; | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


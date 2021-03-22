# ObjectApikeyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apikeyCreateObjectV1**](ObjectApikeyApi.md#apikeyCreateObjectV1) | **POST** /1/object/apikey | Create a new Apikey


<a name="apikeyCreateObjectV1"></a>
# **apikeyCreateObjectV1**
> ApikeyMinusCreateObjectMinusV1MinusResponse apikeyCreateObjectV1(apikeyMinusCreateObjectMinusV1MinusRequest)

Create a new Apikey

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val apikeyMinusCreateObjectMinusV1MinusRequest : kotlin.collections.List<ApikeyMinusCreateObjectMinusV1MinusRequest> =  // kotlin.collections.List<ApikeyMinusCreateObjectMinusV1MinusRequest> | 
try {
    val result : ApikeyMinusCreateObjectMinusV1MinusResponse = apiInstance.apikeyCreateObjectV1(apikeyMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikeyMinusCreateObjectMinusV1MinusRequest** | [**kotlin.collections.List&lt;ApikeyMinusCreateObjectMinusV1MinusRequest&gt;**](ApikeyMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**ApikeyMinusCreateObjectMinusV1MinusResponse**](ApikeyMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


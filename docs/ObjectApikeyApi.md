# ObjectApikeyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apikeyCreateObjectV2**](ObjectApikeyApi.md#apikeyCreateObjectV2) | **POST** /2/object/apikey | Create a new Apikey


<a id="apikeyCreateObjectV2"></a>
# **apikeyCreateObjectV2**
> ApikeyMinusCreateObjectMinusV2MinusResponse apikeyCreateObjectV2(apikeyMinusCreateObjectMinusV2MinusRequest)

Create a new Apikey

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val apikeyMinusCreateObjectMinusV2MinusRequest : ApikeyMinusCreateObjectMinusV2MinusRequest =  // ApikeyMinusCreateObjectMinusV2MinusRequest | 
try {
    val result : ApikeyMinusCreateObjectMinusV2MinusResponse = apiInstance.apikeyCreateObjectV2(apikeyMinusCreateObjectMinusV2MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyCreateObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyCreateObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikeyMinusCreateObjectMinusV2MinusRequest** | [**ApikeyMinusCreateObjectMinusV2MinusRequest**](ApikeyMinusCreateObjectMinusV2MinusRequest.md)|  |

### Return type

[**ApikeyMinusCreateObjectMinusV2MinusResponse**](ApikeyMinusCreateObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


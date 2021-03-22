# ObjectActivesessionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activesessionGetCurrentV1**](ObjectActivesessionApi.md#activesessionGetCurrentV1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession


<a name="activesessionGetCurrentV1"></a>
# **activesessionGetCurrentV1**
> ActivesessionMinusGetCurrentMinusV1MinusResponse activesessionGetCurrentV1()

Get Current Activesession

Retrieve the details about the current activesession

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectActivesessionApi()
try {
    val result : ActivesessionMinusGetCurrentMinusV1MinusResponse = apiInstance.activesessionGetCurrentV1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectActivesessionApi#activesessionGetCurrentV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectActivesessionApi#activesessionGetCurrentV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ActivesessionMinusGetCurrentMinusV1MinusResponse**](ActivesessionMinusGetCurrentMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


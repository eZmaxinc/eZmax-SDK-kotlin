# ActivesessionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrent**](ActivesessionApi.md#getCurrent) | **GET** /1/object/activesession/getCurrent | Get Current Activesession


<a name="getCurrent"></a>
# **getCurrent**
> getCurrent()

Get Current Activesession

Todo Description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivesessionApi()
try {
    apiInstance.getCurrent()
} catch (e: ClientException) {
    println("4xx response calling ActivesessionApi#getCurrent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivesessionApi#getCurrent")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ModuleEzmaxmaillinglistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezmaxmaillinglistSubscribeV1**](ModuleEzmaxmaillinglistApi.md#ezmaxmaillinglistSubscribeV1) | **POST** /1/module/ezmaxmaillinglist/subscribe | Subscribe to specific Ezmaxmaillinglist |


<a id="ezmaxmaillinglistSubscribeV1"></a>
# **ezmaxmaillinglistSubscribeV1**
> EzmaxmaillinglistSubscribeV1Response ezmaxmaillinglistSubscribeV1(ezmaxmaillinglistSubscribeV1Request)

Subscribe to specific Ezmaxmaillinglist

Users can subscribe to specific Ezmaxmaillinglist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleEzmaxmaillinglistApi()
val ezmaxmaillinglistSubscribeV1Request : EzmaxmaillinglistSubscribeV1Request =  // EzmaxmaillinglistSubscribeV1Request | 
try {
    val result : EzmaxmaillinglistSubscribeV1Response = apiInstance.ezmaxmaillinglistSubscribeV1(ezmaxmaillinglistSubscribeV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModuleEzmaxmaillinglistApi#ezmaxmaillinglistSubscribeV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleEzmaxmaillinglistApi#ezmaxmaillinglistSubscribeV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezmaxmaillinglistSubscribeV1Request** | [**EzmaxmaillinglistSubscribeV1Request**](EzmaxmaillinglistSubscribeV1Request.md)|  | |

### Return type

[**EzmaxmaillinglistSubscribeV1Response**](EzmaxmaillinglistSubscribeV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


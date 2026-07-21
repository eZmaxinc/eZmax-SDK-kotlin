# ExternalEzmaxpartnerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezmaxpartnerSubscribeV1**](ExternalEzmaxpartnerApi.md#ezmaxpartnerSubscribeV1) | **POST** /1/external/ezmaxpartner/subscribe | Subscribe to an Ezmaxparnerproductstage |


<a id="ezmaxpartnerSubscribeV1"></a>
# **ezmaxpartnerSubscribeV1**
> EzmaxpartnerSubscribeV1Response ezmaxpartnerSubscribeV1(ezmaxpartnerSubscribeV1Request)

Subscribe to an Ezmaxparnerproductstage

Subscribe to an Ezmaxparnerproductstage

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ExternalEzmaxpartnerApi()
val ezmaxpartnerSubscribeV1Request : EzmaxpartnerSubscribeV1Request =  // EzmaxpartnerSubscribeV1Request | 
try {
    val result : EzmaxpartnerSubscribeV1Response = apiInstance.ezmaxpartnerSubscribeV1(ezmaxpartnerSubscribeV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalEzmaxpartnerApi#ezmaxpartnerSubscribeV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalEzmaxpartnerApi#ezmaxpartnerSubscribeV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezmaxpartnerSubscribeV1Request** | [**EzmaxpartnerSubscribeV1Request**](EzmaxpartnerSubscribeV1Request.md)|  | |

### Return type

[**EzmaxpartnerSubscribeV1Response**](EzmaxpartnerSubscribeV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


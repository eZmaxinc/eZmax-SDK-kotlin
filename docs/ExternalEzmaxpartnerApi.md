# ExternalEzmaxpartnerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**externalpartnerSubscribeV1**](ExternalEzmaxpartnerApi.md#externalpartnerSubscribeV1) | **POST** /1/external/ezmaxpartner/subscribe | Subscribe to an Ezmaxparnerproductstage |


<a id="externalpartnerSubscribeV1"></a>
# **externalpartnerSubscribeV1**
> DocumentationSubscribeV1Response externalpartnerSubscribeV1(documentationSubscribeV1Request)

Subscribe to an Ezmaxparnerproductstage

Subscribe to an Ezmaxparnerproductstage

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ExternalEzmaxpartnerApi()
val documentationSubscribeV1Request : DocumentationSubscribeV1Request =  // DocumentationSubscribeV1Request | 
try {
    val result : DocumentationSubscribeV1Response = apiInstance.externalpartnerSubscribeV1(documentationSubscribeV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalEzmaxpartnerApi#externalpartnerSubscribeV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalEzmaxpartnerApi#externalpartnerSubscribeV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentationSubscribeV1Request** | [**DocumentationSubscribeV1Request**](DocumentationSubscribeV1Request.md)|  | |

### Return type

[**DocumentationSubscribeV1Response**](DocumentationSubscribeV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


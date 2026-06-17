# DocumentationEzmaxpartnerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**documentationSubscribeV1**](DocumentationEzmaxpartnerApi.md#documentationSubscribeV1) | **POST** /1/documentation/subscribe | Subscribe to an Ezmaxparnerproductstage |


<a id="documentationSubscribeV1"></a>
# **documentationSubscribeV1**
> DocumentationSubscribeV1Response documentationSubscribeV1(documentationSubscribeV1Request)

Subscribe to an Ezmaxparnerproductstage

Subscribe to an Ezmaxparnerproductstage

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = DocumentationEzmaxpartnerApi()
val documentationSubscribeV1Request : DocumentationSubscribeV1Request =  // DocumentationSubscribeV1Request | 
try {
    val result : DocumentationSubscribeV1Response = apiInstance.documentationSubscribeV1(documentationSubscribeV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentationEzmaxpartnerApi#documentationSubscribeV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentationEzmaxpartnerApi#documentationSubscribeV1")
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


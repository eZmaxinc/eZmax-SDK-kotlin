# ObjectEzsignpageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignpageConsultV1**](ObjectEzsignpageApi.md#ezsignpageConsultV1) | **POST** /1/object/ezsignpage/{pkiEzsignpageID}/consult | Consult an Ezsignpage |


<a id="ezsignpageConsultV1"></a>
# **ezsignpageConsultV1**
> EzsignpageConsultV1Response ezsignpageConsultV1(pkiEzsignpageID, body)

Consult an Ezsignpage

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignpageApi()
val pkiEzsignpageID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EzsignpageConsultV1Response = apiInstance.ezsignpageConsultV1(pkiEzsignpageID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignpageApi#ezsignpageConsultV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignpageApi#ezsignpageConsultV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsignpageID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | |

### Return type

[**EzsignpageConsultV1Response**](EzsignpageConsultV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


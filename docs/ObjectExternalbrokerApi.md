# ObjectExternalbrokerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**externalbrokerImportIntoEDMV1**](ObjectExternalbrokerApi.md#externalbrokerImportIntoEDMV1) | **POST** /1/object/externalbroker/{pkiExternalbrokerID}/importIntoEDM | Import attachments into the Externalbroker |


<a id="externalbrokerImportIntoEDMV1"></a>
# **externalbrokerImportIntoEDMV1**
> ExternalbrokerImportIntoEDMV1Response externalbrokerImportIntoEDMV1(pkiExternalbrokerID, externalbrokerImportIntoEDMV1Request)

Import attachments into the Externalbroker



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectExternalbrokerApi()
val pkiExternalbrokerID : kotlin.Int = 56 // kotlin.Int | 
val externalbrokerImportIntoEDMV1Request : ExternalbrokerImportIntoEDMV1Request =  // ExternalbrokerImportIntoEDMV1Request | 
try {
    val result : ExternalbrokerImportIntoEDMV1Response = apiInstance.externalbrokerImportIntoEDMV1(pkiExternalbrokerID, externalbrokerImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectExternalbrokerApi#externalbrokerImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectExternalbrokerApi#externalbrokerImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiExternalbrokerID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalbrokerImportIntoEDMV1Request** | [**ExternalbrokerImportIntoEDMV1Request**](ExternalbrokerImportIntoEDMV1Request.md)|  | |

### Return type

[**ExternalbrokerImportIntoEDMV1Response**](ExternalbrokerImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


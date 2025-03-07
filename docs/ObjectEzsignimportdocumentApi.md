# ObjectEzsignimportdocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignimportdocumentDownloadV1**](ObjectEzsignimportdocumentApi.md#ezsignimportdocumentDownloadV1) | **GET** /1/object/ezsignimportdocument/{pkiEzsignimportdocumentID}/download | Retrieve the content |


<a id="ezsignimportdocumentDownloadV1"></a>
# **ezsignimportdocumentDownloadV1**
> EzsignimportdocumentDownloadV1Response ezsignimportdocumentDownloadV1(pkiEzsignimportdocumentID)

Retrieve the content

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignimportdocumentApi()
val pkiEzsignimportdocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignimportdocumentDownloadV1Response = apiInstance.ezsignimportdocumentDownloadV1(pkiEzsignimportdocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignimportdocumentApi#ezsignimportdocumentDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignimportdocumentApi#ezsignimportdocumentDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignimportdocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsignimportdocumentDownloadV1Response**](EzsignimportdocumentDownloadV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


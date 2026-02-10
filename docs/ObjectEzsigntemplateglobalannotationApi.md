# ObjectEzsigntemplateglobalannotationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsigntemplateglobalannotationGetObjectV2**](ObjectEzsigntemplateglobalannotationApi.md#ezsigntemplateglobalannotationGetObjectV2) | **GET** /2/object/ezsigntemplateglobalannotation/{pkiEzsigntemplateglobalannotationID} | Retrieve an existing Ezsigntemplateglobalannotation |


<a id="ezsigntemplateglobalannotationGetObjectV2"></a>
# **ezsigntemplateglobalannotationGetObjectV2**
> EzsigntemplateglobalannotationGetObjectV2Response ezsigntemplateglobalannotationGetObjectV2(pkiEzsigntemplateglobalannotationID)

Retrieve an existing Ezsigntemplateglobalannotation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateglobalannotationApi()
val pkiEzsigntemplateglobalannotationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigntemplateglobalannotation
try {
    val result : EzsigntemplateglobalannotationGetObjectV2Response = apiInstance.ezsigntemplateglobalannotationGetObjectV2(pkiEzsigntemplateglobalannotationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateglobalannotationApi#ezsigntemplateglobalannotationGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateglobalannotationApi#ezsigntemplateglobalannotationGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplateglobalannotationID** | **kotlin.Int**| The unique ID of the Ezsigntemplateglobalannotation | |

### Return type

[**EzsigntemplateglobalannotationGetObjectV2Response**](EzsigntemplateglobalannotationGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


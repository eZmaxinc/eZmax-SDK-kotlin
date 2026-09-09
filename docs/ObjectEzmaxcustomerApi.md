# ObjectEzmaxcustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezmaxcustomerPatchObjectV1**](ObjectEzmaxcustomerApi.md#ezmaxcustomerPatchObjectV1) | **PATCH** /1/object/ezmaxcustomer/{pkiEzmaxcustomerID} | Patch an existing Ezmaxcustomer |


<a id="ezmaxcustomerPatchObjectV1"></a>
# **ezmaxcustomerPatchObjectV1**
> EzmaxcustomerPatchObjectV1Response ezmaxcustomerPatchObjectV1(pkiEzmaxcustomerID, ezmaxcustomerPatchObjectV1Request)

Patch an existing Ezmaxcustomer



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxcustomerApi()
val pkiEzmaxcustomerID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezmaxcustomer
val ezmaxcustomerPatchObjectV1Request : EzmaxcustomerPatchObjectV1Request =  // EzmaxcustomerPatchObjectV1Request | 
try {
    val result : EzmaxcustomerPatchObjectV1Response = apiInstance.ezmaxcustomerPatchObjectV1(pkiEzmaxcustomerID, ezmaxcustomerPatchObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxcustomerApi#ezmaxcustomerPatchObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxcustomerApi#ezmaxcustomerPatchObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzmaxcustomerID** | **kotlin.Int**| The unique ID of the Ezmaxcustomer | |
| **ezmaxcustomerPatchObjectV1Request** | [**EzmaxcustomerPatchObjectV1Request**](EzmaxcustomerPatchObjectV1Request.md)|  | |

### Return type

[**EzmaxcustomerPatchObjectV1Response**](EzmaxcustomerPatchObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


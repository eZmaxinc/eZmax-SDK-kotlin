# ObjectEzmaxcustomeruserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezmaxcustomeruserPatchObjectV1**](ObjectEzmaxcustomeruserApi.md#ezmaxcustomeruserPatchObjectV1) | **PATCH** /1/object/ezmaxcustomeruser/{pkiEzmaxcustomeruserID} | Patch an existing Ezmaxcustomeruser |


<a id="ezmaxcustomeruserPatchObjectV1"></a>
# **ezmaxcustomeruserPatchObjectV1**
> EzmaxcustomeruserPatchObjectV1Response ezmaxcustomeruserPatchObjectV1(pkiEzmaxcustomeruserID, ezmaxcustomeruserPatchObjectV1Request)

Patch an existing Ezmaxcustomeruser



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxcustomeruserApi()
val pkiEzmaxcustomeruserID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezmaxcustomeruser
val ezmaxcustomeruserPatchObjectV1Request : EzmaxcustomeruserPatchObjectV1Request =  // EzmaxcustomeruserPatchObjectV1Request | 
try {
    val result : EzmaxcustomeruserPatchObjectV1Response = apiInstance.ezmaxcustomeruserPatchObjectV1(pkiEzmaxcustomeruserID, ezmaxcustomeruserPatchObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxcustomeruserApi#ezmaxcustomeruserPatchObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxcustomeruserApi#ezmaxcustomeruserPatchObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzmaxcustomeruserID** | **kotlin.Int**| The unique ID of the Ezmaxcustomeruser | |
| **ezmaxcustomeruserPatchObjectV1Request** | [**EzmaxcustomeruserPatchObjectV1Request**](EzmaxcustomeruserPatchObjectV1Request.md)|  | |

### Return type

[**EzmaxcustomeruserPatchObjectV1Response**](EzmaxcustomeruserPatchObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


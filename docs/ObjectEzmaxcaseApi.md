# ObjectEzmaxcaseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezmaxcasePatchObjectV1**](ObjectEzmaxcaseApi.md#ezmaxcasePatchObjectV1) | **PATCH** /1/object/ezmaxcase/{pkiEzmaxcaseID} | Patch an existing Ezmaxcase |


<a id="ezmaxcasePatchObjectV1"></a>
# **ezmaxcasePatchObjectV1**
> EzmaxcasePatchObjectV1Response ezmaxcasePatchObjectV1(pkiEzmaxcaseID, ezmaxcasePatchObjectV1Request)

Patch an existing Ezmaxcase



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxcaseApi()
val pkiEzmaxcaseID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezmaxcase
val ezmaxcasePatchObjectV1Request : EzmaxcasePatchObjectV1Request =  // EzmaxcasePatchObjectV1Request | 
try {
    val result : EzmaxcasePatchObjectV1Response = apiInstance.ezmaxcasePatchObjectV1(pkiEzmaxcaseID, ezmaxcasePatchObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxcaseApi#ezmaxcasePatchObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxcaseApi#ezmaxcasePatchObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzmaxcaseID** | **kotlin.Int**| The unique ID of the Ezmaxcase | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezmaxcasePatchObjectV1Request** | [**EzmaxcasePatchObjectV1Request**](EzmaxcasePatchObjectV1Request.md)|  | |

### Return type

[**EzmaxcasePatchObjectV1Response**](EzmaxcasePatchObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ObjectDocumenttypechecklistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**documenttypechecklistPatchObjectV1**](ObjectDocumenttypechecklistApi.md#documenttypechecklistPatchObjectV1) | **PATCH** /1/object/documenttypechecklist/{pkiDocumenttypechecklistID} | Patch an existing Documenttypechecklist |


<a id="documenttypechecklistPatchObjectV1"></a>
# **documenttypechecklistPatchObjectV1**
> DocumenttypechecklistPatchObjectV1Response documenttypechecklistPatchObjectV1(pkiDocumenttypechecklistID, documenttypechecklistPatchObjectV1Request)

Patch an existing Documenttypechecklist



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDocumenttypechecklistApi()
val pkiDocumenttypechecklistID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Documenttypechecklist
val documenttypechecklistPatchObjectV1Request : DocumenttypechecklistPatchObjectV1Request =  // DocumenttypechecklistPatchObjectV1Request | 
try {
    val result : DocumenttypechecklistPatchObjectV1Response = apiInstance.documenttypechecklistPatchObjectV1(pkiDocumenttypechecklistID, documenttypechecklistPatchObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistPatchObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistPatchObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDocumenttypechecklistID** | **kotlin.Int**| The unique ID of the Documenttypechecklist | |
| **documenttypechecklistPatchObjectV1Request** | [**DocumenttypechecklistPatchObjectV1Request**](DocumenttypechecklistPatchObjectV1Request.md)|  | |

### Return type

[**DocumenttypechecklistPatchObjectV1Response**](DocumenttypechecklistPatchObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


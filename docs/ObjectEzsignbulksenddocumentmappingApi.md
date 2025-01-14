# ObjectEzsignbulksenddocumentmappingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignbulksenddocumentmappingCreateObjectV1**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingCreateObjectV1) | **POST** /1/object/ezsignbulksenddocumentmapping | Create a new Ezsignbulksenddocumentmapping |
| [**ezsignbulksenddocumentmappingDeleteObjectV1**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Delete an existing Ezsignbulksenddocumentmapping |
| [**ezsignbulksenddocumentmappingGetObjectV2**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingGetObjectV2) | **GET** /2/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Retrieve an existing Ezsignbulksenddocumentmapping |


<a id="ezsignbulksenddocumentmappingCreateObjectV1"></a>
# **ezsignbulksenddocumentmappingCreateObjectV1**
> EzsignbulksenddocumentmappingCreateObjectV1Response ezsignbulksenddocumentmappingCreateObjectV1(ezsignbulksenddocumentmappingCreateObjectV1Request)

Create a new Ezsignbulksenddocumentmapping

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksenddocumentmappingApi()
val ezsignbulksenddocumentmappingCreateObjectV1Request : EzsignbulksenddocumentmappingCreateObjectV1Request =  // EzsignbulksenddocumentmappingCreateObjectV1Request | 
try {
    val result : EzsignbulksenddocumentmappingCreateObjectV1Response = apiInstance.ezsignbulksenddocumentmappingCreateObjectV1(ezsignbulksenddocumentmappingCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignbulksenddocumentmappingCreateObjectV1Request** | [**EzsignbulksenddocumentmappingCreateObjectV1Request**](EzsignbulksenddocumentmappingCreateObjectV1Request.md)|  | |

### Return type

[**EzsignbulksenddocumentmappingCreateObjectV1Response**](EzsignbulksenddocumentmappingCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignbulksenddocumentmappingDeleteObjectV1"></a>
# **ezsignbulksenddocumentmappingDeleteObjectV1**
> EzsignbulksenddocumentmappingDeleteObjectV1Response ezsignbulksenddocumentmappingDeleteObjectV1(pkiEzsignbulksenddocumentmappingID)

Delete an existing Ezsignbulksenddocumentmapping



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksenddocumentmappingApi()
val pkiEzsignbulksenddocumentmappingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksenddocumentmappingDeleteObjectV1Response = apiInstance.ezsignbulksenddocumentmappingDeleteObjectV1(pkiEzsignbulksenddocumentmappingID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignbulksenddocumentmappingID** | **kotlin.Int**|  | |

### Return type

[**EzsignbulksenddocumentmappingDeleteObjectV1Response**](EzsignbulksenddocumentmappingDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignbulksenddocumentmappingGetObjectV2"></a>
# **ezsignbulksenddocumentmappingGetObjectV2**
> EzsignbulksenddocumentmappingGetObjectV2Response ezsignbulksenddocumentmappingGetObjectV2(pkiEzsignbulksenddocumentmappingID)

Retrieve an existing Ezsignbulksenddocumentmapping



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksenddocumentmappingApi()
val pkiEzsignbulksenddocumentmappingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksenddocumentmappingGetObjectV2Response = apiInstance.ezsignbulksenddocumentmappingGetObjectV2(pkiEzsignbulksenddocumentmappingID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksenddocumentmappingApi#ezsignbulksenddocumentmappingGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignbulksenddocumentmappingID** | **kotlin.Int**|  | |

### Return type

[**EzsignbulksenddocumentmappingGetObjectV2Response**](EzsignbulksenddocumentmappingGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectEzsignbulksendsignermappingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignbulksendsignermappingCreateObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingCreateObjectV1) | **POST** /1/object/ezsignbulksendsignermapping | Create a new Ezsignbulksendsignermapping |
| [**ezsignbulksendsignermappingDeleteObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Delete an existing Ezsignbulksendsignermapping |
| [**ezsignbulksendsignermappingGetObjectV2**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingGetObjectV2) | **GET** /2/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Retrieve an existing Ezsignbulksendsignermapping |


<a id="ezsignbulksendsignermappingCreateObjectV1"></a>
# **ezsignbulksendsignermappingCreateObjectV1**
> EzsignbulksendsignermappingCreateObjectV1Response ezsignbulksendsignermappingCreateObjectV1(ezsignbulksendsignermappingCreateObjectV1Request)

Create a new Ezsignbulksendsignermapping

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendsignermappingApi()
val ezsignbulksendsignermappingCreateObjectV1Request : EzsignbulksendsignermappingCreateObjectV1Request =  // EzsignbulksendsignermappingCreateObjectV1Request | 
try {
    val result : EzsignbulksendsignermappingCreateObjectV1Response = apiInstance.ezsignbulksendsignermappingCreateObjectV1(ezsignbulksendsignermappingCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignbulksendsignermappingCreateObjectV1Request** | [**EzsignbulksendsignermappingCreateObjectV1Request**](EzsignbulksendsignermappingCreateObjectV1Request.md)|  | |

### Return type

[**EzsignbulksendsignermappingCreateObjectV1Response**](EzsignbulksendsignermappingCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignbulksendsignermappingDeleteObjectV1"></a>
# **ezsignbulksendsignermappingDeleteObjectV1**
> CommonResponse ezsignbulksendsignermappingDeleteObjectV1(pkiEzsignbulksendsignermappingID)

Delete an existing Ezsignbulksendsignermapping



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendsignermappingApi()
val pkiEzsignbulksendsignermappingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommonResponse = apiInstance.ezsignbulksendsignermappingDeleteObjectV1(pkiEzsignbulksendsignermappingID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignbulksendsignermappingID** | **kotlin.Int**|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignbulksendsignermappingGetObjectV2"></a>
# **ezsignbulksendsignermappingGetObjectV2**
> EzsignbulksendsignermappingGetObjectV2Response ezsignbulksendsignermappingGetObjectV2(pkiEzsignbulksendsignermappingID)

Retrieve an existing Ezsignbulksendsignermapping



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendsignermappingApi()
val pkiEzsignbulksendsignermappingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendsignermappingGetObjectV2Response = apiInstance.ezsignbulksendsignermappingGetObjectV2(pkiEzsignbulksendsignermappingID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignbulksendsignermappingID** | **kotlin.Int**|  | |

### Return type

[**EzsignbulksendsignermappingGetObjectV2Response**](EzsignbulksendsignermappingGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


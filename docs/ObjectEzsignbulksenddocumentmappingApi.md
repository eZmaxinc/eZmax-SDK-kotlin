# ObjectEzsignbulksenddocumentmappingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignbulksenddocumentmappingCreateObjectV1**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingCreateObjectV1) | **POST** /1/object/ezsignbulksenddocumentmapping | Create a new Ezsignbulksenddocumentmapping
[**ezsignbulksenddocumentmappingDeleteObjectV1**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Delete an existing Ezsignbulksenddocumentmapping
[**ezsignbulksenddocumentmappingGetObjectV2**](ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingGetObjectV2) | **GET** /2/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Retrieve an existing Ezsignbulksenddocumentmapping


<a name="ezsignbulksenddocumentmappingCreateObjectV1"></a>
# **ezsignbulksenddocumentmappingCreateObjectV1**
> EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusResponse ezsignbulksenddocumentmappingCreateObjectV1(ezsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsignbulksenddocumentmapping

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksenddocumentmappingApi()
val ezsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusRequest : EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusRequest =  // EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsignbulksenddocumentmappingCreateObjectV1(ezsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusRequest)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusRequest** | [**EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusRequest**](EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusResponse**](EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignbulksenddocumentmappingDeleteObjectV1"></a>
# **ezsignbulksenddocumentmappingDeleteObjectV1**
> EzsignbulksenddocumentmappingMinusDeleteObjectMinusV1MinusResponse ezsignbulksenddocumentmappingDeleteObjectV1(pkiEzsignbulksenddocumentmappingID)

Delete an existing Ezsignbulksenddocumentmapping



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksenddocumentmappingApi()
val pkiEzsignbulksenddocumentmappingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksenddocumentmappingMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsignbulksenddocumentmappingDeleteObjectV1(pkiEzsignbulksenddocumentmappingID)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksenddocumentmappingID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksenddocumentmappingMinusDeleteObjectMinusV1MinusResponse**](EzsignbulksenddocumentmappingMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksenddocumentmappingGetObjectV2"></a>
# **ezsignbulksenddocumentmappingGetObjectV2**
> EzsignbulksenddocumentmappingMinusGetObjectMinusV2MinusResponse ezsignbulksenddocumentmappingGetObjectV2(pkiEzsignbulksenddocumentmappingID)

Retrieve an existing Ezsignbulksenddocumentmapping



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksenddocumentmappingApi()
val pkiEzsignbulksenddocumentmappingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksenddocumentmappingMinusGetObjectMinusV2MinusResponse = apiInstance.ezsignbulksenddocumentmappingGetObjectV2(pkiEzsignbulksenddocumentmappingID)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksenddocumentmappingID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksenddocumentmappingMinusGetObjectMinusV2MinusResponse**](EzsignbulksenddocumentmappingMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectEzsignbulksendsignermappingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignbulksendsignermappingCreateObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingCreateObjectV1) | **POST** /1/object/ezsignbulksendsignermapping | Create a new Ezsignbulksendsignermapping
[**ezsignbulksendsignermappingDeleteObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Delete an existing Ezsignbulksendsignermapping
[**ezsignbulksendsignermappingGetObjectV1**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingGetObjectV1) | **GET** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Retrieve an existing Ezsignbulksendsignermapping
[**ezsignbulksendsignermappingGetObjectV2**](ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingGetObjectV2) | **GET** /2/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Retrieve an existing Ezsignbulksendsignermapping


<a name="ezsignbulksendsignermappingCreateObjectV1"></a>
# **ezsignbulksendsignermappingCreateObjectV1**
> EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse ezsignbulksendsignermappingCreateObjectV1(ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsignbulksendsignermapping

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendsignermappingApi()
val ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest : EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest =  // EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsignbulksendsignermappingCreateObjectV1(ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest** | [**EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest**](EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse**](EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignbulksendsignermappingDeleteObjectV1"></a>
# **ezsignbulksendsignermappingDeleteObjectV1**
> EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse ezsignbulksendsignermappingDeleteObjectV1(pkiEzsignbulksendsignermappingID)

Delete an existing Ezsignbulksendsignermapping



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendsignermappingApi()
val pkiEzsignbulksendsignermappingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsignbulksendsignermappingDeleteObjectV1(pkiEzsignbulksendsignermappingID)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendsignermappingID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse**](EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksendsignermappingGetObjectV1"></a>
# **ezsignbulksendsignermappingGetObjectV1**
> EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse ezsignbulksendsignermappingGetObjectV1(pkiEzsignbulksendsignermappingID)

Retrieve an existing Ezsignbulksendsignermapping



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendsignermappingApi()
val pkiEzsignbulksendsignermappingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse = apiInstance.ezsignbulksendsignermappingGetObjectV1(pkiEzsignbulksendsignermappingID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendsignermappingApi#ezsignbulksendsignermappingGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendsignermappingID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse**](EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksendsignermappingGetObjectV2"></a>
# **ezsignbulksendsignermappingGetObjectV2**
> EzsignbulksendsignermappingMinusGetObjectMinusV2MinusResponse ezsignbulksendsignermappingGetObjectV2(pkiEzsignbulksendsignermappingID)

Retrieve an existing Ezsignbulksendsignermapping



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendsignermappingApi()
val pkiEzsignbulksendsignermappingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendsignermappingMinusGetObjectMinusV2MinusResponse = apiInstance.ezsignbulksendsignermappingGetObjectV2(pkiEzsignbulksendsignermappingID)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendsignermappingID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksendsignermappingMinusGetObjectMinusV2MinusResponse**](EzsignbulksendsignermappingMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


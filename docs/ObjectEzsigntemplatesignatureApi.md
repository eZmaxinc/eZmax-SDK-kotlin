# ObjectEzsigntemplatesignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatesignatureCreateObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureCreateObjectV1) | **POST** /1/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature
[**ezsigntemplatesignatureDeleteObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Delete an existing Ezsigntemplatesignature
[**ezsigntemplatesignatureEditObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureEditObjectV1) | **PUT** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Edit an existing Ezsigntemplatesignature
[**ezsigntemplatesignatureGetObjectV2**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureGetObjectV2) | **GET** /2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Retrieve an existing Ezsigntemplatesignature


<a name="ezsigntemplatesignatureCreateObjectV1"></a>
# **ezsigntemplatesignatureCreateObjectV1**
> EzsigntemplatesignatureMinusCreateObjectMinusV1MinusResponse ezsigntemplatesignatureCreateObjectV1(ezsigntemplatesignatureMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsigntemplatesignature

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val ezsigntemplatesignatureMinusCreateObjectMinusV1MinusRequest : EzsigntemplatesignatureMinusCreateObjectMinusV1MinusRequest =  // EzsigntemplatesignatureMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatesignatureMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsigntemplatesignatureCreateObjectV1(ezsigntemplatesignatureMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatesignatureMinusCreateObjectMinusV1MinusRequest** | [**EzsigntemplatesignatureMinusCreateObjectMinusV1MinusRequest**](EzsigntemplatesignatureMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatesignatureMinusCreateObjectMinusV1MinusResponse**](EzsigntemplatesignatureMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatesignatureDeleteObjectV1"></a>
# **ezsigntemplatesignatureDeleteObjectV1**
> EzsigntemplatesignatureMinusDeleteObjectMinusV1MinusResponse ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID)

Delete an existing Ezsigntemplatesignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val pkiEzsigntemplatesignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatesignatureMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignatureID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatesignatureMinusDeleteObjectMinusV1MinusResponse**](EzsigntemplatesignatureMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatesignatureEditObjectV1"></a>
# **ezsigntemplatesignatureEditObjectV1**
> EzsigntemplatesignatureMinusEditObjectMinusV1MinusResponse ezsigntemplatesignatureEditObjectV1(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsigntemplatesignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val pkiEzsigntemplatesignatureID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatesignatureMinusEditObjectMinusV1MinusRequest : EzsigntemplatesignatureMinusEditObjectMinusV1MinusRequest =  // EzsigntemplatesignatureMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatesignatureMinusEditObjectMinusV1MinusResponse = apiInstance.ezsigntemplatesignatureEditObjectV1(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignatureID** | **kotlin.Int**|  |
 **ezsigntemplatesignatureMinusEditObjectMinusV1MinusRequest** | [**EzsigntemplatesignatureMinusEditObjectMinusV1MinusRequest**](EzsigntemplatesignatureMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatesignatureMinusEditObjectMinusV1MinusResponse**](EzsigntemplatesignatureMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatesignatureGetObjectV2"></a>
# **ezsigntemplatesignatureGetObjectV2**
> EzsigntemplatesignatureMinusGetObjectMinusV2MinusResponse ezsigntemplatesignatureGetObjectV2(pkiEzsigntemplatesignatureID)

Retrieve an existing Ezsigntemplatesignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val pkiEzsigntemplatesignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatesignatureMinusGetObjectMinusV2MinusResponse = apiInstance.ezsigntemplatesignatureGetObjectV2(pkiEzsigntemplatesignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignatureID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatesignatureMinusGetObjectMinusV2MinusResponse**](EzsigntemplatesignatureMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


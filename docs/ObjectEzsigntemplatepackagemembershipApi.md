# ObjectEzsigntemplatepackagemembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatepackagemembershipCreateObjectV1**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagemembership | Create a new Ezsigntemplatepackagemembership
[**ezsigntemplatepackagemembershipDeleteObjectV1**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Delete an existing Ezsigntemplatepackagemembership
[**ezsigntemplatepackagemembershipGetObjectV2**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipGetObjectV2) | **GET** /2/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Retrieve an existing Ezsigntemplatepackagemembership


<a name="ezsigntemplatepackagemembershipCreateObjectV1"></a>
# **ezsigntemplatepackagemembershipCreateObjectV1**
> EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse ezsigntemplatepackagemembershipCreateObjectV1(ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsigntemplatepackagemembership

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackagemembershipApi()
val ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest : EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest =  // EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackagemembershipCreateObjectV1(ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest** | [**EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest**](EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse**](EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatepackagemembershipDeleteObjectV1"></a>
# **ezsigntemplatepackagemembershipDeleteObjectV1**
> EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse ezsigntemplatepackagemembershipDeleteObjectV1(pkiEzsigntemplatepackagemembershipID)

Delete an existing Ezsigntemplatepackagemembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackagemembershipApi()
val pkiEzsigntemplatepackagemembershipID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackagemembershipDeleteObjectV1(pkiEzsigntemplatepackagemembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagemembershipID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse**](EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatepackagemembershipGetObjectV2"></a>
# **ezsigntemplatepackagemembershipGetObjectV2**
> EzsigntemplatepackagemembershipMinusGetObjectMinusV2MinusResponse ezsigntemplatepackagemembershipGetObjectV2(pkiEzsigntemplatepackagemembershipID)

Retrieve an existing Ezsigntemplatepackagemembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackagemembershipApi()
val pkiEzsigntemplatepackagemembershipID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepackagemembershipMinusGetObjectMinusV2MinusResponse = apiInstance.ezsigntemplatepackagemembershipGetObjectV2(pkiEzsigntemplatepackagemembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagemembershipID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatepackagemembershipMinusGetObjectMinusV2MinusResponse**](EzsigntemplatepackagemembershipMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


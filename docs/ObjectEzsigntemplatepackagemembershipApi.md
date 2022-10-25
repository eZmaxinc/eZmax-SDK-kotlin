# ObjectEzsigntemplatepackagemembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatepackagemembershipCreateObjectV1**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagemembership | Create a new Ezsigntemplatepackagemembership
[**ezsigntemplatepackagemembershipDeleteObjectV1**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Delete an existing Ezsigntemplatepackagemembership
[**ezsigntemplatepackagemembershipGetObjectV1**](ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipGetObjectV1) | **GET** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Retrieve an existing Ezsigntemplatepackagemembership


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

<a name="ezsigntemplatepackagemembershipGetObjectV1"></a>
# **ezsigntemplatepackagemembershipGetObjectV1**
> EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse ezsigntemplatepackagemembershipGetObjectV1(pkiEzsigntemplatepackagemembershipID)

Retrieve an existing Ezsigntemplatepackagemembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackagemembershipApi()
val pkiEzsigntemplatepackagemembershipID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackagemembershipGetObjectV1(pkiEzsigntemplatepackagemembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackagemembershipApi#ezsigntemplatepackagemembershipGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagemembershipID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse**](EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

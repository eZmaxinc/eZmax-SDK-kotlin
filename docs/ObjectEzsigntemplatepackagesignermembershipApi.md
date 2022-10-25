# ObjectEzsigntemplatepackagesignermembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatepackagesignermembershipCreateObjectV1**](ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagesignermembership | Create a new Ezsigntemplatepackagesignermembership
[**ezsigntemplatepackagesignermembershipDeleteObjectV1**](ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID} | Delete an existing Ezsigntemplatepackagesignermembership
[**ezsigntemplatepackagesignermembershipGetObjectV1**](ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipGetObjectV1) | **GET** /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID} | Retrieve an existing Ezsigntemplatepackagesignermembership


<a name="ezsigntemplatepackagesignermembershipCreateObjectV1"></a>
# **ezsigntemplatepackagesignermembershipCreateObjectV1**
> EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse ezsigntemplatepackagesignermembershipCreateObjectV1(ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsigntemplatepackagesignermembership

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackagesignermembershipApi()
val ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest : EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest =  // EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackagesignermembershipCreateObjectV1(ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackagesignermembershipApi#ezsigntemplatepackagesignermembershipCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackagesignermembershipApi#ezsigntemplatepackagesignermembershipCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest** | [**EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest**](EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse**](EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatepackagesignermembershipDeleteObjectV1"></a>
# **ezsigntemplatepackagesignermembershipDeleteObjectV1**
> EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse ezsigntemplatepackagesignermembershipDeleteObjectV1(pkiEzsigntemplatepackagesignermembershipID)

Delete an existing Ezsigntemplatepackagesignermembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackagesignermembershipApi()
val pkiEzsigntemplatepackagesignermembershipID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackagesignermembershipDeleteObjectV1(pkiEzsigntemplatepackagesignermembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackagesignermembershipApi#ezsigntemplatepackagesignermembershipDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackagesignermembershipApi#ezsigntemplatepackagesignermembershipDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignermembershipID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse**](EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatepackagesignermembershipGetObjectV1"></a>
# **ezsigntemplatepackagesignermembershipGetObjectV1**
> EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse ezsigntemplatepackagesignermembershipGetObjectV1(pkiEzsigntemplatepackagesignermembershipID)

Retrieve an existing Ezsigntemplatepackagesignermembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackagesignermembershipApi()
val pkiEzsigntemplatepackagesignermembershipID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackagesignermembershipGetObjectV1(pkiEzsigntemplatepackagesignermembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackagesignermembershipApi#ezsigntemplatepackagesignermembershipGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackagesignermembershipApi#ezsigntemplatepackagesignermembershipGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignermembershipID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse**](EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

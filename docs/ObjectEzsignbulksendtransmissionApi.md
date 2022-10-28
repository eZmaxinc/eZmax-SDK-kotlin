# ObjectEzsignbulksendtransmissionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignbulksendtransmissionGetCsvErrorsV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetCsvErrorsV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getCsvErrors | Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors
[**ezsignbulksendtransmissionGetFormsDataV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetFormsDataV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData | Retrieve an existing Ezsignbulksendtransmission&#39;s forms data
[**ezsignbulksendtransmissionGetObjectV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetObjectV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID} | Retrieve an existing Ezsignbulksendtransmission
[**ezsignbulksendtransmissionGetObjectV2**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetObjectV2) | **GET** /2/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID} | Retrieve an existing Ezsignbulksendtransmission


<a name="ezsignbulksendtransmissionGetCsvErrorsV1"></a>
# **ezsignbulksendtransmissionGetCsvErrorsV1**
> kotlin.String ezsignbulksendtransmissionGetCsvErrorsV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendtransmissionApi()
val pkiEzsignbulksendtransmissionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.ezsignbulksendtransmissionGetCsvErrorsV1(pkiEzsignbulksendtransmissionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetCsvErrorsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetCsvErrorsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendtransmissionID** | **kotlin.Int**|  |

### Return type

**kotlin.String**

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksendtransmissionGetFormsDataV1"></a>
# **ezsignbulksendtransmissionGetFormsDataV1**
> EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse ezsignbulksendtransmissionGetFormsDataV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission&#39;s forms data



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendtransmissionApi()
val pkiEzsignbulksendtransmissionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse = apiInstance.ezsignbulksendtransmissionGetFormsDataV1(pkiEzsignbulksendtransmissionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetFormsDataV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetFormsDataV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendtransmissionID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse**](EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksendtransmissionGetObjectV1"></a>
# **ezsignbulksendtransmissionGetObjectV1**
> EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse ezsignbulksendtransmissionGetObjectV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendtransmissionApi()
val pkiEzsignbulksendtransmissionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse = apiInstance.ezsignbulksendtransmissionGetObjectV1(pkiEzsignbulksendtransmissionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendtransmissionID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse**](EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksendtransmissionGetObjectV2"></a>
# **ezsignbulksendtransmissionGetObjectV2**
> EzsignbulksendtransmissionMinusGetObjectMinusV2MinusResponse ezsignbulksendtransmissionGetObjectV2(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendtransmissionApi()
val pkiEzsignbulksendtransmissionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendtransmissionMinusGetObjectMinusV2MinusResponse = apiInstance.ezsignbulksendtransmissionGetObjectV2(pkiEzsignbulksendtransmissionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendtransmissionID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksendtransmissionMinusGetObjectMinusV2MinusResponse**](EzsignbulksendtransmissionMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


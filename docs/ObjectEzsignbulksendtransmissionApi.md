# ObjectEzsignbulksendtransmissionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignbulksendtransmissionGetObjectV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetObjectV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID} | Retrieve an existing Ezsignbulksendtransmission


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


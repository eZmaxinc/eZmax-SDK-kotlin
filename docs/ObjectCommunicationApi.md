# ObjectCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationGetObjectV2**](ObjectCommunicationApi.md#communicationGetObjectV2) | **GET** /2/object/communication/{pkiCommunicationID} | Retrieve an existing Communication


<a id="communicationGetObjectV2"></a>
# **communicationGetObjectV2**
> CommunicationMinusGetObjectMinusV2MinusResponse communicationGetObjectV2(pkiCommunicationID)

Retrieve an existing Communication



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommunicationApi()
val pkiCommunicationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommunicationMinusGetObjectMinusV2MinusResponse = apiInstance.communicationGetObjectV2(pkiCommunicationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommunicationApi#communicationGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommunicationApi#communicationGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCommunicationID** | **kotlin.Int**|  |

### Return type

[**CommunicationMinusGetObjectMinusV2MinusResponse**](CommunicationMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


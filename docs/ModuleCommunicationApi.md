# ModuleCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationGetCommunicationCountV1**](ModuleCommunicationApi.md#communicationGetCommunicationCountV1) | **GET** /1/module/communication/getCount | Retrieve Communication count


<a name="communicationGetCommunicationCountV1"></a>
# **communicationGetCommunicationCountV1**
> CommunicationMinusGetCountMinusV1MinusResponse communicationGetCommunicationCountV1(eCommunicationObjecttype, pkiEzsignfolderID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleCommunicationApi()
val eCommunicationObjecttype : kotlin.String = eCommunicationObjecttype_example // kotlin.String | The object type for the Communication
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignfolder
try {
    val result : CommunicationMinusGetCountMinusV1MinusResponse = apiInstance.communicationGetCommunicationCountV1(eCommunicationObjecttype, pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModuleCommunicationApi#communicationGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleCommunicationApi#communicationGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eCommunicationObjecttype** | **kotlin.String**| The object type for the Communication | [enum: Ezsignfolder]
 **pkiEzsignfolderID** | **kotlin.Int**| The unique ID of the Ezsignfolder | [optional]

### Return type

[**CommunicationMinusGetCountMinusV1MinusResponse**](CommunicationMinusGetCountMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


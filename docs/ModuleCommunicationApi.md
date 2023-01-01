# ModuleCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationGetCommunicationCountV1**](ModuleCommunicationApi.md#communicationGetCommunicationCountV1) | **GET** /1/module/communication/getCommunicationCount | Get the number of communication
[**communicationGetCommunicationListV1**](ModuleCommunicationApi.md#communicationGetCommunicationListV1) | **GET** /1/module/communication/getCommunicationList | Retrieve communication list


<a name="communicationGetCommunicationCountV1"></a>
# **communicationGetCommunicationCountV1**
> CommunicationMinusGetCountMinusV1MinusResponse communicationGetCommunicationCountV1(eCommunicationModule, pkiEzsignfolderID)

Get the number of communication

Get the number of communication in specified module

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleCommunicationApi()
val eCommunicationModule : kotlin.String = eCommunicationModule_example // kotlin.String | Specify the requested module
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignfolder
try {
    val result : CommunicationMinusGetCountMinusV1MinusResponse = apiInstance.communicationGetCommunicationCountV1(eCommunicationModule, pkiEzsignfolderID)
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
 **eCommunicationModule** | **kotlin.String**| Specify the requested module | [enum: Ezsignfolder]
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

<a name="communicationGetCommunicationListV1"></a>
# **communicationGetCommunicationListV1**
> CommunicationMinusGetListMinusV1MinusResponse communicationGetCommunicationListV1(eCommunicationModule, pkiEzsignfolderID)

Retrieve communication list

Retrieve communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleCommunicationApi()
val eCommunicationModule : kotlin.String = eCommunicationModule_example // kotlin.String | Specify the requested module
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignfolder
try {
    val result : CommunicationMinusGetListMinusV1MinusResponse = apiInstance.communicationGetCommunicationListV1(eCommunicationModule, pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModuleCommunicationApi#communicationGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleCommunicationApi#communicationGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eCommunicationModule** | **kotlin.String**| Specify the requested module | [enum: Ezsignfolder]
 **pkiEzsignfolderID** | **kotlin.Int**| The unique ID of the Ezsignfolder | [optional]

### Return type

[**CommunicationMinusGetListMinusV1MinusResponse**](CommunicationMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


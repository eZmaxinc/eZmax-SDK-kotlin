# ObjectCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationSendV1**](ObjectCommunicationApi.md#communicationSendV1) | **POST** /1/object/communication/send | Send a new Communication


<a id="communicationSendV1"></a>
# **communicationSendV1**
> CommunicationSendV1Response communicationSendV1(communicationSendV1Request)

Send a new Communication

The endpoint allows to send one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommunicationApi()
val communicationSendV1Request : CommunicationSendV1Request =  // CommunicationSendV1Request | 
try {
    val result : CommunicationSendV1Response = apiInstance.communicationSendV1(communicationSendV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommunicationApi#communicationSendV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommunicationApi#communicationSendV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **communicationSendV1Request** | [**CommunicationSendV1Request**](CommunicationSendV1Request.md)|  |

### Return type

[**CommunicationSendV1Response**](CommunicationSendV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ObjectElectronicfundstransferApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**electronicfundstransferGetCommunicationListV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationListV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationList | Retrieve Communication list


<a id="electronicfundstransferGetCommunicationListV1"></a>
# **electronicfundstransferGetCommunicationListV1**
> ElectronicfundstransferGetCommunicationListV1Response electronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetCommunicationListV1Response = apiInstance.electronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiElectronicfundstransferID** | **kotlin.Int**|  |

### Return type

[**ElectronicfundstransferGetCommunicationListV1Response**](ElectronicfundstransferGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


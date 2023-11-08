# ObjectElectronicfundstransferApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eletronicfundstransferGetCommunicationListV1**](ObjectElectronicfundstransferApi.md#eletronicfundstransferGetCommunicationListV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationList | Retrieve Communication list


<a id="eletronicfundstransferGetCommunicationListV1"></a>
# **eletronicfundstransferGetCommunicationListV1**
> ElectronicfundstransferGetCommunicationListV1Response eletronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetCommunicationListV1Response = apiInstance.eletronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#eletronicfundstransferGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#eletronicfundstransferGetCommunicationListV1")
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


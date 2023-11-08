# ObjectInscriptionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptionGetCommunicationListV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationListV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationList | Retrieve Communication list


<a id="inscriptionGetCommunicationListV1"></a>
# **inscriptionGetCommunicationListV1**
> InscriptionGetCommunicationListV1Response inscriptionGetCommunicationListV1(pkiInscriptionID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionGetCommunicationListV1Response = apiInstance.inscriptionGetCommunicationListV1(pkiInscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionID** | **kotlin.Int**|  |

### Return type

[**InscriptionGetCommunicationListV1Response**](InscriptionGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


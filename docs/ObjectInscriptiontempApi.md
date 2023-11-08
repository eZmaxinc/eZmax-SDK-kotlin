# ObjectInscriptiontempApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptiontempGetCommunicationListV1**](ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationListV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationList | Retrieve Communication list


<a id="inscriptiontempGetCommunicationListV1"></a>
# **inscriptiontempGetCommunicationListV1**
> InscriptiontempGetCommunicationListV1Response inscriptiontempGetCommunicationListV1(pkiInscriptiontempID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptiontempApi()
val pkiInscriptiontempID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptiontempGetCommunicationListV1Response = apiInstance.inscriptiontempGetCommunicationListV1(pkiInscriptiontempID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptiontempID** | **kotlin.Int**|  |

### Return type

[**InscriptiontempGetCommunicationListV1Response**](InscriptiontempGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


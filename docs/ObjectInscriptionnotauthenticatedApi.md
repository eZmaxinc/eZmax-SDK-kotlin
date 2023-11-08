# ObjectInscriptionnotauthenticatedApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inscriptionnotauthenticatedGetCommunicationListV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationListV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationList | Retrieve Communication list


<a id="inscriptionnotauthenticatedGetCommunicationListV1"></a>
# **inscriptionnotauthenticatedGetCommunicationListV1**
> InscriptionnotauthenticatedGetCommunicationListV1Response inscriptionnotauthenticatedGetCommunicationListV1(pkiInscriptionnotauthenticatedID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val pkiInscriptionnotauthenticatedID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionnotauthenticatedGetCommunicationListV1Response = apiInstance.inscriptionnotauthenticatedGetCommunicationListV1(pkiInscriptionnotauthenticatedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInscriptionnotauthenticatedID** | **kotlin.Int**|  |

### Return type

[**InscriptionnotauthenticatedGetCommunicationListV1Response**](InscriptionnotauthenticatedGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


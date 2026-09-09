# ObjectInscriptionchecklistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**inscriptionchecklistGetAutocompleteV3**](ObjectInscriptionchecklistApi.md#inscriptionchecklistGetAutocompleteV3) | **GET** /3/object/inscriptionchecklist/getAutocomplete/{sSelector} | Retrieve Inscriptionchecklists and IDs |


<a id="inscriptionchecklistGetAutocompleteV3"></a>
# **inscriptionchecklistGetAutocompleteV3**
> InscriptionchecklistGetAutocompleteV3Response inscriptionchecklistGetAutocompleteV3(sSelector, fkiBuyercontractID, fkiInscriptionID, fkiInscriptionnotauthenticatedID, fkiInscriptiontempID, fkiAgentID, fkiBrokerID, fkiOtherincomeID, fkiRejectedoffertopurchaseID, eFilterActive, sQuery, acceptLanguage)

Retrieve Inscriptionchecklists and IDs

Get the list of Inscriptionchecklist to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionchecklistApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Inscriptionchecklist to return
val fkiBuyercontractID : kotlin.String = fkiBuyercontractID_example // kotlin.String | Specify which Buyercontract we want to display.
val fkiInscriptionID : kotlin.String = fkiInscriptionID_example // kotlin.String | Specify which Inscription we want to display.
val fkiInscriptionnotauthenticatedID : kotlin.String = fkiInscriptionnotauthenticatedID_example // kotlin.String | Specify which Inscriptionnotauthenticated we want to display.
val fkiInscriptiontempID : kotlin.String = fkiInscriptiontempID_example // kotlin.String | Specify which Inscriptiontemp we want to display.
val fkiAgentID : kotlin.String = fkiAgentID_example // kotlin.String | Specify which Agent we want to display.
val fkiBrokerID : kotlin.String = fkiBrokerID_example // kotlin.String | Specify which Broker we want to display.
val fkiOtherincomeID : kotlin.String = fkiOtherincomeID_example // kotlin.String | Specify which Otherincome we want to display.
val fkiRejectedoffertopurchaseID : kotlin.String = fkiRejectedoffertopurchaseID_example // kotlin.String | Specify which Rejectedoffertopurchase we want to display.
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : InscriptionchecklistGetAutocompleteV3Response = apiInstance.inscriptionchecklistGetAutocompleteV3(sSelector, fkiBuyercontractID, fkiInscriptionID, fkiInscriptionnotauthenticatedID, fkiInscriptiontempID, fkiAgentID, fkiBrokerID, fkiOtherincomeID, fkiRejectedoffertopurchaseID, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionchecklistApi#inscriptionchecklistGetAutocompleteV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionchecklistApi#inscriptionchecklistGetAutocompleteV3")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sSelector** | **kotlin.String**| The type of Inscriptionchecklist to return | [enum: All] |
| **fkiBuyercontractID** | **kotlin.String**| Specify which Buyercontract we want to display. | [optional] |
| **fkiInscriptionID** | **kotlin.String**| Specify which Inscription we want to display. | [optional] |
| **fkiInscriptionnotauthenticatedID** | **kotlin.String**| Specify which Inscriptionnotauthenticated we want to display. | [optional] |
| **fkiInscriptiontempID** | **kotlin.String**| Specify which Inscriptiontemp we want to display. | [optional] |
| **fkiAgentID** | **kotlin.String**| Specify which Agent we want to display. | [optional] |
| **fkiBrokerID** | **kotlin.String**| Specify which Broker we want to display. | [optional] |
| **fkiOtherincomeID** | **kotlin.String**| Specify which Otherincome we want to display. | [optional] |
| **fkiRejectedoffertopurchaseID** | **kotlin.String**| Specify which Rejectedoffertopurchase we want to display. | [optional] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**InscriptionchecklistGetAutocompleteV3Response**](InscriptionchecklistGetAutocompleteV3Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectInscriptiontypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**inscriptiontypeGetAutocompleteV2**](ObjectInscriptiontypeApi.md#inscriptiontypeGetAutocompleteV2) | **GET** /2/object/inscriptiontype/getAutocomplete/{sSelector} | Retrieve Inscriptiontypes and IDs |


<a id="inscriptiontypeGetAutocompleteV2"></a>
# **inscriptiontypeGetAutocompleteV2**
> InscriptiontypeGetAutocompleteV2Response inscriptiontypeGetAutocompleteV2(sSelector, sQuery, acceptLanguage)

Retrieve Inscriptiontypes and IDs

Get the list of Inscriptiontype to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptiontypeApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Inscriptiontypes to return
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : InscriptiontypeGetAutocompleteV2Response = apiInstance.inscriptiontypeGetAutocompleteV2(sSelector, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptiontypeApi#inscriptiontypeGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptiontypeApi#inscriptiontypeGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Inscriptiontypes to return | [enum: All] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**InscriptiontypeGetAutocompleteV2Response**](InscriptiontypeGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


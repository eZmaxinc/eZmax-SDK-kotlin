# ObjectLeadsourceApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**leadsourceGetAutocompleteV2**](ObjectLeadsourceApi.md#leadsourceGetAutocompleteV2) | **GET** /2/object/leadsource/getAutocomplete/{sSelector} | Retrieve Leadsources and IDs |


<a id="leadsourceGetAutocompleteV2"></a>
# **leadsourceGetAutocompleteV2**
> LeadsourceGetAutocompleteV2Response leadsourceGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Leadsources and IDs

Get the list of Leadsource to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadsourceApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Leadsources to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : LeadsourceGetAutocompleteV2Response = apiInstance.leadsourceGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadsourceApi#leadsourceGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadsourceApi#leadsourceGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Leadsources to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**LeadsourceGetAutocompleteV2Response**](LeadsourceGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


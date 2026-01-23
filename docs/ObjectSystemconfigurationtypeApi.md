# ObjectSystemconfigurationtypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**systemconfigurationtypeGetAutocompleteV2**](ObjectSystemconfigurationtypeApi.md#systemconfigurationtypeGetAutocompleteV2) | **GET** /2/object/systemconfigurationtype/getAutocomplete/{sSelector} | Retrieve Systemconfigurationtype and IDs |


<a id="systemconfigurationtypeGetAutocompleteV2"></a>
# **systemconfigurationtypeGetAutocompleteV2**
> SystemconfigurationtypeGetAutocompleteV2Response systemconfigurationtypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Systemconfigurationtype and IDs

Get the list of Systemconfigurationtype to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSystemconfigurationtypeApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Systemconfigurationtype to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : SystemconfigurationtypeGetAutocompleteV2Response = apiInstance.systemconfigurationtypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSystemconfigurationtypeApi#systemconfigurationtypeGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSystemconfigurationtypeApi#systemconfigurationtypeGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Systemconfigurationtype to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**SystemconfigurationtypeGetAutocompleteV2Response**](SystemconfigurationtypeGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


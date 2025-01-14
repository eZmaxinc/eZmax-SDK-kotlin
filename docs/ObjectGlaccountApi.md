# ObjectGlaccountApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**glaccountGetAutocompleteV2**](ObjectGlaccountApi.md#glaccountGetAutocompleteV2) | **GET** /2/object/glaccount/getAutocomplete/{sSelector} | Retrieve Glaccounts and IDs |


<a id="glaccountGetAutocompleteV2"></a>
# **glaccountGetAutocompleteV2**
> GlaccountGetAutocompleteV2Response glaccountGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Glaccounts and IDs

Get the list of Glaccount to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectGlaccountApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Glaccounts to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : GlaccountGetAutocompleteV2Response = apiInstance.glaccountGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectGlaccountApi#glaccountGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectGlaccountApi#glaccountGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Glaccounts to return | [enum: All, Supply] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**GlaccountGetAutocompleteV2Response**](GlaccountGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


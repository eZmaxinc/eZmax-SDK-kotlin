# ObjectOtherincometypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**otherincometypeGetAutocompleteV2**](ObjectOtherincometypeApi.md#otherincometypeGetAutocompleteV2) | **GET** /2/object/otherincometype/getAutocomplete/{sSelector} | Retrieve Otherincometypes and IDs |


<a id="otherincometypeGetAutocompleteV2"></a>
# **otherincometypeGetAutocompleteV2**
> OtherincometypeGetAutocompleteV2Response otherincometypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Otherincometypes and IDs

Get the list of Otherincometype to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincometypeApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Otherincometypes to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : OtherincometypeGetAutocompleteV2Response = apiInstance.otherincometypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincometypeApi#otherincometypeGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincometypeApi#otherincometypeGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Otherincometypes to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**OtherincometypeGetAutocompleteV2Response**](OtherincometypeGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


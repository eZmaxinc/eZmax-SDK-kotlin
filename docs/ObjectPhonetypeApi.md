# ObjectPhonetypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**phonetypeGetAutocompleteV2**](ObjectPhonetypeApi.md#phonetypeGetAutocompleteV2) | **GET** /2/object/phonetype/getAutocomplete/{sSelector} | Retrieve Phonetypes and IDs


<a id="phonetypeGetAutocompleteV2"></a>
# **phonetypeGetAutocompleteV2**
> PhonetypeMinusGetAutocompleteMinusV2MinusResponse phonetypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Phonetypes and IDs

Get the list of Phonetype to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPhonetypeApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Phonetypes to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : PhonetypeMinusGetAutocompleteMinusV2MinusResponse = apiInstance.phonetypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPhonetypeApi#phonetypeGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPhonetypeApi#phonetypeGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Phonetypes to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**PhonetypeMinusGetAutocompleteMinusV2MinusResponse**](PhonetypeMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


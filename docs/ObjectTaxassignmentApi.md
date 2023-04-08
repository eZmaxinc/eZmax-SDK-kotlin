# ObjectTaxassignmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxassignmentGetAutocompleteV2**](ObjectTaxassignmentApi.md#taxassignmentGetAutocompleteV2) | **GET** /2/object/taxassignment/getAutocomplete/{sSelector} | Retrieve Taxassignments and IDs


<a name="taxassignmentGetAutocompleteV2"></a>
# **taxassignmentGetAutocompleteV2**
> TaxassignmentMinusGetAutocompleteMinusV2MinusResponse taxassignmentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Taxassignments and IDs

Get the list of Taxassignment to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectTaxassignmentApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Taxassignments to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : TaxassignmentMinusGetAutocompleteMinusV2MinusResponse = apiInstance.taxassignmentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectTaxassignmentApi#taxassignmentGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectTaxassignmentApi#taxassignmentGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Taxassignments to return | [enum: All, AllButNonrecoverable]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**TaxassignmentMinusGetAutocompleteMinusV2MinusResponse**](TaxassignmentMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


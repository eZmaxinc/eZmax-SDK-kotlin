# ObjectFranchisebrokerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**franchisebrokerGetAutocompleteV2**](ObjectFranchisebrokerApi.md#franchisebrokerGetAutocompleteV2) | **GET** /2/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs


<a id="franchisebrokerGetAutocompleteV2"></a>
# **franchisebrokerGetAutocompleteV2**
> FranchisebrokerGetAutocompleteV2Response franchisebrokerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Franchisebrokers and IDs

Get the list of Franchisebroker to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFranchisebrokerApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Franchisebrokers to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : FranchisebrokerGetAutocompleteV2Response = apiInstance.franchisebrokerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFranchisebrokerApi#franchisebrokerGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFranchisebrokerApi#franchisebrokerGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Franchisebrokers to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**FranchisebrokerGetAutocompleteV2Response**](FranchisebrokerGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


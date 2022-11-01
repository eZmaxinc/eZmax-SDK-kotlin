# ObjectFranchisebrokerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**franchisebrokerGetAutocompleteV1**](ObjectFranchisebrokerApi.md#franchisebrokerGetAutocompleteV1) | **GET** /1/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs
[**franchisebrokerGetAutocompleteV2**](ObjectFranchisebrokerApi.md#franchisebrokerGetAutocompleteV2) | **GET** /2/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs


<a name="franchisebrokerGetAutocompleteV1"></a>
# **franchisebrokerGetAutocompleteV1**
> CommonMinusGetAutocompleteMinusV1MinusResponse franchisebrokerGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Franchisebrokers and IDs

Get the list of Franchisebrokers to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFranchisebrokerApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Franchisebrokers to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : CommonMinusGetAutocompleteMinusV1MinusResponse = apiInstance.franchisebrokerGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFranchisebrokerApi#franchisebrokerGetAutocompleteV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFranchisebrokerApi#franchisebrokerGetAutocompleteV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Franchisebrokers to return | [enum: Active, All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**CommonMinusGetAutocompleteMinusV1MinusResponse**](CommonMinusGetAutocompleteMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="franchisebrokerGetAutocompleteV2"></a>
# **franchisebrokerGetAutocompleteV2**
> FranchisebrokerMinusGetAutocompleteMinusV2MinusResponse franchisebrokerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

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
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : FranchisebrokerMinusGetAutocompleteMinusV2MinusResponse = apiInstance.franchisebrokerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
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
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**FranchisebrokerMinusGetAutocompleteMinusV2MinusResponse**](FranchisebrokerMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


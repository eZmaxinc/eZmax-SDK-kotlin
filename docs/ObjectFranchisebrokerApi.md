# ObjectFranchisebrokerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**franchisebrokerGetAutocompleteV1**](ObjectFranchisebrokerApi.md#franchisebrokerGetAutocompleteV1) | **GET** /1/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs


<a name="franchisebrokerGetAutocompleteV1"></a>
# **franchisebrokerGetAutocompleteV1**
> CommonMinusGetAutocompleteMinusV1MinusResponse franchisebrokerGetAutocompleteV1(sSelector, sQuery)

Retrieve Franchisebrokers and IDs

Get the list of Franchisebrokers to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectFranchisebrokerApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Franchisebrokers to return
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter on the option value
try {
    val result : CommonMinusGetAutocompleteMinusV1MinusResponse = apiInstance.franchisebrokerGetAutocompleteV1(sSelector, sQuery)
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
 **sQuery** | **kotlin.String**| Allow to filter on the option value | [optional]

### Return type

[**CommonMinusGetAutocompleteMinusV1MinusResponse**](CommonMinusGetAutocompleteMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


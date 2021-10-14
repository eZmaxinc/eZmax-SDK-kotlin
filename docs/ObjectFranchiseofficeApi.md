# ObjectFranchiseofficeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**franchiseofficeGetAutocompleteV1**](ObjectFranchiseofficeApi.md#franchiseofficeGetAutocompleteV1) | **GET** /1/object/franchiseoffice/getAutocomplete/{sSelector} | Retrieve Franchiseoffices and IDs


<a name="franchiseofficeGetAutocompleteV1"></a>
# **franchiseofficeGetAutocompleteV1**
> CommonMinusGetAutocompleteMinusV1MinusResponse franchiseofficeGetAutocompleteV1(sSelector, sQuery)

Retrieve Franchiseoffices and IDs

Get the list of Franchiseoffices to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFranchiseofficeApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Franchiseoffices to return
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
try {
    val result : CommonMinusGetAutocompleteMinusV1MinusResponse = apiInstance.franchiseofficeGetAutocompleteV1(sSelector, sQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFranchiseofficeApi#franchiseofficeGetAutocompleteV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFranchiseofficeApi#franchiseofficeGetAutocompleteV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Franchiseoffices to return | [enum: Active, All]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]

### Return type

[**CommonMinusGetAutocompleteMinusV1MinusResponse**](CommonMinusGetAutocompleteMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectPeriodApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**periodGetAutocompleteV1**](ObjectPeriodApi.md#periodGetAutocompleteV1) | **GET** /1/object/period/getAutocomplete/{sSelector} | Retrieve Periods and IDs


<a name="periodGetAutocompleteV1"></a>
# **periodGetAutocompleteV1**
> CommonMinusGetAutocompleteMinusV1MinusResponse periodGetAutocompleteV1(sSelector, sQuery)

Retrieve Periods and IDs

Get the list of Periods to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPeriodApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The types of Periods to return
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter on the option value
try {
    val result : CommonMinusGetAutocompleteMinusV1MinusResponse = apiInstance.periodGetAutocompleteV1(sSelector, sQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPeriodApi#periodGetAutocompleteV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPeriodApi#periodGetAutocompleteV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The types of Periods to return | [enum: ActiveNormal, ActiveNormalAndEndOfYear, AllNormal, AllNormalAndEndOfYear]
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


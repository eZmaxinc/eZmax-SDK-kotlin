# ObjectPeriodApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**periodGetAutocompleteV2**](ObjectPeriodApi.md#periodGetAutocompleteV2) | **GET** /2/object/period/getAutocomplete/{sSelector} | Retrieve Periods and IDs |


<a id="periodGetAutocompleteV2"></a>
# **periodGetAutocompleteV2**
> PeriodGetAutocompleteV2Response periodGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Periods and IDs

Get the list of Period to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPeriodApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Periods to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : PeriodGetAutocompleteV2Response = apiInstance.periodGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPeriodApi#periodGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPeriodApi#periodGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Periods to return | [enum: ActiveNormal, ActiveNormalAndEndOfYear, AllNormal, AllNormalAndEndOfYear] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**PeriodGetAutocompleteV2Response**](PeriodGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectRealestateboardApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**realestateboardGetAutocompleteV2**](ObjectRealestateboardApi.md#realestateboardGetAutocompleteV2) | **GET** /2/object/realestateboard/getAutocomplete/{sSelector} | Retrieve Realestateboards and IDs |


<a id="realestateboardGetAutocompleteV2"></a>
# **realestateboardGetAutocompleteV2**
> RealestateboardGetAutocompleteV2Response realestateboardGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiProvinceID)

Retrieve Realestateboards and IDs

Get the list of realestateboard to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectRealestateboardApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Realestateboards to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val fkiProvinceID : kotlin.String = fkiProvinceID_example // kotlin.String | The province ID to filter the results expected
try {
    val result : RealestateboardGetAutocompleteV2Response = apiInstance.realestateboardGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiProvinceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectRealestateboardApi#realestateboardGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectRealestateboardApi#realestateboardGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sSelector** | **kotlin.String**| The type of Realestateboards to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **fkiProvinceID** | **kotlin.String**| The province ID to filter the results expected | [optional] |

### Return type

[**RealestateboardGetAutocompleteV2Response**](RealestateboardGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


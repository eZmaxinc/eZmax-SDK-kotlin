# ObjectInfrastructureregionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**infrastructureregionGetAutocompleteV2**](ObjectInfrastructureregionApi.md#infrastructureregionGetAutocompleteV2) | **GET** /2/object/infrastructureregion/getAutocomplete/{sSelector} | Retrieve Infrastructureregions and IDs |


<a id="infrastructureregionGetAutocompleteV2"></a>
# **infrastructureregionGetAutocompleteV2**
> InfrastructureregionGetAutocompleteV2Response infrastructureregionGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Infrastructureregions and IDs

Get the list of Infrastructureregion to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInfrastructureregionApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Infrastructureregions  to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : InfrastructureregionGetAutocompleteV2Response = apiInstance.infrastructureregionGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInfrastructureregionApi#infrastructureregionGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInfrastructureregionApi#infrastructureregionGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Infrastructureregions  to return | [enum: AWS, Programmer] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**InfrastructureregionGetAutocompleteV2Response**](InfrastructureregionGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


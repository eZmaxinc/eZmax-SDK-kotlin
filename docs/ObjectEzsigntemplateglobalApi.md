# ObjectEzsigntemplateglobalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplateglobalGetAutocompleteV2**](ObjectEzsigntemplateglobalApi.md#ezsigntemplateglobalGetAutocompleteV2) | **GET** /2/object/ezsigntemplateglobal/getAutocomplete/{sSelector} | Retrieve Ezsigntemplateglobals and IDs
[**ezsigntemplateglobalGetObjectV2**](ObjectEzsigntemplateglobalApi.md#ezsigntemplateglobalGetObjectV2) | **GET** /2/object/ezsigntemplateglobal/{pkiEzsigntemplateglobalID} | Retrieve an existing Ezsigntemplateglobal


<a id="ezsigntemplateglobalGetAutocompleteV2"></a>
# **ezsigntemplateglobalGetAutocompleteV2**
> EzsigntemplateglobalGetAutocompleteV2Response ezsigntemplateglobalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsigntemplateglobals and IDs

Get the list of Ezsigntemplateglobal to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateglobalApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezsigntemplateglobals to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : EzsigntemplateglobalGetAutocompleteV2Response = apiInstance.ezsigntemplateglobalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateglobalApi#ezsigntemplateglobalGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateglobalApi#ezsigntemplateglobalGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Ezsigntemplateglobals to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**EzsigntemplateglobalGetAutocompleteV2Response**](EzsigntemplateglobalGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplateglobalGetObjectV2"></a>
# **ezsigntemplateglobalGetObjectV2**
> EzsigntemplateglobalGetObjectV2Response ezsigntemplateglobalGetObjectV2(pkiEzsigntemplateglobalID)

Retrieve an existing Ezsigntemplateglobal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateglobalApi()
val pkiEzsigntemplateglobalID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplateglobalGetObjectV2Response = apiInstance.ezsigntemplateglobalGetObjectV2(pkiEzsigntemplateglobalID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateglobalApi#ezsigntemplateglobalGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateglobalApi#ezsigntemplateglobalGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateglobalID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplateglobalGetObjectV2Response**](EzsigntemplateglobalGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ModuleEzsignApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignSuggestSignersV1**](ModuleEzsignApi.md#ezsignSuggestSignersV1) | **GET** /1/module/ezsign/suggestSigners | Suggest signers
[**ezsignSuggestTemplatesV1**](ModuleEzsignApi.md#ezsignSuggestTemplatesV1) | **GET** /1/module/ezsign/suggestTemplates | Suggest templates


<a id="ezsignSuggestSignersV1"></a>
# **ezsignSuggestSignersV1**
> EzsignMinusSuggestSignersMinusV1MinusResponse ezsignSuggestSignersV1()

Suggest signers

Retrieve previously used Ezsignsigners and all users from the system

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleEzsignApi()
try {
    val result : EzsignMinusSuggestSignersMinusV1MinusResponse = apiInstance.ezsignSuggestSignersV1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModuleEzsignApi#ezsignSuggestSignersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleEzsignApi#ezsignSuggestSignersV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EzsignMinusSuggestSignersMinusV1MinusResponse**](EzsignMinusSuggestSignersMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignSuggestTemplatesV1"></a>
# **ezsignSuggestTemplatesV1**
> EzsignMinusSuggestTemplatesMinusV1MinusResponse ezsignSuggestTemplatesV1(fkiEzsignfoldertypeID)

Suggest templates

Retrieve Ezsigntemplates and Ezsigntemplatepackages that can be imported in a Ezsignfolder

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleEzsignApi()
val fkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignMinusSuggestTemplatesMinusV1MinusResponse = apiInstance.ezsignSuggestTemplatesV1(fkiEzsignfoldertypeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModuleEzsignApi#ezsignSuggestTemplatesV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleEzsignApi#ezsignSuggestTemplatesV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fkiEzsignfoldertypeID** | **kotlin.Int**|  | [optional]

### Return type

[**EzsignMinusSuggestTemplatesMinusV1MinusResponse**](EzsignMinusSuggestTemplatesMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


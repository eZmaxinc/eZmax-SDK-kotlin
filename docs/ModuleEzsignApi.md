# ModuleEzsignApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignSuggestSignersV1**](ModuleEzsignApi.md#ezsignSuggestSignersV1) | **GET** /1/module/ezsign/suggestSigners | Suggest signers
[**ezsignSuggestTemplatesV1**](ModuleEzsignApi.md#ezsignSuggestTemplatesV1) | **GET** /1/module/ezsign/suggestTemplates | Suggest templates


<a id="ezsignSuggestSignersV1"></a>
# **ezsignSuggestSignersV1**
> EzsignSuggestSignersV1Response ezsignSuggestSignersV1()

Suggest signers

Retrieve previously used Ezsignsigners and all users from the system

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleEzsignApi()
try {
    val result : EzsignSuggestSignersV1Response = apiInstance.ezsignSuggestSignersV1()
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

[**EzsignSuggestSignersV1Response**](EzsignSuggestSignersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignSuggestTemplatesV1"></a>
# **ezsignSuggestTemplatesV1**
> EzsignSuggestTemplatesV1Response ezsignSuggestTemplatesV1(fkiEzsignfoldertypeID)

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
    val result : EzsignSuggestTemplatesV1Response = apiInstance.ezsignSuggestTemplatesV1(fkiEzsignfoldertypeID)
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

[**EzsignSuggestTemplatesV1Response**](EzsignSuggestTemplatesV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


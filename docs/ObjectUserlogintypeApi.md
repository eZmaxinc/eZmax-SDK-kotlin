# ObjectUserlogintypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userlogintypeGetAutocompleteV2**](ObjectUserlogintypeApi.md#userlogintypeGetAutocompleteV2) | **GET** /2/object/userlogintype/getAutocomplete/{sSelector} | Retrieve Userlogintypes and IDs


<a id="userlogintypeGetAutocompleteV2"></a>
# **userlogintypeGetAutocompleteV2**
> UserlogintypeGetAutocompleteV2Response userlogintypeGetAutocompleteV2(sSelector, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage)

Retrieve Userlogintypes and IDs

Get the list of Userlogintype to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserlogintypeApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Userlogintypes to return
val fkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | 
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : UserlogintypeGetAutocompleteV2Response = apiInstance.userlogintypeGetAutocompleteV2(sSelector, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserlogintypeApi#userlogintypeGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserlogintypeApi#userlogintypeGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Userlogintypes to return | [enum: All, Ezsignfoldertype]
 **fkiEzsignfoldertypeID** | **kotlin.Int**|  | [optional]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**UserlogintypeGetAutocompleteV2Response**](UserlogintypeGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectAttachmentrejectreasonApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**attachmentrejectreasonGetAutocompleteV2**](ObjectAttachmentrejectreasonApi.md#attachmentrejectreasonGetAutocompleteV2) | **GET** /2/object/attachmentrejectreason/getAutocomplete/{sSelector} | Retrieve Attachmentrejectreasons and IDs |


<a id="attachmentrejectreasonGetAutocompleteV2"></a>
# **attachmentrejectreasonGetAutocompleteV2**
> AttachmentrejectreasonGetAutocompleteV2Response attachmentrejectreasonGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Attachmentrejectreasons and IDs

Get the list of Attachmentrejectreason to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAttachmentrejectreasonApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Attachmentrejectreasons to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : AttachmentrejectreasonGetAutocompleteV2Response = apiInstance.attachmentrejectreasonGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAttachmentrejectreasonApi#attachmentrejectreasonGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAttachmentrejectreasonApi#attachmentrejectreasonGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sSelector** | **kotlin.String**| The type of Attachmentrejectreasons to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**AttachmentrejectreasonGetAutocompleteV2Response**](AttachmentrejectreasonGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


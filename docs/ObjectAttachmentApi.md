# ObjectAttachmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachmentDownloadV1**](ObjectAttachmentApi.md#attachmentDownloadV1) | **GET** /1/object/attachment/{pkiAttachmentID}/download | Retrieve the content


<a id="attachmentDownloadV1"></a>
# **attachmentDownloadV1**
> AttachmentDownloadV1Response attachmentDownloadV1(pkiAttachmentID)

Retrieve the content

Using this endpoint, you can retrieve the content of an attachment.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAttachmentApi()
val pkiAttachmentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AttachmentDownloadV1Response = apiInstance.attachmentDownloadV1(pkiAttachmentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAttachmentApi#attachmentDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAttachmentApi#attachmentDownloadV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiAttachmentID** | **kotlin.Int**|  |

### Return type

[**AttachmentDownloadV1Response**](AttachmentDownloadV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


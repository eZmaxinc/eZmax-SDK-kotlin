# ObjectAttachmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**attachmentDownloadV1**](ObjectAttachmentApi.md#attachmentDownloadV1) | **GET** /1/object/attachment/{pkiAttachmentID}/download | Retrieve the content |
| [**attachmentGetAttachmentlogsV1**](ObjectAttachmentApi.md#attachmentGetAttachmentlogsV1) | **GET** /1/object/attachment/{pkiAttachmentID}/getAttachmentlogs | Retrieve the Attachmentlogs |


<a id="attachmentDownloadV1"></a>
# **attachmentDownloadV1**
> attachmentDownloadV1(pkiAttachmentID)

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
    apiInstance.attachmentDownloadV1(pkiAttachmentID)
} catch (e: ClientException) {
    println("4xx response calling ObjectAttachmentApi#attachmentDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAttachmentApi#attachmentDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAttachmentID** | **kotlin.Int**|  | |

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Presigned:
    ApiClient.apiKey["sAuthorization"] = ""
    ApiClient.apiKeyPrefix["sAuthorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="attachmentGetAttachmentlogsV1"></a>
# **attachmentGetAttachmentlogsV1**
> AttachmentGetAttachmentlogsV1Response attachmentGetAttachmentlogsV1(pkiAttachmentID)

Retrieve the Attachmentlogs

Using this endpoint, you can retrieve the Attachmentlogs of an attachment.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAttachmentApi()
val pkiAttachmentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AttachmentGetAttachmentlogsV1Response = apiInstance.attachmentGetAttachmentlogsV1(pkiAttachmentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAttachmentApi#attachmentGetAttachmentlogsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAttachmentApi#attachmentGetAttachmentlogsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAttachmentID** | **kotlin.Int**|  | |

### Return type

[**AttachmentGetAttachmentlogsV1Response**](AttachmentGetAttachmentlogsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectAttachmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**attachmentDeleteV1**](ObjectAttachmentApi.md#attachmentDeleteV1) | **POST** /1/object/attachment/{pkiAttachmentID}/delete | Delete an existing attachment |
| [**attachmentDownloadV1**](ObjectAttachmentApi.md#attachmentDownloadV1) | **GET** /1/object/attachment/{pkiAttachmentID}/download | Retrieve the content |
| [**attachmentGetAttachmentlogsV1**](ObjectAttachmentApi.md#attachmentGetAttachmentlogsV1) | **GET** /1/object/attachment/{pkiAttachmentID}/getAttachmentlogs | Retrieve the Attachmentlogs |
| [**attachmentRenameV1**](ObjectAttachmentApi.md#attachmentRenameV1) | **POST** /1/object/attachment/{pkiAttachmentID}/rename | Rename an attachment |
| [**attachmentRestoreV1**](ObjectAttachmentApi.md#attachmentRestoreV1) | **POST** /1/object/attachment/{pkiAttachmentID}/restore | Restore a deleted attachment |
| [**attachmentSetDocumentTypeV1**](ObjectAttachmentApi.md#attachmentSetDocumentTypeV1) | **POST** /1/object/attachment/{pkiAttachmentID}/setDocumentType | Change attachment document type |
| [**attachmentSetPrivacyV1**](ObjectAttachmentApi.md#attachmentSetPrivacyV1) | **POST** /1/object/attachment/{pkiAttachmentID}/setPrivacy | Change the attachment privacy |
| [**attachmentValidateV1**](ObjectAttachmentApi.md#attachmentValidateV1) | **POST** /1/object/attachment/{pkiAttachmentID}/validate | Validate an existing attachment |


<a id="attachmentDeleteV1"></a>
# **attachmentDeleteV1**
> AttachmentDeleteV1Response attachmentDeleteV1(pkiAttachmentID, body)

Delete an existing attachment

Te endpoint allows to delete an attachment.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAttachmentApi()
val pkiAttachmentID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : AttachmentDeleteV1Response = apiInstance.attachmentDeleteV1(pkiAttachmentID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAttachmentApi#attachmentDeleteV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAttachmentApi#attachmentDeleteV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAttachmentID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | |

### Return type

[**AttachmentDeleteV1Response**](AttachmentDeleteV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

<a id="attachmentRenameV1"></a>
# **attachmentRenameV1**
> AttachmentRenameV1Response attachmentRenameV1(pkiAttachmentID, attachmentRenameV1Request)

Rename an attachment

The endpoint allows to change the attachment&#39;s file name and category.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAttachmentApi()
val pkiAttachmentID : kotlin.Int = 56 // kotlin.Int | 
val attachmentRenameV1Request : AttachmentRenameV1Request =  // AttachmentRenameV1Request | 
try {
    val result : AttachmentRenameV1Response = apiInstance.attachmentRenameV1(pkiAttachmentID, attachmentRenameV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAttachmentApi#attachmentRenameV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAttachmentApi#attachmentRenameV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAttachmentID** | **kotlin.Int**|  | |
| **attachmentRenameV1Request** | [**AttachmentRenameV1Request**](AttachmentRenameV1Request.md)|  | |

### Return type

[**AttachmentRenameV1Response**](AttachmentRenameV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="attachmentRestoreV1"></a>
# **attachmentRestoreV1**
> AttachmentRestoreV1Response attachmentRestoreV1(pkiAttachmentID, attachmentRestoreV1Request)

Restore a deleted attachment

The endpoints allows to restore a previously deleted attachment.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAttachmentApi()
val pkiAttachmentID : kotlin.Int = 56 // kotlin.Int | 
val attachmentRestoreV1Request : AttachmentRestoreV1Request =  // AttachmentRestoreV1Request | 
try {
    val result : AttachmentRestoreV1Response = apiInstance.attachmentRestoreV1(pkiAttachmentID, attachmentRestoreV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAttachmentApi#attachmentRestoreV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAttachmentApi#attachmentRestoreV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAttachmentID** | **kotlin.Int**|  | |
| **attachmentRestoreV1Request** | [**AttachmentRestoreV1Request**](AttachmentRestoreV1Request.md)|  | |

### Return type

[**AttachmentRestoreV1Response**](AttachmentRestoreV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="attachmentSetDocumentTypeV1"></a>
# **attachmentSetDocumentTypeV1**
> AttachmentSetDocumentTypeV1Response attachmentSetDocumentTypeV1(pkiAttachmentID, attachmentSetDocumentTypeV1Request)

Change attachment document type

The endpoint allows to change the checklist document type for an attachment.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAttachmentApi()
val pkiAttachmentID : kotlin.Int = 56 // kotlin.Int | 
val attachmentSetDocumentTypeV1Request : AttachmentSetDocumentTypeV1Request =  // AttachmentSetDocumentTypeV1Request | 
try {
    val result : AttachmentSetDocumentTypeV1Response = apiInstance.attachmentSetDocumentTypeV1(pkiAttachmentID, attachmentSetDocumentTypeV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAttachmentApi#attachmentSetDocumentTypeV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAttachmentApi#attachmentSetDocumentTypeV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAttachmentID** | **kotlin.Int**|  | |
| **attachmentSetDocumentTypeV1Request** | [**AttachmentSetDocumentTypeV1Request**](AttachmentSetDocumentTypeV1Request.md)|  | |

### Return type

[**AttachmentSetDocumentTypeV1Response**](AttachmentSetDocumentTypeV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="attachmentSetPrivacyV1"></a>
# **attachmentSetPrivacyV1**
> AttachmentSetPrivacyV1Response attachmentSetPrivacyV1(pkiAttachmentID, attachmentSetPrivacyV1Request)

Change the attachment privacy

The endpoint allows to change an attachment&#39;s access privacy.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAttachmentApi()
val pkiAttachmentID : kotlin.Int = 56 // kotlin.Int | 
val attachmentSetPrivacyV1Request : AttachmentSetPrivacyV1Request =  // AttachmentSetPrivacyV1Request | 
try {
    val result : AttachmentSetPrivacyV1Response = apiInstance.attachmentSetPrivacyV1(pkiAttachmentID, attachmentSetPrivacyV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAttachmentApi#attachmentSetPrivacyV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAttachmentApi#attachmentSetPrivacyV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAttachmentID** | **kotlin.Int**|  | |
| **attachmentSetPrivacyV1Request** | [**AttachmentSetPrivacyV1Request**](AttachmentSetPrivacyV1Request.md)|  | |

### Return type

[**AttachmentSetPrivacyV1Response**](AttachmentSetPrivacyV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="attachmentValidateV1"></a>
# **attachmentValidateV1**
> AttachmentValidateV1Response attachmentValidateV1(pkiAttachmentID, attachmentValidateV1Request)

Validate an existing attachment

This endpoint allows to validate or reject an attachment.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAttachmentApi()
val pkiAttachmentID : kotlin.Int = 56 // kotlin.Int | 
val attachmentValidateV1Request : AttachmentValidateV1Request =  // AttachmentValidateV1Request | 
try {
    val result : AttachmentValidateV1Response = apiInstance.attachmentValidateV1(pkiAttachmentID, attachmentValidateV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAttachmentApi#attachmentValidateV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAttachmentApi#attachmentValidateV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAttachmentID** | **kotlin.Int**|  | |
| **attachmentValidateV1Request** | [**AttachmentValidateV1Request**](AttachmentValidateV1Request.md)|  | |

### Return type

[**AttachmentValidateV1Response**](AttachmentValidateV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


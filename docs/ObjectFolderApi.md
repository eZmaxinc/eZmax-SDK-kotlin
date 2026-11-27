# ObjectFolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**folderBatchDownloadV1**](ObjectFolderApi.md#folderBatchDownloadV1) | **POST** /1/object/folder/{pkiFolderID}/batchDownload | Download multiples attachments from an Folder |
| [**folderGetAttachmentsV1**](ObjectFolderApi.md#folderGetAttachmentsV1) | **GET** /1/object/folder/{pkiFolderID}/getAttachments | Retrieve Folder&#39;s attachments |
| [**folderGetCommunicationCountV1**](ObjectFolderApi.md#folderGetCommunicationCountV1) | **GET** /1/object/folder/{pkiFolderID}/getCommunicationCount | Retrieve Communication count |
| [**folderGetCommunicationListV1**](ObjectFolderApi.md#folderGetCommunicationListV1) | **GET** /1/object/folder/{pkiFolderID}/getCommunicationList | Retrieve Communication list |
| [**folderGetCommunicationrecipientsV1**](ObjectFolderApi.md#folderGetCommunicationrecipientsV1) | **GET** /1/object/folder/{pkiFolderID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**folderGetCommunicationsendersV1**](ObjectFolderApi.md#folderGetCommunicationsendersV1) | **GET** /1/object/folder/{pkiFolderID}/getCommunicationsenders | Retrieve Communication senders |
| [**folderGetDocumenttypechecklistV1**](ObjectFolderApi.md#folderGetDocumenttypechecklistV1) | **GET** /1/object/folder/{pkiFolderID}/getDocumenttypechecklist | Retrieve Document type checklist |
| [**folderImportIntoEDMV1**](ObjectFolderApi.md#folderImportIntoEDMV1) | **POST** /1/object/folder/{pkiFolderID}/importIntoEDM | Import attachments into the Folder |
| [**folderSyncDocumenttypechecklistV1**](ObjectFolderApi.md#folderSyncDocumenttypechecklistV1) | **POST** /1/object/folder/{pkiFolderID}/syncDocumenttypechecklist | Synchronize Document type checklist |


<a id="folderBatchDownloadV1"></a>
# **folderBatchDownloadV1**
> java.io.File folderBatchDownloadV1(pkiFolderID, folderBatchDownloadV1Request)

Download multiples attachments from an Folder

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFolderApi()
val pkiFolderID : kotlin.Int = 56 // kotlin.Int | 
val folderBatchDownloadV1Request : FolderBatchDownloadV1Request =  // FolderBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.folderBatchDownloadV1(pkiFolderID, folderBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFolderApi#folderBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFolderApi#folderBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiFolderID** | **kotlin.Int**|  | |
| **folderBatchDownloadV1Request** | [**FolderBatchDownloadV1Request**](FolderBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="folderGetAttachmentsV1"></a>
# **folderGetAttachmentsV1**
> FolderGetAttachmentsV1Response folderGetAttachmentsV1(pkiFolderID)

Retrieve Folder&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFolderApi()
val pkiFolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : FolderGetAttachmentsV1Response = apiInstance.folderGetAttachmentsV1(pkiFolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFolderApi#folderGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFolderApi#folderGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiFolderID** | **kotlin.Int**|  | |

### Return type

[**FolderGetAttachmentsV1Response**](FolderGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="folderGetCommunicationCountV1"></a>
# **folderGetCommunicationCountV1**
> FolderGetCommunicationCountV1Response folderGetCommunicationCountV1(pkiFolderID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFolderApi()
val pkiFolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : FolderGetCommunicationCountV1Response = apiInstance.folderGetCommunicationCountV1(pkiFolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFolderApi#folderGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFolderApi#folderGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiFolderID** | **kotlin.Int**|  | |

### Return type

[**FolderGetCommunicationCountV1Response**](FolderGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="folderGetCommunicationListV1"></a>
# **folderGetCommunicationListV1**
> FolderGetCommunicationListV1Response folderGetCommunicationListV1(pkiFolderID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFolderApi()
val pkiFolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : FolderGetCommunicationListV1Response = apiInstance.folderGetCommunicationListV1(pkiFolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFolderApi#folderGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFolderApi#folderGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiFolderID** | **kotlin.Int**|  | |

### Return type

[**FolderGetCommunicationListV1Response**](FolderGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="folderGetCommunicationrecipientsV1"></a>
# **folderGetCommunicationrecipientsV1**
> FolderGetCommunicationrecipientsV1Response folderGetCommunicationrecipientsV1(pkiFolderID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFolderApi()
val pkiFolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : FolderGetCommunicationrecipientsV1Response = apiInstance.folderGetCommunicationrecipientsV1(pkiFolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFolderApi#folderGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFolderApi#folderGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiFolderID** | **kotlin.Int**|  | |

### Return type

[**FolderGetCommunicationrecipientsV1Response**](FolderGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="folderGetCommunicationsendersV1"></a>
# **folderGetCommunicationsendersV1**
> FolderGetCommunicationsendersV1Response folderGetCommunicationsendersV1(pkiFolderID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFolderApi()
val pkiFolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : FolderGetCommunicationsendersV1Response = apiInstance.folderGetCommunicationsendersV1(pkiFolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFolderApi#folderGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFolderApi#folderGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiFolderID** | **kotlin.Int**|  | |

### Return type

[**FolderGetCommunicationsendersV1Response**](FolderGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="folderGetDocumenttypechecklistV1"></a>
# **folderGetDocumenttypechecklistV1**
> FolderGetDocumenttypechecklistV1Response folderGetDocumenttypechecklistV1(pkiFolderID)

Retrieve Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFolderApi()
val pkiFolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : FolderGetDocumenttypechecklistV1Response = apiInstance.folderGetDocumenttypechecklistV1(pkiFolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFolderApi#folderGetDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFolderApi#folderGetDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiFolderID** | **kotlin.Int**|  | |

### Return type

[**FolderGetDocumenttypechecklistV1Response**](FolderGetDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="folderImportIntoEDMV1"></a>
# **folderImportIntoEDMV1**
> FolderImportIntoEDMV1Response folderImportIntoEDMV1(pkiFolderID, folderImportIntoEDMV1Request)

Import attachments into the Folder

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFolderApi()
val pkiFolderID : kotlin.Int = 56 // kotlin.Int | 
val folderImportIntoEDMV1Request : FolderImportIntoEDMV1Request =  // FolderImportIntoEDMV1Request | 
try {
    val result : FolderImportIntoEDMV1Response = apiInstance.folderImportIntoEDMV1(pkiFolderID, folderImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFolderApi#folderImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFolderApi#folderImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiFolderID** | **kotlin.Int**|  | |
| **folderImportIntoEDMV1Request** | [**FolderImportIntoEDMV1Request**](FolderImportIntoEDMV1Request.md)|  | |

### Return type

[**FolderImportIntoEDMV1Response**](FolderImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="folderSyncDocumenttypechecklistV1"></a>
# **folderSyncDocumenttypechecklistV1**
> FolderSyncDocumenttypechecklistV1Response folderSyncDocumenttypechecklistV1(pkiFolderID, body)

Synchronize Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFolderApi()
val pkiFolderID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : FolderSyncDocumenttypechecklistV1Response = apiInstance.folderSyncDocumenttypechecklistV1(pkiFolderID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFolderApi#folderSyncDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFolderApi#folderSyncDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiFolderID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**FolderSyncDocumenttypechecklistV1Response**](FolderSyncDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


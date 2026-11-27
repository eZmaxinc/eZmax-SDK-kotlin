# ObjectLeadApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**leadBatchDownloadV1**](ObjectLeadApi.md#leadBatchDownloadV1) | **POST** /1/object/lead/{pkiLeadID}/batchDownload | Download multiples attachments from a Lead |
| [**leadGetAttachmentsV1**](ObjectLeadApi.md#leadGetAttachmentsV1) | **GET** /1/object/lead/{pkiLeadID}/getAttachments | Retrieve Lead&#39;s attachments |
| [**leadGetCommunicationCountV1**](ObjectLeadApi.md#leadGetCommunicationCountV1) | **GET** /1/object/lead/{pkiLeadID}/getCommunicationCount | Retrieve Communication count |
| [**leadGetCommunicationListV1**](ObjectLeadApi.md#leadGetCommunicationListV1) | **GET** /1/object/lead/{pkiLeadID}/getCommunicationList | Retrieve Communication list |
| [**leadGetCommunicationrecipientsV1**](ObjectLeadApi.md#leadGetCommunicationrecipientsV1) | **GET** /1/object/lead/{pkiLeadID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**leadGetCommunicationsendersV1**](ObjectLeadApi.md#leadGetCommunicationsendersV1) | **GET** /1/object/lead/{pkiLeadID}/getCommunicationsenders | Retrieve Communication senders |
| [**leadGetDocumenttypechecklistV1**](ObjectLeadApi.md#leadGetDocumenttypechecklistV1) | **GET** /1/object/lead/{pkiLeadID}/getDocumenttypechecklist | Retrieve Document type checklist |
| [**leadGetListV1**](ObjectLeadApi.md#leadGetListV1) | **GET** /1/object/lead/getList | Retrieve Lead list |
| [**leadImportIntoEDMV1**](ObjectLeadApi.md#leadImportIntoEDMV1) | **POST** /1/object/lead/{pkiLeadID}/importIntoEDM | Import attachments into the Lead |
| [**leadSyncDocumenttypechecklistV1**](ObjectLeadApi.md#leadSyncDocumenttypechecklistV1) | **POST** /1/object/lead/{pkiLeadID}/syncDocumenttypechecklist | Synchronize Document type checklist |


<a id="leadBatchDownloadV1"></a>
# **leadBatchDownloadV1**
> java.io.File leadBatchDownloadV1(pkiLeadID, leadBatchDownloadV1Request)

Download multiples attachments from a Lead

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val pkiLeadID : kotlin.Int = 56 // kotlin.Int | 
val leadBatchDownloadV1Request : LeadBatchDownloadV1Request =  // LeadBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.leadBatchDownloadV1(pkiLeadID, leadBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiLeadID** | **kotlin.Int**|  | |
| **leadBatchDownloadV1Request** | [**LeadBatchDownloadV1Request**](LeadBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="leadGetAttachmentsV1"></a>
# **leadGetAttachmentsV1**
> LeadGetAttachmentsV1Response leadGetAttachmentsV1(pkiLeadID)

Retrieve Lead&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val pkiLeadID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : LeadGetAttachmentsV1Response = apiInstance.leadGetAttachmentsV1(pkiLeadID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiLeadID** | **kotlin.Int**|  | |

### Return type

[**LeadGetAttachmentsV1Response**](LeadGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadGetCommunicationCountV1"></a>
# **leadGetCommunicationCountV1**
> LeadGetCommunicationCountV1Response leadGetCommunicationCountV1(pkiLeadID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val pkiLeadID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : LeadGetCommunicationCountV1Response = apiInstance.leadGetCommunicationCountV1(pkiLeadID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiLeadID** | **kotlin.Int**|  | |

### Return type

[**LeadGetCommunicationCountV1Response**](LeadGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadGetCommunicationListV1"></a>
# **leadGetCommunicationListV1**
> LeadGetCommunicationListV1Response leadGetCommunicationListV1(pkiLeadID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val pkiLeadID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : LeadGetCommunicationListV1Response = apiInstance.leadGetCommunicationListV1(pkiLeadID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiLeadID** | **kotlin.Int**|  | |

### Return type

[**LeadGetCommunicationListV1Response**](LeadGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadGetCommunicationrecipientsV1"></a>
# **leadGetCommunicationrecipientsV1**
> LeadGetCommunicationrecipientsV1Response leadGetCommunicationrecipientsV1(pkiLeadID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val pkiLeadID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : LeadGetCommunicationrecipientsV1Response = apiInstance.leadGetCommunicationrecipientsV1(pkiLeadID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiLeadID** | **kotlin.Int**|  | |

### Return type

[**LeadGetCommunicationrecipientsV1Response**](LeadGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadGetCommunicationsendersV1"></a>
# **leadGetCommunicationsendersV1**
> LeadGetCommunicationsendersV1Response leadGetCommunicationsendersV1(pkiLeadID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val pkiLeadID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : LeadGetCommunicationsendersV1Response = apiInstance.leadGetCommunicationsendersV1(pkiLeadID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiLeadID** | **kotlin.Int**|  | |

### Return type

[**LeadGetCommunicationsendersV1Response**](LeadGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadGetDocumenttypechecklistV1"></a>
# **leadGetDocumenttypechecklistV1**
> LeadGetDocumenttypechecklistV1Response leadGetDocumenttypechecklistV1(pkiLeadID)

Retrieve Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val pkiLeadID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : LeadGetDocumenttypechecklistV1Response = apiInstance.leadGetDocumenttypechecklistV1(pkiLeadID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadGetDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadGetDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiLeadID** | **kotlin.Int**|  | |

### Return type

[**LeadGetDocumenttypechecklistV1Response**](LeadGetDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadGetListV1"></a>
# **leadGetListV1**
> LeadGetListV1Response leadGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Lead list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eLeadStatus | New&lt;br&gt;Dispatching&lt;br&gt;Assigned&lt;br&gt;Lost&lt;br&gt;Won |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : LeadGetListV1Response = apiInstance.leadGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiLeadID_ASC, pkiLeadID_DESC, fkiLeadsourceID_ASC, fkiLeadsourceID_DESC, sLeadsourceNameX_ASC, sLeadsourceNameX_DESC, eLeadStatus_ASC, eLeadStatus_DESC, dtLeadExpiration_ASC, dtLeadExpiration_DESC, bLeadIsactive_ASC, bLeadIsactive_DESC, sLeadCode_ASC, sLeadCode_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**LeadGetListV1Response**](LeadGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadImportIntoEDMV1"></a>
# **leadImportIntoEDMV1**
> LeadImportIntoEDMV1Response leadImportIntoEDMV1(pkiLeadID, leadImportIntoEDMV1Request)

Import attachments into the Lead



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val pkiLeadID : kotlin.Int = 56 // kotlin.Int | 
val leadImportIntoEDMV1Request : LeadImportIntoEDMV1Request =  // LeadImportIntoEDMV1Request | 
try {
    val result : LeadImportIntoEDMV1Response = apiInstance.leadImportIntoEDMV1(pkiLeadID, leadImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiLeadID** | **kotlin.Int**|  | |
| **leadImportIntoEDMV1Request** | [**LeadImportIntoEDMV1Request**](LeadImportIntoEDMV1Request.md)|  | |

### Return type

[**LeadImportIntoEDMV1Response**](LeadImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="leadSyncDocumenttypechecklistV1"></a>
# **leadSyncDocumenttypechecklistV1**
> LeadSyncDocumenttypechecklistV1Response leadSyncDocumenttypechecklistV1(pkiLeadID, body)

Synchronize Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val pkiLeadID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : LeadSyncDocumenttypechecklistV1Response = apiInstance.leadSyncDocumenttypechecklistV1(pkiLeadID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadSyncDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadSyncDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiLeadID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**LeadSyncDocumenttypechecklistV1Response**](LeadSyncDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


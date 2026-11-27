# ObjectDepositApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**depositBatchDownloadV1**](ObjectDepositApi.md#depositBatchDownloadV1) | **POST** /1/object/deposit/{pkiDepositID}/batchDownload | Download multiples attachments from a Deposit |
| [**depositGetAttachmentsV1**](ObjectDepositApi.md#depositGetAttachmentsV1) | **GET** /1/object/deposit/{pkiDepositID}/getAttachments | Retrieve Deposit&#39;s attachments |
| [**depositGetCommunicationCountV1**](ObjectDepositApi.md#depositGetCommunicationCountV1) | **GET** /1/object/deposit/{pkiDepositID}/getCommunicationCount | Retrieve Communication count |
| [**depositGetCommunicationListV1**](ObjectDepositApi.md#depositGetCommunicationListV1) | **GET** /1/object/deposit/{pkiDepositID}/getCommunicationList | Retrieve Communication list |
| [**depositGetCommunicationrecipientsV1**](ObjectDepositApi.md#depositGetCommunicationrecipientsV1) | **GET** /1/object/deposit/{pkiDepositID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**depositGetCommunicationsendersV1**](ObjectDepositApi.md#depositGetCommunicationsendersV1) | **GET** /1/object/deposit/{pkiDepositID}/getCommunicationsenders | Retrieve Communication senders |
| [**depositGetDocumenttypechecklistV1**](ObjectDepositApi.md#depositGetDocumenttypechecklistV1) | **GET** /1/object/deposit/{pkiDepositID}/getDocumenttypechecklist | Retrieve Document type checklist |
| [**depositGetListV1**](ObjectDepositApi.md#depositGetListV1) | **GET** /1/object/deposit/getList | Retrieve Deposit list |
| [**depositImportIntoEDMV1**](ObjectDepositApi.md#depositImportIntoEDMV1) | **POST** /1/object/deposit/{pkiDepositID}/importIntoEDM | Import attachments into the Deposit |
| [**depositSyncDocumenttypechecklistV1**](ObjectDepositApi.md#depositSyncDocumenttypechecklistV1) | **POST** /1/object/deposit/{pkiDepositID}/syncDocumenttypechecklist | Synchronize Document type checklist |


<a id="depositBatchDownloadV1"></a>
# **depositBatchDownloadV1**
> java.io.File depositBatchDownloadV1(pkiDepositID, depositBatchDownloadV1Request)

Download multiples attachments from a Deposit

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepositApi()
val pkiDepositID : kotlin.Int = 56 // kotlin.Int | 
val depositBatchDownloadV1Request : DepositBatchDownloadV1Request =  // DepositBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.depositBatchDownloadV1(pkiDepositID, depositBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepositApi#depositBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepositApi#depositBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDepositID** | **kotlin.Int**|  | |
| **depositBatchDownloadV1Request** | [**DepositBatchDownloadV1Request**](DepositBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="depositGetAttachmentsV1"></a>
# **depositGetAttachmentsV1**
> DepositGetAttachmentsV1Response depositGetAttachmentsV1(pkiDepositID)

Retrieve Deposit&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepositApi()
val pkiDepositID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DepositGetAttachmentsV1Response = apiInstance.depositGetAttachmentsV1(pkiDepositID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepositApi#depositGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepositApi#depositGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDepositID** | **kotlin.Int**|  | |

### Return type

[**DepositGetAttachmentsV1Response**](DepositGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="depositGetCommunicationCountV1"></a>
# **depositGetCommunicationCountV1**
> DepositGetCommunicationCountV1Response depositGetCommunicationCountV1(pkiDepositID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepositApi()
val pkiDepositID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DepositGetCommunicationCountV1Response = apiInstance.depositGetCommunicationCountV1(pkiDepositID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepositApi#depositGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepositApi#depositGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDepositID** | **kotlin.Int**|  | |

### Return type

[**DepositGetCommunicationCountV1Response**](DepositGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="depositGetCommunicationListV1"></a>
# **depositGetCommunicationListV1**
> DepositGetCommunicationListV1Response depositGetCommunicationListV1(pkiDepositID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepositApi()
val pkiDepositID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DepositGetCommunicationListV1Response = apiInstance.depositGetCommunicationListV1(pkiDepositID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepositApi#depositGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepositApi#depositGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDepositID** | **kotlin.Int**|  | |

### Return type

[**DepositGetCommunicationListV1Response**](DepositGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="depositGetCommunicationrecipientsV1"></a>
# **depositGetCommunicationrecipientsV1**
> DepositGetCommunicationrecipientsV1Response depositGetCommunicationrecipientsV1(pkiDepositID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepositApi()
val pkiDepositID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DepositGetCommunicationrecipientsV1Response = apiInstance.depositGetCommunicationrecipientsV1(pkiDepositID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepositApi#depositGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepositApi#depositGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDepositID** | **kotlin.Int**|  | |

### Return type

[**DepositGetCommunicationrecipientsV1Response**](DepositGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="depositGetCommunicationsendersV1"></a>
# **depositGetCommunicationsendersV1**
> DepositGetCommunicationsendersV1Response depositGetCommunicationsendersV1(pkiDepositID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepositApi()
val pkiDepositID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DepositGetCommunicationsendersV1Response = apiInstance.depositGetCommunicationsendersV1(pkiDepositID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepositApi#depositGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepositApi#depositGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDepositID** | **kotlin.Int**|  | |

### Return type

[**DepositGetCommunicationsendersV1Response**](DepositGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="depositGetDocumenttypechecklistV1"></a>
# **depositGetDocumenttypechecklistV1**
> DepositGetDocumenttypechecklistV1Response depositGetDocumenttypechecklistV1(pkiDepositID)

Retrieve Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepositApi()
val pkiDepositID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DepositGetDocumenttypechecklistV1Response = apiInstance.depositGetDocumenttypechecklistV1(pkiDepositID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepositApi#depositGetDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepositApi#depositGetDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDepositID** | **kotlin.Int**|  | |

### Return type

[**DepositGetDocumenttypechecklistV1Response**](DepositGetDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="depositGetListV1"></a>
# **depositGetListV1**
> DepositGetListV1Response depositGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Deposit list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepositApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : DepositGetListV1Response = apiInstance.depositGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepositApi#depositGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepositApi#depositGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiDepositID_ASC, pkiDepositID_DESC, fkiPeriodID_ASC, fkiPeriodID_DESC, fkiBankaccountID_ASC, fkiBankaccountID_DESC, fkiUserIDCreated_ASC, fkiUserIDCreated_DESC, sDepositNumber_ASC, sDepositNumber_DESC, dtDepositDate_ASC, dtDepositDate_DESC, dDepositTotal_ASC, dDepositTotal_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, bDepositDraft_ASC, bDepositDraft_DESC, bDepositReconciled_ASC, bDepositReconciled_DESC, fkiReconciliationID_ASC, fkiReconciliationID_DESC, sBankaccountBankname_ASC, sBankaccountBankname_DESC, sPeriodYYYYMM_ASC, sPeriodYYYYMM_DESC, sUserLoginname_ASC, sUserLoginname_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**DepositGetListV1Response**](DepositGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="depositImportIntoEDMV1"></a>
# **depositImportIntoEDMV1**
> DepositImportIntoEDMV1Response depositImportIntoEDMV1(pkiDepositID, depositImportIntoEDMV1Request)

Import attachments into the Deposit

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepositApi()
val pkiDepositID : kotlin.Int = 56 // kotlin.Int | 
val depositImportIntoEDMV1Request : DepositImportIntoEDMV1Request =  // DepositImportIntoEDMV1Request | 
try {
    val result : DepositImportIntoEDMV1Response = apiInstance.depositImportIntoEDMV1(pkiDepositID, depositImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepositApi#depositImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepositApi#depositImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDepositID** | **kotlin.Int**|  | |
| **depositImportIntoEDMV1Request** | [**DepositImportIntoEDMV1Request**](DepositImportIntoEDMV1Request.md)|  | |

### Return type

[**DepositImportIntoEDMV1Response**](DepositImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="depositSyncDocumenttypechecklistV1"></a>
# **depositSyncDocumenttypechecklistV1**
> DepositSyncDocumenttypechecklistV1Response depositSyncDocumenttypechecklistV1(pkiDepositID, body)

Synchronize Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepositApi()
val pkiDepositID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : DepositSyncDocumenttypechecklistV1Response = apiInstance.depositSyncDocumenttypechecklistV1(pkiDepositID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepositApi#depositSyncDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepositApi#depositSyncDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDepositID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**DepositSyncDocumenttypechecklistV1Response**](DepositSyncDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


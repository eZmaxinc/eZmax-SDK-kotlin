# ObjectReconciliationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**reconciliationBatchDownloadV1**](ObjectReconciliationApi.md#reconciliationBatchDownloadV1) | **POST** /1/object/reconciliation/{pkiReconciliationID}/batchDownload | Download multiples attachments from a Reconciliation |
| [**reconciliationGetAttachmentsV1**](ObjectReconciliationApi.md#reconciliationGetAttachmentsV1) | **GET** /1/object/reconciliation/{pkiReconciliationID}/getAttachments | Retrieve Reconciliation&#39;s attachments |
| [**reconciliationImportIntoEDMV1**](ObjectReconciliationApi.md#reconciliationImportIntoEDMV1) | **POST** /1/object/reconciliation/{pkiReconciliationID}/importIntoEDM | Import attachments into the Reconciliation |


<a id="reconciliationBatchDownloadV1"></a>
# **reconciliationBatchDownloadV1**
> java.io.File reconciliationBatchDownloadV1(pkiReconciliationID, reconciliationBatchDownloadV1Request)

Download multiples attachments from a Reconciliation

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectReconciliationApi()
val pkiReconciliationID : kotlin.Int = 56 // kotlin.Int | 
val reconciliationBatchDownloadV1Request : ReconciliationBatchDownloadV1Request =  // ReconciliationBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.reconciliationBatchDownloadV1(pkiReconciliationID, reconciliationBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectReconciliationApi#reconciliationBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectReconciliationApi#reconciliationBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiReconciliationID** | **kotlin.Int**|  | |
| **reconciliationBatchDownloadV1Request** | [**ReconciliationBatchDownloadV1Request**](ReconciliationBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reconciliationGetAttachmentsV1"></a>
# **reconciliationGetAttachmentsV1**
> ReconciliationGetAttachmentsV1Response reconciliationGetAttachmentsV1(pkiReconciliationID)

Retrieve Reconciliation&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectReconciliationApi()
val pkiReconciliationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ReconciliationGetAttachmentsV1Response = apiInstance.reconciliationGetAttachmentsV1(pkiReconciliationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectReconciliationApi#reconciliationGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectReconciliationApi#reconciliationGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiReconciliationID** | **kotlin.Int**|  | |

### Return type

[**ReconciliationGetAttachmentsV1Response**](ReconciliationGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reconciliationImportIntoEDMV1"></a>
# **reconciliationImportIntoEDMV1**
> ReconciliationImportIntoEDMV1Response reconciliationImportIntoEDMV1(pkiReconciliationID, reconciliationImportIntoEDMV1Request)

Import attachments into the Reconciliation

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectReconciliationApi()
val pkiReconciliationID : kotlin.Int = 56 // kotlin.Int | 
val reconciliationImportIntoEDMV1Request : ReconciliationImportIntoEDMV1Request =  // ReconciliationImportIntoEDMV1Request | 
try {
    val result : ReconciliationImportIntoEDMV1Response = apiInstance.reconciliationImportIntoEDMV1(pkiReconciliationID, reconciliationImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectReconciliationApi#reconciliationImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectReconciliationApi#reconciliationImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiReconciliationID** | **kotlin.Int**|  | |
| **reconciliationImportIntoEDMV1Request** | [**ReconciliationImportIntoEDMV1Request**](ReconciliationImportIntoEDMV1Request.md)|  | |

### Return type

[**ReconciliationImportIntoEDMV1Response**](ReconciliationImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ObjectCommissionadvanceApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**commissionadvanceBatchDownloadV1**](ObjectCommissionadvanceApi.md#commissionadvanceBatchDownloadV1) | **POST** /1/object/commissionadvance/{pkiCommissionadvanceID}/batchDownload | Download multiples attachments from a Commission advance |
| [**commissionadvanceGetAttachmentsV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetAttachmentsV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getAttachments | Retrieve Commissionadvance&#39;s attachments |
| [**commissionadvanceImportIntoEDMV1**](ObjectCommissionadvanceApi.md#commissionadvanceImportIntoEDMV1) | **POST** /1/object/commissionadvance/{pkiCommissionadvanceID}/importIntoEDM | Import attachments into the Commissionadvance |


<a id="commissionadvanceBatchDownloadV1"></a>
# **commissionadvanceBatchDownloadV1**
> java.io.File commissionadvanceBatchDownloadV1(pkiCommissionadvanceID, commissionadvanceBatchDownloadV1Request)

Download multiples attachments from a Commission advance

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommissionadvanceApi()
val pkiCommissionadvanceID : kotlin.Int = 56 // kotlin.Int | 
val commissionadvanceBatchDownloadV1Request : CommissionadvanceBatchDownloadV1Request =  // CommissionadvanceBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.commissionadvanceBatchDownloadV1(pkiCommissionadvanceID, commissionadvanceBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommissionadvanceApi#commissionadvanceBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommissionadvanceApi#commissionadvanceBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommissionadvanceID** | **kotlin.Int**|  | |
| **commissionadvanceBatchDownloadV1Request** | [**CommissionadvanceBatchDownloadV1Request**](CommissionadvanceBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="commissionadvanceGetAttachmentsV1"></a>
# **commissionadvanceGetAttachmentsV1**
> CommissionadvanceGetAttachmentsV1Response commissionadvanceGetAttachmentsV1(pkiCommissionadvanceID)

Retrieve Commissionadvance&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommissionadvanceApi()
val pkiCommissionadvanceID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommissionadvanceGetAttachmentsV1Response = apiInstance.commissionadvanceGetAttachmentsV1(pkiCommissionadvanceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommissionadvanceApi#commissionadvanceGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommissionadvanceApi#commissionadvanceGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommissionadvanceID** | **kotlin.Int**|  | |

### Return type

[**CommissionadvanceGetAttachmentsV1Response**](CommissionadvanceGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="commissionadvanceImportIntoEDMV1"></a>
# **commissionadvanceImportIntoEDMV1**
> CommissionadvanceImportIntoEDMV1Response commissionadvanceImportIntoEDMV1(pkiCommissionadvanceID, commissionadvanceImportIntoEDMV1Request)

Import attachments into the Commissionadvance

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommissionadvanceApi()
val pkiCommissionadvanceID : kotlin.Int = 56 // kotlin.Int | 
val commissionadvanceImportIntoEDMV1Request : CommissionadvanceImportIntoEDMV1Request =  // CommissionadvanceImportIntoEDMV1Request | 
try {
    val result : CommissionadvanceImportIntoEDMV1Response = apiInstance.commissionadvanceImportIntoEDMV1(pkiCommissionadvanceID, commissionadvanceImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommissionadvanceApi#commissionadvanceImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommissionadvanceApi#commissionadvanceImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommissionadvanceID** | **kotlin.Int**|  | |
| **commissionadvanceImportIntoEDMV1Request** | [**CommissionadvanceImportIntoEDMV1Request**](CommissionadvanceImportIntoEDMV1Request.md)|  | |

### Return type

[**CommissionadvanceImportIntoEDMV1Response**](CommissionadvanceImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ObjectOfficetaxreportApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**officetaxreportBatchDownloadV1**](ObjectOfficetaxreportApi.md#officetaxreportBatchDownloadV1) | **POST** /1/object/officetaxreport/{pkiOfficetaxreportID}/batchDownload | Download multiples attachments from an Officetaxreport |
| [**officetaxreportGetAttachmentsV1**](ObjectOfficetaxreportApi.md#officetaxreportGetAttachmentsV1) | **GET** /1/object/officetaxreport/{pkiOfficetaxreportID}/getAttachments | Retrieve Officetaxreport&#39;s attachments |
| [**officetaxreportImportIntoEDMV1**](ObjectOfficetaxreportApi.md#officetaxreportImportIntoEDMV1) | **POST** /1/object/officetaxreport/{pkiOfficetaxreportID}/importIntoEDM | Import attachments into the Officetaxreport |


<a id="officetaxreportBatchDownloadV1"></a>
# **officetaxreportBatchDownloadV1**
> java.io.File officetaxreportBatchDownloadV1(pkiOfficetaxreportID, officetaxreportBatchDownloadV1Request)

Download multiples attachments from an Officetaxreport

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOfficetaxreportApi()
val pkiOfficetaxreportID : kotlin.Int = 56 // kotlin.Int | 
val officetaxreportBatchDownloadV1Request : OfficetaxreportBatchDownloadV1Request =  // OfficetaxreportBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.officetaxreportBatchDownloadV1(pkiOfficetaxreportID, officetaxreportBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOfficetaxreportApi#officetaxreportBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOfficetaxreportApi#officetaxreportBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOfficetaxreportID** | **kotlin.Int**|  | |
| **officetaxreportBatchDownloadV1Request** | [**OfficetaxreportBatchDownloadV1Request**](OfficetaxreportBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="officetaxreportGetAttachmentsV1"></a>
# **officetaxreportGetAttachmentsV1**
> OfficetaxreportGetAttachmentsV1Response officetaxreportGetAttachmentsV1(pkiOfficetaxreportID)

Retrieve Officetaxreport&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOfficetaxreportApi()
val pkiOfficetaxreportID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OfficetaxreportGetAttachmentsV1Response = apiInstance.officetaxreportGetAttachmentsV1(pkiOfficetaxreportID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOfficetaxreportApi#officetaxreportGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOfficetaxreportApi#officetaxreportGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOfficetaxreportID** | **kotlin.Int**|  | |

### Return type

[**OfficetaxreportGetAttachmentsV1Response**](OfficetaxreportGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="officetaxreportImportIntoEDMV1"></a>
# **officetaxreportImportIntoEDMV1**
> OfficetaxreportImportIntoEDMV1Response officetaxreportImportIntoEDMV1(pkiOfficetaxreportID, officetaxreportImportIntoEDMV1Request)

Import attachments into the Officetaxreport

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOfficetaxreportApi()
val pkiOfficetaxreportID : kotlin.Int = 56 // kotlin.Int | 
val officetaxreportImportIntoEDMV1Request : OfficetaxreportImportIntoEDMV1Request =  // OfficetaxreportImportIntoEDMV1Request | 
try {
    val result : OfficetaxreportImportIntoEDMV1Response = apiInstance.officetaxreportImportIntoEDMV1(pkiOfficetaxreportID, officetaxreportImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOfficetaxreportApi#officetaxreportImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOfficetaxreportApi#officetaxreportImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOfficetaxreportID** | **kotlin.Int**|  | |
| **officetaxreportImportIntoEDMV1Request** | [**OfficetaxreportImportIntoEDMV1Request**](OfficetaxreportImportIntoEDMV1Request.md)|  | |

### Return type

[**OfficetaxreportImportIntoEDMV1Response**](OfficetaxreportImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


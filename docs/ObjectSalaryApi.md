# ObjectSalaryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**salaryBatchDownloadV1**](ObjectSalaryApi.md#salaryBatchDownloadV1) | **POST** /1/object/salary/{pkiSalaryID}/batchDownload | Download multiples attachments from a Reconciliation |
| [**salaryGetAttachmentsV1**](ObjectSalaryApi.md#salaryGetAttachmentsV1) | **GET** /1/object/salary/{pkiSalaryID}/getAttachments | Retrieve Salary&#39;s attachments |
| [**salaryGetListV1**](ObjectSalaryApi.md#salaryGetListV1) | **GET** /1/object/salary/getList | Retrieve Salary list |
| [**salaryImportIntoEDMV1**](ObjectSalaryApi.md#salaryImportIntoEDMV1) | **POST** /1/object/salary/{pkiSalaryID}/importIntoEDM | Import attachments into the Salary |


<a id="salaryBatchDownloadV1"></a>
# **salaryBatchDownloadV1**
> java.io.File salaryBatchDownloadV1(pkiSalaryID, salaryBatchDownloadV1Request)

Download multiples attachments from a Reconciliation

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSalaryApi()
val pkiSalaryID : kotlin.Int = 56 // kotlin.Int | 
val salaryBatchDownloadV1Request : SalaryBatchDownloadV1Request =  // SalaryBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.salaryBatchDownloadV1(pkiSalaryID, salaryBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSalaryApi#salaryBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSalaryApi#salaryBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSalaryID** | **kotlin.Int**|  | |
| **salaryBatchDownloadV1Request** | [**SalaryBatchDownloadV1Request**](SalaryBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="salaryGetAttachmentsV1"></a>
# **salaryGetAttachmentsV1**
> SalaryGetAttachmentsV1Response salaryGetAttachmentsV1(pkiSalaryID)

Retrieve Salary&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSalaryApi()
val pkiSalaryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : SalaryGetAttachmentsV1Response = apiInstance.salaryGetAttachmentsV1(pkiSalaryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSalaryApi#salaryGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSalaryApi#salaryGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSalaryID** | **kotlin.Int**|  | |

### Return type

[**SalaryGetAttachmentsV1Response**](SalaryGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="salaryGetListV1"></a>
# **salaryGetListV1**
> SalaryGetListV1Response salaryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Salary list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSalaryApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : SalaryGetListV1Response = apiInstance.salaryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSalaryApi#salaryGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSalaryApi#salaryGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiSalaryID_ASC, pkiSalaryID_DESC, fkiPeriodID_ASC, fkiPeriodID_DESC, fkiUSerIDCreated_ASC, fkiUSerIDCreated_DESC, fkiSalaryperiodID_ASC, fkiSalaryperiodID_DESC, dtSalaryPaymentdate_ASC, dtSalaryPaymentdate_DESC, sSalaryperiod_ASC, sSalaryperiod_DESC, sPeriodYYYYMM_ASC, sPeriodYYYYMM_DESC, iSalarypreparationCount_ASC, iSalarypreparationCount_DESC, dSalarypreparationTotal_ASC, dSalarypreparationTotal_DESC, dtSalaryperiodStart_ASC, dtSalaryperiodStart_DESC, dtSalaryperiodEnd_ASC, dtSalaryperiodEnd_DESC, sUserLoginname_ASC, sUserLoginname_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, bSalarypreparationIspaid_ASC, bSalarypreparationIspaid_DESC, iSalaryperiodgroupYear_ASC, iSalaryperiodgroupYear_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**SalaryGetListV1Response**](SalaryGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="salaryImportIntoEDMV1"></a>
# **salaryImportIntoEDMV1**
> SalaryImportIntoEDMV1Response salaryImportIntoEDMV1(pkiSalaryID, salaryImportIntoEDMV1Request)

Import attachments into the Salary

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSalaryApi()
val pkiSalaryID : kotlin.Int = 56 // kotlin.Int | 
val salaryImportIntoEDMV1Request : SalaryImportIntoEDMV1Request =  // SalaryImportIntoEDMV1Request | 
try {
    val result : SalaryImportIntoEDMV1Response = apiInstance.salaryImportIntoEDMV1(pkiSalaryID, salaryImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSalaryApi#salaryImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSalaryApi#salaryImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSalaryID** | **kotlin.Int**|  | |
| **salaryImportIntoEDMV1Request** | [**SalaryImportIntoEDMV1Request**](SalaryImportIntoEDMV1Request.md)|  | |

### Return type

[**SalaryImportIntoEDMV1Response**](SalaryImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


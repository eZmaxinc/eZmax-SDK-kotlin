# ObjectSalaryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**salaryBatchDownloadV1**](ObjectSalaryApi.md#salaryBatchDownloadV1) | **POST** /1/object/salary/{pkiSalaryID}/batchDownload | Download multiples attachments from a Reconciliation |
| [**salaryGetAttachmentsV1**](ObjectSalaryApi.md#salaryGetAttachmentsV1) | **GET** /1/object/salary/{pkiSalaryID}/getAttachments | Retrieve Salary&#39;s attachments |
| [**salaryGetCommunicationCountV1**](ObjectSalaryApi.md#salaryGetCommunicationCountV1) | **GET** /1/object/salary/{pkiSalaryID}/getCommunicationCount | Retrieve Communication count |
| [**salaryGetCommunicationListV1**](ObjectSalaryApi.md#salaryGetCommunicationListV1) | **GET** /1/object/salary/{pkiSalaryID}/getCommunicationList | Retrieve Communication list |
| [**salaryGetCommunicationrecipientsV1**](ObjectSalaryApi.md#salaryGetCommunicationrecipientsV1) | **GET** /1/object/salary/{pkiSalaryID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**salaryGetCommunicationsendersV1**](ObjectSalaryApi.md#salaryGetCommunicationsendersV1) | **GET** /1/object/salary/{pkiSalaryID}/getCommunicationsenders | Retrieve Communication senders |
| [**salaryGetDocumenttypechecklistV1**](ObjectSalaryApi.md#salaryGetDocumenttypechecklistV1) | **GET** /1/object/salary/{pkiSalaryID}/getDocumenttypechecklist | Retrieve Document type checklist |
| [**salaryGetListV1**](ObjectSalaryApi.md#salaryGetListV1) | **GET** /1/object/salary/getList | Retrieve Salary list |
| [**salaryImportIntoEDMV1**](ObjectSalaryApi.md#salaryImportIntoEDMV1) | **POST** /1/object/salary/{pkiSalaryID}/importIntoEDM | Import attachments into the Salary |
| [**salarySyncDocumenttypechecklistV1**](ObjectSalaryApi.md#salarySyncDocumenttypechecklistV1) | **POST** /1/object/salary/{pkiSalaryID}/syncDocumenttypechecklist | Synchronize Document type checklist |


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

<a id="salaryGetCommunicationCountV1"></a>
# **salaryGetCommunicationCountV1**
> SalaryGetCommunicationCountV1Response salaryGetCommunicationCountV1(pkiSalaryID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSalaryApi()
val pkiSalaryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : SalaryGetCommunicationCountV1Response = apiInstance.salaryGetCommunicationCountV1(pkiSalaryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSalaryApi#salaryGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSalaryApi#salaryGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSalaryID** | **kotlin.Int**|  | |

### Return type

[**SalaryGetCommunicationCountV1Response**](SalaryGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="salaryGetCommunicationListV1"></a>
# **salaryGetCommunicationListV1**
> SalaryGetCommunicationListV1Response salaryGetCommunicationListV1(pkiSalaryID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSalaryApi()
val pkiSalaryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : SalaryGetCommunicationListV1Response = apiInstance.salaryGetCommunicationListV1(pkiSalaryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSalaryApi#salaryGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSalaryApi#salaryGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSalaryID** | **kotlin.Int**|  | |

### Return type

[**SalaryGetCommunicationListV1Response**](SalaryGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="salaryGetCommunicationrecipientsV1"></a>
# **salaryGetCommunicationrecipientsV1**
> SalaryGetCommunicationrecipientsV1Response salaryGetCommunicationrecipientsV1(pkiSalaryID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSalaryApi()
val pkiSalaryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : SalaryGetCommunicationrecipientsV1Response = apiInstance.salaryGetCommunicationrecipientsV1(pkiSalaryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSalaryApi#salaryGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSalaryApi#salaryGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSalaryID** | **kotlin.Int**|  | |

### Return type

[**SalaryGetCommunicationrecipientsV1Response**](SalaryGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="salaryGetCommunicationsendersV1"></a>
# **salaryGetCommunicationsendersV1**
> SalaryGetCommunicationsendersV1Response salaryGetCommunicationsendersV1(pkiSalaryID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSalaryApi()
val pkiSalaryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : SalaryGetCommunicationsendersV1Response = apiInstance.salaryGetCommunicationsendersV1(pkiSalaryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSalaryApi#salaryGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSalaryApi#salaryGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSalaryID** | **kotlin.Int**|  | |

### Return type

[**SalaryGetCommunicationsendersV1Response**](SalaryGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="salaryGetDocumenttypechecklistV1"></a>
# **salaryGetDocumenttypechecklistV1**
> SalaryGetDocumenttypechecklistV1Response salaryGetDocumenttypechecklistV1(pkiSalaryID)

Retrieve Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSalaryApi()
val pkiSalaryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : SalaryGetDocumenttypechecklistV1Response = apiInstance.salaryGetDocumenttypechecklistV1(pkiSalaryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSalaryApi#salaryGetDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSalaryApi#salaryGetDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSalaryID** | **kotlin.Int**|  | |

### Return type

[**SalaryGetDocumenttypechecklistV1Response**](SalaryGetDocumenttypechecklistV1Response.md)

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

<a id="salarySyncDocumenttypechecklistV1"></a>
# **salarySyncDocumenttypechecklistV1**
> SalarySyncDocumenttypechecklistV1Response salarySyncDocumenttypechecklistV1(pkiSalaryID, body)

Synchronize Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSalaryApi()
val pkiSalaryID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : SalarySyncDocumenttypechecklistV1Response = apiInstance.salarySyncDocumenttypechecklistV1(pkiSalaryID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSalaryApi#salarySyncDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSalaryApi#salarySyncDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSalaryID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**SalarySyncDocumenttypechecklistV1Response**](SalarySyncDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


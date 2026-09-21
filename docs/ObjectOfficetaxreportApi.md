# ObjectOfficetaxreportApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**officetaxreportBatchDownloadV1**](ObjectOfficetaxreportApi.md#officetaxreportBatchDownloadV1) | **POST** /1/object/officetaxreport/{pkiOfficetaxreportID}/batchDownload | Download multiples attachments from an Officetaxreport |
| [**officetaxreportGetAttachmentsV1**](ObjectOfficetaxreportApi.md#officetaxreportGetAttachmentsV1) | **GET** /1/object/officetaxreport/{pkiOfficetaxreportID}/getAttachments | Retrieve Officetaxreport&#39;s attachments |
| [**officetaxreportGetCommunicationCountV1**](ObjectOfficetaxreportApi.md#officetaxreportGetCommunicationCountV1) | **GET** /1/object/officetaxreport/{pkiOfficetaxreportID}/getCommunicationCount | Retrieve Communication count |
| [**officetaxreportGetCommunicationListV1**](ObjectOfficetaxreportApi.md#officetaxreportGetCommunicationListV1) | **GET** /1/object/officetaxreport/{pkiOfficetaxreportID}/getCommunicationList | Retrieve Communication list |
| [**officetaxreportGetCommunicationrecipientsV1**](ObjectOfficetaxreportApi.md#officetaxreportGetCommunicationrecipientsV1) | **GET** /1/object/officetaxreport/{pkiOfficetaxreportID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**officetaxreportGetCommunicationsendersV1**](ObjectOfficetaxreportApi.md#officetaxreportGetCommunicationsendersV1) | **GET** /1/object/officetaxreport/{pkiOfficetaxreportID}/getCommunicationsenders | Retrieve Communication senders |
| [**officetaxreportGetListV1**](ObjectOfficetaxreportApi.md#officetaxreportGetListV1) | **GET** /1/object/officetaxreport/getList | Retrieve Officetaxreport list |
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

<a id="officetaxreportGetCommunicationCountV1"></a>
# **officetaxreportGetCommunicationCountV1**
> OfficetaxreportGetCommunicationCountV1Response officetaxreportGetCommunicationCountV1(pkiOfficetaxreportID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOfficetaxreportApi()
val pkiOfficetaxreportID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OfficetaxreportGetCommunicationCountV1Response = apiInstance.officetaxreportGetCommunicationCountV1(pkiOfficetaxreportID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOfficetaxreportApi#officetaxreportGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOfficetaxreportApi#officetaxreportGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOfficetaxreportID** | **kotlin.Int**|  | |

### Return type

[**OfficetaxreportGetCommunicationCountV1Response**](OfficetaxreportGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="officetaxreportGetCommunicationListV1"></a>
# **officetaxreportGetCommunicationListV1**
> OfficetaxreportGetCommunicationListV1Response officetaxreportGetCommunicationListV1(pkiOfficetaxreportID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOfficetaxreportApi()
val pkiOfficetaxreportID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OfficetaxreportGetCommunicationListV1Response = apiInstance.officetaxreportGetCommunicationListV1(pkiOfficetaxreportID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOfficetaxreportApi#officetaxreportGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOfficetaxreportApi#officetaxreportGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOfficetaxreportID** | **kotlin.Int**|  | |

### Return type

[**OfficetaxreportGetCommunicationListV1Response**](OfficetaxreportGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="officetaxreportGetCommunicationrecipientsV1"></a>
# **officetaxreportGetCommunicationrecipientsV1**
> OfficetaxreportGetCommunicationrecipientsV1Response officetaxreportGetCommunicationrecipientsV1(pkiOfficetaxreportID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOfficetaxreportApi()
val pkiOfficetaxreportID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OfficetaxreportGetCommunicationrecipientsV1Response = apiInstance.officetaxreportGetCommunicationrecipientsV1(pkiOfficetaxreportID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOfficetaxreportApi#officetaxreportGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOfficetaxreportApi#officetaxreportGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOfficetaxreportID** | **kotlin.Int**|  | |

### Return type

[**OfficetaxreportGetCommunicationrecipientsV1Response**](OfficetaxreportGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="officetaxreportGetCommunicationsendersV1"></a>
# **officetaxreportGetCommunicationsendersV1**
> OfficetaxreportGetCommunicationsendersV1Response officetaxreportGetCommunicationsendersV1(pkiOfficetaxreportID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOfficetaxreportApi()
val pkiOfficetaxreportID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OfficetaxreportGetCommunicationsendersV1Response = apiInstance.officetaxreportGetCommunicationsendersV1(pkiOfficetaxreportID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOfficetaxreportApi#officetaxreportGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOfficetaxreportApi#officetaxreportGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOfficetaxreportID** | **kotlin.Int**|  | |

### Return type

[**OfficetaxreportGetCommunicationsendersV1Response**](OfficetaxreportGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="officetaxreportGetListV1"></a>
# **officetaxreportGetListV1**
> OfficetaxreportGetListV1Response officetaxreportGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Officetaxreport list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOfficetaxreportApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : OfficetaxreportGetListV1Response = apiInstance.officetaxreportGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOfficetaxreportApi#officetaxreportGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOfficetaxreportApi#officetaxreportGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiOfficetaxreportID_ASC, pkiOfficetaxreportID_DESC, fkiPeriodID_ASC, fkiPeriodID_DESC, sPeriodYYYYMM_ASC, sPeriodYYYYMM_DESC, sUserLoginname_ASC, sUserLoginname_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**OfficetaxreportGetListV1Response**](OfficetaxreportGetListV1Response.md)

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


# ObjectNotaryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**notaryBatchDownloadV1**](ObjectNotaryApi.md#notaryBatchDownloadV1) | **POST** /1/object/notary/{pkiNotaryID}/batchDownload | Download multiples attachments from a Notary |
| [**notaryGetAttachmentsV1**](ObjectNotaryApi.md#notaryGetAttachmentsV1) | **GET** /1/object/notary/{pkiNotaryID}/getAttachments | Retrieve Notary&#39;s attachments |
| [**notaryGetCommunicationCountV1**](ObjectNotaryApi.md#notaryGetCommunicationCountV1) | **GET** /1/object/notary/{pkiNotaryID}/getCommunicationCount | Retrieve Communication count |
| [**notaryGetCommunicationListV1**](ObjectNotaryApi.md#notaryGetCommunicationListV1) | **GET** /1/object/notary/{pkiNotaryID}/getCommunicationList | Retrieve Communication list |
| [**notaryGetCommunicationrecipientsV1**](ObjectNotaryApi.md#notaryGetCommunicationrecipientsV1) | **GET** /1/object/notary/{pkiNotaryID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**notaryGetCommunicationsendersV1**](ObjectNotaryApi.md#notaryGetCommunicationsendersV1) | **GET** /1/object/notary/{pkiNotaryID}/getCommunicationsenders | Retrieve Communication senders |
| [**notaryGetListV1**](ObjectNotaryApi.md#notaryGetListV1) | **GET** /1/object/notary/getList | Retrieve Notary list |
| [**notaryImportIntoEDMV1**](ObjectNotaryApi.md#notaryImportIntoEDMV1) | **POST** /1/object/notary/{pkiNotaryID}/importIntoEDM | Import attachments into the Notary |


<a id="notaryBatchDownloadV1"></a>
# **notaryBatchDownloadV1**
> java.io.File notaryBatchDownloadV1(pkiNotaryID, notaryBatchDownloadV1Request)

Download multiples attachments from a Notary

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectNotaryApi()
val pkiNotaryID : kotlin.Int = 56 // kotlin.Int | 
val notaryBatchDownloadV1Request : NotaryBatchDownloadV1Request =  // NotaryBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.notaryBatchDownloadV1(pkiNotaryID, notaryBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectNotaryApi#notaryBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectNotaryApi#notaryBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiNotaryID** | **kotlin.Int**|  | |
| **notaryBatchDownloadV1Request** | [**NotaryBatchDownloadV1Request**](NotaryBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="notaryGetAttachmentsV1"></a>
# **notaryGetAttachmentsV1**
> NotaryGetAttachmentsV1Response notaryGetAttachmentsV1(pkiNotaryID)

Retrieve Notary&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectNotaryApi()
val pkiNotaryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : NotaryGetAttachmentsV1Response = apiInstance.notaryGetAttachmentsV1(pkiNotaryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectNotaryApi#notaryGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectNotaryApi#notaryGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiNotaryID** | **kotlin.Int**|  | |

### Return type

[**NotaryGetAttachmentsV1Response**](NotaryGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="notaryGetCommunicationCountV1"></a>
# **notaryGetCommunicationCountV1**
> NotaryGetCommunicationCountV1Response notaryGetCommunicationCountV1(pkiNotaryID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectNotaryApi()
val pkiNotaryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : NotaryGetCommunicationCountV1Response = apiInstance.notaryGetCommunicationCountV1(pkiNotaryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectNotaryApi#notaryGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectNotaryApi#notaryGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiNotaryID** | **kotlin.Int**|  | |

### Return type

[**NotaryGetCommunicationCountV1Response**](NotaryGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="notaryGetCommunicationListV1"></a>
# **notaryGetCommunicationListV1**
> NotaryGetCommunicationListV1Response notaryGetCommunicationListV1(pkiNotaryID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectNotaryApi()
val pkiNotaryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : NotaryGetCommunicationListV1Response = apiInstance.notaryGetCommunicationListV1(pkiNotaryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectNotaryApi#notaryGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectNotaryApi#notaryGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiNotaryID** | **kotlin.Int**|  | |

### Return type

[**NotaryGetCommunicationListV1Response**](NotaryGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="notaryGetCommunicationrecipientsV1"></a>
# **notaryGetCommunicationrecipientsV1**
> NotaryGetCommunicationrecipientsV1Response notaryGetCommunicationrecipientsV1(pkiNotaryID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectNotaryApi()
val pkiNotaryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : NotaryGetCommunicationrecipientsV1Response = apiInstance.notaryGetCommunicationrecipientsV1(pkiNotaryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectNotaryApi#notaryGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectNotaryApi#notaryGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiNotaryID** | **kotlin.Int**|  | |

### Return type

[**NotaryGetCommunicationrecipientsV1Response**](NotaryGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="notaryGetCommunicationsendersV1"></a>
# **notaryGetCommunicationsendersV1**
> NotaryGetCommunicationsendersV1Response notaryGetCommunicationsendersV1(pkiNotaryID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectNotaryApi()
val pkiNotaryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : NotaryGetCommunicationsendersV1Response = apiInstance.notaryGetCommunicationsendersV1(pkiNotaryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectNotaryApi#notaryGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectNotaryApi#notaryGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiNotaryID** | **kotlin.Int**|  | |

### Return type

[**NotaryGetCommunicationsendersV1Response**](NotaryGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="notaryGetListV1"></a>
# **notaryGetListV1**
> NotaryGetListV1Response notaryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Notary list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectNotaryApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : NotaryGetListV1Response = apiInstance.notaryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectNotaryApi#notaryGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectNotaryApi#notaryGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiNotaryID_ASC, pkiNotaryID_DESC, fkiPaymentmethodID_ASC, fkiPaymentmethodID_DESC, fkiProvinceID_ASC, fkiProvinceID_DESC, fkiCountryID_ASC, fkiCountryID_DESC, sContactLastname_ASC, sContactLastname_DESC, sContactFirstname_ASC, sContactFirstname_DESC, sContactCompany_ASC, sContactCompany_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sPhoneE164_ASC, sPhoneE164_DESC, sPaymentmethodDescriptionX_ASC, sPaymentmethodDescriptionX_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**NotaryGetListV1Response**](NotaryGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="notaryImportIntoEDMV1"></a>
# **notaryImportIntoEDMV1**
> NotaryImportIntoEDMV1Response notaryImportIntoEDMV1(pkiNotaryID, notaryImportIntoEDMV1Request)

Import attachments into the Notary

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectNotaryApi()
val pkiNotaryID : kotlin.Int = 56 // kotlin.Int | 
val notaryImportIntoEDMV1Request : NotaryImportIntoEDMV1Request =  // NotaryImportIntoEDMV1Request | 
try {
    val result : NotaryImportIntoEDMV1Response = apiInstance.notaryImportIntoEDMV1(pkiNotaryID, notaryImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectNotaryApi#notaryImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectNotaryApi#notaryImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiNotaryID** | **kotlin.Int**|  | |
| **notaryImportIntoEDMV1Request** | [**NotaryImportIntoEDMV1Request**](NotaryImportIntoEDMV1Request.md)|  | |

### Return type

[**NotaryImportIntoEDMV1Response**](NotaryImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ObjectDisclosureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**disclosureBatchDownloadV1**](ObjectDisclosureApi.md#disclosureBatchDownloadV1) | **POST** /1/object/disclosure/{pkiDisclosureID}/batchDownload | Download multiples attachments from a Disclosure |
| [**disclosureGetAttachmentsV1**](ObjectDisclosureApi.md#disclosureGetAttachmentsV1) | **GET** /1/object/disclosure/{pkiDisclosureID}/getAttachments | Retrieve Disclosure&#39;s attachments |
| [**disclosureGetCommunicationCountV1**](ObjectDisclosureApi.md#disclosureGetCommunicationCountV1) | **GET** /1/object/disclosure/{pkiDisclosureID}/getCommunicationCount | Retrieve Communication count |
| [**disclosureGetCommunicationListV1**](ObjectDisclosureApi.md#disclosureGetCommunicationListV1) | **GET** /1/object/disclosure/{pkiDisclosureID}/getCommunicationList | Retrieve Communication list |
| [**disclosureGetCommunicationrecipientsV1**](ObjectDisclosureApi.md#disclosureGetCommunicationrecipientsV1) | **GET** /1/object/disclosure/{pkiDisclosureID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**disclosureGetCommunicationsendersV1**](ObjectDisclosureApi.md#disclosureGetCommunicationsendersV1) | **GET** /1/object/disclosure/{pkiDisclosureID}/getCommunicationsenders | Retrieve Communication senders |
| [**disclosureGetListV1**](ObjectDisclosureApi.md#disclosureGetListV1) | **GET** /1/object/disclosure/getList | Retrieve Disclosure list |
| [**disclosureImportIntoEDMV1**](ObjectDisclosureApi.md#disclosureImportIntoEDMV1) | **POST** /1/object/disclosure/{pkiDisclosureID}/importIntoEDM | Import attachments into the Disclosure |


<a id="disclosureBatchDownloadV1"></a>
# **disclosureBatchDownloadV1**
> java.io.File disclosureBatchDownloadV1(pkiDisclosureID, disclosureBatchDownloadV1Request)

Download multiples attachments from a Disclosure

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDisclosureApi()
val pkiDisclosureID : kotlin.Int = 56 // kotlin.Int | 
val disclosureBatchDownloadV1Request : DisclosureBatchDownloadV1Request =  // DisclosureBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.disclosureBatchDownloadV1(pkiDisclosureID, disclosureBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDisclosureApi#disclosureBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDisclosureApi#disclosureBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDisclosureID** | **kotlin.Int**|  | |
| **disclosureBatchDownloadV1Request** | [**DisclosureBatchDownloadV1Request**](DisclosureBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="disclosureGetAttachmentsV1"></a>
# **disclosureGetAttachmentsV1**
> DisclosureGetAttachmentsV1Response disclosureGetAttachmentsV1(pkiDisclosureID)

Retrieve Disclosure&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDisclosureApi()
val pkiDisclosureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DisclosureGetAttachmentsV1Response = apiInstance.disclosureGetAttachmentsV1(pkiDisclosureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDisclosureApi#disclosureGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDisclosureApi#disclosureGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDisclosureID** | **kotlin.Int**|  | |

### Return type

[**DisclosureGetAttachmentsV1Response**](DisclosureGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="disclosureGetCommunicationCountV1"></a>
# **disclosureGetCommunicationCountV1**
> DisclosureGetCommunicationCountV1Response disclosureGetCommunicationCountV1(pkiDisclosureID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDisclosureApi()
val pkiDisclosureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DisclosureGetCommunicationCountV1Response = apiInstance.disclosureGetCommunicationCountV1(pkiDisclosureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDisclosureApi#disclosureGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDisclosureApi#disclosureGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDisclosureID** | **kotlin.Int**|  | |

### Return type

[**DisclosureGetCommunicationCountV1Response**](DisclosureGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="disclosureGetCommunicationListV1"></a>
# **disclosureGetCommunicationListV1**
> DisclosureGetCommunicationListV1Response disclosureGetCommunicationListV1(pkiDisclosureID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDisclosureApi()
val pkiDisclosureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DisclosureGetCommunicationListV1Response = apiInstance.disclosureGetCommunicationListV1(pkiDisclosureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDisclosureApi#disclosureGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDisclosureApi#disclosureGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDisclosureID** | **kotlin.Int**|  | |

### Return type

[**DisclosureGetCommunicationListV1Response**](DisclosureGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="disclosureGetCommunicationrecipientsV1"></a>
# **disclosureGetCommunicationrecipientsV1**
> DisclosureGetCommunicationrecipientsV1Response disclosureGetCommunicationrecipientsV1(pkiDisclosureID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDisclosureApi()
val pkiDisclosureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DisclosureGetCommunicationrecipientsV1Response = apiInstance.disclosureGetCommunicationrecipientsV1(pkiDisclosureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDisclosureApi#disclosureGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDisclosureApi#disclosureGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDisclosureID** | **kotlin.Int**|  | |

### Return type

[**DisclosureGetCommunicationrecipientsV1Response**](DisclosureGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="disclosureGetCommunicationsendersV1"></a>
# **disclosureGetCommunicationsendersV1**
> DisclosureGetCommunicationsendersV1Response disclosureGetCommunicationsendersV1(pkiDisclosureID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDisclosureApi()
val pkiDisclosureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DisclosureGetCommunicationsendersV1Response = apiInstance.disclosureGetCommunicationsendersV1(pkiDisclosureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDisclosureApi#disclosureGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDisclosureApi#disclosureGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDisclosureID** | **kotlin.Int**|  | |

### Return type

[**DisclosureGetCommunicationsendersV1Response**](DisclosureGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="disclosureGetListV1"></a>
# **disclosureGetListV1**
> DisclosureGetListV1Response disclosureGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Disclosure list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eDisclosureInteresttype | Direct&lt;br&gt;Indirect |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDisclosureApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : DisclosureGetListV1Response = apiInstance.disclosureGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDisclosureApi#disclosureGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDisclosureApi#disclosureGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiDisclosureID_ASC, pkiDisclosureID_DESC, fkiAgentID_ASC, fkiAgentID_DESC, fkiBrokerID_ASC, fkiBrokerID_DESC, eDisclosureInteresttype_ASC, eDisclosureInteresttype_DESC, sDisclosureRelation_ASC, sDisclosureRelation_DESC, dtDisclosureRedactiondate_ASC, dtDisclosureRedactiondate_DESC, dtDisclosureAcceptationdate_ASC, dtDisclosureAcceptationdate_DESC, dtDisclosureReceptiondate_ASC, dtDisclosureReceptiondate_DESC, bDisclosureIsactive_ASC, bDisclosureIsactive_DESC, sDisclosureNumber_ASC, sDisclosureNumber_DESC, sContactFirstname_ASC, sContactFirstname_DESC, sContactLastname_ASC, sContactLastname_DESC, sBrokerName_ASC, sBrokerName_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**DisclosureGetListV1Response**](DisclosureGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="disclosureImportIntoEDMV1"></a>
# **disclosureImportIntoEDMV1**
> DisclosureImportIntoEDMV1Response disclosureImportIntoEDMV1(pkiDisclosureID, disclosureImportIntoEDMV1Request)

Import attachments into the Disclosure

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDisclosureApi()
val pkiDisclosureID : kotlin.Int = 56 // kotlin.Int | 
val disclosureImportIntoEDMV1Request : DisclosureImportIntoEDMV1Request =  // DisclosureImportIntoEDMV1Request | 
try {
    val result : DisclosureImportIntoEDMV1Response = apiInstance.disclosureImportIntoEDMV1(pkiDisclosureID, disclosureImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDisclosureApi#disclosureImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDisclosureApi#disclosureImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDisclosureID** | **kotlin.Int**|  | |
| **disclosureImportIntoEDMV1Request** | [**DisclosureImportIntoEDMV1Request**](DisclosureImportIntoEDMV1Request.md)|  | |

### Return type

[**DisclosureImportIntoEDMV1Response**](DisclosureImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ObjectOtherincomeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**otherincomeBatchDownloadV1**](ObjectOtherincomeApi.md#otherincomeBatchDownloadV1) | **POST** /1/object/otherincome/{pkiOtherincomeID}/batchDownload | Download multiples attachments from a Otherincome |
| [**otherincomeGetAttachmentsV1**](ObjectOtherincomeApi.md#otherincomeGetAttachmentsV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getAttachments | Retrieve Otherincome&#39;s attachments |
| [**otherincomeGetCommunicationCountV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationCountV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationCount | Retrieve Communication count |
| [**otherincomeGetCommunicationListV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationListV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationList | Retrieve Communication list |
| [**otherincomeGetCommunicationrecipientsV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationrecipientsV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationrecipients | Retrieve Otherincome&#39;s Communicationrecipient |
| [**otherincomeGetCommunicationsendersV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationsendersV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationsenders | Retrieve Otherincome&#39;s Communicationsender |
| [**otherincomeGetListV1**](ObjectOtherincomeApi.md#otherincomeGetListV1) | **GET** /1/object/otherincome/getList | Retrieve Otherincome list |
| [**otherincomeImportIntoEDMV1**](ObjectOtherincomeApi.md#otherincomeImportIntoEDMV1) | **POST** /1/object/otherincome/{pkiOtherincomeID}/importIntoEDM | Import attachments into the Otherincome |


<a id="otherincomeBatchDownloadV1"></a>
# **otherincomeBatchDownloadV1**
> java.io.File otherincomeBatchDownloadV1(pkiOtherincomeID, otherincomeBatchDownloadV1Request)

Download multiples attachments from a Otherincome

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val pkiOtherincomeID : kotlin.Int = 56 // kotlin.Int | 
val otherincomeBatchDownloadV1Request : OtherincomeBatchDownloadV1Request =  // OtherincomeBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.otherincomeBatchDownloadV1(pkiOtherincomeID, otherincomeBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOtherincomeID** | **kotlin.Int**|  | |
| **otherincomeBatchDownloadV1Request** | [**OtherincomeBatchDownloadV1Request**](OtherincomeBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="otherincomeGetAttachmentsV1"></a>
# **otherincomeGetAttachmentsV1**
> OtherincomeGetAttachmentsV1Response otherincomeGetAttachmentsV1(pkiOtherincomeID)

Retrieve Otherincome&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val pkiOtherincomeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OtherincomeGetAttachmentsV1Response = apiInstance.otherincomeGetAttachmentsV1(pkiOtherincomeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOtherincomeID** | **kotlin.Int**|  | |

### Return type

[**OtherincomeGetAttachmentsV1Response**](OtherincomeGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="otherincomeGetCommunicationCountV1"></a>
# **otherincomeGetCommunicationCountV1**
> OtherincomeGetCommunicationCountV1Response otherincomeGetCommunicationCountV1(pkiOtherincomeID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val pkiOtherincomeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OtherincomeGetCommunicationCountV1Response = apiInstance.otherincomeGetCommunicationCountV1(pkiOtherincomeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOtherincomeID** | **kotlin.Int**|  | |

### Return type

[**OtherincomeGetCommunicationCountV1Response**](OtherincomeGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="otherincomeGetCommunicationListV1"></a>
# **otherincomeGetCommunicationListV1**
> OtherincomeGetCommunicationListV1Response otherincomeGetCommunicationListV1(pkiOtherincomeID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val pkiOtherincomeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OtherincomeGetCommunicationListV1Response = apiInstance.otherincomeGetCommunicationListV1(pkiOtherincomeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOtherincomeID** | **kotlin.Int**|  | |

### Return type

[**OtherincomeGetCommunicationListV1Response**](OtherincomeGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="otherincomeGetCommunicationrecipientsV1"></a>
# **otherincomeGetCommunicationrecipientsV1**
> OtherincomeGetCommunicationrecipientsV1Response otherincomeGetCommunicationrecipientsV1(pkiOtherincomeID)

Retrieve Otherincome&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val pkiOtherincomeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OtherincomeGetCommunicationrecipientsV1Response = apiInstance.otherincomeGetCommunicationrecipientsV1(pkiOtherincomeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOtherincomeID** | **kotlin.Int**|  | |

### Return type

[**OtherincomeGetCommunicationrecipientsV1Response**](OtherincomeGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="otherincomeGetCommunicationsendersV1"></a>
# **otherincomeGetCommunicationsendersV1**
> OtherincomeGetCommunicationsendersV1Response otherincomeGetCommunicationsendersV1(pkiOtherincomeID)

Retrieve Otherincome&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val pkiOtherincomeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OtherincomeGetCommunicationsendersV1Response = apiInstance.otherincomeGetCommunicationsendersV1(pkiOtherincomeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOtherincomeID** | **kotlin.Int**|  | |

### Return type

[**OtherincomeGetCommunicationsendersV1Response**](OtherincomeGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="otherincomeGetListV1"></a>
# **otherincomeGetListV1**
> OtherincomeGetListV1Response otherincomeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Otherincome list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eOtherincomeRemunerationtype | Dollars&lt;br&gt;DollarsTaxesIncluded |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : OtherincomeGetListV1Response = apiInstance.otherincomeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiOtherincomeID_ASC, pkiOtherincomeID_DESC, fkiOtherincometypeID_ASC, fkiOtherincometypeID_DESC, sOtherincometypeDescriptionX_ASC, sOtherincometypeDescriptionX_DESC, sOtherincomeDescription_ASC, sOtherincomeDescription_DESC, eOtherincomeRemunerationtype_ASC, eOtherincomeRemunerationtype_DESC, dOtherincomeRemunerationsubtotal_ASC, dOtherincomeRemunerationsubtotal_DESC, dOtherincomeRemunerationtaxes_ASC, dOtherincomeRemunerationtaxes_DESC, dOtherincomeRemunerationtotal_ASC, dOtherincomeRemunerationtotal_DESC, dtOtherincomePaid_ASC, dtOtherincomePaid_DESC, bOtherincomeIsactive_ASC, bOtherincomeIsactive_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**OtherincomeGetListV1Response**](OtherincomeGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="otherincomeImportIntoEDMV1"></a>
# **otherincomeImportIntoEDMV1**
> OtherincomeImportIntoEDMV1Response otherincomeImportIntoEDMV1(pkiOtherincomeID, otherincomeImportIntoEDMV1Request)

Import attachments into the Otherincome



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val pkiOtherincomeID : kotlin.Int = 56 // kotlin.Int | 
val otherincomeImportIntoEDMV1Request : OtherincomeImportIntoEDMV1Request =  // OtherincomeImportIntoEDMV1Request | 
try {
    val result : OtherincomeImportIntoEDMV1Response = apiInstance.otherincomeImportIntoEDMV1(pkiOtherincomeID, otherincomeImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOtherincomeID** | **kotlin.Int**|  | |
| **otherincomeImportIntoEDMV1Request** | [**OtherincomeImportIntoEDMV1Request**](OtherincomeImportIntoEDMV1Request.md)|  | |

### Return type

[**OtherincomeImportIntoEDMV1Response**](OtherincomeImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


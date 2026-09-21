# ObjectInvoiceApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**invoiceBatchDownloadV1**](ObjectInvoiceApi.md#invoiceBatchDownloadV1) | **POST** /1/object/invoice/{pkiInvoiceID}/batchDownload | Download multiples attachments from an Invoice |
| [**invoiceGetAttachmentsV1**](ObjectInvoiceApi.md#invoiceGetAttachmentsV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getAttachments | Retrieve Invoice&#39;s Attachments |
| [**invoiceGetCommunicationCountV1**](ObjectInvoiceApi.md#invoiceGetCommunicationCountV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationCount | Retrieve Communication count |
| [**invoiceGetCommunicationListV1**](ObjectInvoiceApi.md#invoiceGetCommunicationListV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationList | Retrieve Communication list |
| [**invoiceGetCommunicationrecipientsV1**](ObjectInvoiceApi.md#invoiceGetCommunicationrecipientsV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationrecipients | Retrieve Invoice&#39;s Communicationrecipient |
| [**invoiceGetCommunicationsendersV1**](ObjectInvoiceApi.md#invoiceGetCommunicationsendersV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationsenders | Retrieve Invoice&#39;s Communicationsender |
| [**invoiceGetListV1**](ObjectInvoiceApi.md#invoiceGetListV1) | **GET** /1/object/invoice/getList | Retrieve Invoice list |
| [**invoiceImportIntoEDMV1**](ObjectInvoiceApi.md#invoiceImportIntoEDMV1) | **POST** /1/object/invoice/{pkiInvoiceID}/importIntoEDM | Import attachments into the Invoice |


<a id="invoiceBatchDownloadV1"></a>
# **invoiceBatchDownloadV1**
> java.io.File invoiceBatchDownloadV1(pkiInvoiceID, invoiceBatchDownloadV1Request)

Download multiples attachments from an Invoice

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInvoiceApi()
val pkiInvoiceID : kotlin.Int = 56 // kotlin.Int | 
val invoiceBatchDownloadV1Request : InvoiceBatchDownloadV1Request =  // InvoiceBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.invoiceBatchDownloadV1(pkiInvoiceID, invoiceBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInvoiceApi#invoiceBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInvoiceApi#invoiceBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInvoiceID** | **kotlin.Int**|  | |
| **invoiceBatchDownloadV1Request** | [**InvoiceBatchDownloadV1Request**](InvoiceBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="invoiceGetAttachmentsV1"></a>
# **invoiceGetAttachmentsV1**
> InvoiceGetAttachmentsV1Response invoiceGetAttachmentsV1(pkiInvoiceID)

Retrieve Invoice&#39;s Attachments



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInvoiceApi()
val pkiInvoiceID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InvoiceGetAttachmentsV1Response = apiInstance.invoiceGetAttachmentsV1(pkiInvoiceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInvoiceApi#invoiceGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInvoiceApi#invoiceGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInvoiceID** | **kotlin.Int**|  | |

### Return type

[**InvoiceGetAttachmentsV1Response**](InvoiceGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="invoiceGetCommunicationCountV1"></a>
# **invoiceGetCommunicationCountV1**
> InvoiceGetCommunicationCountV1Response invoiceGetCommunicationCountV1(pkiInvoiceID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInvoiceApi()
val pkiInvoiceID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InvoiceGetCommunicationCountV1Response = apiInstance.invoiceGetCommunicationCountV1(pkiInvoiceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInvoiceApi#invoiceGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInvoiceApi#invoiceGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInvoiceID** | **kotlin.Int**|  | |

### Return type

[**InvoiceGetCommunicationCountV1Response**](InvoiceGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="invoiceGetCommunicationListV1"></a>
# **invoiceGetCommunicationListV1**
> InvoiceGetCommunicationListV1Response invoiceGetCommunicationListV1(pkiInvoiceID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInvoiceApi()
val pkiInvoiceID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InvoiceGetCommunicationListV1Response = apiInstance.invoiceGetCommunicationListV1(pkiInvoiceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInvoiceApi#invoiceGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInvoiceApi#invoiceGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInvoiceID** | **kotlin.Int**|  | |

### Return type

[**InvoiceGetCommunicationListV1Response**](InvoiceGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="invoiceGetCommunicationrecipientsV1"></a>
# **invoiceGetCommunicationrecipientsV1**
> InvoiceGetCommunicationrecipientsV1Response invoiceGetCommunicationrecipientsV1(pkiInvoiceID)

Retrieve Invoice&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInvoiceApi()
val pkiInvoiceID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InvoiceGetCommunicationrecipientsV1Response = apiInstance.invoiceGetCommunicationrecipientsV1(pkiInvoiceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInvoiceApi#invoiceGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInvoiceApi#invoiceGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInvoiceID** | **kotlin.Int**|  | |

### Return type

[**InvoiceGetCommunicationrecipientsV1Response**](InvoiceGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="invoiceGetCommunicationsendersV1"></a>
# **invoiceGetCommunicationsendersV1**
> InvoiceGetCommunicationsendersV1Response invoiceGetCommunicationsendersV1(pkiInvoiceID)

Retrieve Invoice&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInvoiceApi()
val pkiInvoiceID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InvoiceGetCommunicationsendersV1Response = apiInstance.invoiceGetCommunicationsendersV1(pkiInvoiceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInvoiceApi#invoiceGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInvoiceApi#invoiceGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInvoiceID** | **kotlin.Int**|  | |

### Return type

[**InvoiceGetCommunicationsendersV1Response**](InvoiceGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="invoiceGetListV1"></a>
# **invoiceGetListV1**
> InvoiceGetListV1Response invoiceGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Invoice list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eInvoiceType | Commission&lt;br&gt;CommissionAdvance&lt;br&gt;Financed&lt;br&gt;Manual&lt;br&gt;Monthly |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInvoiceApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : InvoiceGetListV1Response = apiInstance.invoiceGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInvoiceApi#invoiceGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInvoiceApi#invoiceGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiInvoiceID_ASC, pkiInvoiceID_DESC, fkiAgentID_ASC, fkiAgentID_DESC, fkiBrokerID_ASC, fkiBrokerID_DESC, fkiCustomerID_ASC, fkiCustomerID_DESC, fkiPeriodID_ASC, fkiPeriodID_DESC, sPeriodYYYYMM_ASC, sPeriodYYYYMM_DESC, bInvoiceIspaid_ASC, bInvoiceIspaid_DESC, dInvoiceTotal_ASC, dInvoiceTotal_DESC, dInvoicePaid_ASC, dInvoicePaid_DESC, dInvoiceBalance_ASC, dInvoiceBalance_DESC, dtInvoiceDate_ASC, dtInvoiceDate_DESC, eInvoiceType_ASC, eInvoiceType_DESC, sInvoiceNumber_ASC, sInvoiceNumber_DESC, sInvoiceRecipient_ASC, sInvoiceRecipient_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**InvoiceGetListV1Response**](InvoiceGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="invoiceImportIntoEDMV1"></a>
# **invoiceImportIntoEDMV1**
> InvoiceImportIntoEDMV1Response invoiceImportIntoEDMV1(pkiInvoiceID, invoiceImportIntoEDMV1Request)

Import attachments into the Invoice



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInvoiceApi()
val pkiInvoiceID : kotlin.Int = 56 // kotlin.Int | 
val invoiceImportIntoEDMV1Request : InvoiceImportIntoEDMV1Request =  // InvoiceImportIntoEDMV1Request | 
try {
    val result : InvoiceImportIntoEDMV1Response = apiInstance.invoiceImportIntoEDMV1(pkiInvoiceID, invoiceImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInvoiceApi#invoiceImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInvoiceApi#invoiceImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInvoiceID** | **kotlin.Int**|  | |
| **invoiceImportIntoEDMV1Request** | [**InvoiceImportIntoEDMV1Request**](InvoiceImportIntoEDMV1Request.md)|  | |

### Return type

[**InvoiceImportIntoEDMV1Response**](InvoiceImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


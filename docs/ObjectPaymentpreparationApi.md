# ObjectPaymentpreparationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**paymentpreparationBatchDownloadV1**](ObjectPaymentpreparationApi.md#paymentpreparationBatchDownloadV1) | **POST** /1/object/paymentpreparation/{pkiPaymentpreparationID}/batchDownload | Download multiples attachments from an Paymentpreparation |
| [**paymentpreparationGetAttachmentsV1**](ObjectPaymentpreparationApi.md#paymentpreparationGetAttachmentsV1) | **GET** /1/object/paymentpreparation/{pkiPaymentpreparationID}/getAttachments | Retrieve Paymentpreparation&#39;s attachments |
| [**paymentpreparationGetCommunicationCountV1**](ObjectPaymentpreparationApi.md#paymentpreparationGetCommunicationCountV1) | **GET** /1/object/paymentpreparation/{pkiPaymentpreparationID}/getCommunicationCount | Retrieve Communication count |
| [**paymentpreparationGetCommunicationListV1**](ObjectPaymentpreparationApi.md#paymentpreparationGetCommunicationListV1) | **GET** /1/object/paymentpreparation/{pkiPaymentpreparationID}/getCommunicationList | Retrieve Communication list |
| [**paymentpreparationGetCommunicationrecipientsV1**](ObjectPaymentpreparationApi.md#paymentpreparationGetCommunicationrecipientsV1) | **GET** /1/object/paymentpreparation/{pkiPaymentpreparationID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**paymentpreparationGetCommunicationsendersV1**](ObjectPaymentpreparationApi.md#paymentpreparationGetCommunicationsendersV1) | **GET** /1/object/paymentpreparation/{pkiPaymentpreparationID}/getCommunicationsenders | Retrieve Communication senders |
| [**paymentpreparationImportIntoEDMV1**](ObjectPaymentpreparationApi.md#paymentpreparationImportIntoEDMV1) | **POST** /1/object/paymentpreparation/{pkiPaymentpreparationID}/importIntoEDM | Import attachments into the Paymentpreparation |


<a id="paymentpreparationBatchDownloadV1"></a>
# **paymentpreparationBatchDownloadV1**
> java.io.File paymentpreparationBatchDownloadV1(pkiPaymentpreparationID, paymentpreparationBatchDownloadV1Request)

Download multiples attachments from an Paymentpreparation

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentpreparationApi()
val pkiPaymentpreparationID : kotlin.Int = 56 // kotlin.Int | 
val paymentpreparationBatchDownloadV1Request : PaymentpreparationBatchDownloadV1Request =  // PaymentpreparationBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.paymentpreparationBatchDownloadV1(pkiPaymentpreparationID, paymentpreparationBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentpreparationApi#paymentpreparationBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentpreparationApi#paymentpreparationBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPaymentpreparationID** | **kotlin.Int**|  | |
| **paymentpreparationBatchDownloadV1Request** | [**PaymentpreparationBatchDownloadV1Request**](PaymentpreparationBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="paymentpreparationGetAttachmentsV1"></a>
# **paymentpreparationGetAttachmentsV1**
> PaymentpreparationGetAttachmentsV1Response paymentpreparationGetAttachmentsV1(pkiPaymentpreparationID)

Retrieve Paymentpreparation&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentpreparationApi()
val pkiPaymentpreparationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaymentpreparationGetAttachmentsV1Response = apiInstance.paymentpreparationGetAttachmentsV1(pkiPaymentpreparationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentpreparationApi#paymentpreparationGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentpreparationApi#paymentpreparationGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPaymentpreparationID** | **kotlin.Int**|  | |

### Return type

[**PaymentpreparationGetAttachmentsV1Response**](PaymentpreparationGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="paymentpreparationGetCommunicationCountV1"></a>
# **paymentpreparationGetCommunicationCountV1**
> PaymentpreparationGetCommunicationCountV1Response paymentpreparationGetCommunicationCountV1(pkiPaymentpreparationID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentpreparationApi()
val pkiPaymentpreparationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaymentpreparationGetCommunicationCountV1Response = apiInstance.paymentpreparationGetCommunicationCountV1(pkiPaymentpreparationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentpreparationApi#paymentpreparationGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentpreparationApi#paymentpreparationGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPaymentpreparationID** | **kotlin.Int**|  | |

### Return type

[**PaymentpreparationGetCommunicationCountV1Response**](PaymentpreparationGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="paymentpreparationGetCommunicationListV1"></a>
# **paymentpreparationGetCommunicationListV1**
> PaymentpreparationGetCommunicationListV1Response paymentpreparationGetCommunicationListV1(pkiPaymentpreparationID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentpreparationApi()
val pkiPaymentpreparationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaymentpreparationGetCommunicationListV1Response = apiInstance.paymentpreparationGetCommunicationListV1(pkiPaymentpreparationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentpreparationApi#paymentpreparationGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentpreparationApi#paymentpreparationGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPaymentpreparationID** | **kotlin.Int**|  | |

### Return type

[**PaymentpreparationGetCommunicationListV1Response**](PaymentpreparationGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="paymentpreparationGetCommunicationrecipientsV1"></a>
# **paymentpreparationGetCommunicationrecipientsV1**
> PaymentpreparationGetCommunicationrecipientsV1Response paymentpreparationGetCommunicationrecipientsV1(pkiPaymentpreparationID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentpreparationApi()
val pkiPaymentpreparationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaymentpreparationGetCommunicationrecipientsV1Response = apiInstance.paymentpreparationGetCommunicationrecipientsV1(pkiPaymentpreparationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentpreparationApi#paymentpreparationGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentpreparationApi#paymentpreparationGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPaymentpreparationID** | **kotlin.Int**|  | |

### Return type

[**PaymentpreparationGetCommunicationrecipientsV1Response**](PaymentpreparationGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="paymentpreparationGetCommunicationsendersV1"></a>
# **paymentpreparationGetCommunicationsendersV1**
> PaymentpreparationGetCommunicationsendersV1Response paymentpreparationGetCommunicationsendersV1(pkiPaymentpreparationID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentpreparationApi()
val pkiPaymentpreparationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaymentpreparationGetCommunicationsendersV1Response = apiInstance.paymentpreparationGetCommunicationsendersV1(pkiPaymentpreparationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentpreparationApi#paymentpreparationGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentpreparationApi#paymentpreparationGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPaymentpreparationID** | **kotlin.Int**|  | |

### Return type

[**PaymentpreparationGetCommunicationsendersV1Response**](PaymentpreparationGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="paymentpreparationImportIntoEDMV1"></a>
# **paymentpreparationImportIntoEDMV1**
> PaymentpreparationImportIntoEDMV1Response paymentpreparationImportIntoEDMV1(pkiPaymentpreparationID, paymentpreparationImportIntoEDMV1Request)

Import attachments into the Paymentpreparation

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentpreparationApi()
val pkiPaymentpreparationID : kotlin.Int = 56 // kotlin.Int | 
val paymentpreparationImportIntoEDMV1Request : PaymentpreparationImportIntoEDMV1Request =  // PaymentpreparationImportIntoEDMV1Request | 
try {
    val result : PaymentpreparationImportIntoEDMV1Response = apiInstance.paymentpreparationImportIntoEDMV1(pkiPaymentpreparationID, paymentpreparationImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentpreparationApi#paymentpreparationImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentpreparationApi#paymentpreparationImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPaymentpreparationID** | **kotlin.Int**|  | |
| **paymentpreparationImportIntoEDMV1Request** | [**PaymentpreparationImportIntoEDMV1Request**](PaymentpreparationImportIntoEDMV1Request.md)|  | |

### Return type

[**PaymentpreparationImportIntoEDMV1Response**](PaymentpreparationImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


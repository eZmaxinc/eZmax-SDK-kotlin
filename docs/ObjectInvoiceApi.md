# ObjectInvoiceApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**invoiceGetAttachmentsV1**](ObjectInvoiceApi.md#invoiceGetAttachmentsV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getAttachments | Retrieve Invoice&#39;s Attachments |
| [**invoiceGetCommunicationCountV1**](ObjectInvoiceApi.md#invoiceGetCommunicationCountV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationCount | Retrieve Communication count |
| [**invoiceGetCommunicationListV1**](ObjectInvoiceApi.md#invoiceGetCommunicationListV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationList | Retrieve Communication list |
| [**invoiceGetCommunicationrecipientsV1**](ObjectInvoiceApi.md#invoiceGetCommunicationrecipientsV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationrecipients | Retrieve Invoice&#39;s Communicationrecipient |
| [**invoiceGetCommunicationsendersV1**](ObjectInvoiceApi.md#invoiceGetCommunicationsendersV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationsenders | Retrieve Invoice&#39;s Communicationsender |


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


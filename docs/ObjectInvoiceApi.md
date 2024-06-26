# ObjectInvoiceApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoiceGetAttachmentsV1**](ObjectInvoiceApi.md#invoiceGetAttachmentsV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getAttachments | Retrieve Invoice&#39;s Attachments
[**invoiceGetCommunicationListV1**](ObjectInvoiceApi.md#invoiceGetCommunicationListV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationList | Retrieve Communication list


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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInvoiceID** | **kotlin.Int**|  |

### Return type

[**InvoiceGetAttachmentsV1Response**](InvoiceGetAttachmentsV1Response.md)

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiInvoiceID** | **kotlin.Int**|  |

### Return type

[**InvoiceGetCommunicationListV1Response**](InvoiceGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


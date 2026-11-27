# ObjectExternalbrokerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**externalbrokerBatchDownloadV1**](ObjectExternalbrokerApi.md#externalbrokerBatchDownloadV1) | **POST** /1/object/externalbroker/{pkiExternalbrokerID}/batchDownload | Download multiples attachments from an Externalbroker |
| [**externalbrokerGetAttachmentsV1**](ObjectExternalbrokerApi.md#externalbrokerGetAttachmentsV1) | **GET** /1/object/externalbroker/{pkiExternalbrokerID}/getAttachments | Retrieve Externalbroker&#39;s attachments |
| [**externalbrokerGetCommunicationCountV1**](ObjectExternalbrokerApi.md#externalbrokerGetCommunicationCountV1) | **GET** /1/object/externalbroker/{pkiExternalbrokerID}/getCommunicationCount | Retrieve Communication count |
| [**externalbrokerGetCommunicationListV1**](ObjectExternalbrokerApi.md#externalbrokerGetCommunicationListV1) | **GET** /1/object/externalbroker/{pkiExternalbrokerID}/getCommunicationList | Retrieve Communication list |
| [**externalbrokerGetCommunicationrecipientsV1**](ObjectExternalbrokerApi.md#externalbrokerGetCommunicationrecipientsV1) | **GET** /1/object/externalbroker/{pkiExternalbrokerID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**externalbrokerGetCommunicationsendersV1**](ObjectExternalbrokerApi.md#externalbrokerGetCommunicationsendersV1) | **GET** /1/object/externalbroker/{pkiExternalbrokerID}/getCommunicationsenders | Retrieve Communication senders |
| [**externalbrokerImportIntoEDMV1**](ObjectExternalbrokerApi.md#externalbrokerImportIntoEDMV1) | **POST** /1/object/externalbroker/{pkiExternalbrokerID}/importIntoEDM | Import attachments into the Externalbroker |


<a id="externalbrokerBatchDownloadV1"></a>
# **externalbrokerBatchDownloadV1**
> java.io.File externalbrokerBatchDownloadV1(pkiExternalbrokerID, externalbrokerBatchDownloadV1Request)

Download multiples attachments from an Externalbroker

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectExternalbrokerApi()
val pkiExternalbrokerID : kotlin.Int = 56 // kotlin.Int | 
val externalbrokerBatchDownloadV1Request : ExternalbrokerBatchDownloadV1Request =  // ExternalbrokerBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.externalbrokerBatchDownloadV1(pkiExternalbrokerID, externalbrokerBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectExternalbrokerApi#externalbrokerBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectExternalbrokerApi#externalbrokerBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiExternalbrokerID** | **kotlin.Int**|  | |
| **externalbrokerBatchDownloadV1Request** | [**ExternalbrokerBatchDownloadV1Request**](ExternalbrokerBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="externalbrokerGetAttachmentsV1"></a>
# **externalbrokerGetAttachmentsV1**
> ExternalbrokerGetAttachmentsV1Response externalbrokerGetAttachmentsV1(pkiExternalbrokerID)

Retrieve Externalbroker&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectExternalbrokerApi()
val pkiExternalbrokerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ExternalbrokerGetAttachmentsV1Response = apiInstance.externalbrokerGetAttachmentsV1(pkiExternalbrokerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectExternalbrokerApi#externalbrokerGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectExternalbrokerApi#externalbrokerGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiExternalbrokerID** | **kotlin.Int**|  | |

### Return type

[**ExternalbrokerGetAttachmentsV1Response**](ExternalbrokerGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="externalbrokerGetCommunicationCountV1"></a>
# **externalbrokerGetCommunicationCountV1**
> ExternalbrokerGetCommunicationCountV1Response externalbrokerGetCommunicationCountV1(pkiExternalbrokerID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectExternalbrokerApi()
val pkiExternalbrokerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ExternalbrokerGetCommunicationCountV1Response = apiInstance.externalbrokerGetCommunicationCountV1(pkiExternalbrokerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectExternalbrokerApi#externalbrokerGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectExternalbrokerApi#externalbrokerGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiExternalbrokerID** | **kotlin.Int**|  | |

### Return type

[**ExternalbrokerGetCommunicationCountV1Response**](ExternalbrokerGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="externalbrokerGetCommunicationListV1"></a>
# **externalbrokerGetCommunicationListV1**
> ExternalbrokerGetCommunicationListV1Response externalbrokerGetCommunicationListV1(pkiExternalbrokerID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectExternalbrokerApi()
val pkiExternalbrokerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ExternalbrokerGetCommunicationListV1Response = apiInstance.externalbrokerGetCommunicationListV1(pkiExternalbrokerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectExternalbrokerApi#externalbrokerGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectExternalbrokerApi#externalbrokerGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiExternalbrokerID** | **kotlin.Int**|  | |

### Return type

[**ExternalbrokerGetCommunicationListV1Response**](ExternalbrokerGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="externalbrokerGetCommunicationrecipientsV1"></a>
# **externalbrokerGetCommunicationrecipientsV1**
> ExternalbrokerGetCommunicationrecipientsV1Response externalbrokerGetCommunicationrecipientsV1(pkiExternalbrokerID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectExternalbrokerApi()
val pkiExternalbrokerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ExternalbrokerGetCommunicationrecipientsV1Response = apiInstance.externalbrokerGetCommunicationrecipientsV1(pkiExternalbrokerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectExternalbrokerApi#externalbrokerGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectExternalbrokerApi#externalbrokerGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiExternalbrokerID** | **kotlin.Int**|  | |

### Return type

[**ExternalbrokerGetCommunicationrecipientsV1Response**](ExternalbrokerGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="externalbrokerGetCommunicationsendersV1"></a>
# **externalbrokerGetCommunicationsendersV1**
> ExternalbrokerGetCommunicationsendersV1Response externalbrokerGetCommunicationsendersV1(pkiExternalbrokerID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectExternalbrokerApi()
val pkiExternalbrokerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ExternalbrokerGetCommunicationsendersV1Response = apiInstance.externalbrokerGetCommunicationsendersV1(pkiExternalbrokerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectExternalbrokerApi#externalbrokerGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectExternalbrokerApi#externalbrokerGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiExternalbrokerID** | **kotlin.Int**|  | |

### Return type

[**ExternalbrokerGetCommunicationsendersV1Response**](ExternalbrokerGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="externalbrokerImportIntoEDMV1"></a>
# **externalbrokerImportIntoEDMV1**
> ExternalbrokerImportIntoEDMV1Response externalbrokerImportIntoEDMV1(pkiExternalbrokerID, externalbrokerImportIntoEDMV1Request)

Import attachments into the Externalbroker



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectExternalbrokerApi()
val pkiExternalbrokerID : kotlin.Int = 56 // kotlin.Int | 
val externalbrokerImportIntoEDMV1Request : ExternalbrokerImportIntoEDMV1Request =  // ExternalbrokerImportIntoEDMV1Request | 
try {
    val result : ExternalbrokerImportIntoEDMV1Response = apiInstance.externalbrokerImportIntoEDMV1(pkiExternalbrokerID, externalbrokerImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectExternalbrokerApi#externalbrokerImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectExternalbrokerApi#externalbrokerImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiExternalbrokerID** | **kotlin.Int**|  | |
| **externalbrokerImportIntoEDMV1Request** | [**ExternalbrokerImportIntoEDMV1Request**](ExternalbrokerImportIntoEDMV1Request.md)|  | |

### Return type

[**ExternalbrokerImportIntoEDMV1Response**](ExternalbrokerImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


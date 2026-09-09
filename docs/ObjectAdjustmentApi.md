# ObjectAdjustmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adjustmentBatchDownloadV1**](ObjectAdjustmentApi.md#adjustmentBatchDownloadV1) | **POST** /1/object/adjustment/{pkiAdjustmentID}/batchDownload | Download multiples attachments from an Adjustment |
| [**adjustmentGetAttachmentsV1**](ObjectAdjustmentApi.md#adjustmentGetAttachmentsV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getAttachments | Retrieve Adjustment&#39;s attachments |
| [**adjustmentGetCommunicationCountV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationCountV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationCount | Retrieve Communication count |
| [**adjustmentGetCommunicationListV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationListV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationList | Retrieve Communication list |
| [**adjustmentGetCommunicationrecipientsV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationrecipientsV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**adjustmentGetCommunicationsendersV1**](ObjectAdjustmentApi.md#adjustmentGetCommunicationsendersV1) | **GET** /1/object/adjustment/{pkiAdjustmentID}/getCommunicationsenders | Retrieve Communication senders |
| [**adjustmentImportIntoEDMV1**](ObjectAdjustmentApi.md#adjustmentImportIntoEDMV1) | **POST** /1/object/adjustment/{pkiAdjustmentID}/importIntoEDM | Import attachments into the Adjustment |


<a id="adjustmentBatchDownloadV1"></a>
# **adjustmentBatchDownloadV1**
> java.io.File adjustmentBatchDownloadV1(pkiAdjustmentID, adjustmentBatchDownloadV1Request)

Download multiples attachments from an Adjustment

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAdjustmentApi()
val pkiAdjustmentID : kotlin.Int = 56 // kotlin.Int | 
val adjustmentBatchDownloadV1Request : AdjustmentBatchDownloadV1Request =  // AdjustmentBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.adjustmentBatchDownloadV1(pkiAdjustmentID, adjustmentBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAdjustmentApi#adjustmentBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAdjustmentApi#adjustmentBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAdjustmentID** | **kotlin.Int**|  | |
| **adjustmentBatchDownloadV1Request** | [**AdjustmentBatchDownloadV1Request**](AdjustmentBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="adjustmentGetAttachmentsV1"></a>
# **adjustmentGetAttachmentsV1**
> AdjustmentGetAttachmentsV1Response adjustmentGetAttachmentsV1(pkiAdjustmentID)

Retrieve Adjustment&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAdjustmentApi()
val pkiAdjustmentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AdjustmentGetAttachmentsV1Response = apiInstance.adjustmentGetAttachmentsV1(pkiAdjustmentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAdjustmentApi#adjustmentGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAdjustmentApi#adjustmentGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAdjustmentID** | **kotlin.Int**|  | |

### Return type

[**AdjustmentGetAttachmentsV1Response**](AdjustmentGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adjustmentGetCommunicationCountV1"></a>
# **adjustmentGetCommunicationCountV1**
> AdjustmentGetCommunicationCountV1Response adjustmentGetCommunicationCountV1(pkiAdjustmentID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAdjustmentApi()
val pkiAdjustmentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AdjustmentGetCommunicationCountV1Response = apiInstance.adjustmentGetCommunicationCountV1(pkiAdjustmentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAdjustmentApi#adjustmentGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAdjustmentApi#adjustmentGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAdjustmentID** | **kotlin.Int**|  | |

### Return type

[**AdjustmentGetCommunicationCountV1Response**](AdjustmentGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adjustmentGetCommunicationListV1"></a>
# **adjustmentGetCommunicationListV1**
> AdjustmentGetCommunicationListV1Response adjustmentGetCommunicationListV1(pkiAdjustmentID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAdjustmentApi()
val pkiAdjustmentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AdjustmentGetCommunicationListV1Response = apiInstance.adjustmentGetCommunicationListV1(pkiAdjustmentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAdjustmentApi#adjustmentGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAdjustmentApi#adjustmentGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAdjustmentID** | **kotlin.Int**|  | |

### Return type

[**AdjustmentGetCommunicationListV1Response**](AdjustmentGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adjustmentGetCommunicationrecipientsV1"></a>
# **adjustmentGetCommunicationrecipientsV1**
> AdjustmentGetCommunicationrecipientsV1Response adjustmentGetCommunicationrecipientsV1(pkiAdjustmentID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAdjustmentApi()
val pkiAdjustmentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AdjustmentGetCommunicationrecipientsV1Response = apiInstance.adjustmentGetCommunicationrecipientsV1(pkiAdjustmentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAdjustmentApi#adjustmentGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAdjustmentApi#adjustmentGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAdjustmentID** | **kotlin.Int**|  | |

### Return type

[**AdjustmentGetCommunicationrecipientsV1Response**](AdjustmentGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adjustmentGetCommunicationsendersV1"></a>
# **adjustmentGetCommunicationsendersV1**
> AdjustmentGetCommunicationsendersV1Response adjustmentGetCommunicationsendersV1(pkiAdjustmentID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAdjustmentApi()
val pkiAdjustmentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AdjustmentGetCommunicationsendersV1Response = apiInstance.adjustmentGetCommunicationsendersV1(pkiAdjustmentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAdjustmentApi#adjustmentGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAdjustmentApi#adjustmentGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAdjustmentID** | **kotlin.Int**|  | |

### Return type

[**AdjustmentGetCommunicationsendersV1Response**](AdjustmentGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adjustmentImportIntoEDMV1"></a>
# **adjustmentImportIntoEDMV1**
> AdjustmentImportIntoEDMV1Response adjustmentImportIntoEDMV1(pkiAdjustmentID, adjustmentImportIntoEDMV1Request)

Import attachments into the Adjustment

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAdjustmentApi()
val pkiAdjustmentID : kotlin.Int = 56 // kotlin.Int | 
val adjustmentImportIntoEDMV1Request : AdjustmentImportIntoEDMV1Request =  // AdjustmentImportIntoEDMV1Request | 
try {
    val result : AdjustmentImportIntoEDMV1Response = apiInstance.adjustmentImportIntoEDMV1(pkiAdjustmentID, adjustmentImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAdjustmentApi#adjustmentImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAdjustmentApi#adjustmentImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAdjustmentID** | **kotlin.Int**|  | |
| **adjustmentImportIntoEDMV1Request** | [**AdjustmentImportIntoEDMV1Request**](AdjustmentImportIntoEDMV1Request.md)|  | |

### Return type

[**AdjustmentImportIntoEDMV1Response**](AdjustmentImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


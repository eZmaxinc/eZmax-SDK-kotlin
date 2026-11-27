# ObjectCommissionadvanceApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**commissionadvanceBatchDownloadV1**](ObjectCommissionadvanceApi.md#commissionadvanceBatchDownloadV1) | **POST** /1/object/commissionadvance/{pkiCommissionadvanceID}/batchDownload | Download multiples attachments from a Commission advance |
| [**commissionadvanceGetAttachmentsV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetAttachmentsV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getAttachments | Retrieve Commissionadvance&#39;s attachments |
| [**commissionadvanceGetCommunicationCountV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationCountV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationCount | Retrieve Communication count |
| [**commissionadvanceGetCommunicationListV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationListV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationList | Retrieve Communication list |
| [**commissionadvanceGetCommunicationrecipientsV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationrecipientsV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**commissionadvanceGetCommunicationsendersV1**](ObjectCommissionadvanceApi.md#commissionadvanceGetCommunicationsendersV1) | **GET** /1/object/commissionadvance/{pkiCommissionadvanceID}/getCommunicationsenders | Retrieve Communication senders |
| [**commissionadvanceImportIntoEDMV1**](ObjectCommissionadvanceApi.md#commissionadvanceImportIntoEDMV1) | **POST** /1/object/commissionadvance/{pkiCommissionadvanceID}/importIntoEDM | Import attachments into the Commissionadvance |


<a id="commissionadvanceBatchDownloadV1"></a>
# **commissionadvanceBatchDownloadV1**
> java.io.File commissionadvanceBatchDownloadV1(pkiCommissionadvanceID, commissionadvanceBatchDownloadV1Request)

Download multiples attachments from a Commission advance

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommissionadvanceApi()
val pkiCommissionadvanceID : kotlin.Int = 56 // kotlin.Int | 
val commissionadvanceBatchDownloadV1Request : CommissionadvanceBatchDownloadV1Request =  // CommissionadvanceBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.commissionadvanceBatchDownloadV1(pkiCommissionadvanceID, commissionadvanceBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommissionadvanceApi#commissionadvanceBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommissionadvanceApi#commissionadvanceBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommissionadvanceID** | **kotlin.Int**|  | |
| **commissionadvanceBatchDownloadV1Request** | [**CommissionadvanceBatchDownloadV1Request**](CommissionadvanceBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="commissionadvanceGetAttachmentsV1"></a>
# **commissionadvanceGetAttachmentsV1**
> CommissionadvanceGetAttachmentsV1Response commissionadvanceGetAttachmentsV1(pkiCommissionadvanceID)

Retrieve Commissionadvance&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommissionadvanceApi()
val pkiCommissionadvanceID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommissionadvanceGetAttachmentsV1Response = apiInstance.commissionadvanceGetAttachmentsV1(pkiCommissionadvanceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommissionadvanceApi#commissionadvanceGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommissionadvanceApi#commissionadvanceGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommissionadvanceID** | **kotlin.Int**|  | |

### Return type

[**CommissionadvanceGetAttachmentsV1Response**](CommissionadvanceGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="commissionadvanceGetCommunicationCountV1"></a>
# **commissionadvanceGetCommunicationCountV1**
> CommissionadvanceGetCommunicationCountV1Response commissionadvanceGetCommunicationCountV1(pkiCommissionadvanceID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommissionadvanceApi()
val pkiCommissionadvanceID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommissionadvanceGetCommunicationCountV1Response = apiInstance.commissionadvanceGetCommunicationCountV1(pkiCommissionadvanceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommissionadvanceID** | **kotlin.Int**|  | |

### Return type

[**CommissionadvanceGetCommunicationCountV1Response**](CommissionadvanceGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="commissionadvanceGetCommunicationListV1"></a>
# **commissionadvanceGetCommunicationListV1**
> CommissionadvanceGetCommunicationListV1Response commissionadvanceGetCommunicationListV1(pkiCommissionadvanceID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommissionadvanceApi()
val pkiCommissionadvanceID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommissionadvanceGetCommunicationListV1Response = apiInstance.commissionadvanceGetCommunicationListV1(pkiCommissionadvanceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommissionadvanceID** | **kotlin.Int**|  | |

### Return type

[**CommissionadvanceGetCommunicationListV1Response**](CommissionadvanceGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="commissionadvanceGetCommunicationrecipientsV1"></a>
# **commissionadvanceGetCommunicationrecipientsV1**
> CommissionadvanceGetCommunicationrecipientsV1Response commissionadvanceGetCommunicationrecipientsV1(pkiCommissionadvanceID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommissionadvanceApi()
val pkiCommissionadvanceID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommissionadvanceGetCommunicationrecipientsV1Response = apiInstance.commissionadvanceGetCommunicationrecipientsV1(pkiCommissionadvanceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommissionadvanceID** | **kotlin.Int**|  | |

### Return type

[**CommissionadvanceGetCommunicationrecipientsV1Response**](CommissionadvanceGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="commissionadvanceGetCommunicationsendersV1"></a>
# **commissionadvanceGetCommunicationsendersV1**
> CommissionadvanceGetCommunicationsendersV1Response commissionadvanceGetCommunicationsendersV1(pkiCommissionadvanceID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommissionadvanceApi()
val pkiCommissionadvanceID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommissionadvanceGetCommunicationsendersV1Response = apiInstance.commissionadvanceGetCommunicationsendersV1(pkiCommissionadvanceID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommissionadvanceApi#commissionadvanceGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommissionadvanceID** | **kotlin.Int**|  | |

### Return type

[**CommissionadvanceGetCommunicationsendersV1Response**](CommissionadvanceGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="commissionadvanceImportIntoEDMV1"></a>
# **commissionadvanceImportIntoEDMV1**
> CommissionadvanceImportIntoEDMV1Response commissionadvanceImportIntoEDMV1(pkiCommissionadvanceID, commissionadvanceImportIntoEDMV1Request)

Import attachments into the Commissionadvance

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommissionadvanceApi()
val pkiCommissionadvanceID : kotlin.Int = 56 // kotlin.Int | 
val commissionadvanceImportIntoEDMV1Request : CommissionadvanceImportIntoEDMV1Request =  // CommissionadvanceImportIntoEDMV1Request | 
try {
    val result : CommissionadvanceImportIntoEDMV1Response = apiInstance.commissionadvanceImportIntoEDMV1(pkiCommissionadvanceID, commissionadvanceImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommissionadvanceApi#commissionadvanceImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommissionadvanceApi#commissionadvanceImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommissionadvanceID** | **kotlin.Int**|  | |
| **commissionadvanceImportIntoEDMV1Request** | [**CommissionadvanceImportIntoEDMV1Request**](CommissionadvanceImportIntoEDMV1Request.md)|  | |

### Return type

[**CommissionadvanceImportIntoEDMV1Response**](CommissionadvanceImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


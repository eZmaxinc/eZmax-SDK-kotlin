# ObjectPurchaseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**purchaseBatchDownloadV1**](ObjectPurchaseApi.md#purchaseBatchDownloadV1) | **POST** /1/object/purchase/{pkiPurchaseID}/batchDownload | Download multiples attachments from a Purchase |
| [**purchaseGetAttachmentsV1**](ObjectPurchaseApi.md#purchaseGetAttachmentsV1) | **GET** /1/object/purchase/{pkiPurchaseID}/getAttachments | Retrieve Purchase&#39;s attachments |
| [**purchaseGetCommunicationCountV1**](ObjectPurchaseApi.md#purchaseGetCommunicationCountV1) | **GET** /1/object/purchase/{pkiPurchaseID}/getCommunicationCount | Retrieve Communication count |
| [**purchaseGetCommunicationListV1**](ObjectPurchaseApi.md#purchaseGetCommunicationListV1) | **GET** /1/object/purchase/{pkiPurchaseID}/getCommunicationList | Retrieve Communication list |
| [**purchaseGetCommunicationrecipientsV1**](ObjectPurchaseApi.md#purchaseGetCommunicationrecipientsV1) | **GET** /1/object/purchase/{pkiPurchaseID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**purchaseGetCommunicationsendersV1**](ObjectPurchaseApi.md#purchaseGetCommunicationsendersV1) | **GET** /1/object/purchase/{pkiPurchaseID}/getCommunicationsenders | Retrieve Communication senders |
| [**purchaseGetDocumenttypechecklistV1**](ObjectPurchaseApi.md#purchaseGetDocumenttypechecklistV1) | **GET** /1/object/purchase/{pkiPurchaseID}/getDocumenttypechecklist | Retrieve Document type checklist |
| [**purchaseGetListV1**](ObjectPurchaseApi.md#purchaseGetListV1) | **GET** /1/object/purchase/getList | Retrieve Purchase list |
| [**purchaseImportIntoEDMV1**](ObjectPurchaseApi.md#purchaseImportIntoEDMV1) | **POST** /1/object/purchase/{pkiPurchaseID}/importIntoEDM | Import attachments into the Purchase |
| [**purchaseSyncDocumenttypechecklistV1**](ObjectPurchaseApi.md#purchaseSyncDocumenttypechecklistV1) | **POST** /1/object/purchase/{pkiPurchaseID}/syncDocumenttypechecklist | Synchronize Document type checklist |


<a id="purchaseBatchDownloadV1"></a>
# **purchaseBatchDownloadV1**
> java.io.File purchaseBatchDownloadV1(pkiPurchaseID, purchaseBatchDownloadV1Request)

Download multiples attachments from a Purchase

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPurchaseApi()
val pkiPurchaseID : kotlin.Int = 56 // kotlin.Int | 
val purchaseBatchDownloadV1Request : PurchaseBatchDownloadV1Request =  // PurchaseBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.purchaseBatchDownloadV1(pkiPurchaseID, purchaseBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPurchaseApi#purchaseBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPurchaseApi#purchaseBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPurchaseID** | **kotlin.Int**|  | |
| **purchaseBatchDownloadV1Request** | [**PurchaseBatchDownloadV1Request**](PurchaseBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="purchaseGetAttachmentsV1"></a>
# **purchaseGetAttachmentsV1**
> PurchaseGetAttachmentsV1Response purchaseGetAttachmentsV1(pkiPurchaseID)

Retrieve Purchase&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPurchaseApi()
val pkiPurchaseID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PurchaseGetAttachmentsV1Response = apiInstance.purchaseGetAttachmentsV1(pkiPurchaseID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPurchaseApi#purchaseGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPurchaseApi#purchaseGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPurchaseID** | **kotlin.Int**|  | |

### Return type

[**PurchaseGetAttachmentsV1Response**](PurchaseGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="purchaseGetCommunicationCountV1"></a>
# **purchaseGetCommunicationCountV1**
> PurchaseGetCommunicationCountV1Response purchaseGetCommunicationCountV1(pkiPurchaseID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPurchaseApi()
val pkiPurchaseID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PurchaseGetCommunicationCountV1Response = apiInstance.purchaseGetCommunicationCountV1(pkiPurchaseID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPurchaseApi#purchaseGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPurchaseApi#purchaseGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPurchaseID** | **kotlin.Int**|  | |

### Return type

[**PurchaseGetCommunicationCountV1Response**](PurchaseGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="purchaseGetCommunicationListV1"></a>
# **purchaseGetCommunicationListV1**
> PurchaseGetCommunicationListV1Response purchaseGetCommunicationListV1(pkiPurchaseID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPurchaseApi()
val pkiPurchaseID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PurchaseGetCommunicationListV1Response = apiInstance.purchaseGetCommunicationListV1(pkiPurchaseID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPurchaseApi#purchaseGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPurchaseApi#purchaseGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPurchaseID** | **kotlin.Int**|  | |

### Return type

[**PurchaseGetCommunicationListV1Response**](PurchaseGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="purchaseGetCommunicationrecipientsV1"></a>
# **purchaseGetCommunicationrecipientsV1**
> PurchaseGetCommunicationrecipientsV1Response purchaseGetCommunicationrecipientsV1(pkiPurchaseID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPurchaseApi()
val pkiPurchaseID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PurchaseGetCommunicationrecipientsV1Response = apiInstance.purchaseGetCommunicationrecipientsV1(pkiPurchaseID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPurchaseApi#purchaseGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPurchaseApi#purchaseGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPurchaseID** | **kotlin.Int**|  | |

### Return type

[**PurchaseGetCommunicationrecipientsV1Response**](PurchaseGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="purchaseGetCommunicationsendersV1"></a>
# **purchaseGetCommunicationsendersV1**
> PurchaseGetCommunicationsendersV1Response purchaseGetCommunicationsendersV1(pkiPurchaseID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPurchaseApi()
val pkiPurchaseID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PurchaseGetCommunicationsendersV1Response = apiInstance.purchaseGetCommunicationsendersV1(pkiPurchaseID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPurchaseApi#purchaseGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPurchaseApi#purchaseGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPurchaseID** | **kotlin.Int**|  | |

### Return type

[**PurchaseGetCommunicationsendersV1Response**](PurchaseGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="purchaseGetDocumenttypechecklistV1"></a>
# **purchaseGetDocumenttypechecklistV1**
> PurchaseGetDocumenttypechecklistV1Response purchaseGetDocumenttypechecklistV1(pkiPurchaseID)

Retrieve Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPurchaseApi()
val pkiPurchaseID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PurchaseGetDocumenttypechecklistV1Response = apiInstance.purchaseGetDocumenttypechecklistV1(pkiPurchaseID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPurchaseApi#purchaseGetDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPurchaseApi#purchaseGetDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPurchaseID** | **kotlin.Int**|  | |

### Return type

[**PurchaseGetDocumenttypechecklistV1Response**](PurchaseGetDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="purchaseGetListV1"></a>
# **purchaseGetListV1**
> PurchaseGetListV1Response purchaseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Purchase list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPurchaseApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : PurchaseGetListV1Response = apiInstance.purchaseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPurchaseApi#purchaseGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPurchaseApi#purchaseGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiPurchaseID_ASC, pkiPurchaseID_DESC, fkiFranchiseofficeID_ASC, fkiFranchiseofficeID_DESC, fkiSupplierID_ASC, fkiSupplierID_DESC, fkiPeriodID_ASC, fkiPeriodID_DESC, sPurchaseBillnumber_ASC, sPurchaseBillnumber_DESC, dtPurchaseDate_ASC, dtPurchaseDate_DESC, dtPurchasePaydate_ASC, dtPurchasePaydate_DESC, dPurchaseTotal_ASC, dPurchaseTotal_DESC, bPurchaseIsfinanced_ASC, bPurchaseIsfinanced_DESC, bPurchaseIspaid_ASC, bPurchaseIspaid_DESC, sFranchiseagenceName_ASC, sFranchiseagenceName_DESC, iFranchiseofficeCode_ASC, iFranchiseofficeCode_DESC, sSupplierName_ASC, sSupplierName_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**PurchaseGetListV1Response**](PurchaseGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="purchaseImportIntoEDMV1"></a>
# **purchaseImportIntoEDMV1**
> PurchaseImportIntoEDMV1Response purchaseImportIntoEDMV1(pkiPurchaseID, purchaseImportIntoEDMV1Request)

Import attachments into the Purchase

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPurchaseApi()
val pkiPurchaseID : kotlin.Int = 56 // kotlin.Int | 
val purchaseImportIntoEDMV1Request : PurchaseImportIntoEDMV1Request =  // PurchaseImportIntoEDMV1Request | 
try {
    val result : PurchaseImportIntoEDMV1Response = apiInstance.purchaseImportIntoEDMV1(pkiPurchaseID, purchaseImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPurchaseApi#purchaseImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPurchaseApi#purchaseImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPurchaseID** | **kotlin.Int**|  | |
| **purchaseImportIntoEDMV1Request** | [**PurchaseImportIntoEDMV1Request**](PurchaseImportIntoEDMV1Request.md)|  | |

### Return type

[**PurchaseImportIntoEDMV1Response**](PurchaseImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="purchaseSyncDocumenttypechecklistV1"></a>
# **purchaseSyncDocumenttypechecklistV1**
> PurchaseSyncDocumenttypechecklistV1Response purchaseSyncDocumenttypechecklistV1(pkiPurchaseID, body)

Synchronize Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPurchaseApi()
val pkiPurchaseID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : PurchaseSyncDocumenttypechecklistV1Response = apiInstance.purchaseSyncDocumenttypechecklistV1(pkiPurchaseID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPurchaseApi#purchaseSyncDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPurchaseApi#purchaseSyncDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPurchaseID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**PurchaseSyncDocumenttypechecklistV1Response**](PurchaseSyncDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


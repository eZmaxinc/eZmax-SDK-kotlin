# ObjectElectronicfundstransferApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**electronicfundstransferBatchDownloadV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferBatchDownloadV1) | **POST** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/batchDownload | Download multiples attachments from an Electronicfundstransfer |
| [**electronicfundstransferGetAttachmentsV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetAttachmentsV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getAttachments | Retrieve Electronicfundstransfer&#39;s attachments |
| [**electronicfundstransferGetCommunicationCountV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationCountV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationCount | Retrieve Communication count |
| [**electronicfundstransferGetCommunicationListV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationListV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationList | Retrieve Communication list |
| [**electronicfundstransferGetCommunicationrecipientsV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationrecipientsV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationrecipients | Retrieve Electronicfundstransfer&#39;s Communicationrecipient |
| [**electronicfundstransferGetCommunicationsendersV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationsendersV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationsenders | Retrieve Electronicfundstransfer&#39;s Communicationsender |
| [**electronicfundstransferGetDocumenttypechecklistV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetDocumenttypechecklistV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getDocumenttypechecklist | Retrieve Document type checklist |
| [**electronicfundstransferGetListV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetListV1) | **GET** /1/object/electronicfundstransfer/getList | Retrieve Electronicfundstransfer list |
| [**electronicfundstransferImportIntoEDMV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferImportIntoEDMV1) | **POST** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/importIntoEDM | Import attachments into the Electronicfundstransfer |
| [**electronicfundstransferSyncDocumenttypechecklistV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferSyncDocumenttypechecklistV1) | **POST** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/syncDocumenttypechecklist | Synchronize Document type checklist |


<a id="electronicfundstransferBatchDownloadV1"></a>
# **electronicfundstransferBatchDownloadV1**
> java.io.File electronicfundstransferBatchDownloadV1(pkiElectronicfundstransferID, electronicfundstransferBatchDownloadV1Request)

Download multiples attachments from an Electronicfundstransfer

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
val electronicfundstransferBatchDownloadV1Request : ElectronicfundstransferBatchDownloadV1Request =  // ElectronicfundstransferBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.electronicfundstransferBatchDownloadV1(pkiElectronicfundstransferID, electronicfundstransferBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |
| **electronicfundstransferBatchDownloadV1Request** | [**ElectronicfundstransferBatchDownloadV1Request**](ElectronicfundstransferBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="electronicfundstransferGetAttachmentsV1"></a>
# **electronicfundstransferGetAttachmentsV1**
> ElectronicfundstransferGetAttachmentsV1Response electronicfundstransferGetAttachmentsV1(pkiElectronicfundstransferID)

Retrieve Electronicfundstransfer&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetAttachmentsV1Response = apiInstance.electronicfundstransferGetAttachmentsV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |

### Return type

[**ElectronicfundstransferGetAttachmentsV1Response**](ElectronicfundstransferGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="electronicfundstransferGetCommunicationCountV1"></a>
# **electronicfundstransferGetCommunicationCountV1**
> ElectronicfundstransferGetCommunicationCountV1Response electronicfundstransferGetCommunicationCountV1(pkiElectronicfundstransferID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetCommunicationCountV1Response = apiInstance.electronicfundstransferGetCommunicationCountV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationCountV1Response**](ElectronicfundstransferGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="electronicfundstransferGetCommunicationListV1"></a>
# **electronicfundstransferGetCommunicationListV1**
> ElectronicfundstransferGetCommunicationListV1Response electronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetCommunicationListV1Response = apiInstance.electronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationListV1Response**](ElectronicfundstransferGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="electronicfundstransferGetCommunicationrecipientsV1"></a>
# **electronicfundstransferGetCommunicationrecipientsV1**
> ElectronicfundstransferGetCommunicationrecipientsV1Response electronicfundstransferGetCommunicationrecipientsV1(pkiElectronicfundstransferID)

Retrieve Electronicfundstransfer&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetCommunicationrecipientsV1Response = apiInstance.electronicfundstransferGetCommunicationrecipientsV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationrecipientsV1Response**](ElectronicfundstransferGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="electronicfundstransferGetCommunicationsendersV1"></a>
# **electronicfundstransferGetCommunicationsendersV1**
> ElectronicfundstransferGetCommunicationsendersV1Response electronicfundstransferGetCommunicationsendersV1(pkiElectronicfundstransferID)

Retrieve Electronicfundstransfer&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetCommunicationsendersV1Response = apiInstance.electronicfundstransferGetCommunicationsendersV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationsendersV1Response**](ElectronicfundstransferGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="electronicfundstransferGetDocumenttypechecklistV1"></a>
# **electronicfundstransferGetDocumenttypechecklistV1**
> ElectronicfundstransferGetDocumenttypechecklistV1Response electronicfundstransferGetDocumenttypechecklistV1(pkiElectronicfundstransferID)

Retrieve Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetDocumenttypechecklistV1Response = apiInstance.electronicfundstransferGetDocumenttypechecklistV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |

### Return type

[**ElectronicfundstransferGetDocumenttypechecklistV1Response**](ElectronicfundstransferGetDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="electronicfundstransferGetListV1"></a>
# **electronicfundstransferGetListV1**
> ElectronicfundstransferGetListV1Response electronicfundstransferGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Electronicfundstransfer list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : ElectronicfundstransferGetListV1Response = apiInstance.electronicfundstransferGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiElectronicfundstransferID_ASC, pkiElectronicfundstransferID_DESC, fkiPaymentmethodID_ASC, fkiPaymentmethodID_DESC, fkiUserIDCreated_ASC, fkiUserIDCreated_DESC, sPaymentmethodDescriptionX_ASC, sPaymentmethodDescriptionX_DESC, sUserLoginnameCreated_ASC, sUserLoginnameCreated_DESC, iElectronicfundstransferNumber_ASC, iElectronicfundstransferNumber_DESC, dtElectronicfundstransferDate_ASC, dtElectronicfundstransferDate_DESC, iElectronicfundstransferTransactioncount_ASC, iElectronicfundstransferTransactioncount_DESC, dElectronicfundstransferAmountvisible_ASC, dElectronicfundstransferAmountvisible_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**ElectronicfundstransferGetListV1Response**](ElectronicfundstransferGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="electronicfundstransferImportIntoEDMV1"></a>
# **electronicfundstransferImportIntoEDMV1**
> ElectronicfundstransferImportIntoEDMV1Response electronicfundstransferImportIntoEDMV1(pkiElectronicfundstransferID, electronicfundstransferImportIntoEDMV1Request)

Import attachments into the Electronicfundstransfer



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
val electronicfundstransferImportIntoEDMV1Request : ElectronicfundstransferImportIntoEDMV1Request =  // ElectronicfundstransferImportIntoEDMV1Request | 
try {
    val result : ElectronicfundstransferImportIntoEDMV1Response = apiInstance.electronicfundstransferImportIntoEDMV1(pkiElectronicfundstransferID, electronicfundstransferImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |
| **electronicfundstransferImportIntoEDMV1Request** | [**ElectronicfundstransferImportIntoEDMV1Request**](ElectronicfundstransferImportIntoEDMV1Request.md)|  | |

### Return type

[**ElectronicfundstransferImportIntoEDMV1Response**](ElectronicfundstransferImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="electronicfundstransferSyncDocumenttypechecklistV1"></a>
# **electronicfundstransferSyncDocumenttypechecklistV1**
> ElectronicfundstransferSyncDocumenttypechecklistV1Response electronicfundstransferSyncDocumenttypechecklistV1(pkiElectronicfundstransferID, body)

Synchronize Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : ElectronicfundstransferSyncDocumenttypechecklistV1Response = apiInstance.electronicfundstransferSyncDocumenttypechecklistV1(pkiElectronicfundstransferID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferSyncDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferSyncDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**ElectronicfundstransferSyncDocumenttypechecklistV1Response**](ElectronicfundstransferSyncDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ObjectDeposittransitchequeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deposittransitchequeBatchDownloadV1**](ObjectDeposittransitchequeApi.md#deposittransitchequeBatchDownloadV1) | **POST** /1/object/deposittransitcheque/{pkiDeposittransitchequeID}/batchDownload | Download multiples attachments from a Deposittransitcheque |
| [**deposittransitchequeGetAttachmentsV1**](ObjectDeposittransitchequeApi.md#deposittransitchequeGetAttachmentsV1) | **GET** /1/object/deposittransitcheque/{pkiDeposittransitchequeID}/getAttachments | Retrieve Deposittransitcheque&#39;s attachments |
| [**deposittransitchequeGetCommunicationCountV1**](ObjectDeposittransitchequeApi.md#deposittransitchequeGetCommunicationCountV1) | **GET** /1/object/deposittransitcheque/{pkiDeposittransitchequeID}/getCommunicationCount | Retrieve Communication count |
| [**deposittransitchequeGetCommunicationListV1**](ObjectDeposittransitchequeApi.md#deposittransitchequeGetCommunicationListV1) | **GET** /1/object/deposittransitcheque/{pkiDeposittransitchequeID}/getCommunicationList | Retrieve Communication list |
| [**deposittransitchequeGetCommunicationrecipientsV1**](ObjectDeposittransitchequeApi.md#deposittransitchequeGetCommunicationrecipientsV1) | **GET** /1/object/deposittransitcheque/{pkiDeposittransitchequeID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**deposittransitchequeGetCommunicationsendersV1**](ObjectDeposittransitchequeApi.md#deposittransitchequeGetCommunicationsendersV1) | **GET** /1/object/deposittransitcheque/{pkiDeposittransitchequeID}/getCommunicationsenders | Retrieve Communication senders |
| [**deposittransitchequeGetListV1**](ObjectDeposittransitchequeApi.md#deposittransitchequeGetListV1) | **GET** /1/object/deposittransitcheque/getList | Retrieve Deposittransitcheque list |
| [**deposittransitchequeImportIntoEDMV1**](ObjectDeposittransitchequeApi.md#deposittransitchequeImportIntoEDMV1) | **POST** /1/object/deposittransitcheque/{pkiDeposittransitchequeID}/importIntoEDM | Import attachments into the Deposittransitcheque |


<a id="deposittransitchequeBatchDownloadV1"></a>
# **deposittransitchequeBatchDownloadV1**
> java.io.File deposittransitchequeBatchDownloadV1(pkiDeposittransitchequeID, deposittransitchequeBatchDownloadV1Request)

Download multiples attachments from a Deposittransitcheque

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDeposittransitchequeApi()
val pkiDeposittransitchequeID : kotlin.Int = 56 // kotlin.Int | 
val deposittransitchequeBatchDownloadV1Request : DeposittransitchequeBatchDownloadV1Request =  // DeposittransitchequeBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.deposittransitchequeBatchDownloadV1(pkiDeposittransitchequeID, deposittransitchequeBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDeposittransitchequeApi#deposittransitchequeBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDeposittransitchequeApi#deposittransitchequeBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDeposittransitchequeID** | **kotlin.Int**|  | |
| **deposittransitchequeBatchDownloadV1Request** | [**DeposittransitchequeBatchDownloadV1Request**](DeposittransitchequeBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deposittransitchequeGetAttachmentsV1"></a>
# **deposittransitchequeGetAttachmentsV1**
> DeposittransitchequeGetAttachmentsV1Response deposittransitchequeGetAttachmentsV1(pkiDeposittransitchequeID)

Retrieve Deposittransitcheque&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDeposittransitchequeApi()
val pkiDeposittransitchequeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DeposittransitchequeGetAttachmentsV1Response = apiInstance.deposittransitchequeGetAttachmentsV1(pkiDeposittransitchequeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDeposittransitchequeID** | **kotlin.Int**|  | |

### Return type

[**DeposittransitchequeGetAttachmentsV1Response**](DeposittransitchequeGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deposittransitchequeGetCommunicationCountV1"></a>
# **deposittransitchequeGetCommunicationCountV1**
> DeposittransitchequeGetCommunicationCountV1Response deposittransitchequeGetCommunicationCountV1(pkiDeposittransitchequeID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDeposittransitchequeApi()
val pkiDeposittransitchequeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DeposittransitchequeGetCommunicationCountV1Response = apiInstance.deposittransitchequeGetCommunicationCountV1(pkiDeposittransitchequeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDeposittransitchequeID** | **kotlin.Int**|  | |

### Return type

[**DeposittransitchequeGetCommunicationCountV1Response**](DeposittransitchequeGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deposittransitchequeGetCommunicationListV1"></a>
# **deposittransitchequeGetCommunicationListV1**
> DeposittransitchequeGetCommunicationListV1Response deposittransitchequeGetCommunicationListV1(pkiDeposittransitchequeID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDeposittransitchequeApi()
val pkiDeposittransitchequeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DeposittransitchequeGetCommunicationListV1Response = apiInstance.deposittransitchequeGetCommunicationListV1(pkiDeposittransitchequeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDeposittransitchequeID** | **kotlin.Int**|  | |

### Return type

[**DeposittransitchequeGetCommunicationListV1Response**](DeposittransitchequeGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deposittransitchequeGetCommunicationrecipientsV1"></a>
# **deposittransitchequeGetCommunicationrecipientsV1**
> DeposittransitchequeGetCommunicationrecipientsV1Response deposittransitchequeGetCommunicationrecipientsV1(pkiDeposittransitchequeID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDeposittransitchequeApi()
val pkiDeposittransitchequeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DeposittransitchequeGetCommunicationrecipientsV1Response = apiInstance.deposittransitchequeGetCommunicationrecipientsV1(pkiDeposittransitchequeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDeposittransitchequeID** | **kotlin.Int**|  | |

### Return type

[**DeposittransitchequeGetCommunicationrecipientsV1Response**](DeposittransitchequeGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deposittransitchequeGetCommunicationsendersV1"></a>
# **deposittransitchequeGetCommunicationsendersV1**
> DeposittransitchequeGetCommunicationsendersV1Response deposittransitchequeGetCommunicationsendersV1(pkiDeposittransitchequeID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDeposittransitchequeApi()
val pkiDeposittransitchequeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DeposittransitchequeGetCommunicationsendersV1Response = apiInstance.deposittransitchequeGetCommunicationsendersV1(pkiDeposittransitchequeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDeposittransitchequeID** | **kotlin.Int**|  | |

### Return type

[**DeposittransitchequeGetCommunicationsendersV1Response**](DeposittransitchequeGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deposittransitchequeGetListV1"></a>
# **deposittransitchequeGetListV1**
> DeposittransitchequeGetListV1Response deposittransitchequeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Deposittransitcheque list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDeposittransitchequeApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : DeposittransitchequeGetListV1Response = apiInstance.deposittransitchequeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDeposittransitchequeApi#deposittransitchequeGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiDeposittransitchequeID_ASC, pkiDeposittransitchequeID_DESC, fkiBankaccountID_ASC, fkiBankaccountID_DESC, fkiDepositID_ASC, fkiDepositID_DESC, sDeposittransitchequeNumber_ASC, sDeposittransitchequeNumber_DESC, dtDeposittransitchequeDate_ASC, dtDeposittransitchequeDate_DESC, dDeposittransitchequeAmount_ASC, dDeposittransitchequeAmount_DESC, sBankaccountBankname_ASC, sBankaccountBankname_DESC, sPeriodYYYYMM_ASC, sPeriodYYYYMM_DESC, sCustomerName_ASC, sCustomerName_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**DeposittransitchequeGetListV1Response**](DeposittransitchequeGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deposittransitchequeImportIntoEDMV1"></a>
# **deposittransitchequeImportIntoEDMV1**
> DeposittransitchequeImportIntoEDMV1Response deposittransitchequeImportIntoEDMV1(pkiDeposittransitchequeID, deposittransitchequeImportIntoEDMV1Request)

Import attachments into the Deposittransitcheque

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDeposittransitchequeApi()
val pkiDeposittransitchequeID : kotlin.Int = 56 // kotlin.Int | 
val deposittransitchequeImportIntoEDMV1Request : DeposittransitchequeImportIntoEDMV1Request =  // DeposittransitchequeImportIntoEDMV1Request | 
try {
    val result : DeposittransitchequeImportIntoEDMV1Response = apiInstance.deposittransitchequeImportIntoEDMV1(pkiDeposittransitchequeID, deposittransitchequeImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDeposittransitchequeApi#deposittransitchequeImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDeposittransitchequeApi#deposittransitchequeImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDeposittransitchequeID** | **kotlin.Int**|  | |
| **deposittransitchequeImportIntoEDMV1Request** | [**DeposittransitchequeImportIntoEDMV1Request**](DeposittransitchequeImportIntoEDMV1Request.md)|  | |

### Return type

[**DeposittransitchequeImportIntoEDMV1Response**](DeposittransitchequeImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


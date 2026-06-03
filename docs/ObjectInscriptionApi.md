# ObjectInscriptionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**inscriptionGetAttachmentsV1**](ObjectInscriptionApi.md#inscriptionGetAttachmentsV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getAttachments | Retrieve Inscription&#39;s Attachments |
| [**inscriptionGetCommunicationCountV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationCountV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationCount | Retrieve Communication count |
| [**inscriptionGetCommunicationListV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationListV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationList | Retrieve Communication list |
| [**inscriptionGetCommunicationrecipientsV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationrecipientsV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationrecipients | Retrieve Inscription&#39;s Communicationrecipient |
| [**inscriptionGetCommunicationsendersV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationsendersV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationsenders | Retrieve Inscription&#39;s Communicationsender |
| [**inscriptionGetListV1**](ObjectInscriptionApi.md#inscriptionGetListV1) | **GET** /1/object/inscription/getList | Retrieve Inscription list |
| [**inscriptionImportIntoEDMV1**](ObjectInscriptionApi.md#inscriptionImportIntoEDMV1) | **POST** /1/object/inscription/{pkiInscriptionID}/importIntoEDM | Import attachments into the Inscription |
| [**inscriptionPrepareFilesTransferV1**](ObjectInscriptionApi.md#inscriptionPrepareFilesTransferV1) | **POST** /1/object/inscription/{pkiInscriptionID}/prepareFilesTransfer | Prepares file transfer into EDM |


<a id="inscriptionGetAttachmentsV1"></a>
# **inscriptionGetAttachmentsV1**
> InscriptionGetAttachmentsV1Response inscriptionGetAttachmentsV1(pkiInscriptionID)

Retrieve Inscription&#39;s Attachments



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionGetAttachmentsV1Response = apiInstance.inscriptionGetAttachmentsV1(pkiInscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int**|  | |

### Return type

[**InscriptionGetAttachmentsV1Response**](InscriptionGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionGetCommunicationCountV1"></a>
# **inscriptionGetCommunicationCountV1**
> InscriptionGetCommunicationCountV1Response inscriptionGetCommunicationCountV1(pkiInscriptionID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionGetCommunicationCountV1Response = apiInstance.inscriptionGetCommunicationCountV1(pkiInscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int**|  | |

### Return type

[**InscriptionGetCommunicationCountV1Response**](InscriptionGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionGetCommunicationListV1"></a>
# **inscriptionGetCommunicationListV1**
> InscriptionGetCommunicationListV1Response inscriptionGetCommunicationListV1(pkiInscriptionID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionGetCommunicationListV1Response = apiInstance.inscriptionGetCommunicationListV1(pkiInscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int**|  | |

### Return type

[**InscriptionGetCommunicationListV1Response**](InscriptionGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionGetCommunicationrecipientsV1"></a>
# **inscriptionGetCommunicationrecipientsV1**
> InscriptionGetCommunicationrecipientsV1Response inscriptionGetCommunicationrecipientsV1(pkiInscriptionID)

Retrieve Inscription&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionGetCommunicationrecipientsV1Response = apiInstance.inscriptionGetCommunicationrecipientsV1(pkiInscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int**|  | |

### Return type

[**InscriptionGetCommunicationrecipientsV1Response**](InscriptionGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionGetCommunicationsendersV1"></a>
# **inscriptionGetCommunicationsendersV1**
> InscriptionGetCommunicationsendersV1Response inscriptionGetCommunicationsendersV1(pkiInscriptionID)

Retrieve Inscription&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionGetCommunicationsendersV1Response = apiInstance.inscriptionGetCommunicationsendersV1(pkiInscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int**|  | |

### Return type

[**InscriptionGetCommunicationsendersV1Response**](InscriptionGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionGetListV1"></a>
# **inscriptionGetListV1**
> InscriptionGetListV1Response inscriptionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Inscription list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eInscriptionStep | TemporaryNotAuthenticated&lt;br&gt;ImportedInscription&lt;br&gt;Inscription&lt;br&gt;ModifiedInscription&lt;br&gt;ContractEnded&lt;br&gt;ExpiredInscription&lt;br&gt;Out-market&lt;br&gt;ImportedNotauthenticated&lt;br&gt;NotAuthenticated&lt;br&gt;ModifiedNotauthenticated&lt;br&gt;Authenticated |  Advanced filters that can be used in query parameter *sFilter*:  | Variable | |---| | sBrokerNameInscriptor | | sBrokerNameSeller | | sContactFirstnameAgentInscriptor | | sContactLastnameAgentInscriptor | | sContactFirstnameAgentSeller | | sContactLastnameAgentSeller |         | sContactFirstnameBuyer | | sContactLastnameBuyer | | sContactFirstnameSeller | | sContactLastnameSeller |  | sContactFirstnameNotaryBuyer | | sContactLastnameNotaryBuyer |  | sContactFirstnameNotarySeller | | sContactLastnameNotarySeller |         

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : InscriptionGetListV1Response = apiInstance.inscriptionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiInscriptionID_ASC, pkiInscriptionID_DESC, pkiInscriptionnotauthenticatedID_ASC, pkiInscriptionnotauthenticatedID_DESC, fkiInscriptiontypeID_ASC, fkiInscriptiontypeID_DESC, sInscriptiontypeNameX_ASC, sInscriptiontypeNameX_DESC, eInscriptionStep_ASC, eInscriptionStep_DESC, sInscriptionCivicend_ASC, sInscriptionCivicend_DESC, sInscriptionMLS_ASC, sInscriptionMLS_DESC, dInscriptionSaleprice_ASC, dInscriptionSaleprice_DESC, dInscriptionRentprice_ASC, dInscriptionRentprice_DESC, dtInscriptionDate_ASC, dtInscriptionDate_DESC, dtInscriptionExpirationdate_ASC, dtInscriptionExpirationdate_DESC, dtInscriptionNotarydate_ASC, dtInscriptionNotarydate_DESC, bInscriptionInspection_ASC, bInscriptionInspection_DESC, bInscriptionIsactive_ASC, bInscriptionIsactive_DESC, dtInscriptionnotauthenticatedNotaryscheduledate_ASC, dtInscriptionnotauthenticatedNotaryscheduledate_DESC, dtInscriptionnotauthenticatedTransactiondate_ASC, dtInscriptionnotauthenticatedTransactiondate_DESC, dtInscriptionnotauthenticatedTransactiondateReal_ASC, dtInscriptionnotauthenticatedTransactiondateReal_DESC, bInscriptionnotauthenticatedConditional_ASC, bInscriptionnotauthenticatedConditional_DESC, bInscriptionnotauthenticatedIsactive_ASC, bInscriptionnotauthenticatedIsactive_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC, iInscriptionnotauthenticatedCanceled_ASC, iInscriptionnotauthenticatedCanceled_DESC, bAllowedCopyintoinscriptionedm_ASC, bAllowedCopyintoinscriptionedm_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**InscriptionGetListV1Response**](InscriptionGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionImportIntoEDMV1"></a>
# **inscriptionImportIntoEDMV1**
> InscriptionImportIntoEDMV1Response inscriptionImportIntoEDMV1(pkiInscriptionID, inscriptionImportIntoEDMV1Request)

Import attachments into the Inscription



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
val inscriptionImportIntoEDMV1Request : InscriptionImportIntoEDMV1Request =  // InscriptionImportIntoEDMV1Request | 
try {
    val result : InscriptionImportIntoEDMV1Response = apiInstance.inscriptionImportIntoEDMV1(pkiInscriptionID, inscriptionImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiInscriptionID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inscriptionImportIntoEDMV1Request** | [**InscriptionImportIntoEDMV1Request**](InscriptionImportIntoEDMV1Request.md)|  | |

### Return type

[**InscriptionImportIntoEDMV1Response**](InscriptionImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="inscriptionPrepareFilesTransferV1"></a>
# **inscriptionPrepareFilesTransferV1**
> InscriptionPrepareFilesTransferV1Response inscriptionPrepareFilesTransferV1(pkiInscriptionID, inscriptionPrepareFilesTransferV1Request)

Prepares file transfer into EDM



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
val inscriptionPrepareFilesTransferV1Request : InscriptionPrepareFilesTransferV1Request =  // InscriptionPrepareFilesTransferV1Request | 
try {
    val result : InscriptionPrepareFilesTransferV1Response = apiInstance.inscriptionPrepareFilesTransferV1(pkiInscriptionID, inscriptionPrepareFilesTransferV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionPrepareFilesTransferV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionPrepareFilesTransferV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiInscriptionID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inscriptionPrepareFilesTransferV1Request** | [**InscriptionPrepareFilesTransferV1Request**](InscriptionPrepareFilesTransferV1Request.md)|  | |

### Return type

[**InscriptionPrepareFilesTransferV1Response**](InscriptionPrepareFilesTransferV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


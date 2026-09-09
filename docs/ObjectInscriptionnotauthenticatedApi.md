# ObjectInscriptionnotauthenticatedApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**inscriptionnotauthenticatedBatchDownloadV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedBatchDownloadV1) | **POST** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/batchDownload | Download multiples attachments from a Inscriptionnotauthenticated |
| [**inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1) | **POST** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/fillInscriptionnotauthenticatedcondition | Fills the Inscriptionnotauthenticatedcondition in the Inscriptionnotauthenticated |
| [**inscriptionnotauthenticatedGetAttachmentsV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetAttachmentsV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getAttachments | Retrieve Inscriptionnotauthenticated&#39;s attachments |
| [**inscriptionnotauthenticatedGetCommunicationCountV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationCountV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationCount | Retrieve Communication count |
| [**inscriptionnotauthenticatedGetCommunicationListV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationListV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationList | Retrieve Communication list |
| [**inscriptionnotauthenticatedGetCommunicationrecipientsV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationrecipientsV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationrecipients | Retrieve Inscriptionnotauthenticated&#39;s Communicationrecipient |
| [**inscriptionnotauthenticatedGetCommunicationsendersV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationsendersV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationsenders | Retrieve Inscriptionnotauthenticated&#39;s Communicationsender |
| [**inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getInscriptionnotauthenticatedconditions | Retrieve Inscriptionnotauthenticated conditions |
| [**inscriptionnotauthenticatedGetListV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetListV1) | **GET** /1/object/inscriptionnotauthenticated/getList | Retrieve Inscriptionnotauthenticated list |
| [**inscriptionnotauthenticatedGetObjectV2**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetObjectV2) | **GET** /2/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID} | Retrieve an existing Inscriptionnotauthenticated |
| [**inscriptionnotauthenticatedImportIntoEDMV1**](ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedImportIntoEDMV1) | **POST** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/importIntoEDM | Import attachments into the Inscriptionnotauthenticated |


<a id="inscriptionnotauthenticatedBatchDownloadV1"></a>
# **inscriptionnotauthenticatedBatchDownloadV1**
> java.io.File inscriptionnotauthenticatedBatchDownloadV1(pkiInscriptionnotauthenticatedID, inscriptionnotauthenticatedBatchDownloadV1Request)

Download multiples attachments from a Inscriptionnotauthenticated

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val pkiInscriptionnotauthenticatedID : kotlin.Int = 56 // kotlin.Int | 
val inscriptionnotauthenticatedBatchDownloadV1Request : InscriptionnotauthenticatedBatchDownloadV1Request =  // InscriptionnotauthenticatedBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.inscriptionnotauthenticatedBatchDownloadV1(pkiInscriptionnotauthenticatedID, inscriptionnotauthenticatedBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int**|  | |
| **inscriptionnotauthenticatedBatchDownloadV1Request** | [**InscriptionnotauthenticatedBatchDownloadV1Request**](InscriptionnotauthenticatedBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1"></a>
# **inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1**
> InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Response inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1(pkiInscriptionnotauthenticatedID, inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request)

Fills the Inscriptionnotauthenticatedcondition in the Inscriptionnotauthenticated



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val pkiInscriptionnotauthenticatedID : kotlin.Int = 56 // kotlin.Int | 
val inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request : InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request =  // InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request | 
try {
    val result : InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Response = apiInstance.inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1(pkiInscriptionnotauthenticatedID, inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int**|  | |
| **inscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request** | [**InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request**](InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Request.md)|  | |

### Return type

[**InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Response**](InscriptionnotauthenticatedFillInscriptionnotauthenticatedconditionV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="inscriptionnotauthenticatedGetAttachmentsV1"></a>
# **inscriptionnotauthenticatedGetAttachmentsV1**
> InscriptionnotauthenticatedGetAttachmentsV1Response inscriptionnotauthenticatedGetAttachmentsV1(pkiInscriptionnotauthenticatedID)

Retrieve Inscriptionnotauthenticated&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val pkiInscriptionnotauthenticatedID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionnotauthenticatedGetAttachmentsV1Response = apiInstance.inscriptionnotauthenticatedGetAttachmentsV1(pkiInscriptionnotauthenticatedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int**|  | |

### Return type

[**InscriptionnotauthenticatedGetAttachmentsV1Response**](InscriptionnotauthenticatedGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionnotauthenticatedGetCommunicationCountV1"></a>
# **inscriptionnotauthenticatedGetCommunicationCountV1**
> InscriptionnotauthenticatedGetCommunicationCountV1Response inscriptionnotauthenticatedGetCommunicationCountV1(pkiInscriptionnotauthenticatedID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val pkiInscriptionnotauthenticatedID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionnotauthenticatedGetCommunicationCountV1Response = apiInstance.inscriptionnotauthenticatedGetCommunicationCountV1(pkiInscriptionnotauthenticatedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int**|  | |

### Return type

[**InscriptionnotauthenticatedGetCommunicationCountV1Response**](InscriptionnotauthenticatedGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionnotauthenticatedGetCommunicationListV1"></a>
# **inscriptionnotauthenticatedGetCommunicationListV1**
> InscriptionnotauthenticatedGetCommunicationListV1Response inscriptionnotauthenticatedGetCommunicationListV1(pkiInscriptionnotauthenticatedID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val pkiInscriptionnotauthenticatedID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionnotauthenticatedGetCommunicationListV1Response = apiInstance.inscriptionnotauthenticatedGetCommunicationListV1(pkiInscriptionnotauthenticatedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int**|  | |

### Return type

[**InscriptionnotauthenticatedGetCommunicationListV1Response**](InscriptionnotauthenticatedGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionnotauthenticatedGetCommunicationrecipientsV1"></a>
# **inscriptionnotauthenticatedGetCommunicationrecipientsV1**
> InscriptionnotauthenticatedGetCommunicationrecipientsV1Response inscriptionnotauthenticatedGetCommunicationrecipientsV1(pkiInscriptionnotauthenticatedID)

Retrieve Inscriptionnotauthenticated&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val pkiInscriptionnotauthenticatedID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionnotauthenticatedGetCommunicationrecipientsV1Response = apiInstance.inscriptionnotauthenticatedGetCommunicationrecipientsV1(pkiInscriptionnotauthenticatedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int**|  | |

### Return type

[**InscriptionnotauthenticatedGetCommunicationrecipientsV1Response**](InscriptionnotauthenticatedGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionnotauthenticatedGetCommunicationsendersV1"></a>
# **inscriptionnotauthenticatedGetCommunicationsendersV1**
> InscriptionnotauthenticatedGetCommunicationsendersV1Response inscriptionnotauthenticatedGetCommunicationsendersV1(pkiInscriptionnotauthenticatedID)

Retrieve Inscriptionnotauthenticated&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val pkiInscriptionnotauthenticatedID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionnotauthenticatedGetCommunicationsendersV1Response = apiInstance.inscriptionnotauthenticatedGetCommunicationsendersV1(pkiInscriptionnotauthenticatedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int**|  | |

### Return type

[**InscriptionnotauthenticatedGetCommunicationsendersV1Response**](InscriptionnotauthenticatedGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1"></a>
# **inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1**
> InscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1Response inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1(pkiInscriptionnotauthenticatedID)

Retrieve Inscriptionnotauthenticated conditions



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val pkiInscriptionnotauthenticatedID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1Response = apiInstance.inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1(pkiInscriptionnotauthenticatedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int**|  | |

### Return type

[**InscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1Response**](InscriptionnotauthenticatedGetInscriptionnotauthenticatedconditionsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionnotauthenticatedGetListV1"></a>
# **inscriptionnotauthenticatedGetListV1**
> InscriptionnotauthenticatedGetListV1Response inscriptionnotauthenticatedGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Inscriptionnotauthenticated list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eInscriptionStep | TemporaryNotAuthenticated&lt;br&gt;ImportedInscription&lt;br&gt;Inscription&lt;br&gt;ModifiedInscription&lt;br&gt;ContractEnded&lt;br&gt;ExpiredInscription&lt;br&gt;Out-market&lt;br&gt;ImportedNotauthenticated&lt;br&gt;NotAuthenticated&lt;br&gt;ModifiedNotauthenticated&lt;br&gt;Authenticated |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : InscriptionnotauthenticatedGetListV1Response = apiInstance.inscriptionnotauthenticatedGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiInscriptionID_ASC, pkiInscriptionID_DESC, pkiInscriptionnotauthenticatedID_ASC, pkiInscriptionnotauthenticatedID_DESC, fkiInscriptiontypeID_ASC, fkiInscriptiontypeID_DESC, sInscriptiontypeNameX_ASC, sInscriptiontypeNameX_DESC, eInscriptionStep_ASC, eInscriptionStep_DESC, sInscriptionCivicend_ASC, sInscriptionCivicend_DESC, sInscriptionMLS_ASC, sInscriptionMLS_DESC, dInscriptionSaleprice_ASC, dInscriptionSaleprice_DESC, dInscriptionRentprice_ASC, dInscriptionRentprice_DESC, dtInscriptionDate_ASC, dtInscriptionDate_DESC, dtInscriptionExpirationdate_ASC, dtInscriptionExpirationdate_DESC, dtInscriptionNotarydate_ASC, dtInscriptionNotarydate_DESC, bInscriptionInspection_ASC, bInscriptionInspection_DESC, bInscriptionIsactive_ASC, bInscriptionIsactive_DESC, dtInscriptionnotauthenticatedNotaryscheduledate_ASC, dtInscriptionnotauthenticatedNotaryscheduledate_DESC, dtInscriptionnotauthenticatedTransactiondate_ASC, dtInscriptionnotauthenticatedTransactiondate_DESC, dtInscriptionnotauthenticatedTransactiondateReal_ASC, dtInscriptionnotauthenticatedTransactiondateReal_DESC, bInscriptionnotauthenticatedConditional_ASC, bInscriptionnotauthenticatedConditional_DESC, bInscriptionnotauthenticatedIsactive_ASC, bInscriptionnotauthenticatedIsactive_DESC, bInscriptionnotauthenticatedDraft_ASC, bInscriptionnotauthenticatedDraft_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC, sInscriptionnotauthenticatedOffertopurchasenumber_ASC, sInscriptionnotauthenticatedOffertopurchasenumber_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**InscriptionnotauthenticatedGetListV1Response**](InscriptionnotauthenticatedGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionnotauthenticatedGetObjectV2"></a>
# **inscriptionnotauthenticatedGetObjectV2**
> InscriptionnotauthenticatedGetObjectV2Response inscriptionnotauthenticatedGetObjectV2(pkiInscriptionnotauthenticatedID)

Retrieve an existing Inscriptionnotauthenticated



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val pkiInscriptionnotauthenticatedID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Inscriptionnotauthenticated
try {
    val result : InscriptionnotauthenticatedGetObjectV2Response = apiInstance.inscriptionnotauthenticatedGetObjectV2(pkiInscriptionnotauthenticatedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int**| The unique ID of the Inscriptionnotauthenticated | |

### Return type

[**InscriptionnotauthenticatedGetObjectV2Response**](InscriptionnotauthenticatedGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionnotauthenticatedImportIntoEDMV1"></a>
# **inscriptionnotauthenticatedImportIntoEDMV1**
> InscriptionnotauthenticatedImportIntoEDMV1Response inscriptionnotauthenticatedImportIntoEDMV1(pkiInscriptionnotauthenticatedID, inscriptionnotauthenticatedImportIntoEDMV1Request)

Import attachments into the Inscriptionnotauthenticated



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionnotauthenticatedApi()
val pkiInscriptionnotauthenticatedID : kotlin.Int = 56 // kotlin.Int | 
val inscriptionnotauthenticatedImportIntoEDMV1Request : InscriptionnotauthenticatedImportIntoEDMV1Request =  // InscriptionnotauthenticatedImportIntoEDMV1Request | 
try {
    val result : InscriptionnotauthenticatedImportIntoEDMV1Response = apiInstance.inscriptionnotauthenticatedImportIntoEDMV1(pkiInscriptionnotauthenticatedID, inscriptionnotauthenticatedImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionnotauthenticatedApi#inscriptionnotauthenticatedImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionnotauthenticatedID** | **kotlin.Int**|  | |
| **inscriptionnotauthenticatedImportIntoEDMV1Request** | [**InscriptionnotauthenticatedImportIntoEDMV1Request**](InscriptionnotauthenticatedImportIntoEDMV1Request.md)|  | |

### Return type

[**InscriptionnotauthenticatedImportIntoEDMV1Response**](InscriptionnotauthenticatedImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


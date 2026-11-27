# ObjectBankaccountApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**bankaccountBatchDownloadV1**](ObjectBankaccountApi.md#bankaccountBatchDownloadV1) | **POST** /1/object/bankaccount/{pkiBankaccountID}/batchDownload | Download multiples attachments from a Bankaccount |
| [**bankaccountGetAttachmentsV1**](ObjectBankaccountApi.md#bankaccountGetAttachmentsV1) | **GET** /1/object/bankaccount/{pkiBankaccountID}/getAttachments | Retrieve Bankaccount&#39;s attachments |
| [**bankaccountGetAutocompleteV2**](ObjectBankaccountApi.md#bankaccountGetAutocompleteV2) | **GET** /2/object/bankaccount/getAutocomplete/{sSelector} | Retrieve Bankaccounts and IDs |
| [**bankaccountGetCommunicationCountV1**](ObjectBankaccountApi.md#bankaccountGetCommunicationCountV1) | **GET** /1/object/bankaccount/{pkiBankaccountID}/getCommunicationCount | Retrieve Communication count |
| [**bankaccountGetCommunicationListV1**](ObjectBankaccountApi.md#bankaccountGetCommunicationListV1) | **GET** /1/object/bankaccount/{pkiBankaccountID}/getCommunicationList | Retrieve Communication list |
| [**bankaccountGetCommunicationrecipientsV1**](ObjectBankaccountApi.md#bankaccountGetCommunicationrecipientsV1) | **GET** /1/object/bankaccount/{pkiBankaccountID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**bankaccountGetCommunicationsendersV1**](ObjectBankaccountApi.md#bankaccountGetCommunicationsendersV1) | **GET** /1/object/bankaccount/{pkiBankaccountID}/getCommunicationsenders | Retrieve Communication senders |
| [**bankaccountGetListV1**](ObjectBankaccountApi.md#bankaccountGetListV1) | **GET** /1/object/bankaccount/getList | Retrieve Bankaccount list |
| [**bankaccountImportIntoEDMV1**](ObjectBankaccountApi.md#bankaccountImportIntoEDMV1) | **POST** /1/object/bankaccount/{pkiBankaccountID}/importIntoEDM | Import attachments into the Bankaccount |


<a id="bankaccountBatchDownloadV1"></a>
# **bankaccountBatchDownloadV1**
> java.io.File bankaccountBatchDownloadV1(pkiBankaccountID, bankaccountBatchDownloadV1Request)

Download multiples attachments from a Bankaccount

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBankaccountApi()
val pkiBankaccountID : kotlin.Int = 56 // kotlin.Int | 
val bankaccountBatchDownloadV1Request : BankaccountBatchDownloadV1Request =  // BankaccountBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.bankaccountBatchDownloadV1(pkiBankaccountID, bankaccountBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBankaccountApi#bankaccountBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBankaccountApi#bankaccountBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBankaccountID** | **kotlin.Int**|  | |
| **bankaccountBatchDownloadV1Request** | [**BankaccountBatchDownloadV1Request**](BankaccountBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="bankaccountGetAttachmentsV1"></a>
# **bankaccountGetAttachmentsV1**
> BankaccountGetAttachmentsV1Response bankaccountGetAttachmentsV1(pkiBankaccountID)

Retrieve Bankaccount&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBankaccountApi()
val pkiBankaccountID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BankaccountGetAttachmentsV1Response = apiInstance.bankaccountGetAttachmentsV1(pkiBankaccountID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBankaccountApi#bankaccountGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBankaccountApi#bankaccountGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBankaccountID** | **kotlin.Int**|  | |

### Return type

[**BankaccountGetAttachmentsV1Response**](BankaccountGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bankaccountGetAutocompleteV2"></a>
# **bankaccountGetAutocompleteV2**
> BankaccountGetAutocompleteV2Response bankaccountGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Bankaccounts and IDs

Get the list of Bankaccount to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBankaccountApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Bankaccounts to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : BankaccountGetAutocompleteV2Response = apiInstance.bankaccountGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBankaccountApi#bankaccountGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBankaccountApi#bankaccountGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sSelector** | **kotlin.String**| The type of Bankaccounts to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**BankaccountGetAutocompleteV2Response**](BankaccountGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bankaccountGetCommunicationCountV1"></a>
# **bankaccountGetCommunicationCountV1**
> BankaccountGetCommunicationCountV1Response bankaccountGetCommunicationCountV1(pkiBankaccountID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBankaccountApi()
val pkiBankaccountID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BankaccountGetCommunicationCountV1Response = apiInstance.bankaccountGetCommunicationCountV1(pkiBankaccountID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBankaccountApi#bankaccountGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBankaccountApi#bankaccountGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBankaccountID** | **kotlin.Int**|  | |

### Return type

[**BankaccountGetCommunicationCountV1Response**](BankaccountGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bankaccountGetCommunicationListV1"></a>
# **bankaccountGetCommunicationListV1**
> BankaccountGetCommunicationListV1Response bankaccountGetCommunicationListV1(pkiBankaccountID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBankaccountApi()
val pkiBankaccountID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BankaccountGetCommunicationListV1Response = apiInstance.bankaccountGetCommunicationListV1(pkiBankaccountID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBankaccountApi#bankaccountGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBankaccountApi#bankaccountGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBankaccountID** | **kotlin.Int**|  | |

### Return type

[**BankaccountGetCommunicationListV1Response**](BankaccountGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bankaccountGetCommunicationrecipientsV1"></a>
# **bankaccountGetCommunicationrecipientsV1**
> BankaccountGetCommunicationrecipientsV1Response bankaccountGetCommunicationrecipientsV1(pkiBankaccountID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBankaccountApi()
val pkiBankaccountID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BankaccountGetCommunicationrecipientsV1Response = apiInstance.bankaccountGetCommunicationrecipientsV1(pkiBankaccountID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBankaccountApi#bankaccountGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBankaccountApi#bankaccountGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBankaccountID** | **kotlin.Int**|  | |

### Return type

[**BankaccountGetCommunicationrecipientsV1Response**](BankaccountGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bankaccountGetCommunicationsendersV1"></a>
# **bankaccountGetCommunicationsendersV1**
> BankaccountGetCommunicationsendersV1Response bankaccountGetCommunicationsendersV1(pkiBankaccountID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBankaccountApi()
val pkiBankaccountID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BankaccountGetCommunicationsendersV1Response = apiInstance.bankaccountGetCommunicationsendersV1(pkiBankaccountID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBankaccountApi#bankaccountGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBankaccountApi#bankaccountGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBankaccountID** | **kotlin.Int**|  | |

### Return type

[**BankaccountGetCommunicationsendersV1Response**](BankaccountGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bankaccountGetListV1"></a>
# **bankaccountGetListV1**
> BankaccountGetListV1Response bankaccountGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Bankaccount list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eBankaccountType | Chequing&lt;br&gt;Trust |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBankaccountApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : BankaccountGetListV1Response = apiInstance.bankaccountGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBankaccountApi#bankaccountGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBankaccountApi#bankaccountGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiBankaccountID_ASC, pkiBankaccountID_DESC, sBankaccountBankname_ASC, sBankaccountBankname_DESC, sBankaccountTransit_ASC, sBankaccountTransit_DESC, sBankaccountInstitution_ASC, sBankaccountInstitution_DESC, sBankaccountAccount_ASC, sBankaccountAccount_DESC, sBankaccountNumber_ASC, sBankaccountNumber_DESC, eBankaccountType_ASC, eBankaccountType_DESC, bBankaccountCommissionprocessing_ASC, bBankaccountCommissionprocessing_DESC, bBankaccountIsactive_ASC, bBankaccountIsactive_DESC, iGlaccountCode_ASC, iGlaccountCode_DESC, sGlaccountDescriptionX_ASC, sGlaccountDescriptionX_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**BankaccountGetListV1Response**](BankaccountGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bankaccountImportIntoEDMV1"></a>
# **bankaccountImportIntoEDMV1**
> BankaccountImportIntoEDMV1Response bankaccountImportIntoEDMV1(pkiBankaccountID, bankaccountImportIntoEDMV1Request)

Import attachments into the Bankaccount

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBankaccountApi()
val pkiBankaccountID : kotlin.Int = 56 // kotlin.Int | 
val bankaccountImportIntoEDMV1Request : BankaccountImportIntoEDMV1Request =  // BankaccountImportIntoEDMV1Request | 
try {
    val result : BankaccountImportIntoEDMV1Response = apiInstance.bankaccountImportIntoEDMV1(pkiBankaccountID, bankaccountImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBankaccountApi#bankaccountImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBankaccountApi#bankaccountImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBankaccountID** | **kotlin.Int**|  | |
| **bankaccountImportIntoEDMV1Request** | [**BankaccountImportIntoEDMV1Request**](BankaccountImportIntoEDMV1Request.md)|  | |

### Return type

[**BankaccountImportIntoEDMV1Response**](BankaccountImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ObjectBankaccountApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**bankaccountBatchDownloadV1**](ObjectBankaccountApi.md#bankaccountBatchDownloadV1) | **POST** /1/object/bankaccount/{pkiBankaccountID}/batchDownload | Download multiples attachments from a Bankaccount |
| [**bankaccountGetAttachmentsV1**](ObjectBankaccountApi.md#bankaccountGetAttachmentsV1) | **GET** /1/object/bankaccount/{pkiBankaccountID}/getAttachments | Retrieve Bankaccount&#39;s attachments |
| [**bankaccountGetAutocompleteV2**](ObjectBankaccountApi.md#bankaccountGetAutocompleteV2) | **GET** /2/object/bankaccount/getAutocomplete/{sSelector} | Retrieve Bankaccounts and IDs |
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


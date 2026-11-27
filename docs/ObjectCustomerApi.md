# ObjectCustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**customerBatchDownloadV1**](ObjectCustomerApi.md#customerBatchDownloadV1) | **POST** /1/object/customer/{pkiCustomerID}/batchDownload | Download multiples attachments from a Customer |
| [**customerGetAttachmentsV1**](ObjectCustomerApi.md#customerGetAttachmentsV1) | **GET** /1/object/customer/{pkiCustomerID}/getAttachments | Retrieve Customer&#39;s attachments |
| [**customerGetAutocompleteV2**](ObjectCustomerApi.md#customerGetAutocompleteV2) | **GET** /2/object/customer/getAutocomplete/{sSelector} | Retrieve Customers and IDs |
| [**customerGetCommunicationCountV1**](ObjectCustomerApi.md#customerGetCommunicationCountV1) | **GET** /1/object/customer/{pkiCustomerID}/getCommunicationCount | Retrieve Communication count |
| [**customerGetCommunicationListV1**](ObjectCustomerApi.md#customerGetCommunicationListV1) | **GET** /1/object/customer/{pkiCustomerID}/getCommunicationList | Retrieve Communication list |
| [**customerGetCommunicationrecipientsV1**](ObjectCustomerApi.md#customerGetCommunicationrecipientsV1) | **GET** /1/object/customer/{pkiCustomerID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**customerGetCommunicationsendersV1**](ObjectCustomerApi.md#customerGetCommunicationsendersV1) | **GET** /1/object/customer/{pkiCustomerID}/getCommunicationsenders | Retrieve Communication senders |
| [**customerGetDocumenttypechecklistV1**](ObjectCustomerApi.md#customerGetDocumenttypechecklistV1) | **GET** /1/object/customer/{pkiCustomerID}/getDocumenttypechecklist | Retrieve Document type checklist |
| [**customerGetObjectV2**](ObjectCustomerApi.md#customerGetObjectV2) | **GET** /2/object/customer/{pkiCustomerID} | Retrieve an existing Customer |
| [**customerImportIntoEDMV1**](ObjectCustomerApi.md#customerImportIntoEDMV1) | **POST** /1/object/customer/{pkiCustomerID}/importIntoEDM | Import attachments into the Customer |
| [**customerSyncDocumenttypechecklistV1**](ObjectCustomerApi.md#customerSyncDocumenttypechecklistV1) | **POST** /1/object/customer/{pkiCustomerID}/syncDocumenttypechecklist | Synchronize Document type checklist |


<a id="customerBatchDownloadV1"></a>
# **customerBatchDownloadV1**
> java.io.File customerBatchDownloadV1(pkiCustomerID, customerBatchDownloadV1Request)

Download multiples attachments from a Customer

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | 
val customerBatchDownloadV1Request : CustomerBatchDownloadV1Request =  // CustomerBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.customerBatchDownloadV1(pkiCustomerID, customerBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int**|  | |
| **customerBatchDownloadV1Request** | [**CustomerBatchDownloadV1Request**](CustomerBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="customerGetAttachmentsV1"></a>
# **customerGetAttachmentsV1**
> CustomerGetAttachmentsV1Response customerGetAttachmentsV1(pkiCustomerID)

Retrieve Customer&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CustomerGetAttachmentsV1Response = apiInstance.customerGetAttachmentsV1(pkiCustomerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int**|  | |

### Return type

[**CustomerGetAttachmentsV1Response**](CustomerGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customerGetAutocompleteV2"></a>
# **customerGetAutocompleteV2**
> CustomerGetAutocompleteV2Response customerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Customers and IDs

Get the list of Customer to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Customers to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : CustomerGetAutocompleteV2Response = apiInstance.customerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sSelector** | **kotlin.String**| The type of Customers to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**CustomerGetAutocompleteV2Response**](CustomerGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customerGetCommunicationCountV1"></a>
# **customerGetCommunicationCountV1**
> CustomerGetCommunicationCountV1Response customerGetCommunicationCountV1(pkiCustomerID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CustomerGetCommunicationCountV1Response = apiInstance.customerGetCommunicationCountV1(pkiCustomerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int**|  | |

### Return type

[**CustomerGetCommunicationCountV1Response**](CustomerGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customerGetCommunicationListV1"></a>
# **customerGetCommunicationListV1**
> CustomerGetCommunicationListV1Response customerGetCommunicationListV1(pkiCustomerID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CustomerGetCommunicationListV1Response = apiInstance.customerGetCommunicationListV1(pkiCustomerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int**|  | |

### Return type

[**CustomerGetCommunicationListV1Response**](CustomerGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customerGetCommunicationrecipientsV1"></a>
# **customerGetCommunicationrecipientsV1**
> CustomerGetCommunicationrecipientsV1Response customerGetCommunicationrecipientsV1(pkiCustomerID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CustomerGetCommunicationrecipientsV1Response = apiInstance.customerGetCommunicationrecipientsV1(pkiCustomerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int**|  | |

### Return type

[**CustomerGetCommunicationrecipientsV1Response**](CustomerGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customerGetCommunicationsendersV1"></a>
# **customerGetCommunicationsendersV1**
> CustomerGetCommunicationsendersV1Response customerGetCommunicationsendersV1(pkiCustomerID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CustomerGetCommunicationsendersV1Response = apiInstance.customerGetCommunicationsendersV1(pkiCustomerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int**|  | |

### Return type

[**CustomerGetCommunicationsendersV1Response**](CustomerGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customerGetDocumenttypechecklistV1"></a>
# **customerGetDocumenttypechecklistV1**
> CustomerGetDocumenttypechecklistV1Response customerGetDocumenttypechecklistV1(pkiCustomerID)

Retrieve Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CustomerGetDocumenttypechecklistV1Response = apiInstance.customerGetDocumenttypechecklistV1(pkiCustomerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerGetDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerGetDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int**|  | |

### Return type

[**CustomerGetDocumenttypechecklistV1Response**](CustomerGetDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customerGetObjectV2"></a>
# **customerGetObjectV2**
> CustomerGetObjectV2Response customerGetObjectV2(pkiCustomerID)

Retrieve an existing Customer



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Customer
try {
    val result : CustomerGetObjectV2Response = apiInstance.customerGetObjectV2(pkiCustomerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int**| The unique ID of the Customer | |

### Return type

[**CustomerGetObjectV2Response**](CustomerGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customerImportIntoEDMV1"></a>
# **customerImportIntoEDMV1**
> CustomerImportIntoEDMV1Response customerImportIntoEDMV1(pkiCustomerID, customerImportIntoEDMV1Request)

Import attachments into the Customer



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | 
val customerImportIntoEDMV1Request : CustomerImportIntoEDMV1Request =  // CustomerImportIntoEDMV1Request | 
try {
    val result : CustomerImportIntoEDMV1Response = apiInstance.customerImportIntoEDMV1(pkiCustomerID, customerImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int**|  | |
| **customerImportIntoEDMV1Request** | [**CustomerImportIntoEDMV1Request**](CustomerImportIntoEDMV1Request.md)|  | |

### Return type

[**CustomerImportIntoEDMV1Response**](CustomerImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="customerSyncDocumenttypechecklistV1"></a>
# **customerSyncDocumenttypechecklistV1**
> CustomerSyncDocumenttypechecklistV1Response customerSyncDocumenttypechecklistV1(pkiCustomerID, body)

Synchronize Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : CustomerSyncDocumenttypechecklistV1Response = apiInstance.customerSyncDocumenttypechecklistV1(pkiCustomerID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerSyncDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerSyncDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**CustomerSyncDocumenttypechecklistV1Response**](CustomerSyncDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


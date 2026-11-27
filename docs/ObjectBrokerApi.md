# ObjectBrokerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**brokerBatchDownloadV1**](ObjectBrokerApi.md#brokerBatchDownloadV1) | **POST** /1/object/broker/{pkiBrokerID}/batchDownload | Download multiples attachments from a Broker |
| [**brokerGetAttachmentsV1**](ObjectBrokerApi.md#brokerGetAttachmentsV1) | **GET** /1/object/broker/{pkiBrokerID}/getAttachments | Retrieve Broker&#39;s attachments |
| [**brokerGetAutocompleteV2**](ObjectBrokerApi.md#brokerGetAutocompleteV2) | **GET** /2/object/broker/getAutocomplete/{sSelector} | Retrieve Brokers and IDs |
| [**brokerGetCommunicationCountV1**](ObjectBrokerApi.md#brokerGetCommunicationCountV1) | **GET** /1/object/broker/{pkiBrokerID}/getCommunicationCount | Retrieve Communication count |
| [**brokerGetCommunicationListV1**](ObjectBrokerApi.md#brokerGetCommunicationListV1) | **GET** /1/object/broker/{pkiBrokerID}/getCommunicationList | Retrieve Communication list |
| [**brokerGetCommunicationrecipientsV1**](ObjectBrokerApi.md#brokerGetCommunicationrecipientsV1) | **GET** /1/object/broker/{pkiBrokerID}/getCommunicationrecipients | Retrieve Communication recipients |
| [**brokerGetCommunicationsendersV1**](ObjectBrokerApi.md#brokerGetCommunicationsendersV1) | **GET** /1/object/broker/{pkiBrokerID}/getCommunicationsenders | Retrieve Communication senders |
| [**brokerGetDocumenttypechecklistV1**](ObjectBrokerApi.md#brokerGetDocumenttypechecklistV1) | **GET** /1/object/broker/{pkiBrokerID}/getDocumenttypechecklist | Retrieve Document type checklist |
| [**brokerGetListV1**](ObjectBrokerApi.md#brokerGetListV1) | **GET** /1/object/broker/getList | Retrieve Broker list |
| [**brokerImportIntoEDMV1**](ObjectBrokerApi.md#brokerImportIntoEDMV1) | **POST** /1/object/broker/{pkiBrokerID}/importIntoEDM | Import attachments into the Broker |
| [**brokerSyncDocumenttypechecklistV1**](ObjectBrokerApi.md#brokerSyncDocumenttypechecklistV1) | **POST** /1/object/broker/{pkiBrokerID}/syncDocumenttypechecklist | Synchronize Document type checklist |


<a id="brokerBatchDownloadV1"></a>
# **brokerBatchDownloadV1**
> java.io.File brokerBatchDownloadV1(pkiBrokerID, brokerBatchDownloadV1Request)

Download multiples attachments from a Broker

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrokerApi()
val pkiBrokerID : kotlin.Int = 56 // kotlin.Int | 
val brokerBatchDownloadV1Request : BrokerBatchDownloadV1Request =  // BrokerBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.brokerBatchDownloadV1(pkiBrokerID, brokerBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrokerApi#brokerBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrokerApi#brokerBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBrokerID** | **kotlin.Int**|  | |
| **brokerBatchDownloadV1Request** | [**BrokerBatchDownloadV1Request**](BrokerBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="brokerGetAttachmentsV1"></a>
# **brokerGetAttachmentsV1**
> BrokerGetAttachmentsV1Response brokerGetAttachmentsV1(pkiBrokerID)

Retrieve Broker&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrokerApi()
val pkiBrokerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BrokerGetAttachmentsV1Response = apiInstance.brokerGetAttachmentsV1(pkiBrokerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrokerApi#brokerGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrokerApi#brokerGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBrokerID** | **kotlin.Int**|  | |

### Return type

[**BrokerGetAttachmentsV1Response**](BrokerGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="brokerGetAutocompleteV2"></a>
# **brokerGetAutocompleteV2**
> BrokerGetAutocompleteV2Response brokerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Brokers and IDs

Get the list of Broker to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrokerApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Brokers to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : BrokerGetAutocompleteV2Response = apiInstance.brokerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrokerApi#brokerGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrokerApi#brokerGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sSelector** | **kotlin.String**| The type of Brokers to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**BrokerGetAutocompleteV2Response**](BrokerGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="brokerGetCommunicationCountV1"></a>
# **brokerGetCommunicationCountV1**
> BrokerGetCommunicationCountV1Response brokerGetCommunicationCountV1(pkiBrokerID)

Retrieve Communication count

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrokerApi()
val pkiBrokerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BrokerGetCommunicationCountV1Response = apiInstance.brokerGetCommunicationCountV1(pkiBrokerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrokerApi#brokerGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrokerApi#brokerGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBrokerID** | **kotlin.Int**|  | |

### Return type

[**BrokerGetCommunicationCountV1Response**](BrokerGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="brokerGetCommunicationListV1"></a>
# **brokerGetCommunicationListV1**
> BrokerGetCommunicationListV1Response brokerGetCommunicationListV1(pkiBrokerID)

Retrieve Communication list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrokerApi()
val pkiBrokerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BrokerGetCommunicationListV1Response = apiInstance.brokerGetCommunicationListV1(pkiBrokerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrokerApi#brokerGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrokerApi#brokerGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBrokerID** | **kotlin.Int**|  | |

### Return type

[**BrokerGetCommunicationListV1Response**](BrokerGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="brokerGetCommunicationrecipientsV1"></a>
# **brokerGetCommunicationrecipientsV1**
> BrokerGetCommunicationrecipientsV1Response brokerGetCommunicationrecipientsV1(pkiBrokerID)

Retrieve Communication recipients

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrokerApi()
val pkiBrokerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BrokerGetCommunicationrecipientsV1Response = apiInstance.brokerGetCommunicationrecipientsV1(pkiBrokerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrokerApi#brokerGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrokerApi#brokerGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBrokerID** | **kotlin.Int**|  | |

### Return type

[**BrokerGetCommunicationrecipientsV1Response**](BrokerGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="brokerGetCommunicationsendersV1"></a>
# **brokerGetCommunicationsendersV1**
> BrokerGetCommunicationsendersV1Response brokerGetCommunicationsendersV1(pkiBrokerID)

Retrieve Communication senders

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrokerApi()
val pkiBrokerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BrokerGetCommunicationsendersV1Response = apiInstance.brokerGetCommunicationsendersV1(pkiBrokerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrokerApi#brokerGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrokerApi#brokerGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBrokerID** | **kotlin.Int**|  | |

### Return type

[**BrokerGetCommunicationsendersV1Response**](BrokerGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="brokerGetDocumenttypechecklistV1"></a>
# **brokerGetDocumenttypechecklistV1**
> BrokerGetDocumenttypechecklistV1Response brokerGetDocumenttypechecklistV1(pkiBrokerID)

Retrieve Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrokerApi()
val pkiBrokerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BrokerGetDocumenttypechecklistV1Response = apiInstance.brokerGetDocumenttypechecklistV1(pkiBrokerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrokerApi#brokerGetDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrokerApi#brokerGetDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBrokerID** | **kotlin.Int**|  | |

### Return type

[**BrokerGetDocumenttypechecklistV1Response**](BrokerGetDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="brokerGetListV1"></a>
# **brokerGetListV1**
> BrokerGetListV1Response brokerGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Broker list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrokerApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : BrokerGetListV1Response = apiInstance.brokerGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrokerApi#brokerGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrokerApi#brokerGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiBrokerID_ASC, pkiBrokerID_DESC, fkiDepartmentID_ASC, fkiDepartmentID_DESC, sDepartmentNameX_ASC, sDepartmentNameX_DESC, sLanguageNameX_ASC, sLanguageNameX_DESC, fkiBrokertypeID_ASC, fkiBrokertypeID_DESC, sBrokertypeNameX_ASC, sBrokertypeNameX_DESC, sRealestateboardnumberNumber_ASC, sRealestateboardnumberNumber_DESC, sBrokerCode_ASC, sBrokerCode_DESC, iBrokerPhotocopiercode_ASC, iBrokerPhotocopiercode_DESC, iBrokerLongdistancecode_ASC, iBrokerLongdistancecode_DESC, sBrokerName_ASC, sBrokerName_DESC, iAgentBannernumber_ASC, iAgentBannernumber_DESC, sBrokerRealestateassociationlicense_ASC, sBrokerRealestateassociationlicense_DESC, dtBrokerHiredate_ASC, dtBrokerHiredate_DESC, dtBrokerLeavedate_ASC, dtBrokerLeavedate_DESC, bBrokerTranquillit_ASC, bBrokerTranquillit_DESC, bBrokerResidentiallicense_ASC, bBrokerResidentiallicense_DESC, bBrokerCommerciallicense_ASC, bBrokerCommerciallicense_DESC, bBrokerMortgagelicense_ASC, bBrokerMortgagelicense_DESC, bBrokerPaidbyofficetranquillit_ASC, bBrokerPaidbyofficetranquillit_DESC, dtBrokerFintraccertification_ASC, dtBrokerFintraccertification_DESC, sContactFirstname_ASC, sContactFirstname_DESC, sContactLastname_ASC, sContactLastname_DESC, dtContactBirthdate_ASC, dtContactBirthdate_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sPhoneE164_ASC, sPhoneE164_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC, bBrokerIsactive_ASC, bBrokerIsactive_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**BrokerGetListV1Response**](BrokerGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="brokerImportIntoEDMV1"></a>
# **brokerImportIntoEDMV1**
> BrokerImportIntoEDMV1Response brokerImportIntoEDMV1(pkiBrokerID, brokerImportIntoEDMV1Request)

Import attachments into the Broker



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrokerApi()
val pkiBrokerID : kotlin.Int = 56 // kotlin.Int | 
val brokerImportIntoEDMV1Request : BrokerImportIntoEDMV1Request =  // BrokerImportIntoEDMV1Request | 
try {
    val result : BrokerImportIntoEDMV1Response = apiInstance.brokerImportIntoEDMV1(pkiBrokerID, brokerImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrokerApi#brokerImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrokerApi#brokerImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBrokerID** | **kotlin.Int**|  | |
| **brokerImportIntoEDMV1Request** | [**BrokerImportIntoEDMV1Request**](BrokerImportIntoEDMV1Request.md)|  | |

### Return type

[**BrokerImportIntoEDMV1Response**](BrokerImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="brokerSyncDocumenttypechecklistV1"></a>
# **brokerSyncDocumenttypechecklistV1**
> BrokerSyncDocumenttypechecklistV1Response brokerSyncDocumenttypechecklistV1(pkiBrokerID, body)

Synchronize Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrokerApi()
val pkiBrokerID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : BrokerSyncDocumenttypechecklistV1Response = apiInstance.brokerSyncDocumenttypechecklistV1(pkiBrokerID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrokerApi#brokerSyncDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrokerApi#brokerSyncDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBrokerID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**BrokerSyncDocumenttypechecklistV1Response**](BrokerSyncDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


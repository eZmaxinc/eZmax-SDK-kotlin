# ObjectAgentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**agentBatchDownloadV1**](ObjectAgentApi.md#agentBatchDownloadV1) | **POST** /1/object/agent/{pkiAgentID}/batchDownload | Download multiples attachments from a Agent |
| [**agentGetAttachmentsV1**](ObjectAgentApi.md#agentGetAttachmentsV1) | **GET** /1/object/agent/{pkiAgentID}/getAttachments | Retrieve Agent&#39;s attachments |
| [**agentGetAutocompleteV2**](ObjectAgentApi.md#agentGetAutocompleteV2) | **GET** /2/object/agent/getAutocomplete/{sSelector} | Retrieve Agents and IDs |
| [**agentGetListV1**](ObjectAgentApi.md#agentGetListV1) | **GET** /1/object/agent/getList | Retrieve Agent list |
| [**agentImportIntoEDMV1**](ObjectAgentApi.md#agentImportIntoEDMV1) | **POST** /1/object/agent/{pkiAgentID}/importIntoEDM | Import attachments into the Agent |


<a id="agentBatchDownloadV1"></a>
# **agentBatchDownloadV1**
> java.io.File agentBatchDownloadV1(pkiAgentID, agentBatchDownloadV1Request)

Download multiples attachments from a Agent

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAgentApi()
val pkiAgentID : kotlin.Int = 56 // kotlin.Int | 
val agentBatchDownloadV1Request : AgentBatchDownloadV1Request =  // AgentBatchDownloadV1Request | 
try {
    val result : java.io.File = apiInstance.agentBatchDownloadV1(pkiAgentID, agentBatchDownloadV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAgentApi#agentBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAgentApi#agentBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAgentID** | **kotlin.Int**|  | |
| **agentBatchDownloadV1Request** | [**AgentBatchDownloadV1Request**](AgentBatchDownloadV1Request.md)|  | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="agentGetAttachmentsV1"></a>
# **agentGetAttachmentsV1**
> AgentGetAttachmentsV1Response agentGetAttachmentsV1(pkiAgentID)

Retrieve Agent&#39;s attachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAgentApi()
val pkiAgentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AgentGetAttachmentsV1Response = apiInstance.agentGetAttachmentsV1(pkiAgentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAgentApi#agentGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAgentApi#agentGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAgentID** | **kotlin.Int**|  | |

### Return type

[**AgentGetAttachmentsV1Response**](AgentGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="agentGetAutocompleteV2"></a>
# **agentGetAutocompleteV2**
> AgentGetAutocompleteV2Response agentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Agents and IDs

Get the list of Agent to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAgentApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Agents to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : AgentGetAutocompleteV2Response = apiInstance.agentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAgentApi#agentGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAgentApi#agentGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sSelector** | **kotlin.String**| The type of Agents to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**AgentGetAutocompleteV2Response**](AgentGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="agentGetListV1"></a>
# **agentGetListV1**
> AgentGetListV1Response agentGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Agent list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAgentApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : AgentGetListV1Response = apiInstance.agentGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAgentApi#agentGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAgentApi#agentGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiAgentID_ASC, pkiAgentID_DESC, fkiAgenttypeID_ASC, fkiAgenttypeID_DESC, sAgenttypeNameX_ASC, sAgenttypeNameX_DESC, fkiAgentincorporationID_ASC, fkiAgentincorporationID_DESC, sAgentincorporationName_ASC, sAgentincorporationName_DESC, fkiDepartmentID_ASC, fkiDepartmentID_DESC, sDepartmentNameX_ASC, sDepartmentNameX_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, sLanguageNameX_ASC, sLanguageNameX_DESC, sRealestateboardnumberNumber_ASC, sRealestateboardnumberNumber_DESC, sAgentCode_ASC, sAgentCode_DESC, iAgentPhotocopiercode_ASC, iAgentPhotocopiercode_DESC, iAgentLongdistancecode_ASC, iAgentLongdistancecode_DESC, iAgentBannernumber_ASC, iAgentBannernumber_DESC, sAgentRealestateassociationlicense_ASC, sAgentRealestateassociationlicense_DESC, dtAgentPermitexpiration_ASC, dtAgentPermitexpiration_DESC, dtAgentHiredate_ASC, dtAgentHiredate_DESC, dtAgentLeavedate_ASC, dtAgentLeavedate_DESC, bAgentTranquillit_ASC, bAgentTranquillit_DESC, bAgentResidentiallicense_ASC, bAgentResidentiallicense_DESC, bAgentCommerciallicense_ASC, bAgentCommerciallicense_DESC, bAgentMortgagelicense_ASC, bAgentMortgagelicense_DESC, bAgentPaidbyofficetranquillit_ASC, bAgentPaidbyofficetranquillit_DESC, dtAgentFintraccertification_ASC, dtAgentFintraccertification_DESC, sContactFirstname_ASC, sContactFirstname_DESC, sContactLastname_ASC, sContactLastname_DESC, dtContactBirthdate_ASC, dtContactBirthdate_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sPhoneE164_ASC, sPhoneE164_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC, bAgentIsactive_ASC, bAgentIsactive_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**AgentGetListV1Response**](AgentGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="agentImportIntoEDMV1"></a>
# **agentImportIntoEDMV1**
> AgentImportIntoEDMV1Response agentImportIntoEDMV1(pkiAgentID, agentImportIntoEDMV1Request)

Import attachments into the Agent



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAgentApi()
val pkiAgentID : kotlin.Int = 56 // kotlin.Int | 
val agentImportIntoEDMV1Request : AgentImportIntoEDMV1Request =  // AgentImportIntoEDMV1Request | 
try {
    val result : AgentImportIntoEDMV1Response = apiInstance.agentImportIntoEDMV1(pkiAgentID, agentImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAgentApi#agentImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAgentApi#agentImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAgentID** | **kotlin.Int**|  | |
| **agentImportIntoEDMV1Request** | [**AgentImportIntoEDMV1Request**](AgentImportIntoEDMV1Request.md)|  | |

### Return type

[**AgentImportIntoEDMV1Response**](AgentImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


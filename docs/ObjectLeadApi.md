# ObjectLeadApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**leadGetListV1**](ObjectLeadApi.md#leadGetListV1) | **GET** /1/object/lead/getList | Retrieve Lead list |
| [**leadImportIntoEDMV1**](ObjectLeadApi.md#leadImportIntoEDMV1) | **POST** /1/object/lead/{pkiLeadID}/importIntoEDM | Import attachments into the Lead |


<a id="leadGetListV1"></a>
# **leadGetListV1**
> LeadGetListV1Response leadGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Lead list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eLeadStatus | New&lt;br&gt;Dispatching&lt;br&gt;Assigned&lt;br&gt;Lost&lt;br&gt;Won |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : LeadGetListV1Response = apiInstance.leadGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiLeadID_ASC, pkiLeadID_DESC, fkiLeadsourceID_ASC, fkiLeadsourceID_DESC, sLeadsourceNameX_ASC, sLeadsourceNameX_DESC, eLeadStatus_ASC, eLeadStatus_DESC, dtLeadExpiration_ASC, dtLeadExpiration_DESC, bLeadIsactive_ASC, bLeadIsactive_DESC, sLeadCode_ASC, sLeadCode_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**LeadGetListV1Response**](LeadGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="leadImportIntoEDMV1"></a>
# **leadImportIntoEDMV1**
> LeadImportIntoEDMV1Response leadImportIntoEDMV1(pkiLeadID, leadImportIntoEDMV1Request)

Import attachments into the Lead



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectLeadApi()
val pkiLeadID : kotlin.Int = 56 // kotlin.Int | 
val leadImportIntoEDMV1Request : LeadImportIntoEDMV1Request =  // LeadImportIntoEDMV1Request | 
try {
    val result : LeadImportIntoEDMV1Response = apiInstance.leadImportIntoEDMV1(pkiLeadID, leadImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectLeadApi#leadImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectLeadApi#leadImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiLeadID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leadImportIntoEDMV1Request** | [**LeadImportIntoEDMV1Request**](LeadImportIntoEDMV1Request.md)|  | |

### Return type

[**LeadImportIntoEDMV1Response**](LeadImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


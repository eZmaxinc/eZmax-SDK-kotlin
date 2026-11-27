# ObjectDocumenttypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**documenttypeCreateObjectV1**](ObjectDocumenttypeApi.md#documenttypeCreateObjectV1) | **POST** /1/object/documenttype | Create a new Documenttype |
| [**documenttypeEditObjectV1**](ObjectDocumenttypeApi.md#documenttypeEditObjectV1) | **PUT** /1/object/documenttype/{pkiDocumenttypeID} | Edit an existing Documenttype |
| [**documenttypeGetAutocompleteV2**](ObjectDocumenttypeApi.md#documenttypeGetAutocompleteV2) | **GET** /2/object/documenttype/getAutocomplete/{sSelector} | Retrieve Documenttypes and IDs |
| [**documenttypeGetListV1**](ObjectDocumenttypeApi.md#documenttypeGetListV1) | **GET** /1/object/documenttype/getList | Retrieve Documenttype list |
| [**documenttypeGetObjectV2**](ObjectDocumenttypeApi.md#documenttypeGetObjectV2) | **GET** /2/object/documenttype/{pkiDocumenttypeID} | Retrieve an existing Documenttype |


<a id="documenttypeCreateObjectV1"></a>
# **documenttypeCreateObjectV1**
> DocumenttypeCreateObjectV1Response documenttypeCreateObjectV1(documenttypeCreateObjectV1Request)

Create a new Documenttype

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDocumenttypeApi()
val documenttypeCreateObjectV1Request : DocumenttypeCreateObjectV1Request =  // DocumenttypeCreateObjectV1Request | 
try {
    val result : DocumenttypeCreateObjectV1Response = apiInstance.documenttypeCreateObjectV1(documenttypeCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDocumenttypeApi#documenttypeCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDocumenttypeApi#documenttypeCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documenttypeCreateObjectV1Request** | [**DocumenttypeCreateObjectV1Request**](DocumenttypeCreateObjectV1Request.md)|  | |

### Return type

[**DocumenttypeCreateObjectV1Response**](DocumenttypeCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="documenttypeEditObjectV1"></a>
# **documenttypeEditObjectV1**
> DocumenttypeEditObjectV1Response documenttypeEditObjectV1(pkiDocumenttypeID, documenttypeEditObjectV1Request)

Edit an existing Documenttype



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDocumenttypeApi()
val pkiDocumenttypeID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Documenttype
val documenttypeEditObjectV1Request : DocumenttypeEditObjectV1Request =  // DocumenttypeEditObjectV1Request | 
try {
    val result : DocumenttypeEditObjectV1Response = apiInstance.documenttypeEditObjectV1(pkiDocumenttypeID, documenttypeEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDocumenttypeApi#documenttypeEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDocumenttypeApi#documenttypeEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDocumenttypeID** | **kotlin.Int**| The unique ID of the Documenttype | |
| **documenttypeEditObjectV1Request** | [**DocumenttypeEditObjectV1Request**](DocumenttypeEditObjectV1Request.md)|  | |

### Return type

[**DocumenttypeEditObjectV1Response**](DocumenttypeEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="documenttypeGetAutocompleteV2"></a>
# **documenttypeGetAutocompleteV2**
> DocumenttypeGetAutocompleteV2Response documenttypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Documenttypes and IDs

Get the list of Documenttype to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDocumenttypeApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Documenttypes to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : DocumenttypeGetAutocompleteV2Response = apiInstance.documenttypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDocumenttypeApi#documenttypeGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDocumenttypeApi#documenttypeGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sSelector** | **kotlin.String**| The type of Documenttypes to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**DocumenttypeGetAutocompleteV2Response**](DocumenttypeGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="documenttypeGetListV1"></a>
# **documenttypeGetListV1**
> DocumenttypeGetListV1Response documenttypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Documenttype list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eDocumenttypeEzcom | PromiseToPurchase&lt;br&gt;Annex&lt;br&gt;Modification&lt;br&gt;CounterOffer&lt;br&gt;Conditions&lt;br&gt;BankApproval&lt;br&gt;Other | | eDocumenttypePrivacydefault | Administration&lt;br&gt;Administrator&lt;br&gt;All&lt;br&gt;Creator&lt;br&gt;Inscriptor&lt;br&gt;Myself&lt;br&gt;Seller | | eDocumenttypeStatusdefault | Not required&lt;br&gt;Required | | eDocumenttypeSalebyowner | All&lt;br&gt;Yes&lt;br&gt;No | | eDocumenttypeSaledisplaybyrole | InscriptorSeller&lt;br&gt;Inscriptor&lt;br&gt;Seller | | eDocumenttypeTransactiontype | All&lt;br&gt;Inscriptor&lt;br&gt;InscriptorOnly&lt;br&gt;Seller&lt;br&gt;SellerOnly&lt;br&gt;InscriptorSeller | | eDocumenttypeRepossession | All&lt;br&gt;No&lt;br&gt;Yes |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDocumenttypeApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : DocumenttypeGetListV1Response = apiInstance.documenttypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDocumenttypeApi#documenttypeGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDocumenttypeApi#documenttypeGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiDocumenttypeID_ASC, pkiDocumenttypeID_DESC, sDocumenttypeNameX_ASC, sDocumenttypeNameX_DESC, sDocumenttypeDefaultfilename_ASC, sDocumenttypeDefaultfilename_DESC, bDocumenttypeShowagent_ASC, bDocumenttypeShowagent_DESC, bDocumenttypeIsactive_ASC, bDocumenttypeIsactive_DESC, bDocumenttypeSale_ASC, bDocumenttypeSale_DESC, bDocumenttypeRental_ASC, bDocumenttypeRental_DESC, bDocumenttypeReference_ASC, bDocumenttypeReference_DESC, bDocumenttypeMortgagereference_ASC, bDocumenttypeMortgagereference_DESC, bDocumenttypeEvaluation_ASC, bDocumenttypeEvaluation_DESC, bDocumenttypeConsultation_ASC, bDocumenttypeConsultation_DESC, bDocumenttypeOtherservices_ASC, bDocumenttypeOtherservices_DESC, bDocumenttypeForeclosedsale_ASC, bDocumenttypeForeclosedsale_DESC, bDocumenttypeCommercialfunding_ASC, bDocumenttypeCommercialfunding_DESC, bDocumenttypeCanafe_ASC, bDocumenttypeCanafe_DESC, eDocumenttypeEzcom_ASC, eDocumenttypeEzcom_DESC, eDocumenttypePrivacydefault_ASC, eDocumenttypePrivacydefault_DESC, eDocumenttypeStatusdefault_ASC, eDocumenttypeStatusdefault_DESC, eDocumenttypeSalebyowner_ASC, eDocumenttypeSalebyowner_DESC, eDocumenttypeSaledisplaybyrole_ASC, eDocumenttypeSaledisplaybyrole_DESC, eDocumenttypeTransactiontype_ASC, eDocumenttypeTransactiontype_DESC, eDocumenttypeRepossession_ASC, eDocumenttypeRepossession_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**DocumenttypeGetListV1Response**](DocumenttypeGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="documenttypeGetObjectV2"></a>
# **documenttypeGetObjectV2**
> DocumenttypeGetObjectV2Response documenttypeGetObjectV2(pkiDocumenttypeID)

Retrieve an existing Documenttype



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDocumenttypeApi()
val pkiDocumenttypeID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Documenttype
try {
    val result : DocumenttypeGetObjectV2Response = apiInstance.documenttypeGetObjectV2(pkiDocumenttypeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDocumenttypeApi#documenttypeGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDocumenttypeApi#documenttypeGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDocumenttypeID** | **kotlin.Int**| The unique ID of the Documenttype | |

### Return type

[**DocumenttypeGetObjectV2Response**](DocumenttypeGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectEzsigntemplateApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplateCopyV1**](ObjectEzsigntemplateApi.md#ezsigntemplateCopyV1) | **POST** /1/object/ezsigntemplate/{pkiEzsigntemplateID}/copy | Copy the Ezsigntemplate
[**ezsigntemplateCreateObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateCreateObjectV1) | **POST** /1/object/ezsigntemplate | Create a new Ezsigntemplate
[**ezsigntemplateDeleteObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateDeleteObjectV1) | **DELETE** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Delete an existing Ezsigntemplate
[**ezsigntemplateEditObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateEditObjectV1) | **PUT** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Edit an existing Ezsigntemplate
[**ezsigntemplateGetAutocompleteV2**](ObjectEzsigntemplateApi.md#ezsigntemplateGetAutocompleteV2) | **GET** /2/object/ezsigntemplate/getAutocomplete/{sSelector} | Retrieve Ezsigntemplates and IDs
[**ezsigntemplateGetListV1**](ObjectEzsigntemplateApi.md#ezsigntemplateGetListV1) | **GET** /1/object/ezsigntemplate/getList | Retrieve Ezsigntemplate list
[**ezsigntemplateGetObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateGetObjectV1) | **GET** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Retrieve an existing Ezsigntemplate
[**ezsigntemplateGetObjectV2**](ObjectEzsigntemplateApi.md#ezsigntemplateGetObjectV2) | **GET** /2/object/ezsigntemplate/{pkiEzsigntemplateID} | Retrieve an existing Ezsigntemplate


<a id="ezsigntemplateCopyV1"></a>
# **ezsigntemplateCopyV1**
> EzsigntemplateMinusCopyMinusV1MinusResponse ezsigntemplateCopyV1(pkiEzsigntemplateID, ezsigntemplateMinusCopyMinusV1MinusRequest)

Copy the Ezsigntemplate



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val pkiEzsigntemplateID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplateMinusCopyMinusV1MinusRequest : EzsigntemplateMinusCopyMinusV1MinusRequest =  // EzsigntemplateMinusCopyMinusV1MinusRequest | 
try {
    val result : EzsigntemplateMinusCopyMinusV1MinusResponse = apiInstance.ezsigntemplateCopyV1(pkiEzsigntemplateID, ezsigntemplateMinusCopyMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateCopyV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateCopyV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateID** | **kotlin.Int**|  |
 **ezsigntemplateMinusCopyMinusV1MinusRequest** | [**EzsigntemplateMinusCopyMinusV1MinusRequest**](EzsigntemplateMinusCopyMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplateMinusCopyMinusV1MinusResponse**](EzsigntemplateMinusCopyMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateCreateObjectV1"></a>
# **ezsigntemplateCreateObjectV1**
> EzsigntemplateMinusCreateObjectMinusV1MinusResponse ezsigntemplateCreateObjectV1(ezsigntemplateMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsigntemplate

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val ezsigntemplateMinusCreateObjectMinusV1MinusRequest : EzsigntemplateMinusCreateObjectMinusV1MinusRequest =  // EzsigntemplateMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplateMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsigntemplateCreateObjectV1(ezsigntemplateMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplateMinusCreateObjectMinusV1MinusRequest** | [**EzsigntemplateMinusCreateObjectMinusV1MinusRequest**](EzsigntemplateMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplateMinusCreateObjectMinusV1MinusResponse**](EzsigntemplateMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateDeleteObjectV1"></a>
# **ezsigntemplateDeleteObjectV1**
> EzsigntemplateMinusDeleteObjectMinusV1MinusResponse ezsigntemplateDeleteObjectV1(pkiEzsigntemplateID)

Delete an existing Ezsigntemplate



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val pkiEzsigntemplateID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplateMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsigntemplateDeleteObjectV1(pkiEzsigntemplateID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplateMinusDeleteObjectMinusV1MinusResponse**](EzsigntemplateMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplateEditObjectV1"></a>
# **ezsigntemplateEditObjectV1**
> EzsigntemplateMinusEditObjectMinusV1MinusResponse ezsigntemplateEditObjectV1(pkiEzsigntemplateID, ezsigntemplateMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsigntemplate



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val pkiEzsigntemplateID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplateMinusEditObjectMinusV1MinusRequest : EzsigntemplateMinusEditObjectMinusV1MinusRequest =  // EzsigntemplateMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplateMinusEditObjectMinusV1MinusResponse = apiInstance.ezsigntemplateEditObjectV1(pkiEzsigntemplateID, ezsigntemplateMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateID** | **kotlin.Int**|  |
 **ezsigntemplateMinusEditObjectMinusV1MinusRequest** | [**EzsigntemplateMinusEditObjectMinusV1MinusRequest**](EzsigntemplateMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplateMinusEditObjectMinusV1MinusResponse**](EzsigntemplateMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateGetAutocompleteV2"></a>
# **ezsigntemplateGetAutocompleteV2**
> EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse ezsigntemplateGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsigntemplates and IDs

Get the list of Ezsigntemplate to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezsigntemplates to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse = apiInstance.ezsigntemplateGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Ezsigntemplates to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse**](EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplateGetListV1"></a>
# **ezsigntemplateGetListV1**
> EzsigntemplateMinusGetListMinusV1MinusResponse ezsigntemplateGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsigntemplate list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplateType | Company&lt;br&gt;Team&lt;br&gt;User&lt;br&gt;Usergroup | 

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzsigntemplateMinusGetListMinusV1MinusResponse = apiInstance.ezsigntemplateGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsigntemplateID_ASC, pkiEzsigntemplateID_DESC, fkiTeamID_ASC, fkiTeamID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, fkiUserIDOwner_ASC, fkiUserIDOwner_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, eEzsigntemplateType_ASC, eEzsigntemplateType_DESC, sEzsigntemplateTypedescriptionX_ASC, sEzsigntemplateTypedescriptionX_DESC, sEzsigntemplatedocumentDescription_ASC, sEzsigntemplatedocumentDescription_DESC, iEzsigntemplatedocumentPagetotal_ASC, iEzsigntemplatedocumentPagetotal_DESC, iEzsigntemplateSignaturetotal_ASC, iEzsigntemplateSignaturetotal_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional] [default to 10000]
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**EzsigntemplateMinusGetListMinusV1MinusResponse**](EzsigntemplateMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplateGetObjectV1"></a>
# **ezsigntemplateGetObjectV1**
> EzsigntemplateMinusGetObjectMinusV1MinusResponse ezsigntemplateGetObjectV1(pkiEzsigntemplateID)

Retrieve an existing Ezsigntemplate



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val pkiEzsigntemplateID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplateMinusGetObjectMinusV1MinusResponse = apiInstance.ezsigntemplateGetObjectV1(pkiEzsigntemplateID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplateMinusGetObjectMinusV1MinusResponse**](EzsigntemplateMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplateGetObjectV2"></a>
# **ezsigntemplateGetObjectV2**
> EzsigntemplateMinusGetObjectMinusV2MinusResponse ezsigntemplateGetObjectV2(pkiEzsigntemplateID)

Retrieve an existing Ezsigntemplate



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val pkiEzsigntemplateID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplateMinusGetObjectMinusV2MinusResponse = apiInstance.ezsigntemplateGetObjectV2(pkiEzsigntemplateID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplateMinusGetObjectMinusV2MinusResponse**](EzsigntemplateMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


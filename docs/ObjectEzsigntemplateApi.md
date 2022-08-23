# ObjectEzsigntemplateApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplateCreateObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateCreateObjectV1) | **POST** /1/object/ezsigntemplate | Create a new Ezsigntemplate
[**ezsigntemplateDeleteObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateDeleteObjectV1) | **DELETE** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Delete an existing Ezsigntemplate
[**ezsigntemplateEditObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateEditObjectV1) | **PUT** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Edit an existing Ezsigntemplate
[**ezsigntemplateGetAutocompleteV1**](ObjectEzsigntemplateApi.md#ezsigntemplateGetAutocompleteV1) | **GET** /1/object/ezsigntemplate/getAutocomplete/{sSelector} | Retrieve Ezsigntemplate and IDs
[**ezsigntemplateGetListV1**](ObjectEzsigntemplateApi.md#ezsigntemplateGetListV1) | **GET** /1/object/ezsigntemplate/getList | Retrieve Ezsigntemplate list
[**ezsigntemplateGetObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateGetObjectV1) | **GET** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Retrieve an existing Ezsigntemplate


<a name="ezsigntemplateCreateObjectV1"></a>
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

<a name="ezsigntemplateDeleteObjectV1"></a>
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

<a name="ezsigntemplateEditObjectV1"></a>
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

<a name="ezsigntemplateGetAutocompleteV1"></a>
# **ezsigntemplateGetAutocompleteV1**
> CommonMinusGetAutocompleteMinusV1MinusResponse ezsigntemplateGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsigntemplate and IDs

Get the list of Ezsigntemplate to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezsigntemplate to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : CommonMinusGetAutocompleteMinusV1MinusResponse = apiInstance.ezsigntemplateGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetAutocompleteV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetAutocompleteV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Ezsigntemplate to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**CommonMinusGetAutocompleteMinusV1MinusResponse**](CommonMinusGetAutocompleteMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplateGetListV1"></a>
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
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional]
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

<a name="ezsigntemplateGetObjectV1"></a>
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


# ObjectEzsignfoldertypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfoldertypeGetAutocompleteV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetAutocompleteV1) | **GET** /1/object/ezsignfoldertype/getAutocomplete/{sSelector}/ | Retrieve Ezsignfoldertypes and IDs
[**ezsignfoldertypeGetListV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetListV1) | **GET** /1/object/ezsignfoldertype/getList | Retrieve Ezsignfoldertype list


<a name="ezsignfoldertypeGetAutocompleteV1"></a>
# **ezsignfoldertypeGetAutocompleteV1**
> CommonMinusGetAutocompleteMinusV1MinusResponse ezsignfoldertypeGetAutocompleteV1(sSelector, acceptLanguage, sQuery)

Retrieve Ezsignfoldertypes and IDs

Get the list of Ezsignfoldertypes to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldertypeApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezsignfoldertypes to return
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
try {
    val result : CommonMinusGetAutocompleteMinusV1MinusResponse = apiInstance.ezsignfoldertypeGetAutocompleteV1(sSelector, acceptLanguage, sQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetAutocompleteV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetAutocompleteV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Ezsignfoldertypes to return | [enum: Active, All]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]

### Return type

[**CommonMinusGetAutocompleteMinusV1MinusResponse**](CommonMinusGetAutocompleteMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignfoldertypeGetListV1"></a>
# **ezsignfoldertypeGetListV1**
> EzsignfoldertypeMinusGetListMinusV1MinusResponse ezsignfoldertypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignfoldertype list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldertypeApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzsignfoldertypeMinusGetListMinusV1MinusResponse = apiInstance.ezsignfoldertypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignfoldertypeID_ASC, pkiEzsignfoldertypeID_DESC, eEzsignfoldertypePrivacylevel_ASC, eEzsignfoldertypePrivacylevel_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, bEzsignfoldertypeIsactive_ASC, bEzsignfoldertypeIsactive_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**EzsignfoldertypeMinusGetListMinusV1MinusResponse**](EzsignfoldertypeMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet


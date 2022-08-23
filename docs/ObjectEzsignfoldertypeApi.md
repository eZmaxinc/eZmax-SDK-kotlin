# ObjectEzsignfoldertypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfoldertypeCreateObjectV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeCreateObjectV1) | **POST** /1/object/ezsignfoldertype | Create a new Ezsignfoldertype
[**ezsignfoldertypeEditObjectV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeEditObjectV1) | **PUT** /1/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Edit an existing Ezsignfoldertype
[**ezsignfoldertypeGetAutocompleteV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetAutocompleteV1) | **GET** /1/object/ezsignfoldertype/getAutocomplete/{sSelector} | Retrieve Ezsignfoldertypes and IDs
[**ezsignfoldertypeGetListV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetListV1) | **GET** /1/object/ezsignfoldertype/getList | Retrieve Ezsignfoldertype list
[**ezsignfoldertypeGetObjectV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetObjectV1) | **GET** /1/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Retrieve an existing Ezsignfoldertype


<a name="ezsignfoldertypeCreateObjectV1"></a>
# **ezsignfoldertypeCreateObjectV1**
> EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse ezsignfoldertypeCreateObjectV1(ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsignfoldertype

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldertypeApi()
val ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest : EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest =  // EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsignfoldertypeCreateObjectV1(ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest** | [**EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest**](EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse**](EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignfoldertypeEditObjectV1"></a>
# **ezsignfoldertypeEditObjectV1**
> EzsignfoldertypeMinusEditObjectMinusV1MinusResponse ezsignfoldertypeEditObjectV1(pkiEzsignfoldertypeID, ezsignfoldertypeMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsignfoldertype



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldertypeApi()
val pkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfoldertypeMinusEditObjectMinusV1MinusRequest : EzsignfoldertypeMinusEditObjectMinusV1MinusRequest =  // EzsignfoldertypeMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsignfoldertypeMinusEditObjectMinusV1MinusResponse = apiInstance.ezsignfoldertypeEditObjectV1(pkiEzsignfoldertypeID, ezsignfoldertypeMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldertypeID** | **kotlin.Int**|  |
 **ezsignfoldertypeMinusEditObjectMinusV1MinusRequest** | [**EzsignfoldertypeMinusEditObjectMinusV1MinusRequest**](EzsignfoldertypeMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignfoldertypeMinusEditObjectMinusV1MinusResponse**](EzsignfoldertypeMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignfoldertypeGetAutocompleteV1"></a>
# **ezsignfoldertypeGetAutocompleteV1**
> CommonMinusGetAutocompleteMinusV1MinusResponse ezsignfoldertypeGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsignfoldertypes and IDs

Get the list of Ezsignfoldertypes to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldertypeApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezsignfoldertypes to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : CommonMinusGetAutocompleteMinusV1MinusResponse = apiInstance.ezsignfoldertypeGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)
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
 - **Accept**: application/json

<a name="ezsignfoldertypeGetObjectV1"></a>
# **ezsignfoldertypeGetObjectV1**
> EzsignfoldertypeMinusGetObjectMinusV1MinusResponse ezsignfoldertypeGetObjectV1(pkiEzsignfoldertypeID)

Retrieve an existing Ezsignfoldertype



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldertypeApi()
val pkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfoldertypeMinusGetObjectMinusV1MinusResponse = apiInstance.ezsignfoldertypeGetObjectV1(pkiEzsignfoldertypeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldertypeID** | **kotlin.Int**|  |

### Return type

[**EzsignfoldertypeMinusGetObjectMinusV1MinusResponse**](EzsignfoldertypeMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


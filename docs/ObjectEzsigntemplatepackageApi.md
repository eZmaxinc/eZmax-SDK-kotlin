# ObjectEzsigntemplatepackageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatepackageCreateObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageCreateObjectV1) | **POST** /1/object/ezsigntemplatepackage | Create a new Ezsigntemplatepackage
[**ezsigntemplatepackageDeleteObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Delete an existing Ezsigntemplatepackage
[**ezsigntemplatepackageEditEzsigntemplatepackagesignersV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditEzsigntemplatepackagesignersV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}/editEzsigntemplatepackagesigners | Edit multiple Ezsigntemplatepackagesigners
[**ezsigntemplatepackageEditObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditObjectV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Edit an existing Ezsigntemplatepackage
[**ezsigntemplatepackageGetAutocompleteV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetAutocompleteV1) | **GET** /1/object/ezsigntemplatepackage/getAutocomplete/{sSelector} | Retrieve Ezsigntemplatepackages and IDs
[**ezsigntemplatepackageGetAutocompleteV2**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetAutocompleteV2) | **GET** /2/object/ezsigntemplatepackage/getAutocomplete/{sSelector} | Retrieve Ezsigntemplatepackages and IDs
[**ezsigntemplatepackageGetListV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetListV1) | **GET** /1/object/ezsigntemplatepackage/getList | Retrieve Ezsigntemplatepackage list
[**ezsigntemplatepackageGetObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetObjectV1) | **GET** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Retrieve an existing Ezsigntemplatepackage
[**ezsigntemplatepackageGetObjectV2**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetObjectV2) | **GET** /2/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Retrieve an existing Ezsigntemplatepackage


<a name="ezsigntemplatepackageCreateObjectV1"></a>
# **ezsigntemplatepackageCreateObjectV1**
> EzsigntemplatepackageMinusCreateObjectMinusV1MinusResponse ezsigntemplatepackageCreateObjectV1(ezsigntemplatepackageMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsigntemplatepackage

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val ezsigntemplatepackageMinusCreateObjectMinusV1MinusRequest : EzsigntemplatepackageMinusCreateObjectMinusV1MinusRequest =  // EzsigntemplatepackageMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatepackageMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackageCreateObjectV1(ezsigntemplatepackageMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatepackageMinusCreateObjectMinusV1MinusRequest** | [**EzsigntemplatepackageMinusCreateObjectMinusV1MinusRequest**](EzsigntemplatepackageMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatepackageMinusCreateObjectMinusV1MinusResponse**](EzsigntemplatepackageMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatepackageDeleteObjectV1"></a>
# **ezsigntemplatepackageDeleteObjectV1**
> EzsigntemplatepackageMinusDeleteObjectMinusV1MinusResponse ezsigntemplatepackageDeleteObjectV1(pkiEzsigntemplatepackageID)

Delete an existing Ezsigntemplatepackage



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val pkiEzsigntemplatepackageID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepackageMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackageDeleteObjectV1(pkiEzsigntemplatepackageID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackageID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatepackageMinusDeleteObjectMinusV1MinusResponse**](EzsigntemplatepackageMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatepackageEditEzsigntemplatepackagesignersV1"></a>
# **ezsigntemplatepackageEditEzsigntemplatepackagesignersV1**
> EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusResponse ezsigntemplatepackageEditEzsigntemplatepackagesignersV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusRequest)

Edit multiple Ezsigntemplatepackagesigners

Using this endpoint, you can edit multiple Ezsigntemplatepackagesigners at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val pkiEzsigntemplatepackageID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusRequest : EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusRequest =  // EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusRequest | 
try {
    val result : EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusResponse = apiInstance.ezsigntemplatepackageEditEzsigntemplatepackagesignersV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageEditEzsigntemplatepackagesignersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageEditEzsigntemplatepackagesignersV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackageID** | **kotlin.Int**|  |
 **ezsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusRequest** | [**EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusRequest**](EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusResponse**](EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatepackageEditObjectV1"></a>
# **ezsigntemplatepackageEditObjectV1**
> EzsigntemplatepackageMinusEditObjectMinusV1MinusResponse ezsigntemplatepackageEditObjectV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsigntemplatepackage



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val pkiEzsigntemplatepackageID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatepackageMinusEditObjectMinusV1MinusRequest : EzsigntemplatepackageMinusEditObjectMinusV1MinusRequest =  // EzsigntemplatepackageMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatepackageMinusEditObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackageEditObjectV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackageID** | **kotlin.Int**|  |
 **ezsigntemplatepackageMinusEditObjectMinusV1MinusRequest** | [**EzsigntemplatepackageMinusEditObjectMinusV1MinusRequest**](EzsigntemplatepackageMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatepackageMinusEditObjectMinusV1MinusResponse**](EzsigntemplatepackageMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatepackageGetAutocompleteV1"></a>
# **ezsigntemplatepackageGetAutocompleteV1**
> CommonMinusGetAutocompleteDisabledMinusV1MinusResponse ezsigntemplatepackageGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsigntemplatepackages and IDs

Get the list of Ezsigntemplatepackage to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezsigntemplatepackages to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : CommonMinusGetAutocompleteDisabledMinusV1MinusResponse = apiInstance.ezsigntemplatepackageGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetAutocompleteV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetAutocompleteV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Ezsigntemplatepackages to return | [enum: All, AllMultipleCopiesDisabled]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**CommonMinusGetAutocompleteDisabledMinusV1MinusResponse**](CommonMinusGetAutocompleteDisabledMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatepackageGetAutocompleteV2"></a>
# **ezsigntemplatepackageGetAutocompleteV2**
> EzsigntemplatepackageMinusGetAutocompleteMinusV2MinusResponse ezsigntemplatepackageGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsigntemplatepackages and IDs

Get the list of Ezsigntemplatepackage to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezsigntemplatepackages to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : EzsigntemplatepackageMinusGetAutocompleteMinusV2MinusResponse = apiInstance.ezsigntemplatepackageGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Ezsigntemplatepackages to return | [enum: All, AllMultipleCopiesDisabled]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**EzsigntemplatepackageMinusGetAutocompleteMinusV2MinusResponse**](EzsigntemplatepackageMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatepackageGetListV1"></a>
# **ezsigntemplatepackageGetListV1**
> EzsigntemplatepackageMinusGetListMinusV1MinusResponse ezsigntemplatepackageGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsigntemplatepackage list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplatepackageType | Company&lt;br&gt;Team&lt;br&gt;User&lt;br&gt;Usergroup |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzsigntemplatepackageMinusGetListMinusV1MinusResponse = apiInstance.ezsigntemplatepackageGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsigntemplatepackageID_ASC, pkiEzsigntemplatepackageID_DESC, fkiTeamID_ASC, fkiTeamID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, eEzsigntemplatepackageType_ASC, eEzsigntemplatepackageType_DESC, sEzsigntemplatepackageTypedescriptionX_ASC, sEzsigntemplatepackageTypedescriptionX_DESC, sEzsigntemplatepackageDescription_ASC, sEzsigntemplatepackageDescription_DESC, bEzsigntemplatepackageNeedvalidation_ASC, bEzsigntemplatepackageNeedvalidation_DESC, iEzsigntemplatepackagemembership_ASC, iEzsigntemplatepackagemembership_DESC, bEzsigntemplatepackageIsactive_ASC, bEzsigntemplatepackageIsactive_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**EzsigntemplatepackageMinusGetListMinusV1MinusResponse**](EzsigntemplatepackageMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatepackageGetObjectV1"></a>
# **ezsigntemplatepackageGetObjectV1**
> EzsigntemplatepackageMinusGetObjectMinusV1MinusResponse ezsigntemplatepackageGetObjectV1(pkiEzsigntemplatepackageID)

Retrieve an existing Ezsigntemplatepackage



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val pkiEzsigntemplatepackageID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepackageMinusGetObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackageGetObjectV1(pkiEzsigntemplatepackageID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackageID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatepackageMinusGetObjectMinusV1MinusResponse**](EzsigntemplatepackageMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatepackageGetObjectV2"></a>
# **ezsigntemplatepackageGetObjectV2**
> EzsigntemplatepackageMinusGetObjectMinusV2MinusResponse ezsigntemplatepackageGetObjectV2(pkiEzsigntemplatepackageID)

Retrieve an existing Ezsigntemplatepackage



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val pkiEzsigntemplatepackageID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepackageMinusGetObjectMinusV2MinusResponse = apiInstance.ezsigntemplatepackageGetObjectV2(pkiEzsigntemplatepackageID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackageApi#ezsigntemplatepackageGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackageID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatepackageMinusGetObjectMinusV2MinusResponse**](EzsigntemplatepackageMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


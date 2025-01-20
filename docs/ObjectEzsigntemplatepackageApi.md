# ObjectEzsigntemplatepackageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsigntemplatepackageCreateObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageCreateObjectV1) | **POST** /1/object/ezsigntemplatepackage | Create a new Ezsigntemplatepackage |
| [**ezsigntemplatepackageDeleteObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Delete an existing Ezsigntemplatepackage |
| [**ezsigntemplatepackageEditEzsigntemplatepackagesignersV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditEzsigntemplatepackagesignersV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}/editEzsigntemplatepackagesigners | Edit multiple Ezsigntemplatepackagesigners |
| [**ezsigntemplatepackageEditObjectV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditObjectV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Edit an existing Ezsigntemplatepackage |
| [**ezsigntemplatepackageGetAutocompleteV2**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetAutocompleteV2) | **GET** /2/object/ezsigntemplatepackage/getAutocomplete/{sSelector} | Retrieve Ezsigntemplatepackages and IDs |
| [**ezsigntemplatepackageGetListV1**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetListV1) | **GET** /1/object/ezsigntemplatepackage/getList | Retrieve Ezsigntemplatepackage list |
| [**ezsigntemplatepackageGetObjectV2**](ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetObjectV2) | **GET** /2/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Retrieve an existing Ezsigntemplatepackage |


<a id="ezsigntemplatepackageCreateObjectV1"></a>
# **ezsigntemplatepackageCreateObjectV1**
> EzsigntemplatepackageCreateObjectV1Response ezsigntemplatepackageCreateObjectV1(ezsigntemplatepackageCreateObjectV1Request)

Create a new Ezsigntemplatepackage

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val ezsigntemplatepackageCreateObjectV1Request : EzsigntemplatepackageCreateObjectV1Request =  // EzsigntemplatepackageCreateObjectV1Request | 
try {
    val result : EzsigntemplatepackageCreateObjectV1Response = apiInstance.ezsigntemplatepackageCreateObjectV1(ezsigntemplatepackageCreateObjectV1Request)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatepackageCreateObjectV1Request** | [**EzsigntemplatepackageCreateObjectV1Request**](EzsigntemplatepackageCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatepackageCreateObjectV1Response**](EzsigntemplatepackageCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatepackageDeleteObjectV1"></a>
# **ezsigntemplatepackageDeleteObjectV1**
> CommonResponse ezsigntemplatepackageDeleteObjectV1(pkiEzsigntemplatepackageID)

Delete an existing Ezsigntemplatepackage



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val pkiEzsigntemplatepackageID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommonResponse = apiInstance.ezsigntemplatepackageDeleteObjectV1(pkiEzsigntemplatepackageID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatepackageID** | **kotlin.Int**|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatepackageEditEzsigntemplatepackagesignersV1"></a>
# **ezsigntemplatepackageEditEzsigntemplatepackagesignersV1**
> EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response ezsigntemplatepackageEditEzsigntemplatepackagesignersV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request)

Edit multiple Ezsigntemplatepackagesigners

Using this endpoint, you can edit multiple Ezsigntemplatepackagesigners at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val pkiEzsigntemplatepackageID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request : EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request =  // EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request | 
try {
    val result : EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response = apiInstance.ezsigntemplatepackageEditEzsigntemplatepackagesignersV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request)
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
| **pkiEzsigntemplatepackageID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatepackageEditEzsigntemplatepackagesignersV1Request** | [**EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request**](EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request.md)|  | |

### Return type

[**EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response**](EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatepackageEditObjectV1"></a>
# **ezsigntemplatepackageEditObjectV1**
> CommonResponse ezsigntemplatepackageEditObjectV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditObjectV1Request)

Edit an existing Ezsigntemplatepackage



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val pkiEzsigntemplatepackageID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatepackageEditObjectV1Request : EzsigntemplatepackageEditObjectV1Request =  // EzsigntemplatepackageEditObjectV1Request | 
try {
    val result : CommonResponse = apiInstance.ezsigntemplatepackageEditObjectV1(pkiEzsigntemplatepackageID, ezsigntemplatepackageEditObjectV1Request)
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
| **pkiEzsigntemplatepackageID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatepackageEditObjectV1Request** | [**EzsigntemplatepackageEditObjectV1Request**](EzsigntemplatepackageEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatepackageGetAutocompleteV2"></a>
# **ezsigntemplatepackageGetAutocompleteV2**
> EzsigntemplatepackageGetAutocompleteV2Response ezsigntemplatepackageGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiEzsignfoldertypeID)

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
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val fkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | The fkiEzsignfoldertypeID to use with the selector Ezsigntemplatepublic
try {
    val result : EzsigntemplatepackageGetAutocompleteV2Response = apiInstance.ezsigntemplatepackageGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiEzsignfoldertypeID)
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
| **sSelector** | **kotlin.String**| The type of Ezsigntemplatepackages to return | [enum: All, AllMultipleCopiesDisabled, Ezsigntemplatepublic] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fkiEzsignfoldertypeID** | **kotlin.Int**| The fkiEzsignfoldertypeID to use with the selector Ezsigntemplatepublic | [optional] |

### Return type

[**EzsigntemplatepackageGetAutocompleteV2Response**](EzsigntemplatepackageGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatepackageGetListV1"></a>
# **ezsigntemplatepackageGetListV1**
> EzsigntemplatepackageGetListV1Response ezsigntemplatepackageGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

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
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzsigntemplatepackageGetListV1Response = apiInstance.ezsigntemplatepackageGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
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
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsigntemplatepackageID_ASC, pkiEzsigntemplatepackageID_DESC, fkiTeamID_ASC, fkiTeamID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, eEzsigntemplatepackageType_ASC, eEzsigntemplatepackageType_DESC, sEzsigntemplatepackageTypedescriptionX_ASC, sEzsigntemplatepackageTypedescriptionX_DESC, sEzsigntemplatepackageDescription_ASC, sEzsigntemplatepackageDescription_DESC, bEzsigntemplatepackageNeedvalidation_ASC, bEzsigntemplatepackageNeedvalidation_DESC, iEzsigntemplatepackagemembership_ASC, iEzsigntemplatepackagemembership_DESC, bEzsigntemplatepackageIsactive_ASC, bEzsigntemplatepackageIsactive_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**EzsigntemplatepackageGetListV1Response**](EzsigntemplatepackageGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatepackageGetObjectV2"></a>
# **ezsigntemplatepackageGetObjectV2**
> EzsigntemplatepackageGetObjectV2Response ezsigntemplatepackageGetObjectV2(pkiEzsigntemplatepackageID)

Retrieve an existing Ezsigntemplatepackage



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackageApi()
val pkiEzsigntemplatepackageID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepackageGetObjectV2Response = apiInstance.ezsigntemplatepackageGetObjectV2(pkiEzsigntemplatepackageID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatepackageID** | **kotlin.Int**|  | |

### Return type

[**EzsigntemplatepackageGetObjectV2Response**](EzsigntemplatepackageGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


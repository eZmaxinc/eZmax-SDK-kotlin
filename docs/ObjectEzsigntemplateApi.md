# ObjectEzsigntemplateApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsigntemplateCopyV1**](ObjectEzsigntemplateApi.md#ezsigntemplateCopyV1) | **POST** /1/object/ezsigntemplate/{pkiEzsigntemplateID}/copy | Copy the Ezsigntemplate |
| [**ezsigntemplateCreateObjectV3**](ObjectEzsigntemplateApi.md#ezsigntemplateCreateObjectV3) | **POST** /3/object/ezsigntemplate | Create a new Ezsigntemplate |
| [**ezsigntemplateDeleteObjectV1**](ObjectEzsigntemplateApi.md#ezsigntemplateDeleteObjectV1) | **DELETE** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Delete an existing Ezsigntemplate |
| [**ezsigntemplateEditObjectV3**](ObjectEzsigntemplateApi.md#ezsigntemplateEditObjectV3) | **PUT** /3/object/ezsigntemplate/{pkiEzsigntemplateID} | Edit an existing Ezsigntemplate |
| [**ezsigntemplateGetAutocompleteV2**](ObjectEzsigntemplateApi.md#ezsigntemplateGetAutocompleteV2) | **GET** /2/object/ezsigntemplate/getAutocomplete/{sSelector} | Retrieve Ezsigntemplates and IDs |
| [**ezsigntemplateGetListV1**](ObjectEzsigntemplateApi.md#ezsigntemplateGetListV1) | **GET** /1/object/ezsigntemplate/getList | Retrieve Ezsigntemplate list |
| [**ezsigntemplateGetObjectV3**](ObjectEzsigntemplateApi.md#ezsigntemplateGetObjectV3) | **GET** /3/object/ezsigntemplate/{pkiEzsigntemplateID} | Retrieve an existing Ezsigntemplate |


<a id="ezsigntemplateCopyV1"></a>
# **ezsigntemplateCopyV1**
> EzsigntemplateCopyV1Response ezsigntemplateCopyV1(pkiEzsigntemplateID, ezsigntemplateCopyV1Request)

Copy the Ezsigntemplate



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val pkiEzsigntemplateID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplateCopyV1Request : EzsigntemplateCopyV1Request =  // EzsigntemplateCopyV1Request | 
try {
    val result : EzsigntemplateCopyV1Response = apiInstance.ezsigntemplateCopyV1(pkiEzsigntemplateID, ezsigntemplateCopyV1Request)
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
| **pkiEzsigntemplateID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplateCopyV1Request** | [**EzsigntemplateCopyV1Request**](EzsigntemplateCopyV1Request.md)|  | |

### Return type

[**EzsigntemplateCopyV1Response**](EzsigntemplateCopyV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateCreateObjectV3"></a>
# **ezsigntemplateCreateObjectV3**
> EzsigntemplateCreateObjectV3Response ezsigntemplateCreateObjectV3(ezsigntemplateCreateObjectV3Request)

Create a new Ezsigntemplate

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val ezsigntemplateCreateObjectV3Request : EzsigntemplateCreateObjectV3Request =  // EzsigntemplateCreateObjectV3Request | 
try {
    val result : EzsigntemplateCreateObjectV3Response = apiInstance.ezsigntemplateCreateObjectV3(ezsigntemplateCreateObjectV3Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateCreateObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateCreateObjectV3")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplateCreateObjectV3Request** | [**EzsigntemplateCreateObjectV3Request**](EzsigntemplateCreateObjectV3Request.md)|  | |

### Return type

[**EzsigntemplateCreateObjectV3Response**](EzsigntemplateCreateObjectV3Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateDeleteObjectV1"></a>
# **ezsigntemplateDeleteObjectV1**
> CommonResponse ezsigntemplateDeleteObjectV1(pkiEzsigntemplateID)

Delete an existing Ezsigntemplate



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val pkiEzsigntemplateID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommonResponse = apiInstance.ezsigntemplateDeleteObjectV1(pkiEzsigntemplateID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplateID** | **kotlin.Int**|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplateEditObjectV3"></a>
# **ezsigntemplateEditObjectV3**
> CommonResponse ezsigntemplateEditObjectV3(pkiEzsigntemplateID, ezsigntemplateEditObjectV3Request)

Edit an existing Ezsigntemplate



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val pkiEzsigntemplateID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplateEditObjectV3Request : EzsigntemplateEditObjectV3Request =  // EzsigntemplateEditObjectV3Request | 
try {
    val result : CommonResponse = apiInstance.ezsigntemplateEditObjectV3(pkiEzsigntemplateID, ezsigntemplateEditObjectV3Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateEditObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateEditObjectV3")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigntemplateID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplateEditObjectV3Request** | [**EzsigntemplateEditObjectV3Request**](EzsigntemplateEditObjectV3Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateGetAutocompleteV2"></a>
# **ezsigntemplateGetAutocompleteV2**
> EzsigntemplateGetAutocompleteV2Response ezsigntemplateGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiEzsignfoldertypeID)

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
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val fkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | The fkiEzsignfoldertypeID to use with the selector Ezsigntemplatepublic
try {
    val result : EzsigntemplateGetAutocompleteV2Response = apiInstance.ezsigntemplateGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage, fkiEzsignfoldertypeID)
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
| **sSelector** | **kotlin.String**| The type of Ezsigntemplates to return | [enum: All, Ezsigntemplatepublic] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fkiEzsignfoldertypeID** | **kotlin.Int**| The fkiEzsignfoldertypeID to use with the selector Ezsigntemplatepublic | [optional] |

### Return type

[**EzsigntemplateGetAutocompleteV2Response**](EzsigntemplateGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplateGetListV1"></a>
# **ezsigntemplateGetListV1**
> EzsigntemplateGetListV1Response ezsigntemplateGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

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
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzsigntemplateGetListV1Response = apiInstance.ezsigntemplateGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
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
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsigntemplateID_ASC, pkiEzsigntemplateID_DESC, fkiTeamID_ASC, fkiTeamID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, fkiUserIDOwner_ASC, fkiUserIDOwner_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, eEzsigntemplateType_ASC, eEzsigntemplateType_DESC, sEzsigntemplateDescription_ASC, sEzsigntemplateDescription_DESC, sEzsigntemplatedocumentDescription_ASC, sEzsigntemplatedocumentDescription_DESC, iEzsigntemplatedocumentPagetotal_ASC, iEzsigntemplatedocumentPagetotal_DESC, iEzsigntemplateSignaturetotal_ASC, iEzsigntemplateSignaturetotal_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, eEzsigntemplateType_ASC, eEzsigntemplateType_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**EzsigntemplateGetListV1Response**](EzsigntemplateGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplateGetObjectV3"></a>
# **ezsigntemplateGetObjectV3**
> EzsigntemplateGetObjectV3Response ezsigntemplateGetObjectV3(pkiEzsigntemplateID)

Retrieve an existing Ezsigntemplate



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateApi()
val pkiEzsigntemplateID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplateGetObjectV3Response = apiInstance.ezsigntemplateGetObjectV3(pkiEzsigntemplateID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateApi#ezsigntemplateGetObjectV3")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplateID** | **kotlin.Int**|  | |

### Return type

[**EzsigntemplateGetObjectV3Response**](EzsigntemplateGetObjectV3Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


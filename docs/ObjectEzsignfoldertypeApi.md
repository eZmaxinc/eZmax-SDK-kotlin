# ObjectEzsignfoldertypeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignfoldertypeCreateObjectV3**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeCreateObjectV3) | **POST** /3/object/ezsignfoldertype | Create a new Ezsignfoldertype |
| [**ezsignfoldertypeEditObjectV3**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeEditObjectV3) | **PUT** /3/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Edit an existing Ezsignfoldertype |
| [**ezsignfoldertypeGetAutocompleteV2**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetAutocompleteV2) | **GET** /2/object/ezsignfoldertype/getAutocomplete/{sSelector} | Retrieve Ezsignfoldertypes and IDs |
| [**ezsignfoldertypeGetListV1**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetListV1) | **GET** /1/object/ezsignfoldertype/getList | Retrieve Ezsignfoldertype list |
| [**ezsignfoldertypeGetObjectV2**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetObjectV2) | **GET** /2/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Retrieve an existing Ezsignfoldertype |
| [**ezsignfoldertypeGetObjectV4**](ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetObjectV4) | **GET** /4/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Retrieve an existing Ezsignfoldertype |


<a id="ezsignfoldertypeCreateObjectV3"></a>
# **ezsignfoldertypeCreateObjectV3**
> EzsignfoldertypeCreateObjectV3Response ezsignfoldertypeCreateObjectV3(ezsignfoldertypeCreateObjectV3Request)

Create a new Ezsignfoldertype

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldertypeApi()
val ezsignfoldertypeCreateObjectV3Request : EzsignfoldertypeCreateObjectV3Request =  // EzsignfoldertypeCreateObjectV3Request | 
try {
    val result : EzsignfoldertypeCreateObjectV3Response = apiInstance.ezsignfoldertypeCreateObjectV3(ezsignfoldertypeCreateObjectV3Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeCreateObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeCreateObjectV3")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignfoldertypeCreateObjectV3Request** | [**EzsignfoldertypeCreateObjectV3Request**](EzsignfoldertypeCreateObjectV3Request.md)|  | |

### Return type

[**EzsignfoldertypeCreateObjectV3Response**](EzsignfoldertypeCreateObjectV3Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfoldertypeEditObjectV3"></a>
# **ezsignfoldertypeEditObjectV3**
> CommonResponse ezsignfoldertypeEditObjectV3(pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV3Request)

Edit an existing Ezsignfoldertype



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldertypeApi()
val pkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfoldertypeEditObjectV3Request : EzsignfoldertypeEditObjectV3Request =  // EzsignfoldertypeEditObjectV3Request | 
try {
    val result : CommonResponse = apiInstance.ezsignfoldertypeEditObjectV3(pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV3Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeEditObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeEditObjectV3")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsignfoldertypeID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignfoldertypeEditObjectV3Request** | [**EzsignfoldertypeEditObjectV3Request**](EzsignfoldertypeEditObjectV3Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfoldertypeGetAutocompleteV2"></a>
# **ezsignfoldertypeGetAutocompleteV2**
> EzsignfoldertypeGetAutocompleteV2Response ezsignfoldertypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsignfoldertypes and IDs

Get the list of Ezsignfoldertype to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldertypeApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezsignfoldertypes to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : EzsignfoldertypeGetAutocompleteV2Response = apiInstance.ezsignfoldertypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Ezsignfoldertypes to return | [enum: Active, All, EzsigntemplateEdit, EzsigntemplateUsergroup] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**EzsignfoldertypeGetAutocompleteV2Response**](EzsignfoldertypeGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfoldertypeGetListV1"></a>
# **ezsignfoldertypeGetListV1**
> EzsignfoldertypeGetListV1Response ezsignfoldertypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

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
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzsignfoldertypeGetListV1Response = apiInstance.ezsignfoldertypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
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
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignfoldertypeID_ASC, pkiEzsignfoldertypeID_DESC, eEzsignfoldertypePrivacylevel_ASC, eEzsignfoldertypePrivacylevel_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, bEzsignfoldertypeIsactive_ASC, bEzsignfoldertypeIsactive_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**EzsignfoldertypeGetListV1Response**](EzsignfoldertypeGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfoldertypeGetObjectV2"></a>
# **ezsignfoldertypeGetObjectV2**
> EzsignfoldertypeGetObjectV2Response ezsignfoldertypeGetObjectV2(pkiEzsignfoldertypeID)

Retrieve an existing Ezsignfoldertype



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldertypeApi()
val pkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfoldertypeGetObjectV2Response = apiInstance.ezsignfoldertypeGetObjectV2(pkiEzsignfoldertypeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignfoldertypeID** | **kotlin.Int**|  | |

### Return type

[**EzsignfoldertypeGetObjectV2Response**](EzsignfoldertypeGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfoldertypeGetObjectV4"></a>
# **ezsignfoldertypeGetObjectV4**
> EzsignfoldertypeGetObjectV4Response ezsignfoldertypeGetObjectV4(pkiEzsignfoldertypeID)

Retrieve an existing Ezsignfoldertype



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldertypeApi()
val pkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfoldertypeGetObjectV4Response = apiInstance.ezsignfoldertypeGetObjectV4(pkiEzsignfoldertypeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetObjectV4")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldertypeApi#ezsignfoldertypeGetObjectV4")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignfoldertypeID** | **kotlin.Int**|  | |

### Return type

[**EzsignfoldertypeGetObjectV4Response**](EzsignfoldertypeGetObjectV4Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


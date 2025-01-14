# ObjectEzdoctemplatedocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezdoctemplatedocumentCreateObjectV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentCreateObjectV1) | **POST** /1/object/ezdoctemplatedocument | Create a new Ezdoctemplatedocument |
| [**ezdoctemplatedocumentDownloadV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentDownloadV1) | **GET** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID}/download | Retrieve the content |
| [**ezdoctemplatedocumentEditObjectV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentEditObjectV1) | **PUT** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Edit an existing Ezdoctemplatedocument |
| [**ezdoctemplatedocumentGetAutocompleteV2**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetAutocompleteV2) | **GET** /2/object/ezdoctemplatedocument/getAutocomplete/{sSelector} | Retrieve Ezdoctemplatedocuments and IDs |
| [**ezdoctemplatedocumentGetListV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetListV1) | **GET** /1/object/ezdoctemplatedocument/getList | Retrieve Ezdoctemplatedocument list |
| [**ezdoctemplatedocumentGetObjectV2**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetObjectV2) | **GET** /2/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Retrieve an existing Ezdoctemplatedocument |
| [**ezdoctemplatedocumentPatchObjectV1**](ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentPatchObjectV1) | **PATCH** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Patch an existing Ezdoctemplatedocument |


<a id="ezdoctemplatedocumentCreateObjectV1"></a>
# **ezdoctemplatedocumentCreateObjectV1**
> EzdoctemplatedocumentCreateObjectV1Response ezdoctemplatedocumentCreateObjectV1(ezdoctemplatedocumentCreateObjectV1Request)

Create a new Ezdoctemplatedocument

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzdoctemplatedocumentApi()
val ezdoctemplatedocumentCreateObjectV1Request : EzdoctemplatedocumentCreateObjectV1Request =  // EzdoctemplatedocumentCreateObjectV1Request | 
try {
    val result : EzdoctemplatedocumentCreateObjectV1Response = apiInstance.ezdoctemplatedocumentCreateObjectV1(ezdoctemplatedocumentCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezdoctemplatedocumentCreateObjectV1Request** | [**EzdoctemplatedocumentCreateObjectV1Request**](EzdoctemplatedocumentCreateObjectV1Request.md)|  | |

### Return type

[**EzdoctemplatedocumentCreateObjectV1Response**](EzdoctemplatedocumentCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezdoctemplatedocumentDownloadV1"></a>
# **ezdoctemplatedocumentDownloadV1**
> ezdoctemplatedocumentDownloadV1(pkiEzdoctemplatedocumentID)

Retrieve the content

Using this endpoint, you can retrieve the content of an ezdoctemplatedocument.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzdoctemplatedocumentApi()
val pkiEzdoctemplatedocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.ezdoctemplatedocumentDownloadV1(pkiEzdoctemplatedocumentID)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentDownloadV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzdoctemplatedocumentID** | **kotlin.Int**|  | |

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Presigned:
    ApiClient.apiKey["sAuthorization"] = ""
    ApiClient.apiKeyPrefix["sAuthorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezdoctemplatedocumentEditObjectV1"></a>
# **ezdoctemplatedocumentEditObjectV1**
> EzdoctemplatedocumentEditObjectV1Response ezdoctemplatedocumentEditObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentEditObjectV1Request)

Edit an existing Ezdoctemplatedocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzdoctemplatedocumentApi()
val pkiEzdoctemplatedocumentID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezdoctemplatedocument
val ezdoctemplatedocumentEditObjectV1Request : EzdoctemplatedocumentEditObjectV1Request =  // EzdoctemplatedocumentEditObjectV1Request | 
try {
    val result : EzdoctemplatedocumentEditObjectV1Response = apiInstance.ezdoctemplatedocumentEditObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzdoctemplatedocumentID** | **kotlin.Int**| The unique ID of the Ezdoctemplatedocument | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezdoctemplatedocumentEditObjectV1Request** | [**EzdoctemplatedocumentEditObjectV1Request**](EzdoctemplatedocumentEditObjectV1Request.md)|  | |

### Return type

[**EzdoctemplatedocumentEditObjectV1Response**](EzdoctemplatedocumentEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezdoctemplatedocumentGetAutocompleteV2"></a>
# **ezdoctemplatedocumentGetAutocompleteV2**
> EzdoctemplatedocumentGetAutocompleteV2Response ezdoctemplatedocumentGetAutocompleteV2(sSelector, eType, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezdoctemplatedocuments and IDs

Get the list of Ezdoctemplatedocument to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzdoctemplatedocumentApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezdoctemplatedocuments to return
val eType : kotlin.String = eType_example // kotlin.String | The type of Ezdoctemplatedocument
val fkiEzsignfoldertypeID : kotlin.String = fkiEzsignfoldertypeID_example // kotlin.String | Specify which fkiEzsignfoldertypeID we want to display. only used when eType = Ezsignfoldertype
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : EzdoctemplatedocumentGetAutocompleteV2Response = apiInstance.ezdoctemplatedocumentGetAutocompleteV2(sSelector, eType, fkiEzsignfoldertypeID, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Ezdoctemplatedocuments to return | [enum: All, Ezsignfolder, Ezsignfoldersignerassociations] |
| **eType** | **kotlin.String**| The type of Ezdoctemplatedocument | [default to CompanyEzsignfoldertype] [enum: User, Company, Ezsignfoldertype, CompanyUser, CompanyEzsignfoldertype] |
| **fkiEzsignfoldertypeID** | **kotlin.String**| Specify which fkiEzsignfoldertypeID we want to display. only used when eType &#x3D; Ezsignfoldertype | [optional] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**EzdoctemplatedocumentGetAutocompleteV2Response**](EzdoctemplatedocumentGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezdoctemplatedocumentGetListV1"></a>
# **ezdoctemplatedocumentGetListV1**
> EzdoctemplatedocumentGetListV1Response ezdoctemplatedocumentGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezdoctemplatedocument list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzdoctemplatedocumentApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzdoctemplatedocumentGetListV1Response = apiInstance.ezdoctemplatedocumentGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzdoctemplatedocumentID_ASC, pkiEzdoctemplatedocumentID_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, fkiEzdoctemplatetypeID_ASC, fkiEzdoctemplatetypeID_DESC, fkiEzdoctemplatefieldtypecategoryID_ASC, fkiEzdoctemplatefieldtypecategoryID_DESC, bEzdoctemplatedocumentIsactive_ASC, bEzdoctemplatedocumentIsactive_DESC, sEzdoctemplatedocumentNameX_ASC, sEzdoctemplatedocumentNameX_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**EzdoctemplatedocumentGetListV1Response**](EzdoctemplatedocumentGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezdoctemplatedocumentGetObjectV2"></a>
# **ezdoctemplatedocumentGetObjectV2**
> EzdoctemplatedocumentGetObjectV2Response ezdoctemplatedocumentGetObjectV2(pkiEzdoctemplatedocumentID)

Retrieve an existing Ezdoctemplatedocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzdoctemplatedocumentApi()
val pkiEzdoctemplatedocumentID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezdoctemplatedocument
try {
    val result : EzdoctemplatedocumentGetObjectV2Response = apiInstance.ezdoctemplatedocumentGetObjectV2(pkiEzdoctemplatedocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzdoctemplatedocumentID** | **kotlin.Int**| The unique ID of the Ezdoctemplatedocument | |

### Return type

[**EzdoctemplatedocumentGetObjectV2Response**](EzdoctemplatedocumentGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezdoctemplatedocumentPatchObjectV1"></a>
# **ezdoctemplatedocumentPatchObjectV1**
> EzdoctemplatedocumentPatchObjectV1Response ezdoctemplatedocumentPatchObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentPatchObjectV1Request)

Patch an existing Ezdoctemplatedocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzdoctemplatedocumentApi()
val pkiEzdoctemplatedocumentID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezdoctemplatedocument
val ezdoctemplatedocumentPatchObjectV1Request : EzdoctemplatedocumentPatchObjectV1Request =  // EzdoctemplatedocumentPatchObjectV1Request | 
try {
    val result : EzdoctemplatedocumentPatchObjectV1Response = apiInstance.ezdoctemplatedocumentPatchObjectV1(pkiEzdoctemplatedocumentID, ezdoctemplatedocumentPatchObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentPatchObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzdoctemplatedocumentApi#ezdoctemplatedocumentPatchObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzdoctemplatedocumentID** | **kotlin.Int**| The unique ID of the Ezdoctemplatedocument | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezdoctemplatedocumentPatchObjectV1Request** | [**EzdoctemplatedocumentPatchObjectV1Request**](EzdoctemplatedocumentPatchObjectV1Request.md)|  | |

### Return type

[**EzdoctemplatedocumentPatchObjectV1Response**](EzdoctemplatedocumentPatchObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ObjectDocumenttypechecklistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**documenttypechecklistCreateObjectV1**](ObjectDocumenttypechecklistApi.md#documenttypechecklistCreateObjectV1) | **POST** /1/object/documenttypechecklist | Create a new Documenttypechecklist |
| [**documenttypechecklistDeleteObjectV1**](ObjectDocumenttypechecklistApi.md#documenttypechecklistDeleteObjectV1) | **DELETE** /1/object/documenttypechecklist/{pkiDocumenttypechecklistID} | Delete an existing Documenttypechecklist |
| [**documenttypechecklistEditObjectV1**](ObjectDocumenttypechecklistApi.md#documenttypechecklistEditObjectV1) | **PUT** /1/object/documenttypechecklist/{pkiDocumenttypechecklistID} | Edit an existing Documenttypechecklist |
| [**documenttypechecklistGetListV1**](ObjectDocumenttypechecklistApi.md#documenttypechecklistGetListV1) | **GET** /1/object/documenttypechecklist/getList | Retrieve Documenttypechecklist list |
| [**documenttypechecklistGetObjectV2**](ObjectDocumenttypechecklistApi.md#documenttypechecklistGetObjectV2) | **GET** /2/object/documenttypechecklist/{pkiDocumenttypechecklistID} | Retrieve an existing Documenttypechecklist |


<a id="documenttypechecklistCreateObjectV1"></a>
# **documenttypechecklistCreateObjectV1**
> DocumenttypechecklistCreateObjectV1Response documenttypechecklistCreateObjectV1(documenttypechecklistCreateObjectV1Request)

Create a new Documenttypechecklist

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDocumenttypechecklistApi()
val documenttypechecklistCreateObjectV1Request : DocumenttypechecklistCreateObjectV1Request =  // DocumenttypechecklistCreateObjectV1Request | 
try {
    val result : DocumenttypechecklistCreateObjectV1Response = apiInstance.documenttypechecklistCreateObjectV1(documenttypechecklistCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documenttypechecklistCreateObjectV1Request** | [**DocumenttypechecklistCreateObjectV1Request**](DocumenttypechecklistCreateObjectV1Request.md)|  | |

### Return type

[**DocumenttypechecklistCreateObjectV1Response**](DocumenttypechecklistCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="documenttypechecklistDeleteObjectV1"></a>
# **documenttypechecklistDeleteObjectV1**
> DocumenttypechecklistDeleteObjectV1Response documenttypechecklistDeleteObjectV1(pkiDocumenttypechecklistID)

Delete an existing Documenttypechecklist



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDocumenttypechecklistApi()
val pkiDocumenttypechecklistID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Documenttypechecklist
try {
    val result : DocumenttypechecklistDeleteObjectV1Response = apiInstance.documenttypechecklistDeleteObjectV1(pkiDocumenttypechecklistID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDocumenttypechecklistID** | **kotlin.Int**| The unique ID of the Documenttypechecklist | |

### Return type

[**DocumenttypechecklistDeleteObjectV1Response**](DocumenttypechecklistDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="documenttypechecklistEditObjectV1"></a>
# **documenttypechecklistEditObjectV1**
> DocumenttypechecklistEditObjectV1Response documenttypechecklistEditObjectV1(pkiDocumenttypechecklistID, documenttypechecklistEditObjectV1Request)

Edit an existing Documenttypechecklist



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDocumenttypechecklistApi()
val pkiDocumenttypechecklistID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Documenttypechecklist
val documenttypechecklistEditObjectV1Request : DocumenttypechecklistEditObjectV1Request =  // DocumenttypechecklistEditObjectV1Request | 
try {
    val result : DocumenttypechecklistEditObjectV1Response = apiInstance.documenttypechecklistEditObjectV1(pkiDocumenttypechecklistID, documenttypechecklistEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDocumenttypechecklistID** | **kotlin.Int**| The unique ID of the Documenttypechecklist | |
| **documenttypechecklistEditObjectV1Request** | [**DocumenttypechecklistEditObjectV1Request**](DocumenttypechecklistEditObjectV1Request.md)|  | |

### Return type

[**DocumenttypechecklistEditObjectV1Response**](DocumenttypechecklistEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="documenttypechecklistGetListV1"></a>
# **documenttypechecklistGetListV1**
> DocumenttypechecklistGetListV1Response documenttypechecklistGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Documenttypechecklist list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eDocumenttypechecklistStatus | Not required&lt;br&gt;Required&lt;br&gt;Filed&lt;br&gt;Justified |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDocumenttypechecklistApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : DocumenttypechecklistGetListV1Response = apiInstance.documenttypechecklistGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiDocumenttypechecklistID_ASC, pkiDocumenttypechecklistID_DESC, fkiDocumenttypeID_ASC, fkiDocumenttypeID_DESC, eDocumenttypechecklistStatus_ASC, eDocumenttypechecklistStatus_DESC, tDocumenttypechecklistComment_ASC, tDocumenttypechecklistComment_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**DocumenttypechecklistGetListV1Response**](DocumenttypechecklistGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="documenttypechecklistGetObjectV2"></a>
# **documenttypechecklistGetObjectV2**
> DocumenttypechecklistGetObjectV2Response documenttypechecklistGetObjectV2(pkiDocumenttypechecklistID)

Retrieve an existing Documenttypechecklist



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDocumenttypechecklistApi()
val pkiDocumenttypechecklistID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Documenttypechecklist
try {
    val result : DocumenttypechecklistGetObjectV2Response = apiInstance.documenttypechecklistGetObjectV2(pkiDocumenttypechecklistID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDocumenttypechecklistApi#documenttypechecklistGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDocumenttypechecklistID** | **kotlin.Int**| The unique ID of the Documenttypechecklist | |

### Return type

[**DocumenttypechecklistGetObjectV2Response**](DocumenttypechecklistGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


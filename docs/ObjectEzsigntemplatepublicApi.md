# ObjectEzsigntemplatepublicApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsigntemplatepublicCreateEzsignfolderV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicCreateEzsignfolderV1) | **POST** /1/object/ezsigntemplatepublic/createEzsignfolder | Create an Ezsignfolder |
| [**ezsigntemplatepublicCreateObjectV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicCreateObjectV1) | **POST** /1/object/ezsigntemplatepublic | Create a new Ezsigntemplatepublic |
| [**ezsigntemplatepublicDeleteObjectV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID} | Delete an existing Ezsigntemplatepublic |
| [**ezsigntemplatepublicEditObjectV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicEditObjectV1) | **PUT** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID} | Edit an existing Ezsigntemplatepublic |
| [**ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1) | **POST** /1/object/ezsigntemplatepublic/getEzsigntemplatepublicDetails | Retrieve the Ezsigntemplatepublic details |
| [**ezsigntemplatepublicGetFormsDataV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetFormsDataV1) | **GET** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID}/getFormsData | Retrieve an existing Ezsigntemplatepublic&#39;s forms data |
| [**ezsigntemplatepublicGetListV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetListV1) | **GET** /1/object/ezsigntemplatepublic/getList | Retrieve Ezsigntemplatepublic list |
| [**ezsigntemplatepublicGetObjectV2**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetObjectV2) | **GET** /2/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID} | Retrieve an existing Ezsigntemplatepublic |
| [**ezsigntemplatepublicResetLimitExceededCounterV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicResetLimitExceededCounterV1) | **POST** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID}/resetLimitExceededCounter | Reset the limit exceeded counter |
| [**ezsigntemplatepublicResetUrlV1**](ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicResetUrlV1) | **POST** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID}/resetUrl | Reset the Ezsigntemplatepublic url |


<a id="ezsigntemplatepublicCreateEzsignfolderV1"></a>
# **ezsigntemplatepublicCreateEzsignfolderV1**
> EzsigntemplatepublicCreateEzsignfolderV1Response ezsigntemplatepublicCreateEzsignfolderV1(ezsigntemplatepublicCreateEzsignfolderV1Request)

Create an Ezsignfolder

Create an Ezsignfolder

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepublicApi()
val ezsigntemplatepublicCreateEzsignfolderV1Request : EzsigntemplatepublicCreateEzsignfolderV1Request =  // EzsigntemplatepublicCreateEzsignfolderV1Request | 
try {
    val result : EzsigntemplatepublicCreateEzsignfolderV1Response = apiInstance.ezsigntemplatepublicCreateEzsignfolderV1(ezsigntemplatepublicCreateEzsignfolderV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicCreateEzsignfolderV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicCreateEzsignfolderV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatepublicCreateEzsignfolderV1Request** | [**EzsigntemplatepublicCreateEzsignfolderV1Request**](EzsigntemplatepublicCreateEzsignfolderV1Request.md)|  | |

### Return type

[**EzsigntemplatepublicCreateEzsignfolderV1Response**](EzsigntemplatepublicCreateEzsignfolderV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatepublicCreateObjectV1"></a>
# **ezsigntemplatepublicCreateObjectV1**
> EzsigntemplatepublicCreateObjectV1Response ezsigntemplatepublicCreateObjectV1(ezsigntemplatepublicCreateObjectV1Request)

Create a new Ezsigntemplatepublic

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepublicApi()
val ezsigntemplatepublicCreateObjectV1Request : EzsigntemplatepublicCreateObjectV1Request =  // EzsigntemplatepublicCreateObjectV1Request | 
try {
    val result : EzsigntemplatepublicCreateObjectV1Response = apiInstance.ezsigntemplatepublicCreateObjectV1(ezsigntemplatepublicCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatepublicCreateObjectV1Request** | [**EzsigntemplatepublicCreateObjectV1Request**](EzsigntemplatepublicCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatepublicCreateObjectV1Response**](EzsigntemplatepublicCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatepublicDeleteObjectV1"></a>
# **ezsigntemplatepublicDeleteObjectV1**
> EzsigntemplatepublicDeleteObjectV1Response ezsigntemplatepublicDeleteObjectV1(pkiEzsigntemplatepublicID)

Delete an existing Ezsigntemplatepublic



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepublicApi()
val pkiEzsigntemplatepublicID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigntemplatepublic
try {
    val result : EzsigntemplatepublicDeleteObjectV1Response = apiInstance.ezsigntemplatepublicDeleteObjectV1(pkiEzsigntemplatepublicID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatepublicID** | **kotlin.Int**| The unique ID of the Ezsigntemplatepublic | |

### Return type

[**EzsigntemplatepublicDeleteObjectV1Response**](EzsigntemplatepublicDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatepublicEditObjectV1"></a>
# **ezsigntemplatepublicEditObjectV1**
> EzsigntemplatepublicEditObjectV1Response ezsigntemplatepublicEditObjectV1(pkiEzsigntemplatepublicID, ezsigntemplatepublicEditObjectV1Request)

Edit an existing Ezsigntemplatepublic



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepublicApi()
val pkiEzsigntemplatepublicID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigntemplatepublic
val ezsigntemplatepublicEditObjectV1Request : EzsigntemplatepublicEditObjectV1Request =  // EzsigntemplatepublicEditObjectV1Request | 
try {
    val result : EzsigntemplatepublicEditObjectV1Response = apiInstance.ezsigntemplatepublicEditObjectV1(pkiEzsigntemplatepublicID, ezsigntemplatepublicEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigntemplatepublicID** | **kotlin.Int**| The unique ID of the Ezsigntemplatepublic | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatepublicEditObjectV1Request** | [**EzsigntemplatepublicEditObjectV1Request**](EzsigntemplatepublicEditObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatepublicEditObjectV1Response**](EzsigntemplatepublicEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1"></a>
# **ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1**
> EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Response ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1(ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request)

Retrieve the Ezsigntemplatepublic details

Retrieve the Ezsigntemplatepublic details

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepublicApi()
val ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request : EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request =  // EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request | 
try {
    val result : EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Response = apiInstance.ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1(ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request** | [**EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request**](EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request.md)|  | |

### Return type

[**EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Response**](EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatepublicGetFormsDataV1"></a>
# **ezsigntemplatepublicGetFormsDataV1**
> EzsigntemplatepublicGetFormsDataV1Response ezsigntemplatepublicGetFormsDataV1(pkiEzsigntemplatepublicID)

Retrieve an existing Ezsigntemplatepublic&#39;s forms data



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepublicApi()
val pkiEzsigntemplatepublicID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepublicGetFormsDataV1Response = apiInstance.ezsigntemplatepublicGetFormsDataV1(pkiEzsigntemplatepublicID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetFormsDataV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetFormsDataV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatepublicID** | **kotlin.Int**|  | |

### Return type

[**EzsigntemplatepublicGetFormsDataV1Response**](EzsigntemplatepublicGetFormsDataV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatepublicGetListV1"></a>
# **ezsigntemplatepublicGetListV1**
> EzsigntemplatepublicGetListV1Response ezsigntemplatepublicGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsigntemplatepublic list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplatepublicLimittype | Hour&lt;br&gt;Day&lt;br&gt;Month&lt;br&gt;Total |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepublicApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzsigntemplatepublicGetListV1Response = apiInstance.ezsigntemplatepublicGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsigntemplatepublicID_ASC, pkiEzsigntemplatepublicID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, fkiUserlogintypeID_ASC, fkiUserlogintypeID_DESC, fkiEzsigntemplateID_ASC, fkiEzsigntemplateID_DESC, fkiEzsigntemplatepackageID_ASC, fkiEzsigntemplatepackageID_DESC, sEzsigntemplatepublicDescription_ASC, sEzsigntemplatepublicDescription_DESC, bEzsigntemplatepublicIsactive_ASC, bEzsigntemplatepublicIsactive_DESC, tEzsigntemplatepublicNote_ASC, tEzsigntemplatepublicNote_DESC, eEzsigntemplatepublicLimittype_ASC, eEzsigntemplatepublicLimittype_DESC, iEzsigntemplatepublicLimit_ASC, iEzsigntemplatepublicLimit_DESC, iEzsigntemplatepublicLimitexceeded_ASC, iEzsigntemplatepublicLimitexceeded_DESC, dtEzsigntemplatepublicLimitexceededsince_ASC, dtEzsigntemplatepublicLimitexceededsince_DESC, iEzsignfolder_ASC, iEzsignfolder_DESC, iEzsigndocument_ASC, iEzsigndocument_DESC, sEzsigntemplatepublicEzsigntemplatedescription_ASC, sEzsigntemplatepublicEzsigntemplatedescription_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**EzsigntemplatepublicGetListV1Response**](EzsigntemplatepublicGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatepublicGetObjectV2"></a>
# **ezsigntemplatepublicGetObjectV2**
> EzsigntemplatepublicGetObjectV2Response ezsigntemplatepublicGetObjectV2(pkiEzsigntemplatepublicID)

Retrieve an existing Ezsigntemplatepublic



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepublicApi()
val pkiEzsigntemplatepublicID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigntemplatepublic
try {
    val result : EzsigntemplatepublicGetObjectV2Response = apiInstance.ezsigntemplatepublicGetObjectV2(pkiEzsigntemplatepublicID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatepublicID** | **kotlin.Int**| The unique ID of the Ezsigntemplatepublic | |

### Return type

[**EzsigntemplatepublicGetObjectV2Response**](EzsigntemplatepublicGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatepublicResetLimitExceededCounterV1"></a>
# **ezsigntemplatepublicResetLimitExceededCounterV1**
> EzsigntemplatepublicResetLimitExceededCounterV1Response ezsigntemplatepublicResetLimitExceededCounterV1(pkiEzsigntemplatepublicID, body)

Reset the limit exceeded counter



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepublicApi()
val pkiEzsigntemplatepublicID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EzsigntemplatepublicResetLimitExceededCounterV1Response = apiInstance.ezsigntemplatepublicResetLimitExceededCounterV1(pkiEzsigntemplatepublicID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicResetLimitExceededCounterV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicResetLimitExceededCounterV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigntemplatepublicID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | |

### Return type

[**EzsigntemplatepublicResetLimitExceededCounterV1Response**](EzsigntemplatepublicResetLimitExceededCounterV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatepublicResetUrlV1"></a>
# **ezsigntemplatepublicResetUrlV1**
> EzsigntemplatepublicResetUrlV1Response ezsigntemplatepublicResetUrlV1(pkiEzsigntemplatepublicID, body)

Reset the Ezsigntemplatepublic url



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepublicApi()
val pkiEzsigntemplatepublicID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EzsigntemplatepublicResetUrlV1Response = apiInstance.ezsigntemplatepublicResetUrlV1(pkiEzsigntemplatepublicID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicResetUrlV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepublicApi#ezsigntemplatepublicResetUrlV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigntemplatepublicID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | |

### Return type

[**EzsigntemplatepublicResetUrlV1Response**](EzsigntemplatepublicResetUrlV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


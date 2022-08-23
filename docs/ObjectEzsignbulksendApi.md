# ObjectEzsignbulksendApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignbulksendCreateEzsignbulksendtransmissionV1**](ObjectEzsignbulksendApi.md#ezsignbulksendCreateEzsignbulksendtransmissionV1) | **POST** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission | Create a new Ezsignbulksendtransmission in the Ezsignbulksend
[**ezsignbulksendCreateObjectV1**](ObjectEzsignbulksendApi.md#ezsignbulksendCreateObjectV1) | **POST** /1/object/ezsignbulksend | Create a new Ezsignbulksend
[**ezsignbulksendDeleteObjectV1**](ObjectEzsignbulksendApi.md#ezsignbulksendDeleteObjectV1) | **DELETE** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Delete an existing Ezsignbulksend
[**ezsignbulksendEditObjectV1**](ObjectEzsignbulksendApi.md#ezsignbulksendEditObjectV1) | **PUT** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Edit an existing Ezsignbulksend
[**ezsignbulksendGetCsvTemplateV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetCsvTemplateV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getCsvTemplate | Retrieve an existing Ezsignbulksend&#39;s empty Csv template
[**ezsignbulksendGetEzsignbulksendtransmissionsV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetEzsignbulksendtransmissionsV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getEzsignbulksendtransmissions | Retrieve an existing Ezsignbulksend&#39;s Ezsignbulksendtransmissions
[**ezsignbulksendGetFormsDataV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetFormsDataV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getFormsData | Retrieve an existing Ezsignbulksend&#39;s forms data
[**ezsignbulksendGetListV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetListV1) | **GET** /1/object/ezsignbulksend/getList | Retrieve Ezsignbulksend list
[**ezsignbulksendGetObjectV1**](ObjectEzsignbulksendApi.md#ezsignbulksendGetObjectV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Retrieve an existing Ezsignbulksend
[**ezsignbulksendReorderV1**](ObjectEzsignbulksendApi.md#ezsignbulksendReorderV1) | **POST** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/reorder | Reorder Ezsignbulksenddocumentmappings in the Ezsignbulksend


<a name="ezsignbulksendCreateEzsignbulksendtransmissionV1"></a>
# **ezsignbulksendCreateEzsignbulksendtransmissionV1**
> EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusResponse ezsignbulksendCreateEzsignbulksendtransmissionV1(pkiEzsignbulksendID, ezsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusRequest)

Create a new Ezsignbulksendtransmission in the Ezsignbulksend

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendApi()
val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
val ezsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusRequest : EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusRequest =  // EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusRequest | 
try {
    val result : EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusResponse = apiInstance.ezsignbulksendCreateEzsignbulksendtransmissionV1(pkiEzsignbulksendID, ezsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendApi#ezsignbulksendCreateEzsignbulksendtransmissionV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendApi#ezsignbulksendCreateEzsignbulksendtransmissionV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendID** | **kotlin.Int**|  |
 **ezsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusRequest** | [**EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusRequest**](EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusRequest.md)|  |

### Return type

[**EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusResponse**](EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignbulksendCreateObjectV1"></a>
# **ezsignbulksendCreateObjectV1**
> EzsignbulksendMinusCreateObjectMinusV1MinusResponse ezsignbulksendCreateObjectV1(ezsignbulksendMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsignbulksend

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendApi()
val ezsignbulksendMinusCreateObjectMinusV1MinusRequest : EzsignbulksendMinusCreateObjectMinusV1MinusRequest =  // EzsignbulksendMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsignbulksendMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsignbulksendCreateObjectV1(ezsignbulksendMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendApi#ezsignbulksendCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendApi#ezsignbulksendCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignbulksendMinusCreateObjectMinusV1MinusRequest** | [**EzsignbulksendMinusCreateObjectMinusV1MinusRequest**](EzsignbulksendMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignbulksendMinusCreateObjectMinusV1MinusResponse**](EzsignbulksendMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignbulksendDeleteObjectV1"></a>
# **ezsignbulksendDeleteObjectV1**
> EzsignbulksendMinusDeleteObjectMinusV1MinusResponse ezsignbulksendDeleteObjectV1(pkiEzsignbulksendID)

Delete an existing Ezsignbulksend



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendApi()
val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsignbulksendDeleteObjectV1(pkiEzsignbulksendID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendApi#ezsignbulksendDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendApi#ezsignbulksendDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksendMinusDeleteObjectMinusV1MinusResponse**](EzsignbulksendMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksendEditObjectV1"></a>
# **ezsignbulksendEditObjectV1**
> EzsignbulksendMinusEditObjectMinusV1MinusResponse ezsignbulksendEditObjectV1(pkiEzsignbulksendID, ezsignbulksendMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsignbulksend



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendApi()
val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
val ezsignbulksendMinusEditObjectMinusV1MinusRequest : EzsignbulksendMinusEditObjectMinusV1MinusRequest =  // EzsignbulksendMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsignbulksendMinusEditObjectMinusV1MinusResponse = apiInstance.ezsignbulksendEditObjectV1(pkiEzsignbulksendID, ezsignbulksendMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendApi#ezsignbulksendEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendApi#ezsignbulksendEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendID** | **kotlin.Int**|  |
 **ezsignbulksendMinusEditObjectMinusV1MinusRequest** | [**EzsignbulksendMinusEditObjectMinusV1MinusRequest**](EzsignbulksendMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignbulksendMinusEditObjectMinusV1MinusResponse**](EzsignbulksendMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignbulksendGetCsvTemplateV1"></a>
# **ezsignbulksendGetCsvTemplateV1**
> kotlin.String ezsignbulksendGetCsvTemplateV1(pkiEzsignbulksendID, eCsvSeparator)

Retrieve an existing Ezsignbulksend&#39;s empty Csv template



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendApi()
val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
val eCsvSeparator : kotlin.String = eCsvSeparator_example // kotlin.String | Separator that will be used to separate fields
try {
    val result : kotlin.String = apiInstance.ezsignbulksendGetCsvTemplateV1(pkiEzsignbulksendID, eCsvSeparator)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendApi#ezsignbulksendGetCsvTemplateV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendApi#ezsignbulksendGetCsvTemplateV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendID** | **kotlin.Int**|  |
 **eCsvSeparator** | **kotlin.String**| Separator that will be used to separate fields | [enum: Comma, Semicolon]

### Return type

**kotlin.String**

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksendGetEzsignbulksendtransmissionsV1"></a>
# **ezsignbulksendGetEzsignbulksendtransmissionsV1**
> EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponse ezsignbulksendGetEzsignbulksendtransmissionsV1(pkiEzsignbulksendID)

Retrieve an existing Ezsignbulksend&#39;s Ezsignbulksendtransmissions



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendApi()
val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponse = apiInstance.ezsignbulksendGetEzsignbulksendtransmissionsV1(pkiEzsignbulksendID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendApi#ezsignbulksendGetEzsignbulksendtransmissionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendApi#ezsignbulksendGetEzsignbulksendtransmissionsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponse**](EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksendGetFormsDataV1"></a>
# **ezsignbulksendGetFormsDataV1**
> EzsignbulksendMinusGetFormsDataMinusV1MinusResponse ezsignbulksendGetFormsDataV1(pkiEzsignbulksendID)

Retrieve an existing Ezsignbulksend&#39;s forms data



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendApi()
val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendMinusGetFormsDataMinusV1MinusResponse = apiInstance.ezsignbulksendGetFormsDataV1(pkiEzsignbulksendID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendApi#ezsignbulksendGetFormsDataV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendApi#ezsignbulksendGetFormsDataV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksendMinusGetFormsDataMinusV1MinusResponse**](EzsignbulksendMinusGetFormsDataMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksendGetListV1"></a>
# **ezsignbulksendGetListV1**
> EzsignbulksendMinusGetListMinusV1MinusResponse ezsignbulksendGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignbulksend list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzsignbulksendMinusGetListMinusV1MinusResponse = apiInstance.ezsignbulksendGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendApi#ezsignbulksendGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendApi#ezsignbulksendGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignbulksendID_ASC, pkiEzsignbulksendID_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, sEzsignbulksendDescription_ASC, sEzsignbulksendDescription_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, eEzsignfoldertypePrivacylevel_ASC, eEzsignfoldertypePrivacylevel_DESC, bEzsignbulksendNeedvalidation_ASC, bEzsignbulksendNeedvalidation_DESC, iEzsignbulksendtransmission_ASC, iEzsignbulksendtransmission_DESC, iEzsignfolder_ASC, iEzsignfolder_DESC, iEzsigndocument_ASC, iEzsigndocument_DESC, iEzsignsignature_ASC, iEzsignsignature_DESC, iEzsignsignatureSigned_ASC, iEzsignsignatureSigned_DESC, bEzsignbulksendIsactive_ASC, bEzsignbulksendIsactive_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**EzsignbulksendMinusGetListMinusV1MinusResponse**](EzsignbulksendMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksendGetObjectV1"></a>
# **ezsignbulksendGetObjectV1**
> EzsignbulksendMinusGetObjectMinusV1MinusResponse ezsignbulksendGetObjectV1(pkiEzsignbulksendID)

Retrieve an existing Ezsignbulksend



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendApi()
val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendMinusGetObjectMinusV1MinusResponse = apiInstance.ezsignbulksendGetObjectV1(pkiEzsignbulksendID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendApi#ezsignbulksendGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendApi#ezsignbulksendGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendID** | **kotlin.Int**|  |

### Return type

[**EzsignbulksendMinusGetObjectMinusV1MinusResponse**](EzsignbulksendMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignbulksendReorderV1"></a>
# **ezsignbulksendReorderV1**
> EzsignbulksendMinusReorderMinusV1MinusResponse ezsignbulksendReorderV1(pkiEzsignbulksendID, ezsignbulksendMinusReorderMinusV1MinusRequest)

Reorder Ezsignbulksenddocumentmappings in the Ezsignbulksend

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendApi()
val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
val ezsignbulksendMinusReorderMinusV1MinusRequest : EzsignbulksendMinusReorderMinusV1MinusRequest =  // EzsignbulksendMinusReorderMinusV1MinusRequest | 
try {
    val result : EzsignbulksendMinusReorderMinusV1MinusResponse = apiInstance.ezsignbulksendReorderV1(pkiEzsignbulksendID, ezsignbulksendMinusReorderMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendApi#ezsignbulksendReorderV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendApi#ezsignbulksendReorderV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignbulksendID** | **kotlin.Int**|  |
 **ezsignbulksendMinusReorderMinusV1MinusRequest** | [**EzsignbulksendMinusReorderMinusV1MinusRequest**](EzsignbulksendMinusReorderMinusV1MinusRequest.md)|  |

### Return type

[**EzsignbulksendMinusReorderMinusV1MinusResponse**](EzsignbulksendMinusReorderMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


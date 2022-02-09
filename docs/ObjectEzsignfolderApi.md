# ObjectEzsignfolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfolderCreateObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
[**ezsignfolderDeleteObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderDeleteObjectV1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
[**ezsignfolderEditObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderEditObjectV1) | **PUT** /1/object/ezsignfolder/{pkiEzsignfolderID} | Modify an existing Ezsignfolder
[**ezsignfolderGetEzsigndocumentsV1**](ObjectEzsignfolderApi.md#ezsignfolderGetEzsigndocumentsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsigndocuments | Retrieve an existing Ezsignfolder&#39;s Ezsigndocuments
[**ezsignfolderGetEzsignfoldersignerassociationsV1**](ObjectEzsignfolderApi.md#ezsignfolderGetEzsignfoldersignerassociationsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsignfoldersignerassociations | Retrieve an existing Ezsignfolder&#39;s Ezsignfoldersignerassociations
[**ezsignfolderGetFormsDataV1**](ObjectEzsignfolderApi.md#ezsignfolderGetFormsDataV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getFormsData | Retrieve an existing Ezsignfolder&#39;s forms data
[**ezsignfolderGetListV1**](ObjectEzsignfolderApi.md#ezsignfolderGetListV1) | **GET** /1/object/ezsignfolder/getList | Retrieve Ezsignfolder list
[**ezsignfolderGetObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderGetObjectV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
[**ezsignfolderSendV1**](ObjectEzsignfolderApi.md#ezsignfolderSendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
[**ezsignfolderUnsendV1**](ObjectEzsignfolderApi.md#ezsignfolderUnsendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/unsend | Unsend the Ezsignfolder


<a name="ezsignfolderCreateObjectV1"></a>
# **ezsignfolderCreateObjectV1**
> EzsignfolderMinusCreateObjectMinusV1MinusResponse ezsignfolderCreateObjectV1(ezsignfolderMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsignfolder

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val ezsignfolderMinusCreateObjectMinusV1MinusRequest : kotlin.collections.List<EzsignfolderMinusCreateObjectMinusV1MinusRequest> =  // kotlin.collections.List<EzsignfolderMinusCreateObjectMinusV1MinusRequest> | 
try {
    val result : EzsignfolderMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsignfolderCreateObjectV1(ezsignfolderMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfolderMinusCreateObjectMinusV1MinusRequest** | [**kotlin.collections.List&lt;EzsignfolderMinusCreateObjectMinusV1MinusRequest&gt;**](EzsignfolderMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignfolderMinusCreateObjectMinusV1MinusResponse**](EzsignfolderMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignfolderDeleteObjectV1"></a>
# **ezsignfolderDeleteObjectV1**
> EzsignfolderMinusDeleteObjectMinusV1MinusResponse ezsignfolderDeleteObjectV1(pkiEzsignfolderID)

Delete an existing Ezsignfolder

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfolderMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsignfolderDeleteObjectV1(pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |

### Return type

[**EzsignfolderMinusDeleteObjectMinusV1MinusResponse**](EzsignfolderMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignfolderEditObjectV1"></a>
# **ezsignfolderEditObjectV1**
> EzsignfolderMinusEditObjectMinusV1MinusResponse ezsignfolderEditObjectV1(pkiEzsignfolderID, ezsignfolderMinusEditObjectMinusV1MinusRequest)

Modify an existing Ezsignfolder

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfolderMinusEditObjectMinusV1MinusRequest : EzsignfolderMinusEditObjectMinusV1MinusRequest =  // EzsignfolderMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsignfolderMinusEditObjectMinusV1MinusResponse = apiInstance.ezsignfolderEditObjectV1(pkiEzsignfolderID, ezsignfolderMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |
 **ezsignfolderMinusEditObjectMinusV1MinusRequest** | [**EzsignfolderMinusEditObjectMinusV1MinusRequest**](EzsignfolderMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignfolderMinusEditObjectMinusV1MinusResponse**](EzsignfolderMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignfolderGetEzsigndocumentsV1"></a>
# **ezsignfolderGetEzsigndocumentsV1**
> EzsignfolderMinusGetEzsigndocumentsMinusV1MinusResponse ezsignfolderGetEzsigndocumentsV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s Ezsigndocuments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfolderMinusGetEzsigndocumentsMinusV1MinusResponse = apiInstance.ezsignfolderGetEzsigndocumentsV1(pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetEzsigndocumentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetEzsigndocumentsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |

### Return type

[**EzsignfolderMinusGetEzsigndocumentsMinusV1MinusResponse**](EzsignfolderMinusGetEzsigndocumentsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignfolderGetEzsignfoldersignerassociationsV1"></a>
# **ezsignfolderGetEzsignfoldersignerassociationsV1**
> EzsignfolderMinusGetEzsignfoldersignerassociationsMinusV1MinusResponse ezsignfolderGetEzsignfoldersignerassociationsV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s Ezsignfoldersignerassociations

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfolderMinusGetEzsignfoldersignerassociationsMinusV1MinusResponse = apiInstance.ezsignfolderGetEzsignfoldersignerassociationsV1(pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetEzsignfoldersignerassociationsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetEzsignfoldersignerassociationsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |

### Return type

[**EzsignfolderMinusGetEzsignfoldersignerassociationsMinusV1MinusResponse**](EzsignfolderMinusGetEzsignfoldersignerassociationsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignfolderGetFormsDataV1"></a>
# **ezsignfolderGetFormsDataV1**
> EzsignfolderMinusGetFormsDataMinusV1MinusResponse ezsignfolderGetFormsDataV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s forms data

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfolderMinusGetFormsDataMinusV1MinusResponse = apiInstance.ezsignfolderGetFormsDataV1(pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetFormsDataV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetFormsDataV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |

### Return type

[**EzsignfolderMinusGetFormsDataMinusV1MinusResponse**](EzsignfolderMinusGetFormsDataMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignfolderGetListV1"></a>
# **ezsignfolderGetListV1**
> EzsignfolderMinusGetListMinusV1MinusResponse ezsignfolderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignfolder list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfolderStep | Unsent&lt;br&gt;Sent&lt;br&gt;PartiallySigned&lt;br&gt;Expired&lt;br&gt;Completed&lt;br&gt;Archived | | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzsignfolderMinusGetListMinusV1MinusResponse = apiInstance.ezsignfolderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignfolderID_ASC, pkiEzsignfolderID_DESC, sEzsignfolderDescription_ASC, sEzsignfolderDescription_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, eEzsignfolderStep_ASC, eEzsignfolderStep_DESC, dtEzsignfolderSentdate_ASC, dtEzsignfolderSentdate_DESC, dtDueDate_ASC, dtDueDate_DESC, iTotalDocument_ASC, iTotalDocument_DESC, iTotalDocumentEdm_ASC, iTotalDocumentEdm_DESC, iTotalSignature_ASC, iTotalSignature_DESC, iTotalSignatureSigned_ASC, iTotalSignatureSigned_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**EzsignfolderMinusGetListMinusV1MinusResponse**](EzsignfolderMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignfolderGetObjectV1"></a>
# **ezsignfolderGetObjectV1**
> EzsignfolderMinusGetObjectMinusV1MinusResponse ezsignfolderGetObjectV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfolderMinusGetObjectMinusV1MinusResponse = apiInstance.ezsignfolderGetObjectV1(pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |

### Return type

[**EzsignfolderMinusGetObjectMinusV1MinusResponse**](EzsignfolderMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignfolderSendV1"></a>
# **ezsignfolderSendV1**
> EzsignfolderMinusSendMinusV1MinusResponse ezsignfolderSendV1(pkiEzsignfolderID, ezsignfolderMinusSendMinusV1MinusRequest)

Send the Ezsignfolder to the signatories for signature

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfolderMinusSendMinusV1MinusRequest : EzsignfolderMinusSendMinusV1MinusRequest =  // EzsignfolderMinusSendMinusV1MinusRequest | 
try {
    val result : EzsignfolderMinusSendMinusV1MinusResponse = apiInstance.ezsignfolderSendV1(pkiEzsignfolderID, ezsignfolderMinusSendMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderSendV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderSendV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |
 **ezsignfolderMinusSendMinusV1MinusRequest** | [**EzsignfolderMinusSendMinusV1MinusRequest**](EzsignfolderMinusSendMinusV1MinusRequest.md)|  |

### Return type

[**EzsignfolderMinusSendMinusV1MinusResponse**](EzsignfolderMinusSendMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignfolderUnsendV1"></a>
# **ezsignfolderUnsendV1**
> EzsignfolderMinusUnsendMinusV1MinusResponse ezsignfolderUnsendV1(pkiEzsignfolderID, body)

Unsend the Ezsignfolder

Once an Ezsignfolder has been sent to signatories, it cannot be modified.  Using this endpoint, you can unsend the Ezsignfolder and make it modifiable again.  Signatories will receive an email informing them the signature process was aborted and they might receive a new invitation to sign.  ⚠️ Warning: Any signature previously made by signatories on \&quot;Non-completed\&quot; Ezsigndocuments will be lost.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : EzsignfolderMinusUnsendMinusV1MinusResponse = apiInstance.ezsignfolderUnsendV1(pkiEzsignfolderID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderUnsendV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderUnsendV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |
 **body** | **kotlin.String**|  |

### Return type

[**EzsignfolderMinusUnsendMinusV1MinusResponse**](EzsignfolderMinusUnsendMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


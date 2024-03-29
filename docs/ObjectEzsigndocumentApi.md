# ObjectEzsigndocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigndocumentApplyEzsigntemplateV1**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument.
[**ezsigndocumentApplyEzsigntemplateV2**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV2) | **POST** /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument.
[**ezsigndocumentCreateObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
[**ezsigndocumentCreateObjectV2**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV2) | **POST** /2/object/ezsigndocument | Create a new Ezsigndocument
[**ezsigndocumentDeclineToSignV1**](ObjectEzsigndocumentApi.md#ezsigndocumentDeclineToSignV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/declineToSign | Decline to sign
[**ezsigndocumentDeleteObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentDeleteObjectV1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
[**ezsigndocumentEditEzsignformfieldgroupsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignformfieldgroupsV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignformfieldgroups | Edit multiple Ezsignformfieldgroups
[**ezsigndocumentEditEzsignsignaturesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignsignaturesV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures | Edit multiple Ezsignsignatures
[**ezsigndocumentEndPrematurelyV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEndPrematurelyV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/endPrematurely | End prematurely
[**ezsigndocumentFlattenV1**](ObjectEzsigndocumentApi.md#ezsigndocumentFlattenV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/flatten | Flatten
[**ezsigndocumentGetActionableElementsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetActionableElementsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getActionableElements | Retrieve actionable elements for the Ezsigndocument
[**ezsigndocumentGetCompletedElementsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetCompletedElementsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getCompletedElements | Retrieve completed elements for the Ezsigndocument
[**ezsigndocumentGetDownloadUrlV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetDownloadUrlV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
[**ezsigndocumentGetEzsignannotationsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignannotationsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignannotations | Retrieve an existing Ezsigndocument&#39;s Ezsignannotations
[**ezsigndocumentGetEzsignformfieldgroupsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignformfieldgroupsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignformfieldgroups | Retrieve an existing Ezsigndocument&#39;s Ezsignformfieldgroups
[**ezsigndocumentGetEzsignpagesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignpagesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignpages | Retrieve an existing Ezsigndocument&#39;s Ezsignpages
[**ezsigndocumentGetEzsignsignaturesAutomaticV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignaturesAutomatic | Retrieve an existing Ezsigndocument&#39;s automatic Ezsignsignatures
[**ezsigndocumentGetEzsignsignaturesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignsignaturesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignatures | Retrieve an existing Ezsigndocument&#39;s Ezsignsignatures
[**ezsigndocumentGetFormDataV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetFormDataV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getFormData | Retrieve an existing Ezsigndocument&#39;s Form Data
[**ezsigndocumentGetObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
[**ezsigndocumentGetObjectV2**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV2) | **GET** /2/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
[**ezsigndocumentGetTemporaryProofV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetTemporaryProofV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof | Retrieve the temporary proof
[**ezsigndocumentGetWordsPositionsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetWordsPositionsV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigndocument
[**ezsigndocumentPatchObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentPatchObjectV1) | **PATCH** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Patch an existing Ezsigndocument
[**ezsigndocumentSubmitEzsignformV1**](ObjectEzsigndocumentApi.md#ezsigndocumentSubmitEzsignformV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/submitEzsignform | Submit the Ezsignform
[**ezsigndocumentUnsendV1**](ObjectEzsigndocumentApi.md#ezsigndocumentUnsendV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/unsend | Unsend the Ezsigndocument


<a id="ezsigndocumentApplyEzsigntemplateV1"></a>
# **ezsigndocumentApplyEzsigntemplateV1**
> EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest)

Apply an Ezsigntemplate to the Ezsigndocument.

This function is deprecated. Please use *applyEzsigntemplate* instead which is doing the same thing but with a capital \&quot;E\&quot; to normalize the nomenclature.  This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest : EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest =  // EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest | 
try {
    val result : EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse = apiInstance.ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentApplyEzsigntemplateV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentApplyEzsigntemplateV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest** | [**EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest**](EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest.md)|  |

### Return type

[**EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse**](EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentApplyEzsigntemplateV2"></a>
# **ezsigndocumentApplyEzsigntemplateV2**
> EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusResponse ezsigndocumentApplyEzsigntemplateV2(pkiEzsigndocumentID, ezsigndocumentMinusApplyEzsigntemplateMinusV2MinusRequest)

Apply an Ezsigntemplate to the Ezsigndocument.

This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentMinusApplyEzsigntemplateMinusV2MinusRequest : EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusRequest =  // EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusRequest | 
try {
    val result : EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusResponse = apiInstance.ezsigndocumentApplyEzsigntemplateV2(pkiEzsigndocumentID, ezsigndocumentMinusApplyEzsigntemplateMinusV2MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentApplyEzsigntemplateV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentApplyEzsigntemplateV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **ezsigndocumentMinusApplyEzsigntemplateMinusV2MinusRequest** | [**EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusRequest**](EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusRequest.md)|  |

### Return type

[**EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusResponse**](EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentCreateObjectV1"></a>
# **ezsigndocumentCreateObjectV1**
> EzsigndocumentMinusCreateObjectMinusV1MinusResponse ezsigndocumentCreateObjectV1(ezsigndocumentMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsigndocument

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val ezsigndocumentMinusCreateObjectMinusV1MinusRequest : kotlin.collections.List<EzsigndocumentMinusCreateObjectMinusV1MinusRequest> =  // kotlin.collections.List<EzsigndocumentMinusCreateObjectMinusV1MinusRequest> | 
try {
    val result : EzsigndocumentMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsigndocumentCreateObjectV1(ezsigndocumentMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigndocumentMinusCreateObjectMinusV1MinusRequest** | [**kotlin.collections.List&lt;EzsigndocumentMinusCreateObjectMinusV1MinusRequest&gt;**](EzsigndocumentMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigndocumentMinusCreateObjectMinusV1MinusResponse**](EzsigndocumentMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentCreateObjectV2"></a>
# **ezsigndocumentCreateObjectV2**
> EzsigndocumentMinusCreateObjectMinusV2MinusResponse ezsigndocumentCreateObjectV2(ezsigndocumentMinusCreateObjectMinusV2MinusRequest)

Create a new Ezsigndocument

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val ezsigndocumentMinusCreateObjectMinusV2MinusRequest : EzsigndocumentMinusCreateObjectMinusV2MinusRequest =  // EzsigndocumentMinusCreateObjectMinusV2MinusRequest | 
try {
    val result : EzsigndocumentMinusCreateObjectMinusV2MinusResponse = apiInstance.ezsigndocumentCreateObjectV2(ezsigndocumentMinusCreateObjectMinusV2MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentCreateObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentCreateObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigndocumentMinusCreateObjectMinusV2MinusRequest** | [**EzsigndocumentMinusCreateObjectMinusV2MinusRequest**](EzsigndocumentMinusCreateObjectMinusV2MinusRequest.md)|  |

### Return type

[**EzsigndocumentMinusCreateObjectMinusV2MinusResponse**](EzsigndocumentMinusCreateObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentDeclineToSignV1"></a>
# **ezsigndocumentDeclineToSignV1**
> EzsigndocumentMinusDeclineToSignMinusV1MinusResponse ezsigndocumentDeclineToSignV1(pkiEzsigndocumentID, ezsigndocumentMinusDeclineToSignMinusV1MinusRequest)

Decline to sign

Decline to sign

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentMinusDeclineToSignMinusV1MinusRequest : EzsigndocumentMinusDeclineToSignMinusV1MinusRequest =  // EzsigndocumentMinusDeclineToSignMinusV1MinusRequest | 
try {
    val result : EzsigndocumentMinusDeclineToSignMinusV1MinusResponse = apiInstance.ezsigndocumentDeclineToSignV1(pkiEzsigndocumentID, ezsigndocumentMinusDeclineToSignMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentDeclineToSignV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentDeclineToSignV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **ezsigndocumentMinusDeclineToSignMinusV1MinusRequest** | [**EzsigndocumentMinusDeclineToSignMinusV1MinusRequest**](EzsigndocumentMinusDeclineToSignMinusV1MinusRequest.md)|  |

### Return type

[**EzsigndocumentMinusDeclineToSignMinusV1MinusResponse**](EzsigndocumentMinusDeclineToSignMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentDeleteObjectV1"></a>
# **ezsigndocumentDeleteObjectV1**
> EzsigndocumentMinusDeleteObjectMinusV1MinusResponse ezsigndocumentDeleteObjectV1(pkiEzsigndocumentID)

Delete an existing Ezsigndocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsigndocumentDeleteObjectV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusDeleteObjectMinusV1MinusResponse**](EzsigndocumentMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentEditEzsignformfieldgroupsV1"></a>
# **ezsigndocumentEditEzsignformfieldgroupsV1**
> EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusResponse ezsigndocumentEditEzsignformfieldgroupsV1(pkiEzsigndocumentID, ezsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusRequest)

Edit multiple Ezsignformfieldgroups

Using this endpoint, you can edit multiple Ezsignformfieldgroups at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusRequest : EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusRequest =  // EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusRequest | 
try {
    val result : EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusResponse = apiInstance.ezsigndocumentEditEzsignformfieldgroupsV1(pkiEzsigndocumentID, ezsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentEditEzsignformfieldgroupsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentEditEzsignformfieldgroupsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **ezsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusRequest** | [**EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusRequest**](EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusRequest.md)|  |

### Return type

[**EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusResponse**](EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentEditEzsignsignaturesV1"></a>
# **ezsigndocumentEditEzsignsignaturesV1**
> EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusResponse ezsigndocumentEditEzsignsignaturesV1(pkiEzsigndocumentID, ezsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest)

Edit multiple Ezsignsignatures

Using this endpoint, you can edit multiple Ezsignsignatures at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest : EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest =  // EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest | 
try {
    val result : EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusResponse = apiInstance.ezsigndocumentEditEzsignsignaturesV1(pkiEzsigndocumentID, ezsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentEditEzsignsignaturesV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentEditEzsignsignaturesV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **ezsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest** | [**EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest**](EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest.md)|  |

### Return type

[**EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusResponse**](EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentEndPrematurelyV1"></a>
# **ezsigndocumentEndPrematurelyV1**
> EzsigndocumentMinusEndPrematurelyMinusV1MinusResponse ezsigndocumentEndPrematurelyV1(pkiEzsigndocumentID, body)

End prematurely

End prematurely an Ezsigndocument when some signatures are still required

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EzsigndocumentMinusEndPrematurelyMinusV1MinusResponse = apiInstance.ezsigndocumentEndPrematurelyV1(pkiEzsigndocumentID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentEndPrematurelyV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentEndPrematurelyV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **body** | **kotlin.Any**|  |

### Return type

[**EzsigndocumentMinusEndPrematurelyMinusV1MinusResponse**](EzsigndocumentMinusEndPrematurelyMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentFlattenV1"></a>
# **ezsigndocumentFlattenV1**
> EzsigndocumentMinusFlattenMinusV1MinusResponse ezsigndocumentFlattenV1(pkiEzsigndocumentID, body)

Flatten

Flatten an Ezsigndocument signatures, forms and annotations. This process finalizes the PDF so that the forms and annotations become part of the document content and cannot be edited.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EzsigndocumentMinusFlattenMinusV1MinusResponse = apiInstance.ezsigndocumentFlattenV1(pkiEzsigndocumentID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentFlattenV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentFlattenV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **body** | **kotlin.Any**|  |

### Return type

[**EzsigndocumentMinusFlattenMinusV1MinusResponse**](EzsigndocumentMinusFlattenMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentGetActionableElementsV1"></a>
# **ezsigndocumentGetActionableElementsV1**
> EzsigndocumentMinusGetActionableElementsMinusV1MinusResponse ezsigndocumentGetActionableElementsV1(pkiEzsigndocumentID)

Retrieve actionable elements for the Ezsigndocument

Return the Ezsignsignatures that can be signed and Ezsignformfieldgroups that can be filled by the current user at the current step in the process

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusGetActionableElementsMinusV1MinusResponse = apiInstance.ezsigndocumentGetActionableElementsV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetActionableElementsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetActionableElementsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusGetActionableElementsMinusV1MinusResponse**](EzsigndocumentMinusGetActionableElementsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetCompletedElementsV1"></a>
# **ezsigndocumentGetCompletedElementsV1**
> EzsigndocumentMinusGetCompletedElementsMinusV1MinusResponse ezsigndocumentGetCompletedElementsV1(pkiEzsigndocumentID)

Retrieve completed elements for the Ezsigndocument

Return the completed Ezsignsignatures, Ezsignformfieldgroups and Ezsignannotations at the current step in the process

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusGetCompletedElementsMinusV1MinusResponse = apiInstance.ezsigndocumentGetCompletedElementsV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetCompletedElementsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetCompletedElementsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusGetCompletedElementsMinusV1MinusResponse**](EzsigndocumentMinusGetCompletedElementsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetDownloadUrlV1"></a>
# **ezsigndocumentGetDownloadUrlV1**
> EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse ezsigndocumentGetDownloadUrlV1(pkiEzsigndocumentID, eDocumentType)

Retrieve a URL to download documents.

This endpoint returns URLs to different files that can be downloaded during the signing process.  These links will expire after 5 minutes so the download of the file should be made soon after retrieving the link.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val eDocumentType : kotlin.String = eDocumentType_example // kotlin.String | The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **Signed** Is the final document once all signatures were applied. 3. **Proofdocument** Is the evidence report. 4. **Proof** Is the complete evidence archive including all of the above and more. 
try {
    val result : EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse = apiInstance.ezsigndocumentGetDownloadUrlV1(pkiEzsigndocumentID, eDocumentType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetDownloadUrlV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetDownloadUrlV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **eDocumentType** | **kotlin.String**| The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **Signed** Is the final document once all signatures were applied. 3. **Proofdocument** Is the evidence report. 4. **Proof** Is the complete evidence archive including all of the above and more.  | [enum: Initial, Signed, Proof, Proofdocument]

### Return type

[**EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse**](EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetEzsignannotationsV1"></a>
# **ezsigndocumentGetEzsignannotationsV1**
> EzsigndocumentMinusGetEzsignannotationsMinusV1MinusResponse ezsigndocumentGetEzsignannotationsV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignannotations



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusGetEzsignannotationsMinusV1MinusResponse = apiInstance.ezsigndocumentGetEzsignannotationsV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignannotationsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignannotationsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusGetEzsignannotationsMinusV1MinusResponse**](EzsigndocumentMinusGetEzsignannotationsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetEzsignformfieldgroupsV1"></a>
# **ezsigndocumentGetEzsignformfieldgroupsV1**
> EzsigndocumentMinusGetEzsignformfieldgroupsMinusV1MinusResponse ezsigndocumentGetEzsignformfieldgroupsV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignformfieldgroups



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusGetEzsignformfieldgroupsMinusV1MinusResponse = apiInstance.ezsigndocumentGetEzsignformfieldgroupsV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignformfieldgroupsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignformfieldgroupsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusGetEzsignformfieldgroupsMinusV1MinusResponse**](EzsigndocumentMinusGetEzsignformfieldgroupsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetEzsignpagesV1"></a>
# **ezsigndocumentGetEzsignpagesV1**
> EzsigndocumentMinusGetEzsignpagesMinusV1MinusResponse ezsigndocumentGetEzsignpagesV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignpages



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusGetEzsignpagesMinusV1MinusResponse = apiInstance.ezsigndocumentGetEzsignpagesV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignpagesV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignpagesV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusGetEzsignpagesMinusV1MinusResponse**](EzsigndocumentMinusGetEzsignpagesMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetEzsignsignaturesAutomaticV1"></a>
# **ezsigndocumentGetEzsignsignaturesAutomaticV1**
> EzsigndocumentMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse ezsigndocumentGetEzsignsignaturesAutomaticV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s automatic Ezsignsignatures

Return the Ezsignsignatures that can be signed by the current user at the current step in the process

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse = apiInstance.ezsigndocumentGetEzsignsignaturesAutomaticV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignsignaturesAutomaticV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignsignaturesAutomaticV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse**](EzsigndocumentMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetEzsignsignaturesV1"></a>
# **ezsigndocumentGetEzsignsignaturesV1**
> EzsigndocumentMinusGetEzsignsignaturesMinusV1MinusResponse ezsigndocumentGetEzsignsignaturesV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignsignatures



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusGetEzsignsignaturesMinusV1MinusResponse = apiInstance.ezsigndocumentGetEzsignsignaturesV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignsignaturesV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsignsignaturesV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusGetEzsignsignaturesMinusV1MinusResponse**](EzsigndocumentMinusGetEzsignsignaturesMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetFormDataV1"></a>
# **ezsigndocumentGetFormDataV1**
> EzsigndocumentMinusGetFormDataMinusV1MinusResponse ezsigndocumentGetFormDataV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Form Data



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusGetFormDataMinusV1MinusResponse = apiInstance.ezsigndocumentGetFormDataV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetFormDataV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetFormDataV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusGetFormDataMinusV1MinusResponse**](EzsigndocumentMinusGetFormDataMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetObjectV1"></a>
# **ezsigndocumentGetObjectV1**
> EzsigndocumentMinusGetObjectMinusV1MinusResponse ezsigndocumentGetObjectV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusGetObjectMinusV1MinusResponse = apiInstance.ezsigndocumentGetObjectV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusGetObjectMinusV1MinusResponse**](EzsigndocumentMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetObjectV2"></a>
# **ezsigndocumentGetObjectV2**
> EzsigndocumentMinusGetObjectMinusV2MinusResponse ezsigndocumentGetObjectV2(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusGetObjectMinusV2MinusResponse = apiInstance.ezsigndocumentGetObjectV2(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusGetObjectMinusV2MinusResponse**](EzsigndocumentMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetTemporaryProofV1"></a>
# **ezsigndocumentGetTemporaryProofV1**
> EzsigndocumentMinusGetTemporaryProofMinusV1MinusResponse ezsigndocumentGetTemporaryProofV1(pkiEzsigndocumentID)

Retrieve the temporary proof

Retrieve the temporary proof while the Ezsigndocument is being processed since the proof isn&#39;t available until the Ezsigndocument is completed

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentMinusGetTemporaryProofMinusV1MinusResponse = apiInstance.ezsigndocumentGetTemporaryProofV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetTemporaryProofV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetTemporaryProofV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigndocumentMinusGetTemporaryProofMinusV1MinusResponse**](EzsigndocumentMinusGetTemporaryProofMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetWordsPositionsV1"></a>
# **ezsigndocumentGetWordsPositionsV1**
> EzsigndocumentMinusGetWordsPositionsMinusV1MinusResponse ezsigndocumentGetWordsPositionsV1(pkiEzsigndocumentID, ezsigndocumentMinusGetWordsPositionsMinusV1MinusRequest)

Retrieve positions X,Y of given words from a Ezsigndocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentMinusGetWordsPositionsMinusV1MinusRequest : EzsigndocumentMinusGetWordsPositionsMinusV1MinusRequest =  // EzsigndocumentMinusGetWordsPositionsMinusV1MinusRequest | 
try {
    val result : EzsigndocumentMinusGetWordsPositionsMinusV1MinusResponse = apiInstance.ezsigndocumentGetWordsPositionsV1(pkiEzsigndocumentID, ezsigndocumentMinusGetWordsPositionsMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetWordsPositionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetWordsPositionsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **ezsigndocumentMinusGetWordsPositionsMinusV1MinusRequest** | [**EzsigndocumentMinusGetWordsPositionsMinusV1MinusRequest**](EzsigndocumentMinusGetWordsPositionsMinusV1MinusRequest.md)|  |

### Return type

[**EzsigndocumentMinusGetWordsPositionsMinusV1MinusResponse**](EzsigndocumentMinusGetWordsPositionsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentPatchObjectV1"></a>
# **ezsigndocumentPatchObjectV1**
> EzsigndocumentMinusPatchObjectMinusV1MinusResponse ezsigndocumentPatchObjectV1(pkiEzsigndocumentID, ezsigndocumentMinusPatchObjectMinusV1MinusRequest)

Patch an existing Ezsigndocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentMinusPatchObjectMinusV1MinusRequest : EzsigndocumentMinusPatchObjectMinusV1MinusRequest =  // EzsigndocumentMinusPatchObjectMinusV1MinusRequest | 
try {
    val result : EzsigndocumentMinusPatchObjectMinusV1MinusResponse = apiInstance.ezsigndocumentPatchObjectV1(pkiEzsigndocumentID, ezsigndocumentMinusPatchObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentPatchObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentPatchObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **ezsigndocumentMinusPatchObjectMinusV1MinusRequest** | [**EzsigndocumentMinusPatchObjectMinusV1MinusRequest**](EzsigndocumentMinusPatchObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigndocumentMinusPatchObjectMinusV1MinusResponse**](EzsigndocumentMinusPatchObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentSubmitEzsignformV1"></a>
# **ezsigndocumentSubmitEzsignformV1**
> EzsigndocumentMinusSubmitEzsignformMinusV1MinusResponse ezsigndocumentSubmitEzsignformV1(pkiEzsigndocumentID, ezsigndocumentMinusSubmitEzsignformMinusV1MinusRequest)

Submit the Ezsignform



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentMinusSubmitEzsignformMinusV1MinusRequest : EzsigndocumentMinusSubmitEzsignformMinusV1MinusRequest =  // EzsigndocumentMinusSubmitEzsignformMinusV1MinusRequest | 
try {
    val result : EzsigndocumentMinusSubmitEzsignformMinusV1MinusResponse = apiInstance.ezsigndocumentSubmitEzsignformV1(pkiEzsigndocumentID, ezsigndocumentMinusSubmitEzsignformMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentSubmitEzsignformV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentSubmitEzsignformV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **ezsigndocumentMinusSubmitEzsignformMinusV1MinusRequest** | [**EzsigndocumentMinusSubmitEzsignformMinusV1MinusRequest**](EzsigndocumentMinusSubmitEzsignformMinusV1MinusRequest.md)|  |

### Return type

[**EzsigndocumentMinusSubmitEzsignformMinusV1MinusResponse**](EzsigndocumentMinusSubmitEzsignformMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentUnsendV1"></a>
# **ezsigndocumentUnsendV1**
> EzsigndocumentMinusUnsendMinusV1MinusResponse ezsigndocumentUnsendV1(pkiEzsigndocumentID, body)

Unsend the Ezsigndocument

Once an Ezsigndocument has been sent to signatories, it cannot be modified.  Using this endpoint, you can unsend the Ezsigndocument and make it modifiable again.  Signatories will receive an email informing them the signature process was aborted and they might receive a new invitation to sign.  ⚠️ Warning: Any signature previously made by signatories on this Ezsigndocumentswill be lost.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EzsigndocumentMinusUnsendMinusV1MinusResponse = apiInstance.ezsigndocumentUnsendV1(pkiEzsigndocumentID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentUnsendV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentUnsendV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**|  |
 **body** | **kotlin.Any**|  |

### Return type

[**EzsigndocumentMinusUnsendMinusV1MinusResponse**](EzsigndocumentMinusUnsendMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


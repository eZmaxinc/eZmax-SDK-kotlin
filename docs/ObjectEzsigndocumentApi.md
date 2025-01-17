# ObjectEzsigndocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsigndocumentApplyEzsigntemplateV1**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument. |
| [**ezsigndocumentApplyEzsigntemplateV2**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV2) | **POST** /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument. |
| [**ezsigndocumentApplyEzsigntemplateglobalV1**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateglobalV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplateglobal | Apply an Ezsigntemplateglobal to the Ezsigndocument. |
| [**ezsigndocumentCreateEzsignelementsPositionedByWordV1**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateEzsignelementsPositionedByWordV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/createEzsignelementsPositionedByWord | Create multiple Ezsignsignatures/Ezsignformfieldgroups |
| [**ezsigndocumentCreateObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument |
| [**ezsigndocumentCreateObjectV2**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV2) | **POST** /2/object/ezsigndocument | Create a new Ezsigndocument |
| [**ezsigndocumentCreateObjectV3**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV3) | **POST** /3/object/ezsigndocument | Create a new Ezsigndocument |
| [**ezsigndocumentDeclineToSignV1**](ObjectEzsigndocumentApi.md#ezsigndocumentDeclineToSignV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/declineToSign | Decline to sign |
| [**ezsigndocumentDeleteObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentDeleteObjectV1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument |
| [**ezsigndocumentEditEzsignannotationsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignannotationsV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignannotations | Edit multiple Ezsignannotations |
| [**ezsigndocumentEditEzsignformfieldgroupsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignformfieldgroupsV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignformfieldgroups | Edit multiple Ezsignformfieldgroups |
| [**ezsigndocumentEditEzsignsignaturesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignsignaturesV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures | Edit multiple Ezsignsignatures |
| [**ezsigndocumentEditObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditObjectV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Edit an existing Ezsigndocument |
| [**ezsigndocumentEndPrematurelyV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEndPrematurelyV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/endPrematurely | End prematurely |
| [**ezsigndocumentExtractTextV1**](ObjectEzsigndocumentApi.md#ezsigndocumentExtractTextV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/extractText | Extract text from Ezsigndocument area |
| [**ezsigndocumentFlattenV1**](ObjectEzsigndocumentApi.md#ezsigndocumentFlattenV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/flatten | Flatten |
| [**ezsigndocumentGetActionableElementsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetActionableElementsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getActionableElements | Retrieve actionable elements for the Ezsigndocument |
| [**ezsigndocumentGetAttachmentsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetAttachmentsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getAttachments | Retrieve Ezsigndocument&#39;s Attachments |
| [**ezsigndocumentGetCompletedElementsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetCompletedElementsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getCompletedElements | Retrieve completed elements for the Ezsigndocument |
| [**ezsigndocumentGetDownloadUrlV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetDownloadUrlV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents. |
| [**ezsigndocumentGetEzsignannotationsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignannotationsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignannotations | Retrieve an existing Ezsigndocument&#39;s Ezsignannotations |
| [**ezsigndocumentGetEzsigndiscussionsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsigndiscussionsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsigndiscussions | Retrieve an existing Ezsigndocument&#39;s Ezsigndiscussions |
| [**ezsigndocumentGetEzsignformfieldgroupsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignformfieldgroupsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignformfieldgroups | Retrieve an existing Ezsigndocument&#39;s Ezsignformfieldgroups |
| [**ezsigndocumentGetEzsignpagesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignpagesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignpages | Retrieve an existing Ezsigndocument&#39;s Ezsignpages |
| [**ezsigndocumentGetEzsignsignaturesAutomaticV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignaturesAutomatic | Retrieve an existing Ezsigndocument&#39;s automatic Ezsignsignatures |
| [**ezsigndocumentGetEzsignsignaturesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignsignaturesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignatures | Retrieve an existing Ezsigndocument&#39;s Ezsignsignatures |
| [**ezsigndocumentGetFormDataV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetFormDataV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getFormData | Retrieve an existing Ezsigndocument&#39;s Form Data |
| [**ezsigndocumentGetObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument |
| [**ezsigndocumentGetObjectV2**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV2) | **GET** /2/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument |
| [**ezsigndocumentGetTemporaryProofV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetTemporaryProofV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof | Retrieve the temporary proof |
| [**ezsigndocumentGetWordsPositionsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetWordsPositionsV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigndocument |
| [**ezsigndocumentPatchObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentPatchObjectV1) | **PATCH** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Patch an existing Ezsigndocument |
| [**ezsigndocumentSubmitEzsignformV1**](ObjectEzsigndocumentApi.md#ezsigndocumentSubmitEzsignformV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/submitEzsignform | Submit the Ezsignform |
| [**ezsigndocumentUnsendV1**](ObjectEzsigndocumentApi.md#ezsigndocumentUnsendV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/unsend | Unsend the Ezsigndocument |


<a id="ezsigndocumentApplyEzsigntemplateV1"></a>
# **ezsigndocumentApplyEzsigntemplateV1**
> EzsigndocumentApplyEzsigntemplateV1Response ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV1Request)

Apply an Ezsigntemplate to the Ezsigndocument.

This function is deprecated. Please use *applyEzsigntemplate* instead which is doing the same thing but with a capital \&quot;E\&quot; to normalize the nomenclature.  This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentApplyEzsigntemplateV1Request : EzsigndocumentApplyEzsigntemplateV1Request =  // EzsigndocumentApplyEzsigntemplateV1Request | 
try {
    val result : EzsigndocumentApplyEzsigntemplateV1Response = apiInstance.ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV1Request)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentApplyEzsigntemplateV1Request** | [**EzsigndocumentApplyEzsigntemplateV1Request**](EzsigndocumentApplyEzsigntemplateV1Request.md)|  | |

### Return type

[**EzsigndocumentApplyEzsigntemplateV1Response**](EzsigndocumentApplyEzsigntemplateV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentApplyEzsigntemplateV2"></a>
# **ezsigndocumentApplyEzsigntemplateV2**
> EzsigndocumentApplyEzsigntemplateV2Response ezsigndocumentApplyEzsigntemplateV2(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV2Request)

Apply an Ezsigntemplate to the Ezsigndocument.

This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentApplyEzsigntemplateV2Request : EzsigndocumentApplyEzsigntemplateV2Request =  // EzsigndocumentApplyEzsigntemplateV2Request | 
try {
    val result : EzsigndocumentApplyEzsigntemplateV2Response = apiInstance.ezsigndocumentApplyEzsigntemplateV2(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateV2Request)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentApplyEzsigntemplateV2Request** | [**EzsigndocumentApplyEzsigntemplateV2Request**](EzsigndocumentApplyEzsigntemplateV2Request.md)|  | |

### Return type

[**EzsigndocumentApplyEzsigntemplateV2Response**](EzsigndocumentApplyEzsigntemplateV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentApplyEzsigntemplateglobalV1"></a>
# **ezsigndocumentApplyEzsigntemplateglobalV1**
> EzsigndocumentApplyEzsigntemplateglobalV1Response ezsigndocumentApplyEzsigntemplateglobalV1(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateglobalV1Request)

Apply an Ezsigntemplateglobal to the Ezsigndocument.

This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentApplyEzsigntemplateglobalV1Request : EzsigndocumentApplyEzsigntemplateglobalV1Request =  // EzsigndocumentApplyEzsigntemplateglobalV1Request | 
try {
    val result : EzsigndocumentApplyEzsigntemplateglobalV1Response = apiInstance.ezsigndocumentApplyEzsigntemplateglobalV1(pkiEzsigndocumentID, ezsigndocumentApplyEzsigntemplateglobalV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentApplyEzsigntemplateglobalV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentApplyEzsigntemplateglobalV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentApplyEzsigntemplateglobalV1Request** | [**EzsigndocumentApplyEzsigntemplateglobalV1Request**](EzsigndocumentApplyEzsigntemplateglobalV1Request.md)|  | |

### Return type

[**EzsigndocumentApplyEzsigntemplateglobalV1Response**](EzsigndocumentApplyEzsigntemplateglobalV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentCreateEzsignelementsPositionedByWordV1"></a>
# **ezsigndocumentCreateEzsignelementsPositionedByWordV1**
> EzsigndocumentCreateEzsignelementsPositionedByWordV1Response ezsigndocumentCreateEzsignelementsPositionedByWordV1(pkiEzsigndocumentID, ezsigndocumentCreateEzsignelementsPositionedByWordV1Request)

Create multiple Ezsignsignatures/Ezsignformfieldgroups

Using this endpoint, you can create multiple Ezsignsignatures/Ezsignformfieldgroups positioned by word at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentCreateEzsignelementsPositionedByWordV1Request : EzsigndocumentCreateEzsignelementsPositionedByWordV1Request =  // EzsigndocumentCreateEzsignelementsPositionedByWordV1Request | 
try {
    val result : EzsigndocumentCreateEzsignelementsPositionedByWordV1Response = apiInstance.ezsigndocumentCreateEzsignelementsPositionedByWordV1(pkiEzsigndocumentID, ezsigndocumentCreateEzsignelementsPositionedByWordV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentCreateEzsignelementsPositionedByWordV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentCreateEzsignelementsPositionedByWordV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentCreateEzsignelementsPositionedByWordV1Request** | [**EzsigndocumentCreateEzsignelementsPositionedByWordV1Request**](EzsigndocumentCreateEzsignelementsPositionedByWordV1Request.md)|  | |

### Return type

[**EzsigndocumentCreateEzsignelementsPositionedByWordV1Response**](EzsigndocumentCreateEzsignelementsPositionedByWordV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentCreateObjectV1"></a>
# **ezsigndocumentCreateObjectV1**
> EzsigndocumentCreateObjectV1Response ezsigndocumentCreateObjectV1(ezsigndocumentCreateObjectV1Request)

Create a new Ezsigndocument

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val ezsigndocumentCreateObjectV1Request : kotlin.collections.List<EzsigndocumentCreateObjectV1Request> =  // kotlin.collections.List<EzsigndocumentCreateObjectV1Request> | 
try {
    val result : EzsigndocumentCreateObjectV1Response = apiInstance.ezsigndocumentCreateObjectV1(ezsigndocumentCreateObjectV1Request)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentCreateObjectV1Request** | [**kotlin.collections.List&lt;EzsigndocumentCreateObjectV1Request&gt;**](EzsigndocumentCreateObjectV1Request.md)|  | |

### Return type

[**EzsigndocumentCreateObjectV1Response**](EzsigndocumentCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentCreateObjectV2"></a>
# **ezsigndocumentCreateObjectV2**
> EzsigndocumentCreateObjectV2Response ezsigndocumentCreateObjectV2(ezsigndocumentCreateObjectV2Request)

Create a new Ezsigndocument

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val ezsigndocumentCreateObjectV2Request : EzsigndocumentCreateObjectV2Request =  // EzsigndocumentCreateObjectV2Request | 
try {
    val result : EzsigndocumentCreateObjectV2Response = apiInstance.ezsigndocumentCreateObjectV2(ezsigndocumentCreateObjectV2Request)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentCreateObjectV2Request** | [**EzsigndocumentCreateObjectV2Request**](EzsigndocumentCreateObjectV2Request.md)|  | |

### Return type

[**EzsigndocumentCreateObjectV2Response**](EzsigndocumentCreateObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentCreateObjectV3"></a>
# **ezsigndocumentCreateObjectV3**
> EzsigndocumentCreateObjectV3Response ezsigndocumentCreateObjectV3(ezsigndocumentCreateObjectV3Request)

Create a new Ezsigndocument

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val ezsigndocumentCreateObjectV3Request : EzsigndocumentCreateObjectV3Request =  // EzsigndocumentCreateObjectV3Request | 
try {
    val result : EzsigndocumentCreateObjectV3Response = apiInstance.ezsigndocumentCreateObjectV3(ezsigndocumentCreateObjectV3Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentCreateObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentCreateObjectV3")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentCreateObjectV3Request** | [**EzsigndocumentCreateObjectV3Request**](EzsigndocumentCreateObjectV3Request.md)|  | |

### Return type

[**EzsigndocumentCreateObjectV3Response**](EzsigndocumentCreateObjectV3Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentDeclineToSignV1"></a>
# **ezsigndocumentDeclineToSignV1**
> EzsigndocumentDeclineToSignV1Response ezsigndocumentDeclineToSignV1(pkiEzsigndocumentID, ezsigndocumentDeclineToSignV1Request)

Decline to sign

Decline to sign

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentDeclineToSignV1Request : EzsigndocumentDeclineToSignV1Request =  // EzsigndocumentDeclineToSignV1Request | 
try {
    val result : EzsigndocumentDeclineToSignV1Response = apiInstance.ezsigndocumentDeclineToSignV1(pkiEzsigndocumentID, ezsigndocumentDeclineToSignV1Request)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentDeclineToSignV1Request** | [**EzsigndocumentDeclineToSignV1Request**](EzsigndocumentDeclineToSignV1Request.md)|  | |

### Return type

[**EzsigndocumentDeclineToSignV1Response**](EzsigndocumentDeclineToSignV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentDeleteObjectV1"></a>
# **ezsigndocumentDeleteObjectV1**
> EzsigndocumentDeleteObjectV1Response ezsigndocumentDeleteObjectV1(pkiEzsigndocumentID)

Delete an existing Ezsigndocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentDeleteObjectV1Response = apiInstance.ezsigndocumentDeleteObjectV1(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentDeleteObjectV1Response**](EzsigndocumentDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentEditEzsignannotationsV1"></a>
# **ezsigndocumentEditEzsignannotationsV1**
> EzsigndocumentEditEzsignannotationsV1Response ezsigndocumentEditEzsignannotationsV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignannotationsV1Request)

Edit multiple Ezsignannotations

Using this endpoint, you can edit multiple Ezsignannotations at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentEditEzsignannotationsV1Request : EzsigndocumentEditEzsignannotationsV1Request =  // EzsigndocumentEditEzsignannotationsV1Request | 
try {
    val result : EzsigndocumentEditEzsignannotationsV1Response = apiInstance.ezsigndocumentEditEzsignannotationsV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignannotationsV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentEditEzsignannotationsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentEditEzsignannotationsV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentEditEzsignannotationsV1Request** | [**EzsigndocumentEditEzsignannotationsV1Request**](EzsigndocumentEditEzsignannotationsV1Request.md)|  | |

### Return type

[**EzsigndocumentEditEzsignannotationsV1Response**](EzsigndocumentEditEzsignannotationsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentEditEzsignformfieldgroupsV1"></a>
# **ezsigndocumentEditEzsignformfieldgroupsV1**
> EzsigndocumentEditEzsignformfieldgroupsV1Response ezsigndocumentEditEzsignformfieldgroupsV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignformfieldgroupsV1Request)

Edit multiple Ezsignformfieldgroups

Using this endpoint, you can edit multiple Ezsignformfieldgroups at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentEditEzsignformfieldgroupsV1Request : EzsigndocumentEditEzsignformfieldgroupsV1Request =  // EzsigndocumentEditEzsignformfieldgroupsV1Request | 
try {
    val result : EzsigndocumentEditEzsignformfieldgroupsV1Response = apiInstance.ezsigndocumentEditEzsignformfieldgroupsV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignformfieldgroupsV1Request)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentEditEzsignformfieldgroupsV1Request** | [**EzsigndocumentEditEzsignformfieldgroupsV1Request**](EzsigndocumentEditEzsignformfieldgroupsV1Request.md)|  | |

### Return type

[**EzsigndocumentEditEzsignformfieldgroupsV1Response**](EzsigndocumentEditEzsignformfieldgroupsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentEditEzsignsignaturesV1"></a>
# **ezsigndocumentEditEzsignsignaturesV1**
> EzsigndocumentEditEzsignsignaturesV1Response ezsigndocumentEditEzsignsignaturesV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignsignaturesV1Request)

Edit multiple Ezsignsignatures

Using this endpoint, you can edit multiple Ezsignsignatures at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentEditEzsignsignaturesV1Request : EzsigndocumentEditEzsignsignaturesV1Request =  // EzsigndocumentEditEzsignsignaturesV1Request | 
try {
    val result : EzsigndocumentEditEzsignsignaturesV1Response = apiInstance.ezsigndocumentEditEzsignsignaturesV1(pkiEzsigndocumentID, ezsigndocumentEditEzsignsignaturesV1Request)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentEditEzsignsignaturesV1Request** | [**EzsigndocumentEditEzsignsignaturesV1Request**](EzsigndocumentEditEzsignsignaturesV1Request.md)|  | |

### Return type

[**EzsigndocumentEditEzsignsignaturesV1Response**](EzsigndocumentEditEzsignsignaturesV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentEditObjectV1"></a>
# **ezsigndocumentEditObjectV1**
> EzsigndocumentEditObjectV1Response ezsigndocumentEditObjectV1(pkiEzsigndocumentID, ezsigndocumentEditObjectV1Request)

Edit an existing Ezsigndocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentEditObjectV1Request : EzsigndocumentEditObjectV1Request =  // EzsigndocumentEditObjectV1Request | 
try {
    val result : EzsigndocumentEditObjectV1Response = apiInstance.ezsigndocumentEditObjectV1(pkiEzsigndocumentID, ezsigndocumentEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentEditObjectV1Request** | [**EzsigndocumentEditObjectV1Request**](EzsigndocumentEditObjectV1Request.md)|  | |

### Return type

[**EzsigndocumentEditObjectV1Response**](EzsigndocumentEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentEndPrematurelyV1"></a>
# **ezsigndocumentEndPrematurelyV1**
> EzsigndocumentEndPrematurelyV1Response ezsigndocumentEndPrematurelyV1(pkiEzsigndocumentID, body)

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
    val result : EzsigndocumentEndPrematurelyV1Response = apiInstance.ezsigndocumentEndPrematurelyV1(pkiEzsigndocumentID, body)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | |

### Return type

[**EzsigndocumentEndPrematurelyV1Response**](EzsigndocumentEndPrematurelyV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentExtractTextV1"></a>
# **ezsigndocumentExtractTextV1**
> EzsigndocumentExtractTextV1Response ezsigndocumentExtractTextV1(pkiEzsigndocumentID, ezsigndocumentExtractTextV1Request)

Extract text from Ezsigndocument area

Extract text from Ezsigndocument area

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentExtractTextV1Request : EzsigndocumentExtractTextV1Request =  // EzsigndocumentExtractTextV1Request | 
try {
    val result : EzsigndocumentExtractTextV1Response = apiInstance.ezsigndocumentExtractTextV1(pkiEzsigndocumentID, ezsigndocumentExtractTextV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentExtractTextV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentExtractTextV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentExtractTextV1Request** | [**EzsigndocumentExtractTextV1Request**](EzsigndocumentExtractTextV1Request.md)|  | |

### Return type

[**EzsigndocumentExtractTextV1Response**](EzsigndocumentExtractTextV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentFlattenV1"></a>
# **ezsigndocumentFlattenV1**
> EzsigndocumentFlattenV1Response ezsigndocumentFlattenV1(pkiEzsigndocumentID, body)

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
    val result : EzsigndocumentFlattenV1Response = apiInstance.ezsigndocumentFlattenV1(pkiEzsigndocumentID, body)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | |

### Return type

[**EzsigndocumentFlattenV1Response**](EzsigndocumentFlattenV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentGetActionableElementsV1"></a>
# **ezsigndocumentGetActionableElementsV1**
> EzsigndocumentGetActionableElementsV1Response ezsigndocumentGetActionableElementsV1(pkiEzsigndocumentID)

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
    val result : EzsigndocumentGetActionableElementsV1Response = apiInstance.ezsigndocumentGetActionableElementsV1(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetActionableElementsV1Response**](EzsigndocumentGetActionableElementsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetAttachmentsV1"></a>
# **ezsigndocumentGetAttachmentsV1**
> EzsigndocumentGetAttachmentsV1Response ezsigndocumentGetAttachmentsV1(pkiEzsigndocumentID)

Retrieve Ezsigndocument&#39;s Attachments



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentGetAttachmentsV1Response = apiInstance.ezsigndocumentGetAttachmentsV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetAttachmentsV1Response**](EzsigndocumentGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetCompletedElementsV1"></a>
# **ezsigndocumentGetCompletedElementsV1**
> EzsigndocumentGetCompletedElementsV1Response ezsigndocumentGetCompletedElementsV1(pkiEzsigndocumentID)

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
    val result : EzsigndocumentGetCompletedElementsV1Response = apiInstance.ezsigndocumentGetCompletedElementsV1(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetCompletedElementsV1Response**](EzsigndocumentGetCompletedElementsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetDownloadUrlV1"></a>
# **ezsigndocumentGetDownloadUrlV1**
> EzsigndocumentGetDownloadUrlV1Response ezsigndocumentGetDownloadUrlV1(pkiEzsigndocumentID, eDocumentType)

Retrieve a URL to download documents.

This endpoint returns URLs to different files that can be downloaded during the signing process.  These links will expire after 5 minutes so the download of the file should be made soon after retrieving the link.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val eDocumentType : kotlin.String = eDocumentType_example // kotlin.String | The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **SignatureReady** Is the version containing the annotations/form to show the signer. 3. **Signed** Is the final document once all signatures were applied in current document if eEzsignfolderCompletion is PerEzsigndocument.<br>     Is the final document once all signatures were applied in all documents if eEzsignfolderCompletion is PerEzsignfolder. 4. **Proofdocument** Is the evidence report. 5. **Proof** Is the complete evidence archive including all of the above and more. 
try {
    val result : EzsigndocumentGetDownloadUrlV1Response = apiInstance.ezsigndocumentGetDownloadUrlV1(pkiEzsigndocumentID, eDocumentType)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eDocumentType** | **kotlin.String**| The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **SignatureReady** Is the version containing the annotations/form to show the signer. 3. **Signed** Is the final document once all signatures were applied in current document if eEzsignfolderCompletion is PerEzsigndocument.&lt;br&gt;     Is the final document once all signatures were applied in all documents if eEzsignfolderCompletion is PerEzsignfolder. 4. **Proofdocument** Is the evidence report. 5. **Proof** Is the complete evidence archive including all of the above and more.  | [enum: Initial, SignatureReady, Signed, Proof, Proofdocument] |

### Return type

[**EzsigndocumentGetDownloadUrlV1Response**](EzsigndocumentGetDownloadUrlV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetEzsignannotationsV1"></a>
# **ezsigndocumentGetEzsignannotationsV1**
> EzsigndocumentGetEzsignannotationsV1Response ezsigndocumentGetEzsignannotationsV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignannotations



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentGetEzsignannotationsV1Response = apiInstance.ezsigndocumentGetEzsignannotationsV1(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetEzsignannotationsV1Response**](EzsigndocumentGetEzsignannotationsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetEzsigndiscussionsV1"></a>
# **ezsigndocumentGetEzsigndiscussionsV1**
> EzsigndocumentGetEzsigndiscussionsV1Response ezsigndocumentGetEzsigndiscussionsV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsigndiscussions



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentGetEzsigndiscussionsV1Response = apiInstance.ezsigndocumentGetEzsigndiscussionsV1(pkiEzsigndocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsigndiscussionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetEzsigndiscussionsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetEzsigndiscussionsV1Response**](EzsigndocumentGetEzsigndiscussionsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetEzsignformfieldgroupsV1"></a>
# **ezsigndocumentGetEzsignformfieldgroupsV1**
> EzsigndocumentGetEzsignformfieldgroupsV1Response ezsigndocumentGetEzsignformfieldgroupsV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignformfieldgroups



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentGetEzsignformfieldgroupsV1Response = apiInstance.ezsigndocumentGetEzsignformfieldgroupsV1(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetEzsignformfieldgroupsV1Response**](EzsigndocumentGetEzsignformfieldgroupsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetEzsignpagesV1"></a>
# **ezsigndocumentGetEzsignpagesV1**
> EzsigndocumentGetEzsignpagesV1Response ezsigndocumentGetEzsignpagesV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignpages



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentGetEzsignpagesV1Response = apiInstance.ezsigndocumentGetEzsignpagesV1(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetEzsignpagesV1Response**](EzsigndocumentGetEzsignpagesV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetEzsignsignaturesAutomaticV1"></a>
# **ezsigndocumentGetEzsignsignaturesAutomaticV1**
> EzsigndocumentGetEzsignsignaturesAutomaticV1Response ezsigndocumentGetEzsignsignaturesAutomaticV1(pkiEzsigndocumentID)

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
    val result : EzsigndocumentGetEzsignsignaturesAutomaticV1Response = apiInstance.ezsigndocumentGetEzsignsignaturesAutomaticV1(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetEzsignsignaturesAutomaticV1Response**](EzsigndocumentGetEzsignsignaturesAutomaticV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetEzsignsignaturesV1"></a>
# **ezsigndocumentGetEzsignsignaturesV1**
> EzsigndocumentGetEzsignsignaturesV1Response ezsigndocumentGetEzsignsignaturesV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Ezsignsignatures



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentGetEzsignsignaturesV1Response = apiInstance.ezsigndocumentGetEzsignsignaturesV1(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetEzsignsignaturesV1Response**](EzsigndocumentGetEzsignsignaturesV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetFormDataV1"></a>
# **ezsigndocumentGetFormDataV1**
> EzsigndocumentGetFormDataV1Response ezsigndocumentGetFormDataV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s Form Data



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentGetFormDataV1Response = apiInstance.ezsigndocumentGetFormDataV1(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetFormDataV1Response**](EzsigndocumentGetFormDataV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetObjectV1"></a>
# **ezsigndocumentGetObjectV1**
> EzsigndocumentGetObjectV1Response ezsigndocumentGetObjectV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentGetObjectV1Response = apiInstance.ezsigndocumentGetObjectV1(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetObjectV1Response**](EzsigndocumentGetObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetObjectV2"></a>
# **ezsigndocumentGetObjectV2**
> EzsigndocumentGetObjectV2Response ezsigndocumentGetObjectV2(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigndocumentGetObjectV2Response = apiInstance.ezsigndocumentGetObjectV2(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetObjectV2Response**](EzsigndocumentGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetTemporaryProofV1"></a>
# **ezsigndocumentGetTemporaryProofV1**
> EzsigndocumentGetTemporaryProofV1Response ezsigndocumentGetTemporaryProofV1(pkiEzsigndocumentID)

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
    val result : EzsigndocumentGetTemporaryProofV1Response = apiInstance.ezsigndocumentGetTemporaryProofV1(pkiEzsigndocumentID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |

### Return type

[**EzsigndocumentGetTemporaryProofV1Response**](EzsigndocumentGetTemporaryProofV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndocumentGetWordsPositionsV1"></a>
# **ezsigndocumentGetWordsPositionsV1**
> EzsigndocumentGetWordsPositionsV1Response ezsigndocumentGetWordsPositionsV1(pkiEzsigndocumentID, ezsigndocumentGetWordsPositionsV1Request)

Retrieve positions X,Y of given words from a Ezsigndocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentGetWordsPositionsV1Request : EzsigndocumentGetWordsPositionsV1Request =  // EzsigndocumentGetWordsPositionsV1Request | 
try {
    val result : EzsigndocumentGetWordsPositionsV1Response = apiInstance.ezsigndocumentGetWordsPositionsV1(pkiEzsigndocumentID, ezsigndocumentGetWordsPositionsV1Request)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentGetWordsPositionsV1Request** | [**EzsigndocumentGetWordsPositionsV1Request**](EzsigndocumentGetWordsPositionsV1Request.md)|  | |

### Return type

[**EzsigndocumentGetWordsPositionsV1Response**](EzsigndocumentGetWordsPositionsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentPatchObjectV1"></a>
# **ezsigndocumentPatchObjectV1**
> EzsigndocumentPatchObjectV1Response ezsigndocumentPatchObjectV1(pkiEzsigndocumentID, ezsigndocumentPatchObjectV1Request)

Patch an existing Ezsigndocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentPatchObjectV1Request : EzsigndocumentPatchObjectV1Request =  // EzsigndocumentPatchObjectV1Request | 
try {
    val result : EzsigndocumentPatchObjectV1Response = apiInstance.ezsigndocumentPatchObjectV1(pkiEzsigndocumentID, ezsigndocumentPatchObjectV1Request)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentPatchObjectV1Request** | [**EzsigndocumentPatchObjectV1Request**](EzsigndocumentPatchObjectV1Request.md)|  | |

### Return type

[**EzsigndocumentPatchObjectV1Response**](EzsigndocumentPatchObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentSubmitEzsignformV1"></a>
# **ezsigndocumentSubmitEzsignformV1**
> EzsigndocumentSubmitEzsignformV1Response ezsigndocumentSubmitEzsignformV1(pkiEzsigndocumentID, ezsigndocumentSubmitEzsignformV1Request)

Submit the Ezsignform



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigndocumentSubmitEzsignformV1Request : EzsigndocumentSubmitEzsignformV1Request =  // EzsigndocumentSubmitEzsignformV1Request | 
try {
    val result : EzsigndocumentSubmitEzsignformV1Response = apiInstance.ezsigndocumentSubmitEzsignformV1(pkiEzsigndocumentID, ezsigndocumentSubmitEzsignformV1Request)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigndocumentSubmitEzsignformV1Request** | [**EzsigndocumentSubmitEzsignformV1Request**](EzsigndocumentSubmitEzsignformV1Request.md)|  | |

### Return type

[**EzsigndocumentSubmitEzsignformV1Response**](EzsigndocumentSubmitEzsignformV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndocumentUnsendV1"></a>
# **ezsigndocumentUnsendV1**
> EzsigndocumentUnsendV1Response ezsigndocumentUnsendV1(pkiEzsigndocumentID, body)

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
    val result : EzsigndocumentUnsendV1Response = apiInstance.ezsigndocumentUnsendV1(pkiEzsigndocumentID, body)
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
| **pkiEzsigndocumentID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | |

### Return type

[**EzsigndocumentUnsendV1Response**](EzsigndocumentUnsendV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


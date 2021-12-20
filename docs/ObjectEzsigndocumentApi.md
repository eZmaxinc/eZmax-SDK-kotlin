# ObjectEzsigndocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigndocumentApplyEzsigntemplateV1**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
[**ezsigndocumentApplyEzsigntemplateV2**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV2) | **POST** /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
[**ezsigndocumentCreateObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
[**ezsigndocumentDeleteObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentDeleteObjectV1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
[**ezsigndocumentGetDownloadUrlV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetDownloadUrlV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
[**ezsigndocumentGetEzsignpagesV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignpagesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignpages | Retrieve an existing Ezsigndocument&#39;s Ezsignpages
[**ezsigndocumentGetFormDataV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetFormDataV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getFormData | Retrieve an existing Ezsigndocument&#39;s Form Data
[**ezsigndocumentGetObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
[**ezsigndocumentGetWordsPositionsV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetWordsPositionsV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigndocument


<a name="ezsigndocumentApplyEzsigntemplateV1"></a>
# **ezsigndocumentApplyEzsigntemplateV1**
> EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest)

Apply an Ezsign Template to the Ezsigndocument.

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

<a name="ezsigndocumentApplyEzsigntemplateV2"></a>
# **ezsigndocumentApplyEzsigntemplateV2**
> EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusResponse ezsigndocumentApplyEzsigntemplateV2(pkiEzsigndocumentID, ezsigndocumentMinusApplyEzsigntemplateMinusV2MinusRequest)

Apply an Ezsign Template to the Ezsigndocument.

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

<a name="ezsigndocumentCreateObjectV1"></a>
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

<a name="ezsigndocumentDeleteObjectV1"></a>
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

<a name="ezsigndocumentGetDownloadUrlV1"></a>
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

<a name="ezsigndocumentGetEzsignpagesV1"></a>
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

<a name="ezsigndocumentGetFormDataV1"></a>
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

<a name="ezsigndocumentGetObjectV1"></a>
# **ezsigndocumentGetObjectV1**
> EzsigndocumentMinusGetObjectMinusV1MinusResponse ezsigndocumentGetObjectV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument

## ⚠️EARLY ADOPTERS WARNING  ### This endpoint is not officially released. Its definition might still change and it might not be available in every environment and region.

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

<a name="ezsigndocumentGetWordsPositionsV1"></a>
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


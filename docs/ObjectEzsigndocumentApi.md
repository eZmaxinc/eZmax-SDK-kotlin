# ObjectEzsigndocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigndocumentApplyEzsigntemplateV1**](ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
[**ezsigndocumentCreateObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
[**ezsigndocumentDeleteObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentDeleteObjectV1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
[**ezsigndocumentEditObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentEditObjectV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Modify an existing Ezsigndocument
[**ezsigndocumentGetDownloadUrlV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetDownloadUrlV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
[**ezsigndocumentGetObjectGetChildrenV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectGetChildrenV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getChildren | Retrieve an existing Ezsigndocument&#39;s children IDs
[**ezsigndocumentGetObjectV1**](ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument


<a name="ezsigndocumentApplyEzsigntemplateV1"></a>
# **ezsigndocumentApplyEzsigntemplateV1**
> EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID, ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest)

Apply an Ezsign Template to the Ezsigndocument.

This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigndocument
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
 **pkiEzsigndocumentID** | **kotlin.Int**| The unique ID of the Ezsigndocument |
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

<a name="ezsigndocumentCreateObjectV1"></a>
# **ezsigndocumentCreateObjectV1**
> EzsigndocumentMinusCreateObjectMinusV1MinusResponse ezsigndocumentCreateObjectV1(ezsigndocumentMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsigndocument

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

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
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigndocument
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
 **pkiEzsigndocumentID** | **kotlin.Int**| The unique ID of the Ezsigndocument |

### Return type

[**EzsigndocumentMinusDeleteObjectMinusV1MinusResponse**](EzsigndocumentMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigndocumentEditObjectV1"></a>
# **ezsigndocumentEditObjectV1**
> EzsigndocumentMinusEditObjectMinusV1MinusResponse ezsigndocumentEditObjectV1(pkiEzsigndocumentID, ezsigndocumentMinusEditObjectMinusV1MinusRequest)

Modify an existing Ezsigndocument

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigndocument
val ezsigndocumentMinusEditObjectMinusV1MinusRequest : EzsigndocumentMinusEditObjectMinusV1MinusRequest =  // EzsigndocumentMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsigndocumentMinusEditObjectMinusV1MinusResponse = apiInstance.ezsigndocumentEditObjectV1(pkiEzsigndocumentID, ezsigndocumentMinusEditObjectMinusV1MinusRequest)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**| The unique ID of the Ezsigndocument |
 **ezsigndocumentMinusEditObjectMinusV1MinusRequest** | [**EzsigndocumentMinusEditObjectMinusV1MinusRequest**](EzsigndocumentMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigndocumentMinusEditObjectMinusV1MinusResponse**](EzsigndocumentMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigndocumentGetDownloadUrlV1"></a>
# **ezsigndocumentGetDownloadUrlV1**
> EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse ezsigndocumentGetDownloadUrlV1(pkiEzsigndocumentID, eDocumentType)

Retrieve a URL to download documents.

This endpoint returns URLs to different files that can be downloaded during the signing process.  These links will expire after 5 minutes so the download of the file should be made soon after retrieving the link.

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigndocument
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
 **pkiEzsigndocumentID** | **kotlin.Int**| The unique ID of the Ezsigndocument |
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

<a name="ezsigndocumentGetObjectGetChildrenV1"></a>
# **ezsigndocumentGetObjectGetChildrenV1**
> ezsigndocumentGetObjectGetChildrenV1(pkiEzsigndocumentID)

Retrieve an existing Ezsigndocument&#39;s children IDs

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigndocument
try {
    apiInstance.ezsigndocumentGetObjectGetChildrenV1(pkiEzsigndocumentID)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetObjectGetChildrenV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndocumentApi#ezsigndocumentGetObjectGetChildrenV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndocumentID** | **kotlin.Int**| The unique ID of the Ezsigndocument |

### Return type

null (empty response body)

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

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsigndocumentApi()
val pkiEzsigndocumentID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigndocument
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
 **pkiEzsigndocumentID** | **kotlin.Int**| The unique ID of the Ezsigndocument |

### Return type

[**EzsigndocumentMinusGetObjectMinusV1MinusResponse**](EzsigndocumentMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


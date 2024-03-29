# ObjectEzsignfolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfolderArchiveV1**](ObjectEzsignfolderApi.md#ezsignfolderArchiveV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/archive | Archive the Ezsignfolder
[**ezsignfolderBatchDownloadV1**](ObjectEzsignfolderApi.md#ezsignfolderBatchDownloadV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/batchDownload | Download multiples files from an Ezsignfolder
[**ezsignfolderCreateObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
[**ezsignfolderCreateObjectV2**](ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV2) | **POST** /2/object/ezsignfolder | Create a new Ezsignfolder
[**ezsignfolderDeleteObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderDeleteObjectV1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
[**ezsignfolderDisposeEzsignfoldersV1**](ObjectEzsignfolderApi.md#ezsignfolderDisposeEzsignfoldersV1) | **POST** /1/object/ezsignfolder/disposeEzsignfolders | Dispose Ezsignfolders
[**ezsignfolderDisposeV1**](ObjectEzsignfolderApi.md#ezsignfolderDisposeV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/dispose | Dispose the Ezsignfolder
[**ezsignfolderEditObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderEditObjectV1) | **PUT** /1/object/ezsignfolder/{pkiEzsignfolderID} | Edit an existing Ezsignfolder
[**ezsignfolderGetActionableElementsV1**](ObjectEzsignfolderApi.md#ezsignfolderGetActionableElementsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getActionableElements | Retrieve actionable elements for the Ezsignfolder
[**ezsignfolderGetCommunicationCountV1**](ObjectEzsignfolderApi.md#ezsignfolderGetCommunicationCountV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getCommunicationCount | Retrieve Communication count
[**ezsignfolderGetCommunicationListV1**](ObjectEzsignfolderApi.md#ezsignfolderGetCommunicationListV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getCommunicationList | Retrieve Communication list
[**ezsignfolderGetEzsigndocumentsV1**](ObjectEzsignfolderApi.md#ezsignfolderGetEzsigndocumentsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsigndocuments | Retrieve an existing Ezsignfolder&#39;s Ezsigndocuments
[**ezsignfolderGetEzsignfoldersignerassociationsV1**](ObjectEzsignfolderApi.md#ezsignfolderGetEzsignfoldersignerassociationsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsignfoldersignerassociations | Retrieve an existing Ezsignfolder&#39;s Ezsignfoldersignerassociations
[**ezsignfolderGetEzsignsignaturesAutomaticV1**](ObjectEzsignfolderApi.md#ezsignfolderGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsignsignaturesAutomatic | Retrieve an existing Ezsignfolder&#39;s automatic Ezsignsignatures
[**ezsignfolderGetFormsDataV1**](ObjectEzsignfolderApi.md#ezsignfolderGetFormsDataV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getFormsData | Retrieve an existing Ezsignfolder&#39;s forms data
[**ezsignfolderGetListV1**](ObjectEzsignfolderApi.md#ezsignfolderGetListV1) | **GET** /1/object/ezsignfolder/getList | Retrieve Ezsignfolder list
[**ezsignfolderGetObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderGetObjectV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
[**ezsignfolderGetObjectV2**](ObjectEzsignfolderApi.md#ezsignfolderGetObjectV2) | **GET** /2/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
[**ezsignfolderImportEzsignfoldersignerassociationsV1**](ObjectEzsignfolderApi.md#ezsignfolderImportEzsignfoldersignerassociationsV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsignfoldersignerassociations | Import an existing Ezsignfoldersignerassociation into this Ezsignfolder
[**ezsignfolderImportEzsigntemplatepackageV1**](ObjectEzsignfolderApi.md#ezsignfolderImportEzsigntemplatepackageV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage | Import an Ezsigntemplatepackage in the Ezsignfolder.
[**ezsignfolderReorderV1**](ObjectEzsignfolderApi.md#ezsignfolderReorderV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/reorder | Reorder Ezsigndocuments in the Ezsignfolder
[**ezsignfolderSendV1**](ObjectEzsignfolderApi.md#ezsignfolderSendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
[**ezsignfolderSendV2**](ObjectEzsignfolderApi.md#ezsignfolderSendV2) | **POST** /2/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
[**ezsignfolderSendV3**](ObjectEzsignfolderApi.md#ezsignfolderSendV3) | **POST** /3/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
[**ezsignfolderUnsendV1**](ObjectEzsignfolderApi.md#ezsignfolderUnsendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/unsend | Unsend the Ezsignfolder


<a id="ezsignfolderArchiveV1"></a>
# **ezsignfolderArchiveV1**
> EzsignfolderMinusArchiveMinusV1MinusResponse ezsignfolderArchiveV1(pkiEzsignfolderID, body)

Archive the Ezsignfolder



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EzsignfolderMinusArchiveMinusV1MinusResponse = apiInstance.ezsignfolderArchiveV1(pkiEzsignfolderID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderArchiveV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderArchiveV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |
 **body** | **kotlin.Any**|  |

### Return type

[**EzsignfolderMinusArchiveMinusV1MinusResponse**](EzsignfolderMinusArchiveMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfolderBatchDownloadV1"></a>
# **ezsignfolderBatchDownloadV1**
> java.io.File ezsignfolderBatchDownloadV1(pkiEzsignfolderID, ezsignfolderMinusBatchDownloadMinusV1MinusRequest)

Download multiples files from an Ezsignfolder

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfolderMinusBatchDownloadMinusV1MinusRequest : EzsignfolderMinusBatchDownloadMinusV1MinusRequest =  // EzsignfolderMinusBatchDownloadMinusV1MinusRequest | 
try {
    val result : java.io.File = apiInstance.ezsignfolderBatchDownloadV1(pkiEzsignfolderID, ezsignfolderMinusBatchDownloadMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderBatchDownloadV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderBatchDownloadV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |
 **ezsignfolderMinusBatchDownloadMinusV1MinusRequest** | [**EzsignfolderMinusBatchDownloadMinusV1MinusRequest**](EzsignfolderMinusBatchDownloadMinusV1MinusRequest.md)|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfolderCreateObjectV1"></a>
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

<a id="ezsignfolderCreateObjectV2"></a>
# **ezsignfolderCreateObjectV2**
> EzsignfolderMinusCreateObjectMinusV2MinusResponse ezsignfolderCreateObjectV2(ezsignfolderMinusCreateObjectMinusV2MinusRequest)

Create a new Ezsignfolder

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val ezsignfolderMinusCreateObjectMinusV2MinusRequest : EzsignfolderMinusCreateObjectMinusV2MinusRequest =  // EzsignfolderMinusCreateObjectMinusV2MinusRequest | 
try {
    val result : EzsignfolderMinusCreateObjectMinusV2MinusResponse = apiInstance.ezsignfolderCreateObjectV2(ezsignfolderMinusCreateObjectMinusV2MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderCreateObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderCreateObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfolderMinusCreateObjectMinusV2MinusRequest** | [**EzsignfolderMinusCreateObjectMinusV2MinusRequest**](EzsignfolderMinusCreateObjectMinusV2MinusRequest.md)|  |

### Return type

[**EzsignfolderMinusCreateObjectMinusV2MinusResponse**](EzsignfolderMinusCreateObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfolderDeleteObjectV1"></a>
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

<a id="ezsignfolderDisposeEzsignfoldersV1"></a>
# **ezsignfolderDisposeEzsignfoldersV1**
> EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusResponse ezsignfolderDisposeEzsignfoldersV1(ezsignfolderMinusDisposeEzsignfoldersMinusV1MinusRequest)

Dispose Ezsignfolders



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val ezsignfolderMinusDisposeEzsignfoldersMinusV1MinusRequest : EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusRequest =  // EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusRequest | 
try {
    val result : EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusResponse = apiInstance.ezsignfolderDisposeEzsignfoldersV1(ezsignfolderMinusDisposeEzsignfoldersMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderDisposeEzsignfoldersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderDisposeEzsignfoldersV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfolderMinusDisposeEzsignfoldersMinusV1MinusRequest** | [**EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusRequest**](EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusRequest.md)|  |

### Return type

[**EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusResponse**](EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfolderDisposeV1"></a>
# **ezsignfolderDisposeV1**
> EzsignfolderMinusDisposeMinusV1MinusResponse ezsignfolderDisposeV1(pkiEzsignfolderID, body)

Dispose the Ezsignfolder



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EzsignfolderMinusDisposeMinusV1MinusResponse = apiInstance.ezsignfolderDisposeV1(pkiEzsignfolderID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderDisposeV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderDisposeV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |
 **body** | **kotlin.Any**|  |

### Return type

[**EzsignfolderMinusDisposeMinusV1MinusResponse**](EzsignfolderMinusDisposeMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfolderEditObjectV1"></a>
# **ezsignfolderEditObjectV1**
> EzsignfolderMinusEditObjectMinusV1MinusResponse ezsignfolderEditObjectV1(pkiEzsignfolderID, ezsignfolderMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsignfolder



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

<a id="ezsignfolderGetActionableElementsV1"></a>
# **ezsignfolderGetActionableElementsV1**
> EzsignfolderMinusGetActionableElementsMinusV1MinusResponse ezsignfolderGetActionableElementsV1(pkiEzsignfolderID)

Retrieve actionable elements for the Ezsignfolder

Return the Ezsignsignatures that can be signed and Ezsignformfieldgroups that can be filled by the current user at the current step in the process

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfolderMinusGetActionableElementsMinusV1MinusResponse = apiInstance.ezsignfolderGetActionableElementsV1(pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetActionableElementsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetActionableElementsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |

### Return type

[**EzsignfolderMinusGetActionableElementsMinusV1MinusResponse**](EzsignfolderMinusGetActionableElementsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfolderGetCommunicationCountV1"></a>
# **ezsignfolderGetCommunicationCountV1**
> EzsignfolderMinusGetCommunicationCountMinusV1MinusResponse ezsignfolderGetCommunicationCountV1(pkiEzsignfolderID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfolderMinusGetCommunicationCountMinusV1MinusResponse = apiInstance.ezsignfolderGetCommunicationCountV1(pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |

### Return type

[**EzsignfolderMinusGetCommunicationCountMinusV1MinusResponse**](EzsignfolderMinusGetCommunicationCountMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfolderGetCommunicationListV1"></a>
# **ezsignfolderGetCommunicationListV1**
> EzsignfolderMinusGetCommunicationListMinusV1MinusResponse ezsignfolderGetCommunicationListV1(pkiEzsignfolderID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfolderMinusGetCommunicationListMinusV1MinusResponse = apiInstance.ezsignfolderGetCommunicationListV1(pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |

### Return type

[**EzsignfolderMinusGetCommunicationListMinusV1MinusResponse**](EzsignfolderMinusGetCommunicationListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfolderGetEzsigndocumentsV1"></a>
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

<a id="ezsignfolderGetEzsignfoldersignerassociationsV1"></a>
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

<a id="ezsignfolderGetEzsignsignaturesAutomaticV1"></a>
# **ezsignfolderGetEzsignsignaturesAutomaticV1**
> EzsignfolderMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse ezsignfolderGetEzsignsignaturesAutomaticV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s automatic Ezsignsignatures

Return the Ezsignsignatures that can be signed by the current user at the current step in the process

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfolderMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse = apiInstance.ezsignfolderGetEzsignsignaturesAutomaticV1(pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetEzsignsignaturesAutomaticV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetEzsignsignaturesAutomaticV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |

### Return type

[**EzsignfolderMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse**](EzsignfolderMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfolderGetFormsDataV1"></a>
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

<a id="ezsignfolderGetListV1"></a>
# **ezsignfolderGetListV1**
> EzsignfolderMinusGetListMinusV1MinusResponse ezsignfolderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignfolder list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfolderStep | Unsent&lt;br&gt;Sent&lt;br&gt;PartiallySigned&lt;br&gt;Expired&lt;br&gt;Completed&lt;br&gt;Archived&lt;br&gt;Disposed| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |

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
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignfolderID_ASC, pkiEzsignfolderID_DESC, sEzsignfolderDescription_ASC, sEzsignfolderDescription_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, fkiEzsignfoldertypeID_ASC, fkiEzsignfoldertypeID_DESC, sEzsignfoldertypeNameX_ASC, sEzsignfoldertypeNameX_DESC, eEzsignfolderStep_ASC, eEzsignfolderStep_DESC, dtEzsignfolderSentdate_ASC, dtEzsignfolderSentdate_DESC, dtEzsignfolderDuedate_ASC, dtEzsignfolderDuedate_DESC, iEzsigndocument_ASC, iEzsigndocument_DESC, iEzsigndocumentEdm_ASC, iEzsigndocumentEdm_DESC, iEzsignsignature_ASC, iEzsignsignature_DESC, iEzsignsignatureSigned_ASC, iEzsignsignatureSigned_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional] [default to 10000]
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
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

<a id="ezsignfolderGetObjectV1"></a>
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

<a id="ezsignfolderGetObjectV2"></a>
# **ezsignfolderGetObjectV2**
> EzsignfolderMinusGetObjectMinusV2MinusResponse ezsignfolderGetObjectV2(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfolderMinusGetObjectMinusV2MinusResponse = apiInstance.ezsignfolderGetObjectV2(pkiEzsignfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |

### Return type

[**EzsignfolderMinusGetObjectMinusV2MinusResponse**](EzsignfolderMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfolderImportEzsignfoldersignerassociationsV1"></a>
# **ezsignfolderImportEzsignfoldersignerassociationsV1**
> EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusResponse ezsignfolderImportEzsignfoldersignerassociationsV1(pkiEzsignfolderID, ezsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusRequest)

Import an existing Ezsignfoldersignerassociation into this Ezsignfolder



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusRequest : EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusRequest =  // EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusRequest | 
try {
    val result : EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusResponse = apiInstance.ezsignfolderImportEzsignfoldersignerassociationsV1(pkiEzsignfolderID, ezsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderImportEzsignfoldersignerassociationsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderImportEzsignfoldersignerassociationsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |
 **ezsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusRequest** | [**EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusRequest**](EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusRequest.md)|  |

### Return type

[**EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusResponse**](EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfolderImportEzsigntemplatepackageV1"></a>
# **ezsignfolderImportEzsigntemplatepackageV1**
> EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusResponse ezsignfolderImportEzsigntemplatepackageV1(pkiEzsignfolderID, ezsignfolderMinusImportEzsigntemplatepackageMinusV1MinusRequest)

Import an Ezsigntemplatepackage in the Ezsignfolder.

This endpoint imports all of the Ezsigntemplates from the Ezsigntemplatepackage into the Ezsignfolder as Ezsigndocuments.  This allows to automatically apply all the Ezsigntemplateformfieldgroups and Ezsigntemplatesignatures on the newly created Ezsigndocuments in a single step.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfolderMinusImportEzsigntemplatepackageMinusV1MinusRequest : EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusRequest =  // EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusRequest | 
try {
    val result : EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusResponse = apiInstance.ezsignfolderImportEzsigntemplatepackageV1(pkiEzsignfolderID, ezsignfolderMinusImportEzsigntemplatepackageMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderImportEzsigntemplatepackageV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderImportEzsigntemplatepackageV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |
 **ezsignfolderMinusImportEzsigntemplatepackageMinusV1MinusRequest** | [**EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusRequest**](EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusRequest.md)|  |

### Return type

[**EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusResponse**](EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfolderReorderV1"></a>
# **ezsignfolderReorderV1**
> EzsignfolderMinusReorderMinusV1MinusResponse ezsignfolderReorderV1(pkiEzsignfolderID, ezsignfolderMinusReorderMinusV1MinusRequest)

Reorder Ezsigndocuments in the Ezsignfolder

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfolderMinusReorderMinusV1MinusRequest : EzsignfolderMinusReorderMinusV1MinusRequest =  // EzsignfolderMinusReorderMinusV1MinusRequest | 
try {
    val result : EzsignfolderMinusReorderMinusV1MinusResponse = apiInstance.ezsignfolderReorderV1(pkiEzsignfolderID, ezsignfolderMinusReorderMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderReorderV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderReorderV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |
 **ezsignfolderMinusReorderMinusV1MinusRequest** | [**EzsignfolderMinusReorderMinusV1MinusRequest**](EzsignfolderMinusReorderMinusV1MinusRequest.md)|  |

### Return type

[**EzsignfolderMinusReorderMinusV1MinusResponse**](EzsignfolderMinusReorderMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfolderSendV1"></a>
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

<a id="ezsignfolderSendV2"></a>
# **ezsignfolderSendV2**
> EzsignfolderMinusSendMinusV2MinusResponse ezsignfolderSendV2(pkiEzsignfolderID, ezsignfolderMinusSendMinusV2MinusRequest)

Send the Ezsignfolder to the signatories for signature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfolderMinusSendMinusV2MinusRequest : EzsignfolderMinusSendMinusV2MinusRequest =  // EzsignfolderMinusSendMinusV2MinusRequest | 
try {
    val result : EzsignfolderMinusSendMinusV2MinusResponse = apiInstance.ezsignfolderSendV2(pkiEzsignfolderID, ezsignfolderMinusSendMinusV2MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderSendV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderSendV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |
 **ezsignfolderMinusSendMinusV2MinusRequest** | [**EzsignfolderMinusSendMinusV2MinusRequest**](EzsignfolderMinusSendMinusV2MinusRequest.md)|  |

### Return type

[**EzsignfolderMinusSendMinusV2MinusResponse**](EzsignfolderMinusSendMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfolderSendV3"></a>
# **ezsignfolderSendV3**
> EzsignfolderMinusSendMinusV3MinusResponse ezsignfolderSendV3(pkiEzsignfolderID, ezsignfolderMinusSendMinusV3MinusRequest)

Send the Ezsignfolder to the signatories for signature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfolderMinusSendMinusV3MinusRequest : EzsignfolderMinusSendMinusV3MinusRequest =  // EzsignfolderMinusSendMinusV3MinusRequest | 
try {
    val result : EzsignfolderMinusSendMinusV3MinusResponse = apiInstance.ezsignfolderSendV3(pkiEzsignfolderID, ezsignfolderMinusSendMinusV3MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderSendV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderSendV3")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |
 **ezsignfolderMinusSendMinusV3MinusRequest** | [**EzsignfolderMinusSendMinusV3MinusRequest**](EzsignfolderMinusSendMinusV3MinusRequest.md)|  |

### Return type

[**EzsignfolderMinusSendMinusV3MinusResponse**](EzsignfolderMinusSendMinusV3MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfolderUnsendV1"></a>
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
val body : kotlin.Any = Object // kotlin.Any | 
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
 **body** | **kotlin.Any**|  |

### Return type

[**EzsignfolderMinusUnsendMinusV1MinusResponse**](EzsignfolderMinusUnsendMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


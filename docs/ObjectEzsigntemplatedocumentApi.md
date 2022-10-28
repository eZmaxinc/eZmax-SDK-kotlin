# ObjectEzsigntemplatedocumentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatedocumentCreateObjectV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentCreateObjectV1) | **POST** /1/object/ezsigntemplatedocument | Create a new Ezsigntemplatedocument
[**ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplateformfieldgroups | Edit multiple Ezsigntemplateformfieldgroups
[**ezsigntemplatedocumentEditEzsigntemplatesignaturesV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditEzsigntemplatesignaturesV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatesignatures | Edit multiple Ezsigntemplatesignatures
[**ezsigntemplatedocumentEditObjectV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditObjectV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Edit an existing Ezsigntemplatedocument
[**ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatedocumentpages | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatedocumentpages
[**ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplateformfieldgroups | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplateformfieldgroups
[**ezsigntemplatedocumentGetEzsigntemplatesignaturesV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplatesignaturesV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatesignatures | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatesignatures
[**ezsigntemplatedocumentGetObjectV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetObjectV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Retrieve an existing Ezsigntemplatedocument
[**ezsigntemplatedocumentGetObjectV2**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetObjectV2) | **GET** /2/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Retrieve an existing Ezsigntemplatedocument
[**ezsigntemplatedocumentGetWordsPositionsV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetWordsPositionsV1) | **POST** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigntemplatedocument
[**ezsigntemplatedocumentPatchObjectV1**](ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentPatchObjectV1) | **PATCH** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Patch an existing Ezsigntemplatedocument


<a name="ezsigntemplatedocumentCreateObjectV1"></a>
# **ezsigntemplatedocumentCreateObjectV1**
> EzsigntemplatedocumentMinusCreateObjectMinusV1MinusResponse ezsigntemplatedocumentCreateObjectV1(ezsigntemplatedocumentMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsigntemplatedocument

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentApi()
val ezsigntemplatedocumentMinusCreateObjectMinusV1MinusRequest : EzsigntemplatedocumentMinusCreateObjectMinusV1MinusRequest =  // EzsigntemplatedocumentMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatedocumentMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsigntemplatedocumentCreateObjectV1(ezsigntemplatedocumentMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatedocumentMinusCreateObjectMinusV1MinusRequest** | [**EzsigntemplatedocumentMinusCreateObjectMinusV1MinusRequest**](EzsigntemplatedocumentMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatedocumentMinusCreateObjectMinusV1MinusResponse**](EzsigntemplatedocumentMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1"></a>
# **ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1**
> EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusResponse ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusRequest)

Edit multiple Ezsigntemplateformfieldgroups

Using this endpoint, you can edit multiple Ezsigntemplateformfieldgroups at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentApi()
val pkiEzsigntemplatedocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusRequest : EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusRequest =  // EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusRequest | 
try {
    val result : EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusResponse = apiInstance.ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **kotlin.Int**|  |
 **ezsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusRequest** | [**EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusRequest**](EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusResponse**](EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatedocumentEditEzsigntemplatesignaturesV1"></a>
# **ezsigntemplatedocumentEditEzsigntemplatesignaturesV1**
> EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusResponse ezsigntemplatedocumentEditEzsigntemplatesignaturesV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusRequest)

Edit multiple Ezsigntemplatesignatures

Using this endpoint, you can edit multiple Ezsigntemplatesignatures at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentApi()
val pkiEzsigntemplatedocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusRequest : EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusRequest =  // EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusRequest | 
try {
    val result : EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusResponse = apiInstance.ezsigntemplatedocumentEditEzsigntemplatesignaturesV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentEditEzsigntemplatesignaturesV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentEditEzsigntemplatesignaturesV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **kotlin.Int**|  |
 **ezsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusRequest** | [**EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusRequest**](EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusResponse**](EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatedocumentEditObjectV1"></a>
# **ezsigntemplatedocumentEditObjectV1**
> EzsigntemplatedocumentMinusEditObjectMinusV1MinusResponse ezsigntemplatedocumentEditObjectV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsigntemplatedocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentApi()
val pkiEzsigntemplatedocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatedocumentMinusEditObjectMinusV1MinusRequest : EzsigntemplatedocumentMinusEditObjectMinusV1MinusRequest =  // EzsigntemplatedocumentMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatedocumentMinusEditObjectMinusV1MinusResponse = apiInstance.ezsigntemplatedocumentEditObjectV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **kotlin.Int**|  |
 **ezsigntemplatedocumentMinusEditObjectMinusV1MinusRequest** | [**EzsigntemplatedocumentMinusEditObjectMinusV1MinusRequest**](EzsigntemplatedocumentMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatedocumentMinusEditObjectMinusV1MinusResponse**](EzsigntemplatedocumentMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1"></a>
# **ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1**
> EzsigntemplatedocumentMinusGetEzsigntemplatedocumentpagesMinusV1MinusResponse ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1(pkiEzsigntemplatedocumentID)

Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatedocumentpages



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentApi()
val pkiEzsigntemplatedocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatedocumentMinusGetEzsigntemplatedocumentpagesMinusV1MinusResponse = apiInstance.ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1(pkiEzsigntemplatedocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatedocumentMinusGetEzsigntemplatedocumentpagesMinusV1MinusResponse**](EzsigntemplatedocumentMinusGetEzsigntemplatedocumentpagesMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1"></a>
# **ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1**
> EzsigntemplatedocumentMinusGetEzsigntemplateformfieldgroupsMinusV1MinusResponse ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1(pkiEzsigntemplatedocumentID)

Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplateformfieldgroups



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentApi()
val pkiEzsigntemplatedocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatedocumentMinusGetEzsigntemplateformfieldgroupsMinusV1MinusResponse = apiInstance.ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1(pkiEzsigntemplatedocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatedocumentMinusGetEzsigntemplateformfieldgroupsMinusV1MinusResponse**](EzsigntemplatedocumentMinusGetEzsigntemplateformfieldgroupsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatedocumentGetEzsigntemplatesignaturesV1"></a>
# **ezsigntemplatedocumentGetEzsigntemplatesignaturesV1**
> EzsigntemplatedocumentMinusGetEzsigntemplatesignaturesMinusV1MinusResponse ezsigntemplatedocumentGetEzsigntemplatesignaturesV1(pkiEzsigntemplatedocumentID)

Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatesignatures



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentApi()
val pkiEzsigntemplatedocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatedocumentMinusGetEzsigntemplatesignaturesMinusV1MinusResponse = apiInstance.ezsigntemplatedocumentGetEzsigntemplatesignaturesV1(pkiEzsigntemplatedocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetEzsigntemplatesignaturesV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetEzsigntemplatesignaturesV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatedocumentMinusGetEzsigntemplatesignaturesMinusV1MinusResponse**](EzsigntemplatedocumentMinusGetEzsigntemplatesignaturesMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatedocumentGetObjectV1"></a>
# **ezsigntemplatedocumentGetObjectV1**
> EzsigntemplatedocumentMinusGetObjectMinusV1MinusResponse ezsigntemplatedocumentGetObjectV1(pkiEzsigntemplatedocumentID)

Retrieve an existing Ezsigntemplatedocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentApi()
val pkiEzsigntemplatedocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatedocumentMinusGetObjectMinusV1MinusResponse = apiInstance.ezsigntemplatedocumentGetObjectV1(pkiEzsigntemplatedocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatedocumentMinusGetObjectMinusV1MinusResponse**](EzsigntemplatedocumentMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatedocumentGetObjectV2"></a>
# **ezsigntemplatedocumentGetObjectV2**
> EzsigntemplatedocumentMinusGetObjectMinusV2MinusResponse ezsigntemplatedocumentGetObjectV2(pkiEzsigntemplatedocumentID)

Retrieve an existing Ezsigntemplatedocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentApi()
val pkiEzsigntemplatedocumentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatedocumentMinusGetObjectMinusV2MinusResponse = apiInstance.ezsigntemplatedocumentGetObjectV2(pkiEzsigntemplatedocumentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatedocumentMinusGetObjectMinusV2MinusResponse**](EzsigntemplatedocumentMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatedocumentGetWordsPositionsV1"></a>
# **ezsigntemplatedocumentGetWordsPositionsV1**
> EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusResponse ezsigntemplatedocumentGetWordsPositionsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusRequest)

Retrieve positions X,Y of given words from a Ezsigntemplatedocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentApi()
val pkiEzsigntemplatedocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusRequest : EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusRequest =  // EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusRequest | 
try {
    val result : EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusResponse = apiInstance.ezsigntemplatedocumentGetWordsPositionsV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetWordsPositionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentGetWordsPositionsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **kotlin.Int**|  |
 **ezsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusRequest** | [**EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusRequest**](EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusResponse**](EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatedocumentPatchObjectV1"></a>
# **ezsigntemplatedocumentPatchObjectV1**
> EzsigntemplatedocumentMinusPatchObjectMinusV1MinusResponse ezsigntemplatedocumentPatchObjectV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentMinusPatchObjectMinusV1MinusRequest)

Patch an existing Ezsigntemplatedocument



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentApi()
val pkiEzsigntemplatedocumentID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatedocumentMinusPatchObjectMinusV1MinusRequest : EzsigntemplatedocumentMinusPatchObjectMinusV1MinusRequest =  // EzsigntemplatedocumentMinusPatchObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatedocumentMinusPatchObjectMinusV1MinusResponse = apiInstance.ezsigntemplatedocumentPatchObjectV1(pkiEzsigntemplatedocumentID, ezsigntemplatedocumentMinusPatchObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentPatchObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentApi#ezsigntemplatedocumentPatchObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatedocumentID** | **kotlin.Int**|  |
 **ezsigntemplatedocumentMinusPatchObjectMinusV1MinusRequest** | [**EzsigntemplatedocumentMinusPatchObjectMinusV1MinusRequest**](EzsigntemplatedocumentMinusPatchObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatedocumentMinusPatchObjectMinusV1MinusResponse**](EzsigntemplatedocumentMinusPatchObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


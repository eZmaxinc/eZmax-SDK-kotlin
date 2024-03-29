# ObjectEzsignsignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignsignatureCreateObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
[**ezsignsignatureCreateObjectV2**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV2) | **POST** /2/object/ezsignsignature | Create a new Ezsignsignature
[**ezsignsignatureDeleteObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureDeleteObjectV1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
[**ezsignsignatureEditObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureEditObjectV1) | **PUT** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Edit an existing Ezsignsignature
[**ezsignsignatureGetEzsignsignatureattachmentV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetEzsignsignatureattachmentV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID}/getEzsignsignatureattachment | Retrieve an existing Ezsignsignature&#39;s Ezsignsignatureattachments
[**ezsignsignatureGetEzsignsignaturesAutomaticV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsignsignature/getEzsignsignaturesAutomatic | Retrieve all automatic Ezsignsignatures
[**ezsignsignatureGetObjectV2**](ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectV2) | **GET** /2/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature
[**ezsignsignatureSignV1**](ObjectEzsignsignatureApi.md#ezsignsignatureSignV1) | **POST** /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign | Sign the Ezsignsignature


<a id="ezsignsignatureCreateObjectV1"></a>
# **ezsignsignatureCreateObjectV1**
> EzsignsignatureMinusCreateObjectMinusV1MinusResponse ezsignsignatureCreateObjectV1(ezsignsignatureMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val ezsignsignatureMinusCreateObjectMinusV1MinusRequest : kotlin.collections.List<EzsignsignatureMinusCreateObjectMinusV1MinusRequest> =  // kotlin.collections.List<EzsignsignatureMinusCreateObjectMinusV1MinusRequest> | 
try {
    val result : EzsignsignatureMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsignsignatureCreateObjectV1(ezsignsignatureMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignsignatureMinusCreateObjectMinusV1MinusRequest** | [**kotlin.collections.List&lt;EzsignsignatureMinusCreateObjectMinusV1MinusRequest&gt;**](EzsignsignatureMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignsignatureMinusCreateObjectMinusV1MinusResponse**](EzsignsignatureMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignatureCreateObjectV2"></a>
# **ezsignsignatureCreateObjectV2**
> EzsignsignatureMinusCreateObjectMinusV2MinusResponse ezsignsignatureCreateObjectV2(ezsignsignatureMinusCreateObjectMinusV2MinusRequest)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val ezsignsignatureMinusCreateObjectMinusV2MinusRequest : EzsignsignatureMinusCreateObjectMinusV2MinusRequest =  // EzsignsignatureMinusCreateObjectMinusV2MinusRequest | 
try {
    val result : EzsignsignatureMinusCreateObjectMinusV2MinusResponse = apiInstance.ezsignsignatureCreateObjectV2(ezsignsignatureMinusCreateObjectMinusV2MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignsignatureMinusCreateObjectMinusV2MinusRequest** | [**EzsignsignatureMinusCreateObjectMinusV2MinusRequest**](EzsignsignatureMinusCreateObjectMinusV2MinusRequest.md)|  |

### Return type

[**EzsignsignatureMinusCreateObjectMinusV2MinusResponse**](EzsignsignatureMinusCreateObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignatureDeleteObjectV1"></a>
# **ezsignsignatureDeleteObjectV1**
> EzsignsignatureMinusDeleteObjectMinusV1MinusResponse ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID)

Delete an existing Ezsignsignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignsignatureMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **kotlin.Int**|  |

### Return type

[**EzsignsignatureMinusDeleteObjectMinusV1MinusResponse**](EzsignsignatureMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignatureEditObjectV1"></a>
# **ezsignsignatureEditObjectV1**
> EzsignsignatureMinusEditObjectMinusV1MinusResponse ezsignsignatureEditObjectV1(pkiEzsignsignatureID, ezsignsignatureMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsignsignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | 
val ezsignsignatureMinusEditObjectMinusV1MinusRequest : EzsignsignatureMinusEditObjectMinusV1MinusRequest =  // EzsignsignatureMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsignsignatureMinusEditObjectMinusV1MinusResponse = apiInstance.ezsignsignatureEditObjectV1(pkiEzsignsignatureID, ezsignsignatureMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **kotlin.Int**|  |
 **ezsignsignatureMinusEditObjectMinusV1MinusRequest** | [**EzsignsignatureMinusEditObjectMinusV1MinusRequest**](EzsignsignatureMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignsignatureMinusEditObjectMinusV1MinusResponse**](EzsignsignatureMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignatureGetEzsignsignatureattachmentV1"></a>
# **ezsignsignatureGetEzsignsignatureattachmentV1**
> EzsignsignatureMinusGetEzsignsignatureattachmentMinusV1MinusResponse ezsignsignatureGetEzsignsignatureattachmentV1(pkiEzsignsignatureID)

Retrieve an existing Ezsignsignature&#39;s Ezsignsignatureattachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignsignatureMinusGetEzsignsignatureattachmentMinusV1MinusResponse = apiInstance.ezsignsignatureGetEzsignsignatureattachmentV1(pkiEzsignsignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetEzsignsignatureattachmentV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetEzsignsignatureattachmentV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **kotlin.Int**|  |

### Return type

[**EzsignsignatureMinusGetEzsignsignatureattachmentMinusV1MinusResponse**](EzsignsignatureMinusGetEzsignsignatureattachmentMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignatureGetEzsignsignaturesAutomaticV1"></a>
# **ezsignsignatureGetEzsignsignaturesAutomaticV1**
> EzsignsignatureMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse ezsignsignatureGetEzsignsignaturesAutomaticV1()

Retrieve all automatic Ezsignsignatures

Return all the Ezsignsignatures that can be signed by the current user

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
try {
    val result : EzsignsignatureMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse = apiInstance.ezsignsignatureGetEzsignsignaturesAutomaticV1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetEzsignsignaturesAutomaticV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetEzsignsignaturesAutomaticV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EzsignsignatureMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse**](EzsignsignatureMinusGetEzsignsignaturesAutomaticMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignatureGetObjectV2"></a>
# **ezsignsignatureGetObjectV2**
> EzsignsignatureMinusGetObjectMinusV2MinusResponse ezsignsignatureGetObjectV2(pkiEzsignsignatureID)

Retrieve an existing Ezsignsignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignsignatureMinusGetObjectMinusV2MinusResponse = apiInstance.ezsignsignatureGetObjectV2(pkiEzsignsignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **kotlin.Int**|  |

### Return type

[**EzsignsignatureMinusGetObjectMinusV2MinusResponse**](EzsignsignatureMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignatureSignV1"></a>
# **ezsignsignatureSignV1**
> EzsignsignatureMinusSignMinusV1MinusResponse ezsignsignatureSignV1(pkiEzsignsignatureID, ezsignsignatureMinusSignMinusV1MinusRequest)

Sign the Ezsignsignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | 
val ezsignsignatureMinusSignMinusV1MinusRequest : EzsignsignatureMinusSignMinusV1MinusRequest =  // EzsignsignatureMinusSignMinusV1MinusRequest | 
try {
    val result : EzsignsignatureMinusSignMinusV1MinusResponse = apiInstance.ezsignsignatureSignV1(pkiEzsignsignatureID, ezsignsignatureMinusSignMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureSignV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureSignV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **kotlin.Int**|  |
 **ezsignsignatureMinusSignMinusV1MinusRequest** | [**EzsignsignatureMinusSignMinusV1MinusRequest**](EzsignsignatureMinusSignMinusV1MinusRequest.md)|  |

### Return type

[**EzsignsignatureMinusSignMinusV1MinusResponse**](EzsignsignatureMinusSignMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


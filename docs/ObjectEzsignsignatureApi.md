# ObjectEzsignsignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignsignatureCreateObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
[**ezsignsignatureDeleteObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureDeleteObjectV1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
[**ezsignsignatureEditObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureEditObjectV1) | **PUT** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Modify an existing Ezsignsignature
[**ezsignsignatureGetObjectGetChildrenV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectGetChildrenV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID}/getChildren | Retrieve an existing Ezsignsignature&#39;s children IDs
[**ezsignsignatureGetObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature


<a name="ezsignsignatureCreateObjectV1"></a>
# **ezsignsignatureCreateObjectV1**
> EzsignsignatureMinusCreateObjectMinusV1MinusResponse ezsignsignatureCreateObjectV1(ezsignsignatureMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

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

<a name="ezsignsignatureDeleteObjectV1"></a>
# **ezsignsignatureDeleteObjectV1**
> EzsignsignatureMinusDeleteObjectMinusV1MinusResponse ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID)

Delete an existing Ezsignsignature

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignature
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
 **pkiEzsignsignatureID** | **kotlin.Int**| The unique ID of the Ezsignsignature |

### Return type

[**EzsignsignatureMinusDeleteObjectMinusV1MinusResponse**](EzsignsignatureMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignsignatureEditObjectV1"></a>
# **ezsignsignatureEditObjectV1**
> EzsignsignatureMinusEditObjectMinusV1MinusResponse ezsignsignatureEditObjectV1(pkiEzsignsignatureID, ezsignsignatureMinusEditObjectMinusV1MinusRequest)

Modify an existing Ezsignsignature

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignature
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
 **pkiEzsignsignatureID** | **kotlin.Int**| The unique ID of the Ezsignsignature |
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

<a name="ezsignsignatureGetObjectGetChildrenV1"></a>
# **ezsignsignatureGetObjectGetChildrenV1**
> ezsignsignatureGetObjectGetChildrenV1(pkiEzsignsignatureID)

Retrieve an existing Ezsignsignature&#39;s children IDs

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignature
try {
    apiInstance.ezsignsignatureGetObjectGetChildrenV1(pkiEzsignsignatureID)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectGetChildrenV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectGetChildrenV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **kotlin.Int**| The unique ID of the Ezsignsignature |

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignsignatureGetObjectV1"></a>
# **ezsignsignatureGetObjectV1**
> EzsignsignatureMinusGetObjectMinusV1MinusResponse ezsignsignatureGetObjectV1(pkiEzsignsignatureID)

Retrieve an existing Ezsignsignature

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignature
try {
    val result : EzsignsignatureMinusGetObjectMinusV1MinusResponse = apiInstance.ezsignsignatureGetObjectV1(pkiEzsignsignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignatureID** | **kotlin.Int**| The unique ID of the Ezsignsignature |

### Return type

[**EzsignsignatureMinusGetObjectMinusV1MinusResponse**](EzsignsignatureMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


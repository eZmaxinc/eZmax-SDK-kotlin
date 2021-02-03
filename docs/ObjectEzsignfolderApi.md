# ObjectEzsignfolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfolderCreateObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
[**ezsignfolderDeleteObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderDeleteObjectV1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
[**ezsignfolderEditObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderEditObjectV1) | **PUT** /1/object/ezsignfolder/{pkiEzsignfolderID} | Modify an existing Ezsignfolder
[**ezsignfolderGetObjectGetChildrenV1**](ObjectEzsignfolderApi.md#ezsignfolderGetObjectGetChildrenV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getChildren | Retrieve an existing Ezsignfolder&#39;s children IDs
[**ezsignfolderGetObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderGetObjectV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
[**ezsignfolderSendV1**](ObjectEzsignfolderApi.md#ezsignfolderSendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature


<a name="ezsignfolderCreateObjectV1"></a>
# **ezsignfolderCreateObjectV1**
> EzsignfolderMinusCreateObjectMinusV1MinusResponse ezsignfolderCreateObjectV1(ezsignfolderMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsignfolder

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

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
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignfolder
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
 **pkiEzsignfolderID** | **kotlin.Int**| The unique ID of the Ezsignfolder |

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
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignfolder
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
 **pkiEzsignfolderID** | **kotlin.Int**| The unique ID of the Ezsignfolder |
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

<a name="ezsignfolderGetObjectGetChildrenV1"></a>
# **ezsignfolderGetObjectGetChildrenV1**
> ezsignfolderGetObjectGetChildrenV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s children IDs

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignfolder
try {
    apiInstance.ezsignfolderGetObjectGetChildrenV1(pkiEzsignfolderID)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetObjectGetChildrenV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetObjectGetChildrenV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**| The unique ID of the Ezsignfolder |

### Return type

null (empty response body)

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
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignfolder
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
 **pkiEzsignfolderID** | **kotlin.Int**| The unique ID of the Ezsignfolder |

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
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignfolder
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
 **pkiEzsignfolderID** | **kotlin.Int**| The unique ID of the Ezsignfolder |
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


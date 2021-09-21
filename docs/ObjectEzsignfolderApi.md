# ObjectEzsignfolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfolderCreateObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
[**ezsignfolderDeleteObjectV1**](ObjectEzsignfolderApi.md#ezsignfolderDeleteObjectV1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
[**ezsignfolderGetChildrenV1**](ObjectEzsignfolderApi.md#ezsignfolderGetChildrenV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getChildren | Retrieve an existing Ezsignfolder&#39;s children IDs
[**ezsignfolderGetFormsDataV1**](ObjectEzsignfolderApi.md#ezsignfolderGetFormsDataV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getFormsData | Retrieve an existing Ezsignfolder&#39;s forms data
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

<a name="ezsignfolderGetChildrenV1"></a>
# **ezsignfolderGetChildrenV1**
> ezsignfolderGetChildrenV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s children IDs

## ⚠️EARLY ADOPTERS WARNING  ### This endpoint is not officially released. Its definition might still change and it might not be available in every environment and region.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.ezsignfolderGetChildrenV1(pkiEzsignfolderID)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfolderApi#ezsignfolderGetChildrenV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfolderApi#ezsignfolderGetChildrenV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfolderID** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignfolderGetFormsDataV1"></a>
# **ezsignfolderGetFormsDataV1**
> java.io.File ezsignfolderGetFormsDataV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder&#39;s forms data

## ⚠️EARLY ADOPTERS WARNING  ### This endpoint is not officially released. Its definition might still change and it might not be available in every environment and region.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfolderApi()
val pkiEzsignfolderID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : java.io.File = apiInstance.ezsignfolderGetFormsDataV1(pkiEzsignfolderID)
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

[**java.io.File**](java.io.File.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip, application/json

<a name="ezsignfolderGetObjectV1"></a>
# **ezsignfolderGetObjectV1**
> EzsignfolderMinusGetObjectMinusV1MinusResponse ezsignfolderGetObjectV1(pkiEzsignfolderID)

Retrieve an existing Ezsignfolder

## ⚠️EARLY ADOPTERS WARNING  ### This endpoint is not officially released. Its definition might still change and it might not be available in every environment and region.

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


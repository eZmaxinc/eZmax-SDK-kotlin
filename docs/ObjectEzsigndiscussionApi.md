# ObjectEzsigndiscussionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigndiscussionCreateObjectV1**](ObjectEzsigndiscussionApi.md#ezsigndiscussionCreateObjectV1) | **POST** /1/object/ezsigndiscussion | Create a new Ezsigndiscussion
[**ezsigndiscussionDeleteObjectV1**](ObjectEzsigndiscussionApi.md#ezsigndiscussionDeleteObjectV1) | **DELETE** /1/object/ezsigndiscussion/{pkiEzsigndiscussionID} | Delete an existing Ezsigndiscussion
[**ezsigndiscussionGetObjectV2**](ObjectEzsigndiscussionApi.md#ezsigndiscussionGetObjectV2) | **GET** /2/object/ezsigndiscussion/{pkiEzsigndiscussionID} | Retrieve an existing Ezsigndiscussion


<a id="ezsigndiscussionCreateObjectV1"></a>
# **ezsigndiscussionCreateObjectV1**
> EzsigndiscussionCreateObjectV1Response ezsigndiscussionCreateObjectV1(ezsigndiscussionCreateObjectV1Request)

Create a new Ezsigndiscussion

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndiscussionApi()
val ezsigndiscussionCreateObjectV1Request : EzsigndiscussionCreateObjectV1Request =  // EzsigndiscussionCreateObjectV1Request | 
try {
    val result : EzsigndiscussionCreateObjectV1Response = apiInstance.ezsigndiscussionCreateObjectV1(ezsigndiscussionCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndiscussionApi#ezsigndiscussionCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndiscussionApi#ezsigndiscussionCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigndiscussionCreateObjectV1Request** | [**EzsigndiscussionCreateObjectV1Request**](EzsigndiscussionCreateObjectV1Request.md)|  |

### Return type

[**EzsigndiscussionCreateObjectV1Response**](EzsigndiscussionCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigndiscussionDeleteObjectV1"></a>
# **ezsigndiscussionDeleteObjectV1**
> EzsigndiscussionDeleteObjectV1Response ezsigndiscussionDeleteObjectV1(pkiEzsigndiscussionID)

Delete an existing Ezsigndiscussion



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndiscussionApi()
val pkiEzsigndiscussionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigndiscussion
try {
    val result : EzsigndiscussionDeleteObjectV1Response = apiInstance.ezsigndiscussionDeleteObjectV1(pkiEzsigndiscussionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndiscussionApi#ezsigndiscussionDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndiscussionApi#ezsigndiscussionDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndiscussionID** | **kotlin.Int**| The unique ID of the Ezsigndiscussion |

### Return type

[**EzsigndiscussionDeleteObjectV1Response**](EzsigndiscussionDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigndiscussionGetObjectV2"></a>
# **ezsigndiscussionGetObjectV2**
> EzsigndiscussionGetObjectV2Response ezsigndiscussionGetObjectV2(pkiEzsigndiscussionID)

Retrieve an existing Ezsigndiscussion



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigndiscussionApi()
val pkiEzsigndiscussionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigndiscussion
try {
    val result : EzsigndiscussionGetObjectV2Response = apiInstance.ezsigndiscussionGetObjectV2(pkiEzsigndiscussionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigndiscussionApi#ezsigndiscussionGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigndiscussionApi#ezsigndiscussionGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigndiscussionID** | **kotlin.Int**| The unique ID of the Ezsigndiscussion |

### Return type

[**EzsigndiscussionGetObjectV2Response**](EzsigndiscussionGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


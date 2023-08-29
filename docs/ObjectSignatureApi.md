# ObjectSignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**signatureCreateObjectV1**](ObjectSignatureApi.md#signatureCreateObjectV1) | **POST** /1/object/signature | Create a new Signature
[**signatureDeleteObjectV1**](ObjectSignatureApi.md#signatureDeleteObjectV1) | **DELETE** /1/object/signature/{pkiSignatureID} | Delete an existing Signature
[**signatureEditObjectV1**](ObjectSignatureApi.md#signatureEditObjectV1) | **PUT** /1/object/signature/{pkiSignatureID} | Edit an existing Signature
[**signatureGetObjectV2**](ObjectSignatureApi.md#signatureGetObjectV2) | **GET** /2/object/signature/{pkiSignatureID} | Retrieve an existing Signature


<a id="signatureCreateObjectV1"></a>
# **signatureCreateObjectV1**
> SignatureCreateObjectV1Response signatureCreateObjectV1(signatureCreateObjectV1Request)

Create a new Signature

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSignatureApi()
val signatureCreateObjectV1Request : SignatureCreateObjectV1Request =  // SignatureCreateObjectV1Request | 
try {
    val result : SignatureCreateObjectV1Response = apiInstance.signatureCreateObjectV1(signatureCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSignatureApi#signatureCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSignatureApi#signatureCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signatureCreateObjectV1Request** | [**SignatureCreateObjectV1Request**](SignatureCreateObjectV1Request.md)|  |

### Return type

[**SignatureCreateObjectV1Response**](SignatureCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="signatureDeleteObjectV1"></a>
# **signatureDeleteObjectV1**
> SignatureDeleteObjectV1Response signatureDeleteObjectV1(pkiSignatureID)

Delete an existing Signature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSignatureApi()
val pkiSignatureID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Signature
try {
    val result : SignatureDeleteObjectV1Response = apiInstance.signatureDeleteObjectV1(pkiSignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSignatureApi#signatureDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSignatureApi#signatureDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSignatureID** | **kotlin.Int**| The unique ID of the Signature |

### Return type

[**SignatureDeleteObjectV1Response**](SignatureDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="signatureEditObjectV1"></a>
# **signatureEditObjectV1**
> SignatureEditObjectV1Response signatureEditObjectV1(pkiSignatureID, signatureEditObjectV1Request)

Edit an existing Signature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSignatureApi()
val pkiSignatureID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Signature
val signatureEditObjectV1Request : SignatureEditObjectV1Request =  // SignatureEditObjectV1Request | 
try {
    val result : SignatureEditObjectV1Response = apiInstance.signatureEditObjectV1(pkiSignatureID, signatureEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSignatureApi#signatureEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSignatureApi#signatureEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSignatureID** | **kotlin.Int**| The unique ID of the Signature |
 **signatureEditObjectV1Request** | [**SignatureEditObjectV1Request**](SignatureEditObjectV1Request.md)|  |

### Return type

[**SignatureEditObjectV1Response**](SignatureEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="signatureGetObjectV2"></a>
# **signatureGetObjectV2**
> SignatureGetObjectV2Response signatureGetObjectV2(pkiSignatureID)

Retrieve an existing Signature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSignatureApi()
val pkiSignatureID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Signature
try {
    val result : SignatureGetObjectV2Response = apiInstance.signatureGetObjectV2(pkiSignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSignatureApi#signatureGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSignatureApi#signatureGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSignatureID** | **kotlin.Int**| The unique ID of the Signature |

### Return type

[**SignatureGetObjectV2Response**](SignatureGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


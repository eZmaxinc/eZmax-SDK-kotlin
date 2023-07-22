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
> SignatureMinusCreateObjectMinusV1MinusResponse signatureCreateObjectV1(signatureMinusCreateObjectMinusV1MinusRequest)

Create a new Signature

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSignatureApi()
val signatureMinusCreateObjectMinusV1MinusRequest : SignatureMinusCreateObjectMinusV1MinusRequest =  // SignatureMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : SignatureMinusCreateObjectMinusV1MinusResponse = apiInstance.signatureCreateObjectV1(signatureMinusCreateObjectMinusV1MinusRequest)
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
 **signatureMinusCreateObjectMinusV1MinusRequest** | [**SignatureMinusCreateObjectMinusV1MinusRequest**](SignatureMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**SignatureMinusCreateObjectMinusV1MinusResponse**](SignatureMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="signatureDeleteObjectV1"></a>
# **signatureDeleteObjectV1**
> SignatureMinusDeleteObjectMinusV1MinusResponse signatureDeleteObjectV1(pkiSignatureID)

Delete an existing Signature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSignatureApi()
val pkiSignatureID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Signature
try {
    val result : SignatureMinusDeleteObjectMinusV1MinusResponse = apiInstance.signatureDeleteObjectV1(pkiSignatureID)
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

[**SignatureMinusDeleteObjectMinusV1MinusResponse**](SignatureMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="signatureEditObjectV1"></a>
# **signatureEditObjectV1**
> SignatureMinusEditObjectMinusV1MinusResponse signatureEditObjectV1(pkiSignatureID, signatureMinusEditObjectMinusV1MinusRequest)

Edit an existing Signature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSignatureApi()
val pkiSignatureID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Signature
val signatureMinusEditObjectMinusV1MinusRequest : SignatureMinusEditObjectMinusV1MinusRequest =  // SignatureMinusEditObjectMinusV1MinusRequest | 
try {
    val result : SignatureMinusEditObjectMinusV1MinusResponse = apiInstance.signatureEditObjectV1(pkiSignatureID, signatureMinusEditObjectMinusV1MinusRequest)
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
 **signatureMinusEditObjectMinusV1MinusRequest** | [**SignatureMinusEditObjectMinusV1MinusRequest**](SignatureMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**SignatureMinusEditObjectMinusV1MinusResponse**](SignatureMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="signatureGetObjectV2"></a>
# **signatureGetObjectV2**
> SignatureMinusGetObjectMinusV2MinusResponse signatureGetObjectV2(pkiSignatureID)

Retrieve an existing Signature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSignatureApi()
val pkiSignatureID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Signature
try {
    val result : SignatureMinusGetObjectMinusV2MinusResponse = apiInstance.signatureGetObjectV2(pkiSignatureID)
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

[**SignatureMinusGetObjectMinusV2MinusResponse**](SignatureMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


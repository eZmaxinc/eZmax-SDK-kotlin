# ModuleAuthenticateApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticateAuthenticateV2**](ModuleAuthenticateApi.md#authenticateAuthenticateV2) | **POST** /2/module/authenticate/authenticate/ezsignuser/{eSessionType} | Authenticate a user


<a name="authenticateAuthenticateV2"></a>
# **authenticateAuthenticateV2**
> AuthenticateMinusAuthenticateMinusV2MinusResponse authenticateAuthenticateV2(eSessionType, authenticateMinusAuthenticateMinusV2MinusRequest)

Authenticate a user

This endpoint authenticates a user.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleAuthenticateApi()
val eSessionType : kotlin.String = eSessionType_example // kotlin.String | 
val authenticateMinusAuthenticateMinusV2MinusRequest : AuthenticateMinusAuthenticateMinusV2MinusRequest =  // AuthenticateMinusAuthenticateMinusV2MinusRequest | 
try {
    val result : AuthenticateMinusAuthenticateMinusV2MinusResponse = apiInstance.authenticateAuthenticateV2(eSessionType, authenticateMinusAuthenticateMinusV2MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModuleAuthenticateApi#authenticateAuthenticateV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleAuthenticateApi#authenticateAuthenticateV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eSessionType** | **kotlin.String**|  | [enum: ezsignuser]
 **authenticateMinusAuthenticateMinusV2MinusRequest** | [**AuthenticateMinusAuthenticateMinusV2MinusRequest**](AuthenticateMinusAuthenticateMinusV2MinusRequest.md)|  |

### Return type

[**AuthenticateMinusAuthenticateMinusV2MinusResponse**](AuthenticateMinusAuthenticateMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


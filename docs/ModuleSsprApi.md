# ModuleSsprApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssprResetPasswordRequestV1**](ModuleSsprApi.md#ssprResetPasswordRequestV1) | **POST** /1/module/sspr/resetPasswordRequest/ | Reset Password Request
[**ssprResetPasswordV1**](ModuleSsprApi.md#ssprResetPasswordV1) | **POST** /1/module/sspr/resetPassword | Reset Password
[**ssprSendUsernamesV1**](ModuleSsprApi.md#ssprSendUsernamesV1) | **POST** /1/module/sspr/sendUsernames | Send username(s)
[**ssprUnlockAccountRequestV1**](ModuleSsprApi.md#ssprUnlockAccountRequestV1) | **POST** /1/module/sspr/unlockAccountRequest | Unlock Account Request
[**ssprUnlockAccountV1**](ModuleSsprApi.md#ssprUnlockAccountV1) | **POST** /1/module/sspr/unlockAccount | Unlock Account
[**ssprValidateTokenV1**](ModuleSsprApi.md#ssprValidateTokenV1) | **POST** /1/module/sspr/validateToken | Validate Token


<a name="ssprResetPasswordRequestV1"></a>
# **ssprResetPasswordRequestV1**
> ssprResetPasswordRequestV1(ssprMinusResetPasswordRequestMinusV1MinusRequest)

Reset Password Request

This endpoint sends an email with a link to reset the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ModuleSsprApi()
val ssprMinusResetPasswordRequestMinusV1MinusRequest : SsprMinusResetPasswordRequestMinusV1MinusRequest =  // SsprMinusResetPasswordRequestMinusV1MinusRequest | 
try {
    apiInstance.ssprResetPasswordRequestV1(ssprMinusResetPasswordRequestMinusV1MinusRequest)
} catch (e: ClientException) {
    println("4xx response calling ModuleSsprApi#ssprResetPasswordRequestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleSsprApi#ssprResetPasswordRequestV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprMinusResetPasswordRequestMinusV1MinusRequest** | [**SsprMinusResetPasswordRequestMinusV1MinusRequest**](SsprMinusResetPasswordRequestMinusV1MinusRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ssprResetPasswordV1"></a>
# **ssprResetPasswordV1**
> ssprResetPasswordV1(ssprMinusResetPasswordMinusV1MinusRequest)

Reset Password

This endpoint resets the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ModuleSsprApi()
val ssprMinusResetPasswordMinusV1MinusRequest : SsprMinusResetPasswordMinusV1MinusRequest =  // SsprMinusResetPasswordMinusV1MinusRequest | 
try {
    apiInstance.ssprResetPasswordV1(ssprMinusResetPasswordMinusV1MinusRequest)
} catch (e: ClientException) {
    println("4xx response calling ModuleSsprApi#ssprResetPasswordV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleSsprApi#ssprResetPasswordV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprMinusResetPasswordMinusV1MinusRequest** | [**SsprMinusResetPasswordMinusV1MinusRequest**](SsprMinusResetPasswordMinusV1MinusRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ssprSendUsernamesV1"></a>
# **ssprSendUsernamesV1**
> ssprSendUsernamesV1(ssprMinusSendUsernamesMinusV1MinusRequest)

Send username(s)

This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ModuleSsprApi()
val ssprMinusSendUsernamesMinusV1MinusRequest : SsprMinusSendUsernamesMinusV1MinusRequest =  // SsprMinusSendUsernamesMinusV1MinusRequest | 
try {
    apiInstance.ssprSendUsernamesV1(ssprMinusSendUsernamesMinusV1MinusRequest)
} catch (e: ClientException) {
    println("4xx response calling ModuleSsprApi#ssprSendUsernamesV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleSsprApi#ssprSendUsernamesV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprMinusSendUsernamesMinusV1MinusRequest** | [**SsprMinusSendUsernamesMinusV1MinusRequest**](SsprMinusSendUsernamesMinusV1MinusRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ssprUnlockAccountRequestV1"></a>
# **ssprUnlockAccountRequestV1**
> ssprUnlockAccountRequestV1(ssprMinusUnlockAccountRequestMinusV1MinusRequest)

Unlock Account Request

This endpoint sends an email with a link to unlock the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ModuleSsprApi()
val ssprMinusUnlockAccountRequestMinusV1MinusRequest : SsprMinusUnlockAccountRequestMinusV1MinusRequest =  // SsprMinusUnlockAccountRequestMinusV1MinusRequest | 
try {
    apiInstance.ssprUnlockAccountRequestV1(ssprMinusUnlockAccountRequestMinusV1MinusRequest)
} catch (e: ClientException) {
    println("4xx response calling ModuleSsprApi#ssprUnlockAccountRequestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleSsprApi#ssprUnlockAccountRequestV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprMinusUnlockAccountRequestMinusV1MinusRequest** | [**SsprMinusUnlockAccountRequestMinusV1MinusRequest**](SsprMinusUnlockAccountRequestMinusV1MinusRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ssprUnlockAccountV1"></a>
# **ssprUnlockAccountV1**
> ssprUnlockAccountV1(ssprMinusUnlockAccountMinusV1MinusRequest)

Unlock Account

This endpoint unlocks the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ModuleSsprApi()
val ssprMinusUnlockAccountMinusV1MinusRequest : SsprMinusUnlockAccountMinusV1MinusRequest =  // SsprMinusUnlockAccountMinusV1MinusRequest | 
try {
    apiInstance.ssprUnlockAccountV1(ssprMinusUnlockAccountMinusV1MinusRequest)
} catch (e: ClientException) {
    println("4xx response calling ModuleSsprApi#ssprUnlockAccountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleSsprApi#ssprUnlockAccountV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprMinusUnlockAccountMinusV1MinusRequest** | [**SsprMinusUnlockAccountMinusV1MinusRequest**](SsprMinusUnlockAccountMinusV1MinusRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ssprValidateTokenV1"></a>
# **ssprValidateTokenV1**
> ssprValidateTokenV1(ssprMinusValidateTokenMinusV1MinusRequest)

Validate Token

This endpoint validates if a Token is valid and not expired. If the token has less than an hour to its life, the TTL is reset to 1 hour.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ModuleSsprApi()
val ssprMinusValidateTokenMinusV1MinusRequest : SsprMinusValidateTokenMinusV1MinusRequest =  // SsprMinusValidateTokenMinusV1MinusRequest | 
try {
    apiInstance.ssprValidateTokenV1(ssprMinusValidateTokenMinusV1MinusRequest)
} catch (e: ClientException) {
    println("4xx response calling ModuleSsprApi#ssprValidateTokenV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleSsprApi#ssprValidateTokenV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ssprMinusValidateTokenMinusV1MinusRequest** | [**SsprMinusValidateTokenMinusV1MinusRequest**](SsprMinusValidateTokenMinusV1MinusRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ModuleUserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCreateEzsignuserV1**](ModuleUserApi.md#userCreateEzsignuserV1) | **POST** /1/module/user/createezsignuser | Create a new User of type Ezsignuser


<a id="userCreateEzsignuserV1"></a>
# **userCreateEzsignuserV1**
> UserCreateEzsignuserV1Response userCreateEzsignuserV1(userCreateEzsignuserV1Request)

Create a new User of type Ezsignuser

The endpoint allows to initiate the creation or a user of type Ezsignuser.  The user will be created only once the email verification process will be completed

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleUserApi()
val userCreateEzsignuserV1Request : kotlin.collections.List<UserCreateEzsignuserV1Request> =  // kotlin.collections.List<UserCreateEzsignuserV1Request> | 
try {
    val result : UserCreateEzsignuserV1Response = apiInstance.userCreateEzsignuserV1(userCreateEzsignuserV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModuleUserApi#userCreateEzsignuserV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleUserApi#userCreateEzsignuserV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userCreateEzsignuserV1Request** | [**kotlin.collections.List&lt;UserCreateEzsignuserV1Request&gt;**](UserCreateEzsignuserV1Request.md)|  |

### Return type

[**UserCreateEzsignuserV1Response**](UserCreateEzsignuserV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


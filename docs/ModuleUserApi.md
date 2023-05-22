# ModuleUserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCreateEzsignuserV1**](ModuleUserApi.md#userCreateEzsignuserV1) | **POST** /1/module/user/createezsignuser | Create a new User of type Ezsignuser


<a id="userCreateEzsignuserV1"></a>
# **userCreateEzsignuserV1**
> UserMinusCreateEzsignuserMinusV1MinusResponse userCreateEzsignuserV1(userMinusCreateEzsignuserMinusV1MinusRequest)

Create a new User of type Ezsignuser

The endpoint allows to initiate the creation or a user of type Ezsignuser.  The user will be created only once the email verification process will be completed

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleUserApi()
val userMinusCreateEzsignuserMinusV1MinusRequest : kotlin.collections.List<UserMinusCreateEzsignuserMinusV1MinusRequest> =  // kotlin.collections.List<UserMinusCreateEzsignuserMinusV1MinusRequest> | 
try {
    val result : UserMinusCreateEzsignuserMinusV1MinusResponse = apiInstance.userCreateEzsignuserV1(userMinusCreateEzsignuserMinusV1MinusRequest)
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
 **userMinusCreateEzsignuserMinusV1MinusRequest** | [**kotlin.collections.List&lt;UserMinusCreateEzsignuserMinusV1MinusRequest&gt;**](UserMinusCreateEzsignuserMinusV1MinusRequest.md)|  |

### Return type

[**UserMinusCreateEzsignuserMinusV1MinusResponse**](UserMinusCreateEzsignuserMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ModuleSsprApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssprRemindUsernamesV1**](ModuleSsprApi.md#ssprRemindUsernamesV1) | **POST** /1/module/sspr/remindUsernames | Remind of forgotten username(s)


<a name="ssprRemindUsernamesV1"></a>
# **ssprRemindUsernamesV1**
> ssprRemindUsernamesV1()

Remind of forgotten username(s)

This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username

### Example
```kotlin
// Import classes:
//import eZmaxinc/eZmax-SDK-kotlin.infrastructure.*
//import eZmaxinc/eZmax-SDK-kotlin.models.*

val apiInstance = ModuleSsprApi()
try {
    apiInstance.ssprRemindUsernamesV1()
} catch (e: ClientException) {
    println("4xx response calling ModuleSsprApi#ssprRemindUsernamesV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleSsprApi#ssprRemindUsernamesV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


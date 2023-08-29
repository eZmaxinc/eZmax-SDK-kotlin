# ObjectNotificationsectionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationsectionGetNotificationtestsV1**](ObjectNotificationsectionApi.md#notificationsectionGetNotificationtestsV1) | **GET** /1/object/notificationsection/{pkiNotificationsectionID}/getNotificationtests | Retrieve an existing Notificationsection&#39;s Notificationtests


<a id="notificationsectionGetNotificationtestsV1"></a>
# **notificationsectionGetNotificationtestsV1**
> NotificationsectionGetNotificationtestsV1Response notificationsectionGetNotificationtestsV1(pkiNotificationsectionID, bShowHidden)

Retrieve an existing Notificationsection&#39;s Notificationtests



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectNotificationsectionApi()
val pkiNotificationsectionID : kotlin.Int = 56 // kotlin.Int | 
val bShowHidden : kotlin.Boolean = true // kotlin.Boolean | Whether or not to return the hidden Notificationtests
try {
    val result : NotificationsectionGetNotificationtestsV1Response = apiInstance.notificationsectionGetNotificationtestsV1(pkiNotificationsectionID, bShowHidden)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectNotificationsectionApi#notificationsectionGetNotificationtestsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectNotificationsectionApi#notificationsectionGetNotificationtestsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiNotificationsectionID** | **kotlin.Int**|  |
 **bShowHidden** | **kotlin.Boolean**| Whether or not to return the hidden Notificationtests |

### Return type

[**NotificationsectionGetNotificationtestsV1Response**](NotificationsectionGetNotificationtestsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


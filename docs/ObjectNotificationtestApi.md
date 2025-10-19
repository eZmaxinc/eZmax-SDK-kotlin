# ObjectNotificationtestApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**notificationtestGetElementsV1**](ObjectNotificationtestApi.md#notificationtestGetElementsV1) | **GET** /1/object/notificationtest/{pkiNotificationtestID}/getElements | Retrieve an existing Notificationtest&#39;s Elements |
| [**notificationtestGetElementsV2**](ObjectNotificationtestApi.md#notificationtestGetElementsV2) | **GET** /2/object/notificationtest/{pkiNotificationtestID}/getElements | Retrieve an existing Notificationtest&#39;s Elements |


<a id="notificationtestGetElementsV1"></a>
# **notificationtestGetElementsV1**
> NotificationtestGetElementsV1Response notificationtestGetElementsV1(pkiNotificationtestID)

Retrieve an existing Notificationtest&#39;s Elements



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectNotificationtestApi()
val pkiNotificationtestID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : NotificationtestGetElementsV1Response = apiInstance.notificationtestGetElementsV1(pkiNotificationtestID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectNotificationtestApi#notificationtestGetElementsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectNotificationtestApi#notificationtestGetElementsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiNotificationtestID** | **kotlin.Int**|  | |

### Return type

[**NotificationtestGetElementsV1Response**](NotificationtestGetElementsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="notificationtestGetElementsV2"></a>
# **notificationtestGetElementsV2**
> NotificationtestGetElementsV2Response notificationtestGetElementsV2(pkiNotificationtestID)

Retrieve an existing Notificationtest&#39;s Elements



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectNotificationtestApi()
val pkiNotificationtestID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : NotificationtestGetElementsV2Response = apiInstance.notificationtestGetElementsV2(pkiNotificationtestID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectNotificationtestApi#notificationtestGetElementsV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectNotificationtestApi#notificationtestGetElementsV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiNotificationtestID** | **kotlin.Int**|  | |

### Return type

[**NotificationtestGetElementsV2Response**](NotificationtestGetElementsV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


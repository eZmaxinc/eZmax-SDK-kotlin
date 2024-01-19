# ObjectDiscussionmessageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discussionmessageCreateObjectV1**](ObjectDiscussionmessageApi.md#discussionmessageCreateObjectV1) | **POST** /1/object/discussionmessage | Create a new Discussionmessage
[**discussionmessageDeleteObjectV1**](ObjectDiscussionmessageApi.md#discussionmessageDeleteObjectV1) | **DELETE** /1/object/discussionmessage/{pkiDiscussionmessageID} | Delete an existing Discussionmessage
[**discussionmessagePatchObjectV1**](ObjectDiscussionmessageApi.md#discussionmessagePatchObjectV1) | **PATCH** /1/object/discussionmessage/{pkiDiscussionmessageID} | Patch an existing Discussionmessage


<a id="discussionmessageCreateObjectV1"></a>
# **discussionmessageCreateObjectV1**
> DiscussionmessageCreateObjectV1Response discussionmessageCreateObjectV1(discussionmessageCreateObjectV1Request)

Create a new Discussionmessage

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDiscussionmessageApi()
val discussionmessageCreateObjectV1Request : DiscussionmessageCreateObjectV1Request =  // DiscussionmessageCreateObjectV1Request | 
try {
    val result : DiscussionmessageCreateObjectV1Response = apiInstance.discussionmessageCreateObjectV1(discussionmessageCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDiscussionmessageApi#discussionmessageCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDiscussionmessageApi#discussionmessageCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionmessageCreateObjectV1Request** | [**DiscussionmessageCreateObjectV1Request**](DiscussionmessageCreateObjectV1Request.md)|  |

### Return type

[**DiscussionmessageCreateObjectV1Response**](DiscussionmessageCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="discussionmessageDeleteObjectV1"></a>
# **discussionmessageDeleteObjectV1**
> DiscussionmessageDeleteObjectV1Response discussionmessageDeleteObjectV1(pkiDiscussionmessageID)

Delete an existing Discussionmessage



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDiscussionmessageApi()
val pkiDiscussionmessageID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Discussionmessage
try {
    val result : DiscussionmessageDeleteObjectV1Response = apiInstance.discussionmessageDeleteObjectV1(pkiDiscussionmessageID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDiscussionmessageApi#discussionmessageDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDiscussionmessageApi#discussionmessageDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionmessageID** | **kotlin.Int**| The unique ID of the Discussionmessage |

### Return type

[**DiscussionmessageDeleteObjectV1Response**](DiscussionmessageDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="discussionmessagePatchObjectV1"></a>
# **discussionmessagePatchObjectV1**
> DiscussionmessagePatchObjectV1Response discussionmessagePatchObjectV1(pkiDiscussionmessageID, discussionmessagePatchObjectV1Request)

Patch an existing Discussionmessage



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDiscussionmessageApi()
val pkiDiscussionmessageID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Discussionmessage
val discussionmessagePatchObjectV1Request : DiscussionmessagePatchObjectV1Request =  // DiscussionmessagePatchObjectV1Request | 
try {
    val result : DiscussionmessagePatchObjectV1Response = apiInstance.discussionmessagePatchObjectV1(pkiDiscussionmessageID, discussionmessagePatchObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDiscussionmessageApi#discussionmessagePatchObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDiscussionmessageApi#discussionmessagePatchObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionmessageID** | **kotlin.Int**| The unique ID of the Discussionmessage |
 **discussionmessagePatchObjectV1Request** | [**DiscussionmessagePatchObjectV1Request**](DiscussionmessagePatchObjectV1Request.md)|  |

### Return type

[**DiscussionmessagePatchObjectV1Response**](DiscussionmessagePatchObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


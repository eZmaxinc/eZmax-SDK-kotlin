# ObjectDiscussionmembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discussionmembershipCreateObjectV1**](ObjectDiscussionmembershipApi.md#discussionmembershipCreateObjectV1) | **POST** /1/object/discussionmembership | Create a new Discussionmembership
[**discussionmembershipDeleteObjectV1**](ObjectDiscussionmembershipApi.md#discussionmembershipDeleteObjectV1) | **DELETE** /1/object/discussionmembership/{pkiDiscussionmembershipID} | Delete an existing Discussionmembership


<a id="discussionmembershipCreateObjectV1"></a>
# **discussionmembershipCreateObjectV1**
> DiscussionmembershipCreateObjectV1Response discussionmembershipCreateObjectV1(discussionmembershipCreateObjectV1Request)

Create a new Discussionmembership

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDiscussionmembershipApi()
val discussionmembershipCreateObjectV1Request : DiscussionmembershipCreateObjectV1Request =  // DiscussionmembershipCreateObjectV1Request | 
try {
    val result : DiscussionmembershipCreateObjectV1Response = apiInstance.discussionmembershipCreateObjectV1(discussionmembershipCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDiscussionmembershipApi#discussionmembershipCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDiscussionmembershipApi#discussionmembershipCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionmembershipCreateObjectV1Request** | [**DiscussionmembershipCreateObjectV1Request**](DiscussionmembershipCreateObjectV1Request.md)|  |

### Return type

[**DiscussionmembershipCreateObjectV1Response**](DiscussionmembershipCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="discussionmembershipDeleteObjectV1"></a>
# **discussionmembershipDeleteObjectV1**
> DiscussionmembershipDeleteObjectV1Response discussionmembershipDeleteObjectV1(pkiDiscussionmembershipID)

Delete an existing Discussionmembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDiscussionmembershipApi()
val pkiDiscussionmembershipID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Discussionmembership
try {
    val result : DiscussionmembershipDeleteObjectV1Response = apiInstance.discussionmembershipDeleteObjectV1(pkiDiscussionmembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDiscussionmembershipApi#discussionmembershipDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDiscussionmembershipApi#discussionmembershipDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionmembershipID** | **kotlin.Int**| The unique ID of the Discussionmembership |

### Return type

[**DiscussionmembershipDeleteObjectV1Response**](DiscussionmembershipDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


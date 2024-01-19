# ObjectDiscussionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discussionCreateObjectV1**](ObjectDiscussionApi.md#discussionCreateObjectV1) | **POST** /1/object/discussion | Create a new Discussion
[**discussionDeleteObjectV1**](ObjectDiscussionApi.md#discussionDeleteObjectV1) | **DELETE** /1/object/discussion/{pkiDiscussionID} | Delete an existing Discussion
[**discussionGetObjectV2**](ObjectDiscussionApi.md#discussionGetObjectV2) | **GET** /2/object/discussion/{pkiDiscussionID} | Retrieve an existing Discussion
[**discussionPatchObjectV1**](ObjectDiscussionApi.md#discussionPatchObjectV1) | **PATCH** /1/object/discussion/{pkiDiscussionID} | Patch an existing Discussion
[**discussionUpdateDiscussionreadstatusV1**](ObjectDiscussionApi.md#discussionUpdateDiscussionreadstatusV1) | **POST** /1/object/discussion/{pkiDiscussionID}/updateDiscussionreadstatus | Update the read status of the discussion


<a id="discussionCreateObjectV1"></a>
# **discussionCreateObjectV1**
> DiscussionCreateObjectV1Response discussionCreateObjectV1(discussionCreateObjectV1Request)

Create a new Discussion

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDiscussionApi()
val discussionCreateObjectV1Request : DiscussionCreateObjectV1Request =  // DiscussionCreateObjectV1Request | 
try {
    val result : DiscussionCreateObjectV1Response = apiInstance.discussionCreateObjectV1(discussionCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDiscussionApi#discussionCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDiscussionApi#discussionCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **discussionCreateObjectV1Request** | [**DiscussionCreateObjectV1Request**](DiscussionCreateObjectV1Request.md)|  |

### Return type

[**DiscussionCreateObjectV1Response**](DiscussionCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="discussionDeleteObjectV1"></a>
# **discussionDeleteObjectV1**
> DiscussionDeleteObjectV1Response discussionDeleteObjectV1(pkiDiscussionID)

Delete an existing Discussion



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDiscussionApi()
val pkiDiscussionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Discussion
try {
    val result : DiscussionDeleteObjectV1Response = apiInstance.discussionDeleteObjectV1(pkiDiscussionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDiscussionApi#discussionDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDiscussionApi#discussionDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionID** | **kotlin.Int**| The unique ID of the Discussion |

### Return type

[**DiscussionDeleteObjectV1Response**](DiscussionDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="discussionGetObjectV2"></a>
# **discussionGetObjectV2**
> DiscussionGetObjectV2Response discussionGetObjectV2(pkiDiscussionID)

Retrieve an existing Discussion



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDiscussionApi()
val pkiDiscussionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Discussion
try {
    val result : DiscussionGetObjectV2Response = apiInstance.discussionGetObjectV2(pkiDiscussionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDiscussionApi#discussionGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDiscussionApi#discussionGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionID** | **kotlin.Int**| The unique ID of the Discussion |

### Return type

[**DiscussionGetObjectV2Response**](DiscussionGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="discussionPatchObjectV1"></a>
# **discussionPatchObjectV1**
> DiscussionPatchObjectV1Response discussionPatchObjectV1(pkiDiscussionID, discussionPatchObjectV1Request)

Patch an existing Discussion



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDiscussionApi()
val pkiDiscussionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Discussion
val discussionPatchObjectV1Request : DiscussionPatchObjectV1Request =  // DiscussionPatchObjectV1Request | 
try {
    val result : DiscussionPatchObjectV1Response = apiInstance.discussionPatchObjectV1(pkiDiscussionID, discussionPatchObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDiscussionApi#discussionPatchObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDiscussionApi#discussionPatchObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionID** | **kotlin.Int**| The unique ID of the Discussion |
 **discussionPatchObjectV1Request** | [**DiscussionPatchObjectV1Request**](DiscussionPatchObjectV1Request.md)|  |

### Return type

[**DiscussionPatchObjectV1Response**](DiscussionPatchObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="discussionUpdateDiscussionreadstatusV1"></a>
# **discussionUpdateDiscussionreadstatusV1**
> DiscussionUpdateDiscussionreadstatusV1Response discussionUpdateDiscussionreadstatusV1(pkiDiscussionID, discussionUpdateDiscussionreadstatusV1Request)

Update the read status of the discussion

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDiscussionApi()
val pkiDiscussionID : kotlin.Int = 56 // kotlin.Int | 
val discussionUpdateDiscussionreadstatusV1Request : DiscussionUpdateDiscussionreadstatusV1Request =  // DiscussionUpdateDiscussionreadstatusV1Request | 
try {
    val result : DiscussionUpdateDiscussionreadstatusV1Response = apiInstance.discussionUpdateDiscussionreadstatusV1(pkiDiscussionID, discussionUpdateDiscussionreadstatusV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDiscussionApi#discussionUpdateDiscussionreadstatusV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDiscussionApi#discussionUpdateDiscussionreadstatusV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDiscussionID** | **kotlin.Int**|  |
 **discussionUpdateDiscussionreadstatusV1Request** | [**DiscussionUpdateDiscussionreadstatusV1Request**](DiscussionUpdateDiscussionreadstatusV1Request.md)|  |

### Return type

[**DiscussionUpdateDiscussionreadstatusV1Response**](DiscussionUpdateDiscussionreadstatusV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


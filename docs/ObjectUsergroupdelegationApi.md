# ObjectUsergroupdelegationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**usergroupdelegationCreateObjectV1**](ObjectUsergroupdelegationApi.md#usergroupdelegationCreateObjectV1) | **POST** /1/object/usergroupdelegation | Create a new Usergroupdelegation |
| [**usergroupdelegationDeleteObjectV1**](ObjectUsergroupdelegationApi.md#usergroupdelegationDeleteObjectV1) | **DELETE** /1/object/usergroupdelegation/{pkiUsergroupdelegationID} | Delete an existing Usergroupdelegation |
| [**usergroupdelegationEditObjectV1**](ObjectUsergroupdelegationApi.md#usergroupdelegationEditObjectV1) | **PUT** /1/object/usergroupdelegation/{pkiUsergroupdelegationID} | Edit an existing Usergroupdelegation |
| [**usergroupdelegationGetObjectV2**](ObjectUsergroupdelegationApi.md#usergroupdelegationGetObjectV2) | **GET** /2/object/usergroupdelegation/{pkiUsergroupdelegationID} | Retrieve an existing Usergroupdelegation |


<a id="usergroupdelegationCreateObjectV1"></a>
# **usergroupdelegationCreateObjectV1**
> UsergroupdelegationCreateObjectV1Response usergroupdelegationCreateObjectV1(usergroupdelegationCreateObjectV1Request)

Create a new Usergroupdelegation

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupdelegationApi()
val usergroupdelegationCreateObjectV1Request : UsergroupdelegationCreateObjectV1Request =  // UsergroupdelegationCreateObjectV1Request | 
try {
    val result : UsergroupdelegationCreateObjectV1Response = apiInstance.usergroupdelegationCreateObjectV1(usergroupdelegationCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupdelegationApi#usergroupdelegationCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupdelegationApi#usergroupdelegationCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **usergroupdelegationCreateObjectV1Request** | [**UsergroupdelegationCreateObjectV1Request**](UsergroupdelegationCreateObjectV1Request.md)|  | |

### Return type

[**UsergroupdelegationCreateObjectV1Response**](UsergroupdelegationCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupdelegationDeleteObjectV1"></a>
# **usergroupdelegationDeleteObjectV1**
> UsergroupdelegationDeleteObjectV1Response usergroupdelegationDeleteObjectV1(pkiUsergroupdelegationID)

Delete an existing Usergroupdelegation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupdelegationApi()
val pkiUsergroupdelegationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Usergroupdelegation
try {
    val result : UsergroupdelegationDeleteObjectV1Response = apiInstance.usergroupdelegationDeleteObjectV1(pkiUsergroupdelegationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupdelegationApi#usergroupdelegationDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupdelegationApi#usergroupdelegationDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiUsergroupdelegationID** | **kotlin.Int**| The unique ID of the Usergroupdelegation | |

### Return type

[**UsergroupdelegationDeleteObjectV1Response**](UsergroupdelegationDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupdelegationEditObjectV1"></a>
# **usergroupdelegationEditObjectV1**
> UsergroupdelegationEditObjectV1Response usergroupdelegationEditObjectV1(pkiUsergroupdelegationID, usergroupdelegationEditObjectV1Request)

Edit an existing Usergroupdelegation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupdelegationApi()
val pkiUsergroupdelegationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Usergroupdelegation
val usergroupdelegationEditObjectV1Request : UsergroupdelegationEditObjectV1Request =  // UsergroupdelegationEditObjectV1Request | 
try {
    val result : UsergroupdelegationEditObjectV1Response = apiInstance.usergroupdelegationEditObjectV1(pkiUsergroupdelegationID, usergroupdelegationEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupdelegationApi#usergroupdelegationEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupdelegationApi#usergroupdelegationEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiUsergroupdelegationID** | **kotlin.Int**| The unique ID of the Usergroupdelegation | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **usergroupdelegationEditObjectV1Request** | [**UsergroupdelegationEditObjectV1Request**](UsergroupdelegationEditObjectV1Request.md)|  | |

### Return type

[**UsergroupdelegationEditObjectV1Response**](UsergroupdelegationEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupdelegationGetObjectV2"></a>
# **usergroupdelegationGetObjectV2**
> UsergroupdelegationGetObjectV2Response usergroupdelegationGetObjectV2(pkiUsergroupdelegationID)

Retrieve an existing Usergroupdelegation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupdelegationApi()
val pkiUsergroupdelegationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Usergroupdelegation
try {
    val result : UsergroupdelegationGetObjectV2Response = apiInstance.usergroupdelegationGetObjectV2(pkiUsergroupdelegationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupdelegationApi#usergroupdelegationGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupdelegationApi#usergroupdelegationGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiUsergroupdelegationID** | **kotlin.Int**| The unique ID of the Usergroupdelegation | |

### Return type

[**UsergroupdelegationGetObjectV2Response**](UsergroupdelegationGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


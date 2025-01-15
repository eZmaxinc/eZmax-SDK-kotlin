# ObjectUsergroupmembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**usergroupmembershipCreateObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipCreateObjectV1) | **POST** /1/object/usergroupmembership | Create a new Usergroupmembership |
| [**usergroupmembershipDeleteObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipDeleteObjectV1) | **DELETE** /1/object/usergroupmembership/{pkiUsergroupmembershipID} | Delete an existing Usergroupmembership |
| [**usergroupmembershipEditObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipEditObjectV1) | **PUT** /1/object/usergroupmembership/{pkiUsergroupmembershipID} | Edit an existing Usergroupmembership |
| [**usergroupmembershipGetObjectV2**](ObjectUsergroupmembershipApi.md#usergroupmembershipGetObjectV2) | **GET** /2/object/usergroupmembership/{pkiUsergroupmembershipID} | Retrieve an existing Usergroupmembership |


<a id="usergroupmembershipCreateObjectV1"></a>
# **usergroupmembershipCreateObjectV1**
> UsergroupmembershipCreateObjectV1Response usergroupmembershipCreateObjectV1(usergroupmembershipCreateObjectV1Request)

Create a new Usergroupmembership

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupmembershipApi()
val usergroupmembershipCreateObjectV1Request : UsergroupmembershipCreateObjectV1Request =  // UsergroupmembershipCreateObjectV1Request | 
try {
    val result : UsergroupmembershipCreateObjectV1Response = apiInstance.usergroupmembershipCreateObjectV1(usergroupmembershipCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupmembershipApi#usergroupmembershipCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupmembershipApi#usergroupmembershipCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **usergroupmembershipCreateObjectV1Request** | [**UsergroupmembershipCreateObjectV1Request**](UsergroupmembershipCreateObjectV1Request.md)|  | |

### Return type

[**UsergroupmembershipCreateObjectV1Response**](UsergroupmembershipCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupmembershipDeleteObjectV1"></a>
# **usergroupmembershipDeleteObjectV1**
> CommonResponse usergroupmembershipDeleteObjectV1(pkiUsergroupmembershipID)

Delete an existing Usergroupmembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupmembershipApi()
val pkiUsergroupmembershipID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommonResponse = apiInstance.usergroupmembershipDeleteObjectV1(pkiUsergroupmembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupmembershipApi#usergroupmembershipDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupmembershipApi#usergroupmembershipDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiUsergroupmembershipID** | **kotlin.Int**|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupmembershipEditObjectV1"></a>
# **usergroupmembershipEditObjectV1**
> CommonResponse usergroupmembershipEditObjectV1(pkiUsergroupmembershipID, usergroupmembershipEditObjectV1Request)

Edit an existing Usergroupmembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupmembershipApi()
val pkiUsergroupmembershipID : kotlin.Int = 56 // kotlin.Int | 
val usergroupmembershipEditObjectV1Request : UsergroupmembershipEditObjectV1Request =  // UsergroupmembershipEditObjectV1Request | 
try {
    val result : CommonResponse = apiInstance.usergroupmembershipEditObjectV1(pkiUsergroupmembershipID, usergroupmembershipEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupmembershipApi#usergroupmembershipEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupmembershipApi#usergroupmembershipEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiUsergroupmembershipID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **usergroupmembershipEditObjectV1Request** | [**UsergroupmembershipEditObjectV1Request**](UsergroupmembershipEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupmembershipGetObjectV2"></a>
# **usergroupmembershipGetObjectV2**
> UsergroupmembershipGetObjectV2Response usergroupmembershipGetObjectV2(pkiUsergroupmembershipID)

Retrieve an existing Usergroupmembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupmembershipApi()
val pkiUsergroupmembershipID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupmembershipGetObjectV2Response = apiInstance.usergroupmembershipGetObjectV2(pkiUsergroupmembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupmembershipApi#usergroupmembershipGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupmembershipApi#usergroupmembershipGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiUsergroupmembershipID** | **kotlin.Int**|  | |

### Return type

[**UsergroupmembershipGetObjectV2Response**](UsergroupmembershipGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


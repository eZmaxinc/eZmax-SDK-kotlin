# ObjectUserstagedApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**userstagedCreateUserV1**](ObjectUserstagedApi.md#userstagedCreateUserV1) | **POST** /1/object/userstaged/{pkiUserstagedID}/createUser | Create a User from a Userstaged and then map it |
| [**userstagedDeleteObjectV1**](ObjectUserstagedApi.md#userstagedDeleteObjectV1) | **DELETE** /1/object/userstaged/{pkiUserstagedID} | Delete an existing Userstaged |
| [**userstagedGetListV1**](ObjectUserstagedApi.md#userstagedGetListV1) | **GET** /1/object/userstaged/getList | Retrieve Userstaged list |
| [**userstagedGetObjectV2**](ObjectUserstagedApi.md#userstagedGetObjectV2) | **GET** /2/object/userstaged/{pkiUserstagedID} | Retrieve an existing Userstaged |
| [**userstagedMapV1**](ObjectUserstagedApi.md#userstagedMapV1) | **POST** /1/object/userstaged/{pkiUserstagedID}/map | Map the Userstaged to an existing user |


<a id="userstagedCreateUserV1"></a>
# **userstagedCreateUserV1**
> UserstagedCreateUserV1Response userstagedCreateUserV1(pkiUserstagedID, body)

Create a User from a Userstaged and then map it

Default values will be used while creating the User. If you need to change those values, you should use the route to edit a User.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserstagedApi()
val pkiUserstagedID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : UserstagedCreateUserV1Response = apiInstance.userstagedCreateUserV1(pkiUserstagedID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserstagedApi#userstagedCreateUserV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserstagedApi#userstagedCreateUserV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiUserstagedID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | |

### Return type

[**UserstagedCreateUserV1Response**](UserstagedCreateUserV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="userstagedDeleteObjectV1"></a>
# **userstagedDeleteObjectV1**
> UserstagedDeleteObjectV1Response userstagedDeleteObjectV1(pkiUserstagedID)

Delete an existing Userstaged



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserstagedApi()
val pkiUserstagedID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UserstagedDeleteObjectV1Response = apiInstance.userstagedDeleteObjectV1(pkiUserstagedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserstagedApi#userstagedDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserstagedApi#userstagedDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiUserstagedID** | **kotlin.Int**|  | |

### Return type

[**UserstagedDeleteObjectV1Response**](UserstagedDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userstagedGetListV1"></a>
# **userstagedGetListV1**
> UserstagedGetListV1Response userstagedGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Userstaged list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserstagedApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : UserstagedGetListV1Response = apiInstance.userstagedGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserstagedApi#userstagedGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserstagedApi#userstagedGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiUserstagedID_ASC, pkiUserstagedID_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sUserstagedFirstname_ASC, sUserstagedFirstname_DESC, sUserstagedLastname_ASC, sUserstagedLastname_DESC, sUserstagedExternalid_ASC, sUserstagedExternalid_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**UserstagedGetListV1Response**](UserstagedGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userstagedGetObjectV2"></a>
# **userstagedGetObjectV2**
> UserstagedGetObjectV2Response userstagedGetObjectV2(pkiUserstagedID)

Retrieve an existing Userstaged



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserstagedApi()
val pkiUserstagedID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UserstagedGetObjectV2Response = apiInstance.userstagedGetObjectV2(pkiUserstagedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserstagedApi#userstagedGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserstagedApi#userstagedGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiUserstagedID** | **kotlin.Int**|  | |

### Return type

[**UserstagedGetObjectV2Response**](UserstagedGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userstagedMapV1"></a>
# **userstagedMapV1**
> UserstagedMapV1Response userstagedMapV1(pkiUserstagedID, userstagedMapV1Request)

Map the Userstaged to an existing user



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserstagedApi()
val pkiUserstagedID : kotlin.Int = 56 // kotlin.Int | 
val userstagedMapV1Request : UserstagedMapV1Request =  // UserstagedMapV1Request | 
try {
    val result : UserstagedMapV1Response = apiInstance.userstagedMapV1(pkiUserstagedID, userstagedMapV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserstagedApi#userstagedMapV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserstagedApi#userstagedMapV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiUserstagedID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userstagedMapV1Request** | [**UserstagedMapV1Request**](UserstagedMapV1Request.md)|  | |

### Return type

[**UserstagedMapV1Response**](UserstagedMapV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


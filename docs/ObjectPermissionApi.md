# ObjectPermissionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**permissionCreateObjectV1**](ObjectPermissionApi.md#permissionCreateObjectV1) | **POST** /1/object/permission | Create a new Permission |
| [**permissionDeleteObjectV1**](ObjectPermissionApi.md#permissionDeleteObjectV1) | **DELETE** /1/object/permission/{pkiPermissionID} | Delete an existing Permission |
| [**permissionEditObjectV1**](ObjectPermissionApi.md#permissionEditObjectV1) | **PUT** /1/object/permission/{pkiPermissionID} | Edit an existing Permission |
| [**permissionGetObjectV2**](ObjectPermissionApi.md#permissionGetObjectV2) | **GET** /2/object/permission/{pkiPermissionID} | Retrieve an existing Permission |


<a id="permissionCreateObjectV1"></a>
# **permissionCreateObjectV1**
> PermissionCreateObjectV1Response permissionCreateObjectV1(permissionCreateObjectV1Request)

Create a new Permission

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPermissionApi()
val permissionCreateObjectV1Request : PermissionCreateObjectV1Request =  // PermissionCreateObjectV1Request | 
try {
    val result : PermissionCreateObjectV1Response = apiInstance.permissionCreateObjectV1(permissionCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPermissionApi#permissionCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPermissionApi#permissionCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **permissionCreateObjectV1Request** | [**PermissionCreateObjectV1Request**](PermissionCreateObjectV1Request.md)|  | |

### Return type

[**PermissionCreateObjectV1Response**](PermissionCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="permissionDeleteObjectV1"></a>
# **permissionDeleteObjectV1**
> CommonResponse permissionDeleteObjectV1(pkiPermissionID)

Delete an existing Permission



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPermissionApi()
val pkiPermissionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Permission
try {
    val result : CommonResponse = apiInstance.permissionDeleteObjectV1(pkiPermissionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPermissionApi#permissionDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPermissionApi#permissionDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPermissionID** | **kotlin.Int**| The unique ID of the Permission | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="permissionEditObjectV1"></a>
# **permissionEditObjectV1**
> CommonResponse permissionEditObjectV1(pkiPermissionID, permissionEditObjectV1Request)

Edit an existing Permission



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPermissionApi()
val pkiPermissionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Permission
val permissionEditObjectV1Request : PermissionEditObjectV1Request =  // PermissionEditObjectV1Request | 
try {
    val result : CommonResponse = apiInstance.permissionEditObjectV1(pkiPermissionID, permissionEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPermissionApi#permissionEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPermissionApi#permissionEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiPermissionID** | **kotlin.Int**| The unique ID of the Permission | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **permissionEditObjectV1Request** | [**PermissionEditObjectV1Request**](PermissionEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="permissionGetObjectV2"></a>
# **permissionGetObjectV2**
> PermissionGetObjectV2Response permissionGetObjectV2(pkiPermissionID)

Retrieve an existing Permission



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPermissionApi()
val pkiPermissionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Permission
try {
    val result : PermissionGetObjectV2Response = apiInstance.permissionGetObjectV2(pkiPermissionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPermissionApi#permissionGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPermissionApi#permissionGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPermissionID** | **kotlin.Int**| The unique ID of the Permission | |

### Return type

[**PermissionGetObjectV2Response**](PermissionGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


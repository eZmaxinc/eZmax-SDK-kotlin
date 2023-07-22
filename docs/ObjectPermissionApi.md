# ObjectPermissionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**permissionCreateObjectV1**](ObjectPermissionApi.md#permissionCreateObjectV1) | **POST** /1/object/permission | Create a new Permission
[**permissionDeleteObjectV1**](ObjectPermissionApi.md#permissionDeleteObjectV1) | **DELETE** /1/object/permission/{pkiPermissionID} | Delete an existing Permission
[**permissionEditObjectV1**](ObjectPermissionApi.md#permissionEditObjectV1) | **PUT** /1/object/permission/{pkiPermissionID} | Edit an existing Permission
[**permissionGetObjectV2**](ObjectPermissionApi.md#permissionGetObjectV2) | **GET** /2/object/permission/{pkiPermissionID} | Retrieve an existing Permission


<a id="permissionCreateObjectV1"></a>
# **permissionCreateObjectV1**
> PermissionMinusCreateObjectMinusV1MinusResponse permissionCreateObjectV1(permissionMinusCreateObjectMinusV1MinusRequest)

Create a new Permission

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPermissionApi()
val permissionMinusCreateObjectMinusV1MinusRequest : PermissionMinusCreateObjectMinusV1MinusRequest =  // PermissionMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : PermissionMinusCreateObjectMinusV1MinusResponse = apiInstance.permissionCreateObjectV1(permissionMinusCreateObjectMinusV1MinusRequest)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permissionMinusCreateObjectMinusV1MinusRequest** | [**PermissionMinusCreateObjectMinusV1MinusRequest**](PermissionMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**PermissionMinusCreateObjectMinusV1MinusResponse**](PermissionMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="permissionDeleteObjectV1"></a>
# **permissionDeleteObjectV1**
> PermissionMinusDeleteObjectMinusV1MinusResponse permissionDeleteObjectV1(pkiPermissionID)

Delete an existing Permission



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPermissionApi()
val pkiPermissionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Permission
try {
    val result : PermissionMinusDeleteObjectMinusV1MinusResponse = apiInstance.permissionDeleteObjectV1(pkiPermissionID)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPermissionID** | **kotlin.Int**| The unique ID of the Permission |

### Return type

[**PermissionMinusDeleteObjectMinusV1MinusResponse**](PermissionMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="permissionEditObjectV1"></a>
# **permissionEditObjectV1**
> PermissionMinusEditObjectMinusV1MinusResponse permissionEditObjectV1(pkiPermissionID, permissionMinusEditObjectMinusV1MinusRequest)

Edit an existing Permission



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPermissionApi()
val pkiPermissionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Permission
val permissionMinusEditObjectMinusV1MinusRequest : PermissionMinusEditObjectMinusV1MinusRequest =  // PermissionMinusEditObjectMinusV1MinusRequest | 
try {
    val result : PermissionMinusEditObjectMinusV1MinusResponse = apiInstance.permissionEditObjectV1(pkiPermissionID, permissionMinusEditObjectMinusV1MinusRequest)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPermissionID** | **kotlin.Int**| The unique ID of the Permission |
 **permissionMinusEditObjectMinusV1MinusRequest** | [**PermissionMinusEditObjectMinusV1MinusRequest**](PermissionMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**PermissionMinusEditObjectMinusV1MinusResponse**](PermissionMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="permissionGetObjectV2"></a>
# **permissionGetObjectV2**
> PermissionMinusGetObjectMinusV2MinusResponse permissionGetObjectV2(pkiPermissionID)

Retrieve an existing Permission



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPermissionApi()
val pkiPermissionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Permission
try {
    val result : PermissionMinusGetObjectMinusV2MinusResponse = apiInstance.permissionGetObjectV2(pkiPermissionID)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPermissionID** | **kotlin.Int**| The unique ID of the Permission |

### Return type

[**PermissionMinusGetObjectMinusV2MinusResponse**](PermissionMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


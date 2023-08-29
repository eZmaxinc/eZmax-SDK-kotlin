# ScimUsersApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersCreateObjectScimV2**](ScimUsersApi.md#usersCreateObjectScimV2) | **POST** /2/scim/Users | Create a new User
[**usersDeleteObjectScimV2**](ScimUsersApi.md#usersDeleteObjectScimV2) | **DELETE** /2/scim/Users/{userId} | Delete an existing User
[**usersEditObjectScimV2**](ScimUsersApi.md#usersEditObjectScimV2) | **PUT** /2/scim/Users/{userId} | Edit an existing User
[**usersGetListScimV2**](ScimUsersApi.md#usersGetListScimV2) | **GET** /2/scim/Users | Retrieve User list
[**usersGetObjectScimV2**](ScimUsersApi.md#usersGetObjectScimV2) | **GET** /2/scim/Users/{userId} | Retrieve an existing User


<a id="usersCreateObjectScimV2"></a>
# **usersCreateObjectScimV2**
> ScimUser usersCreateObjectScimV2(scimUser)

Create a new User

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ScimUsersApi()
val scimUser : ScimUser =  // ScimUser | 
try {
    val result : ScimUser = apiInstance.usersCreateObjectScimV2(scimUser)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScimUsersApi#usersCreateObjectScimV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScimUsersApi#usersCreateObjectScimV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scimUser** | [**ScimUser**](ScimUser.md)|  |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization


Configure Bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usersDeleteObjectScimV2"></a>
# **usersDeleteObjectScimV2**
> usersDeleteObjectScimV2(userId)

Delete an existing User

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ScimUsersApi()
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    apiInstance.usersDeleteObjectScimV2(userId)
} catch (e: ClientException) {
    println("4xx response calling ScimUsersApi#usersDeleteObjectScimV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScimUsersApi#usersDeleteObjectScimV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="usersEditObjectScimV2"></a>
# **usersEditObjectScimV2**
> ScimUser usersEditObjectScimV2(userId, scimUser)

Edit an existing User

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ScimUsersApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val scimUser : ScimUser =  // ScimUser | 
try {
    val result : ScimUser = apiInstance.usersEditObjectScimV2(userId, scimUser)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScimUsersApi#usersEditObjectScimV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScimUsersApi#usersEditObjectScimV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**|  |
 **scimUser** | [**ScimUser**](ScimUser.md)|  |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization


Configure Bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usersGetListScimV2"></a>
# **usersGetListScimV2**
> ScimUserList usersGetListScimV2(filter)

Retrieve User list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ScimUsersApi()
val filter : kotlin.String = filter_example // kotlin.String | Filter expression for searching users
try {
    val result : ScimUserList = apiInstance.usersGetListScimV2(filter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScimUsersApi#usersGetListScimV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScimUsersApi#usersGetListScimV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **kotlin.String**| Filter expression for searching users | [optional]

### Return type

[**ScimUserList**](ScimUserList.md)

### Authorization


Configure Bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersGetObjectScimV2"></a>
# **usersGetObjectScimV2**
> ScimUser usersGetObjectScimV2(userId)

Retrieve an existing User

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ScimUsersApi()
val userId : kotlin.String = userId_example // kotlin.String | 
try {
    val result : ScimUser = apiInstance.usersGetObjectScimV2(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScimUsersApi#usersGetObjectScimV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScimUsersApi#usersGetObjectScimV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**|  |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization


Configure Bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


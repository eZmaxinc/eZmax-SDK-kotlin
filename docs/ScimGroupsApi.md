# ScimGroupsApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupsCreateObjectScimV2**](ScimGroupsApi.md#groupsCreateObjectScimV2) | **POST** /2/scim/Groups | Create a new Usergroup
[**groupsDeleteObjectScimV2**](ScimGroupsApi.md#groupsDeleteObjectScimV2) | **DELETE** /2/scim/Groups/{groupId} | Delete an existing Usergroup
[**groupsEditObjectScimV2**](ScimGroupsApi.md#groupsEditObjectScimV2) | **PUT** /2/scim/Groups/{groupId} | Edit an existing Usergroup
[**groupsGetListScimV2**](ScimGroupsApi.md#groupsGetListScimV2) | **GET** /2/scim/Groups | Retrieve Usergroup list
[**groupsGetObjectScimV2**](ScimGroupsApi.md#groupsGetObjectScimV2) | **GET** /2/scim/Groups/{groupId} | Retrieve an existing Usergroup


<a id="groupsCreateObjectScimV2"></a>
# **groupsCreateObjectScimV2**
> ScimGroup groupsCreateObjectScimV2(scimGroup)

Create a new Usergroup

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ScimGroupsApi()
val scimGroup : ScimGroup =  // ScimGroup | 
try {
    val result : ScimGroup = apiInstance.groupsCreateObjectScimV2(scimGroup)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScimGroupsApi#groupsCreateObjectScimV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScimGroupsApi#groupsCreateObjectScimV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scimGroup** | [**ScimGroup**](ScimGroup.md)|  |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization


Configure Bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="groupsDeleteObjectScimV2"></a>
# **groupsDeleteObjectScimV2**
> groupsDeleteObjectScimV2(groupId)

Delete an existing Usergroup

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ScimGroupsApi()
val groupId : kotlin.String = groupId_example // kotlin.String | 
try {
    apiInstance.groupsDeleteObjectScimV2(groupId)
} catch (e: ClientException) {
    println("4xx response calling ScimGroupsApi#groupsDeleteObjectScimV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScimGroupsApi#groupsDeleteObjectScimV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="groupsEditObjectScimV2"></a>
# **groupsEditObjectScimV2**
> ScimGroup groupsEditObjectScimV2(groupId, scimGroup)

Edit an existing Usergroup

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ScimGroupsApi()
val groupId : kotlin.String = groupId_example // kotlin.String | 
val scimGroup : ScimGroup =  // ScimGroup | 
try {
    val result : ScimGroup = apiInstance.groupsEditObjectScimV2(groupId, scimGroup)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScimGroupsApi#groupsEditObjectScimV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScimGroupsApi#groupsEditObjectScimV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**|  |
 **scimGroup** | [**ScimGroup**](ScimGroup.md)|  |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization


Configure Bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="groupsGetListScimV2"></a>
# **groupsGetListScimV2**
> ScimGroup groupsGetListScimV2(filter)

Retrieve Usergroup list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ScimGroupsApi()
val filter : kotlin.String = filter_example // kotlin.String | Filter expression for searching groups
try {
    val result : ScimGroup = apiInstance.groupsGetListScimV2(filter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScimGroupsApi#groupsGetListScimV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScimGroupsApi#groupsGetListScimV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **kotlin.String**| Filter expression for searching groups | [optional]

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization


Configure Bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="groupsGetObjectScimV2"></a>
# **groupsGetObjectScimV2**
> ScimGroup groupsGetObjectScimV2(groupId)

Retrieve an existing Usergroup

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ScimGroupsApi()
val groupId : kotlin.String = groupId_example // kotlin.String | 
try {
    val result : ScimGroup = apiInstance.groupsGetObjectScimV2(groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScimGroupsApi#groupsGetObjectScimV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScimGroupsApi#groupsGetObjectScimV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**|  |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization


Configure Bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


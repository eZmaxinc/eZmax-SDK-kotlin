# ObjectUserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCreateObjectV1**](ObjectUserApi.md#userCreateObjectV1) | **POST** /1/object/user | Create a new User
[**userEditObjectV1**](ObjectUserApi.md#userEditObjectV1) | **PUT** /1/object/user/{pkiUserID} | Edit an existing User
[**userEditPermissionsV1**](ObjectUserApi.md#userEditPermissionsV1) | **PUT** /1/object/user/{pkiUserID}/editPermissions | Edit multiple Permissions
[**userGetApikeysV1**](ObjectUserApi.md#userGetApikeysV1) | **GET** /1/object/user/{pkiUserID}/getApikeys | Retrieve an existing User&#39;s Apikeys
[**userGetAutocompleteV2**](ObjectUserApi.md#userGetAutocompleteV2) | **GET** /2/object/user/getAutocomplete/{sSelector} | Retrieve Users and IDs
[**userGetEffectivePermissionsV1**](ObjectUserApi.md#userGetEffectivePermissionsV1) | **GET** /1/object/user/{pkiUserID}/getEffectivePermissions | Retrieve an existing User&#39;s Effective Permissions
[**userGetListV1**](ObjectUserApi.md#userGetListV1) | **GET** /1/object/user/getList | Retrieve User list
[**userGetObjectV2**](ObjectUserApi.md#userGetObjectV2) | **GET** /2/object/user/{pkiUserID} | Retrieve an existing User
[**userGetPermissionsV1**](ObjectUserApi.md#userGetPermissionsV1) | **GET** /1/object/user/{pkiUserID}/getPermissions | Retrieve an existing User&#39;s Permissions
[**userGetSubnetsV1**](ObjectUserApi.md#userGetSubnetsV1) | **GET** /1/object/user/{pkiUserID}/getSubnets | Retrieve an existing User&#39;s Subnets
[**userSendPasswordResetV1**](ObjectUserApi.md#userSendPasswordResetV1) | **POST** /1/object/user/{pkiUserID}/sendPasswordReset | Send password reset


<a id="userCreateObjectV1"></a>
# **userCreateObjectV1**
> UserCreateObjectV1Response userCreateObjectV1(userCreateObjectV1Request)

Create a new User

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val userCreateObjectV1Request : UserCreateObjectV1Request =  // UserCreateObjectV1Request | 
try {
    val result : UserCreateObjectV1Response = apiInstance.userCreateObjectV1(userCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserApi#userCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserApi#userCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userCreateObjectV1Request** | [**UserCreateObjectV1Request**](UserCreateObjectV1Request.md)|  |

### Return type

[**UserCreateObjectV1Response**](UserCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="userEditObjectV1"></a>
# **userEditObjectV1**
> UserEditObjectV1Response userEditObjectV1(pkiUserID, userEditObjectV1Request)

Edit an existing User



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | The unique ID of the User
val userEditObjectV1Request : UserEditObjectV1Request =  // UserEditObjectV1Request | 
try {
    val result : UserEditObjectV1Response = apiInstance.userEditObjectV1(pkiUserID, userEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserApi#userEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserApi#userEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **kotlin.Int**| The unique ID of the User |
 **userEditObjectV1Request** | [**UserEditObjectV1Request**](UserEditObjectV1Request.md)|  |

### Return type

[**UserEditObjectV1Response**](UserEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="userEditPermissionsV1"></a>
# **userEditPermissionsV1**
> UserEditPermissionsV1Response userEditPermissionsV1(pkiUserID, userEditPermissionsV1Request)

Edit multiple Permissions

Using this endpoint, you can edit multiple Permissions at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
val userEditPermissionsV1Request : UserEditPermissionsV1Request =  // UserEditPermissionsV1Request | 
try {
    val result : UserEditPermissionsV1Response = apiInstance.userEditPermissionsV1(pkiUserID, userEditPermissionsV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserApi#userEditPermissionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserApi#userEditPermissionsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **kotlin.Int**|  |
 **userEditPermissionsV1Request** | [**UserEditPermissionsV1Request**](UserEditPermissionsV1Request.md)|  |

### Return type

[**UserEditPermissionsV1Response**](UserEditPermissionsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="userGetApikeysV1"></a>
# **userGetApikeysV1**
> UserGetApikeysV1Response userGetApikeysV1(pkiUserID)

Retrieve an existing User&#39;s Apikeys

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UserGetApikeysV1Response = apiInstance.userGetApikeysV1(pkiUserID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserApi#userGetApikeysV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserApi#userGetApikeysV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **kotlin.Int**|  |

### Return type

[**UserGetApikeysV1Response**](UserGetApikeysV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userGetAutocompleteV2"></a>
# **userGetAutocompleteV2**
> UserGetAutocompleteV2Response userGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Users and IDs

Get the list of User to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Users to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : UserGetAutocompleteV2Response = apiInstance.userGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserApi#userGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserApi#userGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Users to return | [enum: AgentBrokerEmployeeEzsignUserNormal, AgentBrokerEmployeeNormalBuiltIn, AgentBrokerEzsignuserNormal, ClonableUsers, EzsignuserBuiltIn, Normal, UsergroupDelegated]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**UserGetAutocompleteV2Response**](UserGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userGetEffectivePermissionsV1"></a>
# **userGetEffectivePermissionsV1**
> UserGetEffectivePermissionsV1Response userGetEffectivePermissionsV1(pkiUserID)

Retrieve an existing User&#39;s Effective Permissions

Effective Permissions refers to the combination of Permissions held by a User and the Permissions associated with the Usergroups they belong to.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UserGetEffectivePermissionsV1Response = apiInstance.userGetEffectivePermissionsV1(pkiUserID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserApi#userGetEffectivePermissionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserApi#userGetEffectivePermissionsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **kotlin.Int**|  |

### Return type

[**UserGetEffectivePermissionsV1Response**](UserGetEffectivePermissionsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userGetListV1"></a>
# **userGetListV1**
> UserGetListV1Response userGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve User list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eUserType | AgentBroker&lt;br&gt;Assistant&lt;br&gt;Employee&lt;br&gt;EzsignUser&lt;br&gt;Normal | | eUserOrigin | BuiltIn&lt;br&gt;External | | eUserEzsignaccess | No&lt;br&gt;PaidByOffice&lt;br&gt;PerDocument&lt;br&gt;Prepaid |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : UserGetListV1Response = apiInstance.userGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserApi#userGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserApi#userGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiUserID_ASC, pkiUserID_DESC, sUserFirstname_ASC, sUserFirstname_DESC, sUserLastname_ASC, sUserLastname_DESC, sUserLoginname_ASC, sUserLoginname_DESC, bUserIsactive_ASC, bUserIsactive_DESC, eUserType_ASC, eUserType_DESC, eUserOrigin_ASC, eUserOrigin_DESC, eUserEzsignaccess_ASC, eUserEzsignaccess_DESC, dtUserEzsignprepaidexpiration_ASC, dtUserEzsignprepaidexpiration_DESC, sEmailAddress_ASC, sEmailAddress_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional] [default to 10000]
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**UserGetListV1Response**](UserGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userGetObjectV2"></a>
# **userGetObjectV2**
> UserGetObjectV2Response userGetObjectV2(pkiUserID)

Retrieve an existing User



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | The unique ID of the User
try {
    val result : UserGetObjectV2Response = apiInstance.userGetObjectV2(pkiUserID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserApi#userGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserApi#userGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **kotlin.Int**| The unique ID of the User |

### Return type

[**UserGetObjectV2Response**](UserGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userGetPermissionsV1"></a>
# **userGetPermissionsV1**
> UserGetPermissionsV1Response userGetPermissionsV1(pkiUserID)

Retrieve an existing User&#39;s Permissions

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UserGetPermissionsV1Response = apiInstance.userGetPermissionsV1(pkiUserID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserApi#userGetPermissionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserApi#userGetPermissionsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **kotlin.Int**|  |

### Return type

[**UserGetPermissionsV1Response**](UserGetPermissionsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userGetSubnetsV1"></a>
# **userGetSubnetsV1**
> UserGetSubnetsV1Response userGetSubnetsV1(pkiUserID)

Retrieve an existing User&#39;s Subnets

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UserGetSubnetsV1Response = apiInstance.userGetSubnetsV1(pkiUserID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserApi#userGetSubnetsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserApi#userGetSubnetsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **kotlin.Int**|  |

### Return type

[**UserGetSubnetsV1Response**](UserGetSubnetsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userSendPasswordResetV1"></a>
# **userSendPasswordResetV1**
> UserSendPasswordResetV1Response userSendPasswordResetV1(pkiUserID, body)

Send password reset

Send the password reset email

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : UserSendPasswordResetV1Response = apiInstance.userSendPasswordResetV1(pkiUserID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserApi#userSendPasswordResetV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserApi#userSendPasswordResetV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserID** | **kotlin.Int**|  |
 **body** | **kotlin.Any**|  |

### Return type

[**UserSendPasswordResetV1Response**](UserSendPasswordResetV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


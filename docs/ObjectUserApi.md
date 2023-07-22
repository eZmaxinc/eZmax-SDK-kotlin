# ObjectUserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userCreateObjectV1**](ObjectUserApi.md#userCreateObjectV1) | **POST** /1/object/user | Create a new User
[**userEditObjectV1**](ObjectUserApi.md#userEditObjectV1) | **PUT** /1/object/user/{pkiUserID} | Edit an existing User
[**userEditPermissionsV1**](ObjectUserApi.md#userEditPermissionsV1) | **PUT** /1/object/user/{pkiUserID}/editPermissions | Edit multiple Permissions
[**userGetAutocompleteV2**](ObjectUserApi.md#userGetAutocompleteV2) | **GET** /2/object/user/getAutocomplete/{sSelector} | Retrieve Users and IDs
[**userGetEffectivePermissionsV1**](ObjectUserApi.md#userGetEffectivePermissionsV1) | **GET** /1/object/user/{pkiUserID}/getEffectivePermissions | Retrieve an existing User&#39;s Effective Permissions
[**userGetListV1**](ObjectUserApi.md#userGetListV1) | **GET** /1/object/user/getList | Retrieve User list
[**userGetObjectV2**](ObjectUserApi.md#userGetObjectV2) | **GET** /2/object/user/{pkiUserID} | Retrieve an existing User
[**userGetPermissionsV1**](ObjectUserApi.md#userGetPermissionsV1) | **GET** /1/object/user/{pkiUserID}/getPermissions | Retrieve an existing User&#39;s Permissions
[**userGetSubnetsV1**](ObjectUserApi.md#userGetSubnetsV1) | **GET** /1/object/user/{pkiUserID}/getSubnets | Retrieve an existing User&#39;s Subnets


<a id="userCreateObjectV1"></a>
# **userCreateObjectV1**
> UserMinusCreateObjectMinusV1MinusResponse userCreateObjectV1(userMinusCreateObjectMinusV1MinusRequest)

Create a new User

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val userMinusCreateObjectMinusV1MinusRequest : UserMinusCreateObjectMinusV1MinusRequest =  // UserMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : UserMinusCreateObjectMinusV1MinusResponse = apiInstance.userCreateObjectV1(userMinusCreateObjectMinusV1MinusRequest)
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
 **userMinusCreateObjectMinusV1MinusRequest** | [**UserMinusCreateObjectMinusV1MinusRequest**](UserMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**UserMinusCreateObjectMinusV1MinusResponse**](UserMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="userEditObjectV1"></a>
# **userEditObjectV1**
> UserMinusEditObjectMinusV1MinusResponse userEditObjectV1(pkiUserID, userMinusEditObjectMinusV1MinusRequest)

Edit an existing User



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | The unique ID of the User
val userMinusEditObjectMinusV1MinusRequest : UserMinusEditObjectMinusV1MinusRequest =  // UserMinusEditObjectMinusV1MinusRequest | 
try {
    val result : UserMinusEditObjectMinusV1MinusResponse = apiInstance.userEditObjectV1(pkiUserID, userMinusEditObjectMinusV1MinusRequest)
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
 **userMinusEditObjectMinusV1MinusRequest** | [**UserMinusEditObjectMinusV1MinusRequest**](UserMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**UserMinusEditObjectMinusV1MinusResponse**](UserMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="userEditPermissionsV1"></a>
# **userEditPermissionsV1**
> UserMinusEditPermissionsMinusV1MinusResponse userEditPermissionsV1(pkiUserID, userMinusEditPermissionsMinusV1MinusRequest)

Edit multiple Permissions

Using this endpoint, you can edit multiple Permissions at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
val userMinusEditPermissionsMinusV1MinusRequest : UserMinusEditPermissionsMinusV1MinusRequest =  // UserMinusEditPermissionsMinusV1MinusRequest | 
try {
    val result : UserMinusEditPermissionsMinusV1MinusResponse = apiInstance.userEditPermissionsV1(pkiUserID, userMinusEditPermissionsMinusV1MinusRequest)
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
 **userMinusEditPermissionsMinusV1MinusRequest** | [**UserMinusEditPermissionsMinusV1MinusRequest**](UserMinusEditPermissionsMinusV1MinusRequest.md)|  |

### Return type

[**UserMinusEditPermissionsMinusV1MinusResponse**](UserMinusEditPermissionsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="userGetAutocompleteV2"></a>
# **userGetAutocompleteV2**
> UserMinusGetAutocompleteMinusV2MinusResponse userGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

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
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : UserMinusGetAutocompleteMinusV2MinusResponse = apiInstance.userGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
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
 **sSelector** | **kotlin.String**| The type of Users to return | [enum: All, AgentBrokerEmployeeEzsignUserNormal, AgentBrokerEmployeeNormalBuiltIn, ClonableUsers, EzsignuserBuiltIn, Normal, NormalEzsignSigner]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**UserMinusGetAutocompleteMinusV2MinusResponse**](UserMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userGetEffectivePermissionsV1"></a>
# **userGetEffectivePermissionsV1**
> UserMinusGetEffectivePermissionsMinusV1MinusResponse userGetEffectivePermissionsV1(pkiUserID)

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
    val result : UserMinusGetEffectivePermissionsMinusV1MinusResponse = apiInstance.userGetEffectivePermissionsV1(pkiUserID)
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

[**UserMinusGetEffectivePermissionsMinusV1MinusResponse**](UserMinusGetEffectivePermissionsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userGetListV1"></a>
# **userGetListV1**
> UserMinusGetListMinusV1MinusResponse userGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

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
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : UserMinusGetListMinusV1MinusResponse = apiInstance.userGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
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
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**UserMinusGetListMinusV1MinusResponse**](UserMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userGetObjectV2"></a>
# **userGetObjectV2**
> UserMinusGetObjectMinusV2MinusResponse userGetObjectV2(pkiUserID)

Retrieve an existing User



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | The unique ID of the User
try {
    val result : UserMinusGetObjectMinusV2MinusResponse = apiInstance.userGetObjectV2(pkiUserID)
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

[**UserMinusGetObjectMinusV2MinusResponse**](UserMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userGetPermissionsV1"></a>
# **userGetPermissionsV1**
> UserMinusGetPermissionsMinusV1MinusResponse userGetPermissionsV1(pkiUserID)

Retrieve an existing User&#39;s Permissions

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UserMinusGetPermissionsMinusV1MinusResponse = apiInstance.userGetPermissionsV1(pkiUserID)
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

[**UserMinusGetPermissionsMinusV1MinusResponse**](UserMinusGetPermissionsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userGetSubnetsV1"></a>
# **userGetSubnetsV1**
> UserMinusGetSubnetsMinusV1MinusResponse userGetSubnetsV1(pkiUserID)

Retrieve an existing User&#39;s Subnets

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserApi()
val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UserMinusGetSubnetsMinusV1MinusResponse = apiInstance.userGetSubnetsV1(pkiUserID)
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

[**UserMinusGetSubnetsMinusV1MinusResponse**](UserMinusGetSubnetsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


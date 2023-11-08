# ObjectUsergroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usergroupCreateObjectV1**](ObjectUsergroupApi.md#usergroupCreateObjectV1) | **POST** /1/object/usergroup | Create a new Usergroup
[**usergroupEditObjectV1**](ObjectUsergroupApi.md#usergroupEditObjectV1) | **PUT** /1/object/usergroup/{pkiUsergroupID} | Edit an existing Usergroup
[**usergroupEditPermissionsV1**](ObjectUsergroupApi.md#usergroupEditPermissionsV1) | **PUT** /1/object/usergroup/{pkiUsergroupID}/editPermissions | Edit multiple Permissions
[**usergroupEditUsergroupdelegationsV1**](ObjectUsergroupApi.md#usergroupEditUsergroupdelegationsV1) | **PUT** /1/object/usergroup/{pkiUsergroupID}/editUsergroupdelegations | Edit multiple Usergroupdelegations
[**usergroupEditUsergroupmembershipsV1**](ObjectUsergroupApi.md#usergroupEditUsergroupmembershipsV1) | **PUT** /1/object/usergroup/{pkiUsergroupID}/editUsergroupmemberships | Edit multiple Usergroupmemberships
[**usergroupGetAutocompleteV2**](ObjectUsergroupApi.md#usergroupGetAutocompleteV2) | **GET** /2/object/usergroup/getAutocomplete/{sSelector} | Retrieve Usergroups and IDs
[**usergroupGetListV1**](ObjectUsergroupApi.md#usergroupGetListV1) | **GET** /1/object/usergroup/getList | Retrieve Usergroup list
[**usergroupGetObjectV2**](ObjectUsergroupApi.md#usergroupGetObjectV2) | **GET** /2/object/usergroup/{pkiUsergroupID} | Retrieve an existing Usergroup
[**usergroupGetPermissionsV1**](ObjectUsergroupApi.md#usergroupGetPermissionsV1) | **GET** /1/object/usergroup/{pkiUsergroupID}/getPermissions | Retrieve an existing Usergroup&#39;s Permissions
[**usergroupGetUsergroupdelegationsV1**](ObjectUsergroupApi.md#usergroupGetUsergroupdelegationsV1) | **GET** /1/object/usergroup/{pkiUsergroupID}/getUsergroupdelegations | Retrieve an existing Usergroup&#39;s Usergroupdelegations
[**usergroupGetUsergroupmembershipsV1**](ObjectUsergroupApi.md#usergroupGetUsergroupmembershipsV1) | **GET** /1/object/usergroup/{pkiUsergroupID}/getUsergroupmemberships | Retrieve an existing Usergroup&#39;s Usergroupmemberships


<a id="usergroupCreateObjectV1"></a>
# **usergroupCreateObjectV1**
> UsergroupCreateObjectV1Response usergroupCreateObjectV1(usergroupCreateObjectV1Request)

Create a new Usergroup

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val usergroupCreateObjectV1Request : UsergroupCreateObjectV1Request =  // UsergroupCreateObjectV1Request | 
try {
    val result : UsergroupCreateObjectV1Response = apiInstance.usergroupCreateObjectV1(usergroupCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupApi#usergroupCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupApi#usergroupCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usergroupCreateObjectV1Request** | [**UsergroupCreateObjectV1Request**](UsergroupCreateObjectV1Request.md)|  |

### Return type

[**UsergroupCreateObjectV1Response**](UsergroupCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupEditObjectV1"></a>
# **usergroupEditObjectV1**
> UsergroupEditObjectV1Response usergroupEditObjectV1(pkiUsergroupID, usergroupEditObjectV1Request)

Edit an existing Usergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
val usergroupEditObjectV1Request : UsergroupEditObjectV1Request =  // UsergroupEditObjectV1Request | 
try {
    val result : UsergroupEditObjectV1Response = apiInstance.usergroupEditObjectV1(pkiUsergroupID, usergroupEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupApi#usergroupEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupApi#usergroupEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **kotlin.Int**|  |
 **usergroupEditObjectV1Request** | [**UsergroupEditObjectV1Request**](UsergroupEditObjectV1Request.md)|  |

### Return type

[**UsergroupEditObjectV1Response**](UsergroupEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupEditPermissionsV1"></a>
# **usergroupEditPermissionsV1**
> UsergroupEditPermissionsV1Response usergroupEditPermissionsV1(pkiUsergroupID, usergroupEditPermissionsV1Request)

Edit multiple Permissions

Using this endpoint, you can edit multiple Permissions at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
val usergroupEditPermissionsV1Request : UsergroupEditPermissionsV1Request =  // UsergroupEditPermissionsV1Request | 
try {
    val result : UsergroupEditPermissionsV1Response = apiInstance.usergroupEditPermissionsV1(pkiUsergroupID, usergroupEditPermissionsV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupApi#usergroupEditPermissionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupApi#usergroupEditPermissionsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **kotlin.Int**|  |
 **usergroupEditPermissionsV1Request** | [**UsergroupEditPermissionsV1Request**](UsergroupEditPermissionsV1Request.md)|  |

### Return type

[**UsergroupEditPermissionsV1Response**](UsergroupEditPermissionsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupEditUsergroupdelegationsV1"></a>
# **usergroupEditUsergroupdelegationsV1**
> UsergroupEditUsergroupdelegationsV1Response usergroupEditUsergroupdelegationsV1(pkiUsergroupID, usergroupEditUsergroupdelegationsV1Request)

Edit multiple Usergroupdelegations

Edit multiple Usergroupdelegations

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
val usergroupEditUsergroupdelegationsV1Request : UsergroupEditUsergroupdelegationsV1Request =  // UsergroupEditUsergroupdelegationsV1Request | 
try {
    val result : UsergroupEditUsergroupdelegationsV1Response = apiInstance.usergroupEditUsergroupdelegationsV1(pkiUsergroupID, usergroupEditUsergroupdelegationsV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupApi#usergroupEditUsergroupdelegationsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupApi#usergroupEditUsergroupdelegationsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **kotlin.Int**|  |
 **usergroupEditUsergroupdelegationsV1Request** | [**UsergroupEditUsergroupdelegationsV1Request**](UsergroupEditUsergroupdelegationsV1Request.md)|  |

### Return type

[**UsergroupEditUsergroupdelegationsV1Response**](UsergroupEditUsergroupdelegationsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupEditUsergroupmembershipsV1"></a>
# **usergroupEditUsergroupmembershipsV1**
> UsergroupEditUsergroupmembershipsV1Response usergroupEditUsergroupmembershipsV1(pkiUsergroupID, usergroupEditUsergroupmembershipsV1Request)

Edit multiple Usergroupmemberships

Using this endpoint, you can edit multiple Usergroupmemberships at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
val usergroupEditUsergroupmembershipsV1Request : UsergroupEditUsergroupmembershipsV1Request =  // UsergroupEditUsergroupmembershipsV1Request | 
try {
    val result : UsergroupEditUsergroupmembershipsV1Response = apiInstance.usergroupEditUsergroupmembershipsV1(pkiUsergroupID, usergroupEditUsergroupmembershipsV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupApi#usergroupEditUsergroupmembershipsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupApi#usergroupEditUsergroupmembershipsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **kotlin.Int**|  |
 **usergroupEditUsergroupmembershipsV1Request** | [**UsergroupEditUsergroupmembershipsV1Request**](UsergroupEditUsergroupmembershipsV1Request.md)|  |

### Return type

[**UsergroupEditUsergroupmembershipsV1Response**](UsergroupEditUsergroupmembershipsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupGetAutocompleteV2"></a>
# **usergroupGetAutocompleteV2**
> UsergroupGetAutocompleteV2Response usergroupGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Usergroups and IDs

Get the list of Usergroup to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Usergroups to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : UsergroupGetAutocompleteV2Response = apiInstance.usergroupGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupApi#usergroupGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupApi#usergroupGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Usergroups to return | [enum: All, AllButEveryone]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**UsergroupGetAutocompleteV2Response**](UsergroupGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupGetListV1"></a>
# **usergroupGetListV1**
> UsergroupGetListV1Response usergroupGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Usergroup list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : UsergroupGetListV1Response = apiInstance.usergroupGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupApi#usergroupGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupApi#usergroupGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiUsergroupID_ASC, pkiUsergroupID_DESC, sUsergroupNameX_ASC, sUsergroupNameX_DESC, iCountUser_ASC, iCountUser_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**UsergroupGetListV1Response**](UsergroupGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupGetObjectV2"></a>
# **usergroupGetObjectV2**
> UsergroupGetObjectV2Response usergroupGetObjectV2(pkiUsergroupID)

Retrieve an existing Usergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupGetObjectV2Response = apiInstance.usergroupGetObjectV2(pkiUsergroupID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupApi#usergroupGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupApi#usergroupGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **kotlin.Int**|  |

### Return type

[**UsergroupGetObjectV2Response**](UsergroupGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupGetPermissionsV1"></a>
# **usergroupGetPermissionsV1**
> UsergroupGetPermissionsV1Response usergroupGetPermissionsV1(pkiUsergroupID)

Retrieve an existing Usergroup&#39;s Permissions

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupGetPermissionsV1Response = apiInstance.usergroupGetPermissionsV1(pkiUsergroupID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupApi#usergroupGetPermissionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupApi#usergroupGetPermissionsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **kotlin.Int**|  |

### Return type

[**UsergroupGetPermissionsV1Response**](UsergroupGetPermissionsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupGetUsergroupdelegationsV1"></a>
# **usergroupGetUsergroupdelegationsV1**
> UsergroupGetUsergroupdelegationsV1Response usergroupGetUsergroupdelegationsV1(pkiUsergroupID)

Retrieve an existing Usergroup&#39;s Usergroupdelegations

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupGetUsergroupdelegationsV1Response = apiInstance.usergroupGetUsergroupdelegationsV1(pkiUsergroupID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupApi#usergroupGetUsergroupdelegationsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupApi#usergroupGetUsergroupdelegationsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **kotlin.Int**|  |

### Return type

[**UsergroupGetUsergroupdelegationsV1Response**](UsergroupGetUsergroupdelegationsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupGetUsergroupmembershipsV1"></a>
# **usergroupGetUsergroupmembershipsV1**
> UsergroupGetUsergroupmembershipsV1Response usergroupGetUsergroupmembershipsV1(pkiUsergroupID)

Retrieve an existing Usergroup&#39;s Usergroupmemberships

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupGetUsergroupmembershipsV1Response = apiInstance.usergroupGetUsergroupmembershipsV1(pkiUsergroupID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupApi#usergroupGetUsergroupmembershipsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupApi#usergroupGetUsergroupmembershipsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupID** | **kotlin.Int**|  |

### Return type

[**UsergroupGetUsergroupmembershipsV1Response**](UsergroupGetUsergroupmembershipsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


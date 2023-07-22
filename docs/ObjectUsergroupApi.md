# ObjectUsergroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usergroupCreateObjectV1**](ObjectUsergroupApi.md#usergroupCreateObjectV1) | **POST** /1/object/usergroup | Create a new Usergroup
[**usergroupEditObjectV1**](ObjectUsergroupApi.md#usergroupEditObjectV1) | **PUT** /1/object/usergroup/{pkiUsergroupID} | Edit an existing Usergroup
[**usergroupEditPermissionsV1**](ObjectUsergroupApi.md#usergroupEditPermissionsV1) | **PUT** /1/object/usergroup/{pkiUsergroupID}/editPermissions | Edit multiple Permissions
[**usergroupEditUsergroupmembershipsV1**](ObjectUsergroupApi.md#usergroupEditUsergroupmembershipsV1) | **PUT** /1/object/usergroup/{pkiUsergroupID}/editUsergroupmemberships | Edit multiple Usergroupmemberships
[**usergroupGetAutocompleteV2**](ObjectUsergroupApi.md#usergroupGetAutocompleteV2) | **GET** /2/object/usergroup/getAutocomplete/{sSelector} | Retrieve Usergroups and IDs
[**usergroupGetListV1**](ObjectUsergroupApi.md#usergroupGetListV1) | **GET** /1/object/usergroup/getList | Retrieve Usergroup list
[**usergroupGetObjectV2**](ObjectUsergroupApi.md#usergroupGetObjectV2) | **GET** /2/object/usergroup/{pkiUsergroupID} | Retrieve an existing Usergroup
[**usergroupGetPermissionsV1**](ObjectUsergroupApi.md#usergroupGetPermissionsV1) | **GET** /1/object/usergroup/{pkiUsergroupID}/getPermissions | Retrieve an existing Usergroup&#39;s Permissions
[**usergroupGetUsergroupmembershipsV1**](ObjectUsergroupApi.md#usergroupGetUsergroupmembershipsV1) | **GET** /1/object/usergroup/{pkiUsergroupID}/getUsergroupmemberships | Retrieve an existing Usergroup&#39;s Usergroupmemberships


<a id="usergroupCreateObjectV1"></a>
# **usergroupCreateObjectV1**
> UsergroupMinusCreateObjectMinusV1MinusResponse usergroupCreateObjectV1(usergroupMinusCreateObjectMinusV1MinusRequest)

Create a new Usergroup

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val usergroupMinusCreateObjectMinusV1MinusRequest : UsergroupMinusCreateObjectMinusV1MinusRequest =  // UsergroupMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : UsergroupMinusCreateObjectMinusV1MinusResponse = apiInstance.usergroupCreateObjectV1(usergroupMinusCreateObjectMinusV1MinusRequest)
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
 **usergroupMinusCreateObjectMinusV1MinusRequest** | [**UsergroupMinusCreateObjectMinusV1MinusRequest**](UsergroupMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**UsergroupMinusCreateObjectMinusV1MinusResponse**](UsergroupMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupEditObjectV1"></a>
# **usergroupEditObjectV1**
> UsergroupMinusEditObjectMinusV1MinusResponse usergroupEditObjectV1(pkiUsergroupID, usergroupMinusEditObjectMinusV1MinusRequest)

Edit an existing Usergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
val usergroupMinusEditObjectMinusV1MinusRequest : UsergroupMinusEditObjectMinusV1MinusRequest =  // UsergroupMinusEditObjectMinusV1MinusRequest | 
try {
    val result : UsergroupMinusEditObjectMinusV1MinusResponse = apiInstance.usergroupEditObjectV1(pkiUsergroupID, usergroupMinusEditObjectMinusV1MinusRequest)
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
 **usergroupMinusEditObjectMinusV1MinusRequest** | [**UsergroupMinusEditObjectMinusV1MinusRequest**](UsergroupMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**UsergroupMinusEditObjectMinusV1MinusResponse**](UsergroupMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupEditPermissionsV1"></a>
# **usergroupEditPermissionsV1**
> UsergroupMinusEditPermissionsMinusV1MinusResponse usergroupEditPermissionsV1(pkiUsergroupID, usergroupMinusEditPermissionsMinusV1MinusRequest)

Edit multiple Permissions

Using this endpoint, you can edit multiple Permissions at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
val usergroupMinusEditPermissionsMinusV1MinusRequest : UsergroupMinusEditPermissionsMinusV1MinusRequest =  // UsergroupMinusEditPermissionsMinusV1MinusRequest | 
try {
    val result : UsergroupMinusEditPermissionsMinusV1MinusResponse = apiInstance.usergroupEditPermissionsV1(pkiUsergroupID, usergroupMinusEditPermissionsMinusV1MinusRequest)
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
 **usergroupMinusEditPermissionsMinusV1MinusRequest** | [**UsergroupMinusEditPermissionsMinusV1MinusRequest**](UsergroupMinusEditPermissionsMinusV1MinusRequest.md)|  |

### Return type

[**UsergroupMinusEditPermissionsMinusV1MinusResponse**](UsergroupMinusEditPermissionsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupEditUsergroupmembershipsV1"></a>
# **usergroupEditUsergroupmembershipsV1**
> UsergroupMinusEditUsergroupmembershipsMinusV1MinusResponse usergroupEditUsergroupmembershipsV1(pkiUsergroupID, usergroupMinusEditUsergroupmembershipsMinusV1MinusRequest)

Edit multiple Usergroupmemberships

Using this endpoint, you can edit multiple Usergroupmemberships at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
val usergroupMinusEditUsergroupmembershipsMinusV1MinusRequest : UsergroupMinusEditUsergroupmembershipsMinusV1MinusRequest =  // UsergroupMinusEditUsergroupmembershipsMinusV1MinusRequest | 
try {
    val result : UsergroupMinusEditUsergroupmembershipsMinusV1MinusResponse = apiInstance.usergroupEditUsergroupmembershipsV1(pkiUsergroupID, usergroupMinusEditUsergroupmembershipsMinusV1MinusRequest)
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
 **usergroupMinusEditUsergroupmembershipsMinusV1MinusRequest** | [**UsergroupMinusEditUsergroupmembershipsMinusV1MinusRequest**](UsergroupMinusEditUsergroupmembershipsMinusV1MinusRequest.md)|  |

### Return type

[**UsergroupMinusEditUsergroupmembershipsMinusV1MinusResponse**](UsergroupMinusEditUsergroupmembershipsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupGetAutocompleteV2"></a>
# **usergroupGetAutocompleteV2**
> UsergroupMinusGetAutocompleteMinusV2MinusResponse usergroupGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

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
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : UsergroupMinusGetAutocompleteMinusV2MinusResponse = apiInstance.usergroupGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
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
 **sSelector** | **kotlin.String**| The type of Usergroups to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**UsergroupMinusGetAutocompleteMinusV2MinusResponse**](UsergroupMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupGetListV1"></a>
# **usergroupGetListV1**
> UsergroupMinusGetListMinusV1MinusResponse usergroupGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

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
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : UsergroupMinusGetListMinusV1MinusResponse = apiInstance.usergroupGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
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
 **iRowMax** | **kotlin.Int**|  | [optional] [default to 10000]
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**UsergroupMinusGetListMinusV1MinusResponse**](UsergroupMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupGetObjectV2"></a>
# **usergroupGetObjectV2**
> UsergroupMinusGetObjectMinusV2MinusResponse usergroupGetObjectV2(pkiUsergroupID)

Retrieve an existing Usergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupMinusGetObjectMinusV2MinusResponse = apiInstance.usergroupGetObjectV2(pkiUsergroupID)
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

[**UsergroupMinusGetObjectMinusV2MinusResponse**](UsergroupMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupGetPermissionsV1"></a>
# **usergroupGetPermissionsV1**
> UsergroupMinusGetPermissionsMinusV1MinusResponse usergroupGetPermissionsV1(pkiUsergroupID)

Retrieve an existing Usergroup&#39;s Permissions

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupMinusGetPermissionsMinusV1MinusResponse = apiInstance.usergroupGetPermissionsV1(pkiUsergroupID)
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

[**UsergroupMinusGetPermissionsMinusV1MinusResponse**](UsergroupMinusGetPermissionsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupGetUsergroupmembershipsV1"></a>
# **usergroupGetUsergroupmembershipsV1**
> UsergroupMinusGetUsergroupmembershipsMinusV1MinusResponse usergroupGetUsergroupmembershipsV1(pkiUsergroupID)

Retrieve an existing Usergroup&#39;s Usergroupmemberships

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupMinusGetUsergroupmembershipsMinusV1MinusResponse = apiInstance.usergroupGetUsergroupmembershipsV1(pkiUsergroupID)
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

[**UsergroupMinusGetUsergroupmembershipsMinusV1MinusResponse**](UsergroupMinusGetUsergroupmembershipsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


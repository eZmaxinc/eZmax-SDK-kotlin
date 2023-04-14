# ObjectUsergroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usergroupCreateObjectV1**](ObjectUsergroupApi.md#usergroupCreateObjectV1) | **POST** /1/object/usergroup | Create a new Usergroup
[**usergroupEditObjectV1**](ObjectUsergroupApi.md#usergroupEditObjectV1) | **PUT** /1/object/usergroup/{pkiUsergroupID} | Edit an existing Usergroup
[**usergroupGetAutocompleteV2**](ObjectUsergroupApi.md#usergroupGetAutocompleteV2) | **GET** /2/object/usergroup/getAutocomplete/{sSelector} | Retrieve Usergroups and IDs
[**usergroupGetListV1**](ObjectUsergroupApi.md#usergroupGetListV1) | **GET** /1/object/usergroup/getList | Retrieve Usergroup list
[**usergroupGetObjectV2**](ObjectUsergroupApi.md#usergroupGetObjectV2) | **GET** /2/object/usergroup/{pkiUsergroupID} | Retrieve an existing Usergroup


<a name="usergroupCreateObjectV1"></a>
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

<a name="usergroupEditObjectV1"></a>
# **usergroupEditObjectV1**
> UsergroupMinusEditObjectMinusV1MinusResponse usergroupEditObjectV1(pkiUsergroupID, usergroupMinusEditObjectMinusV1MinusRequest)

Edit an existing Usergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Usergroup
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
 **pkiUsergroupID** | **kotlin.Int**| The unique ID of the Usergroup |
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

<a name="usergroupGetAutocompleteV2"></a>
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

<a name="usergroupGetListV1"></a>
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
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiUsergroupID_ASC, pkiUsergroupID_DESC, sUsergroupNameX_ASC, sUsergroupNameX_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional]
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

<a name="usergroupGetObjectV2"></a>
# **usergroupGetObjectV2**
> UsergroupMinusGetObjectMinusV2MinusResponse usergroupGetObjectV2(pkiUsergroupID)

Retrieve an existing Usergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupApi()
val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Usergroup
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
 **pkiUsergroupID** | **kotlin.Int**| The unique ID of the Usergroup |

### Return type

[**UsergroupMinusGetObjectMinusV2MinusResponse**](UsergroupMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


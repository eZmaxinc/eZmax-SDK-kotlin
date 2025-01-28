# ObjectUsergroupexternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**usergroupexternalCreateObjectV1**](ObjectUsergroupexternalApi.md#usergroupexternalCreateObjectV1) | **POST** /1/object/usergroupexternal | Create a new Usergroupexternal |
| [**usergroupexternalDeleteObjectV1**](ObjectUsergroupexternalApi.md#usergroupexternalDeleteObjectV1) | **DELETE** /1/object/usergroupexternal/{pkiUsergroupexternalID} | Delete an existing Usergroupexternal |
| [**usergroupexternalEditObjectV1**](ObjectUsergroupexternalApi.md#usergroupexternalEditObjectV1) | **PUT** /1/object/usergroupexternal/{pkiUsergroupexternalID} | Edit an existing Usergroupexternal |
| [**usergroupexternalGetAutocompleteV2**](ObjectUsergroupexternalApi.md#usergroupexternalGetAutocompleteV2) | **GET** /2/object/usergroupexternal/getAutocomplete/{sSelector} | Retrieve Usergroupexternals and IDs |
| [**usergroupexternalGetListV1**](ObjectUsergroupexternalApi.md#usergroupexternalGetListV1) | **GET** /1/object/usergroupexternal/getList | Retrieve Usergroupexternal list |
| [**usergroupexternalGetObjectV2**](ObjectUsergroupexternalApi.md#usergroupexternalGetObjectV2) | **GET** /2/object/usergroupexternal/{pkiUsergroupexternalID} | Retrieve an existing Usergroupexternal |
| [**usergroupexternalGetUsergroupexternalmembershipsV1**](ObjectUsergroupexternalApi.md#usergroupexternalGetUsergroupexternalmembershipsV1) | **GET** /1/object/usergroupexternal/{pkiUsergroupexternalID}/getUsergroupexternalmemberships | Retrieve an existing Usergroupexternal&#39;s Usergroupexternalmemberships |
| [**usergroupexternalGetUsergroupsV1**](ObjectUsergroupexternalApi.md#usergroupexternalGetUsergroupsV1) | **GET** /1/object/usergroupexternal/{pkiUsergroupexternalID}/getUsergroups | Get Usergroupexternal&#39;s Usergroups |


<a id="usergroupexternalCreateObjectV1"></a>
# **usergroupexternalCreateObjectV1**
> UsergroupexternalCreateObjectV1Response usergroupexternalCreateObjectV1(usergroupexternalCreateObjectV1Request)

Create a new Usergroupexternal

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupexternalApi()
val usergroupexternalCreateObjectV1Request : UsergroupexternalCreateObjectV1Request =  // UsergroupexternalCreateObjectV1Request | 
try {
    val result : UsergroupexternalCreateObjectV1Response = apiInstance.usergroupexternalCreateObjectV1(usergroupexternalCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupexternalApi#usergroupexternalCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupexternalApi#usergroupexternalCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **usergroupexternalCreateObjectV1Request** | [**UsergroupexternalCreateObjectV1Request**](UsergroupexternalCreateObjectV1Request.md)|  | |

### Return type

[**UsergroupexternalCreateObjectV1Response**](UsergroupexternalCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupexternalDeleteObjectV1"></a>
# **usergroupexternalDeleteObjectV1**
> UsergroupexternalDeleteObjectV1Response usergroupexternalDeleteObjectV1(pkiUsergroupexternalID)

Delete an existing Usergroupexternal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupexternalApi()
val pkiUsergroupexternalID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Usergroupexternal
try {
    val result : UsergroupexternalDeleteObjectV1Response = apiInstance.usergroupexternalDeleteObjectV1(pkiUsergroupexternalID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupexternalApi#usergroupexternalDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupexternalApi#usergroupexternalDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiUsergroupexternalID** | **kotlin.Int**| The unique ID of the Usergroupexternal | |

### Return type

[**UsergroupexternalDeleteObjectV1Response**](UsergroupexternalDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupexternalEditObjectV1"></a>
# **usergroupexternalEditObjectV1**
> UsergroupexternalEditObjectV1Response usergroupexternalEditObjectV1(pkiUsergroupexternalID, usergroupexternalEditObjectV1Request)

Edit an existing Usergroupexternal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupexternalApi()
val pkiUsergroupexternalID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Usergroupexternal
val usergroupexternalEditObjectV1Request : UsergroupexternalEditObjectV1Request =  // UsergroupexternalEditObjectV1Request | 
try {
    val result : UsergroupexternalEditObjectV1Response = apiInstance.usergroupexternalEditObjectV1(pkiUsergroupexternalID, usergroupexternalEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupexternalApi#usergroupexternalEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupexternalApi#usergroupexternalEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiUsergroupexternalID** | **kotlin.Int**| The unique ID of the Usergroupexternal | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **usergroupexternalEditObjectV1Request** | [**UsergroupexternalEditObjectV1Request**](UsergroupexternalEditObjectV1Request.md)|  | |

### Return type

[**UsergroupexternalEditObjectV1Response**](UsergroupexternalEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupexternalGetAutocompleteV2"></a>
# **usergroupexternalGetAutocompleteV2**
> UsergroupexternalGetAutocompleteV2Response usergroupexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Usergroupexternals and IDs

Get the list of Usergroupexternal to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupexternalApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Usergroupexternals to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : UsergroupexternalGetAutocompleteV2Response = apiInstance.usergroupexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupexternalApi#usergroupexternalGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupexternalApi#usergroupexternalGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Usergroupexternals to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**UsergroupexternalGetAutocompleteV2Response**](UsergroupexternalGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupexternalGetListV1"></a>
# **usergroupexternalGetListV1**
> UsergroupexternalGetListV1Response usergroupexternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Usergroupexternal list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupexternalApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : UsergroupexternalGetListV1Response = apiInstance.usergroupexternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupexternalApi#usergroupexternalGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupexternalApi#usergroupexternalGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiUsergroupexternalID_ASC, pkiUsergroupexternalID_DESC, sUsergroupexternalName_ASC, sUsergroupexternalName_DESC, sUsergroupexternalID_ASC, sUsergroupexternalID_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**UsergroupexternalGetListV1Response**](UsergroupexternalGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupexternalGetObjectV2"></a>
# **usergroupexternalGetObjectV2**
> UsergroupexternalGetObjectV2Response usergroupexternalGetObjectV2(pkiUsergroupexternalID)

Retrieve an existing Usergroupexternal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupexternalApi()
val pkiUsergroupexternalID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Usergroupexternal
try {
    val result : UsergroupexternalGetObjectV2Response = apiInstance.usergroupexternalGetObjectV2(pkiUsergroupexternalID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupexternalApi#usergroupexternalGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupexternalApi#usergroupexternalGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiUsergroupexternalID** | **kotlin.Int**| The unique ID of the Usergroupexternal | |

### Return type

[**UsergroupexternalGetObjectV2Response**](UsergroupexternalGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupexternalGetUsergroupexternalmembershipsV1"></a>
# **usergroupexternalGetUsergroupexternalmembershipsV1**
> UsergroupexternalGetUsergroupexternalmembershipsV1Response usergroupexternalGetUsergroupexternalmembershipsV1(pkiUsergroupexternalID)

Retrieve an existing Usergroupexternal&#39;s Usergroupexternalmemberships

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupexternalApi()
val pkiUsergroupexternalID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupexternalGetUsergroupexternalmembershipsV1Response = apiInstance.usergroupexternalGetUsergroupexternalmembershipsV1(pkiUsergroupexternalID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupexternalApi#usergroupexternalGetUsergroupexternalmembershipsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupexternalApi#usergroupexternalGetUsergroupexternalmembershipsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiUsergroupexternalID** | **kotlin.Int**|  | |

### Return type

[**UsergroupexternalGetUsergroupexternalmembershipsV1Response**](UsergroupexternalGetUsergroupexternalmembershipsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupexternalGetUsergroupsV1"></a>
# **usergroupexternalGetUsergroupsV1**
> UsergroupexternalGetUsergroupsV1Response usergroupexternalGetUsergroupsV1(pkiUsergroupexternalID)

Get Usergroupexternal&#39;s Usergroups

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupexternalApi()
val pkiUsergroupexternalID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupexternalGetUsergroupsV1Response = apiInstance.usergroupexternalGetUsergroupsV1(pkiUsergroupexternalID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupexternalApi#usergroupexternalGetUsergroupsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupexternalApi#usergroupexternalGetUsergroupsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiUsergroupexternalID** | **kotlin.Int**|  | |

### Return type

[**UsergroupexternalGetUsergroupsV1Response**](UsergroupexternalGetUsergroupsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectAuthenticationexternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**authenticationexternalCreateObjectV1**](ObjectAuthenticationexternalApi.md#authenticationexternalCreateObjectV1) | **POST** /1/object/authenticationexternal | Create a new Authenticationexternal |
| [**authenticationexternalDeleteObjectV1**](ObjectAuthenticationexternalApi.md#authenticationexternalDeleteObjectV1) | **DELETE** /1/object/authenticationexternal/{pkiAuthenticationexternalID} | Delete an existing Authenticationexternal |
| [**authenticationexternalEditObjectV1**](ObjectAuthenticationexternalApi.md#authenticationexternalEditObjectV1) | **PUT** /1/object/authenticationexternal/{pkiAuthenticationexternalID} | Edit an existing Authenticationexternal |
| [**authenticationexternalGetAutocompleteV2**](ObjectAuthenticationexternalApi.md#authenticationexternalGetAutocompleteV2) | **GET** /2/object/authenticationexternal/getAutocomplete/{sSelector} | Retrieve Authenticationexternals and IDs |
| [**authenticationexternalGetListV1**](ObjectAuthenticationexternalApi.md#authenticationexternalGetListV1) | **GET** /1/object/authenticationexternal/getList | Retrieve Authenticationexternal list |
| [**authenticationexternalGetObjectV2**](ObjectAuthenticationexternalApi.md#authenticationexternalGetObjectV2) | **GET** /2/object/authenticationexternal/{pkiAuthenticationexternalID} | Retrieve an existing Authenticationexternal |
| [**authenticationexternalResetAuthorizationV1**](ObjectAuthenticationexternalApi.md#authenticationexternalResetAuthorizationV1) | **POST** /1/object/authenticationexternal/{pkiAuthenticationexternalID}/resetAuthorization | Reset the Authenticationexternal authorization |


<a id="authenticationexternalCreateObjectV1"></a>
# **authenticationexternalCreateObjectV1**
> AuthenticationexternalCreateObjectV1Response authenticationexternalCreateObjectV1(authenticationexternalCreateObjectV1Request)

Create a new Authenticationexternal

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAuthenticationexternalApi()
val authenticationexternalCreateObjectV1Request : AuthenticationexternalCreateObjectV1Request =  // AuthenticationexternalCreateObjectV1Request | 
try {
    val result : AuthenticationexternalCreateObjectV1Response = apiInstance.authenticationexternalCreateObjectV1(authenticationexternalCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAuthenticationexternalApi#authenticationexternalCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAuthenticationexternalApi#authenticationexternalCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **authenticationexternalCreateObjectV1Request** | [**AuthenticationexternalCreateObjectV1Request**](AuthenticationexternalCreateObjectV1Request.md)|  | |

### Return type

[**AuthenticationexternalCreateObjectV1Response**](AuthenticationexternalCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="authenticationexternalDeleteObjectV1"></a>
# **authenticationexternalDeleteObjectV1**
> CommonResponse authenticationexternalDeleteObjectV1(pkiAuthenticationexternalID)

Delete an existing Authenticationexternal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAuthenticationexternalApi()
val pkiAuthenticationexternalID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Authenticationexternal
try {
    val result : CommonResponse = apiInstance.authenticationexternalDeleteObjectV1(pkiAuthenticationexternalID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAuthenticationexternalApi#authenticationexternalDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAuthenticationexternalApi#authenticationexternalDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAuthenticationexternalID** | **kotlin.Int**| The unique ID of the Authenticationexternal | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="authenticationexternalEditObjectV1"></a>
# **authenticationexternalEditObjectV1**
> CommonResponse authenticationexternalEditObjectV1(pkiAuthenticationexternalID, authenticationexternalEditObjectV1Request)

Edit an existing Authenticationexternal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAuthenticationexternalApi()
val pkiAuthenticationexternalID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Authenticationexternal
val authenticationexternalEditObjectV1Request : AuthenticationexternalEditObjectV1Request =  // AuthenticationexternalEditObjectV1Request | 
try {
    val result : CommonResponse = apiInstance.authenticationexternalEditObjectV1(pkiAuthenticationexternalID, authenticationexternalEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAuthenticationexternalApi#authenticationexternalEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAuthenticationexternalApi#authenticationexternalEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiAuthenticationexternalID** | **kotlin.Int**| The unique ID of the Authenticationexternal | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **authenticationexternalEditObjectV1Request** | [**AuthenticationexternalEditObjectV1Request**](AuthenticationexternalEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="authenticationexternalGetAutocompleteV2"></a>
# **authenticationexternalGetAutocompleteV2**
> AuthenticationexternalGetAutocompleteV2Response authenticationexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Authenticationexternals and IDs

Get the list of Authenticationexternal to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAuthenticationexternalApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Authenticationexternals to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : AuthenticationexternalGetAutocompleteV2Response = apiInstance.authenticationexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAuthenticationexternalApi#authenticationexternalGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAuthenticationexternalApi#authenticationexternalGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Authenticationexternals to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**AuthenticationexternalGetAutocompleteV2Response**](AuthenticationexternalGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="authenticationexternalGetListV1"></a>
# **authenticationexternalGetListV1**
> AuthenticationexternalGetListV1Response authenticationexternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Authenticationexternal list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eAuthenticationexternalType | Salesforce&lt;br&gt;SalesforceSandbox |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAuthenticationexternalApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : AuthenticationexternalGetListV1Response = apiInstance.authenticationexternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAuthenticationexternalApi#authenticationexternalGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAuthenticationexternalApi#authenticationexternalGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiAuthenticationexternalID_ASC, pkiAuthenticationexternalID_DESC, sAuthenticationexternalDescription_ASC, sAuthenticationexternalDescription_DESC, eAuthenticationexternalType_ASC, eAuthenticationexternalType_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**AuthenticationexternalGetListV1Response**](AuthenticationexternalGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="authenticationexternalGetObjectV2"></a>
# **authenticationexternalGetObjectV2**
> AuthenticationexternalGetObjectV2Response authenticationexternalGetObjectV2(pkiAuthenticationexternalID)

Retrieve an existing Authenticationexternal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAuthenticationexternalApi()
val pkiAuthenticationexternalID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Authenticationexternal
try {
    val result : AuthenticationexternalGetObjectV2Response = apiInstance.authenticationexternalGetObjectV2(pkiAuthenticationexternalID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAuthenticationexternalApi#authenticationexternalGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAuthenticationexternalApi#authenticationexternalGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiAuthenticationexternalID** | **kotlin.Int**| The unique ID of the Authenticationexternal | |

### Return type

[**AuthenticationexternalGetObjectV2Response**](AuthenticationexternalGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="authenticationexternalResetAuthorizationV1"></a>
# **authenticationexternalResetAuthorizationV1**
> CommonResponse authenticationexternalResetAuthorizationV1(pkiAuthenticationexternalID, body)

Reset the Authenticationexternal authorization



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAuthenticationexternalApi()
val pkiAuthenticationexternalID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : CommonResponse = apiInstance.authenticationexternalResetAuthorizationV1(pkiAuthenticationexternalID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAuthenticationexternalApi#authenticationexternalResetAuthorizationV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAuthenticationexternalApi#authenticationexternalResetAuthorizationV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiAuthenticationexternalID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


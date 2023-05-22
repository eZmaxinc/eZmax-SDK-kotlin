# ObjectUserstagedApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userstagedDeleteObjectV1**](ObjectUserstagedApi.md#userstagedDeleteObjectV1) | **DELETE** /1/object/userstaged/{pkiUserstagedID} | Delete an existing Userstaged
[**userstagedGetListV1**](ObjectUserstagedApi.md#userstagedGetListV1) | **GET** /1/object/userstaged/getList | Retrieve Userstaged list
[**userstagedGetObjectV2**](ObjectUserstagedApi.md#userstagedGetObjectV2) | **GET** /2/object/userstaged/{pkiUserstagedID} | Retrieve an existing Userstaged
[**userstagedMapV1**](ObjectUserstagedApi.md#userstagedMapV1) | **POST** /1/object/userstaged/{pkiUserstagedID}/map | Map the Userstaged to an existing user


<a id="userstagedDeleteObjectV1"></a>
# **userstagedDeleteObjectV1**
> UserstagedMinusDeleteObjectMinusV1MinusResponse userstagedDeleteObjectV1(pkiUserstagedID)

Delete an existing Userstaged



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserstagedApi()
val pkiUserstagedID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Userstaged
try {
    val result : UserstagedMinusDeleteObjectMinusV1MinusResponse = apiInstance.userstagedDeleteObjectV1(pkiUserstagedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserstagedApi#userstagedDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserstagedApi#userstagedDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserstagedID** | **kotlin.Int**| The unique ID of the Userstaged |

### Return type

[**UserstagedMinusDeleteObjectMinusV1MinusResponse**](UserstagedMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userstagedGetListV1"></a>
# **userstagedGetListV1**
> UserstagedMinusGetListMinusV1MinusResponse userstagedGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Userstaged list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserstagedApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : UserstagedMinusGetListMinusV1MinusResponse = apiInstance.userstagedGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserstagedApi#userstagedGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserstagedApi#userstagedGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiUserstagedID_ASC, pkiUserstagedID_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sUserstagedFirstname_ASC, sUserstagedFirstname_DESC, sUserstagedLastname_ASC, sUserstagedLastname_DESC, sUserstagedExternalid_ASC, sUserstagedExternalid_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional] [default to 10000]
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**UserstagedMinusGetListMinusV1MinusResponse**](UserstagedMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userstagedGetObjectV2"></a>
# **userstagedGetObjectV2**
> UserstagedMinusGetObjectMinusV2MinusResponse userstagedGetObjectV2(pkiUserstagedID)

Retrieve an existing Userstaged



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserstagedApi()
val pkiUserstagedID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Userstaged
try {
    val result : UserstagedMinusGetObjectMinusV2MinusResponse = apiInstance.userstagedGetObjectV2(pkiUserstagedID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserstagedApi#userstagedGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserstagedApi#userstagedGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserstagedID** | **kotlin.Int**| The unique ID of the Userstaged |

### Return type

[**UserstagedMinusGetObjectMinusV2MinusResponse**](UserstagedMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="userstagedMapV1"></a>
# **userstagedMapV1**
> UserstagedMinusMapMinusV1MinusResponse userstagedMapV1(pkiUserstagedID, userstagedMinusMapMinusV1MinusRequest)

Map the Userstaged to an existing user



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUserstagedApi()
val pkiUserstagedID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Userstaged
val userstagedMinusMapMinusV1MinusRequest : UserstagedMinusMapMinusV1MinusRequest =  // UserstagedMinusMapMinusV1MinusRequest | 
try {
    val result : UserstagedMinusMapMinusV1MinusResponse = apiInstance.userstagedMapV1(pkiUserstagedID, userstagedMinusMapMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUserstagedApi#userstagedMapV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUserstagedApi#userstagedMapV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUserstagedID** | **kotlin.Int**| The unique ID of the Userstaged |
 **userstagedMinusMapMinusV1MinusRequest** | [**UserstagedMinusMapMinusV1MinusRequest**](UserstagedMinusMapMinusV1MinusRequest.md)|  |

### Return type

[**UserstagedMinusMapMinusV1MinusResponse**](UserstagedMinusMapMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


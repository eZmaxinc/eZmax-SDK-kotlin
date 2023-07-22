# ObjectUsergroupmembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usergroupmembershipCreateObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipCreateObjectV1) | **POST** /1/object/usergroupmembership | Create a new Usergroupmembership
[**usergroupmembershipDeleteObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipDeleteObjectV1) | **DELETE** /1/object/usergroupmembership/{pkiUsergroupmembershipID} | Delete an existing Usergroupmembership
[**usergroupmembershipEditObjectV1**](ObjectUsergroupmembershipApi.md#usergroupmembershipEditObjectV1) | **PUT** /1/object/usergroupmembership/{pkiUsergroupmembershipID} | Edit an existing Usergroupmembership
[**usergroupmembershipGetObjectV2**](ObjectUsergroupmembershipApi.md#usergroupmembershipGetObjectV2) | **GET** /2/object/usergroupmembership/{pkiUsergroupmembershipID} | Retrieve an existing Usergroupmembership


<a id="usergroupmembershipCreateObjectV1"></a>
# **usergroupmembershipCreateObjectV1**
> UsergroupmembershipMinusCreateObjectMinusV1MinusResponse usergroupmembershipCreateObjectV1(usergroupmembershipMinusCreateObjectMinusV1MinusRequest)

Create a new Usergroupmembership

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupmembershipApi()
val usergroupmembershipMinusCreateObjectMinusV1MinusRequest : UsergroupmembershipMinusCreateObjectMinusV1MinusRequest =  // UsergroupmembershipMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : UsergroupmembershipMinusCreateObjectMinusV1MinusResponse = apiInstance.usergroupmembershipCreateObjectV1(usergroupmembershipMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupmembershipApi#usergroupmembershipCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupmembershipApi#usergroupmembershipCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usergroupmembershipMinusCreateObjectMinusV1MinusRequest** | [**UsergroupmembershipMinusCreateObjectMinusV1MinusRequest**](UsergroupmembershipMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**UsergroupmembershipMinusCreateObjectMinusV1MinusResponse**](UsergroupmembershipMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupmembershipDeleteObjectV1"></a>
# **usergroupmembershipDeleteObjectV1**
> UsergroupmembershipMinusDeleteObjectMinusV1MinusResponse usergroupmembershipDeleteObjectV1(pkiUsergroupmembershipID)

Delete an existing Usergroupmembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupmembershipApi()
val pkiUsergroupmembershipID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupmembershipMinusDeleteObjectMinusV1MinusResponse = apiInstance.usergroupmembershipDeleteObjectV1(pkiUsergroupmembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupmembershipApi#usergroupmembershipDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupmembershipApi#usergroupmembershipDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupmembershipID** | **kotlin.Int**|  |

### Return type

[**UsergroupmembershipMinusDeleteObjectMinusV1MinusResponse**](UsergroupmembershipMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usergroupmembershipEditObjectV1"></a>
# **usergroupmembershipEditObjectV1**
> UsergroupmembershipMinusEditObjectMinusV1MinusResponse usergroupmembershipEditObjectV1(pkiUsergroupmembershipID, usergroupmembershipMinusEditObjectMinusV1MinusRequest)

Edit an existing Usergroupmembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupmembershipApi()
val pkiUsergroupmembershipID : kotlin.Int = 56 // kotlin.Int | 
val usergroupmembershipMinusEditObjectMinusV1MinusRequest : UsergroupmembershipMinusEditObjectMinusV1MinusRequest =  // UsergroupmembershipMinusEditObjectMinusV1MinusRequest | 
try {
    val result : UsergroupmembershipMinusEditObjectMinusV1MinusResponse = apiInstance.usergroupmembershipEditObjectV1(pkiUsergroupmembershipID, usergroupmembershipMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupmembershipApi#usergroupmembershipEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupmembershipApi#usergroupmembershipEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupmembershipID** | **kotlin.Int**|  |
 **usergroupmembershipMinusEditObjectMinusV1MinusRequest** | [**UsergroupmembershipMinusEditObjectMinusV1MinusRequest**](UsergroupmembershipMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**UsergroupmembershipMinusEditObjectMinusV1MinusResponse**](UsergroupmembershipMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usergroupmembershipGetObjectV2"></a>
# **usergroupmembershipGetObjectV2**
> UsergroupmembershipMinusGetObjectMinusV2MinusResponse usergroupmembershipGetObjectV2(pkiUsergroupmembershipID)

Retrieve an existing Usergroupmembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectUsergroupmembershipApi()
val pkiUsergroupmembershipID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : UsergroupmembershipMinusGetObjectMinusV2MinusResponse = apiInstance.usergroupmembershipGetObjectV2(pkiUsergroupmembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectUsergroupmembershipApi#usergroupmembershipGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectUsergroupmembershipApi#usergroupmembershipGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiUsergroupmembershipID** | **kotlin.Int**|  |

### Return type

[**UsergroupmembershipMinusGetObjectMinusV2MinusResponse**](UsergroupmembershipMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


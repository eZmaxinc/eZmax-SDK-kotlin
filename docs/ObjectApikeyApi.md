# ObjectApikeyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apikeyCreateObjectV2**](ObjectApikeyApi.md#apikeyCreateObjectV2) | **POST** /2/object/apikey | Create a new Apikey
[**apikeyEditObjectV1**](ObjectApikeyApi.md#apikeyEditObjectV1) | **PUT** /1/object/apikey/{pkiApikeyID} | Edit an existing Apikey
[**apikeyEditPermissionsV1**](ObjectApikeyApi.md#apikeyEditPermissionsV1) | **PUT** /1/object/apikey/{pkiApikeyID}/editPermissions | Edit multiple Permissions
[**apikeyGetObjectV2**](ObjectApikeyApi.md#apikeyGetObjectV2) | **GET** /2/object/apikey/{pkiApikeyID} | Retrieve an existing Apikey
[**apikeyGetPermissionsV1**](ObjectApikeyApi.md#apikeyGetPermissionsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getPermissions | Retrieve an existing Apikey&#39;s Permissions
[**apikeyGetSubnetsV1**](ObjectApikeyApi.md#apikeyGetSubnetsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getSubnets | Retrieve an existing Apikey&#39;s subnets


<a id="apikeyCreateObjectV2"></a>
# **apikeyCreateObjectV2**
> ApikeyMinusCreateObjectMinusV2MinusResponse apikeyCreateObjectV2(apikeyMinusCreateObjectMinusV2MinusRequest)

Create a new Apikey

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val apikeyMinusCreateObjectMinusV2MinusRequest : ApikeyMinusCreateObjectMinusV2MinusRequest =  // ApikeyMinusCreateObjectMinusV2MinusRequest | 
try {
    val result : ApikeyMinusCreateObjectMinusV2MinusResponse = apiInstance.apikeyCreateObjectV2(apikeyMinusCreateObjectMinusV2MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyCreateObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyCreateObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikeyMinusCreateObjectMinusV2MinusRequest** | [**ApikeyMinusCreateObjectMinusV2MinusRequest**](ApikeyMinusCreateObjectMinusV2MinusRequest.md)|  |

### Return type

[**ApikeyMinusCreateObjectMinusV2MinusResponse**](ApikeyMinusCreateObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apikeyEditObjectV1"></a>
# **apikeyEditObjectV1**
> ApikeyMinusEditObjectMinusV1MinusResponse apikeyEditObjectV1(pkiApikeyID, apikeyMinusEditObjectMinusV1MinusRequest)

Edit an existing Apikey



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Apikey
val apikeyMinusEditObjectMinusV1MinusRequest : ApikeyMinusEditObjectMinusV1MinusRequest =  // ApikeyMinusEditObjectMinusV1MinusRequest | 
try {
    val result : ApikeyMinusEditObjectMinusV1MinusResponse = apiInstance.apikeyEditObjectV1(pkiApikeyID, apikeyMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **kotlin.Int**| The unique ID of the Apikey |
 **apikeyMinusEditObjectMinusV1MinusRequest** | [**ApikeyMinusEditObjectMinusV1MinusRequest**](ApikeyMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**ApikeyMinusEditObjectMinusV1MinusResponse**](ApikeyMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apikeyEditPermissionsV1"></a>
# **apikeyEditPermissionsV1**
> ApikeyMinusEditPermissionsMinusV1MinusResponse apikeyEditPermissionsV1(pkiApikeyID, apikeyMinusEditPermissionsMinusV1MinusRequest)

Edit multiple Permissions

Using this endpoint, you can edit multiple Permissions at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | 
val apikeyMinusEditPermissionsMinusV1MinusRequest : ApikeyMinusEditPermissionsMinusV1MinusRequest =  // ApikeyMinusEditPermissionsMinusV1MinusRequest | 
try {
    val result : ApikeyMinusEditPermissionsMinusV1MinusResponse = apiInstance.apikeyEditPermissionsV1(pkiApikeyID, apikeyMinusEditPermissionsMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyEditPermissionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyEditPermissionsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **kotlin.Int**|  |
 **apikeyMinusEditPermissionsMinusV1MinusRequest** | [**ApikeyMinusEditPermissionsMinusV1MinusRequest**](ApikeyMinusEditPermissionsMinusV1MinusRequest.md)|  |

### Return type

[**ApikeyMinusEditPermissionsMinusV1MinusResponse**](ApikeyMinusEditPermissionsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apikeyGetObjectV2"></a>
# **apikeyGetObjectV2**
> ApikeyMinusGetObjectMinusV2MinusResponse apikeyGetObjectV2(pkiApikeyID)

Retrieve an existing Apikey



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Apikey
try {
    val result : ApikeyMinusGetObjectMinusV2MinusResponse = apiInstance.apikeyGetObjectV2(pkiApikeyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **kotlin.Int**| The unique ID of the Apikey |

### Return type

[**ApikeyMinusGetObjectMinusV2MinusResponse**](ApikeyMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apikeyGetPermissionsV1"></a>
# **apikeyGetPermissionsV1**
> ApikeyMinusGetPermissionsMinusV1MinusResponse apikeyGetPermissionsV1(pkiApikeyID)

Retrieve an existing Apikey&#39;s Permissions

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ApikeyMinusGetPermissionsMinusV1MinusResponse = apiInstance.apikeyGetPermissionsV1(pkiApikeyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyGetPermissionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyGetPermissionsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **kotlin.Int**|  |

### Return type

[**ApikeyMinusGetPermissionsMinusV1MinusResponse**](ApikeyMinusGetPermissionsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apikeyGetSubnetsV1"></a>
# **apikeyGetSubnetsV1**
> ApikeyMinusGetSubnetsMinusV1MinusResponse apikeyGetSubnetsV1(pkiApikeyID)

Retrieve an existing Apikey&#39;s subnets

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ApikeyMinusGetSubnetsMinusV1MinusResponse = apiInstance.apikeyGetSubnetsV1(pkiApikeyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyGetSubnetsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyGetSubnetsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiApikeyID** | **kotlin.Int**|  |

### Return type

[**ApikeyMinusGetSubnetsMinusV1MinusResponse**](ApikeyMinusGetSubnetsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


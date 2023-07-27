# ObjectCorsApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**corsCreateObjectV1**](ObjectCorsApi.md#corsCreateObjectV1) | **POST** /1/object/cors | Create a new Cors
[**corsDeleteObjectV1**](ObjectCorsApi.md#corsDeleteObjectV1) | **DELETE** /1/object/cors/{pkiCorsID} | Delete an existing Cors
[**corsEditObjectV1**](ObjectCorsApi.md#corsEditObjectV1) | **PUT** /1/object/cors/{pkiCorsID} | Edit an existing Cors
[**corsGetObjectV2**](ObjectCorsApi.md#corsGetObjectV2) | **GET** /2/object/cors/{pkiCorsID} | Retrieve an existing Cors


<a id="corsCreateObjectV1"></a>
# **corsCreateObjectV1**
> CorsMinusCreateObjectMinusV1MinusResponse corsCreateObjectV1(corsMinusCreateObjectMinusV1MinusRequest)

Create a new Cors

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCorsApi()
val corsMinusCreateObjectMinusV1MinusRequest : CorsMinusCreateObjectMinusV1MinusRequest =  // CorsMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : CorsMinusCreateObjectMinusV1MinusResponse = apiInstance.corsCreateObjectV1(corsMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCorsApi#corsCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCorsApi#corsCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corsMinusCreateObjectMinusV1MinusRequest** | [**CorsMinusCreateObjectMinusV1MinusRequest**](CorsMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**CorsMinusCreateObjectMinusV1MinusResponse**](CorsMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="corsDeleteObjectV1"></a>
# **corsDeleteObjectV1**
> CorsMinusDeleteObjectMinusV1MinusResponse corsDeleteObjectV1(pkiCorsID)

Delete an existing Cors



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCorsApi()
val pkiCorsID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Cors
try {
    val result : CorsMinusDeleteObjectMinusV1MinusResponse = apiInstance.corsDeleteObjectV1(pkiCorsID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCorsApi#corsDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCorsApi#corsDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCorsID** | **kotlin.Int**| The unique ID of the Cors |

### Return type

[**CorsMinusDeleteObjectMinusV1MinusResponse**](CorsMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="corsEditObjectV1"></a>
# **corsEditObjectV1**
> CorsMinusEditObjectMinusV1MinusResponse corsEditObjectV1(pkiCorsID, corsMinusEditObjectMinusV1MinusRequest)

Edit an existing Cors



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCorsApi()
val pkiCorsID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Cors
val corsMinusEditObjectMinusV1MinusRequest : CorsMinusEditObjectMinusV1MinusRequest =  // CorsMinusEditObjectMinusV1MinusRequest | 
try {
    val result : CorsMinusEditObjectMinusV1MinusResponse = apiInstance.corsEditObjectV1(pkiCorsID, corsMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCorsApi#corsEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCorsApi#corsEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCorsID** | **kotlin.Int**| The unique ID of the Cors |
 **corsMinusEditObjectMinusV1MinusRequest** | [**CorsMinusEditObjectMinusV1MinusRequest**](CorsMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**CorsMinusEditObjectMinusV1MinusResponse**](CorsMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="corsGetObjectV2"></a>
# **corsGetObjectV2**
> CorsMinusGetObjectMinusV2MinusResponse corsGetObjectV2(pkiCorsID)

Retrieve an existing Cors



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCorsApi()
val pkiCorsID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Cors
try {
    val result : CorsMinusGetObjectMinusV2MinusResponse = apiInstance.corsGetObjectV2(pkiCorsID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCorsApi#corsGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCorsApi#corsGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCorsID** | **kotlin.Int**| The unique ID of the Cors |

### Return type

[**CorsMinusGetObjectMinusV2MinusResponse**](CorsMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


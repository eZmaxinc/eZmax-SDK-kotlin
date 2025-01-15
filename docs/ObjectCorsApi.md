# ObjectCorsApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**corsCreateObjectV1**](ObjectCorsApi.md#corsCreateObjectV1) | **POST** /1/object/cors | Create a new Cors |
| [**corsDeleteObjectV1**](ObjectCorsApi.md#corsDeleteObjectV1) | **DELETE** /1/object/cors/{pkiCorsID} | Delete an existing Cors |
| [**corsEditObjectV1**](ObjectCorsApi.md#corsEditObjectV1) | **PUT** /1/object/cors/{pkiCorsID} | Edit an existing Cors |
| [**corsGetObjectV2**](ObjectCorsApi.md#corsGetObjectV2) | **GET** /2/object/cors/{pkiCorsID} | Retrieve an existing Cors |


<a id="corsCreateObjectV1"></a>
# **corsCreateObjectV1**
> CorsCreateObjectV1Response corsCreateObjectV1(corsCreateObjectV1Request)

Create a new Cors

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCorsApi()
val corsCreateObjectV1Request : CorsCreateObjectV1Request =  // CorsCreateObjectV1Request | 
try {
    val result : CorsCreateObjectV1Response = apiInstance.corsCreateObjectV1(corsCreateObjectV1Request)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **corsCreateObjectV1Request** | [**CorsCreateObjectV1Request**](CorsCreateObjectV1Request.md)|  | |

### Return type

[**CorsCreateObjectV1Response**](CorsCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="corsDeleteObjectV1"></a>
# **corsDeleteObjectV1**
> CommonResponse corsDeleteObjectV1(pkiCorsID)

Delete an existing Cors



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCorsApi()
val pkiCorsID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Cors
try {
    val result : CommonResponse = apiInstance.corsDeleteObjectV1(pkiCorsID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCorsID** | **kotlin.Int**| The unique ID of the Cors | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="corsEditObjectV1"></a>
# **corsEditObjectV1**
> CommonResponse corsEditObjectV1(pkiCorsID, corsEditObjectV1Request)

Edit an existing Cors



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCorsApi()
val pkiCorsID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Cors
val corsEditObjectV1Request : CorsEditObjectV1Request =  // CorsEditObjectV1Request | 
try {
    val result : CommonResponse = apiInstance.corsEditObjectV1(pkiCorsID, corsEditObjectV1Request)
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
| **pkiCorsID** | **kotlin.Int**| The unique ID of the Cors | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **corsEditObjectV1Request** | [**CorsEditObjectV1Request**](CorsEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="corsGetObjectV2"></a>
# **corsGetObjectV2**
> CorsGetObjectV2Response corsGetObjectV2(pkiCorsID)

Retrieve an existing Cors



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCorsApi()
val pkiCorsID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Cors
try {
    val result : CorsGetObjectV2Response = apiInstance.corsGetObjectV2(pkiCorsID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCorsID** | **kotlin.Int**| The unique ID of the Cors | |

### Return type

[**CorsGetObjectV2Response**](CorsGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


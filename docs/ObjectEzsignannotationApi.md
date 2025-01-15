# ObjectEzsignannotationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignannotationCreateObjectV1**](ObjectEzsignannotationApi.md#ezsignannotationCreateObjectV1) | **POST** /1/object/ezsignannotation | Create a new Ezsignannotation |
| [**ezsignannotationDeleteObjectV1**](ObjectEzsignannotationApi.md#ezsignannotationDeleteObjectV1) | **DELETE** /1/object/ezsignannotation/{pkiEzsignannotationID} | Delete an existing Ezsignannotation |
| [**ezsignannotationEditObjectV1**](ObjectEzsignannotationApi.md#ezsignannotationEditObjectV1) | **PUT** /1/object/ezsignannotation/{pkiEzsignannotationID} | Edit an existing Ezsignannotation |
| [**ezsignannotationGetObjectV2**](ObjectEzsignannotationApi.md#ezsignannotationGetObjectV2) | **GET** /2/object/ezsignannotation/{pkiEzsignannotationID} | Retrieve an existing Ezsignannotation |


<a id="ezsignannotationCreateObjectV1"></a>
# **ezsignannotationCreateObjectV1**
> EzsignannotationCreateObjectV1Response ezsignannotationCreateObjectV1(ezsignannotationCreateObjectV1Request)

Create a new Ezsignannotation

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignannotationApi()
val ezsignannotationCreateObjectV1Request : EzsignannotationCreateObjectV1Request =  // EzsignannotationCreateObjectV1Request | 
try {
    val result : EzsignannotationCreateObjectV1Response = apiInstance.ezsignannotationCreateObjectV1(ezsignannotationCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignannotationApi#ezsignannotationCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignannotationApi#ezsignannotationCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignannotationCreateObjectV1Request** | [**EzsignannotationCreateObjectV1Request**](EzsignannotationCreateObjectV1Request.md)|  | |

### Return type

[**EzsignannotationCreateObjectV1Response**](EzsignannotationCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignannotationDeleteObjectV1"></a>
# **ezsignannotationDeleteObjectV1**
> CommonResponse ezsignannotationDeleteObjectV1(pkiEzsignannotationID)

Delete an existing Ezsignannotation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignannotationApi()
val pkiEzsignannotationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommonResponse = apiInstance.ezsignannotationDeleteObjectV1(pkiEzsignannotationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignannotationApi#ezsignannotationDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignannotationApi#ezsignannotationDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignannotationID** | **kotlin.Int**|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignannotationEditObjectV1"></a>
# **ezsignannotationEditObjectV1**
> CommonResponse ezsignannotationEditObjectV1(pkiEzsignannotationID, ezsignannotationEditObjectV1Request)

Edit an existing Ezsignannotation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignannotationApi()
val pkiEzsignannotationID : kotlin.Int = 56 // kotlin.Int | 
val ezsignannotationEditObjectV1Request : EzsignannotationEditObjectV1Request =  // EzsignannotationEditObjectV1Request | 
try {
    val result : CommonResponse = apiInstance.ezsignannotationEditObjectV1(pkiEzsignannotationID, ezsignannotationEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignannotationApi#ezsignannotationEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignannotationApi#ezsignannotationEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsignannotationID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignannotationEditObjectV1Request** | [**EzsignannotationEditObjectV1Request**](EzsignannotationEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignannotationGetObjectV2"></a>
# **ezsignannotationGetObjectV2**
> EzsignannotationGetObjectV2Response ezsignannotationGetObjectV2(pkiEzsignannotationID)

Retrieve an existing Ezsignannotation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignannotationApi()
val pkiEzsignannotationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignannotationGetObjectV2Response = apiInstance.ezsignannotationGetObjectV2(pkiEzsignannotationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignannotationApi#ezsignannotationGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignannotationApi#ezsignannotationGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignannotationID** | **kotlin.Int**|  | |

### Return type

[**EzsignannotationGetObjectV2Response**](EzsignannotationGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


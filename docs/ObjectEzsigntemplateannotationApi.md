# ObjectEzsigntemplateannotationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsigntemplateannotationCreateObjectV1**](ObjectEzsigntemplateannotationApi.md#ezsigntemplateannotationCreateObjectV1) | **POST** /1/object/ezsigntemplateannotation | Create a new Ezsigntemplateannotation |
| [**ezsigntemplateannotationDeleteObjectV1**](ObjectEzsigntemplateannotationApi.md#ezsigntemplateannotationDeleteObjectV1) | **DELETE** /1/object/ezsigntemplateannotation/{pkiEzsigntemplateannotationID} | Delete an existing Ezsigntemplateannotation |
| [**ezsigntemplateannotationEditObjectV1**](ObjectEzsigntemplateannotationApi.md#ezsigntemplateannotationEditObjectV1) | **PUT** /1/object/ezsigntemplateannotation/{pkiEzsigntemplateannotationID} | Edit an existing Ezsigntemplateannotation |
| [**ezsigntemplateannotationGetObjectV2**](ObjectEzsigntemplateannotationApi.md#ezsigntemplateannotationGetObjectV2) | **GET** /2/object/ezsigntemplateannotation/{pkiEzsigntemplateannotationID} | Retrieve an existing Ezsigntemplateannotation |


<a id="ezsigntemplateannotationCreateObjectV1"></a>
# **ezsigntemplateannotationCreateObjectV1**
> EzsigntemplateannotationCreateObjectV1Response ezsigntemplateannotationCreateObjectV1(ezsigntemplateannotationCreateObjectV1Request)

Create a new Ezsigntemplateannotation

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateannotationApi()
val ezsigntemplateannotationCreateObjectV1Request : EzsigntemplateannotationCreateObjectV1Request =  // EzsigntemplateannotationCreateObjectV1Request | 
try {
    val result : EzsigntemplateannotationCreateObjectV1Response = apiInstance.ezsigntemplateannotationCreateObjectV1(ezsigntemplateannotationCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplateannotationCreateObjectV1Request** | [**EzsigntemplateannotationCreateObjectV1Request**](EzsigntemplateannotationCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplateannotationCreateObjectV1Response**](EzsigntemplateannotationCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateannotationDeleteObjectV1"></a>
# **ezsigntemplateannotationDeleteObjectV1**
> EzsigntemplateannotationDeleteObjectV1Response ezsigntemplateannotationDeleteObjectV1(pkiEzsigntemplateannotationID)

Delete an existing Ezsigntemplateannotation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateannotationApi()
val pkiEzsigntemplateannotationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigntemplateannotation
try {
    val result : EzsigntemplateannotationDeleteObjectV1Response = apiInstance.ezsigntemplateannotationDeleteObjectV1(pkiEzsigntemplateannotationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplateannotationID** | **kotlin.Int**| The unique ID of the Ezsigntemplateannotation | |

### Return type

[**EzsigntemplateannotationDeleteObjectV1Response**](EzsigntemplateannotationDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplateannotationEditObjectV1"></a>
# **ezsigntemplateannotationEditObjectV1**
> EzsigntemplateannotationEditObjectV1Response ezsigntemplateannotationEditObjectV1(pkiEzsigntemplateannotationID, ezsigntemplateannotationEditObjectV1Request)

Edit an existing Ezsigntemplateannotation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateannotationApi()
val pkiEzsigntemplateannotationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigntemplateannotation
val ezsigntemplateannotationEditObjectV1Request : EzsigntemplateannotationEditObjectV1Request =  // EzsigntemplateannotationEditObjectV1Request | 
try {
    val result : EzsigntemplateannotationEditObjectV1Response = apiInstance.ezsigntemplateannotationEditObjectV1(pkiEzsigntemplateannotationID, ezsigntemplateannotationEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigntemplateannotationID** | **kotlin.Int**| The unique ID of the Ezsigntemplateannotation | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplateannotationEditObjectV1Request** | [**EzsigntemplateannotationEditObjectV1Request**](EzsigntemplateannotationEditObjectV1Request.md)|  | |

### Return type

[**EzsigntemplateannotationEditObjectV1Response**](EzsigntemplateannotationEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateannotationGetObjectV2"></a>
# **ezsigntemplateannotationGetObjectV2**
> EzsigntemplateannotationGetObjectV2Response ezsigntemplateannotationGetObjectV2(pkiEzsigntemplateannotationID)

Retrieve an existing Ezsigntemplateannotation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateannotationApi()
val pkiEzsigntemplateannotationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigntemplateannotation
try {
    val result : EzsigntemplateannotationGetObjectV2Response = apiInstance.ezsigntemplateannotationGetObjectV2(pkiEzsigntemplateannotationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateannotationApi#ezsigntemplateannotationGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplateannotationID** | **kotlin.Int**| The unique ID of the Ezsigntemplateannotation | |

### Return type

[**EzsigntemplateannotationGetObjectV2Response**](EzsigntemplateannotationGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectEzsigntemplatesignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsigntemplatesignatureCreateObjectV2**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureCreateObjectV2) | **POST** /2/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature |
| [**ezsigntemplatesignatureCreateObjectV3**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureCreateObjectV3) | **POST** /3/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature |
| [**ezsigntemplatesignatureDeleteObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Delete an existing Ezsigntemplatesignature |
| [**ezsigntemplatesignatureEditObjectV3**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureEditObjectV3) | **PUT** /3/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Edit an existing Ezsigntemplatesignature |
| [**ezsigntemplatesignatureGetObjectV4**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureGetObjectV4) | **GET** /4/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Retrieve an existing Ezsigntemplatesignature |


<a id="ezsigntemplatesignatureCreateObjectV2"></a>
# **ezsigntemplatesignatureCreateObjectV2**
> EzsigntemplatesignatureCreateObjectV2Response ezsigntemplatesignatureCreateObjectV2(ezsigntemplatesignatureCreateObjectV2Request)

Create a new Ezsigntemplatesignature

The endpoint allows to create one or many elements at once.  Major step overhaul.  Endpoints that existed before version 1.3 do not allow you to combine forms and signatures in the same step. The step numbers are different from those indicated by endpoints added since version 1.3. This endpoint is compatible with endpoints that existed before 1.3 but are not compatible with those added since 1.3.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val ezsigntemplatesignatureCreateObjectV2Request : EzsigntemplatesignatureCreateObjectV2Request =  // EzsigntemplatesignatureCreateObjectV2Request | 
try {
    val result : EzsigntemplatesignatureCreateObjectV2Response = apiInstance.ezsigntemplatesignatureCreateObjectV2(ezsigntemplatesignatureCreateObjectV2Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureCreateObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureCreateObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatesignatureCreateObjectV2Request** | [**EzsigntemplatesignatureCreateObjectV2Request**](EzsigntemplatesignatureCreateObjectV2Request.md)|  | |

### Return type

[**EzsigntemplatesignatureCreateObjectV2Response**](EzsigntemplatesignatureCreateObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatesignatureCreateObjectV3"></a>
# **ezsigntemplatesignatureCreateObjectV3**
> EzsigntemplatesignatureCreateObjectV3Response ezsigntemplatesignatureCreateObjectV3(ezsigntemplatesignatureCreateObjectV3Request)

Create a new Ezsigntemplatesignature

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val ezsigntemplatesignatureCreateObjectV3Request : EzsigntemplatesignatureCreateObjectV3Request =  // EzsigntemplatesignatureCreateObjectV3Request | 
try {
    val result : EzsigntemplatesignatureCreateObjectV3Response = apiInstance.ezsigntemplatesignatureCreateObjectV3(ezsigntemplatesignatureCreateObjectV3Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureCreateObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureCreateObjectV3")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatesignatureCreateObjectV3Request** | [**EzsigntemplatesignatureCreateObjectV3Request**](EzsigntemplatesignatureCreateObjectV3Request.md)|  | |

### Return type

[**EzsigntemplatesignatureCreateObjectV3Response**](EzsigntemplatesignatureCreateObjectV3Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatesignatureDeleteObjectV1"></a>
# **ezsigntemplatesignatureDeleteObjectV1**
> EzsigntemplatesignatureDeleteObjectV1Response ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID)

Delete an existing Ezsigntemplatesignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val pkiEzsigntemplatesignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatesignatureDeleteObjectV1Response = apiInstance.ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatesignatureID** | **kotlin.Int**|  | |

### Return type

[**EzsigntemplatesignatureDeleteObjectV1Response**](EzsigntemplatesignatureDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatesignatureEditObjectV3"></a>
# **ezsigntemplatesignatureEditObjectV3**
> EzsigntemplatesignatureEditObjectV3Response ezsigntemplatesignatureEditObjectV3(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV3Request)

Edit an existing Ezsigntemplatesignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val pkiEzsigntemplatesignatureID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatesignatureEditObjectV3Request : EzsigntemplatesignatureEditObjectV3Request =  // EzsigntemplatesignatureEditObjectV3Request | 
try {
    val result : EzsigntemplatesignatureEditObjectV3Response = apiInstance.ezsigntemplatesignatureEditObjectV3(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV3Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureEditObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureEditObjectV3")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigntemplatesignatureID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatesignatureEditObjectV3Request** | [**EzsigntemplatesignatureEditObjectV3Request**](EzsigntemplatesignatureEditObjectV3Request.md)|  | |

### Return type

[**EzsigntemplatesignatureEditObjectV3Response**](EzsigntemplatesignatureEditObjectV3Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatesignatureGetObjectV4"></a>
# **ezsigntemplatesignatureGetObjectV4**
> EzsigntemplatesignatureGetObjectV4Response ezsigntemplatesignatureGetObjectV4(pkiEzsigntemplatesignatureID)

Retrieve an existing Ezsigntemplatesignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val pkiEzsigntemplatesignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatesignatureGetObjectV4Response = apiInstance.ezsigntemplatesignatureGetObjectV4(pkiEzsigntemplatesignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureGetObjectV4")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureGetObjectV4")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatesignatureID** | **kotlin.Int**|  | |

### Return type

[**EzsigntemplatesignatureGetObjectV4Response**](EzsigntemplatesignatureGetObjectV4Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


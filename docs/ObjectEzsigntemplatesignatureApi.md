# ObjectEzsigntemplatesignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsigntemplatesignatureCreateObjectV2**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureCreateObjectV2) | **POST** /2/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature |
| [**ezsigntemplatesignatureDeleteObjectV1**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Delete an existing Ezsigntemplatesignature |
| [**ezsigntemplatesignatureEditObjectV2**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureEditObjectV2) | **PUT** /2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Edit an existing Ezsigntemplatesignature |
| [**ezsigntemplatesignatureGetObjectV3**](ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureGetObjectV3) | **GET** /3/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Retrieve an existing Ezsigntemplatesignature |


<a id="ezsigntemplatesignatureCreateObjectV2"></a>
# **ezsigntemplatesignatureCreateObjectV2**
> EzsigntemplatesignatureCreateObjectV2Response ezsigntemplatesignatureCreateObjectV2(ezsigntemplatesignatureCreateObjectV2Request)

Create a new Ezsigntemplatesignature

The endpoint allows to create one or many elements at once.

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

<a id="ezsigntemplatesignatureDeleteObjectV1"></a>
# **ezsigntemplatesignatureDeleteObjectV1**
> CommonResponse ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID)

Delete an existing Ezsigntemplatesignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val pkiEzsigntemplatesignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommonResponse = apiInstance.ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID)
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

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatesignatureEditObjectV2"></a>
# **ezsigntemplatesignatureEditObjectV2**
> CommonResponse ezsigntemplatesignatureEditObjectV2(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV2Request)

Edit an existing Ezsigntemplatesignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val pkiEzsigntemplatesignatureID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatesignatureEditObjectV2Request : EzsigntemplatesignatureEditObjectV2Request =  // EzsigntemplatesignatureEditObjectV2Request | 
try {
    val result : CommonResponse = apiInstance.ezsigntemplatesignatureEditObjectV2(pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV2Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureEditObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureEditObjectV2")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigntemplatesignatureID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatesignatureEditObjectV2Request** | [**EzsigntemplatesignatureEditObjectV2Request**](EzsigntemplatesignatureEditObjectV2Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatesignatureGetObjectV3"></a>
# **ezsigntemplatesignatureGetObjectV3**
> EzsigntemplatesignatureGetObjectV3Response ezsigntemplatesignatureGetObjectV3(pkiEzsigntemplatesignatureID)

Retrieve an existing Ezsigntemplatesignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignatureApi()
val pkiEzsigntemplatesignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatesignatureGetObjectV3Response = apiInstance.ezsigntemplatesignatureGetObjectV3(pkiEzsigntemplatesignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureGetObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignatureApi#ezsigntemplatesignatureGetObjectV3")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatesignatureID** | **kotlin.Int**|  | |

### Return type

[**EzsigntemplatesignatureGetObjectV3Response**](EzsigntemplatesignatureGetObjectV3Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectEzsigntemplatedocumentpagerecognitionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsigntemplatedocumentpagerecognitionCreateObjectV1**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionCreateObjectV1) | **POST** /1/object/ezsigntemplatedocumentpagerecognition | Create a new Ezsigntemplatedocumentpagerecognition |
| [**ezsigntemplatedocumentpagerecognitionDeleteObjectV1**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Delete an existing Ezsigntemplatedocumentpagerecognition |
| [**ezsigntemplatedocumentpagerecognitionEditObjectV1**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionEditObjectV1) | **PUT** /1/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Edit an existing Ezsigntemplatedocumentpagerecognition |
| [**ezsigntemplatedocumentpagerecognitionGetObjectV2**](ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionGetObjectV2) | **GET** /2/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Retrieve an existing Ezsigntemplatedocumentpagerecognition |


<a id="ezsigntemplatedocumentpagerecognitionCreateObjectV1"></a>
# **ezsigntemplatedocumentpagerecognitionCreateObjectV1**
> EzsigntemplatedocumentpagerecognitionCreateObjectV1Response ezsigntemplatedocumentpagerecognitionCreateObjectV1(ezsigntemplatedocumentpagerecognitionCreateObjectV1Request)

Create a new Ezsigntemplatedocumentpagerecognition

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentpagerecognitionApi()
val ezsigntemplatedocumentpagerecognitionCreateObjectV1Request : EzsigntemplatedocumentpagerecognitionCreateObjectV1Request =  // EzsigntemplatedocumentpagerecognitionCreateObjectV1Request | 
try {
    val result : EzsigntemplatedocumentpagerecognitionCreateObjectV1Response = apiInstance.ezsigntemplatedocumentpagerecognitionCreateObjectV1(ezsigntemplatedocumentpagerecognitionCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatedocumentpagerecognitionCreateObjectV1Request** | [**EzsigntemplatedocumentpagerecognitionCreateObjectV1Request**](EzsigntemplatedocumentpagerecognitionCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatedocumentpagerecognitionCreateObjectV1Response**](EzsigntemplatedocumentpagerecognitionCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatedocumentpagerecognitionDeleteObjectV1"></a>
# **ezsigntemplatedocumentpagerecognitionDeleteObjectV1**
> CommonResponse ezsigntemplatedocumentpagerecognitionDeleteObjectV1(pkiEzsigntemplatedocumentpagerecognitionID)

Delete an existing Ezsigntemplatedocumentpagerecognition



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentpagerecognitionApi()
val pkiEzsigntemplatedocumentpagerecognitionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigntemplatedocumentpagerecognition
try {
    val result : CommonResponse = apiInstance.ezsigntemplatedocumentpagerecognitionDeleteObjectV1(pkiEzsigntemplatedocumentpagerecognitionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatedocumentpagerecognitionID** | **kotlin.Int**| The unique ID of the Ezsigntemplatedocumentpagerecognition | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatedocumentpagerecognitionEditObjectV1"></a>
# **ezsigntemplatedocumentpagerecognitionEditObjectV1**
> CommonResponse ezsigntemplatedocumentpagerecognitionEditObjectV1(pkiEzsigntemplatedocumentpagerecognitionID, ezsigntemplatedocumentpagerecognitionEditObjectV1Request)

Edit an existing Ezsigntemplatedocumentpagerecognition



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentpagerecognitionApi()
val pkiEzsigntemplatedocumentpagerecognitionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigntemplatedocumentpagerecognition
val ezsigntemplatedocumentpagerecognitionEditObjectV1Request : EzsigntemplatedocumentpagerecognitionEditObjectV1Request =  // EzsigntemplatedocumentpagerecognitionEditObjectV1Request | 
try {
    val result : CommonResponse = apiInstance.ezsigntemplatedocumentpagerecognitionEditObjectV1(pkiEzsigntemplatedocumentpagerecognitionID, ezsigntemplatedocumentpagerecognitionEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigntemplatedocumentpagerecognitionID** | **kotlin.Int**| The unique ID of the Ezsigntemplatedocumentpagerecognition | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatedocumentpagerecognitionEditObjectV1Request** | [**EzsigntemplatedocumentpagerecognitionEditObjectV1Request**](EzsigntemplatedocumentpagerecognitionEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatedocumentpagerecognitionGetObjectV2"></a>
# **ezsigntemplatedocumentpagerecognitionGetObjectV2**
> EzsigntemplatedocumentpagerecognitionGetObjectV2Response ezsigntemplatedocumentpagerecognitionGetObjectV2(pkiEzsigntemplatedocumentpagerecognitionID)

Retrieve an existing Ezsigntemplatedocumentpagerecognition



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatedocumentpagerecognitionApi()
val pkiEzsigntemplatedocumentpagerecognitionID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsigntemplatedocumentpagerecognition
try {
    val result : EzsigntemplatedocumentpagerecognitionGetObjectV2Response = apiInstance.ezsigntemplatedocumentpagerecognitionGetObjectV2(pkiEzsigntemplatedocumentpagerecognitionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatedocumentpagerecognitionApi#ezsigntemplatedocumentpagerecognitionGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatedocumentpagerecognitionID** | **kotlin.Int**| The unique ID of the Ezsigntemplatedocumentpagerecognition | |

### Return type

[**EzsigntemplatedocumentpagerecognitionGetObjectV2Response**](EzsigntemplatedocumentpagerecognitionGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


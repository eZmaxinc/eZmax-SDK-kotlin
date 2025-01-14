# ObjectEzsignuserApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignuserEditObjectV1**](ObjectEzsignuserApi.md#ezsignuserEditObjectV1) | **PUT** /1/object/ezsignuser/{pkiEzsignuserID} | Edit an existing Ezsignuser |
| [**ezsignuserGetObjectV2**](ObjectEzsignuserApi.md#ezsignuserGetObjectV2) | **GET** /2/object/ezsignuser/{pkiEzsignuserID} | Retrieve an existing Ezsignuser |


<a id="ezsignuserEditObjectV1"></a>
# **ezsignuserEditObjectV1**
> EzsignuserEditObjectV1Response ezsignuserEditObjectV1(pkiEzsignuserID, ezsignuserEditObjectV1Request)

Edit an existing Ezsignuser



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignuserApi()
val pkiEzsignuserID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignuser
val ezsignuserEditObjectV1Request : EzsignuserEditObjectV1Request =  // EzsignuserEditObjectV1Request | 
try {
    val result : EzsignuserEditObjectV1Response = apiInstance.ezsignuserEditObjectV1(pkiEzsignuserID, ezsignuserEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignuserApi#ezsignuserEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignuserApi#ezsignuserEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsignuserID** | **kotlin.Int**| The unique ID of the Ezsignuser | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignuserEditObjectV1Request** | [**EzsignuserEditObjectV1Request**](EzsignuserEditObjectV1Request.md)|  | |

### Return type

[**EzsignuserEditObjectV1Response**](EzsignuserEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignuserGetObjectV2"></a>
# **ezsignuserGetObjectV2**
> EzsignuserGetObjectV2Response ezsignuserGetObjectV2(pkiEzsignuserID)

Retrieve an existing Ezsignuser



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignuserApi()
val pkiEzsignuserID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignuser
try {
    val result : EzsignuserGetObjectV2Response = apiInstance.ezsignuserGetObjectV2(pkiEzsignuserID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignuserApi#ezsignuserGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignuserApi#ezsignuserGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignuserID** | **kotlin.Int**| The unique ID of the Ezsignuser | |

### Return type

[**EzsignuserGetObjectV2Response**](EzsignuserGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


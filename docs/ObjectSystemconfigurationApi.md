# ObjectSystemconfigurationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**systemconfigurationEditObjectV2**](ObjectSystemconfigurationApi.md#systemconfigurationEditObjectV2) | **PUT** /2/object/systemconfiguration/{pkiSystemconfigurationID} | Edit an existing Systemconfiguration |
| [**systemconfigurationGetObjectV2**](ObjectSystemconfigurationApi.md#systemconfigurationGetObjectV2) | **GET** /2/object/systemconfiguration/{pkiSystemconfigurationID} | Retrieve an existing Systemconfiguration |


<a id="systemconfigurationEditObjectV2"></a>
# **systemconfigurationEditObjectV2**
> SystemconfigurationEditObjectV2Response systemconfigurationEditObjectV2(pkiSystemconfigurationID, systemconfigurationEditObjectV2Request)

Edit an existing Systemconfiguration



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSystemconfigurationApi()
val pkiSystemconfigurationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Systemconfiguration
val systemconfigurationEditObjectV2Request : SystemconfigurationEditObjectV2Request =  // SystemconfigurationEditObjectV2Request | 
try {
    val result : SystemconfigurationEditObjectV2Response = apiInstance.systemconfigurationEditObjectV2(pkiSystemconfigurationID, systemconfigurationEditObjectV2Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSystemconfigurationApi#systemconfigurationEditObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSystemconfigurationApi#systemconfigurationEditObjectV2")
    e.printStackTrace()
}
```

### Parameters
| **pkiSystemconfigurationID** | **kotlin.Int**| The unique ID of the Systemconfiguration | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **systemconfigurationEditObjectV2Request** | [**SystemconfigurationEditObjectV2Request**](SystemconfigurationEditObjectV2Request.md)|  | |

### Return type

[**SystemconfigurationEditObjectV2Response**](SystemconfigurationEditObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="systemconfigurationGetObjectV2"></a>
# **systemconfigurationGetObjectV2**
> SystemconfigurationGetObjectV2Response systemconfigurationGetObjectV2(pkiSystemconfigurationID)

Retrieve an existing Systemconfiguration



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSystemconfigurationApi()
val pkiSystemconfigurationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Systemconfiguration
try {
    val result : SystemconfigurationGetObjectV2Response = apiInstance.systemconfigurationGetObjectV2(pkiSystemconfigurationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSystemconfigurationApi#systemconfigurationGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSystemconfigurationApi#systemconfigurationGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSystemconfigurationID** | **kotlin.Int**| The unique ID of the Systemconfiguration | |

### Return type

[**SystemconfigurationGetObjectV2Response**](SystemconfigurationGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


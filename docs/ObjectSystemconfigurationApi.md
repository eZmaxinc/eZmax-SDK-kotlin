# ObjectSystemconfigurationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemconfigurationEditObjectV1**](ObjectSystemconfigurationApi.md#systemconfigurationEditObjectV1) | **PUT** /1/object/systemconfiguration/{pkiSystemconfigurationID} | Edit an existing Systemconfiguration
[**systemconfigurationGetObjectV2**](ObjectSystemconfigurationApi.md#systemconfigurationGetObjectV2) | **GET** /2/object/systemconfiguration/{pkiSystemconfigurationID} | Retrieve an existing Systemconfiguration


<a id="systemconfigurationEditObjectV1"></a>
# **systemconfigurationEditObjectV1**
> SystemconfigurationEditObjectV1Response systemconfigurationEditObjectV1(pkiSystemconfigurationID, systemconfigurationEditObjectV1Request)

Edit an existing Systemconfiguration



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSystemconfigurationApi()
val pkiSystemconfigurationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Systemconfiguration
val systemconfigurationEditObjectV1Request : SystemconfigurationEditObjectV1Request =  // SystemconfigurationEditObjectV1Request | 
try {
    val result : SystemconfigurationEditObjectV1Response = apiInstance.systemconfigurationEditObjectV1(pkiSystemconfigurationID, systemconfigurationEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSystemconfigurationApi#systemconfigurationEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSystemconfigurationApi#systemconfigurationEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSystemconfigurationID** | **kotlin.Int**| The unique ID of the Systemconfiguration |
 **systemconfigurationEditObjectV1Request** | [**SystemconfigurationEditObjectV1Request**](SystemconfigurationEditObjectV1Request.md)|  |

### Return type

[**SystemconfigurationEditObjectV1Response**](SystemconfigurationEditObjectV1Response.md)

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSystemconfigurationID** | **kotlin.Int**| The unique ID of the Systemconfiguration |

### Return type

[**SystemconfigurationGetObjectV2Response**](SystemconfigurationGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


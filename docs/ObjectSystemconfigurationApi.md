# ObjectSystemconfigurationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemconfigurationEditObjectV1**](ObjectSystemconfigurationApi.md#systemconfigurationEditObjectV1) | **PUT** /1/object/systemconfiguration/{pkiSystemconfigurationID} | Edit an existing Systemconfiguration
[**systemconfigurationGetObjectV2**](ObjectSystemconfigurationApi.md#systemconfigurationGetObjectV2) | **GET** /2/object/systemconfiguration/{pkiSystemconfigurationID} | Retrieve an existing Systemconfiguration


<a id="systemconfigurationEditObjectV1"></a>
# **systemconfigurationEditObjectV1**
> SystemconfigurationMinusEditObjectMinusV1MinusResponse systemconfigurationEditObjectV1(pkiSystemconfigurationID, systemconfigurationMinusEditObjectMinusV1MinusRequest)

Edit an existing Systemconfiguration



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSystemconfigurationApi()
val pkiSystemconfigurationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Systemconfiguration
val systemconfigurationMinusEditObjectMinusV1MinusRequest : SystemconfigurationMinusEditObjectMinusV1MinusRequest =  // SystemconfigurationMinusEditObjectMinusV1MinusRequest | 
try {
    val result : SystemconfigurationMinusEditObjectMinusV1MinusResponse = apiInstance.systemconfigurationEditObjectV1(pkiSystemconfigurationID, systemconfigurationMinusEditObjectMinusV1MinusRequest)
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
 **systemconfigurationMinusEditObjectMinusV1MinusRequest** | [**SystemconfigurationMinusEditObjectMinusV1MinusRequest**](SystemconfigurationMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**SystemconfigurationMinusEditObjectMinusV1MinusResponse**](SystemconfigurationMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="systemconfigurationGetObjectV2"></a>
# **systemconfigurationGetObjectV2**
> SystemconfigurationMinusGetObjectMinusV2MinusResponse systemconfigurationGetObjectV2(pkiSystemconfigurationID)

Retrieve an existing Systemconfiguration



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSystemconfigurationApi()
val pkiSystemconfigurationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Systemconfiguration
try {
    val result : SystemconfigurationMinusGetObjectMinusV2MinusResponse = apiInstance.systemconfigurationGetObjectV2(pkiSystemconfigurationID)
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

[**SystemconfigurationMinusGetObjectMinusV2MinusResponse**](SystemconfigurationMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


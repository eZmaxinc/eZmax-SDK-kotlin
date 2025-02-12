# ObjectVersionhistoryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**versionhistoryGetObjectV2**](ObjectVersionhistoryApi.md#versionhistoryGetObjectV2) | **GET** /2/object/versionhistory/{pkiVersionhistoryID} | Retrieve an existing Versionhistory |


<a id="versionhistoryGetObjectV2"></a>
# **versionhistoryGetObjectV2**
> VersionhistoryGetObjectV2Response versionhistoryGetObjectV2(pkiVersionhistoryID)

Retrieve an existing Versionhistory



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectVersionhistoryApi()
val pkiVersionhistoryID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : VersionhistoryGetObjectV2Response = apiInstance.versionhistoryGetObjectV2(pkiVersionhistoryID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectVersionhistoryApi#versionhistoryGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectVersionhistoryApi#versionhistoryGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiVersionhistoryID** | **kotlin.Int**|  | |

### Return type

[**VersionhistoryGetObjectV2Response**](VersionhistoryGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


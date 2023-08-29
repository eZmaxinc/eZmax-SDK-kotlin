# ModuleReportApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportGetReportFromCacheV1**](ModuleReportApi.md#reportGetReportFromCacheV1) | **GET** /1/module/report/getReportFromCache/{sReportgroupCacheID} | Retrieve report from cache


<a id="reportGetReportFromCacheV1"></a>
# **reportGetReportFromCacheV1**
> CommonGetReportV1Response reportGetReportFromCacheV1(sReportgroupCacheID)

Retrieve report from cache

Retrieve a report that was previously generated and cached

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleReportApi()
val sReportgroupCacheID : kotlin.String = sReportgroupCacheID_example // kotlin.String | 
try {
    val result : CommonGetReportV1Response = apiInstance.reportGetReportFromCacheV1(sReportgroupCacheID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModuleReportApi#reportGetReportFromCacheV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleReportApi#reportGetReportFromCacheV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sReportgroupCacheID** | **kotlin.String**|  |

### Return type

[**CommonGetReportV1Response**](CommonGetReportV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Presigned:
    ApiClient.apiKey["sAuthorization"] = ""
    ApiClient.apiKeyPrefix["sAuthorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


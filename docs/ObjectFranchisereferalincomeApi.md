# ObjectFranchisereferalincomeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**franchisereferalincomeCreateObjectV2**](ObjectFranchisereferalincomeApi.md#franchisereferalincomeCreateObjectV2) | **POST** /2/object/franchisereferalincome | Create a new Franchisereferalincome


<a id="franchisereferalincomeCreateObjectV2"></a>
# **franchisereferalincomeCreateObjectV2**
> FranchisereferalincomeCreateObjectV2Response franchisereferalincomeCreateObjectV2(franchisereferalincomeCreateObjectV2Request)

Create a new Franchisereferalincome

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFranchisereferalincomeApi()
val franchisereferalincomeCreateObjectV2Request : FranchisereferalincomeCreateObjectV2Request =  // FranchisereferalincomeCreateObjectV2Request | 
try {
    val result : FranchisereferalincomeCreateObjectV2Response = apiInstance.franchisereferalincomeCreateObjectV2(franchisereferalincomeCreateObjectV2Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFranchisereferalincomeApi#franchisereferalincomeCreateObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFranchisereferalincomeApi#franchisereferalincomeCreateObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **franchisereferalincomeCreateObjectV2Request** | [**FranchisereferalincomeCreateObjectV2Request**](FranchisereferalincomeCreateObjectV2Request.md)|  |

### Return type

[**FranchisereferalincomeCreateObjectV2Response**](FranchisereferalincomeCreateObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


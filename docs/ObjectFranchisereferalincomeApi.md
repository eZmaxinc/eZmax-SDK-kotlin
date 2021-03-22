# ObjectFranchisereferalincomeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**franchisereferalincomeCreateObjectV1**](ObjectFranchisereferalincomeApi.md#franchisereferalincomeCreateObjectV1) | **POST** /1/object/franchisereferalincome | Create a new Franchisereferalincome


<a name="franchisereferalincomeCreateObjectV1"></a>
# **franchisereferalincomeCreateObjectV1**
> FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse franchisereferalincomeCreateObjectV1(franchisereferalincomeMinusCreateObjectMinusV1MinusRequest)

Create a new Franchisereferalincome

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFranchisereferalincomeApi()
val franchisereferalincomeMinusCreateObjectMinusV1MinusRequest : kotlin.collections.List<FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest> =  // kotlin.collections.List<FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest> | 
try {
    val result : FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse = apiInstance.franchisereferalincomeCreateObjectV1(franchisereferalincomeMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectFranchisereferalincomeApi#franchisereferalincomeCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectFranchisereferalincomeApi#franchisereferalincomeCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **franchisereferalincomeMinusCreateObjectMinusV1MinusRequest** | [**kotlin.collections.List&lt;FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest&gt;**](FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse**](FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


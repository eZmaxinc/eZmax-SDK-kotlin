# ObjectFranchisereferalincomeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**franchisereferalincomeCreateObjectV1**](ObjectFranchisereferalincomeApi.md#franchisereferalincomeCreateObjectV1) | **POST** /1/object/franchisereferalincome | Create a new Franchisereferalincome
[**franchisereferalincomeCreateObjectV2**](ObjectFranchisereferalincomeApi.md#franchisereferalincomeCreateObjectV2) | **POST** /2/object/franchisereferalincome | Create a new Franchisereferalincome


<a id="franchisereferalincomeCreateObjectV1"></a>
# **franchisereferalincomeCreateObjectV1**
> FranchisereferalincomeCreateObjectV1Response franchisereferalincomeCreateObjectV1(franchisereferalincomeCreateObjectV1Request)

Create a new Franchisereferalincome

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectFranchisereferalincomeApi()
val franchisereferalincomeCreateObjectV1Request : kotlin.collections.List<FranchisereferalincomeCreateObjectV1Request> =  // kotlin.collections.List<FranchisereferalincomeCreateObjectV1Request> | 
try {
    val result : FranchisereferalincomeCreateObjectV1Response = apiInstance.franchisereferalincomeCreateObjectV1(franchisereferalincomeCreateObjectV1Request)
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
 **franchisereferalincomeCreateObjectV1Request** | [**kotlin.collections.List&lt;FranchisereferalincomeCreateObjectV1Request&gt;**](FranchisereferalincomeCreateObjectV1Request.md)|  |

### Return type

[**FranchisereferalincomeCreateObjectV1Response**](FranchisereferalincomeCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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


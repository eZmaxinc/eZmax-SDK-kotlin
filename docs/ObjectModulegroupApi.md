# ObjectModulegroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modulegroupGetAllV1**](ObjectModulegroupApi.md#modulegroupGetAllV1) | **GET** /1/object/modulegroup/getAll/{eContext} | Retrieve all Modulegroups


<a id="modulegroupGetAllV1"></a>
# **modulegroupGetAllV1**
> ModulegroupMinusGetAllMinusV1MinusResponse modulegroupGetAllV1(eContext)

Retrieve all Modulegroups

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectModulegroupApi()
val eContext : kotlin.String = eContext_example // kotlin.String | The context of the Modulegroup
try {
    val result : ModulegroupMinusGetAllMinusV1MinusResponse = apiInstance.modulegroupGetAllV1(eContext)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectModulegroupApi#modulegroupGetAllV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectModulegroupApi#modulegroupGetAllV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eContext** | **kotlin.String**| The context of the Modulegroup | [enum: Api, User]

### Return type

[**ModulegroupMinusGetAllMinusV1MinusResponse**](ModulegroupMinusGetAllMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


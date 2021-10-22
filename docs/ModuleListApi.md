# ModuleListApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listListpresentationV1**](ModuleListApi.md#listListpresentationV1) | **POST** /1/module/list/listpresentation/{sListName} | Save all Listpresentation for a specific list


<a name="listListpresentationV1"></a>
# **listListpresentationV1**
> ListMinusSaveListpresentationMinusV1MinusResponse listListpresentationV1(sListName, listMinusSaveListpresentationMinusV1MinusRequest)

Save all Listpresentation for a specific list

Users can create many Listpresentations for lists in the system. They can customize orber by, filters, numbers of rows, etc.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ModuleListApi()
val sListName : kotlin.String = sListName_example // kotlin.String | The list Name
val listMinusSaveListpresentationMinusV1MinusRequest : ListMinusSaveListpresentationMinusV1MinusRequest =  // ListMinusSaveListpresentationMinusV1MinusRequest | 
try {
    val result : ListMinusSaveListpresentationMinusV1MinusResponse = apiInstance.listListpresentationV1(sListName, listMinusSaveListpresentationMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModuleListApi#listListpresentationV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModuleListApi#listListpresentationV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sListName** | **kotlin.String**| The list Name |
 **listMinusSaveListpresentationMinusV1MinusRequest** | [**ListMinusSaveListpresentationMinusV1MinusRequest**](ListMinusSaveListpresentationMinusV1MinusRequest.md)|  |

### Return type

[**ListMinusSaveListpresentationMinusV1MinusResponse**](ListMinusSaveListpresentationMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


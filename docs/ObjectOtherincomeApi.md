# ObjectOtherincomeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**otherincomeGetCommunicationListV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationListV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationList | Retrieve Communication list


<a id="otherincomeGetCommunicationListV1"></a>
# **otherincomeGetCommunicationListV1**
> OtherincomeGetCommunicationListV1Response otherincomeGetCommunicationListV1(pkiOtherincomeID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val pkiOtherincomeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OtherincomeGetCommunicationListV1Response = apiInstance.otherincomeGetCommunicationListV1(pkiOtherincomeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiOtherincomeID** | **kotlin.Int**|  |

### Return type

[**OtherincomeGetCommunicationListV1Response**](OtherincomeGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


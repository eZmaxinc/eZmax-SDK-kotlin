# ObjectRejectedoffertopurchaseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rejectedoffertopurchaseGetCommunicationListV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationListV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationList | Retrieve Communication list


<a id="rejectedoffertopurchaseGetCommunicationListV1"></a>
# **rejectedoffertopurchaseGetCommunicationListV1**
> RejectedoffertopurchaseGetCommunicationListV1Response rejectedoffertopurchaseGetCommunicationListV1(pkiRejectedoffertopurchaseID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectRejectedoffertopurchaseApi()
val pkiRejectedoffertopurchaseID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : RejectedoffertopurchaseGetCommunicationListV1Response = apiInstance.rejectedoffertopurchaseGetCommunicationListV1(pkiRejectedoffertopurchaseID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiRejectedoffertopurchaseID** | **kotlin.Int**|  |

### Return type

[**RejectedoffertopurchaseGetCommunicationListV1Response**](RejectedoffertopurchaseGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


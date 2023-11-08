# ObjectBuyercontractApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**buyercontractGetCommunicationListV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationListV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationList | Retrieve Communication list


<a id="buyercontractGetCommunicationListV1"></a>
# **buyercontractGetCommunicationListV1**
> BuyercontractGetCommunicationListV1Response buyercontractGetCommunicationListV1(pkiBuyercontractID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBuyercontractApi()
val pkiBuyercontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BuyercontractGetCommunicationListV1Response = apiInstance.buyercontractGetCommunicationListV1(pkiBuyercontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBuyercontractID** | **kotlin.Int**|  |

### Return type

[**BuyercontractGetCommunicationListV1Response**](BuyercontractGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


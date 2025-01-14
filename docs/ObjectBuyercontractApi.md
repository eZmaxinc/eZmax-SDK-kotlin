# ObjectBuyercontractApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**buyercontractGetCommunicationCountV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationCountV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationCount | Retrieve Communication count |
| [**buyercontractGetCommunicationListV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationListV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationList | Retrieve Communication list |
| [**buyercontractGetCommunicationrecipientsV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationrecipientsV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationrecipients | Retrieve Buyercontract&#39;s Communicationrecipient |
| [**buyercontractGetCommunicationsendersV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationsendersV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationsenders | Retrieve Buyercontract&#39;s Communicationsender |


<a id="buyercontractGetCommunicationCountV1"></a>
# **buyercontractGetCommunicationCountV1**
> BuyercontractGetCommunicationCountV1Response buyercontractGetCommunicationCountV1(pkiBuyercontractID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBuyercontractApi()
val pkiBuyercontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BuyercontractGetCommunicationCountV1Response = apiInstance.buyercontractGetCommunicationCountV1(pkiBuyercontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBuyercontractID** | **kotlin.Int**|  | |

### Return type

[**BuyercontractGetCommunicationCountV1Response**](BuyercontractGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBuyercontractID** | **kotlin.Int**|  | |

### Return type

[**BuyercontractGetCommunicationListV1Response**](BuyercontractGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="buyercontractGetCommunicationrecipientsV1"></a>
# **buyercontractGetCommunicationrecipientsV1**
> BuyercontractGetCommunicationrecipientsV1Response buyercontractGetCommunicationrecipientsV1(pkiBuyercontractID)

Retrieve Buyercontract&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBuyercontractApi()
val pkiBuyercontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BuyercontractGetCommunicationrecipientsV1Response = apiInstance.buyercontractGetCommunicationrecipientsV1(pkiBuyercontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBuyercontractID** | **kotlin.Int**|  | |

### Return type

[**BuyercontractGetCommunicationrecipientsV1Response**](BuyercontractGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="buyercontractGetCommunicationsendersV1"></a>
# **buyercontractGetCommunicationsendersV1**
> BuyercontractGetCommunicationsendersV1Response buyercontractGetCommunicationsendersV1(pkiBuyercontractID)

Retrieve Buyercontract&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBuyercontractApi()
val pkiBuyercontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BuyercontractGetCommunicationsendersV1Response = apiInstance.buyercontractGetCommunicationsendersV1(pkiBuyercontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBuyercontractID** | **kotlin.Int**|  | |

### Return type

[**BuyercontractGetCommunicationsendersV1Response**](BuyercontractGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectRejectedoffertopurchaseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**rejectedoffertopurchaseGetCommunicationCountV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationCountV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationCount | Retrieve Communication count |
| [**rejectedoffertopurchaseGetCommunicationListV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationListV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationList | Retrieve Communication list |
| [**rejectedoffertopurchaseGetCommunicationrecipientsV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationrecipientsV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationrecipients | Retrieve Rejectedoffertopurchase&#39;s Communicationrecipient |
| [**rejectedoffertopurchaseGetCommunicationsendersV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationsendersV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationsenders | Retrieve Rejectedoffertopurchase&#39;s Communicationsender |


<a id="rejectedoffertopurchaseGetCommunicationCountV1"></a>
# **rejectedoffertopurchaseGetCommunicationCountV1**
> RejectedoffertopurchaseGetCommunicationCountV1Response rejectedoffertopurchaseGetCommunicationCountV1(pkiRejectedoffertopurchaseID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectRejectedoffertopurchaseApi()
val pkiRejectedoffertopurchaseID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : RejectedoffertopurchaseGetCommunicationCountV1Response = apiInstance.rejectedoffertopurchaseGetCommunicationCountV1(pkiRejectedoffertopurchaseID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiRejectedoffertopurchaseID** | **kotlin.Int**|  | |

### Return type

[**RejectedoffertopurchaseGetCommunicationCountV1Response**](RejectedoffertopurchaseGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiRejectedoffertopurchaseID** | **kotlin.Int**|  | |

### Return type

[**RejectedoffertopurchaseGetCommunicationListV1Response**](RejectedoffertopurchaseGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rejectedoffertopurchaseGetCommunicationrecipientsV1"></a>
# **rejectedoffertopurchaseGetCommunicationrecipientsV1**
> RejectedoffertopurchaseGetCommunicationrecipientsV1Response rejectedoffertopurchaseGetCommunicationrecipientsV1(pkiRejectedoffertopurchaseID)

Retrieve Rejectedoffertopurchase&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectRejectedoffertopurchaseApi()
val pkiRejectedoffertopurchaseID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : RejectedoffertopurchaseGetCommunicationrecipientsV1Response = apiInstance.rejectedoffertopurchaseGetCommunicationrecipientsV1(pkiRejectedoffertopurchaseID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiRejectedoffertopurchaseID** | **kotlin.Int**|  | |

### Return type

[**RejectedoffertopurchaseGetCommunicationrecipientsV1Response**](RejectedoffertopurchaseGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rejectedoffertopurchaseGetCommunicationsendersV1"></a>
# **rejectedoffertopurchaseGetCommunicationsendersV1**
> RejectedoffertopurchaseGetCommunicationsendersV1Response rejectedoffertopurchaseGetCommunicationsendersV1(pkiRejectedoffertopurchaseID)

Retrieve Rejectedoffertopurchase&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectRejectedoffertopurchaseApi()
val pkiRejectedoffertopurchaseID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : RejectedoffertopurchaseGetCommunicationsendersV1Response = apiInstance.rejectedoffertopurchaseGetCommunicationsendersV1(pkiRejectedoffertopurchaseID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiRejectedoffertopurchaseID** | **kotlin.Int**|  | |

### Return type

[**RejectedoffertopurchaseGetCommunicationsendersV1Response**](RejectedoffertopurchaseGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


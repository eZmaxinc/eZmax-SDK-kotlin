# ObjectTranqcontractApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**tranqcontractGetCommunicationCountV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationCountV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationCount | Retrieve Communication count |
| [**tranqcontractGetCommunicationListV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationListV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationList | Retrieve Communication list |
| [**tranqcontractGetCommunicationrecipientsV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationrecipientsV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationrecipients | Retrieve Tranqcontract&#39;s Communicationrecipient |
| [**tranqcontractGetCommunicationsendersV1**](ObjectTranqcontractApi.md#tranqcontractGetCommunicationsendersV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationsenders | Retrieve Tranqcontract&#39;s Communicationsender |


<a id="tranqcontractGetCommunicationCountV1"></a>
# **tranqcontractGetCommunicationCountV1**
> TranqcontractGetCommunicationCountV1Response tranqcontractGetCommunicationCountV1(pkiTranqcontractID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectTranqcontractApi()
val pkiTranqcontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : TranqcontractGetCommunicationCountV1Response = apiInstance.tranqcontractGetCommunicationCountV1(pkiTranqcontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectTranqcontractApi#tranqcontractGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectTranqcontractApi#tranqcontractGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiTranqcontractID** | **kotlin.Int**|  | |

### Return type

[**TranqcontractGetCommunicationCountV1Response**](TranqcontractGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tranqcontractGetCommunicationListV1"></a>
# **tranqcontractGetCommunicationListV1**
> TranqcontractGetCommunicationListV1Response tranqcontractGetCommunicationListV1(pkiTranqcontractID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectTranqcontractApi()
val pkiTranqcontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : TranqcontractGetCommunicationListV1Response = apiInstance.tranqcontractGetCommunicationListV1(pkiTranqcontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectTranqcontractApi#tranqcontractGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectTranqcontractApi#tranqcontractGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiTranqcontractID** | **kotlin.Int**|  | |

### Return type

[**TranqcontractGetCommunicationListV1Response**](TranqcontractGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tranqcontractGetCommunicationrecipientsV1"></a>
# **tranqcontractGetCommunicationrecipientsV1**
> TranqcontractGetCommunicationrecipientsV1Response tranqcontractGetCommunicationrecipientsV1(pkiTranqcontractID)

Retrieve Tranqcontract&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectTranqcontractApi()
val pkiTranqcontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : TranqcontractGetCommunicationrecipientsV1Response = apiInstance.tranqcontractGetCommunicationrecipientsV1(pkiTranqcontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectTranqcontractApi#tranqcontractGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectTranqcontractApi#tranqcontractGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiTranqcontractID** | **kotlin.Int**|  | |

### Return type

[**TranqcontractGetCommunicationrecipientsV1Response**](TranqcontractGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="tranqcontractGetCommunicationsendersV1"></a>
# **tranqcontractGetCommunicationsendersV1**
> TranqcontractGetCommunicationsendersV1Response tranqcontractGetCommunicationsendersV1(pkiTranqcontractID)

Retrieve Tranqcontract&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectTranqcontractApi()
val pkiTranqcontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : TranqcontractGetCommunicationsendersV1Response = apiInstance.tranqcontractGetCommunicationsendersV1(pkiTranqcontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectTranqcontractApi#tranqcontractGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectTranqcontractApi#tranqcontractGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiTranqcontractID** | **kotlin.Int**|  | |

### Return type

[**TranqcontractGetCommunicationsendersV1Response**](TranqcontractGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


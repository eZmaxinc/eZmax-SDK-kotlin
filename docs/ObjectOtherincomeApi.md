# ObjectOtherincomeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**otherincomeGetCommunicationCountV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationCountV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationCount | Retrieve Communication count |
| [**otherincomeGetCommunicationListV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationListV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationList | Retrieve Communication list |
| [**otherincomeGetCommunicationrecipientsV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationrecipientsV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationrecipients | Retrieve Otherincome&#39;s Communicationrecipient |
| [**otherincomeGetCommunicationsendersV1**](ObjectOtherincomeApi.md#otherincomeGetCommunicationsendersV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationsenders | Retrieve Otherincome&#39;s Communicationsender |


<a id="otherincomeGetCommunicationCountV1"></a>
# **otherincomeGetCommunicationCountV1**
> OtherincomeGetCommunicationCountV1Response otherincomeGetCommunicationCountV1(pkiOtherincomeID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val pkiOtherincomeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OtherincomeGetCommunicationCountV1Response = apiInstance.otherincomeGetCommunicationCountV1(pkiOtherincomeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOtherincomeID** | **kotlin.Int**|  | |

### Return type

[**OtherincomeGetCommunicationCountV1Response**](OtherincomeGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOtherincomeID** | **kotlin.Int**|  | |

### Return type

[**OtherincomeGetCommunicationListV1Response**](OtherincomeGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="otherincomeGetCommunicationrecipientsV1"></a>
# **otherincomeGetCommunicationrecipientsV1**
> OtherincomeGetCommunicationrecipientsV1Response otherincomeGetCommunicationrecipientsV1(pkiOtherincomeID)

Retrieve Otherincome&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val pkiOtherincomeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OtherincomeGetCommunicationrecipientsV1Response = apiInstance.otherincomeGetCommunicationrecipientsV1(pkiOtherincomeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOtherincomeID** | **kotlin.Int**|  | |

### Return type

[**OtherincomeGetCommunicationrecipientsV1Response**](OtherincomeGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="otherincomeGetCommunicationsendersV1"></a>
# **otherincomeGetCommunicationsendersV1**
> OtherincomeGetCommunicationsendersV1Response otherincomeGetCommunicationsendersV1(pkiOtherincomeID)

Retrieve Otherincome&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectOtherincomeApi()
val pkiOtherincomeID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : OtherincomeGetCommunicationsendersV1Response = apiInstance.otherincomeGetCommunicationsendersV1(pkiOtherincomeID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectOtherincomeApi#otherincomeGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiOtherincomeID** | **kotlin.Int**|  | |

### Return type

[**OtherincomeGetCommunicationsendersV1Response**](OtherincomeGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


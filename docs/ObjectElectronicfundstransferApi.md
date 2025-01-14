# ObjectElectronicfundstransferApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**electronicfundstransferGetCommunicationCountV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationCountV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationCount | Retrieve Communication count |
| [**electronicfundstransferGetCommunicationListV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationListV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationList | Retrieve Communication list |
| [**electronicfundstransferGetCommunicationrecipientsV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationrecipientsV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationrecipients | Retrieve Electronicfundstransfer&#39;s Communicationrecipient |
| [**electronicfundstransferGetCommunicationsendersV1**](ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationsendersV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationsenders | Retrieve Electronicfundstransfer&#39;s Communicationsender |


<a id="electronicfundstransferGetCommunicationCountV1"></a>
# **electronicfundstransferGetCommunicationCountV1**
> ElectronicfundstransferGetCommunicationCountV1Response electronicfundstransferGetCommunicationCountV1(pkiElectronicfundstransferID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetCommunicationCountV1Response = apiInstance.electronicfundstransferGetCommunicationCountV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationCountV1Response**](ElectronicfundstransferGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="electronicfundstransferGetCommunicationListV1"></a>
# **electronicfundstransferGetCommunicationListV1**
> ElectronicfundstransferGetCommunicationListV1Response electronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetCommunicationListV1Response = apiInstance.electronicfundstransferGetCommunicationListV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationListV1Response**](ElectronicfundstransferGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="electronicfundstransferGetCommunicationrecipientsV1"></a>
# **electronicfundstransferGetCommunicationrecipientsV1**
> ElectronicfundstransferGetCommunicationrecipientsV1Response electronicfundstransferGetCommunicationrecipientsV1(pkiElectronicfundstransferID)

Retrieve Electronicfundstransfer&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetCommunicationrecipientsV1Response = apiInstance.electronicfundstransferGetCommunicationrecipientsV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationrecipientsV1Response**](ElectronicfundstransferGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="electronicfundstransferGetCommunicationsendersV1"></a>
# **electronicfundstransferGetCommunicationsendersV1**
> ElectronicfundstransferGetCommunicationsendersV1Response electronicfundstransferGetCommunicationsendersV1(pkiElectronicfundstransferID)

Retrieve Electronicfundstransfer&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransferApi()
val pkiElectronicfundstransferID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ElectronicfundstransferGetCommunicationsendersV1Response = apiInstance.electronicfundstransferGetCommunicationsendersV1(pkiElectronicfundstransferID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransferApi#electronicfundstransferGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiElectronicfundstransferID** | **kotlin.Int**|  | |

### Return type

[**ElectronicfundstransferGetCommunicationsendersV1Response**](ElectronicfundstransferGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


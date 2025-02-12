# ObjectInscriptionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**inscriptionGetAttachmentsV1**](ObjectInscriptionApi.md#inscriptionGetAttachmentsV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getAttachments | Retrieve Inscription&#39;s Attachments |
| [**inscriptionGetCommunicationCountV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationCountV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationCount | Retrieve Communication count |
| [**inscriptionGetCommunicationListV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationListV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationList | Retrieve Communication list |
| [**inscriptionGetCommunicationrecipientsV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationrecipientsV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationrecipients | Retrieve Inscription&#39;s Communicationrecipient |
| [**inscriptionGetCommunicationsendersV1**](ObjectInscriptionApi.md#inscriptionGetCommunicationsendersV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationsenders | Retrieve Inscription&#39;s Communicationsender |


<a id="inscriptionGetAttachmentsV1"></a>
# **inscriptionGetAttachmentsV1**
> InscriptionGetAttachmentsV1Response inscriptionGetAttachmentsV1(pkiInscriptionID)

Retrieve Inscription&#39;s Attachments



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionGetAttachmentsV1Response = apiInstance.inscriptionGetAttachmentsV1(pkiInscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetAttachmentsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetAttachmentsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int**|  | |

### Return type

[**InscriptionGetAttachmentsV1Response**](InscriptionGetAttachmentsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionGetCommunicationCountV1"></a>
# **inscriptionGetCommunicationCountV1**
> InscriptionGetCommunicationCountV1Response inscriptionGetCommunicationCountV1(pkiInscriptionID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionGetCommunicationCountV1Response = apiInstance.inscriptionGetCommunicationCountV1(pkiInscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int**|  | |

### Return type

[**InscriptionGetCommunicationCountV1Response**](InscriptionGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionGetCommunicationListV1"></a>
# **inscriptionGetCommunicationListV1**
> InscriptionGetCommunicationListV1Response inscriptionGetCommunicationListV1(pkiInscriptionID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionGetCommunicationListV1Response = apiInstance.inscriptionGetCommunicationListV1(pkiInscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int**|  | |

### Return type

[**InscriptionGetCommunicationListV1Response**](InscriptionGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionGetCommunicationrecipientsV1"></a>
# **inscriptionGetCommunicationrecipientsV1**
> InscriptionGetCommunicationrecipientsV1Response inscriptionGetCommunicationrecipientsV1(pkiInscriptionID)

Retrieve Inscription&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionGetCommunicationrecipientsV1Response = apiInstance.inscriptionGetCommunicationrecipientsV1(pkiInscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int**|  | |

### Return type

[**InscriptionGetCommunicationrecipientsV1Response**](InscriptionGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptionGetCommunicationsendersV1"></a>
# **inscriptionGetCommunicationsendersV1**
> InscriptionGetCommunicationsendersV1Response inscriptionGetCommunicationsendersV1(pkiInscriptionID)

Retrieve Inscription&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptionApi()
val pkiInscriptionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptionGetCommunicationsendersV1Response = apiInstance.inscriptionGetCommunicationsendersV1(pkiInscriptionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptionApi#inscriptionGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptionApi#inscriptionGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptionID** | **kotlin.Int**|  | |

### Return type

[**InscriptionGetCommunicationsendersV1Response**](InscriptionGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


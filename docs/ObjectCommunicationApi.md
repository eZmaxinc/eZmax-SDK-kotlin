# ObjectCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**communicationGetCommunicationBodyV1**](ObjectCommunicationApi.md#communicationGetCommunicationBodyV1) | **GET** /1/object/communication/{pkiCommunicationID}/getCommunicationBody | Retrieve the communication body |
| [**communicationGetDocumenttypechecklistV1**](ObjectCommunicationApi.md#communicationGetDocumenttypechecklistV1) | **GET** /1/object/communication/{pkiCommunicationID}/getDocumenttypechecklist | Retrieve Document type checklist |
| [**communicationSendV1**](ObjectCommunicationApi.md#communicationSendV1) | **POST** /1/object/communication/send | Send a new Communication |
| [**communicationSyncDocumenttypechecklistV1**](ObjectCommunicationApi.md#communicationSyncDocumenttypechecklistV1) | **POST** /1/object/communication/{pkiCommunicationID}/syncDocumenttypechecklist | Synchronize Document type checklist |


<a id="communicationGetCommunicationBodyV1"></a>
# **communicationGetCommunicationBodyV1**
> communicationGetCommunicationBodyV1(pkiCommunicationID)

Retrieve the communication body

This endpoint returns the communication body.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommunicationApi()
val pkiCommunicationID : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.communicationGetCommunicationBodyV1(pkiCommunicationID)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommunicationApi#communicationGetCommunicationBodyV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommunicationApi#communicationGetCommunicationBodyV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommunicationID** | **kotlin.Int**|  | |

### Return type

null (empty response body)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="communicationGetDocumenttypechecklistV1"></a>
# **communicationGetDocumenttypechecklistV1**
> CommunicationGetDocumenttypechecklistV1Response communicationGetDocumenttypechecklistV1(pkiCommunicationID)

Retrieve Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommunicationApi()
val pkiCommunicationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommunicationGetDocumenttypechecklistV1Response = apiInstance.communicationGetDocumenttypechecklistV1(pkiCommunicationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommunicationApi#communicationGetDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommunicationApi#communicationGetDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommunicationID** | **kotlin.Int**|  | |

### Return type

[**CommunicationGetDocumenttypechecklistV1Response**](CommunicationGetDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="communicationSendV1"></a>
# **communicationSendV1**
> CommunicationSendV1Response communicationSendV1(communicationSendV1Request)

Send a new Communication

The endpoint allows to send one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommunicationApi()
val communicationSendV1Request : CommunicationSendV1Request =  // CommunicationSendV1Request | 
try {
    val result : CommunicationSendV1Response = apiInstance.communicationSendV1(communicationSendV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommunicationApi#communicationSendV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommunicationApi#communicationSendV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **communicationSendV1Request** | [**CommunicationSendV1Request**](CommunicationSendV1Request.md)|  | |

### Return type

[**CommunicationSendV1Response**](CommunicationSendV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="communicationSyncDocumenttypechecklistV1"></a>
# **communicationSyncDocumenttypechecklistV1**
> CommunicationSyncDocumenttypechecklistV1Response communicationSyncDocumenttypechecklistV1(pkiCommunicationID, body)

Synchronize Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommunicationApi()
val pkiCommunicationID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : CommunicationSyncDocumenttypechecklistV1Response = apiInstance.communicationSyncDocumenttypechecklistV1(pkiCommunicationID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommunicationApi#communicationSyncDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommunicationApi#communicationSyncDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCommunicationID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**CommunicationSyncDocumenttypechecklistV1Response**](CommunicationSyncDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


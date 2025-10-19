# ObjectInscriptiontempApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**inscriptiontempGetCommunicationCountV1**](ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationCountV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationCount | Retrieve Communication count |
| [**inscriptiontempGetCommunicationListV1**](ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationListV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationList | Retrieve Communication list |
| [**inscriptiontempGetCommunicationrecipientsV1**](ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationrecipientsV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationrecipients | Retrieve Inscriptiontemp&#39;s Communicationrecipient |
| [**inscriptiontempGetCommunicationsendersV1**](ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationsendersV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationsenders | Retrieve Inscriptiontemp&#39;s Communicationsender |
| [**inscriptiontempGetListV1**](ObjectInscriptiontempApi.md#inscriptiontempGetListV1) | **GET** /1/object/inscriptiontemp/getList | Retrieve Inscriptiontemp list |
| [**inscriptiontempImportIntoEDMV1**](ObjectInscriptiontempApi.md#inscriptiontempImportIntoEDMV1) | **POST** /1/object/inscriptiontemp/{pkiInscriptiontempID}/importIntoEDM | Import attachments into the Inscriptiontemp |


<a id="inscriptiontempGetCommunicationCountV1"></a>
# **inscriptiontempGetCommunicationCountV1**
> InscriptiontempGetCommunicationCountV1Response inscriptiontempGetCommunicationCountV1(pkiInscriptiontempID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptiontempApi()
val pkiInscriptiontempID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptiontempGetCommunicationCountV1Response = apiInstance.inscriptiontempGetCommunicationCountV1(pkiInscriptiontempID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptiontempID** | **kotlin.Int**|  | |

### Return type

[**InscriptiontempGetCommunicationCountV1Response**](InscriptiontempGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptiontempGetCommunicationListV1"></a>
# **inscriptiontempGetCommunicationListV1**
> InscriptiontempGetCommunicationListV1Response inscriptiontempGetCommunicationListV1(pkiInscriptiontempID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptiontempApi()
val pkiInscriptiontempID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptiontempGetCommunicationListV1Response = apiInstance.inscriptiontempGetCommunicationListV1(pkiInscriptiontempID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptiontempID** | **kotlin.Int**|  | |

### Return type

[**InscriptiontempGetCommunicationListV1Response**](InscriptiontempGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptiontempGetCommunicationrecipientsV1"></a>
# **inscriptiontempGetCommunicationrecipientsV1**
> InscriptiontempGetCommunicationrecipientsV1Response inscriptiontempGetCommunicationrecipientsV1(pkiInscriptiontempID)

Retrieve Inscriptiontemp&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptiontempApi()
val pkiInscriptiontempID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptiontempGetCommunicationrecipientsV1Response = apiInstance.inscriptiontempGetCommunicationrecipientsV1(pkiInscriptiontempID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptiontempID** | **kotlin.Int**|  | |

### Return type

[**InscriptiontempGetCommunicationrecipientsV1Response**](InscriptiontempGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptiontempGetCommunicationsendersV1"></a>
# **inscriptiontempGetCommunicationsendersV1**
> InscriptiontempGetCommunicationsendersV1Response inscriptiontempGetCommunicationsendersV1(pkiInscriptiontempID)

Retrieve Inscriptiontemp&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptiontempApi()
val pkiInscriptiontempID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : InscriptiontempGetCommunicationsendersV1Response = apiInstance.inscriptiontempGetCommunicationsendersV1(pkiInscriptiontempID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptiontempApi#inscriptiontempGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiInscriptiontempID** | **kotlin.Int**|  | |

### Return type

[**InscriptiontempGetCommunicationsendersV1Response**](InscriptiontempGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptiontempGetListV1"></a>
# **inscriptiontempGetListV1**
> InscriptiontempGetListV1Response inscriptiontempGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Inscriptiontemp list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eInscriptiontempStatus | Imported&lt;br&gt;Processed&lt;br&gt;Modified |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptiontempApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : InscriptiontempGetListV1Response = apiInstance.inscriptiontempGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptiontempApi#inscriptiontempGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptiontempApi#inscriptiontempGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiInscriptiontempID_ASC, pkiInscriptiontempID_DESC, eInscriptiontempStatus_ASC, eInscriptiontempStatus_DESC, sInscriptiontempMLS_ASC, sInscriptiontempMLS_DESC, sInscriptiontempDescription_ASC, sInscriptiontempDescription_DESC, bInscriptiontempIsactive_ASC, bInscriptiontempIsactive_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, dtModifiedDate_ASC, dtModifiedDate_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**InscriptiontempGetListV1Response**](InscriptiontempGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="inscriptiontempImportIntoEDMV1"></a>
# **inscriptiontempImportIntoEDMV1**
> InscriptiontempImportIntoEDMV1Response inscriptiontempImportIntoEDMV1(pkiInscriptiontempID, inscriptiontempImportIntoEDMV1Request)

Import attachments into the Inscriptiontemp



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectInscriptiontempApi()
val pkiInscriptiontempID : kotlin.Int = 56 // kotlin.Int | 
val inscriptiontempImportIntoEDMV1Request : InscriptiontempImportIntoEDMV1Request =  // InscriptiontempImportIntoEDMV1Request | 
try {
    val result : InscriptiontempImportIntoEDMV1Response = apiInstance.inscriptiontempImportIntoEDMV1(pkiInscriptiontempID, inscriptiontempImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectInscriptiontempApi#inscriptiontempImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectInscriptiontempApi#inscriptiontempImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiInscriptiontempID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inscriptiontempImportIntoEDMV1Request** | [**InscriptiontempImportIntoEDMV1Request**](InscriptiontempImportIntoEDMV1Request.md)|  | |

### Return type

[**InscriptiontempImportIntoEDMV1Response**](InscriptiontempImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ObjectRejectedoffertopurchaseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**rejectedoffertopurchaseGetCommunicationCountV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationCountV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationCount | Retrieve Communication count |
| [**rejectedoffertopurchaseGetCommunicationListV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationListV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationList | Retrieve Communication list |
| [**rejectedoffertopurchaseGetCommunicationrecipientsV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationrecipientsV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationrecipients | Retrieve Rejectedoffertopurchase&#39;s Communicationrecipient |
| [**rejectedoffertopurchaseGetCommunicationsendersV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationsendersV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationsenders | Retrieve Rejectedoffertopurchase&#39;s Communicationsender |
| [**rejectedoffertopurchaseGetListV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetListV1) | **GET** /1/object/rejectedoffertopurchase/getList | Retrieve Rejectedoffertopurchase list |
| [**rejectedoffertopurchaseImportIntoEDMV1**](ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseImportIntoEDMV1) | **POST** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/importIntoEDM | Import attachments into the Rejectedoffertopurchase |


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

<a id="rejectedoffertopurchaseGetListV1"></a>
# **rejectedoffertopurchaseGetListV1**
> RejectedoffertopurchaseGetListV1Response rejectedoffertopurchaseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Rejectedoffertopurchase list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectRejectedoffertopurchaseApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : RejectedoffertopurchaseGetListV1Response = apiInstance.rejectedoffertopurchaseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiRejectedoffertopurchaseID_ASC, pkiRejectedoffertopurchaseID_DESC, sRejectedoffertopurchaseNumber_ASC, sRejectedoffertopurchaseNumber_DESC, dtRejectedoffertopurchaseDate_ASC, dtRejectedoffertopurchaseDate_DESC, bRejectedoffertopurchaseIsactive_ASC, bRejectedoffertopurchaseIsactive_DESC, bRejectedoffertopurchaseLinkedtoinscription_ASC, bRejectedoffertopurchaseLinkedtoinscription_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**RejectedoffertopurchaseGetListV1Response**](RejectedoffertopurchaseGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="rejectedoffertopurchaseImportIntoEDMV1"></a>
# **rejectedoffertopurchaseImportIntoEDMV1**
> RejectedoffertopurchaseImportIntoEDMV1Response rejectedoffertopurchaseImportIntoEDMV1(pkiRejectedoffertopurchaseID, rejectedoffertopurchaseImportIntoEDMV1Request)

Import attachments into the Rejectedoffertopurchase



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectRejectedoffertopurchaseApi()
val pkiRejectedoffertopurchaseID : kotlin.Int = 56 // kotlin.Int | 
val rejectedoffertopurchaseImportIntoEDMV1Request : RejectedoffertopurchaseImportIntoEDMV1Request =  // RejectedoffertopurchaseImportIntoEDMV1Request | 
try {
    val result : RejectedoffertopurchaseImportIntoEDMV1Response = apiInstance.rejectedoffertopurchaseImportIntoEDMV1(pkiRejectedoffertopurchaseID, rejectedoffertopurchaseImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectRejectedoffertopurchaseApi#rejectedoffertopurchaseImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiRejectedoffertopurchaseID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rejectedoffertopurchaseImportIntoEDMV1Request** | [**RejectedoffertopurchaseImportIntoEDMV1Request**](RejectedoffertopurchaseImportIntoEDMV1Request.md)|  | |

### Return type

[**RejectedoffertopurchaseImportIntoEDMV1Response**](RejectedoffertopurchaseImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


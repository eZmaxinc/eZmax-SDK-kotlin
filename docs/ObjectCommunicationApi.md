# ObjectCommunicationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**communicationGetListV1**](ObjectCommunicationApi.md#communicationGetListV1) | **GET** /1/object/communication/getList | Retrieve Communication list
[**communicationGetObjectV2**](ObjectCommunicationApi.md#communicationGetObjectV2) | **GET** /2/object/communication/{pkiCommunicationID} | Retrieve an existing Communication


<a name="communicationGetListV1"></a>
# **communicationGetListV1**
> CommunicationMinusGetListMinusV1MinusResponse communicationGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Communication list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eCommunicationImportance | High&lt;br&gt;Normal&lt;br&gt;Low | | eCommunicationType | Email&lt;br&gt;Fax&lt;br&gt;Sms | | eCommunicationDirection | Inbound&lt;br&gt;Outbound |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommunicationApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : CommunicationMinusGetListMinusV1MinusResponse = apiInstance.communicationGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommunicationApi#communicationGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommunicationApi#communicationGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiCommunicationID_ASC, pkiCommunicationID_DESC, fkiEzsignfolderID_ASC, fkiEzsignfolderID_DESC, dtCreatedDate_ASC, dtCreatedDate_DESC, eCommunicationDirection_ASC, eCommunicationDirection_DESC, eCommunicationImportance_ASC, eCommunicationImportance_DESC, eCommunicationType_ASC, eCommunicationType_DESC, iCommunicationrecipientCount_ASC, iCommunicationrecipientCount_DESC, sCommunicationSubject_ASC, sCommunicationSubject_DESC, sCommunicationSender_ASC, sCommunicationSender_DESC, sCommunicationRecipient_ASC, sCommunicationRecipient_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**CommunicationMinusGetListMinusV1MinusResponse**](CommunicationMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="communicationGetObjectV2"></a>
# **communicationGetObjectV2**
> CommunicationMinusGetObjectMinusV2MinusResponse communicationGetObjectV2(pkiCommunicationID)

Retrieve an existing Communication



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCommunicationApi()
val pkiCommunicationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommunicationMinusGetObjectMinusV2MinusResponse = apiInstance.communicationGetObjectV2(pkiCommunicationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCommunicationApi#communicationGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCommunicationApi#communicationGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCommunicationID** | **kotlin.Int**|  |

### Return type

[**CommunicationMinusGetObjectMinusV2MinusResponse**](CommunicationMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


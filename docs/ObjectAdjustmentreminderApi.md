# ObjectAdjustmentreminderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adjustmentreminderGetListV1**](ObjectAdjustmentreminderApi.md#adjustmentreminderGetListV1) | **GET** /1/object/adjustmentreminder/getList | Retrieve Adjustmentreminder list |


<a id="adjustmentreminderGetListV1"></a>
# **adjustmentreminderGetListV1**
> AdjustmentreminderGetListV1Response adjustmentreminderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Adjustmentreminder list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eAdjustmentreminderType | Inversion&lt;br&gt;Copy |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectAdjustmentreminderApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : AdjustmentreminderGetListV1Response = apiInstance.adjustmentreminderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectAdjustmentreminderApi#adjustmentreminderGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectAdjustmentreminderApi#adjustmentreminderGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiAdjustmentreminderID_ASC, pkiAdjustmentreminderID_DESC, fkiAdjustmentID_ASC, fkiAdjustmentID_DESC, fkiPeriodID_ASC, fkiPeriodID_DESC, sPeriodYYYYMM_ASC, sPeriodYYYYMM_DESC, fkiUserIDCreated_ASC, fkiUserIDCreated_DESC, sUserLoginname_ASC, sUserLoginname_DESC, eAdjustmentreminderType_ASC, eAdjustmentreminderType_DESC, sAdjustmentNumber_ASC, sAdjustmentNumber_DESC, sAdjustmentComment_ASC, sAdjustmentComment_DESC, dAdjustmentTotaldebit_ASC, dAdjustmentTotaldebit_DESC, dAdjustmentTotalcredit_ASC, dAdjustmentTotalcredit_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**AdjustmentreminderGetListV1Response**](AdjustmentreminderGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectSessionhistoryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sessionhistoryGetListV1**](ObjectSessionhistoryApi.md#sessionhistoryGetListV1) | **GET** /1/object/sessionhistory/getList | Retrieve Sessionhistory list


<a id="sessionhistoryGetListV1"></a>
# **sessionhistoryGetListV1**
> SessionhistoryGetListV1Response sessionhistoryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Sessionhistory list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSessionhistoryApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : SessionhistoryGetListV1Response = apiInstance.sessionhistoryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSessionhistoryApi#sessionhistoryGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSessionhistoryApi#sessionhistoryGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiSessionhistoryID_ASC, pkiSessionhistoryID_DESC, fkiComputerID_ASC, fkiComputerID_DESC, fkiUserID_ASC, fkiUserID_DESC, dtSessionhistoryFirsthit_ASC, dtSessionhistoryFirsthit_DESC, dtSessionhistoryLasthit_ASC, dtSessionhistoryLasthit_DESC, eSessionhistoryEndby_ASC, eSessionhistoryEndby_DESC, sComputerDescription_ASC, sComputerDescription_DESC, sSessionhistoryDuration_ASC, sSessionhistoryDuration_DESC, sSessionhistoryIP_ASC, sSessionhistoryIP_DESC, sUserLoginname_ASC, sUserLoginname_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional] [default to 10000]
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**SessionhistoryGetListV1Response**](SessionhistoryGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


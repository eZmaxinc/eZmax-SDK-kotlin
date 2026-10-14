# ObjectElectronicfundstransfertransactionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**electronicfundstransfertransactionGetListV1**](ObjectElectronicfundstransfertransactionApi.md#electronicfundstransfertransactionGetListV1) | **GET** /1/object/electronicfundstransfertransaction/getList | Retrieve Electronicfundstransfertransaction list |


<a id="electronicfundstransfertransactionGetListV1"></a>
# **electronicfundstransfertransactionGetListV1**
> ElectronicfundstransfertransactionGetListV1Response electronicfundstransfertransactionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Electronicfundstransfertransaction list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectElectronicfundstransfertransactionApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : ElectronicfundstransfertransactionGetListV1Response = apiInstance.electronicfundstransfertransactionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectElectronicfundstransfertransactionApi#electronicfundstransfertransactionGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectElectronicfundstransfertransactionApi#electronicfundstransfertransactionGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiElectronicfundstransfertransactionID_ASC, pkiElectronicfundstransfertransactionID_DESC, dElectronicfundstransfertransactionAmount_ASC, dElectronicfundstransfertransactionAmount_DESC, dtElectronicfundstransfertransactionDate_ASC, dtElectronicfundstransfertransactionDate_DESC, iElectronicfundstransferNumber_ASC, iElectronicfundstransferNumber_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**ElectronicfundstransfertransactionGetListV1Response**](ElectronicfundstransfertransactionGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


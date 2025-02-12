# ObjectClonehistoryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clonehistoryGetListV1**](ObjectClonehistoryApi.md#clonehistoryGetListV1) | **GET** /1/object/clonehistory/getList | Retrieve Clonehistory list |


<a id="clonehistoryGetListV1"></a>
# **clonehistoryGetListV1**
> ClonehistoryGetListV1Response clonehistoryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Clonehistory list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectClonehistoryApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : ClonehistoryGetListV1Response = apiInstance.clonehistoryGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectClonehistoryApi#clonehistoryGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectClonehistoryApi#clonehistoryGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiClonehistoryID_ASC, pkiClonehistoryID_DESC, fkiUserIDCloning_ASC, fkiUserIDCloning_DESC, fkiUserIDCloned_ASC, fkiUserIDCloned_DESC, dtClonehistoryFirsthit_ASC, dtClonehistoryFirsthit_DESC, dtClonehistoryLasthit_ASC, dtClonehistoryLasthit_DESC, sUserLoginnameCloning_ASC, sUserLoginnameCloning_DESC, sUserFirstnameCloning_ASC, sUserFirstnameCloning_DESC, sUserLastnameCloning_ASC, sUserLastnameCloning_DESC, sUserLoginnameCloned_ASC, sUserLoginnameCloned_DESC, sUserFirstnameCloned_ASC, sUserFirstnameCloned_DESC, sUserLastnameCloned_ASC, sUserLastnameCloned_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**ClonehistoryGetListV1Response**](ClonehistoryGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


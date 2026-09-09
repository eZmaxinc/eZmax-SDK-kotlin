# ObjectEzmaxmaillinglistApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezmaxmaillinglistGetListV1**](ObjectEzmaxmaillinglistApi.md#ezmaxmaillinglistGetListV1) | **GET** /1/object/ezmaxmaillinglist/getList | Retrieve Ezmaxmaillinglist list |


<a id="ezmaxmaillinglistGetListV1"></a>
# **ezmaxmaillinglistGetListV1**
> EzmaxmaillinglistGetListV1Response ezmaxmaillinglistGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezmaxmaillinglist list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxmaillinglistApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzmaxmaillinglistGetListV1Response = apiInstance.ezmaxmaillinglistGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxmaillinglistApi#ezmaxmaillinglistGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxmaillinglistApi#ezmaxmaillinglistGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzmaxmaillinglistID_ASC, pkiEzmaxmaillinglistID_DESC, sEzmaxmaillinglistNameX_ASC, sEzmaxmaillinglistNameX_DESC, sEzmaxmaillinglistDescriptionX_ASC, sEzmaxmaillinglistDescriptionX_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**EzmaxmaillinglistGetListV1Response**](EzmaxmaillinglistGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


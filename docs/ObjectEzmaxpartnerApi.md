# ObjectEzmaxpartnerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezmaxpartnerGetCustomDeveloppersV1**](ObjectEzmaxpartnerApi.md#ezmaxpartnerGetCustomDeveloppersV1) | **GET** /1/object/ezmaxpartner/getCustomDeveloppers | Retrieve Ezmaxpartner custom developpers list |
| [**ezmaxpartnerGetObjectV2**](ObjectEzmaxpartnerApi.md#ezmaxpartnerGetObjectV2) | **GET** /2/object/ezmaxpartner/{pkiEzmaxpartnerID} | Retrieve an existing Ezmaxpartner |


<a id="ezmaxpartnerGetCustomDeveloppersV1"></a>
# **ezmaxpartnerGetCustomDeveloppersV1**
> EzmaxpartnerGetCustomDeveloppersV1Response ezmaxpartnerGetCustomDeveloppersV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezmaxpartner custom developpers list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxpartnerApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzmaxpartnerGetCustomDeveloppersV1Response = apiInstance.ezmaxpartnerGetCustomDeveloppersV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxpartnerApi#ezmaxpartnerGetCustomDeveloppersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxpartnerApi#ezmaxpartnerGetCustomDeveloppersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzmaxpartnerID_ASC, pkiEzmaxpartnerID_DESC, sEzmaxpartnerAddressX_ASC, sEzmaxpartnerAddressX_DESC, sEzmaxpartnerEmailaddressX_ASC, sEzmaxpartnerEmailaddressX_DESC, sEzmaxpartnerShortdescriptionX_ASC, sEzmaxpartnerShortdescriptionX_DESC, sEzmaxpartnerNameX_ASC, sEzmaxpartnerNameX_DESC, sEzmaxpartnerPhoneE164X_ASC, sEzmaxpartnerPhoneE164X_DESC, sEzmaxpartnerUrlX_ASC, sEzmaxpartnerUrlX_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**EzmaxpartnerGetCustomDeveloppersV1Response**](EzmaxpartnerGetCustomDeveloppersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezmaxpartnerGetObjectV2"></a>
# **ezmaxpartnerGetObjectV2**
> EzmaxpartnerGetObjectV2Response ezmaxpartnerGetObjectV2(pkiEzmaxpartnerID)

Retrieve an existing Ezmaxpartner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxpartnerApi()
val pkiEzmaxpartnerID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezmaxpartner
try {
    val result : EzmaxpartnerGetObjectV2Response = apiInstance.ezmaxpartnerGetObjectV2(pkiEzmaxpartnerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxpartnerApi#ezmaxpartnerGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxpartnerApi#ezmaxpartnerGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzmaxpartnerID** | **kotlin.Int**| The unique ID of the Ezmaxpartner | |

### Return type

[**EzmaxpartnerGetObjectV2Response**](EzmaxpartnerGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


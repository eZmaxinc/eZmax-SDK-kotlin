# ObjectActivesessionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**activesessionGenerateFederationTokenV1**](ObjectActivesessionApi.md#activesessionGenerateFederationTokenV1) | **POST** /1/object/activesession/generateFederationToken | Generate a federation token |
| [**activesessionGetCurrentV1**](ObjectActivesessionApi.md#activesessionGetCurrentV1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession |
| [**activesessionGetCurrentV2**](ObjectActivesessionApi.md#activesessionGetCurrentV2) | **GET** /2/object/activesession/getCurrent | Get Current Activesession |
| [**activesessionGetListV1**](ObjectActivesessionApi.md#activesessionGetListV1) | **GET** /1/object/activesession/getList | Retrieve Activesession list |


<a id="activesessionGenerateFederationTokenV1"></a>
# **activesessionGenerateFederationTokenV1**
> ActivesessionGenerateFederationTokenV1Response activesessionGenerateFederationTokenV1(activesessionGenerateFederationTokenV1Request)

Generate a federation token



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectActivesessionApi()
val activesessionGenerateFederationTokenV1Request : ActivesessionGenerateFederationTokenV1Request =  // ActivesessionGenerateFederationTokenV1Request | 
try {
    val result : ActivesessionGenerateFederationTokenV1Response = apiInstance.activesessionGenerateFederationTokenV1(activesessionGenerateFederationTokenV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectActivesessionApi#activesessionGenerateFederationTokenV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectActivesessionApi#activesessionGenerateFederationTokenV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **activesessionGenerateFederationTokenV1Request** | [**ActivesessionGenerateFederationTokenV1Request**](ActivesessionGenerateFederationTokenV1Request.md)|  | |

### Return type

[**ActivesessionGenerateFederationTokenV1Response**](ActivesessionGenerateFederationTokenV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="activesessionGetCurrentV1"></a>
# **activesessionGetCurrentV1**
> ActivesessionGetCurrentV1Response activesessionGetCurrentV1()

Get Current Activesession

Retrieve the details about the current activesession

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectActivesessionApi()
try {
    val result : ActivesessionGetCurrentV1Response = apiInstance.activesessionGetCurrentV1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectActivesessionApi#activesessionGetCurrentV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectActivesessionApi#activesessionGetCurrentV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ActivesessionGetCurrentV1Response**](ActivesessionGetCurrentV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activesessionGetCurrentV2"></a>
# **activesessionGetCurrentV2**
> ActivesessionGetCurrentV2Response activesessionGetCurrentV2()

Get Current Activesession

Retrieve the details about the current activesession

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectActivesessionApi()
try {
    val result : ActivesessionGetCurrentV2Response = apiInstance.activesessionGetCurrentV2()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectActivesessionApi#activesessionGetCurrentV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectActivesessionApi#activesessionGetCurrentV2")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ActivesessionGetCurrentV2Response**](ActivesessionGetCurrentV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activesessionGetListV1"></a>
# **activesessionGetListV1**
> ActivesessionGetListV1Response activesessionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Activesession list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectActivesessionApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : ActivesessionGetListV1Response = apiInstance.activesessionGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectActivesessionApi#activesessionGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectActivesessionApi#activesessionGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiActivesessionID_ASC, pkiActivesessionID_DESC, fkiUserID_ASC, fkiUserID_DESC, fkiComputerID_ASC, fkiComputerID_DESC, fkiCompanyID_ASC, fkiCompanyID_DESC, fkiDepartmentID_ASC, fkiDepartmentID_DESC, sCompanyNameX_ASC, sCompanyNameX_DESC, sDepartmentNameX_ASC, sDepartmentNameX_DESC, sActivesessionLoginname_ASC, sActivesessionLoginname_DESC, sComputerDescription_ASC, sComputerDescription_DESC, dtActivesessionFirsthit_ASC, dtActivesessionFirsthit_DESC, dtActivesessionLasthit_ASC, dtActivesessionLasthit_DESC, sActivesessionIP_ASC, sActivesessionIP_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**ActivesessionGetListV1Response**](ActivesessionGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


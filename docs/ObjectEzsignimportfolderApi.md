# ObjectEzsignimportfolderApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignimportfolderDeleteObjectV1**](ObjectEzsignimportfolderApi.md#ezsignimportfolderDeleteObjectV1) | **DELETE** /1/object/ezsignimportfolder/{pkiEzsignimportfolderID} | Delete an existing Ezsignimportfolder |
| [**ezsignimportfolderGetListV1**](ObjectEzsignimportfolderApi.md#ezsignimportfolderGetListV1) | **GET** /1/object/ezsignimportfolder/getList | Retrieve Ezsignimportfolder list |
| [**ezsignimportfolderGetObjectV2**](ObjectEzsignimportfolderApi.md#ezsignimportfolderGetObjectV2) | **GET** /2/object/ezsignimportfolder/{pkiEzsignimportfolderID} | Retrieve an existing Ezsignimportfolder |


<a id="ezsignimportfolderDeleteObjectV1"></a>
# **ezsignimportfolderDeleteObjectV1**
> EzsignimportfolderDeleteObjectV1Response ezsignimportfolderDeleteObjectV1(pkiEzsignimportfolderID)

Delete an existing Ezsignimportfolder



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignimportfolderApi()
val pkiEzsignimportfolderID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignimportfolder
try {
    val result : EzsignimportfolderDeleteObjectV1Response = apiInstance.ezsignimportfolderDeleteObjectV1(pkiEzsignimportfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignimportfolderApi#ezsignimportfolderDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignimportfolderApi#ezsignimportfolderDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignimportfolderID** | **kotlin.Int**| The unique ID of the Ezsignimportfolder | |

### Return type

[**EzsignimportfolderDeleteObjectV1Response**](EzsignimportfolderDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignimportfolderGetListV1"></a>
# **ezsignimportfolderGetListV1**
> EzsignimportfolderGetListV1Response ezsignimportfolderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignimportfolder list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignimportfolderApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzsignimportfolderGetListV1Response = apiInstance.ezsignimportfolderGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignimportfolderApi#ezsignimportfolderGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignimportfolderApi#ezsignimportfolderGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignimportfolderID_ASC, pkiEzsignimportfolderID_DESC, sEzsignimportfolderName_ASC, sEzsignimportfolderName_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**EzsignimportfolderGetListV1Response**](EzsignimportfolderGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignimportfolderGetObjectV2"></a>
# **ezsignimportfolderGetObjectV2**
> EzsignimportfolderGetObjectV2Response ezsignimportfolderGetObjectV2(pkiEzsignimportfolderID)

Retrieve an existing Ezsignimportfolder



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignimportfolderApi()
val pkiEzsignimportfolderID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignimportfolder
try {
    val result : EzsignimportfolderGetObjectV2Response = apiInstance.ezsignimportfolderGetObjectV2(pkiEzsignimportfolderID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignimportfolderApi#ezsignimportfolderGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignimportfolderApi#ezsignimportfolderGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignimportfolderID** | **kotlin.Int**| The unique ID of the Ezsignimportfolder | |

### Return type

[**EzsignimportfolderGetObjectV2Response**](EzsignimportfolderGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectEzmaxpartnerproductstageApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1**](ObjectEzmaxpartnerproductstageApi.md#ezmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1) | **GET** /1/object/ezmaxpartnerproductstage/{pkiEzmaxpartnerproductstageID}/getEzmaxpartnerproductstagepermissions | Retrieve an existing Ezmaxpartnerproductstage&#39;s Ezmaxpartnerproductstagepermissions |
| [**ezmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1**](ObjectEzmaxpartnerproductstageApi.md#ezmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1) | **GET** /1/object/ezmaxpartnerproductstage/{pkiEzmaxpartnerproductstageID}/getEzmaxpartnerproductstagewebhooks | Retrieve an existing Ezmaxpartnerproductstage&#39;s Ezmaxpartnerproductstagewebhooks |
| [**ezmaxpartnerproductstageGetListV1**](ObjectEzmaxpartnerproductstageApi.md#ezmaxpartnerproductstageGetListV1) | **GET** /1/object/ezmaxpartnerproductstage/getList | Retrieve Ezmaxpartnerproductstage list |
| [**ezmaxpartnerproductstageGetObjectV2**](ObjectEzmaxpartnerproductstageApi.md#ezmaxpartnerproductstageGetObjectV2) | **GET** /2/object/ezmaxpartnerproductstage/{pkiEzmaxpartnerproductstageID} | Retrieve an existing Ezmaxpartnerproductstage |
| [**ezmaxpartnerproductstageSubscribeV1**](ObjectEzmaxpartnerproductstageApi.md#ezmaxpartnerproductstageSubscribeV1) | **POST** /1/object/ezmaxpartnerproductstage/{pkiEzmaxpartnerproductstageID}/subscribe | Subscribe to the Ezmaxpartnerproductstage |
| [**ezmaxpartnerproductstageUnsubscribeV1**](ObjectEzmaxpartnerproductstageApi.md#ezmaxpartnerproductstageUnsubscribeV1) | **POST** /1/object/ezmaxpartnerproductstage/{pkiEzmaxpartnerproductstageID}/unsubscribe | Unsubscribe to the Ezmaxpartnerproductstage |


<a id="ezmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1"></a>
# **ezmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1**
> EzmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1Response ezmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1(pkiEzmaxpartnerproductstageID)

Retrieve an existing Ezmaxpartnerproductstage&#39;s Ezmaxpartnerproductstagepermissions

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxpartnerproductstageApi()
val pkiEzmaxpartnerproductstageID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1Response = apiInstance.ezmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1(pkiEzmaxpartnerproductstageID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzmaxpartnerproductstageID** | **kotlin.Int**|  | |

### Return type

[**EzmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1Response**](EzmaxpartnerproductstageGetEzmaxpartnerproductstagepermissionsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1"></a>
# **ezmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1**
> EzmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1Response ezmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1(pkiEzmaxpartnerproductstageID)

Retrieve an existing Ezmaxpartnerproductstage&#39;s Ezmaxpartnerproductstagewebhooks

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxpartnerproductstageApi()
val pkiEzmaxpartnerproductstageID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1Response = apiInstance.ezmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1(pkiEzmaxpartnerproductstageID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzmaxpartnerproductstageID** | **kotlin.Int**|  | |

### Return type

[**EzmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1Response**](EzmaxpartnerproductstageGetEzmaxpartnerproductstagewebhooksV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezmaxpartnerproductstageGetListV1"></a>
# **ezmaxpartnerproductstageGetListV1**
> EzmaxpartnerproductstageGetListV1Response ezmaxpartnerproductstageGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezmaxpartnerproductstage list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxpartnerproductstageApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzmaxpartnerproductstageGetListV1Response = apiInstance.ezmaxpartnerproductstageGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageGetListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzmaxpartnerproductstageID_ASC, pkiEzmaxpartnerproductstageID_DESC, efksEzmaxcustomerCode_ASC, efksEzmaxcustomerCode_DESC, fkiEzmaxpartnerproductID_ASC, fkiEzmaxpartnerproductID_DESC, sEzmaxpartnerproductNameX_ASC, sEzmaxpartnerproductNameX_DESC, sEzmaxpartnerproductShortdescriptionX_ASC, sEzmaxpartnerproductShortdescriptionX_DESC, sEzmaxpartnerproductLogourlX_ASC, sEzmaxpartnerproductLogourlX_DESC, fkiEzmaxpartnerID_ASC, fkiEzmaxpartnerID_DESC, sEzmaxpartnerNameX_ASC, sEzmaxpartnerNameX_DESC, eEzmaxpartnerproductstageCode_ASC, eEzmaxpartnerproductstageCode_DESC, bEzmaxpartnerproductstagePublished_ASC, bEzmaxpartnerproductstagePublished_DESC, bEzmaxpartnerproductstageInstalled_ASC, bEzmaxpartnerproductstageInstalled_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**EzmaxpartnerproductstageGetListV1Response**](EzmaxpartnerproductstageGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezmaxpartnerproductstageGetObjectV2"></a>
# **ezmaxpartnerproductstageGetObjectV2**
> EzmaxpartnerproductstageGetObjectV2Response ezmaxpartnerproductstageGetObjectV2(pkiEzmaxpartnerproductstageID)

Retrieve an existing Ezmaxpartnerproductstage



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxpartnerproductstageApi()
val pkiEzmaxpartnerproductstageID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezmaxpartnerproductstage
try {
    val result : EzmaxpartnerproductstageGetObjectV2Response = apiInstance.ezmaxpartnerproductstageGetObjectV2(pkiEzmaxpartnerproductstageID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzmaxpartnerproductstageID** | **kotlin.Int**| The unique ID of the Ezmaxpartnerproductstage | |

### Return type

[**EzmaxpartnerproductstageGetObjectV2Response**](EzmaxpartnerproductstageGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezmaxpartnerproductstageSubscribeV1"></a>
# **ezmaxpartnerproductstageSubscribeV1**
> EzmaxpartnerproductstageSubscribeV1Response ezmaxpartnerproductstageSubscribeV1(pkiEzmaxpartnerproductstageID, body)

Subscribe to the Ezmaxpartnerproductstage

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxpartnerproductstageApi()
val pkiEzmaxpartnerproductstageID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EzmaxpartnerproductstageSubscribeV1Response = apiInstance.ezmaxpartnerproductstageSubscribeV1(pkiEzmaxpartnerproductstageID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageSubscribeV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageSubscribeV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzmaxpartnerproductstageID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | |

### Return type

[**EzmaxpartnerproductstageSubscribeV1Response**](EzmaxpartnerproductstageSubscribeV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezmaxpartnerproductstageUnsubscribeV1"></a>
# **ezmaxpartnerproductstageUnsubscribeV1**
> EzmaxpartnerproductstageUnsubscribeV1Response ezmaxpartnerproductstageUnsubscribeV1(pkiEzmaxpartnerproductstageID, body)

Unsubscribe to the Ezmaxpartnerproductstage

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxpartnerproductstageApi()
val pkiEzmaxpartnerproductstageID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EzmaxpartnerproductstageUnsubscribeV1Response = apiInstance.ezmaxpartnerproductstageUnsubscribeV1(pkiEzmaxpartnerproductstageID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageUnsubscribeV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxpartnerproductstageApi#ezmaxpartnerproductstageUnsubscribeV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzmaxpartnerproductstageID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | |

### Return type

[**EzmaxpartnerproductstageUnsubscribeV1Response**](EzmaxpartnerproductstageUnsubscribeV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


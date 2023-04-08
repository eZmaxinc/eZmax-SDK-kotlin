# ObjectEzsignformfieldgroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignformfieldgroupCreateObjectV1**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupCreateObjectV1) | **POST** /1/object/ezsignformfieldgroup | Create a new Ezsignformfieldgroup
[**ezsignformfieldgroupDeleteObjectV1**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Delete an existing Ezsignformfieldgroup
[**ezsignformfieldgroupEditObjectV1**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupEditObjectV1) | **PUT** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Edit an existing Ezsignformfieldgroup
[**ezsignformfieldgroupGetObjectV2**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupGetObjectV2) | **GET** /2/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Retrieve an existing Ezsignformfieldgroup


<a name="ezsignformfieldgroupCreateObjectV1"></a>
# **ezsignformfieldgroupCreateObjectV1**
> EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse ezsignformfieldgroupCreateObjectV1(ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsignformfieldgroup

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignformfieldgroupApi()
val ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest : EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest =  // EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsignformfieldgroupCreateObjectV1(ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest** | [**EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest**](EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse**](EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignformfieldgroupDeleteObjectV1"></a>
# **ezsignformfieldgroupDeleteObjectV1**
> EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse ezsignformfieldgroupDeleteObjectV1(pkiEzsignformfieldgroupID)

Delete an existing Ezsignformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignformfieldgroupApi()
val pkiEzsignformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsignformfieldgroupDeleteObjectV1(pkiEzsignformfieldgroupID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignformfieldgroupID** | **kotlin.Int**|  |

### Return type

[**EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse**](EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignformfieldgroupEditObjectV1"></a>
# **ezsignformfieldgroupEditObjectV1**
> EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse ezsignformfieldgroupEditObjectV1(pkiEzsignformfieldgroupID, ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsignformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignformfieldgroupApi()
val pkiEzsignformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
val ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest : EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest =  // EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse = apiInstance.ezsignformfieldgroupEditObjectV1(pkiEzsignformfieldgroupID, ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignformfieldgroupID** | **kotlin.Int**|  |
 **ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest** | [**EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest**](EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse**](EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignformfieldgroupGetObjectV2"></a>
# **ezsignformfieldgroupGetObjectV2**
> EzsignformfieldgroupMinusGetObjectMinusV2MinusResponse ezsignformfieldgroupGetObjectV2(pkiEzsignformfieldgroupID)

Retrieve an existing Ezsignformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignformfieldgroupApi()
val pkiEzsignformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignformfieldgroupMinusGetObjectMinusV2MinusResponse = apiInstance.ezsignformfieldgroupGetObjectV2(pkiEzsignformfieldgroupID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignformfieldgroupApi#ezsignformfieldgroupGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignformfieldgroupID** | **kotlin.Int**|  |

### Return type

[**EzsignformfieldgroupMinusGetObjectMinusV2MinusResponse**](EzsignformfieldgroupMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


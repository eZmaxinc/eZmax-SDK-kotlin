# ObjectEzsigntemplateformfieldgroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplateformfieldgroupCreateObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupCreateObjectV1) | **POST** /1/object/ezsigntemplateformfieldgroup | Create a new Ezsigntemplateformfieldgroup
[**ezsigntemplateformfieldgroupDeleteObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Delete an existing Ezsigntemplateformfieldgroup
[**ezsigntemplateformfieldgroupEditObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupEditObjectV1) | **PUT** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Edit an existing Ezsigntemplateformfieldgroup
[**ezsigntemplateformfieldgroupGetObjectV2**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupGetObjectV2) | **GET** /2/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Retrieve an existing Ezsigntemplateformfieldgroup


<a id="ezsigntemplateformfieldgroupCreateObjectV1"></a>
# **ezsigntemplateformfieldgroupCreateObjectV1**
> EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusResponse ezsigntemplateformfieldgroupCreateObjectV1(ezsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsigntemplateformfieldgroup

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateformfieldgroupApi()
val ezsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusRequest : EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusRequest =  // EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsigntemplateformfieldgroupCreateObjectV1(ezsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusRequest** | [**EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusRequest**](EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusResponse**](EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateformfieldgroupDeleteObjectV1"></a>
# **ezsigntemplateformfieldgroupDeleteObjectV1**
> EzsigntemplateformfieldgroupMinusDeleteObjectMinusV1MinusResponse ezsigntemplateformfieldgroupDeleteObjectV1(pkiEzsigntemplateformfieldgroupID)

Delete an existing Ezsigntemplateformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateformfieldgroupApi()
val pkiEzsigntemplateformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplateformfieldgroupMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsigntemplateformfieldgroupDeleteObjectV1(pkiEzsigntemplateformfieldgroupID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateformfieldgroupID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplateformfieldgroupMinusDeleteObjectMinusV1MinusResponse**](EzsigntemplateformfieldgroupMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplateformfieldgroupEditObjectV1"></a>
# **ezsigntemplateformfieldgroupEditObjectV1**
> EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusResponse ezsigntemplateformfieldgroupEditObjectV1(pkiEzsigntemplateformfieldgroupID, ezsigntemplateformfieldgroupMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsigntemplateformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateformfieldgroupApi()
val pkiEzsigntemplateformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplateformfieldgroupMinusEditObjectMinusV1MinusRequest : EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusRequest =  // EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusResponse = apiInstance.ezsigntemplateformfieldgroupEditObjectV1(pkiEzsigntemplateformfieldgroupID, ezsigntemplateformfieldgroupMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateformfieldgroupID** | **kotlin.Int**|  |
 **ezsigntemplateformfieldgroupMinusEditObjectMinusV1MinusRequest** | [**EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusRequest**](EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusResponse**](EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateformfieldgroupGetObjectV2"></a>
# **ezsigntemplateformfieldgroupGetObjectV2**
> EzsigntemplateformfieldgroupMinusGetObjectMinusV2MinusResponse ezsigntemplateformfieldgroupGetObjectV2(pkiEzsigntemplateformfieldgroupID)

Retrieve an existing Ezsigntemplateformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateformfieldgroupApi()
val pkiEzsigntemplateformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplateformfieldgroupMinusGetObjectMinusV2MinusResponse = apiInstance.ezsigntemplateformfieldgroupGetObjectV2(pkiEzsigntemplateformfieldgroupID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplateformfieldgroupApi#ezsigntemplateformfieldgroupGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplateformfieldgroupID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplateformfieldgroupMinusGetObjectMinusV2MinusResponse**](EzsigntemplateformfieldgroupMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


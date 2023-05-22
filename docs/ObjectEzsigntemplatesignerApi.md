# ObjectEzsigntemplatesignerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatesignerCreateObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerCreateObjectV1) | **POST** /1/object/ezsigntemplatesigner | Create a new Ezsigntemplatesigner
[**ezsigntemplatesignerDeleteObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Delete an existing Ezsigntemplatesigner
[**ezsigntemplatesignerEditObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerEditObjectV1) | **PUT** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Edit an existing Ezsigntemplatesigner
[**ezsigntemplatesignerGetObjectV2**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerGetObjectV2) | **GET** /2/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Retrieve an existing Ezsigntemplatesigner


<a id="ezsigntemplatesignerCreateObjectV1"></a>
# **ezsigntemplatesignerCreateObjectV1**
> EzsigntemplatesignerMinusCreateObjectMinusV1MinusResponse ezsigntemplatesignerCreateObjectV1(ezsigntemplatesignerMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsigntemplatesigner

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignerApi()
val ezsigntemplatesignerMinusCreateObjectMinusV1MinusRequest : EzsigntemplatesignerMinusCreateObjectMinusV1MinusRequest =  // EzsigntemplatesignerMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatesignerMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsigntemplatesignerCreateObjectV1(ezsigntemplatesignerMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatesignerMinusCreateObjectMinusV1MinusRequest** | [**EzsigntemplatesignerMinusCreateObjectMinusV1MinusRequest**](EzsigntemplatesignerMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatesignerMinusCreateObjectMinusV1MinusResponse**](EzsigntemplatesignerMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatesignerDeleteObjectV1"></a>
# **ezsigntemplatesignerDeleteObjectV1**
> EzsigntemplatesignerMinusDeleteObjectMinusV1MinusResponse ezsigntemplatesignerDeleteObjectV1(pkiEzsigntemplatesignerID)

Delete an existing Ezsigntemplatesigner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignerApi()
val pkiEzsigntemplatesignerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatesignerMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsigntemplatesignerDeleteObjectV1(pkiEzsigntemplatesignerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignerID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatesignerMinusDeleteObjectMinusV1MinusResponse**](EzsigntemplatesignerMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatesignerEditObjectV1"></a>
# **ezsigntemplatesignerEditObjectV1**
> EzsigntemplatesignerMinusEditObjectMinusV1MinusResponse ezsigntemplatesignerEditObjectV1(pkiEzsigntemplatesignerID, ezsigntemplatesignerMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsigntemplatesigner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignerApi()
val pkiEzsigntemplatesignerID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatesignerMinusEditObjectMinusV1MinusRequest : EzsigntemplatesignerMinusEditObjectMinusV1MinusRequest =  // EzsigntemplatesignerMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatesignerMinusEditObjectMinusV1MinusResponse = apiInstance.ezsigntemplatesignerEditObjectV1(pkiEzsigntemplatesignerID, ezsigntemplatesignerMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignerID** | **kotlin.Int**|  |
 **ezsigntemplatesignerMinusEditObjectMinusV1MinusRequest** | [**EzsigntemplatesignerMinusEditObjectMinusV1MinusRequest**](EzsigntemplatesignerMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatesignerMinusEditObjectMinusV1MinusResponse**](EzsigntemplatesignerMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatesignerGetObjectV2"></a>
# **ezsigntemplatesignerGetObjectV2**
> EzsigntemplatesignerMinusGetObjectMinusV2MinusResponse ezsigntemplatesignerGetObjectV2(pkiEzsigntemplatesignerID)

Retrieve an existing Ezsigntemplatesigner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignerApi()
val pkiEzsigntemplatesignerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatesignerMinusGetObjectMinusV2MinusResponse = apiInstance.ezsigntemplatesignerGetObjectV2(pkiEzsigntemplatesignerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatesignerID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatesignerMinusGetObjectMinusV2MinusResponse**](EzsigntemplatesignerMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


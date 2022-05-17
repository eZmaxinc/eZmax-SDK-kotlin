# ObjectEzsigntemplatepackagesignerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsigntemplatepackagesignerCreateObjectV1**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagesigner | Create a new Ezsigntemplatepackagesigner
[**ezsigntemplatepackagesignerDeleteObjectV1**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Delete an existing Ezsigntemplatepackagesigner
[**ezsigntemplatepackagesignerEditObjectV1**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerEditObjectV1) | **PUT** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Edit an existing Ezsigntemplatepackagesigner
[**ezsigntemplatepackagesignerGetObjectV1**](ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerGetObjectV1) | **GET** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Retrieve an existing Ezsigntemplatepackagesigner


<a name="ezsigntemplatepackagesignerCreateObjectV1"></a>
# **ezsigntemplatepackagesignerCreateObjectV1**
> EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse ezsigntemplatepackagesignerCreateObjectV1(ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsigntemplatepackagesigner

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackagesignerApi()
val ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest : EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest =  // EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackagesignerCreateObjectV1(ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest** | [**EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest**](EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse**](EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatepackagesignerDeleteObjectV1"></a>
# **ezsigntemplatepackagesignerDeleteObjectV1**
> EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse ezsigntemplatepackagesignerDeleteObjectV1(pkiEzsigntemplatepackagesignerID)

Delete an existing Ezsigntemplatepackagesigner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackagesignerApi()
val pkiEzsigntemplatepackagesignerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackagesignerDeleteObjectV1(pkiEzsigntemplatepackagesignerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignerID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse**](EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsigntemplatepackagesignerEditObjectV1"></a>
# **ezsigntemplatepackagesignerEditObjectV1**
> EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse ezsigntemplatepackagesignerEditObjectV1(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsigntemplatepackagesigner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackagesignerApi()
val pkiEzsigntemplatepackagesignerID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest : EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest =  // EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackagesignerEditObjectV1(pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignerID** | **kotlin.Int**|  |
 **ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest** | [**EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest**](EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse**](EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsigntemplatepackagesignerGetObjectV1"></a>
# **ezsigntemplatepackagesignerGetObjectV1**
> EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse ezsigntemplatepackagesignerGetObjectV1(pkiEzsigntemplatepackagesignerID)

Retrieve an existing Ezsigntemplatepackagesigner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatepackagesignerApi()
val pkiEzsigntemplatepackagesignerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse = apiInstance.ezsigntemplatepackagesignerGetObjectV1(pkiEzsigntemplatepackagesignerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatepackagesignerApi#ezsigntemplatepackagesignerGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsigntemplatepackagesignerID** | **kotlin.Int**|  |

### Return type

[**EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse**](EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


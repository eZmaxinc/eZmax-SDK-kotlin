# ObjectEzsigntemplateformfieldgroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsigntemplateformfieldgroupCreateObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupCreateObjectV1) | **POST** /1/object/ezsigntemplateformfieldgroup | Create a new Ezsigntemplateformfieldgroup |
| [**ezsigntemplateformfieldgroupDeleteObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Delete an existing Ezsigntemplateformfieldgroup |
| [**ezsigntemplateformfieldgroupEditObjectV1**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupEditObjectV1) | **PUT** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Edit an existing Ezsigntemplateformfieldgroup |
| [**ezsigntemplateformfieldgroupGetObjectV2**](ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupGetObjectV2) | **GET** /2/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Retrieve an existing Ezsigntemplateformfieldgroup |


<a id="ezsigntemplateformfieldgroupCreateObjectV1"></a>
# **ezsigntemplateformfieldgroupCreateObjectV1**
> EzsigntemplateformfieldgroupCreateObjectV1Response ezsigntemplateformfieldgroupCreateObjectV1(ezsigntemplateformfieldgroupCreateObjectV1Request)

Create a new Ezsigntemplateformfieldgroup

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateformfieldgroupApi()
val ezsigntemplateformfieldgroupCreateObjectV1Request : EzsigntemplateformfieldgroupCreateObjectV1Request =  // EzsigntemplateformfieldgroupCreateObjectV1Request | 
try {
    val result : EzsigntemplateformfieldgroupCreateObjectV1Response = apiInstance.ezsigntemplateformfieldgroupCreateObjectV1(ezsigntemplateformfieldgroupCreateObjectV1Request)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplateformfieldgroupCreateObjectV1Request** | [**EzsigntemplateformfieldgroupCreateObjectV1Request**](EzsigntemplateformfieldgroupCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplateformfieldgroupCreateObjectV1Response**](EzsigntemplateformfieldgroupCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateformfieldgroupDeleteObjectV1"></a>
# **ezsigntemplateformfieldgroupDeleteObjectV1**
> EzsigntemplateformfieldgroupDeleteObjectV1Response ezsigntemplateformfieldgroupDeleteObjectV1(pkiEzsigntemplateformfieldgroupID)

Delete an existing Ezsigntemplateformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateformfieldgroupApi()
val pkiEzsigntemplateformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplateformfieldgroupDeleteObjectV1Response = apiInstance.ezsigntemplateformfieldgroupDeleteObjectV1(pkiEzsigntemplateformfieldgroupID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplateformfieldgroupID** | **kotlin.Int**|  | |

### Return type

[**EzsigntemplateformfieldgroupDeleteObjectV1Response**](EzsigntemplateformfieldgroupDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplateformfieldgroupEditObjectV1"></a>
# **ezsigntemplateformfieldgroupEditObjectV1**
> EzsigntemplateformfieldgroupEditObjectV1Response ezsigntemplateformfieldgroupEditObjectV1(pkiEzsigntemplateformfieldgroupID, ezsigntemplateformfieldgroupEditObjectV1Request)

Edit an existing Ezsigntemplateformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateformfieldgroupApi()
val pkiEzsigntemplateformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplateformfieldgroupEditObjectV1Request : EzsigntemplateformfieldgroupEditObjectV1Request =  // EzsigntemplateformfieldgroupEditObjectV1Request | 
try {
    val result : EzsigntemplateformfieldgroupEditObjectV1Response = apiInstance.ezsigntemplateformfieldgroupEditObjectV1(pkiEzsigntemplateformfieldgroupID, ezsigntemplateformfieldgroupEditObjectV1Request)
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
| **pkiEzsigntemplateformfieldgroupID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplateformfieldgroupEditObjectV1Request** | [**EzsigntemplateformfieldgroupEditObjectV1Request**](EzsigntemplateformfieldgroupEditObjectV1Request.md)|  | |

### Return type

[**EzsigntemplateformfieldgroupEditObjectV1Response**](EzsigntemplateformfieldgroupEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplateformfieldgroupGetObjectV2"></a>
# **ezsigntemplateformfieldgroupGetObjectV2**
> EzsigntemplateformfieldgroupGetObjectV2Response ezsigntemplateformfieldgroupGetObjectV2(pkiEzsigntemplateformfieldgroupID)

Retrieve an existing Ezsigntemplateformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplateformfieldgroupApi()
val pkiEzsigntemplateformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplateformfieldgroupGetObjectV2Response = apiInstance.ezsigntemplateformfieldgroupGetObjectV2(pkiEzsigntemplateformfieldgroupID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplateformfieldgroupID** | **kotlin.Int**|  | |

### Return type

[**EzsigntemplateformfieldgroupGetObjectV2Response**](EzsigntemplateformfieldgroupGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


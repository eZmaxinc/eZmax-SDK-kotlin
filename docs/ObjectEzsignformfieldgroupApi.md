# ObjectEzsignformfieldgroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignformfieldgroupCreateObjectV1**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupCreateObjectV1) | **POST** /1/object/ezsignformfieldgroup | Create a new Ezsignformfieldgroup |
| [**ezsignformfieldgroupDeleteObjectV1**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Delete an existing Ezsignformfieldgroup |
| [**ezsignformfieldgroupEditObjectV1**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupEditObjectV1) | **PUT** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Edit an existing Ezsignformfieldgroup |
| [**ezsignformfieldgroupGetObjectV2**](ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupGetObjectV2) | **GET** /2/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Retrieve an existing Ezsignformfieldgroup |


<a id="ezsignformfieldgroupCreateObjectV1"></a>
# **ezsignformfieldgroupCreateObjectV1**
> EzsignformfieldgroupCreateObjectV1Response ezsignformfieldgroupCreateObjectV1(ezsignformfieldgroupCreateObjectV1Request)

Create a new Ezsignformfieldgroup

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignformfieldgroupApi()
val ezsignformfieldgroupCreateObjectV1Request : EzsignformfieldgroupCreateObjectV1Request =  // EzsignformfieldgroupCreateObjectV1Request | 
try {
    val result : EzsignformfieldgroupCreateObjectV1Response = apiInstance.ezsignformfieldgroupCreateObjectV1(ezsignformfieldgroupCreateObjectV1Request)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignformfieldgroupCreateObjectV1Request** | [**EzsignformfieldgroupCreateObjectV1Request**](EzsignformfieldgroupCreateObjectV1Request.md)|  | |

### Return type

[**EzsignformfieldgroupCreateObjectV1Response**](EzsignformfieldgroupCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignformfieldgroupDeleteObjectV1"></a>
# **ezsignformfieldgroupDeleteObjectV1**
> CommonResponse ezsignformfieldgroupDeleteObjectV1(pkiEzsignformfieldgroupID)

Delete an existing Ezsignformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignformfieldgroupApi()
val pkiEzsignformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CommonResponse = apiInstance.ezsignformfieldgroupDeleteObjectV1(pkiEzsignformfieldgroupID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignformfieldgroupID** | **kotlin.Int**|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignformfieldgroupEditObjectV1"></a>
# **ezsignformfieldgroupEditObjectV1**
> CommonResponse ezsignformfieldgroupEditObjectV1(pkiEzsignformfieldgroupID, ezsignformfieldgroupEditObjectV1Request)

Edit an existing Ezsignformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignformfieldgroupApi()
val pkiEzsignformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
val ezsignformfieldgroupEditObjectV1Request : EzsignformfieldgroupEditObjectV1Request =  // EzsignformfieldgroupEditObjectV1Request | 
try {
    val result : CommonResponse = apiInstance.ezsignformfieldgroupEditObjectV1(pkiEzsignformfieldgroupID, ezsignformfieldgroupEditObjectV1Request)
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
| **pkiEzsignformfieldgroupID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignformfieldgroupEditObjectV1Request** | [**EzsignformfieldgroupEditObjectV1Request**](EzsignformfieldgroupEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignformfieldgroupGetObjectV2"></a>
# **ezsignformfieldgroupGetObjectV2**
> EzsignformfieldgroupGetObjectV2Response ezsignformfieldgroupGetObjectV2(pkiEzsignformfieldgroupID)

Retrieve an existing Ezsignformfieldgroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignformfieldgroupApi()
val pkiEzsignformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignformfieldgroupGetObjectV2Response = apiInstance.ezsignformfieldgroupGetObjectV2(pkiEzsignformfieldgroupID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignformfieldgroupID** | **kotlin.Int**|  | |

### Return type

[**EzsignformfieldgroupGetObjectV2Response**](EzsignformfieldgroupGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


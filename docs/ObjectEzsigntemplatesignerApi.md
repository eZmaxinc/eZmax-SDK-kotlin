# ObjectEzsigntemplatesignerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsigntemplatesignerCreateObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerCreateObjectV1) | **POST** /1/object/ezsigntemplatesigner | Create a new Ezsigntemplatesigner |
| [**ezsigntemplatesignerCreateObjectV2**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerCreateObjectV2) | **POST** /2/object/ezsigntemplatesigner | Create a new Ezsigntemplatesigner |
| [**ezsigntemplatesignerDeleteObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Delete an existing Ezsigntemplatesigner |
| [**ezsigntemplatesignerEditObjectV1**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerEditObjectV1) | **PUT** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Edit an existing Ezsigntemplatesigner |
| [**ezsigntemplatesignerEditObjectV2**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerEditObjectV2) | **PUT** /2/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Edit an existing Ezsigntemplatesigner |
| [**ezsigntemplatesignerGetObjectV2**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerGetObjectV2) | **GET** /2/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Retrieve an existing Ezsigntemplatesigner |
| [**ezsigntemplatesignerGetObjectV3**](ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerGetObjectV3) | **GET** /3/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Retrieve an existing Ezsigntemplatesigner |


<a id="ezsigntemplatesignerCreateObjectV1"></a>
# **ezsigntemplatesignerCreateObjectV1**
> EzsigntemplatesignerCreateObjectV1Response ezsigntemplatesignerCreateObjectV1(ezsigntemplatesignerCreateObjectV1Request)

Create a new Ezsigntemplatesigner

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignerApi()
val ezsigntemplatesignerCreateObjectV1Request : EzsigntemplatesignerCreateObjectV1Request =  // EzsigntemplatesignerCreateObjectV1Request | 
try {
    val result : EzsigntemplatesignerCreateObjectV1Response = apiInstance.ezsigntemplatesignerCreateObjectV1(ezsigntemplatesignerCreateObjectV1Request)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatesignerCreateObjectV1Request** | [**EzsigntemplatesignerCreateObjectV1Request**](EzsigntemplatesignerCreateObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatesignerCreateObjectV1Response**](EzsigntemplatesignerCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatesignerCreateObjectV2"></a>
# **ezsigntemplatesignerCreateObjectV2**
> EzsigntemplatesignerCreateObjectV2Response ezsigntemplatesignerCreateObjectV2(ezsigntemplatesignerCreateObjectV2Request)

Create a new Ezsigntemplatesigner

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignerApi()
val ezsigntemplatesignerCreateObjectV2Request : EzsigntemplatesignerCreateObjectV2Request =  // EzsigntemplatesignerCreateObjectV2Request | 
try {
    val result : EzsigntemplatesignerCreateObjectV2Response = apiInstance.ezsigntemplatesignerCreateObjectV2(ezsigntemplatesignerCreateObjectV2Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerCreateObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerCreateObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatesignerCreateObjectV2Request** | [**EzsigntemplatesignerCreateObjectV2Request**](EzsigntemplatesignerCreateObjectV2Request.md)|  | |

### Return type

[**EzsigntemplatesignerCreateObjectV2Response**](EzsigntemplatesignerCreateObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatesignerDeleteObjectV1"></a>
# **ezsigntemplatesignerDeleteObjectV1**
> EzsigntemplatesignerDeleteObjectV1Response ezsigntemplatesignerDeleteObjectV1(pkiEzsigntemplatesignerID)

Delete an existing Ezsigntemplatesigner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignerApi()
val pkiEzsigntemplatesignerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatesignerDeleteObjectV1Response = apiInstance.ezsigntemplatesignerDeleteObjectV1(pkiEzsigntemplatesignerID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatesignerID** | **kotlin.Int**|  | |

### Return type

[**EzsigntemplatesignerDeleteObjectV1Response**](EzsigntemplatesignerDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatesignerEditObjectV1"></a>
# **ezsigntemplatesignerEditObjectV1**
> EzsigntemplatesignerEditObjectV1Response ezsigntemplatesignerEditObjectV1(pkiEzsigntemplatesignerID, ezsigntemplatesignerEditObjectV1Request)

Edit an existing Ezsigntemplatesigner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignerApi()
val pkiEzsigntemplatesignerID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatesignerEditObjectV1Request : EzsigntemplatesignerEditObjectV1Request =  // EzsigntemplatesignerEditObjectV1Request | 
try {
    val result : EzsigntemplatesignerEditObjectV1Response = apiInstance.ezsigntemplatesignerEditObjectV1(pkiEzsigntemplatesignerID, ezsigntemplatesignerEditObjectV1Request)
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
| **pkiEzsigntemplatesignerID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatesignerEditObjectV1Request** | [**EzsigntemplatesignerEditObjectV1Request**](EzsigntemplatesignerEditObjectV1Request.md)|  | |

### Return type

[**EzsigntemplatesignerEditObjectV1Response**](EzsigntemplatesignerEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatesignerEditObjectV2"></a>
# **ezsigntemplatesignerEditObjectV2**
> EzsigntemplatesignerEditObjectV2Response ezsigntemplatesignerEditObjectV2(pkiEzsigntemplatesignerID, ezsigntemplatesignerEditObjectV2Request)

Edit an existing Ezsigntemplatesigner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignerApi()
val pkiEzsigntemplatesignerID : kotlin.Int = 56 // kotlin.Int | 
val ezsigntemplatesignerEditObjectV2Request : EzsigntemplatesignerEditObjectV2Request =  // EzsigntemplatesignerEditObjectV2Request | 
try {
    val result : EzsigntemplatesignerEditObjectV2Response = apiInstance.ezsigntemplatesignerEditObjectV2(pkiEzsigntemplatesignerID, ezsigntemplatesignerEditObjectV2Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerEditObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerEditObjectV2")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsigntemplatesignerID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsigntemplatesignerEditObjectV2Request** | [**EzsigntemplatesignerEditObjectV2Request**](EzsigntemplatesignerEditObjectV2Request.md)|  | |

### Return type

[**EzsigntemplatesignerEditObjectV2Response**](EzsigntemplatesignerEditObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsigntemplatesignerGetObjectV2"></a>
# **ezsigntemplatesignerGetObjectV2**
> EzsigntemplatesignerGetObjectV2Response ezsigntemplatesignerGetObjectV2(pkiEzsigntemplatesignerID)

Retrieve an existing Ezsigntemplatesigner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignerApi()
val pkiEzsigntemplatesignerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatesignerGetObjectV2Response = apiInstance.ezsigntemplatesignerGetObjectV2(pkiEzsigntemplatesignerID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatesignerID** | **kotlin.Int**|  | |

### Return type

[**EzsigntemplatesignerGetObjectV2Response**](EzsigntemplatesignerGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsigntemplatesignerGetObjectV3"></a>
# **ezsigntemplatesignerGetObjectV3**
> EzsigntemplatesignerGetObjectV3Response ezsigntemplatesignerGetObjectV3(pkiEzsigntemplatesignerID)

Retrieve an existing Ezsigntemplatesigner



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsigntemplatesignerApi()
val pkiEzsigntemplatesignerID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsigntemplatesignerGetObjectV3Response = apiInstance.ezsigntemplatesignerGetObjectV3(pkiEzsigntemplatesignerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerGetObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsigntemplatesignerApi#ezsigntemplatesignerGetObjectV3")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatesignerID** | **kotlin.Int**|  | |

### Return type

[**EzsigntemplatesignerGetObjectV3Response**](EzsigntemplatesignerGetObjectV3Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


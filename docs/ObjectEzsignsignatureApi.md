# ObjectEzsignsignatureApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignsignatureCreateObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature |
| [**ezsignsignatureCreateObjectV2**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV2) | **POST** /2/object/ezsignsignature | Create a new Ezsignsignature |
| [**ezsignsignatureCreateObjectV3**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV3) | **POST** /3/object/ezsignsignature | Create a new Ezsignsignature |
| [**ezsignsignatureCreateObjectV4**](ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV4) | **POST** /4/object/ezsignsignature | Create a new Ezsignsignature |
| [**ezsignsignatureDeleteObjectV1**](ObjectEzsignsignatureApi.md#ezsignsignatureDeleteObjectV1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature |
| [**ezsignsignatureEditObjectV3**](ObjectEzsignsignatureApi.md#ezsignsignatureEditObjectV3) | **PUT** /3/object/ezsignsignature/{pkiEzsignsignatureID} | Edit an existing Ezsignsignature |
| [**ezsignsignatureGetEzsignsignatureattachmentV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetEzsignsignatureattachmentV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID}/getEzsignsignatureattachment | Retrieve an existing Ezsignsignature&#39;s Ezsignsignatureattachments |
| [**ezsignsignatureGetEzsignsignaturesAutomaticV1**](ObjectEzsignsignatureApi.md#ezsignsignatureGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsignsignature/getEzsignsignaturesAutomatic | Retrieve all automatic Ezsignsignatures |
| [**ezsignsignatureGetObjectV4**](ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectV4) | **GET** /4/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature |
| [**ezsignsignatureSignV1**](ObjectEzsignsignatureApi.md#ezsignsignatureSignV1) | **POST** /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign | Sign the Ezsignsignature |


<a id="ezsignsignatureCreateObjectV1"></a>
# **ezsignsignatureCreateObjectV1**
> EzsignsignatureCreateObjectV1Response ezsignsignatureCreateObjectV1(ezsignsignatureCreateObjectV1Request)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.  Major step overhaul.  Endpoints that existed before version 1.3 do not allow you to combine forms and signatures in the same step. The step numbers are different from those indicated by endpoints added since version 1.3. This endpoint is compatible with endpoints that existed before 1.3 but are not compatible with those added since 1.3.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val ezsignsignatureCreateObjectV1Request : kotlin.collections.List<EzsignsignatureCreateObjectV1Request> =  // kotlin.collections.List<EzsignsignatureCreateObjectV1Request> | 
try {
    val result : EzsignsignatureCreateObjectV1Response = apiInstance.ezsignsignatureCreateObjectV1(ezsignsignatureCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignsignatureCreateObjectV1Request** | [**kotlin.collections.List&lt;EzsignsignatureCreateObjectV1Request&gt;**](EzsignsignatureCreateObjectV1Request.md)|  | |

### Return type

[**EzsignsignatureCreateObjectV1Response**](EzsignsignatureCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignatureCreateObjectV2"></a>
# **ezsignsignatureCreateObjectV2**
> EzsignsignatureCreateObjectV2Response ezsignsignatureCreateObjectV2(ezsignsignatureCreateObjectV2Request)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.  Major step overhaul.  Endpoints that existed before version 1.3 do not allow you to combine forms and signatures in the same step. The step numbers are different from those indicated by endpoints added since version 1.3. This endpoint is compatible with endpoints that existed before 1.3 but are not compatible with those added since 1.3.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val ezsignsignatureCreateObjectV2Request : EzsignsignatureCreateObjectV2Request =  // EzsignsignatureCreateObjectV2Request | 
try {
    val result : EzsignsignatureCreateObjectV2Response = apiInstance.ezsignsignatureCreateObjectV2(ezsignsignatureCreateObjectV2Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignsignatureCreateObjectV2Request** | [**EzsignsignatureCreateObjectV2Request**](EzsignsignatureCreateObjectV2Request.md)|  | |

### Return type

[**EzsignsignatureCreateObjectV2Response**](EzsignsignatureCreateObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignatureCreateObjectV3"></a>
# **ezsignsignatureCreateObjectV3**
> EzsignsignatureCreateObjectV3Response ezsignsignatureCreateObjectV3(ezsignsignatureCreateObjectV3Request)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.  Major step overhaul.  Endpoints that existed before version 1.3 do not allow you to combine forms and signatures in the same step. The step numbers are different from those indicated by endpoints added since version 1.3. This endpoint is compatible with endpoints that existed before 1.3 but are not compatible with those added since 1.3.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val ezsignsignatureCreateObjectV3Request : EzsignsignatureCreateObjectV3Request =  // EzsignsignatureCreateObjectV3Request | 
try {
    val result : EzsignsignatureCreateObjectV3Response = apiInstance.ezsignsignatureCreateObjectV3(ezsignsignatureCreateObjectV3Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV3")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignsignatureCreateObjectV3Request** | [**EzsignsignatureCreateObjectV3Request**](EzsignsignatureCreateObjectV3Request.md)|  | |

### Return type

[**EzsignsignatureCreateObjectV3Response**](EzsignsignatureCreateObjectV3Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignatureCreateObjectV4"></a>
# **ezsignsignatureCreateObjectV4**
> EzsignsignatureCreateObjectV4Response ezsignsignatureCreateObjectV4(ezsignsignatureCreateObjectV4Request)

Create a new Ezsignsignature

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val ezsignsignatureCreateObjectV4Request : EzsignsignatureCreateObjectV4Request =  // EzsignsignatureCreateObjectV4Request | 
try {
    val result : EzsignsignatureCreateObjectV4Response = apiInstance.ezsignsignatureCreateObjectV4(ezsignsignatureCreateObjectV4Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV4")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureCreateObjectV4")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignsignatureCreateObjectV4Request** | [**EzsignsignatureCreateObjectV4Request**](EzsignsignatureCreateObjectV4Request.md)|  | |

### Return type

[**EzsignsignatureCreateObjectV4Response**](EzsignsignatureCreateObjectV4Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignatureDeleteObjectV1"></a>
# **ezsignsignatureDeleteObjectV1**
> EzsignsignatureDeleteObjectV1Response ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID)

Delete an existing Ezsignsignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignsignatureDeleteObjectV1Response = apiInstance.ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignsignatureID** | **kotlin.Int**|  | |

### Return type

[**EzsignsignatureDeleteObjectV1Response**](EzsignsignatureDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignatureEditObjectV3"></a>
# **ezsignsignatureEditObjectV3**
> EzsignsignatureEditObjectV3Response ezsignsignatureEditObjectV3(pkiEzsignsignatureID, ezsignsignatureEditObjectV3Request)

Edit an existing Ezsignsignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | 
val ezsignsignatureEditObjectV3Request : EzsignsignatureEditObjectV3Request =  // EzsignsignatureEditObjectV3Request | 
try {
    val result : EzsignsignatureEditObjectV3Response = apiInstance.ezsignsignatureEditObjectV3(pkiEzsignsignatureID, ezsignsignatureEditObjectV3Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureEditObjectV3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureEditObjectV3")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignsignatureID** | **kotlin.Int**|  | |
| **ezsignsignatureEditObjectV3Request** | [**EzsignsignatureEditObjectV3Request**](EzsignsignatureEditObjectV3Request.md)|  | |

### Return type

[**EzsignsignatureEditObjectV3Response**](EzsignsignatureEditObjectV3Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignatureGetEzsignsignatureattachmentV1"></a>
# **ezsignsignatureGetEzsignsignatureattachmentV1**
> EzsignsignatureGetEzsignsignatureattachmentV1Response ezsignsignatureGetEzsignsignatureattachmentV1(pkiEzsignsignatureID)

Retrieve an existing Ezsignsignature&#39;s Ezsignsignatureattachments

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignsignatureGetEzsignsignatureattachmentV1Response = apiInstance.ezsignsignatureGetEzsignsignatureattachmentV1(pkiEzsignsignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetEzsignsignatureattachmentV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetEzsignsignatureattachmentV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignsignatureID** | **kotlin.Int**|  | |

### Return type

[**EzsignsignatureGetEzsignsignatureattachmentV1Response**](EzsignsignatureGetEzsignsignatureattachmentV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignatureGetEzsignsignaturesAutomaticV1"></a>
# **ezsignsignatureGetEzsignsignaturesAutomaticV1**
> EzsignsignatureGetEzsignsignaturesAutomaticV1Response ezsignsignatureGetEzsignsignaturesAutomaticV1()

Retrieve all automatic Ezsignsignatures

Return all the Ezsignsignatures that can be signed by the current user

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
try {
    val result : EzsignsignatureGetEzsignsignaturesAutomaticV1Response = apiInstance.ezsignsignatureGetEzsignsignaturesAutomaticV1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetEzsignsignaturesAutomaticV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetEzsignsignaturesAutomaticV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EzsignsignatureGetEzsignsignaturesAutomaticV1Response**](EzsignsignatureGetEzsignsignaturesAutomaticV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignatureGetObjectV4"></a>
# **ezsignsignatureGetObjectV4**
> EzsignsignatureGetObjectV4Response ezsignsignatureGetObjectV4(pkiEzsignsignatureID)

Retrieve an existing Ezsignsignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignsignatureGetObjectV4Response = apiInstance.ezsignsignatureGetObjectV4(pkiEzsignsignatureID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectV4")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureGetObjectV4")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignsignatureID** | **kotlin.Int**|  | |

### Return type

[**EzsignsignatureGetObjectV4Response**](EzsignsignatureGetObjectV4Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignatureSignV1"></a>
# **ezsignsignatureSignV1**
> EzsignsignatureSignV1Response ezsignsignatureSignV1(pkiEzsignsignatureID, ezsignsignatureSignV1Request)

Sign the Ezsignsignature



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignatureApi()
val pkiEzsignsignatureID : kotlin.Int = 56 // kotlin.Int | 
val ezsignsignatureSignV1Request : EzsignsignatureSignV1Request =  // EzsignsignatureSignV1Request | 
try {
    val result : EzsignsignatureSignV1Response = apiInstance.ezsignsignatureSignV1(pkiEzsignsignatureID, ezsignsignatureSignV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignatureApi#ezsignsignatureSignV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignatureApi#ezsignsignatureSignV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignsignatureID** | **kotlin.Int**|  | |
| **ezsignsignatureSignV1Request** | [**EzsignsignatureSignV1Request**](EzsignsignatureSignV1Request.md)|  | |

### Return type

[**EzsignsignatureSignV1Response**](EzsignsignatureSignV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


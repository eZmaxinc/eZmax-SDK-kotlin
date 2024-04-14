# ObjectEzsignfoldersignerassociationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfoldersignerassociationCreateEmbeddedUrlV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateEmbeddedUrlV1) | **POST** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/createEmbeddedUrl | Creates an Url to allow embedded signing
[**ezsignfoldersignerassociationCreateObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationCreateObjectV2**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV2) | **POST** /2/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationDeleteObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationDeleteObjectV1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationEditObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationEditObjectV1) | **PUT** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Edit an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationForceDisconnectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationForceDisconnectV1) | **POST** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/forceDisconnect | Disconnects the Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetInPersonLoginUrlV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
[**ezsignfoldersignerassociationGetObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationGetObjectV2**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectV2) | **GET** /2/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationPatchObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationPatchObjectV1) | **PATCH** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Patch an existing Ezsignfoldersignerassociation


<a id="ezsignfoldersignerassociationCreateEmbeddedUrlV1"></a>
# **ezsignfoldersignerassociationCreateEmbeddedUrlV1**
> EzsignfoldersignerassociationCreateEmbeddedUrlV1Response ezsignfoldersignerassociationCreateEmbeddedUrlV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationCreateEmbeddedUrlV1Request)

Creates an Url to allow embedded signing

This endpoint creates an Url that can be used in a browser or embedded in an I-Frame to allow signing.  The signer Login type must be configured as Embedded.  There will be a list to retrieve informations after the signing happens in the embedded version. To do so, there is a list of parameter to add to your sReturnUrl.  In example: https://www.example.com/sReturl?sParameter1&amp;sParameter2. The sParameter1 et sParameter2 will be replace when we will redirect on the url.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val pkiEzsignfoldersignerassociationID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfoldersignerassociationCreateEmbeddedUrlV1Request : EzsignfoldersignerassociationCreateEmbeddedUrlV1Request =  // EzsignfoldersignerassociationCreateEmbeddedUrlV1Request | 
try {
    val result : EzsignfoldersignerassociationCreateEmbeddedUrlV1Response = apiInstance.ezsignfoldersignerassociationCreateEmbeddedUrlV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationCreateEmbeddedUrlV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationCreateEmbeddedUrlV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationCreateEmbeddedUrlV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **kotlin.Int**|  |
 **ezsignfoldersignerassociationCreateEmbeddedUrlV1Request** | [**EzsignfoldersignerassociationCreateEmbeddedUrlV1Request**](EzsignfoldersignerassociationCreateEmbeddedUrlV1Request.md)|  |

### Return type

[**EzsignfoldersignerassociationCreateEmbeddedUrlV1Response**](EzsignfoldersignerassociationCreateEmbeddedUrlV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfoldersignerassociationCreateObjectV1"></a>
# **ezsignfoldersignerassociationCreateObjectV1**
> EzsignfoldersignerassociationCreateObjectV1Response ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationCreateObjectV1Request)

Create a new Ezsignfoldersignerassociation

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val ezsignfoldersignerassociationCreateObjectV1Request : kotlin.collections.List<EzsignfoldersignerassociationCreateObjectV1Request> =  // kotlin.collections.List<EzsignfoldersignerassociationCreateObjectV1Request> | 
try {
    val result : EzsignfoldersignerassociationCreateObjectV1Response = apiInstance.ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfoldersignerassociationCreateObjectV1Request** | [**kotlin.collections.List&lt;EzsignfoldersignerassociationCreateObjectV1Request&gt;**](EzsignfoldersignerassociationCreateObjectV1Request.md)|  |

### Return type

[**EzsignfoldersignerassociationCreateObjectV1Response**](EzsignfoldersignerassociationCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfoldersignerassociationCreateObjectV2"></a>
# **ezsignfoldersignerassociationCreateObjectV2**
> EzsignfoldersignerassociationCreateObjectV2Response ezsignfoldersignerassociationCreateObjectV2(ezsignfoldersignerassociationCreateObjectV2Request)

Create a new Ezsignfoldersignerassociation

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val ezsignfoldersignerassociationCreateObjectV2Request : EzsignfoldersignerassociationCreateObjectV2Request =  // EzsignfoldersignerassociationCreateObjectV2Request | 
try {
    val result : EzsignfoldersignerassociationCreateObjectV2Response = apiInstance.ezsignfoldersignerassociationCreateObjectV2(ezsignfoldersignerassociationCreateObjectV2Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationCreateObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationCreateObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfoldersignerassociationCreateObjectV2Request** | [**EzsignfoldersignerassociationCreateObjectV2Request**](EzsignfoldersignerassociationCreateObjectV2Request.md)|  |

### Return type

[**EzsignfoldersignerassociationCreateObjectV2Response**](EzsignfoldersignerassociationCreateObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfoldersignerassociationDeleteObjectV1"></a>
# **ezsignfoldersignerassociationDeleteObjectV1**
> EzsignfoldersignerassociationDeleteObjectV1Response ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID)

Delete an existing Ezsignfoldersignerassociation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val pkiEzsignfoldersignerassociationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfoldersignerassociationDeleteObjectV1Response = apiInstance.ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **kotlin.Int**|  |

### Return type

[**EzsignfoldersignerassociationDeleteObjectV1Response**](EzsignfoldersignerassociationDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfoldersignerassociationEditObjectV1"></a>
# **ezsignfoldersignerassociationEditObjectV1**
> EzsignfoldersignerassociationEditObjectV1Response ezsignfoldersignerassociationEditObjectV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationEditObjectV1Request)

Edit an existing Ezsignfoldersignerassociation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val pkiEzsignfoldersignerassociationID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfoldersignerassociationEditObjectV1Request : EzsignfoldersignerassociationEditObjectV1Request =  // EzsignfoldersignerassociationEditObjectV1Request | 
try {
    val result : EzsignfoldersignerassociationEditObjectV1Response = apiInstance.ezsignfoldersignerassociationEditObjectV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **kotlin.Int**|  |
 **ezsignfoldersignerassociationEditObjectV1Request** | [**EzsignfoldersignerassociationEditObjectV1Request**](EzsignfoldersignerassociationEditObjectV1Request.md)|  |

### Return type

[**EzsignfoldersignerassociationEditObjectV1Response**](EzsignfoldersignerassociationEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfoldersignerassociationForceDisconnectV1"></a>
# **ezsignfoldersignerassociationForceDisconnectV1**
> EzsignfoldersignerassociationForceDisconnectV1Response ezsignfoldersignerassociationForceDisconnectV1(pkiEzsignfoldersignerassociationID, body)

Disconnects the Ezsignfoldersignerassociation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val pkiEzsignfoldersignerassociationID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EzsignfoldersignerassociationForceDisconnectV1Response = apiInstance.ezsignfoldersignerassociationForceDisconnectV1(pkiEzsignfoldersignerassociationID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationForceDisconnectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationForceDisconnectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **kotlin.Int**|  |
 **body** | **kotlin.Any**|  |

### Return type

[**EzsignfoldersignerassociationForceDisconnectV1Response**](EzsignfoldersignerassociationForceDisconnectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignfoldersignerassociationGetInPersonLoginUrlV1"></a>
# **ezsignfoldersignerassociationGetInPersonLoginUrlV1**
> EzsignfoldersignerassociationGetInPersonLoginUrlV1Response ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID)

Retrieve a Login Url to allow In-Person signing

This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val pkiEzsignfoldersignerassociationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfoldersignerassociationGetInPersonLoginUrlV1Response = apiInstance.ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetInPersonLoginUrlV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetInPersonLoginUrlV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **kotlin.Int**|  |

### Return type

[**EzsignfoldersignerassociationGetInPersonLoginUrlV1Response**](EzsignfoldersignerassociationGetInPersonLoginUrlV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfoldersignerassociationGetObjectV1"></a>
# **ezsignfoldersignerassociationGetObjectV1**
> EzsignfoldersignerassociationGetObjectV1Response ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID)

Retrieve an existing Ezsignfoldersignerassociation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val pkiEzsignfoldersignerassociationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfoldersignerassociationGetObjectV1Response = apiInstance.ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **kotlin.Int**|  |

### Return type

[**EzsignfoldersignerassociationGetObjectV1Response**](EzsignfoldersignerassociationGetObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfoldersignerassociationGetObjectV2"></a>
# **ezsignfoldersignerassociationGetObjectV2**
> EzsignfoldersignerassociationGetObjectV2Response ezsignfoldersignerassociationGetObjectV2(pkiEzsignfoldersignerassociationID)

Retrieve an existing Ezsignfoldersignerassociation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val pkiEzsignfoldersignerassociationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfoldersignerassociationGetObjectV2Response = apiInstance.ezsignfoldersignerassociationGetObjectV2(pkiEzsignfoldersignerassociationID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **kotlin.Int**|  |

### Return type

[**EzsignfoldersignerassociationGetObjectV2Response**](EzsignfoldersignerassociationGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignfoldersignerassociationPatchObjectV1"></a>
# **ezsignfoldersignerassociationPatchObjectV1**
> EzsignfoldersignerassociationPatchObjectV1Response ezsignfoldersignerassociationPatchObjectV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationPatchObjectV1Request)

Patch an existing Ezsignfoldersignerassociation

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val pkiEzsignfoldersignerassociationID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfoldersignerassociationPatchObjectV1Request : EzsignfoldersignerassociationPatchObjectV1Request =  // EzsignfoldersignerassociationPatchObjectV1Request | 
try {
    val result : EzsignfoldersignerassociationPatchObjectV1Response = apiInstance.ezsignfoldersignerassociationPatchObjectV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationPatchObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationPatchObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationPatchObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **kotlin.Int**|  |
 **ezsignfoldersignerassociationPatchObjectV1Request** | [**EzsignfoldersignerassociationPatchObjectV1Request**](EzsignfoldersignerassociationPatchObjectV1Request.md)|  |

### Return type

[**EzsignfoldersignerassociationPatchObjectV1Response**](EzsignfoldersignerassociationPatchObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


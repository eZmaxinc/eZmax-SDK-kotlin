# ObjectEzsignfoldersignerassociationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfoldersignerassociationCreateObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationCreateObjectV2**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV2) | **POST** /2/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationDeleteObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationDeleteObjectV1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationEditObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationEditObjectV1) | **PUT** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Edit an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetInPersonLoginUrlV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
[**ezsignfoldersignerassociationGetObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation


<a name="ezsignfoldersignerassociationCreateObjectV1"></a>
# **ezsignfoldersignerassociationCreateObjectV1**
> EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsignfoldersignerassociation

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest : kotlin.collections.List<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest> =  // kotlin.collections.List<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest> | 
try {
    val result : EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest)
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
 **ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest** | [**kotlin.collections.List&lt;EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest&gt;**](EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse**](EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignfoldersignerassociationCreateObjectV2"></a>
# **ezsignfoldersignerassociationCreateObjectV2**
> EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusResponse ezsignfoldersignerassociationCreateObjectV2(ezsignfoldersignerassociationMinusCreateObjectMinusV2MinusRequest)

Create a new Ezsignfoldersignerassociation

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val ezsignfoldersignerassociationMinusCreateObjectMinusV2MinusRequest : EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusRequest =  // EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusRequest | 
try {
    val result : EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusResponse = apiInstance.ezsignfoldersignerassociationCreateObjectV2(ezsignfoldersignerassociationMinusCreateObjectMinusV2MinusRequest)
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
 **ezsignfoldersignerassociationMinusCreateObjectMinusV2MinusRequest** | [**EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusRequest**](EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusRequest.md)|  |

### Return type

[**EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusResponse**](EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignfoldersignerassociationDeleteObjectV1"></a>
# **ezsignfoldersignerassociationDeleteObjectV1**
> EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID)

Delete an existing Ezsignfoldersignerassociation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val pkiEzsignfoldersignerassociationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID)
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

[**EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse**](EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignfoldersignerassociationEditObjectV1"></a>
# **ezsignfoldersignerassociationEditObjectV1**
> EzsignfoldersignerassociationMinusEditObjectMinusV1MinusResponse ezsignfoldersignerassociationEditObjectV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsignfoldersignerassociation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val pkiEzsignfoldersignerassociationID : kotlin.Int = 56 // kotlin.Int | 
val ezsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest : EzsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest =  // EzsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsignfoldersignerassociationMinusEditObjectMinusV1MinusResponse = apiInstance.ezsignfoldersignerassociationEditObjectV1(pkiEzsignfoldersignerassociationID, ezsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest)
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
 **ezsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest** | [**EzsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest**](EzsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignfoldersignerassociationMinusEditObjectMinusV1MinusResponse**](EzsignfoldersignerassociationMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ezsignfoldersignerassociationGetInPersonLoginUrlV1"></a>
# **ezsignfoldersignerassociationGetInPersonLoginUrlV1**
> EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID)

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
    val result : EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse = apiInstance.ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID)
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

[**EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse**](EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezsignfoldersignerassociationGetObjectV1"></a>
# **ezsignfoldersignerassociationGetObjectV1**
> EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID)

Retrieve an existing Ezsignfoldersignerassociation



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignfoldersignerassociationApi()
val pkiEzsignfoldersignerassociationID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse = apiInstance.ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID)
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

[**EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse**](EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectEzsignsignergroupmembershipApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignsignergroupmembershipCreateObjectV1**](ObjectEzsignsignergroupmembershipApi.md#ezsignsignergroupmembershipCreateObjectV1) | **POST** /1/object/ezsignsignergroupmembership | Create a new Ezsignsignergroupmembership |
| [**ezsignsignergroupmembershipDeleteObjectV1**](ObjectEzsignsignergroupmembershipApi.md#ezsignsignergroupmembershipDeleteObjectV1) | **DELETE** /1/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID} | Delete an existing Ezsignsignergroupmembership |
| [**ezsignsignergroupmembershipGetObjectV2**](ObjectEzsignsignergroupmembershipApi.md#ezsignsignergroupmembershipGetObjectV2) | **GET** /2/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID} | Retrieve an existing Ezsignsignergroupmembership |


<a id="ezsignsignergroupmembershipCreateObjectV1"></a>
# **ezsignsignergroupmembershipCreateObjectV1**
> EzsignsignergroupmembershipCreateObjectV1Response ezsignsignergroupmembershipCreateObjectV1(ezsignsignergroupmembershipCreateObjectV1Request)

Create a new Ezsignsignergroupmembership

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupmembershipApi()
val ezsignsignergroupmembershipCreateObjectV1Request : EzsignsignergroupmembershipCreateObjectV1Request =  // EzsignsignergroupmembershipCreateObjectV1Request | 
try {
    val result : EzsignsignergroupmembershipCreateObjectV1Response = apiInstance.ezsignsignergroupmembershipCreateObjectV1(ezsignsignergroupmembershipCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignergroupmembershipApi#ezsignsignergroupmembershipCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignergroupmembershipApi#ezsignsignergroupmembershipCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignsignergroupmembershipCreateObjectV1Request** | [**EzsignsignergroupmembershipCreateObjectV1Request**](EzsignsignergroupmembershipCreateObjectV1Request.md)|  | |

### Return type

[**EzsignsignergroupmembershipCreateObjectV1Response**](EzsignsignergroupmembershipCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignergroupmembershipDeleteObjectV1"></a>
# **ezsignsignergroupmembershipDeleteObjectV1**
> EzsignsignergroupmembershipDeleteObjectV1Response ezsignsignergroupmembershipDeleteObjectV1(pkiEzsignsignergroupmembershipID)

Delete an existing Ezsignsignergroupmembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupmembershipApi()
val pkiEzsignsignergroupmembershipID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignergroupmembership
try {
    val result : EzsignsignergroupmembershipDeleteObjectV1Response = apiInstance.ezsignsignergroupmembershipDeleteObjectV1(pkiEzsignsignergroupmembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignergroupmembershipApi#ezsignsignergroupmembershipDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignergroupmembershipApi#ezsignsignergroupmembershipDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignsignergroupmembershipID** | **kotlin.Int**| The unique ID of the Ezsignsignergroupmembership | |

### Return type

[**EzsignsignergroupmembershipDeleteObjectV1Response**](EzsignsignergroupmembershipDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignergroupmembershipGetObjectV2"></a>
# **ezsignsignergroupmembershipGetObjectV2**
> EzsignsignergroupmembershipGetObjectV2Response ezsignsignergroupmembershipGetObjectV2(pkiEzsignsignergroupmembershipID)

Retrieve an existing Ezsignsignergroupmembership



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupmembershipApi()
val pkiEzsignsignergroupmembershipID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignergroupmembership
try {
    val result : EzsignsignergroupmembershipGetObjectV2Response = apiInstance.ezsignsignergroupmembershipGetObjectV2(pkiEzsignsignergroupmembershipID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignergroupmembershipApi#ezsignsignergroupmembershipGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignergroupmembershipApi#ezsignsignergroupmembershipGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignsignergroupmembershipID** | **kotlin.Int**| The unique ID of the Ezsignsignergroupmembership | |

### Return type

[**EzsignsignergroupmembershipGetObjectV2Response**](EzsignsignergroupmembershipGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


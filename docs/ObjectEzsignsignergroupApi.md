# ObjectEzsignsignergroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignsignergroupCreateObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupCreateObjectV1) | **POST** /1/object/ezsignsignergroup | Create a new Ezsignsignergroup |
| [**ezsignsignergroupDeleteObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupDeleteObjectV1) | **DELETE** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Delete an existing Ezsignsignergroup |
| [**ezsignsignergroupEditEzsignsignergroupmembershipsV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupEditEzsignsignergroupmembershipsV1) | **PUT** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/editEzsignsignergroupmemberships | Edit multiple Ezsignsignergroupmemberships |
| [**ezsignsignergroupEditObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupEditObjectV1) | **PUT** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Edit an existing Ezsignsignergroup |
| [**ezsignsignergroupGetEzsignsignergroupmembershipsV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupGetEzsignsignergroupmembershipsV1) | **GET** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/getEzsignsignergroupmemberships | Retrieve an existing Ezsignsignergroup&#39;s Ezsignsignergroupmemberships |
| [**ezsignsignergroupGetObjectV2**](ObjectEzsignsignergroupApi.md#ezsignsignergroupGetObjectV2) | **GET** /2/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Retrieve an existing Ezsignsignergroup |


<a id="ezsignsignergroupCreateObjectV1"></a>
# **ezsignsignergroupCreateObjectV1**
> EzsignsignergroupCreateObjectV1Response ezsignsignergroupCreateObjectV1(ezsignsignergroupCreateObjectV1Request)

Create a new Ezsignsignergroup

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val ezsignsignergroupCreateObjectV1Request : EzsignsignergroupCreateObjectV1Request =  // EzsignsignergroupCreateObjectV1Request | 
try {
    val result : EzsignsignergroupCreateObjectV1Response = apiInstance.ezsignsignergroupCreateObjectV1(ezsignsignergroupCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignsignergroupCreateObjectV1Request** | [**EzsignsignergroupCreateObjectV1Request**](EzsignsignergroupCreateObjectV1Request.md)|  | |

### Return type

[**EzsignsignergroupCreateObjectV1Response**](EzsignsignergroupCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignergroupDeleteObjectV1"></a>
# **ezsignsignergroupDeleteObjectV1**
> EzsignsignergroupDeleteObjectV1Response ezsignsignergroupDeleteObjectV1(pkiEzsignsignergroupID)

Delete an existing Ezsignsignergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val pkiEzsignsignergroupID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignergroup
try {
    val result : EzsignsignergroupDeleteObjectV1Response = apiInstance.ezsignsignergroupDeleteObjectV1(pkiEzsignsignergroupID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignsignergroupID** | **kotlin.Int**| The unique ID of the Ezsignsignergroup | |

### Return type

[**EzsignsignergroupDeleteObjectV1Response**](EzsignsignergroupDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignergroupEditEzsignsignergroupmembershipsV1"></a>
# **ezsignsignergroupEditEzsignsignergroupmembershipsV1**
> EzsignsignergroupEditEzsignsignergroupmembershipsV1Response ezsignsignergroupEditEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID, ezsignsignergroupEditEzsignsignergroupmembershipsV1Request)

Edit multiple Ezsignsignergroupmemberships

Using this endpoint, you can edit multiple Ezsignsignergroupmemberships at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val pkiEzsignsignergroupID : kotlin.Int = 56 // kotlin.Int | 
val ezsignsignergroupEditEzsignsignergroupmembershipsV1Request : EzsignsignergroupEditEzsignsignergroupmembershipsV1Request =  // EzsignsignergroupEditEzsignsignergroupmembershipsV1Request | 
try {
    val result : EzsignsignergroupEditEzsignsignergroupmembershipsV1Response = apiInstance.ezsignsignergroupEditEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID, ezsignsignergroupEditEzsignsignergroupmembershipsV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupEditEzsignsignergroupmembershipsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupEditEzsignsignergroupmembershipsV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsignsignergroupID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignsignergroupEditEzsignsignergroupmembershipsV1Request** | [**EzsignsignergroupEditEzsignsignergroupmembershipsV1Request**](EzsignsignergroupEditEzsignsignergroupmembershipsV1Request.md)|  | |

### Return type

[**EzsignsignergroupEditEzsignsignergroupmembershipsV1Response**](EzsignsignergroupEditEzsignsignergroupmembershipsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignergroupEditObjectV1"></a>
# **ezsignsignergroupEditObjectV1**
> EzsignsignergroupEditObjectV1Response ezsignsignergroupEditObjectV1(pkiEzsignsignergroupID, ezsignsignergroupEditObjectV1Request)

Edit an existing Ezsignsignergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val pkiEzsignsignergroupID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignergroup
val ezsignsignergroupEditObjectV1Request : EzsignsignergroupEditObjectV1Request =  // EzsignsignergroupEditObjectV1Request | 
try {
    val result : EzsignsignergroupEditObjectV1Response = apiInstance.ezsignsignergroupEditObjectV1(pkiEzsignsignergroupID, ezsignsignergroupEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsignsignergroupID** | **kotlin.Int**| The unique ID of the Ezsignsignergroup | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignsignergroupEditObjectV1Request** | [**EzsignsignergroupEditObjectV1Request**](EzsignsignergroupEditObjectV1Request.md)|  | |

### Return type

[**EzsignsignergroupEditObjectV1Response**](EzsignsignergroupEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignergroupGetEzsignsignergroupmembershipsV1"></a>
# **ezsignsignergroupGetEzsignsignergroupmembershipsV1**
> EzsignsignergroupGetEzsignsignergroupmembershipsV1Response ezsignsignergroupGetEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID)

Retrieve an existing Ezsignsignergroup&#39;s Ezsignsignergroupmemberships

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val pkiEzsignsignergroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignsignergroupGetEzsignsignergroupmembershipsV1Response = apiInstance.ezsignsignergroupGetEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupGetEzsignsignergroupmembershipsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupGetEzsignsignergroupmembershipsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignsignergroupID** | **kotlin.Int**|  | |

### Return type

[**EzsignsignergroupGetEzsignsignergroupmembershipsV1Response**](EzsignsignergroupGetEzsignsignergroupmembershipsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignergroupGetObjectV2"></a>
# **ezsignsignergroupGetObjectV2**
> EzsignsignergroupGetObjectV2Response ezsignsignergroupGetObjectV2(pkiEzsignsignergroupID)

Retrieve an existing Ezsignsignergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val pkiEzsignsignergroupID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignergroup
try {
    val result : EzsignsignergroupGetObjectV2Response = apiInstance.ezsignsignergroupGetObjectV2(pkiEzsignsignergroupID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsignergroupApi#ezsignsignergroupGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignsignergroupID** | **kotlin.Int**| The unique ID of the Ezsignsignergroup | |

### Return type

[**EzsignsignergroupGetObjectV2Response**](EzsignsignergroupGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


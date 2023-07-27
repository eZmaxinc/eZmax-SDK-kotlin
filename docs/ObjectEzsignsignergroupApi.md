# ObjectEzsignsignergroupApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignsignergroupCreateObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupCreateObjectV1) | **POST** /1/object/ezsignsignergroup | Create a new Ezsignsignergroup
[**ezsignsignergroupDeleteObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupDeleteObjectV1) | **DELETE** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Delete an existing Ezsignsignergroup
[**ezsignsignergroupEditEzsignsignergroupmembershipsV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupEditEzsignsignergroupmembershipsV1) | **PUT** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/editEzsignsignergroupmemberships | Edit multiple Ezsignsignergroupmemberships
[**ezsignsignergroupEditObjectV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupEditObjectV1) | **PUT** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Edit an existing Ezsignsignergroup
[**ezsignsignergroupGetEzsignsignergroupmembershipsV1**](ObjectEzsignsignergroupApi.md#ezsignsignergroupGetEzsignsignergroupmembershipsV1) | **GET** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/getEzsignsignergroupmemberships | Retrieve an existing Ezsignsignergroup&#39;s Ezsignsignergroupmemberships
[**ezsignsignergroupGetObjectV2**](ObjectEzsignsignergroupApi.md#ezsignsignergroupGetObjectV2) | **GET** /2/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Retrieve an existing Ezsignsignergroup


<a id="ezsignsignergroupCreateObjectV1"></a>
# **ezsignsignergroupCreateObjectV1**
> EzsignsignergroupMinusCreateObjectMinusV1MinusResponse ezsignsignergroupCreateObjectV1(ezsignsignergroupMinusCreateObjectMinusV1MinusRequest)

Create a new Ezsignsignergroup

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val ezsignsignergroupMinusCreateObjectMinusV1MinusRequest : EzsignsignergroupMinusCreateObjectMinusV1MinusRequest =  // EzsignsignergroupMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : EzsignsignergroupMinusCreateObjectMinusV1MinusResponse = apiInstance.ezsignsignergroupCreateObjectV1(ezsignsignergroupMinusCreateObjectMinusV1MinusRequest)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignsignergroupMinusCreateObjectMinusV1MinusRequest** | [**EzsignsignergroupMinusCreateObjectMinusV1MinusRequest**](EzsignsignergroupMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignsignergroupMinusCreateObjectMinusV1MinusResponse**](EzsignsignergroupMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignergroupDeleteObjectV1"></a>
# **ezsignsignergroupDeleteObjectV1**
> EzsignsignergroupMinusDeleteObjectMinusV1MinusResponse ezsignsignergroupDeleteObjectV1(pkiEzsignsignergroupID)

Delete an existing Ezsignsignergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val pkiEzsignsignergroupID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignergroup
try {
    val result : EzsignsignergroupMinusDeleteObjectMinusV1MinusResponse = apiInstance.ezsignsignergroupDeleteObjectV1(pkiEzsignsignergroupID)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupID** | **kotlin.Int**| The unique ID of the Ezsignsignergroup |

### Return type

[**EzsignsignergroupMinusDeleteObjectMinusV1MinusResponse**](EzsignsignergroupMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignergroupEditEzsignsignergroupmembershipsV1"></a>
# **ezsignsignergroupEditEzsignsignergroupmembershipsV1**
> EzsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusResponse ezsignsignergroupEditEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID, ezsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusRequest)

Edit multiple Ezsignsignergroupmemberships

Using this endpoint, you can edit multiple Ezsignsignergroupmemberships at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val pkiEzsignsignergroupID : kotlin.Int = 56 // kotlin.Int | 
val ezsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusRequest : EzsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusRequest =  // EzsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusRequest | 
try {
    val result : EzsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusResponse = apiInstance.ezsignsignergroupEditEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID, ezsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusRequest)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupID** | **kotlin.Int**|  |
 **ezsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusRequest** | [**EzsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusRequest**](EzsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusRequest.md)|  |

### Return type

[**EzsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusResponse**](EzsignsignergroupMinusEditEzsignsignergroupmembershipsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignergroupEditObjectV1"></a>
# **ezsignsignergroupEditObjectV1**
> EzsignsignergroupMinusEditObjectMinusV1MinusResponse ezsignsignergroupEditObjectV1(pkiEzsignsignergroupID, ezsignsignergroupMinusEditObjectMinusV1MinusRequest)

Edit an existing Ezsignsignergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val pkiEzsignsignergroupID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignergroup
val ezsignsignergroupMinusEditObjectMinusV1MinusRequest : EzsignsignergroupMinusEditObjectMinusV1MinusRequest =  // EzsignsignergroupMinusEditObjectMinusV1MinusRequest | 
try {
    val result : EzsignsignergroupMinusEditObjectMinusV1MinusResponse = apiInstance.ezsignsignergroupEditObjectV1(pkiEzsignsignergroupID, ezsignsignergroupMinusEditObjectMinusV1MinusRequest)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupID** | **kotlin.Int**| The unique ID of the Ezsignsignergroup |
 **ezsignsignergroupMinusEditObjectMinusV1MinusRequest** | [**EzsignsignergroupMinusEditObjectMinusV1MinusRequest**](EzsignsignergroupMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**EzsignsignergroupMinusEditObjectMinusV1MinusResponse**](EzsignsignergroupMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsignergroupGetEzsignsignergroupmembershipsV1"></a>
# **ezsignsignergroupGetEzsignsignergroupmembershipsV1**
> EzsignsignergroupMinusGetEzsignsignergroupmembershipsMinusV1MinusResponse ezsignsignergroupGetEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID)

Retrieve an existing Ezsignsignergroup&#39;s Ezsignsignergroupmemberships

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val pkiEzsignsignergroupID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignsignergroupMinusGetEzsignsignergroupmembershipsMinusV1MinusResponse = apiInstance.ezsignsignergroupGetEzsignsignergroupmembershipsV1(pkiEzsignsignergroupID)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupID** | **kotlin.Int**|  |

### Return type

[**EzsignsignergroupMinusGetEzsignsignergroupmembershipsMinusV1MinusResponse**](EzsignsignergroupMinusGetEzsignsignergroupmembershipsMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsignergroupGetObjectV2"></a>
# **ezsignsignergroupGetObjectV2**
> EzsignsignergroupMinusGetObjectMinusV2MinusResponse ezsignsignergroupGetObjectV2(pkiEzsignsignergroupID)

Retrieve an existing Ezsignsignergroup



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsignergroupApi()
val pkiEzsignsignergroupID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsignergroup
try {
    val result : EzsignsignergroupMinusGetObjectMinusV2MinusResponse = apiInstance.ezsignsignergroupGetObjectV2(pkiEzsignsignergroupID)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignsignergroupID** | **kotlin.Int**| The unique ID of the Ezsignsignergroup |

### Return type

[**EzsignsignergroupMinusGetObjectMinusV2MinusResponse**](EzsignsignergroupMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


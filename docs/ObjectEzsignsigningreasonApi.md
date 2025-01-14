# ObjectEzsignsigningreasonApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignsigningreasonCreateObjectV1**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonCreateObjectV1) | **POST** /1/object/ezsignsigningreason | Create a new Ezsignsigningreason |
| [**ezsignsigningreasonEditObjectV1**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonEditObjectV1) | **PUT** /1/object/ezsignsigningreason/{pkiEzsignsigningreasonID} | Edit an existing Ezsignsigningreason |
| [**ezsignsigningreasonGetAutocompleteV2**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetAutocompleteV2) | **GET** /2/object/ezsignsigningreason/getAutocomplete/{sSelector} | Retrieve Ezsignsigningreasons and IDs |
| [**ezsignsigningreasonGetListV1**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetListV1) | **GET** /1/object/ezsignsigningreason/getList | Retrieve Ezsignsigningreason list |
| [**ezsignsigningreasonGetObjectV2**](ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetObjectV2) | **GET** /2/object/ezsignsigningreason/{pkiEzsignsigningreasonID} | Retrieve an existing Ezsignsigningreason |


<a id="ezsignsigningreasonCreateObjectV1"></a>
# **ezsignsigningreasonCreateObjectV1**
> EzsignsigningreasonCreateObjectV1Response ezsignsigningreasonCreateObjectV1(ezsignsigningreasonCreateObjectV1Request)

Create a new Ezsignsigningreason

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsigningreasonApi()
val ezsignsigningreasonCreateObjectV1Request : EzsignsigningreasonCreateObjectV1Request =  // EzsignsigningreasonCreateObjectV1Request | 
try {
    val result : EzsignsigningreasonCreateObjectV1Response = apiInstance.ezsignsigningreasonCreateObjectV1(ezsignsigningreasonCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsigningreasonApi#ezsignsigningreasonCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsigningreasonApi#ezsignsigningreasonCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignsigningreasonCreateObjectV1Request** | [**EzsignsigningreasonCreateObjectV1Request**](EzsignsigningreasonCreateObjectV1Request.md)|  | |

### Return type

[**EzsignsigningreasonCreateObjectV1Response**](EzsignsigningreasonCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsigningreasonEditObjectV1"></a>
# **ezsignsigningreasonEditObjectV1**
> EzsignsigningreasonEditObjectV1Response ezsignsigningreasonEditObjectV1(pkiEzsignsigningreasonID, ezsignsigningreasonEditObjectV1Request)

Edit an existing Ezsignsigningreason



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsigningreasonApi()
val pkiEzsignsigningreasonID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsigningreason
val ezsignsigningreasonEditObjectV1Request : EzsignsigningreasonEditObjectV1Request =  // EzsignsigningreasonEditObjectV1Request | 
try {
    val result : EzsignsigningreasonEditObjectV1Response = apiInstance.ezsignsigningreasonEditObjectV1(pkiEzsignsigningreasonID, ezsignsigningreasonEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsigningreasonApi#ezsignsigningreasonEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsigningreasonApi#ezsignsigningreasonEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEzsignsigningreasonID** | **kotlin.Int**| The unique ID of the Ezsignsigningreason | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ezsignsigningreasonEditObjectV1Request** | [**EzsignsigningreasonEditObjectV1Request**](EzsignsigningreasonEditObjectV1Request.md)|  | |

### Return type

[**EzsignsigningreasonEditObjectV1Response**](EzsignsigningreasonEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="ezsignsigningreasonGetAutocompleteV2"></a>
# **ezsignsigningreasonGetAutocompleteV2**
> EzsignsigningreasonGetAutocompleteV2Response ezsignsigningreasonGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezsignsigningreasons and IDs

Get the list of Ezsignsigningreason to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsigningreasonApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezsignsigningreasons to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : EzsignsigningreasonGetAutocompleteV2Response = apiInstance.ezsignsigningreasonGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Ezsignsigningreasons to return | [enum: All, Active] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**EzsignsigningreasonGetAutocompleteV2Response**](EzsignsigningreasonGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsigningreasonGetListV1"></a>
# **ezsignsigningreasonGetListV1**
> EzsignsigningreasonGetListV1Response ezsignsigningreasonGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Ezsignsigningreason list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsigningreasonApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EzsignsigningreasonGetListV1Response = apiInstance.ezsignsigningreasonGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEzsignsigningreasonID_ASC, pkiEzsignsigningreasonID_DESC, sEzsignsigningreasonDescriptionX_ASC, sEzsignsigningreasonDescriptionX_DESC, bEzsignsigningreasonIsactive_ASC, bEzsignsigningreasonIsactive_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**EzsignsigningreasonGetListV1Response**](EzsignsigningreasonGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignsigningreasonGetObjectV2"></a>
# **ezsignsigningreasonGetObjectV2**
> EzsignsigningreasonGetObjectV2Response ezsignsigningreasonGetObjectV2(pkiEzsignsigningreasonID)

Retrieve an existing Ezsignsigningreason



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignsigningreasonApi()
val pkiEzsignsigningreasonID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Ezsignsigningreason
try {
    val result : EzsignsigningreasonGetObjectV2Response = apiInstance.ezsignsigningreasonGetObjectV2(pkiEzsignsigningreasonID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignsigningreasonApi#ezsignsigningreasonGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignsigningreasonID** | **kotlin.Int**| The unique ID of the Ezsignsigningreason | |

### Return type

[**EzsignsigningreasonGetObjectV2Response**](EzsignsigningreasonGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


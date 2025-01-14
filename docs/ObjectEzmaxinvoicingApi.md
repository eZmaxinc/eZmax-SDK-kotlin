# ObjectEzmaxinvoicingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezmaxinvoicingGetAutocompleteV2**](ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetAutocompleteV2) | **GET** /2/object/ezmaxinvoicing/getAutocomplete/{sSelector} | Retrieve Ezmaxinvoicings and IDs |
| [**ezmaxinvoicingGetObjectV2**](ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetObjectV2) | **GET** /2/object/ezmaxinvoicing/{pkiEzmaxinvoicingID} | Retrieve an existing Ezmaxinvoicing |
| [**ezmaxinvoicingGetProvisionalV1**](ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetProvisionalV1) | **GET** /1/object/ezmaxinvoicing/getProvisional | Retrieve provisional Ezmaxinvoicing |


<a id="ezmaxinvoicingGetAutocompleteV2"></a>
# **ezmaxinvoicingGetAutocompleteV2**
> EzmaxinvoicingGetAutocompleteV2Response ezmaxinvoicingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezmaxinvoicings and IDs

Get the list of Ezmaxinvoicing to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxinvoicingApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezmaxinvoicings to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : EzmaxinvoicingGetAutocompleteV2Response = apiInstance.ezmaxinvoicingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Ezmaxinvoicings to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**EzmaxinvoicingGetAutocompleteV2Response**](EzmaxinvoicingGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezmaxinvoicingGetObjectV2"></a>
# **ezmaxinvoicingGetObjectV2**
> EzmaxinvoicingGetObjectV2Response ezmaxinvoicingGetObjectV2(pkiEzmaxinvoicingID)

Retrieve an existing Ezmaxinvoicing



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxinvoicingApi()
val pkiEzmaxinvoicingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzmaxinvoicingGetObjectV2Response = apiInstance.ezmaxinvoicingGetObjectV2(pkiEzmaxinvoicingID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzmaxinvoicingID** | **kotlin.Int**|  | |

### Return type

[**EzmaxinvoicingGetObjectV2Response**](EzmaxinvoicingGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezmaxinvoicingGetProvisionalV1"></a>
# **ezmaxinvoicingGetProvisionalV1**
> EzmaxinvoicingGetProvisionalV1Response ezmaxinvoicingGetProvisionalV1()

Retrieve provisional Ezmaxinvoicing



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxinvoicingApi()
try {
    val result : EzmaxinvoicingGetProvisionalV1Response = apiInstance.ezmaxinvoicingGetProvisionalV1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetProvisionalV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetProvisionalV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EzmaxinvoicingGetProvisionalV1Response**](EzmaxinvoicingGetProvisionalV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


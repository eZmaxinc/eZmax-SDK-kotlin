# ObjectEzmaxinvoicingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezmaxinvoicingGetAutocompleteV1**](ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetAutocompleteV1) | **GET** /1/object/ezmaxinvoicing/getAutocomplete/{sSelector} | Retrieve Ezmaxinvoicings and IDs
[**ezmaxinvoicingGetAutocompleteV2**](ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetAutocompleteV2) | **GET** /2/object/ezmaxinvoicing/getAutocomplete/{sSelector} | Retrieve Ezmaxinvoicings and IDs
[**ezmaxinvoicingGetObjectV1**](ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetObjectV1) | **GET** /1/object/ezmaxinvoicing/{pkiEzmaxinvoicingID} | Retrieve an existing Ezmaxinvoicing
[**ezmaxinvoicingGetProvisionalV1**](ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetProvisionalV1) | **GET** /1/object/ezmaxinvoicing/getProvisional | Retrieve provisional Ezmaxinvoicing


<a name="ezmaxinvoicingGetAutocompleteV1"></a>
# **ezmaxinvoicingGetAutocompleteV1**
> CommonMinusGetAutocompleteMinusV1MinusResponse ezmaxinvoicingGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezmaxinvoicings and IDs

Get the list of Ezmaxinvoicing to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxinvoicingApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezmaxinvoicings to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display. Active is the default value.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : CommonMinusGetAutocompleteMinusV1MinusResponse = apiInstance.ezmaxinvoicingGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetAutocompleteV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetAutocompleteV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Ezmaxinvoicings to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. Active is the default value. | [optional] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**CommonMinusGetAutocompleteMinusV1MinusResponse**](CommonMinusGetAutocompleteMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezmaxinvoicingGetAutocompleteV2"></a>
# **ezmaxinvoicingGetAutocompleteV2**
> EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse ezmaxinvoicingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

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
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse = apiInstance.ezmaxinvoicingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Ezmaxinvoicings to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse**](EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezmaxinvoicingGetObjectV1"></a>
# **ezmaxinvoicingGetObjectV1**
> EzmaxinvoicingMinusGetObjectMinusV1MinusResponse ezmaxinvoicingGetObjectV1(pkiEzmaxinvoicingID)

Retrieve an existing Ezmaxinvoicing



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxinvoicingApi()
val pkiEzmaxinvoicingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzmaxinvoicingMinusGetObjectMinusV1MinusResponse = apiInstance.ezmaxinvoicingGetObjectV1(pkiEzmaxinvoicingID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzmaxinvoicingApi#ezmaxinvoicingGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzmaxinvoicingID** | **kotlin.Int**|  |

### Return type

[**EzmaxinvoicingMinusGetObjectMinusV1MinusResponse**](EzmaxinvoicingMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ezmaxinvoicingGetProvisionalV1"></a>
# **ezmaxinvoicingGetProvisionalV1**
> EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse ezmaxinvoicingGetProvisionalV1()

Retrieve provisional Ezmaxinvoicing



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzmaxinvoicingApi()
try {
    val result : EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse = apiInstance.ezmaxinvoicingGetProvisionalV1()
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

[**EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse**](EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


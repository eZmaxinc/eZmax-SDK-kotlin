# ObjectBillingentityinternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**billingentityinternalCreateObjectV1**](ObjectBillingentityinternalApi.md#billingentityinternalCreateObjectV1) | **POST** /1/object/billingentityinternal | Create a new Billingentityinternal
[**billingentityinternalEditObjectV1**](ObjectBillingentityinternalApi.md#billingentityinternalEditObjectV1) | **PUT** /1/object/billingentityinternal/{pkiBillingentityinternalID} | Edit an existing Billingentityinternal
[**billingentityinternalGetAutocompleteV2**](ObjectBillingentityinternalApi.md#billingentityinternalGetAutocompleteV2) | **GET** /2/object/billingentityinternal/getAutocomplete/{sSelector} | Retrieve Billingentityinternals and IDs
[**billingentityinternalGetListV1**](ObjectBillingentityinternalApi.md#billingentityinternalGetListV1) | **GET** /1/object/billingentityinternal/getList | Retrieve Billingentityinternal list
[**billingentityinternalGetObjectV2**](ObjectBillingentityinternalApi.md#billingentityinternalGetObjectV2) | **GET** /2/object/billingentityinternal/{pkiBillingentityinternalID} | Retrieve an existing Billingentityinternal


<a id="billingentityinternalCreateObjectV1"></a>
# **billingentityinternalCreateObjectV1**
> BillingentityinternalCreateObjectV1Response billingentityinternalCreateObjectV1(billingentityinternalCreateObjectV1Request)

Create a new Billingentityinternal

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBillingentityinternalApi()
val billingentityinternalCreateObjectV1Request : BillingentityinternalCreateObjectV1Request =  // BillingentityinternalCreateObjectV1Request | 
try {
    val result : BillingentityinternalCreateObjectV1Response = apiInstance.billingentityinternalCreateObjectV1(billingentityinternalCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBillingentityinternalApi#billingentityinternalCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBillingentityinternalApi#billingentityinternalCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingentityinternalCreateObjectV1Request** | [**BillingentityinternalCreateObjectV1Request**](BillingentityinternalCreateObjectV1Request.md)|  |

### Return type

[**BillingentityinternalCreateObjectV1Response**](BillingentityinternalCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="billingentityinternalEditObjectV1"></a>
# **billingentityinternalEditObjectV1**
> BillingentityinternalEditObjectV1Response billingentityinternalEditObjectV1(pkiBillingentityinternalID, billingentityinternalEditObjectV1Request)

Edit an existing Billingentityinternal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBillingentityinternalApi()
val pkiBillingentityinternalID : kotlin.Int = 56 // kotlin.Int | 
val billingentityinternalEditObjectV1Request : BillingentityinternalEditObjectV1Request =  // BillingentityinternalEditObjectV1Request | 
try {
    val result : BillingentityinternalEditObjectV1Response = apiInstance.billingentityinternalEditObjectV1(pkiBillingentityinternalID, billingentityinternalEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBillingentityinternalApi#billingentityinternalEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBillingentityinternalApi#billingentityinternalEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBillingentityinternalID** | **kotlin.Int**|  |
 **billingentityinternalEditObjectV1Request** | [**BillingentityinternalEditObjectV1Request**](BillingentityinternalEditObjectV1Request.md)|  |

### Return type

[**BillingentityinternalEditObjectV1Response**](BillingentityinternalEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="billingentityinternalGetAutocompleteV2"></a>
# **billingentityinternalGetAutocompleteV2**
> BillingentityinternalGetAutocompleteV2Response billingentityinternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Billingentityinternals and IDs

Get the list of Billingentityinternal to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBillingentityinternalApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Billingentityinternals to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : BillingentityinternalGetAutocompleteV2Response = apiInstance.billingentityinternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBillingentityinternalApi#billingentityinternalGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBillingentityinternalApi#billingentityinternalGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Billingentityinternals to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**BillingentityinternalGetAutocompleteV2Response**](BillingentityinternalGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="billingentityinternalGetListV1"></a>
# **billingentityinternalGetListV1**
> BillingentityinternalGetListV1Response billingentityinternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Billingentityinternal list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBillingentityinternalApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : BillingentityinternalGetListV1Response = apiInstance.billingentityinternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBillingentityinternalApi#billingentityinternalGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBillingentityinternalApi#billingentityinternalGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiBillingentityinternalID_ASC, pkiBillingentityinternalID_DESC, sBillingentityinternalDescriptionX_ASC, sBillingentityinternalDescriptionX_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional] [default to 10000]
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**BillingentityinternalGetListV1Response**](BillingentityinternalGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="billingentityinternalGetObjectV2"></a>
# **billingentityinternalGetObjectV2**
> BillingentityinternalGetObjectV2Response billingentityinternalGetObjectV2(pkiBillingentityinternalID)

Retrieve an existing Billingentityinternal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBillingentityinternalApi()
val pkiBillingentityinternalID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BillingentityinternalGetObjectV2Response = apiInstance.billingentityinternalGetObjectV2(pkiBillingentityinternalID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBillingentityinternalApi#billingentityinternalGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBillingentityinternalApi#billingentityinternalGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBillingentityinternalID** | **kotlin.Int**|  |

### Return type

[**BillingentityinternalGetObjectV2Response**](BillingentityinternalGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


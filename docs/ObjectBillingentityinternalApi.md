# ObjectBillingentityinternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**billingentityinternalCreateObjectV1**](ObjectBillingentityinternalApi.md#billingentityinternalCreateObjectV1) | **POST** /1/object/billingentityinternal | Create a new Billingentityinternal
[**billingentityinternalDeleteObjectV1**](ObjectBillingentityinternalApi.md#billingentityinternalDeleteObjectV1) | **DELETE** /1/object/billingentityinternal/{pkiBillingentityinternalID} | Delete an existing Billingentityinternal
[**billingentityinternalEditObjectV1**](ObjectBillingentityinternalApi.md#billingentityinternalEditObjectV1) | **PUT** /1/object/billingentityinternal/{pkiBillingentityinternalID} | Edit an existing Billingentityinternal
[**billingentityinternalGetAutocompleteV2**](ObjectBillingentityinternalApi.md#billingentityinternalGetAutocompleteV2) | **GET** /2/object/billingentityinternal/getAutocomplete/{sSelector} | Retrieve Billingentityinternals and IDs
[**billingentityinternalGetListV1**](ObjectBillingentityinternalApi.md#billingentityinternalGetListV1) | **GET** /1/object/billingentityinternal/getList | Retrieve Billingentityinternal list
[**billingentityinternalGetObjectV2**](ObjectBillingentityinternalApi.md#billingentityinternalGetObjectV2) | **GET** /2/object/billingentityinternal/{pkiBillingentityinternalID} | Retrieve an existing Billingentityinternal


<a name="billingentityinternalCreateObjectV1"></a>
# **billingentityinternalCreateObjectV1**
> BillingentityinternalMinusCreateObjectMinusV1MinusResponse billingentityinternalCreateObjectV1(billingentityinternalMinusCreateObjectMinusV1MinusRequest)

Create a new Billingentityinternal

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBillingentityinternalApi()
val billingentityinternalMinusCreateObjectMinusV1MinusRequest : BillingentityinternalMinusCreateObjectMinusV1MinusRequest =  // BillingentityinternalMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : BillingentityinternalMinusCreateObjectMinusV1MinusResponse = apiInstance.billingentityinternalCreateObjectV1(billingentityinternalMinusCreateObjectMinusV1MinusRequest)
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
 **billingentityinternalMinusCreateObjectMinusV1MinusRequest** | [**BillingentityinternalMinusCreateObjectMinusV1MinusRequest**](BillingentityinternalMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**BillingentityinternalMinusCreateObjectMinusV1MinusResponse**](BillingentityinternalMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="billingentityinternalDeleteObjectV1"></a>
# **billingentityinternalDeleteObjectV1**
> BillingentityinternalMinusDeleteObjectMinusV1MinusResponse billingentityinternalDeleteObjectV1(pkiBillingentityinternalID)

Delete an existing Billingentityinternal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBillingentityinternalApi()
val pkiBillingentityinternalID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Billingentityinternal
try {
    val result : BillingentityinternalMinusDeleteObjectMinusV1MinusResponse = apiInstance.billingentityinternalDeleteObjectV1(pkiBillingentityinternalID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBillingentityinternalApi#billingentityinternalDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBillingentityinternalApi#billingentityinternalDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBillingentityinternalID** | **kotlin.Int**| The unique ID of the Billingentityinternal |

### Return type

[**BillingentityinternalMinusDeleteObjectMinusV1MinusResponse**](BillingentityinternalMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="billingentityinternalEditObjectV1"></a>
# **billingentityinternalEditObjectV1**
> BillingentityinternalMinusEditObjectMinusV1MinusResponse billingentityinternalEditObjectV1(pkiBillingentityinternalID, billingentityinternalMinusEditObjectMinusV1MinusRequest)

Edit an existing Billingentityinternal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBillingentityinternalApi()
val pkiBillingentityinternalID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Billingentityinternal
val billingentityinternalMinusEditObjectMinusV1MinusRequest : BillingentityinternalMinusEditObjectMinusV1MinusRequest =  // BillingentityinternalMinusEditObjectMinusV1MinusRequest | 
try {
    val result : BillingentityinternalMinusEditObjectMinusV1MinusResponse = apiInstance.billingentityinternalEditObjectV1(pkiBillingentityinternalID, billingentityinternalMinusEditObjectMinusV1MinusRequest)
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
 **pkiBillingentityinternalID** | **kotlin.Int**| The unique ID of the Billingentityinternal |
 **billingentityinternalMinusEditObjectMinusV1MinusRequest** | [**BillingentityinternalMinusEditObjectMinusV1MinusRequest**](BillingentityinternalMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**BillingentityinternalMinusEditObjectMinusV1MinusResponse**](BillingentityinternalMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="billingentityinternalGetAutocompleteV2"></a>
# **billingentityinternalGetAutocompleteV2**
> BillingentityinternalMinusGetAutocompleteMinusV2MinusResponse billingentityinternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

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
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : BillingentityinternalMinusGetAutocompleteMinusV2MinusResponse = apiInstance.billingentityinternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
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
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**BillingentityinternalMinusGetAutocompleteMinusV2MinusResponse**](BillingentityinternalMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="billingentityinternalGetListV1"></a>
# **billingentityinternalGetListV1**
> BillingentityinternalMinusGetListMinusV1MinusResponse billingentityinternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

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
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : BillingentityinternalMinusGetListMinusV1MinusResponse = apiInstance.billingentityinternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
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
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**BillingentityinternalMinusGetListMinusV1MinusResponse**](BillingentityinternalMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="billingentityinternalGetObjectV2"></a>
# **billingentityinternalGetObjectV2**
> BillingentityinternalMinusGetObjectMinusV2MinusResponse billingentityinternalGetObjectV2(pkiBillingentityinternalID)

Retrieve an existing Billingentityinternal



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBillingentityinternalApi()
val pkiBillingentityinternalID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Billingentityinternal
try {
    val result : BillingentityinternalMinusGetObjectMinusV2MinusResponse = apiInstance.billingentityinternalGetObjectV2(pkiBillingentityinternalID)
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
 **pkiBillingentityinternalID** | **kotlin.Int**| The unique ID of the Billingentityinternal |

### Return type

[**BillingentityinternalMinusGetObjectMinusV2MinusResponse**](BillingentityinternalMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectPaymenttermApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymenttermCreateObjectV1**](ObjectPaymenttermApi.md#paymenttermCreateObjectV1) | **POST** /1/object/paymentterm | Create a new Paymentterm
[**paymenttermDeleteObjectV1**](ObjectPaymenttermApi.md#paymenttermDeleteObjectV1) | **DELETE** /1/object/paymentterm/{pkiPaymenttermID} | Delete an existing Paymentterm
[**paymenttermEditObjectV1**](ObjectPaymenttermApi.md#paymenttermEditObjectV1) | **PUT** /1/object/paymentterm/{pkiPaymenttermID} | Edit an existing Paymentterm
[**paymenttermGetAutocompleteV2**](ObjectPaymenttermApi.md#paymenttermGetAutocompleteV2) | **GET** /2/object/paymentterm/getAutocomplete/{sSelector} | Retrieve Paymentterms and IDs
[**paymenttermGetListV1**](ObjectPaymenttermApi.md#paymenttermGetListV1) | **GET** /1/object/paymentterm/getList | Retrieve Paymentterm list
[**paymenttermGetObjectV2**](ObjectPaymenttermApi.md#paymenttermGetObjectV2) | **GET** /2/object/paymentterm/{pkiPaymenttermID} | Retrieve an existing Paymentterm


<a name="paymenttermCreateObjectV1"></a>
# **paymenttermCreateObjectV1**
> PaymenttermMinusCreateObjectMinusV1MinusResponse paymenttermCreateObjectV1(paymenttermMinusCreateObjectMinusV1MinusRequest)

Create a new Paymentterm

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymenttermApi()
val paymenttermMinusCreateObjectMinusV1MinusRequest : PaymenttermMinusCreateObjectMinusV1MinusRequest =  // PaymenttermMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : PaymenttermMinusCreateObjectMinusV1MinusResponse = apiInstance.paymenttermCreateObjectV1(paymenttermMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymenttermApi#paymenttermCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymenttermApi#paymenttermCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymenttermMinusCreateObjectMinusV1MinusRequest** | [**PaymenttermMinusCreateObjectMinusV1MinusRequest**](PaymenttermMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**PaymenttermMinusCreateObjectMinusV1MinusResponse**](PaymenttermMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paymenttermDeleteObjectV1"></a>
# **paymenttermDeleteObjectV1**
> PaymenttermMinusDeleteObjectMinusV1MinusResponse paymenttermDeleteObjectV1(pkiPaymenttermID)

Delete an existing Paymentterm



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymenttermApi()
val pkiPaymenttermID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaymenttermMinusDeleteObjectMinusV1MinusResponse = apiInstance.paymenttermDeleteObjectV1(pkiPaymenttermID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymenttermApi#paymenttermDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymenttermApi#paymenttermDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPaymenttermID** | **kotlin.Int**|  |

### Return type

[**PaymenttermMinusDeleteObjectMinusV1MinusResponse**](PaymenttermMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymenttermEditObjectV1"></a>
# **paymenttermEditObjectV1**
> PaymenttermMinusEditObjectMinusV1MinusResponse paymenttermEditObjectV1(pkiPaymenttermID, paymenttermMinusEditObjectMinusV1MinusRequest)

Edit an existing Paymentterm



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymenttermApi()
val pkiPaymenttermID : kotlin.Int = 56 // kotlin.Int | 
val paymenttermMinusEditObjectMinusV1MinusRequest : PaymenttermMinusEditObjectMinusV1MinusRequest =  // PaymenttermMinusEditObjectMinusV1MinusRequest | 
try {
    val result : PaymenttermMinusEditObjectMinusV1MinusResponse = apiInstance.paymenttermEditObjectV1(pkiPaymenttermID, paymenttermMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymenttermApi#paymenttermEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymenttermApi#paymenttermEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPaymenttermID** | **kotlin.Int**|  |
 **paymenttermMinusEditObjectMinusV1MinusRequest** | [**PaymenttermMinusEditObjectMinusV1MinusRequest**](PaymenttermMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**PaymenttermMinusEditObjectMinusV1MinusResponse**](PaymenttermMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paymenttermGetAutocompleteV2"></a>
# **paymenttermGetAutocompleteV2**
> PaymenttermMinusGetAutocompleteMinusV2MinusResponse paymenttermGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Paymentterms and IDs

Get the list of Paymentterm to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymenttermApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Paymentterms to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : PaymenttermMinusGetAutocompleteMinusV2MinusResponse = apiInstance.paymenttermGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymenttermApi#paymenttermGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymenttermApi#paymenttermGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Paymentterms to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**PaymenttermMinusGetAutocompleteMinusV2MinusResponse**](PaymenttermMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymenttermGetListV1"></a>
# **paymenttermGetListV1**
> PaymenttermMinusGetListMinusV1MinusResponse paymenttermGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Paymentterm list

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymenttermApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : PaymenttermMinusGetListMinusV1MinusResponse = apiInstance.paymenttermGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymenttermApi#paymenttermGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymenttermApi#paymenttermGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiPaymenttermID_ASC, pkiPaymenttermID_DESC, sPaymenttermCode_ASC, sPaymenttermCode_DESC, ePaymenttermType_ASC, ePaymenttermType_DESC, iPaymenttermDay_ASC, iPaymenttermDay_DESC, sPaymenttermDescriptionX_ASC, sPaymenttermDescriptionX_DESC, bPaymenttermIsactive_ASC, bPaymenttermIsactive_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**PaymenttermMinusGetListMinusV1MinusResponse**](PaymenttermMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="paymenttermGetObjectV2"></a>
# **paymenttermGetObjectV2**
> PaymenttermMinusGetObjectMinusV2MinusResponse paymenttermGetObjectV2(pkiPaymenttermID)

Retrieve an existing Paymentterm



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymenttermApi()
val pkiPaymenttermID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaymenttermMinusGetObjectMinusV2MinusResponse = apiInstance.paymenttermGetObjectV2(pkiPaymenttermID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymenttermApi#paymenttermGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymenttermApi#paymenttermGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiPaymenttermID** | **kotlin.Int**|  |

### Return type

[**PaymenttermMinusGetObjectMinusV2MinusResponse**](PaymenttermMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


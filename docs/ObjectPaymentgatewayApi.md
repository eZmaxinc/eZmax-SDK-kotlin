# ObjectPaymentgatewayApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**paymentgatewayCreateObjectV1**](ObjectPaymentgatewayApi.md#paymentgatewayCreateObjectV1) | **POST** /1/object/paymentgateway | Create a new Paymentgateway |
| [**paymentgatewayEditObjectV1**](ObjectPaymentgatewayApi.md#paymentgatewayEditObjectV1) | **PUT** /1/object/paymentgateway/{pkiPaymentgatewayID} | Edit an existing Paymentgateway |
| [**paymentgatewayGetAutocompleteV2**](ObjectPaymentgatewayApi.md#paymentgatewayGetAutocompleteV2) | **GET** /2/object/paymentgateway/getAutocomplete/{sSelector} | Retrieve Paymentgateways and IDs |
| [**paymentgatewayGetListV1**](ObjectPaymentgatewayApi.md#paymentgatewayGetListV1) | **GET** /1/object/paymentgateway/getList | Retrieve Paymentgateway list |
| [**paymentgatewayGetObjectV2**](ObjectPaymentgatewayApi.md#paymentgatewayGetObjectV2) | **GET** /2/object/paymentgateway/{pkiPaymentgatewayID} | Retrieve an existing Paymentgateway |


<a id="paymentgatewayCreateObjectV1"></a>
# **paymentgatewayCreateObjectV1**
> PaymentgatewayCreateObjectV1Response paymentgatewayCreateObjectV1(paymentgatewayCreateObjectV1Request)

Create a new Paymentgateway

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentgatewayApi()
val paymentgatewayCreateObjectV1Request : PaymentgatewayCreateObjectV1Request =  // PaymentgatewayCreateObjectV1Request | 
try {
    val result : PaymentgatewayCreateObjectV1Response = apiInstance.paymentgatewayCreateObjectV1(paymentgatewayCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentgatewayApi#paymentgatewayCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentgatewayApi#paymentgatewayCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentgatewayCreateObjectV1Request** | [**PaymentgatewayCreateObjectV1Request**](PaymentgatewayCreateObjectV1Request.md)|  | |

### Return type

[**PaymentgatewayCreateObjectV1Response**](PaymentgatewayCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="paymentgatewayEditObjectV1"></a>
# **paymentgatewayEditObjectV1**
> PaymentgatewayEditObjectV1Response paymentgatewayEditObjectV1(pkiPaymentgatewayID, paymentgatewayEditObjectV1Request)

Edit an existing Paymentgateway



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentgatewayApi()
val pkiPaymentgatewayID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Paymentgateway
val paymentgatewayEditObjectV1Request : PaymentgatewayEditObjectV1Request =  // PaymentgatewayEditObjectV1Request | 
try {
    val result : PaymentgatewayEditObjectV1Response = apiInstance.paymentgatewayEditObjectV1(pkiPaymentgatewayID, paymentgatewayEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentgatewayApi#paymentgatewayEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentgatewayApi#paymentgatewayEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiPaymentgatewayID** | **kotlin.Int**| The unique ID of the Paymentgateway | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentgatewayEditObjectV1Request** | [**PaymentgatewayEditObjectV1Request**](PaymentgatewayEditObjectV1Request.md)|  | |

### Return type

[**PaymentgatewayEditObjectV1Response**](PaymentgatewayEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="paymentgatewayGetAutocompleteV2"></a>
# **paymentgatewayGetAutocompleteV2**
> PaymentgatewayGetAutocompleteV2Response paymentgatewayGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Paymentgateways and IDs

Get the list of Paymentgateway to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentgatewayApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Paymentgateways to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : PaymentgatewayGetAutocompleteV2Response = apiInstance.paymentgatewayGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentgatewayApi#paymentgatewayGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentgatewayApi#paymentgatewayGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Paymentgateways to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**PaymentgatewayGetAutocompleteV2Response**](PaymentgatewayGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="paymentgatewayGetListV1"></a>
# **paymentgatewayGetListV1**
> PaymentgatewayGetListV1Response paymentgatewayGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Paymentgateway list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | ePaymentgatewayProcessor | Moneris |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentgatewayApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : PaymentgatewayGetListV1Response = apiInstance.paymentgatewayGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentgatewayApi#paymentgatewayGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentgatewayApi#paymentgatewayGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiPaymentgatewayID_ASC, pkiPaymentgatewayID_DESC, fkiCreditcardmerchantID_ASC, fkiCreditcardmerchantID_DESC, ePaymentgatewayProcessor_ASC, ePaymentgatewayProcessor_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentgatewayGetListV1Response**](PaymentgatewayGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="paymentgatewayGetObjectV2"></a>
# **paymentgatewayGetObjectV2**
> PaymentgatewayGetObjectV2Response paymentgatewayGetObjectV2(pkiPaymentgatewayID)

Retrieve an existing Paymentgateway



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentgatewayApi()
val pkiPaymentgatewayID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Paymentgateway
try {
    val result : PaymentgatewayGetObjectV2Response = apiInstance.paymentgatewayGetObjectV2(pkiPaymentgatewayID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentgatewayApi#paymentgatewayGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentgatewayApi#paymentgatewayGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiPaymentgatewayID** | **kotlin.Int**| The unique ID of the Paymentgateway | |

### Return type

[**PaymentgatewayGetObjectV2Response**](PaymentgatewayGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


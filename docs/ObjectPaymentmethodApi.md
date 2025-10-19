# ObjectPaymentmethodApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**paymentmethodGetAutocompleteV2**](ObjectPaymentmethodApi.md#paymentmethodGetAutocompleteV2) | **GET** /2/object/paymentmethod/getAutocomplete/{sSelector} | Retrieve Paymentmethods and IDs |


<a id="paymentmethodGetAutocompleteV2"></a>
# **paymentmethodGetAutocompleteV2**
> PaymentmethodGetAutocompleteV2Response paymentmethodGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Paymentmethods and IDs

Get the list of Paymentmethod to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectPaymentmethodApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Paymentmethods to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : PaymentmethodGetAutocompleteV2Response = apiInstance.paymentmethodGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectPaymentmethodApi#paymentmethodGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectPaymentmethodApi#paymentmethodGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Paymentmethods to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**PaymentmethodGetAutocompleteV2Response**](PaymentmethodGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


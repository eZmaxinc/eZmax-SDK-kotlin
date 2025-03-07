# ObjectCustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**customerCreateObjectV1**](ObjectCustomerApi.md#customerCreateObjectV1) | **POST** /1/object/customer | Create a new Customer |
| [**customerGetAutocompleteV2**](ObjectCustomerApi.md#customerGetAutocompleteV2) | **GET** /2/object/customer/getAutocomplete/{sSelector} | Retrieve Customers and IDs |
| [**customerGetObjectV2**](ObjectCustomerApi.md#customerGetObjectV2) | **GET** /2/object/customer/{pkiCustomerID} | Retrieve an existing Customer |


<a id="customerCreateObjectV1"></a>
# **customerCreateObjectV1**
> CustomerCreateObjectV1Response customerCreateObjectV1(customerCreateObjectV1Request)

Create a new Customer

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val customerCreateObjectV1Request : CustomerCreateObjectV1Request =  // CustomerCreateObjectV1Request | 
try {
    val result : CustomerCreateObjectV1Response = apiInstance.customerCreateObjectV1(customerCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerCreateObjectV1Request** | [**CustomerCreateObjectV1Request**](CustomerCreateObjectV1Request.md)|  | |

### Return type

[**CustomerCreateObjectV1Response**](CustomerCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="customerGetAutocompleteV2"></a>
# **customerGetAutocompleteV2**
> CustomerGetAutocompleteV2Response customerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Customers and IDs

Get the list of Customer to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Customers to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : CustomerGetAutocompleteV2Response = apiInstance.customerGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Customers to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**CustomerGetAutocompleteV2Response**](CustomerGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customerGetObjectV2"></a>
# **customerGetObjectV2**
> CustomerGetObjectV2Response customerGetObjectV2(pkiCustomerID)

Retrieve an existing Customer



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Customer
try {
    val result : CustomerGetObjectV2Response = apiInstance.customerGetObjectV2(pkiCustomerID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int**| The unique ID of the Customer | |

### Return type

[**CustomerGetObjectV2Response**](CustomerGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


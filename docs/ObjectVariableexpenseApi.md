# ObjectVariableexpenseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**variableexpenseCreateObjectV1**](ObjectVariableexpenseApi.md#variableexpenseCreateObjectV1) | **POST** /1/object/variableexpense | Create a new Variableexpense
[**variableexpenseEditObjectV1**](ObjectVariableexpenseApi.md#variableexpenseEditObjectV1) | **PUT** /1/object/variableexpense/{pkiVariableexpenseID} | Edit an existing Variableexpense
[**variableexpenseGetAutocompleteV2**](ObjectVariableexpenseApi.md#variableexpenseGetAutocompleteV2) | **GET** /2/object/variableexpense/getAutocomplete/{sSelector} | Retrieve Variableexpenses and IDs
[**variableexpenseGetListV1**](ObjectVariableexpenseApi.md#variableexpenseGetListV1) | **GET** /1/object/variableexpense/getList | Retrieve Variableexpense list
[**variableexpenseGetObjectV2**](ObjectVariableexpenseApi.md#variableexpenseGetObjectV2) | **GET** /2/object/variableexpense/{pkiVariableexpenseID} | Retrieve an existing Variableexpense


<a id="variableexpenseCreateObjectV1"></a>
# **variableexpenseCreateObjectV1**
> VariableexpenseMinusCreateObjectMinusV1MinusResponse variableexpenseCreateObjectV1(variableexpenseMinusCreateObjectMinusV1MinusRequest)

Create a new Variableexpense

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectVariableexpenseApi()
val variableexpenseMinusCreateObjectMinusV1MinusRequest : VariableexpenseMinusCreateObjectMinusV1MinusRequest =  // VariableexpenseMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : VariableexpenseMinusCreateObjectMinusV1MinusResponse = apiInstance.variableexpenseCreateObjectV1(variableexpenseMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectVariableexpenseApi#variableexpenseCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectVariableexpenseApi#variableexpenseCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableexpenseMinusCreateObjectMinusV1MinusRequest** | [**VariableexpenseMinusCreateObjectMinusV1MinusRequest**](VariableexpenseMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**VariableexpenseMinusCreateObjectMinusV1MinusResponse**](VariableexpenseMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="variableexpenseEditObjectV1"></a>
# **variableexpenseEditObjectV1**
> VariableexpenseMinusEditObjectMinusV1MinusResponse variableexpenseEditObjectV1(pkiVariableexpenseID, variableexpenseMinusEditObjectMinusV1MinusRequest)

Edit an existing Variableexpense



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectVariableexpenseApi()
val pkiVariableexpenseID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Variableexpense
val variableexpenseMinusEditObjectMinusV1MinusRequest : VariableexpenseMinusEditObjectMinusV1MinusRequest =  // VariableexpenseMinusEditObjectMinusV1MinusRequest | 
try {
    val result : VariableexpenseMinusEditObjectMinusV1MinusResponse = apiInstance.variableexpenseEditObjectV1(pkiVariableexpenseID, variableexpenseMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectVariableexpenseApi#variableexpenseEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectVariableexpenseApi#variableexpenseEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiVariableexpenseID** | **kotlin.Int**| The unique ID of the Variableexpense |
 **variableexpenseMinusEditObjectMinusV1MinusRequest** | [**VariableexpenseMinusEditObjectMinusV1MinusRequest**](VariableexpenseMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**VariableexpenseMinusEditObjectMinusV1MinusResponse**](VariableexpenseMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="variableexpenseGetAutocompleteV2"></a>
# **variableexpenseGetAutocompleteV2**
> VariableexpenseMinusGetAutocompleteMinusV2MinusResponse variableexpenseGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Variableexpenses and IDs

Get the list of Variableexpense to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectVariableexpenseApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Variableexpenses to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : VariableexpenseMinusGetAutocompleteMinusV2MinusResponse = apiInstance.variableexpenseGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectVariableexpenseApi#variableexpenseGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectVariableexpenseApi#variableexpenseGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Variableexpenses to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**VariableexpenseMinusGetAutocompleteMinusV2MinusResponse**](VariableexpenseMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="variableexpenseGetListV1"></a>
# **variableexpenseGetListV1**
> VariableexpenseMinusGetListMinusV1MinusResponse variableexpenseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Variableexpense list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eVariableexpenseTaxable | Yes&lt;br&gt;No&lt;br&gt;Included |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectVariableexpenseApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : VariableexpenseMinusGetListMinusV1MinusResponse = apiInstance.variableexpenseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectVariableexpenseApi#variableexpenseGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectVariableexpenseApi#variableexpenseGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiVariableexpenseID_ASC, pkiVariableexpenseID_DESC, sVariableexpenseCode_ASC, sVariableexpenseCode_DESC, sVariableexpenseDescriptionX_ASC, sVariableexpenseDescriptionX_DESC, eVariableexpenseTaxable_ASC, eVariableexpenseTaxable_DESC, bVariableexpenseIsactive_ASC, bVariableexpenseIsactive_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional] [default to 10000]
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**VariableexpenseMinusGetListMinusV1MinusResponse**](VariableexpenseMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="variableexpenseGetObjectV2"></a>
# **variableexpenseGetObjectV2**
> VariableexpenseMinusGetObjectMinusV2MinusResponse variableexpenseGetObjectV2(pkiVariableexpenseID)

Retrieve an existing Variableexpense



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectVariableexpenseApi()
val pkiVariableexpenseID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Variableexpense
try {
    val result : VariableexpenseMinusGetObjectMinusV2MinusResponse = apiInstance.variableexpenseGetObjectV2(pkiVariableexpenseID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectVariableexpenseApi#variableexpenseGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectVariableexpenseApi#variableexpenseGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiVariableexpenseID** | **kotlin.Int**| The unique ID of the Variableexpense |

### Return type

[**VariableexpenseMinusGetObjectMinusV2MinusResponse**](VariableexpenseMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


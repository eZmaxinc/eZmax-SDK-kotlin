# ObjectVariableexpenseApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**variableexpenseCreateObjectV1**](ObjectVariableexpenseApi.md#variableexpenseCreateObjectV1) | **POST** /1/object/variableexpense | Create a new Variableexpense |
| [**variableexpenseEditObjectV1**](ObjectVariableexpenseApi.md#variableexpenseEditObjectV1) | **PUT** /1/object/variableexpense/{pkiVariableexpenseID} | Edit an existing Variableexpense |
| [**variableexpenseGetAutocompleteV2**](ObjectVariableexpenseApi.md#variableexpenseGetAutocompleteV2) | **GET** /2/object/variableexpense/getAutocomplete/{sSelector} | Retrieve Variableexpenses and IDs |
| [**variableexpenseGetListV1**](ObjectVariableexpenseApi.md#variableexpenseGetListV1) | **GET** /1/object/variableexpense/getList | Retrieve Variableexpense list |
| [**variableexpenseGetObjectV2**](ObjectVariableexpenseApi.md#variableexpenseGetObjectV2) | **GET** /2/object/variableexpense/{pkiVariableexpenseID} | Retrieve an existing Variableexpense |


<a id="variableexpenseCreateObjectV1"></a>
# **variableexpenseCreateObjectV1**
> VariableexpenseCreateObjectV1Response variableexpenseCreateObjectV1(variableexpenseCreateObjectV1Request)

Create a new Variableexpense

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectVariableexpenseApi()
val variableexpenseCreateObjectV1Request : VariableexpenseCreateObjectV1Request =  // VariableexpenseCreateObjectV1Request | 
try {
    val result : VariableexpenseCreateObjectV1Response = apiInstance.variableexpenseCreateObjectV1(variableexpenseCreateObjectV1Request)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **variableexpenseCreateObjectV1Request** | [**VariableexpenseCreateObjectV1Request**](VariableexpenseCreateObjectV1Request.md)|  | |

### Return type

[**VariableexpenseCreateObjectV1Response**](VariableexpenseCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="variableexpenseEditObjectV1"></a>
# **variableexpenseEditObjectV1**
> VariableexpenseEditObjectV1Response variableexpenseEditObjectV1(pkiVariableexpenseID, variableexpenseEditObjectV1Request)

Edit an existing Variableexpense



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectVariableexpenseApi()
val pkiVariableexpenseID : kotlin.Int = 56 // kotlin.Int | 
val variableexpenseEditObjectV1Request : VariableexpenseEditObjectV1Request =  // VariableexpenseEditObjectV1Request | 
try {
    val result : VariableexpenseEditObjectV1Response = apiInstance.variableexpenseEditObjectV1(pkiVariableexpenseID, variableexpenseEditObjectV1Request)
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
| **pkiVariableexpenseID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **variableexpenseEditObjectV1Request** | [**VariableexpenseEditObjectV1Request**](VariableexpenseEditObjectV1Request.md)|  | |

### Return type

[**VariableexpenseEditObjectV1Response**](VariableexpenseEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="variableexpenseGetAutocompleteV2"></a>
# **variableexpenseGetAutocompleteV2**
> VariableexpenseGetAutocompleteV2Response variableexpenseGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

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
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : VariableexpenseGetAutocompleteV2Response = apiInstance.variableexpenseGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
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
| **sSelector** | **kotlin.String**| The type of Variableexpenses to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**VariableexpenseGetAutocompleteV2Response**](VariableexpenseGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="variableexpenseGetListV1"></a>
# **variableexpenseGetListV1**
> VariableexpenseGetListV1Response variableexpenseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

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
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : VariableexpenseGetListV1Response = apiInstance.variableexpenseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
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
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiVariableexpenseID_ASC, pkiVariableexpenseID_DESC, sVariableexpenseCode_ASC, sVariableexpenseCode_DESC, sVariableexpenseDescriptionX_ASC, sVariableexpenseDescriptionX_DESC, eVariableexpenseTaxable_ASC, eVariableexpenseTaxable_DESC, bVariableexpenseIsactive_ASC, bVariableexpenseIsactive_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**VariableexpenseGetListV1Response**](VariableexpenseGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="variableexpenseGetObjectV2"></a>
# **variableexpenseGetObjectV2**
> VariableexpenseGetObjectV2Response variableexpenseGetObjectV2(pkiVariableexpenseID)

Retrieve an existing Variableexpense



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectVariableexpenseApi()
val pkiVariableexpenseID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : VariableexpenseGetObjectV2Response = apiInstance.variableexpenseGetObjectV2(pkiVariableexpenseID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiVariableexpenseID** | **kotlin.Int**|  | |

### Return type

[**VariableexpenseGetObjectV2Response**](VariableexpenseGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


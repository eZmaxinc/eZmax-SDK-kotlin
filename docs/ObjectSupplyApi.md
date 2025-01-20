# ObjectSupplyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**supplyCreateObjectV1**](ObjectSupplyApi.md#supplyCreateObjectV1) | **POST** /1/object/supply | Create a new Supply |
| [**supplyDeleteObjectV1**](ObjectSupplyApi.md#supplyDeleteObjectV1) | **DELETE** /1/object/supply/{pkiSupplyID} | Delete an existing Supply |
| [**supplyEditObjectV1**](ObjectSupplyApi.md#supplyEditObjectV1) | **PUT** /1/object/supply/{pkiSupplyID} | Edit an existing Supply |
| [**supplyGetAutocompleteV2**](ObjectSupplyApi.md#supplyGetAutocompleteV2) | **GET** /2/object/supply/getAutocomplete/{sSelector} | Retrieve Supplys and IDs |
| [**supplyGetListV1**](ObjectSupplyApi.md#supplyGetListV1) | **GET** /1/object/supply/getList | Retrieve Supply list |
| [**supplyGetObjectV2**](ObjectSupplyApi.md#supplyGetObjectV2) | **GET** /2/object/supply/{pkiSupplyID} | Retrieve an existing Supply |


<a id="supplyCreateObjectV1"></a>
# **supplyCreateObjectV1**
> SupplyCreateObjectV1Response supplyCreateObjectV1(supplyCreateObjectV1Request)

Create a new Supply

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSupplyApi()
val supplyCreateObjectV1Request : SupplyCreateObjectV1Request =  // SupplyCreateObjectV1Request | 
try {
    val result : SupplyCreateObjectV1Response = apiInstance.supplyCreateObjectV1(supplyCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSupplyApi#supplyCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSupplyApi#supplyCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supplyCreateObjectV1Request** | [**SupplyCreateObjectV1Request**](SupplyCreateObjectV1Request.md)|  | |

### Return type

[**SupplyCreateObjectV1Response**](SupplyCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="supplyDeleteObjectV1"></a>
# **supplyDeleteObjectV1**
> CommonResponse supplyDeleteObjectV1(pkiSupplyID)

Delete an existing Supply



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSupplyApi()
val pkiSupplyID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Supply
try {
    val result : CommonResponse = apiInstance.supplyDeleteObjectV1(pkiSupplyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSupplyApi#supplyDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSupplyApi#supplyDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSupplyID** | **kotlin.Int**| The unique ID of the Supply | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="supplyEditObjectV1"></a>
# **supplyEditObjectV1**
> CommonResponse supplyEditObjectV1(pkiSupplyID, supplyEditObjectV1Request)

Edit an existing Supply



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSupplyApi()
val pkiSupplyID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Supply
val supplyEditObjectV1Request : SupplyEditObjectV1Request =  // SupplyEditObjectV1Request | 
try {
    val result : CommonResponse = apiInstance.supplyEditObjectV1(pkiSupplyID, supplyEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSupplyApi#supplyEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSupplyApi#supplyEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiSupplyID** | **kotlin.Int**| The unique ID of the Supply | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supplyEditObjectV1Request** | [**SupplyEditObjectV1Request**](SupplyEditObjectV1Request.md)|  | |

### Return type

[**CommonResponse**](CommonResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="supplyGetAutocompleteV2"></a>
# **supplyGetAutocompleteV2**
> SupplyGetAutocompleteV2Response supplyGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Supplys and IDs

Get the list of Supply to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSupplyApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Supplys to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : SupplyGetAutocompleteV2Response = apiInstance.supplyGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSupplyApi#supplyGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSupplyApi#supplyGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Supplys to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**SupplyGetAutocompleteV2Response**](SupplyGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="supplyGetListV1"></a>
# **supplyGetListV1**
> SupplyGetListV1Response supplyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Supply list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSupplyApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : SupplyGetListV1Response = apiInstance.supplyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSupplyApi#supplyGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSupplyApi#supplyGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiSupplyID_ASC, pkiSupplyID_DESC, fkiGlaccountID_ASC, fkiGlaccountID_DESC, fkiGlaccountcontainerID_ASC, fkiGlaccountcontainerID_DESC, fkiVariableexpenseID_ASC, fkiVariableexpenseID_DESC, sSupplyCode_ASC, sSupplyCode_DESC, sSupplyDescriptionX_ASC, sSupplyDescriptionX_DESC, dSupplyUnitprice_ASC, dSupplyUnitprice_DESC, bSupplyIsactive_ASC, bSupplyIsactive_DESC, bSupplyVariableprice_ASC, bSupplyVariableprice_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**SupplyGetListV1Response**](SupplyGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="supplyGetObjectV2"></a>
# **supplyGetObjectV2**
> SupplyGetObjectV2Response supplyGetObjectV2(pkiSupplyID)

Retrieve an existing Supply



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSupplyApi()
val pkiSupplyID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Supply
try {
    val result : SupplyGetObjectV2Response = apiInstance.supplyGetObjectV2(pkiSupplyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSupplyApi#supplyGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSupplyApi#supplyGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSupplyID** | **kotlin.Int**| The unique ID of the Supply | |

### Return type

[**SupplyGetObjectV2Response**](SupplyGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


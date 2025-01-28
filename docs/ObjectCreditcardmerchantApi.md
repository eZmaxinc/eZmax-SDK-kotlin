# ObjectCreditcardmerchantApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**creditcardmerchantCreateObjectV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantCreateObjectV1) | **POST** /1/object/creditcardmerchant | Create a new Creditcardmerchant |
| [**creditcardmerchantDeleteObjectV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantDeleteObjectV1) | **DELETE** /1/object/creditcardmerchant/{pkiCreditcardmerchantID} | Delete an existing Creditcardmerchant |
| [**creditcardmerchantEditObjectV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantEditObjectV1) | **PUT** /1/object/creditcardmerchant/{pkiCreditcardmerchantID} | Edit an existing Creditcardmerchant |
| [**creditcardmerchantGetAutocompleteV2**](ObjectCreditcardmerchantApi.md#creditcardmerchantGetAutocompleteV2) | **GET** /2/object/creditcardmerchant/getAutocomplete/{sSelector} | Retrieve Creditcardmerchants and IDs |
| [**creditcardmerchantGetListV1**](ObjectCreditcardmerchantApi.md#creditcardmerchantGetListV1) | **GET** /1/object/creditcardmerchant/getList | Retrieve Creditcardmerchant list |
| [**creditcardmerchantGetObjectV2**](ObjectCreditcardmerchantApi.md#creditcardmerchantGetObjectV2) | **GET** /2/object/creditcardmerchant/{pkiCreditcardmerchantID} | Retrieve an existing Creditcardmerchant |


<a id="creditcardmerchantCreateObjectV1"></a>
# **creditcardmerchantCreateObjectV1**
> CreditcardmerchantCreateObjectV1Response creditcardmerchantCreateObjectV1(creditcardmerchantCreateObjectV1Request)

Create a new Creditcardmerchant

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardmerchantApi()
val creditcardmerchantCreateObjectV1Request : CreditcardmerchantCreateObjectV1Request =  // CreditcardmerchantCreateObjectV1Request | 
try {
    val result : CreditcardmerchantCreateObjectV1Response = apiInstance.creditcardmerchantCreateObjectV1(creditcardmerchantCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardmerchantApi#creditcardmerchantCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardmerchantApi#creditcardmerchantCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **creditcardmerchantCreateObjectV1Request** | [**CreditcardmerchantCreateObjectV1Request**](CreditcardmerchantCreateObjectV1Request.md)|  | |

### Return type

[**CreditcardmerchantCreateObjectV1Response**](CreditcardmerchantCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="creditcardmerchantDeleteObjectV1"></a>
# **creditcardmerchantDeleteObjectV1**
> CreditcardmerchantDeleteObjectV1Response creditcardmerchantDeleteObjectV1(pkiCreditcardmerchantID)

Delete an existing Creditcardmerchant



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardmerchantApi()
val pkiCreditcardmerchantID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Creditcardmerchant
try {
    val result : CreditcardmerchantDeleteObjectV1Response = apiInstance.creditcardmerchantDeleteObjectV1(pkiCreditcardmerchantID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardmerchantApi#creditcardmerchantDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardmerchantApi#creditcardmerchantDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCreditcardmerchantID** | **kotlin.Int**| The unique ID of the Creditcardmerchant | |

### Return type

[**CreditcardmerchantDeleteObjectV1Response**](CreditcardmerchantDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="creditcardmerchantEditObjectV1"></a>
# **creditcardmerchantEditObjectV1**
> CreditcardmerchantEditObjectV1Response creditcardmerchantEditObjectV1(pkiCreditcardmerchantID, creditcardmerchantEditObjectV1Request)

Edit an existing Creditcardmerchant



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardmerchantApi()
val pkiCreditcardmerchantID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Creditcardmerchant
val creditcardmerchantEditObjectV1Request : CreditcardmerchantEditObjectV1Request =  // CreditcardmerchantEditObjectV1Request | 
try {
    val result : CreditcardmerchantEditObjectV1Response = apiInstance.creditcardmerchantEditObjectV1(pkiCreditcardmerchantID, creditcardmerchantEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardmerchantApi#creditcardmerchantEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardmerchantApi#creditcardmerchantEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiCreditcardmerchantID** | **kotlin.Int**| The unique ID of the Creditcardmerchant | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **creditcardmerchantEditObjectV1Request** | [**CreditcardmerchantEditObjectV1Request**](CreditcardmerchantEditObjectV1Request.md)|  | |

### Return type

[**CreditcardmerchantEditObjectV1Response**](CreditcardmerchantEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="creditcardmerchantGetAutocompleteV2"></a>
# **creditcardmerchantGetAutocompleteV2**
> CreditcardmerchantGetAutocompleteV2Response creditcardmerchantGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Creditcardmerchants and IDs

Get the list of Creditcardmerchant to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardmerchantApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Creditcardmerchants to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : CreditcardmerchantGetAutocompleteV2Response = apiInstance.creditcardmerchantGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardmerchantApi#creditcardmerchantGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardmerchantApi#creditcardmerchantGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Creditcardmerchants to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**CreditcardmerchantGetAutocompleteV2Response**](CreditcardmerchantGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="creditcardmerchantGetListV1"></a>
# **creditcardmerchantGetListV1**
> CreditcardmerchantGetListV1Response creditcardmerchantGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Creditcardmerchant list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardmerchantApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : CreditcardmerchantGetListV1Response = apiInstance.creditcardmerchantGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardmerchantApi#creditcardmerchantGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardmerchantApi#creditcardmerchantGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiCreditcardmerchantID_ASC, pkiCreditcardmerchantID_DESC, fkiBankaccountID_ASC, fkiBankaccountID_DESC, fkiLanguageID_ASC, fkiLanguageID_DESC, bCreditcardmerchantDenyvisa_ASC, bCreditcardmerchantDenyvisa_DESC, bCreditcardmerchantDenymastercard_ASC, bCreditcardmerchantDenymastercard_DESC, bCreditcardmerchantDenyamex_ASC, bCreditcardmerchantDenyamex_DESC, bCreditcardmerchantIsactive_ASC, bCreditcardmerchantIsactive_DESC, sCreditcardmerchantDescription_ASC, sCreditcardmerchantDescription_DESC, sCreditcardmerchantStoreid_ASC, sCreditcardmerchantStoreid_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**CreditcardmerchantGetListV1Response**](CreditcardmerchantGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="creditcardmerchantGetObjectV2"></a>
# **creditcardmerchantGetObjectV2**
> CreditcardmerchantGetObjectV2Response creditcardmerchantGetObjectV2(pkiCreditcardmerchantID)

Retrieve an existing Creditcardmerchant



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardmerchantApi()
val pkiCreditcardmerchantID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Creditcardmerchant
try {
    val result : CreditcardmerchantGetObjectV2Response = apiInstance.creditcardmerchantGetObjectV2(pkiCreditcardmerchantID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardmerchantApi#creditcardmerchantGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardmerchantApi#creditcardmerchantGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCreditcardmerchantID** | **kotlin.Int**| The unique ID of the Creditcardmerchant | |

### Return type

[**CreditcardmerchantGetObjectV2Response**](CreditcardmerchantGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectCreditcardclientApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creditcardclientCreateObjectV1**](ObjectCreditcardclientApi.md#creditcardclientCreateObjectV1) | **POST** /1/object/creditcardclient | Create a new Creditcardclient
[**creditcardclientDeleteObjectV1**](ObjectCreditcardclientApi.md#creditcardclientDeleteObjectV1) | **DELETE** /1/object/creditcardclient/{pkiCreditcardclientID} | Delete an existing Creditcardclient
[**creditcardclientEditObjectV1**](ObjectCreditcardclientApi.md#creditcardclientEditObjectV1) | **PUT** /1/object/creditcardclient/{pkiCreditcardclientID} | Edit an existing Creditcardclient
[**creditcardclientGetAutocompleteV2**](ObjectCreditcardclientApi.md#creditcardclientGetAutocompleteV2) | **GET** /2/object/creditcardclient/getAutocomplete/{sSelector} | Retrieve Creditcardclients and IDs
[**creditcardclientGetListV1**](ObjectCreditcardclientApi.md#creditcardclientGetListV1) | **GET** /1/object/creditcardclient/getList | Retrieve Creditcardclient list
[**creditcardclientGetObjectV2**](ObjectCreditcardclientApi.md#creditcardclientGetObjectV2) | **GET** /2/object/creditcardclient/{pkiCreditcardclientID} | Retrieve an existing Creditcardclient


<a id="creditcardclientCreateObjectV1"></a>
# **creditcardclientCreateObjectV1**
> CreditcardclientCreateObjectV1Response creditcardclientCreateObjectV1(creditcardclientCreateObjectV1Request)

Create a new Creditcardclient

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardclientApi()
val creditcardclientCreateObjectV1Request : CreditcardclientCreateObjectV1Request =  // CreditcardclientCreateObjectV1Request | 
try {
    val result : CreditcardclientCreateObjectV1Response = apiInstance.creditcardclientCreateObjectV1(creditcardclientCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardclientApi#creditcardclientCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardclientApi#creditcardclientCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creditcardclientCreateObjectV1Request** | [**CreditcardclientCreateObjectV1Request**](CreditcardclientCreateObjectV1Request.md)|  |

### Return type

[**CreditcardclientCreateObjectV1Response**](CreditcardclientCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="creditcardclientDeleteObjectV1"></a>
# **creditcardclientDeleteObjectV1**
> CreditcardclientDeleteObjectV1Response creditcardclientDeleteObjectV1(pkiCreditcardclientID)

Delete an existing Creditcardclient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardclientApi()
val pkiCreditcardclientID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Creditcardclient
try {
    val result : CreditcardclientDeleteObjectV1Response = apiInstance.creditcardclientDeleteObjectV1(pkiCreditcardclientID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardclientApi#creditcardclientDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardclientApi#creditcardclientDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCreditcardclientID** | **kotlin.Int**| The unique ID of the Creditcardclient |

### Return type

[**CreditcardclientDeleteObjectV1Response**](CreditcardclientDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="creditcardclientEditObjectV1"></a>
# **creditcardclientEditObjectV1**
> CreditcardclientEditObjectV1Response creditcardclientEditObjectV1(pkiCreditcardclientID, creditcardclientEditObjectV1Request)

Edit an existing Creditcardclient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardclientApi()
val pkiCreditcardclientID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Creditcardclient
val creditcardclientEditObjectV1Request : CreditcardclientEditObjectV1Request =  // CreditcardclientEditObjectV1Request | 
try {
    val result : CreditcardclientEditObjectV1Response = apiInstance.creditcardclientEditObjectV1(pkiCreditcardclientID, creditcardclientEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardclientApi#creditcardclientEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardclientApi#creditcardclientEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCreditcardclientID** | **kotlin.Int**| The unique ID of the Creditcardclient |
 **creditcardclientEditObjectV1Request** | [**CreditcardclientEditObjectV1Request**](CreditcardclientEditObjectV1Request.md)|  |

### Return type

[**CreditcardclientEditObjectV1Response**](CreditcardclientEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="creditcardclientGetAutocompleteV2"></a>
# **creditcardclientGetAutocompleteV2**
> CreditcardclientGetAutocompleteV2Response creditcardclientGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Creditcardclients and IDs

Get the list of Creditcardclient to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardclientApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Creditcardclients to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : CreditcardclientGetAutocompleteV2Response = apiInstance.creditcardclientGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardclientApi#creditcardclientGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardclientApi#creditcardclientGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Creditcardclients to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**CreditcardclientGetAutocompleteV2Response**](CreditcardclientGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="creditcardclientGetListV1"></a>
# **creditcardclientGetListV1**
> CreditcardclientGetListV1Response creditcardclientGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Creditcardclient list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardclientApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : CreditcardclientGetListV1Response = apiInstance.creditcardclientGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardclientApi#creditcardclientGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardclientApi#creditcardclientGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiCreditcardclientID_ASC, pkiCreditcardclientID_DESC, fkiCreditcarddetailID_ASC, fkiCreditcarddetailID_DESC, bCreditcardclientrelationIsdefault_ASC, bCreditcardclientrelationIsdefault_DESC, sCreditcardclientDescription_ASC, sCreditcardclientDescription_DESC, bCreditcardclientIsactive_ASC, bCreditcardclientIsactive_DESC, bCreditcardclientAllowedagencypayment_ASC, bCreditcardclientAllowedagencypayment_DESC, bCreditcardclientAllowedroyallepageprotection_ASC, bCreditcardclientAllowedroyallepageprotection_DESC, bCreditcardclientAllowedtranquillit_ASC, bCreditcardclientAllowedtranquillit_DESC, iCreditcarddetailExpirationmonth_ASC, iCreditcarddetailExpirationmonth_DESC, iCreditcarddetailExpirationyear_ASC, iCreditcarddetailExpirationyear_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**CreditcardclientGetListV1Response**](CreditcardclientGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="creditcardclientGetObjectV2"></a>
# **creditcardclientGetObjectV2**
> CreditcardclientGetObjectV2Response creditcardclientGetObjectV2(pkiCreditcardclientID)

Retrieve an existing Creditcardclient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCreditcardclientApi()
val pkiCreditcardclientID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Creditcardclient
try {
    val result : CreditcardclientGetObjectV2Response = apiInstance.creditcardclientGetObjectV2(pkiCreditcardclientID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCreditcardclientApi#creditcardclientGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCreditcardclientApi#creditcardclientGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiCreditcardclientID** | **kotlin.Int**| The unique ID of the Creditcardclient |

### Return type

[**CreditcardclientGetObjectV2Response**](CreditcardclientGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ObjectBillingentityexternalApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**billingentityexternalGenerateFederationTokenV1**](ObjectBillingentityexternalApi.md#billingentityexternalGenerateFederationTokenV1) | **POST** /1/object/billingentityexternal/{pkiBillingentityexternalID}/generateFederationToken | Generate a federation token |
| [**billingentityexternalGetAutocompleteV2**](ObjectBillingentityexternalApi.md#billingentityexternalGetAutocompleteV2) | **GET** /2/object/billingentityexternal/getAutocomplete/{sSelector} | Retrieve Billingentityexternals and IDs |


<a id="billingentityexternalGenerateFederationTokenV1"></a>
# **billingentityexternalGenerateFederationTokenV1**
> BillingentityexternalGenerateFederationTokenV1Response billingentityexternalGenerateFederationTokenV1(pkiBillingentityexternalID, billingentityexternalGenerateFederationTokenV1Request)

Generate a federation token



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBillingentityexternalApi()
val pkiBillingentityexternalID : kotlin.Int = 56 // kotlin.Int | 
val billingentityexternalGenerateFederationTokenV1Request : BillingentityexternalGenerateFederationTokenV1Request =  // BillingentityexternalGenerateFederationTokenV1Request | 
try {
    val result : BillingentityexternalGenerateFederationTokenV1Response = apiInstance.billingentityexternalGenerateFederationTokenV1(pkiBillingentityexternalID, billingentityexternalGenerateFederationTokenV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBillingentityexternalApi#billingentityexternalGenerateFederationTokenV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBillingentityexternalApi#billingentityexternalGenerateFederationTokenV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiBillingentityexternalID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **billingentityexternalGenerateFederationTokenV1Request** | [**BillingentityexternalGenerateFederationTokenV1Request**](BillingentityexternalGenerateFederationTokenV1Request.md)|  | |

### Return type

[**BillingentityexternalGenerateFederationTokenV1Response**](BillingentityexternalGenerateFederationTokenV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="billingentityexternalGetAutocompleteV2"></a>
# **billingentityexternalGetAutocompleteV2**
> BillingentityexternalGetAutocompleteV2Response billingentityexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Billingentityexternals and IDs

Get the list of Billingentityexternal to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBillingentityexternalApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Billingentityexternals to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : BillingentityexternalGetAutocompleteV2Response = apiInstance.billingentityexternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBillingentityexternalApi#billingentityexternalGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBillingentityexternalApi#billingentityexternalGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Billingentityexternals to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**BillingentityexternalGetAutocompleteV2Response**](BillingentityexternalGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


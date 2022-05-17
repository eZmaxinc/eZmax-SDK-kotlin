# ObjectSecretquestionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secretquestionGetAutocompleteV1**](ObjectSecretquestionApi.md#secretquestionGetAutocompleteV1) | **GET** /1/object/secretquestion/getAutocomplete/{sSelector} | Retrieve Secretquestions and IDs


<a name="secretquestionGetAutocompleteV1"></a>
# **secretquestionGetAutocompleteV1**
> CommonMinusGetAutocompleteMinusV1MinusResponse secretquestionGetAutocompleteV1(sSelector, sQuery, acceptLanguage)

Retrieve Secretquestions and IDs

Get the list of Secretquestions to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSecretquestionApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Secretquestions to return
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : CommonMinusGetAutocompleteMinusV1MinusResponse = apiInstance.secretquestionGetAutocompleteV1(sSelector, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSecretquestionApi#secretquestionGetAutocompleteV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSecretquestionApi#secretquestionGetAutocompleteV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Secretquestions to return | [enum: All]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**CommonMinusGetAutocompleteMinusV1MinusResponse**](CommonMinusGetAutocompleteMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


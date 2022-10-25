# ObjectDepartmentApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**departmentGetAutocompleteV1**](ObjectDepartmentApi.md#departmentGetAutocompleteV1) | **GET** /1/object/department/getAutocomplete/{sSelector} | Retrieve Departments and IDs
[**departmentGetAutocompleteV2**](ObjectDepartmentApi.md#departmentGetAutocompleteV2) | **GET** /2/object/department/getAutocomplete/{sSelector} | Retrieve Departments and IDs
[**departmentGetMembersV1**](ObjectDepartmentApi.md#departmentGetMembersV1) | **GET** /1/object/department/{pkiDepartmentID}/getMembers | Retrieve an existing Department&#39;s members


<a name="departmentGetAutocompleteV1"></a>
# **departmentGetAutocompleteV1**
> CommonMinusGetAutocompleteMinusV1MinusResponse departmentGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Departments and IDs

Get the list of Department to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepartmentApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Departments to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : CommonMinusGetAutocompleteMinusV1MinusResponse = apiInstance.departmentGetAutocompleteV1(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepartmentApi#departmentGetAutocompleteV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepartmentApi#departmentGetAutocompleteV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Departments to return | [enum: All, AllButDepartmentZero, Company, CompanyButDepartmentZero]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
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

<a name="departmentGetAutocompleteV2"></a>
# **departmentGetAutocompleteV2**
> DepartmentMinusGetAutocompleteMinusV2MinusResponse departmentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Departments and IDs

Get the list of Department to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepartmentApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Departments to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : DepartmentMinusGetAutocompleteMinusV2MinusResponse = apiInstance.departmentGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepartmentApi#departmentGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepartmentApi#departmentGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Departments to return | [enum: All, AllButDepartmentZero, Company, CompanyButDepartmentZero]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**DepartmentMinusGetAutocompleteMinusV2MinusResponse**](DepartmentMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="departmentGetMembersV1"></a>
# **departmentGetMembersV1**
> DepartmentMinusGetMembersMinusV1MinusResponse departmentGetMembersV1(pkiDepartmentID)

Retrieve an existing Department&#39;s members



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDepartmentApi()
val pkiDepartmentID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DepartmentMinusGetMembersMinusV1MinusResponse = apiInstance.departmentGetMembersV1(pkiDepartmentID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDepartmentApi#departmentGetMembersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDepartmentApi#departmentGetMembersV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiDepartmentID** | **kotlin.Int**|  |

### Return type

[**DepartmentMinusGetMembersMinusV1MinusResponse**](DepartmentMinusGetMembersMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


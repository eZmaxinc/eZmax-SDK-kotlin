# ObjectCustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**customerCreateObjectV1**](ObjectCustomerApi.md#customerCreateObjectV1) | **POST** /1/object/customer | Create a new Customer |
| [**customerGetAutocompleteV2**](ObjectCustomerApi.md#customerGetAutocompleteV2) | **GET** /2/object/customer/getAutocomplete/{sSelector} | Retrieve Customers and IDs |
| [**customerGetListV1**](ObjectCustomerApi.md#customerGetListV1) | **GET** /1/object/customer/getList | Retrieve Customer list |
| [**customerGetObjectV2**](ObjectCustomerApi.md#customerGetObjectV2) | **GET** /2/object/customer/{pkiCustomerID} | Retrieve an existing Customer |
| [**customerImportIntoEDMV1**](ObjectCustomerApi.md#customerImportIntoEDMV1) | **POST** /1/object/customer/{pkiCustomerID}/importIntoEDM | Import attachments into the Buyercontract |


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
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
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

<a id="customerGetListV1"></a>
# **customerGetListV1**
> CustomerGetListV1Response customerGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Customer list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : CustomerGetListV1Response = apiInstance.customerGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiCustomerID_ASC, pkiCustomerID_DESC, sCustomerName_ASC, sCustomerName_DESC, sCustomerNote_ASC, sCustomerNote_DESC, sCustomerCode_ASC, sCustomerCode_DESC, bCustomerIsactive_ASC, bCustomerIsactive_DESC, sPhoneE164_ASC, sPhoneE164_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**CustomerGetListV1Response**](CustomerGetListV1Response.md)

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

<a id="customerImportIntoEDMV1"></a>
# **customerImportIntoEDMV1**
> CustomerImportIntoEDMV1Response customerImportIntoEDMV1(pkiCustomerID, customerImportIntoEDMV1Request)

Import attachments into the Buyercontract



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomerApi()
val pkiCustomerID : kotlin.Int = 56 // kotlin.Int | 
val customerImportIntoEDMV1Request : CustomerImportIntoEDMV1Request =  // CustomerImportIntoEDMV1Request | 
try {
    val result : CustomerImportIntoEDMV1Response = apiInstance.customerImportIntoEDMV1(pkiCustomerID, customerImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomerApi#customerImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomerApi#customerImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiCustomerID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerImportIntoEDMV1Request** | [**CustomerImportIntoEDMV1Request**](CustomerImportIntoEDMV1Request.md)|  | |

### Return type

[**CustomerImportIntoEDMV1Response**](CustomerImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


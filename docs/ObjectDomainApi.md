# ObjectDomainApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**domainCreateObjectV1**](ObjectDomainApi.md#domainCreateObjectV1) | **POST** /1/object/domain | Create a new Domain |
| [**domainDeleteObjectV1**](ObjectDomainApi.md#domainDeleteObjectV1) | **DELETE** /1/object/domain/{pkiDomainID} | Delete an existing Domain |
| [**domainGetAutocompleteV2**](ObjectDomainApi.md#domainGetAutocompleteV2) | **GET** /2/object/domain/getAutocomplete/{sSelector} | Retrieve Domain and IDs |
| [**domainGetListV1**](ObjectDomainApi.md#domainGetListV1) | **GET** /1/object/domain/getList | Retrieve Domain list |
| [**domainGetObjectV2**](ObjectDomainApi.md#domainGetObjectV2) | **GET** /2/object/domain/{pkiDomainID} | Retrieve an existing Domain |


<a id="domainCreateObjectV1"></a>
# **domainCreateObjectV1**
> DomainCreateObjectV1Response domainCreateObjectV1(domainCreateObjectV1Request)

Create a new Domain

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDomainApi()
val domainCreateObjectV1Request : DomainCreateObjectV1Request =  // DomainCreateObjectV1Request | 
try {
    val result : DomainCreateObjectV1Response = apiInstance.domainCreateObjectV1(domainCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDomainApi#domainCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDomainApi#domainCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainCreateObjectV1Request** | [**DomainCreateObjectV1Request**](DomainCreateObjectV1Request.md)|  | |

### Return type

[**DomainCreateObjectV1Response**](DomainCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="domainDeleteObjectV1"></a>
# **domainDeleteObjectV1**
> DomainDeleteObjectV1Response domainDeleteObjectV1(pkiDomainID)

Delete an existing Domain



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDomainApi()
val pkiDomainID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Domain
try {
    val result : DomainDeleteObjectV1Response = apiInstance.domainDeleteObjectV1(pkiDomainID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDomainApi#domainDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDomainApi#domainDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDomainID** | **kotlin.Int**| The unique ID of the Domain | |

### Return type

[**DomainDeleteObjectV1Response**](DomainDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="domainGetAutocompleteV2"></a>
# **domainGetAutocompleteV2**
> DomainGetAutocompleteV2Response domainGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Domain and IDs

Get the list of Domains to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDomainApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Domain to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : DomainGetAutocompleteV2Response = apiInstance.domainGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDomainApi#domainGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDomainApi#domainGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Domain to return | [enum: All, ValidEmail] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to EFilterActive.Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**DomainGetAutocompleteV2Response**](DomainGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="domainGetListV1"></a>
# **domainGetListV1**
> DomainGetListV1Response domainGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Domain list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDomainApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : DomainGetListV1Response = apiInstance.domainGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDomainApi#domainGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDomainApi#domainGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiDomainID_ASC, pkiDomainID_DESC, sDomainName_ASC, sDomainName_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**DomainGetListV1Response**](DomainGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="domainGetObjectV2"></a>
# **domainGetObjectV2**
> DomainGetObjectV2Response domainGetObjectV2(pkiDomainID)

Retrieve an existing Domain



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectDomainApi()
val pkiDomainID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Domain
try {
    val result : DomainGetObjectV2Response = apiInstance.domainGetObjectV2(pkiDomainID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectDomainApi#domainGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectDomainApi#domainGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiDomainID** | **kotlin.Int**| The unique ID of the Domain | |

### Return type

[**DomainGetObjectV2Response**](DomainGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


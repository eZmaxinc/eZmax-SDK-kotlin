# ObjectBrandingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandingCreateObjectV1**](ObjectBrandingApi.md#brandingCreateObjectV1) | **POST** /1/object/branding | Create a new Branding
[**brandingEditObjectV1**](ObjectBrandingApi.md#brandingEditObjectV1) | **PUT** /1/object/branding/{pkiBrandingID} | Edit an existing Branding
[**brandingGetAutocompleteV2**](ObjectBrandingApi.md#brandingGetAutocompleteV2) | **GET** /2/object/branding/getAutocomplete/{sSelector} | Retrieve Brandings and IDs
[**brandingGetListV1**](ObjectBrandingApi.md#brandingGetListV1) | **GET** /1/object/branding/getList | Retrieve Branding list
[**brandingGetObjectV2**](ObjectBrandingApi.md#brandingGetObjectV2) | **GET** /2/object/branding/{pkiBrandingID} | Retrieve an existing Branding


<a name="brandingCreateObjectV1"></a>
# **brandingCreateObjectV1**
> BrandingMinusCreateObjectMinusV1MinusResponse brandingCreateObjectV1(brandingMinusCreateObjectMinusV1MinusRequest)

Create a new Branding

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrandingApi()
val brandingMinusCreateObjectMinusV1MinusRequest : BrandingMinusCreateObjectMinusV1MinusRequest =  // BrandingMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : BrandingMinusCreateObjectMinusV1MinusResponse = apiInstance.brandingCreateObjectV1(brandingMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrandingApi#brandingCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrandingApi#brandingCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandingMinusCreateObjectMinusV1MinusRequest** | [**BrandingMinusCreateObjectMinusV1MinusRequest**](BrandingMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**BrandingMinusCreateObjectMinusV1MinusResponse**](BrandingMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="brandingEditObjectV1"></a>
# **brandingEditObjectV1**
> BrandingMinusEditObjectMinusV1MinusResponse brandingEditObjectV1(pkiBrandingID, brandingMinusEditObjectMinusV1MinusRequest)

Edit an existing Branding



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrandingApi()
val pkiBrandingID : kotlin.Int = 56 // kotlin.Int | 
val brandingMinusEditObjectMinusV1MinusRequest : BrandingMinusEditObjectMinusV1MinusRequest =  // BrandingMinusEditObjectMinusV1MinusRequest | 
try {
    val result : BrandingMinusEditObjectMinusV1MinusResponse = apiInstance.brandingEditObjectV1(pkiBrandingID, brandingMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrandingApi#brandingEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrandingApi#brandingEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrandingID** | **kotlin.Int**|  |
 **brandingMinusEditObjectMinusV1MinusRequest** | [**BrandingMinusEditObjectMinusV1MinusRequest**](BrandingMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**BrandingMinusEditObjectMinusV1MinusResponse**](BrandingMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="brandingGetAutocompleteV2"></a>
# **brandingGetAutocompleteV2**
> BrandingMinusGetAutocompleteMinusV2MinusResponse brandingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Brandings and IDs

Get the list of Branding to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrandingApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Brandings to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
try {
    val result : BrandingMinusGetAutocompleteMinusV2MinusResponse = apiInstance.brandingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrandingApi#brandingGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrandingApi#brandingGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sSelector** | **kotlin.String**| The type of Brandings to return | [enum: All]
 **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive]
 **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**BrandingMinusGetAutocompleteMinusV2MinusResponse**](BrandingMinusGetAutocompleteMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="brandingGetListV1"></a>
# **brandingGetListV1**
> BrandingMinusGetListMinusV1MinusResponse brandingGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Branding list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eBrandingLogo | Default&lt;br&gt;JPEG&lt;br&gt;PNG |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrandingApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : BrandingMinusGetListMinusV1MinusResponse = apiInstance.brandingGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrandingApi#brandingGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrandingApi#brandingGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiBrandingID_ASC, pkiBrandingID_DESC, sBrandingDescriptionX_ASC, sBrandingDescriptionX_DESC, iBrandingColortext_ASC, iBrandingColortext_DESC, iBrandingColortextlinkbox_ASC, iBrandingColortextlinkbox_DESC, iBrandingColortextbutton_ASC, iBrandingColortextbutton_DESC, iBrandingColorbackground_ASC, iBrandingColorbackground_DESC, iBrandingColorbackgroundbutton_ASC, iBrandingColorbackgroundbutton_DESC, iBrandingColorbackgroundsmallbox_ASC, iBrandingColorbackgroundsmallbox_DESC, bBrandingIsactive_ASC, bBrandingIsactive_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**BrandingMinusGetListMinusV1MinusResponse**](BrandingMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="brandingGetObjectV2"></a>
# **brandingGetObjectV2**
> BrandingMinusGetObjectMinusV2MinusResponse brandingGetObjectV2(pkiBrandingID)

Retrieve an existing Branding



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrandingApi()
val pkiBrandingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BrandingMinusGetObjectMinusV2MinusResponse = apiInstance.brandingGetObjectV2(pkiBrandingID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBrandingApi#brandingGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBrandingApi#brandingGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiBrandingID** | **kotlin.Int**|  |

### Return type

[**BrandingMinusGetObjectMinusV2MinusResponse**](BrandingMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


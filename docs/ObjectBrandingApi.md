# ObjectBrandingApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandingCreateObjectV1**](ObjectBrandingApi.md#brandingCreateObjectV1) | **POST** /1/object/branding | Create a new Branding
[**brandingEditObjectV1**](ObjectBrandingApi.md#brandingEditObjectV1) | **PUT** /1/object/branding/{pkiBrandingID} | Edit an existing Branding
[**brandingGetAutocompleteV2**](ObjectBrandingApi.md#brandingGetAutocompleteV2) | **GET** /2/object/branding/getAutocomplete/{sSelector} | Retrieve Brandings and IDs
[**brandingGetListV1**](ObjectBrandingApi.md#brandingGetListV1) | **GET** /1/object/branding/getList | Retrieve Branding list
[**brandingGetObjectV2**](ObjectBrandingApi.md#brandingGetObjectV2) | **GET** /2/object/branding/{pkiBrandingID} | Retrieve an existing Branding


<a id="brandingCreateObjectV1"></a>
# **brandingCreateObjectV1**
> BrandingCreateObjectV1Response brandingCreateObjectV1(brandingCreateObjectV1Request)

Create a new Branding

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrandingApi()
val brandingCreateObjectV1Request : BrandingCreateObjectV1Request =  // BrandingCreateObjectV1Request | 
try {
    val result : BrandingCreateObjectV1Response = apiInstance.brandingCreateObjectV1(brandingCreateObjectV1Request)
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
 **brandingCreateObjectV1Request** | [**BrandingCreateObjectV1Request**](BrandingCreateObjectV1Request.md)|  |

### Return type

[**BrandingCreateObjectV1Response**](BrandingCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="brandingEditObjectV1"></a>
# **brandingEditObjectV1**
> BrandingEditObjectV1Response brandingEditObjectV1(pkiBrandingID, brandingEditObjectV1Request)

Edit an existing Branding



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrandingApi()
val pkiBrandingID : kotlin.Int = 56 // kotlin.Int | 
val brandingEditObjectV1Request : BrandingEditObjectV1Request =  // BrandingEditObjectV1Request | 
try {
    val result : BrandingEditObjectV1Response = apiInstance.brandingEditObjectV1(pkiBrandingID, brandingEditObjectV1Request)
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
 **brandingEditObjectV1Request** | [**BrandingEditObjectV1Request**](BrandingEditObjectV1Request.md)|  |

### Return type

[**BrandingEditObjectV1Response**](BrandingEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="brandingGetAutocompleteV2"></a>
# **brandingGetAutocompleteV2**
> BrandingGetAutocompleteV2Response brandingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

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
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : BrandingGetAutocompleteV2Response = apiInstance.brandingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
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
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]

### Return type

[**BrandingGetAutocompleteV2Response**](BrandingGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="brandingGetListV1"></a>
# **brandingGetListV1**
> BrandingGetListV1Response brandingGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

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
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : BrandingGetListV1Response = apiInstance.brandingGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
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
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**BrandingGetListV1Response**](BrandingGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="brandingGetObjectV2"></a>
# **brandingGetObjectV2**
> BrandingGetObjectV2Response brandingGetObjectV2(pkiBrandingID)

Retrieve an existing Branding



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBrandingApi()
val pkiBrandingID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BrandingGetObjectV2Response = apiInstance.brandingGetObjectV2(pkiBrandingID)
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

[**BrandingGetObjectV2Response**](BrandingGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


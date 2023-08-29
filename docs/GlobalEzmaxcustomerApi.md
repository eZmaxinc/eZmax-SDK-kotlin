# GlobalEzmaxcustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalEzmaxcustomerGetConfigurationV1**](GlobalEzmaxcustomerApi.md#globalEzmaxcustomerGetConfigurationV1) | **GET** /1/ezmaxcustomer/{pksEzmaxcustomerCode}/getConfiguration | Get ezmaxcustomer configuration


<a id="globalEzmaxcustomerGetConfigurationV1"></a>
# **globalEzmaxcustomerGetConfigurationV1**
> GlobalEzmaxcustomerGetConfigurationV1Response globalEzmaxcustomerGetConfigurationV1(pksEzmaxcustomerCode)

Get ezmaxcustomer configuration

Retrieve the ezmaxcustomer&#39;s specific configuration. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = GlobalEzmaxcustomerApi()
val pksEzmaxcustomerCode : kotlin.String = pksEzmaxcustomerCode_example // kotlin.String | 
try {
    val result : GlobalEzmaxcustomerGetConfigurationV1Response = apiInstance.globalEzmaxcustomerGetConfigurationV1(pksEzmaxcustomerCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlobalEzmaxcustomerApi#globalEzmaxcustomerGetConfigurationV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlobalEzmaxcustomerApi#globalEzmaxcustomerGetConfigurationV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pksEzmaxcustomerCode** | **kotlin.String**|  |

### Return type

[**GlobalEzmaxcustomerGetConfigurationV1Response**](GlobalEzmaxcustomerGetConfigurationV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


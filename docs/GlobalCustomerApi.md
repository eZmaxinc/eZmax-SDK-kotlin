# GlobalCustomerApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalCustomerGetEndpointV1**](GlobalCustomerApi.md#globalCustomerGetEndpointV1) | **GET** /1/customer/{pksCustomerCode}/endpoint | Get customer endpoint


<a id="globalCustomerGetEndpointV1"></a>
# **globalCustomerGetEndpointV1**
> GlobalCustomerGetEndpointV1Response globalCustomerGetEndpointV1(pksCustomerCode, sInfrastructureproductCode)

Get customer endpoint

Retrieve the customer&#39;s specific server endpoint where to send requests. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = GlobalCustomerApi()
val pksCustomerCode : kotlin.String = pksCustomerCode_example // kotlin.String | 
val sInfrastructureproductCode : kotlin.String = sInfrastructureproductCode_example // kotlin.String | The infrastructure product Code  If undefined, \"appcluster01\" is assumed
try {
    val result : GlobalCustomerGetEndpointV1Response = apiInstance.globalCustomerGetEndpointV1(pksCustomerCode, sInfrastructureproductCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlobalCustomerApi#globalCustomerGetEndpointV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlobalCustomerApi#globalCustomerGetEndpointV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pksCustomerCode** | **kotlin.String**|  |
 **sInfrastructureproductCode** | **kotlin.String**| The infrastructure product Code  If undefined, \&quot;appcluster01\&quot; is assumed | [optional] [enum: appcluster01, ezsignuser]

### Return type

[**GlobalCustomerGetEndpointV1Response**](GlobalCustomerGetEndpointV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# ScimServiceProviderConfigApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceProviderConfigGetObjectScimV2**](ScimServiceProviderConfigApi.md#serviceProviderConfigGetObjectScimV2) | **GET** /2/scim/ServiceProviderConfig | Get Service Provider Configuration


<a id="serviceProviderConfigGetObjectScimV2"></a>
# **serviceProviderConfigGetObjectScimV2**
> ScimServiceProviderConfig serviceProviderConfigGetObjectScimV2()

Get Service Provider Configuration

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ScimServiceProviderConfigApi()
try {
    val result : ScimServiceProviderConfig = apiInstance.serviceProviderConfigGetObjectScimV2()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScimServiceProviderConfigApi#serviceProviderConfigGetObjectScimV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScimServiceProviderConfigApi#serviceProviderConfigGetObjectScimV2")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ScimServiceProviderConfig**](ScimServiceProviderConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


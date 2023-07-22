# GlobalEzmaxclientApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalEzmaxclientVersionV1**](GlobalEzmaxclientApi.md#globalEzmaxclientVersionV1) | **GET** /1/ezmaxclient/{pksEzmaxclientOs}/version | Retrieve the latest version of the Ezmaxclient


<a id="globalEzmaxclientVersionV1"></a>
# **globalEzmaxclientVersionV1**
> GlobalMinusEzmaxclientMinusVersionMinusV1MinusResponse globalEzmaxclientVersionV1(pksEzmaxclientOs)

Retrieve the latest version of the Ezmaxclient

Retrieve the latest version of the Ezmaxclient that is available on the store.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = GlobalEzmaxclientApi()
val pksEzmaxclientOs : FieldMinusPksEzmaxclientOs =  // FieldMinusPksEzmaxclientOs | 
try {
    val result : GlobalMinusEzmaxclientMinusVersionMinusV1MinusResponse = apiInstance.globalEzmaxclientVersionV1(pksEzmaxclientOs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GlobalEzmaxclientApi#globalEzmaxclientVersionV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GlobalEzmaxclientApi#globalEzmaxclientVersionV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pksEzmaxclientOs** | [**FieldMinusPksEzmaxclientOs**](.md)|  | [enum: iOS, macOS, Windows]

### Return type

[**GlobalMinusEzmaxclientMinusVersionMinusV1MinusResponse**](GlobalMinusEzmaxclientMinusVersionMinusV1MinusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


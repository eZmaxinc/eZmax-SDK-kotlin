# GlobalEzmaxclientApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalEzmaxclientVersionV1**](GlobalEzmaxclientApi.md#globalEzmaxclientVersionV1) | **GET** /1/ezmaxclient/{pksEzmaxclientOs}/version | Retrieve the latest version of the Ezmaxclient


<a id="globalEzmaxclientVersionV1"></a>
# **globalEzmaxclientVersionV1**
> GlobalEzmaxclientVersionV1Response globalEzmaxclientVersionV1(pksEzmaxclientOs)

Retrieve the latest version of the Ezmaxclient

Retrieve the latest version of the Ezmaxclient that is available on the store.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = GlobalEzmaxclientApi()
val pksEzmaxclientOs : FieldPksEzmaxclientOs =  // FieldPksEzmaxclientOs | 
try {
    val result : GlobalEzmaxclientVersionV1Response = apiInstance.globalEzmaxclientVersionV1(pksEzmaxclientOs)
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
 **pksEzmaxclientOs** | [**FieldPksEzmaxclientOs**](.md)|  | [enum: iOS, macOS, Windows]

### Return type

[**GlobalEzmaxclientVersionV1Response**](GlobalEzmaxclientVersionV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


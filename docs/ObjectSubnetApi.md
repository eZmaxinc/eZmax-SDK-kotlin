# ObjectSubnetApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subnetCreateObjectV1**](ObjectSubnetApi.md#subnetCreateObjectV1) | **POST** /1/object/subnet | Create a new Subnet
[**subnetDeleteObjectV1**](ObjectSubnetApi.md#subnetDeleteObjectV1) | **DELETE** /1/object/subnet/{pkiSubnetID} | Delete an existing Subnet
[**subnetEditObjectV1**](ObjectSubnetApi.md#subnetEditObjectV1) | **PUT** /1/object/subnet/{pkiSubnetID} | Edit an existing Subnet
[**subnetGetObjectV2**](ObjectSubnetApi.md#subnetGetObjectV2) | **GET** /2/object/subnet/{pkiSubnetID} | Retrieve an existing Subnet


<a id="subnetCreateObjectV1"></a>
# **subnetCreateObjectV1**
> SubnetMinusCreateObjectMinusV1MinusResponse subnetCreateObjectV1(subnetMinusCreateObjectMinusV1MinusRequest)

Create a new Subnet

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSubnetApi()
val subnetMinusCreateObjectMinusV1MinusRequest : SubnetMinusCreateObjectMinusV1MinusRequest =  // SubnetMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : SubnetMinusCreateObjectMinusV1MinusResponse = apiInstance.subnetCreateObjectV1(subnetMinusCreateObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSubnetApi#subnetCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSubnetApi#subnetCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subnetMinusCreateObjectMinusV1MinusRequest** | [**SubnetMinusCreateObjectMinusV1MinusRequest**](SubnetMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**SubnetMinusCreateObjectMinusV1MinusResponse**](SubnetMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="subnetDeleteObjectV1"></a>
# **subnetDeleteObjectV1**
> SubnetMinusDeleteObjectMinusV1MinusResponse subnetDeleteObjectV1(pkiSubnetID)

Delete an existing Subnet



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSubnetApi()
val pkiSubnetID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Subnet
try {
    val result : SubnetMinusDeleteObjectMinusV1MinusResponse = apiInstance.subnetDeleteObjectV1(pkiSubnetID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSubnetApi#subnetDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSubnetApi#subnetDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSubnetID** | **kotlin.Int**| The unique ID of the Subnet |

### Return type

[**SubnetMinusDeleteObjectMinusV1MinusResponse**](SubnetMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="subnetEditObjectV1"></a>
# **subnetEditObjectV1**
> SubnetMinusEditObjectMinusV1MinusResponse subnetEditObjectV1(pkiSubnetID, subnetMinusEditObjectMinusV1MinusRequest)

Edit an existing Subnet



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSubnetApi()
val pkiSubnetID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Subnet
val subnetMinusEditObjectMinusV1MinusRequest : SubnetMinusEditObjectMinusV1MinusRequest =  // SubnetMinusEditObjectMinusV1MinusRequest | 
try {
    val result : SubnetMinusEditObjectMinusV1MinusResponse = apiInstance.subnetEditObjectV1(pkiSubnetID, subnetMinusEditObjectMinusV1MinusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSubnetApi#subnetEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSubnetApi#subnetEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSubnetID** | **kotlin.Int**| The unique ID of the Subnet |
 **subnetMinusEditObjectMinusV1MinusRequest** | [**SubnetMinusEditObjectMinusV1MinusRequest**](SubnetMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**SubnetMinusEditObjectMinusV1MinusResponse**](SubnetMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="subnetGetObjectV2"></a>
# **subnetGetObjectV2**
> SubnetMinusGetObjectMinusV2MinusResponse subnetGetObjectV2(pkiSubnetID)

Retrieve an existing Subnet



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSubnetApi()
val pkiSubnetID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Subnet
try {
    val result : SubnetMinusGetObjectMinusV2MinusResponse = apiInstance.subnetGetObjectV2(pkiSubnetID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSubnetApi#subnetGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSubnetApi#subnetGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiSubnetID** | **kotlin.Int**| The unique ID of the Subnet |

### Return type

[**SubnetMinusGetObjectMinusV2MinusResponse**](SubnetMinusGetObjectMinusV2MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


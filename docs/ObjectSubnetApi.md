# ObjectSubnetApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**subnetCreateObjectV1**](ObjectSubnetApi.md#subnetCreateObjectV1) | **POST** /1/object/subnet | Create a new Subnet |
| [**subnetDeleteObjectV1**](ObjectSubnetApi.md#subnetDeleteObjectV1) | **DELETE** /1/object/subnet/{pkiSubnetID} | Delete an existing Subnet |
| [**subnetEditObjectV1**](ObjectSubnetApi.md#subnetEditObjectV1) | **PUT** /1/object/subnet/{pkiSubnetID} | Edit an existing Subnet |
| [**subnetGetObjectV2**](ObjectSubnetApi.md#subnetGetObjectV2) | **GET** /2/object/subnet/{pkiSubnetID} | Retrieve an existing Subnet |


<a id="subnetCreateObjectV1"></a>
# **subnetCreateObjectV1**
> SubnetCreateObjectV1Response subnetCreateObjectV1(subnetCreateObjectV1Request)

Create a new Subnet

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSubnetApi()
val subnetCreateObjectV1Request : SubnetCreateObjectV1Request =  // SubnetCreateObjectV1Request | 
try {
    val result : SubnetCreateObjectV1Response = apiInstance.subnetCreateObjectV1(subnetCreateObjectV1Request)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subnetCreateObjectV1Request** | [**SubnetCreateObjectV1Request**](SubnetCreateObjectV1Request.md)|  | |

### Return type

[**SubnetCreateObjectV1Response**](SubnetCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="subnetDeleteObjectV1"></a>
# **subnetDeleteObjectV1**
> SubnetDeleteObjectV1Response subnetDeleteObjectV1(pkiSubnetID)

Delete an existing Subnet



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSubnetApi()
val pkiSubnetID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Subnet
try {
    val result : SubnetDeleteObjectV1Response = apiInstance.subnetDeleteObjectV1(pkiSubnetID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSubnetID** | **kotlin.Int**| The unique ID of the Subnet | |

### Return type

[**SubnetDeleteObjectV1Response**](SubnetDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="subnetEditObjectV1"></a>
# **subnetEditObjectV1**
> SubnetEditObjectV1Response subnetEditObjectV1(pkiSubnetID, subnetEditObjectV1Request)

Edit an existing Subnet



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSubnetApi()
val pkiSubnetID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Subnet
val subnetEditObjectV1Request : SubnetEditObjectV1Request =  // SubnetEditObjectV1Request | 
try {
    val result : SubnetEditObjectV1Response = apiInstance.subnetEditObjectV1(pkiSubnetID, subnetEditObjectV1Request)
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
| **pkiSubnetID** | **kotlin.Int**| The unique ID of the Subnet | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subnetEditObjectV1Request** | [**SubnetEditObjectV1Request**](SubnetEditObjectV1Request.md)|  | |

### Return type

[**SubnetEditObjectV1Response**](SubnetEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="subnetGetObjectV2"></a>
# **subnetGetObjectV2**
> SubnetGetObjectV2Response subnetGetObjectV2(pkiSubnetID)

Retrieve an existing Subnet



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSubnetApi()
val pkiSubnetID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Subnet
try {
    val result : SubnetGetObjectV2Response = apiInstance.subnetGetObjectV2(pkiSubnetID)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiSubnetID** | **kotlin.Int**| The unique ID of the Subnet | |

### Return type

[**SubnetGetObjectV2Response**](SubnetGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


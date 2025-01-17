# ObjectApikeyApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apikeyCreateObjectV2**](ObjectApikeyApi.md#apikeyCreateObjectV2) | **POST** /2/object/apikey | Create a new Apikey |
| [**apikeyEditObjectV1**](ObjectApikeyApi.md#apikeyEditObjectV1) | **PUT** /1/object/apikey/{pkiApikeyID} | Edit an existing Apikey |
| [**apikeyEditPermissionsV1**](ObjectApikeyApi.md#apikeyEditPermissionsV1) | **PUT** /1/object/apikey/{pkiApikeyID}/editPermissions | Edit multiple Permissions |
| [**apikeyGenerateDelegatedCredentialsV1**](ObjectApikeyApi.md#apikeyGenerateDelegatedCredentialsV1) | **POST** /1/object/apikey/generateDelegatedCredentials | Generate a delegated credentials |
| [**apikeyGetCorsV1**](ObjectApikeyApi.md#apikeyGetCorsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getCors | Retrieve an existing Apikey&#39;s cors |
| [**apikeyGetListV1**](ObjectApikeyApi.md#apikeyGetListV1) | **GET** /1/object/apikey/getList | Retrieve Apikey list |
| [**apikeyGetObjectV2**](ObjectApikeyApi.md#apikeyGetObjectV2) | **GET** /2/object/apikey/{pkiApikeyID} | Retrieve an existing Apikey |
| [**apikeyGetPermissionsV1**](ObjectApikeyApi.md#apikeyGetPermissionsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getPermissions | Retrieve an existing Apikey&#39;s Permissions |
| [**apikeyGetSubnetsV1**](ObjectApikeyApi.md#apikeyGetSubnetsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getSubnets | Retrieve an existing Apikey&#39;s subnets |
| [**apikeyRegenerateV1**](ObjectApikeyApi.md#apikeyRegenerateV1) | **POST** /1/object/apikey/{pkiApikeyID}/regenerate | Regenerate the Apikey |


<a id="apikeyCreateObjectV2"></a>
# **apikeyCreateObjectV2**
> ApikeyCreateObjectV2Response apikeyCreateObjectV2(apikeyCreateObjectV2Request)

Create a new Apikey

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val apikeyCreateObjectV2Request : ApikeyCreateObjectV2Request =  // ApikeyCreateObjectV2Request | 
try {
    val result : ApikeyCreateObjectV2Response = apiInstance.apikeyCreateObjectV2(apikeyCreateObjectV2Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyCreateObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyCreateObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **apikeyCreateObjectV2Request** | [**ApikeyCreateObjectV2Request**](ApikeyCreateObjectV2Request.md)|  | |

### Return type

[**ApikeyCreateObjectV2Response**](ApikeyCreateObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apikeyEditObjectV1"></a>
# **apikeyEditObjectV1**
> ApikeyEditObjectV1Response apikeyEditObjectV1(pkiApikeyID, apikeyEditObjectV1Request)

Edit an existing Apikey



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Apikey
val apikeyEditObjectV1Request : ApikeyEditObjectV1Request =  // ApikeyEditObjectV1Request | 
try {
    val result : ApikeyEditObjectV1Response = apiInstance.apikeyEditObjectV1(pkiApikeyID, apikeyEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyEditObjectV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiApikeyID** | **kotlin.Int**| The unique ID of the Apikey | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **apikeyEditObjectV1Request** | [**ApikeyEditObjectV1Request**](ApikeyEditObjectV1Request.md)|  | |

### Return type

[**ApikeyEditObjectV1Response**](ApikeyEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apikeyEditPermissionsV1"></a>
# **apikeyEditPermissionsV1**
> ApikeyEditPermissionsV1Response apikeyEditPermissionsV1(pkiApikeyID, apikeyEditPermissionsV1Request)

Edit multiple Permissions

Using this endpoint, you can edit multiple Permissions at the same time.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | 
val apikeyEditPermissionsV1Request : ApikeyEditPermissionsV1Request =  // ApikeyEditPermissionsV1Request | 
try {
    val result : ApikeyEditPermissionsV1Response = apiInstance.apikeyEditPermissionsV1(pkiApikeyID, apikeyEditPermissionsV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyEditPermissionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyEditPermissionsV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiApikeyID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **apikeyEditPermissionsV1Request** | [**ApikeyEditPermissionsV1Request**](ApikeyEditPermissionsV1Request.md)|  | |

### Return type

[**ApikeyEditPermissionsV1Response**](ApikeyEditPermissionsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apikeyGenerateDelegatedCredentialsV1"></a>
# **apikeyGenerateDelegatedCredentialsV1**
> ApikeyGenerateDelegatedCredentialsV1Response apikeyGenerateDelegatedCredentialsV1(apikeyGenerateDelegatedCredentialsV1Request)

Generate a delegated credentials



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val apikeyGenerateDelegatedCredentialsV1Request : ApikeyGenerateDelegatedCredentialsV1Request =  // ApikeyGenerateDelegatedCredentialsV1Request | 
try {
    val result : ApikeyGenerateDelegatedCredentialsV1Response = apiInstance.apikeyGenerateDelegatedCredentialsV1(apikeyGenerateDelegatedCredentialsV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyGenerateDelegatedCredentialsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyGenerateDelegatedCredentialsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **apikeyGenerateDelegatedCredentialsV1Request** | [**ApikeyGenerateDelegatedCredentialsV1Request**](ApikeyGenerateDelegatedCredentialsV1Request.md)|  | |

### Return type

[**ApikeyGenerateDelegatedCredentialsV1Response**](ApikeyGenerateDelegatedCredentialsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apikeyGetCorsV1"></a>
# **apikeyGetCorsV1**
> ApikeyGetCorsV1Response apikeyGetCorsV1(pkiApikeyID)

Retrieve an existing Apikey&#39;s cors

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ApikeyGetCorsV1Response = apiInstance.apikeyGetCorsV1(pkiApikeyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyGetCorsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyGetCorsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiApikeyID** | **kotlin.Int**|  | |

### Return type

[**ApikeyGetCorsV1Response**](ApikeyGetCorsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apikeyGetListV1"></a>
# **apikeyGetListV1**
> ApikeyGetListV1Response apikeyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Apikey list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---|

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : ApikeyGetListV1Response = apiInstance.apikeyGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiApikeyID_ASC, pkiApikeyID_DESC, sApikeyDescriptionX_ASC, sApikeyDescriptionX_DESC, bApikeyIssigned_ASC, bApikeyIssigned_DESC, bApikeyIsactive_ASC, bApikeyIsactive_DESC, sUserFirstname_ASC, sUserFirstname_DESC, sUserLastname_ASC, sUserLastname_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**ApikeyGetListV1Response**](ApikeyGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apikeyGetObjectV2"></a>
# **apikeyGetObjectV2**
> ApikeyGetObjectV2Response apikeyGetObjectV2(pkiApikeyID)

Retrieve an existing Apikey



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Apikey
try {
    val result : ApikeyGetObjectV2Response = apiInstance.apikeyGetObjectV2(pkiApikeyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiApikeyID** | **kotlin.Int**| The unique ID of the Apikey | |

### Return type

[**ApikeyGetObjectV2Response**](ApikeyGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apikeyGetPermissionsV1"></a>
# **apikeyGetPermissionsV1**
> ApikeyGetPermissionsV1Response apikeyGetPermissionsV1(pkiApikeyID)

Retrieve an existing Apikey&#39;s Permissions

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ApikeyGetPermissionsV1Response = apiInstance.apikeyGetPermissionsV1(pkiApikeyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyGetPermissionsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyGetPermissionsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiApikeyID** | **kotlin.Int**|  | |

### Return type

[**ApikeyGetPermissionsV1Response**](ApikeyGetPermissionsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apikeyGetSubnetsV1"></a>
# **apikeyGetSubnetsV1**
> ApikeyGetSubnetsV1Response apikeyGetSubnetsV1(pkiApikeyID)

Retrieve an existing Apikey&#39;s subnets

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ApikeyGetSubnetsV1Response = apiInstance.apikeyGetSubnetsV1(pkiApikeyID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyGetSubnetsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyGetSubnetsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiApikeyID** | **kotlin.Int**|  | |

### Return type

[**ApikeyGetSubnetsV1Response**](ApikeyGetSubnetsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apikeyRegenerateV1"></a>
# **apikeyRegenerateV1**
> ApikeyRegenerateV1Response apikeyRegenerateV1(pkiApikeyID, apikeyRegenerateV1Request)

Regenerate the Apikey



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectApikeyApi()
val pkiApikeyID : kotlin.Int = 56 // kotlin.Int | 
val apikeyRegenerateV1Request : ApikeyRegenerateV1Request =  // ApikeyRegenerateV1Request | 
try {
    val result : ApikeyRegenerateV1Response = apiInstance.apikeyRegenerateV1(pkiApikeyID, apikeyRegenerateV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectApikeyApi#apikeyRegenerateV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectApikeyApi#apikeyRegenerateV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiApikeyID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **apikeyRegenerateV1Request** | [**ApikeyRegenerateV1Request**](ApikeyRegenerateV1Request.md)|  | |

### Return type

[**ApikeyRegenerateV1Response**](ApikeyRegenerateV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


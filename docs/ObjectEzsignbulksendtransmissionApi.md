# ObjectEzsignbulksendtransmissionApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezsignbulksendtransmissionGetCsvErrorsV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetCsvErrorsV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getCsvErrors | Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors |
| [**ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getEzsignsignaturesAutomatic | Retrieve an existing Ezsignbulksendtransmission&#39;s automatic Ezsignsignatures |
| [**ezsignbulksendtransmissionGetFormsDataV1**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetFormsDataV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData | Retrieve an existing Ezsignbulksendtransmission&#39;s forms data |
| [**ezsignbulksendtransmissionGetObjectV2**](ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetObjectV2) | **GET** /2/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID} | Retrieve an existing Ezsignbulksendtransmission |


<a id="ezsignbulksendtransmissionGetCsvErrorsV1"></a>
# **ezsignbulksendtransmissionGetCsvErrorsV1**
> kotlin.String ezsignbulksendtransmissionGetCsvErrorsV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendtransmissionApi()
val pkiEzsignbulksendtransmissionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.String = apiInstance.ezsignbulksendtransmissionGetCsvErrorsV1(pkiEzsignbulksendtransmissionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetCsvErrorsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetCsvErrorsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignbulksendtransmissionID** | **kotlin.Int**|  | |

### Return type

**kotlin.String**

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1"></a>
# **ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1**
> EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission&#39;s automatic Ezsignsignatures

Return the Ezsignsignatures that can be signed by the current user at the current step in the process

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendtransmissionApi()
val pkiEzsignbulksendtransmissionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response = apiInstance.ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1(pkiEzsignbulksendtransmissionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignbulksendtransmissionID** | **kotlin.Int**|  | |

### Return type

[**EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response**](EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignbulksendtransmissionGetFormsDataV1"></a>
# **ezsignbulksendtransmissionGetFormsDataV1**
> EzsignbulksendtransmissionGetFormsDataV1Response ezsignbulksendtransmissionGetFormsDataV1(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission&#39;s forms data



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendtransmissionApi()
val pkiEzsignbulksendtransmissionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendtransmissionGetFormsDataV1Response = apiInstance.ezsignbulksendtransmissionGetFormsDataV1(pkiEzsignbulksendtransmissionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetFormsDataV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetFormsDataV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignbulksendtransmissionID** | **kotlin.Int**|  | |

### Return type

[**EzsignbulksendtransmissionGetFormsDataV1Response**](EzsignbulksendtransmissionGetFormsDataV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="ezsignbulksendtransmissionGetObjectV2"></a>
# **ezsignbulksendtransmissionGetObjectV2**
> EzsignbulksendtransmissionGetObjectV2Response ezsignbulksendtransmissionGetObjectV2(pkiEzsignbulksendtransmissionID)

Retrieve an existing Ezsignbulksendtransmission



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzsignbulksendtransmissionApi()
val pkiEzsignbulksendtransmissionID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : EzsignbulksendtransmissionGetObjectV2Response = apiInstance.ezsignbulksendtransmissionGetObjectV2(pkiEzsignbulksendtransmissionID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzsignbulksendtransmissionApi#ezsignbulksendtransmissionGetObjectV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiEzsignbulksendtransmissionID** | **kotlin.Int**|  | |

### Return type

[**EzsignbulksendtransmissionGetObjectV2Response**](EzsignbulksendtransmissionGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


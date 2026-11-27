# ObjectCustomertemplateApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**customertemplateGetDocumenttypechecklistV1**](ObjectCustomertemplateApi.md#customertemplateGetDocumenttypechecklistV1) | **GET** /1/object/customertemplate/{pkiCustomertemplateID}/getDocumenttypechecklist | Retrieve Document type checklist |
| [**customertemplateSyncDocumenttypechecklistV1**](ObjectCustomertemplateApi.md#customertemplateSyncDocumenttypechecklistV1) | **POST** /1/object/customertemplate/{pkiCustomertemplateID}/syncDocumenttypechecklist | Synchronize Document type checklist |


<a id="customertemplateGetDocumenttypechecklistV1"></a>
# **customertemplateGetDocumenttypechecklistV1**
> CustomertemplateGetDocumenttypechecklistV1Response customertemplateGetDocumenttypechecklistV1(pkiCustomertemplateID)

Retrieve Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomertemplateApi()
val pkiCustomertemplateID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : CustomertemplateGetDocumenttypechecklistV1Response = apiInstance.customertemplateGetDocumenttypechecklistV1(pkiCustomertemplateID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomertemplateApi#customertemplateGetDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomertemplateApi#customertemplateGetDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomertemplateID** | **kotlin.Int**|  | |

### Return type

[**CustomertemplateGetDocumenttypechecklistV1Response**](CustomertemplateGetDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customertemplateSyncDocumenttypechecklistV1"></a>
# **customertemplateSyncDocumenttypechecklistV1**
> CustomertemplateSyncDocumenttypechecklistV1Response customertemplateSyncDocumenttypechecklistV1(pkiCustomertemplateID, body)

Synchronize Document type checklist

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectCustomertemplateApi()
val pkiCustomertemplateID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : CustomertemplateSyncDocumenttypechecklistV1Response = apiInstance.customertemplateSyncDocumenttypechecklistV1(pkiCustomertemplateID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectCustomertemplateApi#customertemplateSyncDocumenttypechecklistV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectCustomertemplateApi#customertemplateSyncDocumenttypechecklistV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiCustomertemplateID** | **kotlin.Int**|  | |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**CustomertemplateSyncDocumenttypechecklistV1Response**](CustomertemplateSyncDocumenttypechecklistV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


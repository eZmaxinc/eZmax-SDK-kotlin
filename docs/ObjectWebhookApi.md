# ObjectWebhookApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookCreateObjectV1**](ObjectWebhookApi.md#webhookCreateObjectV1) | **POST** /1/object/webhook | Create a new Webhook
[**webhookDeleteObjectV1**](ObjectWebhookApi.md#webhookDeleteObjectV1) | **DELETE** /1/object/webhook/{pkiWebhookID} | Delete an existing Webhook
[**webhookEditObjectV1**](ObjectWebhookApi.md#webhookEditObjectV1) | **PUT** /1/object/webhook/{pkiWebhookID} | Edit an existing Webhook
[**webhookGetHistoryV1**](ObjectWebhookApi.md#webhookGetHistoryV1) | **GET** /1/object/webhook/{pkiWebhookID}/getHistory | Retrieve the logs for recent Webhook calls
[**webhookGetListV1**](ObjectWebhookApi.md#webhookGetListV1) | **GET** /1/object/webhook/getList | Retrieve Webhook list
[**webhookGetObjectV2**](ObjectWebhookApi.md#webhookGetObjectV2) | **GET** /2/object/webhook/{pkiWebhookID} | Retrieve an existing Webhook
[**webhookTestV1**](ObjectWebhookApi.md#webhookTestV1) | **POST** /1/object/webhook/{pkiWebhookID}/test | Test the Webhook by calling the Url


<a id="webhookCreateObjectV1"></a>
# **webhookCreateObjectV1**
> WebhookCreateObjectV1Response webhookCreateObjectV1(webhookCreateObjectV1Request)

Create a new Webhook

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectWebhookApi()
val webhookCreateObjectV1Request : WebhookCreateObjectV1Request =  // WebhookCreateObjectV1Request | 
try {
    val result : WebhookCreateObjectV1Response = apiInstance.webhookCreateObjectV1(webhookCreateObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectWebhookApi#webhookCreateObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectWebhookApi#webhookCreateObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCreateObjectV1Request** | [**WebhookCreateObjectV1Request**](WebhookCreateObjectV1Request.md)|  |

### Return type

[**WebhookCreateObjectV1Response**](WebhookCreateObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="webhookDeleteObjectV1"></a>
# **webhookDeleteObjectV1**
> WebhookDeleteObjectV1Response webhookDeleteObjectV1(pkiWebhookID)

Delete an existing Webhook



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectWebhookApi()
val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : WebhookDeleteObjectV1Response = apiInstance.webhookDeleteObjectV1(pkiWebhookID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectWebhookApi#webhookDeleteObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectWebhookApi#webhookDeleteObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiWebhookID** | **kotlin.Int**|  |

### Return type

[**WebhookDeleteObjectV1Response**](WebhookDeleteObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="webhookEditObjectV1"></a>
# **webhookEditObjectV1**
> WebhookEditObjectV1Response webhookEditObjectV1(pkiWebhookID, webhookEditObjectV1Request)

Edit an existing Webhook



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectWebhookApi()
val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
val webhookEditObjectV1Request : WebhookEditObjectV1Request =  // WebhookEditObjectV1Request | 
try {
    val result : WebhookEditObjectV1Response = apiInstance.webhookEditObjectV1(pkiWebhookID, webhookEditObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectWebhookApi#webhookEditObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectWebhookApi#webhookEditObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiWebhookID** | **kotlin.Int**|  |
 **webhookEditObjectV1Request** | [**WebhookEditObjectV1Request**](WebhookEditObjectV1Request.md)|  |

### Return type

[**WebhookEditObjectV1Response**](WebhookEditObjectV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="webhookGetHistoryV1"></a>
# **webhookGetHistoryV1**
> WebhookGetHistoryV1Response webhookGetHistoryV1(pkiWebhookID, eWebhookHistoryinterval)

Retrieve the logs for recent Webhook calls



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectWebhookApi()
val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
val eWebhookHistoryinterval : kotlin.String = eWebhookHistoryinterval_example // kotlin.String | The number of days to return
try {
    val result : WebhookGetHistoryV1Response = apiInstance.webhookGetHistoryV1(pkiWebhookID, eWebhookHistoryinterval)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectWebhookApi#webhookGetHistoryV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectWebhookApi#webhookGetHistoryV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiWebhookID** | **kotlin.Int**|  |
 **eWebhookHistoryinterval** | **kotlin.String**| The number of days to return | [enum: LastDay, LastWeek]

### Return type

[**WebhookGetHistoryV1Response**](WebhookGetHistoryV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="webhookGetListV1"></a>
# **webhookGetListV1**
> WebhookGetListV1Response webhookGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Webhook list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eWebhookModule | Ezsign&lt;br&gt;Management | | eWebhookEzsignevent | DocumentCompleted&lt;br&gt;FolderCompleted | | eWebhookManagementevent | UserCreated |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectWebhookApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : WebhookGetListV1Response = apiInstance.webhookGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectWebhookApi#webhookGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectWebhookApi#webhookGetListV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiWebhookID_ASC, pkiWebhookID_DESC, sWebhookDescription_ASC, sWebhookDescription_DESC, eWebhookEzsignevent_ASC, eWebhookEzsignevent_DESC, eWebhookManagementevent_ASC, eWebhookManagementevent_DESC, eWebhookModule_ASC, eWebhookModule_DESC, sWebhookEmailfailed_ASC, sWebhookEmailfailed_DESC, sWebhookEvent_ASC, sWebhookEvent_DESC, sWebhookUrl_ASC, sWebhookUrl_DESC, bWebhookIsactive_ASC, bWebhookIsactive_DESC]
 **iRowMax** | **kotlin.Int**|  | [optional]
 **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0]
 **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**WebhookGetListV1Response**](WebhookGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="webhookGetObjectV2"></a>
# **webhookGetObjectV2**
> WebhookGetObjectV2Response webhookGetObjectV2(pkiWebhookID)

Retrieve an existing Webhook



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectWebhookApi()
val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : WebhookGetObjectV2Response = apiInstance.webhookGetObjectV2(pkiWebhookID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectWebhookApi#webhookGetObjectV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectWebhookApi#webhookGetObjectV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiWebhookID** | **kotlin.Int**|  |

### Return type

[**WebhookGetObjectV2Response**](WebhookGetObjectV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="webhookTestV1"></a>
# **webhookTestV1**
> WebhookTestV1Response webhookTestV1(pkiWebhookID, body)

Test the Webhook by calling the Url



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectWebhookApi()
val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : WebhookTestV1Response = apiInstance.webhookTestV1(pkiWebhookID, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectWebhookApi#webhookTestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectWebhookApi#webhookTestV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiWebhookID** | **kotlin.Int**|  |
 **body** | **kotlin.Any**|  |

### Return type

[**WebhookTestV1Response**](WebhookTestV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


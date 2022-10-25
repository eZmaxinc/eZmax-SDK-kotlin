# ObjectWebhookApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookCreateObjectV1**](ObjectWebhookApi.md#webhookCreateObjectV1) | **POST** /1/object/webhook | Create a new Webhook
[**webhookDeleteObjectV1**](ObjectWebhookApi.md#webhookDeleteObjectV1) | **DELETE** /1/object/webhook/{pkiWebhookID} | Delete an existing Webhook
[**webhookEditObjectV1**](ObjectWebhookApi.md#webhookEditObjectV1) | **PUT** /1/object/webhook/{pkiWebhookID} | Edit an existing Webhook
[**webhookGetHistoryV1**](ObjectWebhookApi.md#webhookGetHistoryV1) | **GET** /1/object/webhook/{pkiWebhookID}/getHistory | Retrieve the logs for recent Webhook calls
[**webhookGetListV1**](ObjectWebhookApi.md#webhookGetListV1) | **GET** /1/object/webhook/getList | Retrieve Webhook list
[**webhookGetObjectV1**](ObjectWebhookApi.md#webhookGetObjectV1) | **GET** /1/object/webhook/{pkiWebhookID} | Retrieve an existing Webhook
[**webhookTestV1**](ObjectWebhookApi.md#webhookTestV1) | **POST** /1/object/webhook/{pkiWebhookID}/test | Test the Webhook by calling the Url


<a name="webhookCreateObjectV1"></a>
# **webhookCreateObjectV1**
> WebhookMinusCreateObjectMinusV1MinusResponse webhookCreateObjectV1(webhookMinusCreateObjectMinusV1MinusRequest)

Create a new Webhook

The endpoint allows to create one or many elements at once.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectWebhookApi()
val webhookMinusCreateObjectMinusV1MinusRequest : WebhookMinusCreateObjectMinusV1MinusRequest =  // WebhookMinusCreateObjectMinusV1MinusRequest | 
try {
    val result : WebhookMinusCreateObjectMinusV1MinusResponse = apiInstance.webhookCreateObjectV1(webhookMinusCreateObjectMinusV1MinusRequest)
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
 **webhookMinusCreateObjectMinusV1MinusRequest** | [**WebhookMinusCreateObjectMinusV1MinusRequest**](WebhookMinusCreateObjectMinusV1MinusRequest.md)|  |

### Return type

[**WebhookMinusCreateObjectMinusV1MinusResponse**](WebhookMinusCreateObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhookDeleteObjectV1"></a>
# **webhookDeleteObjectV1**
> WebhookMinusDeleteObjectMinusV1MinusResponse webhookDeleteObjectV1(pkiWebhookID)

Delete an existing Webhook



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectWebhookApi()
val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : WebhookMinusDeleteObjectMinusV1MinusResponse = apiInstance.webhookDeleteObjectV1(pkiWebhookID)
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

[**WebhookMinusDeleteObjectMinusV1MinusResponse**](WebhookMinusDeleteObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="webhookEditObjectV1"></a>
# **webhookEditObjectV1**
> WebhookMinusEditObjectMinusV1MinusResponse webhookEditObjectV1(pkiWebhookID, webhookMinusEditObjectMinusV1MinusRequest)

Edit an existing Webhook



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectWebhookApi()
val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
val webhookMinusEditObjectMinusV1MinusRequest : WebhookMinusEditObjectMinusV1MinusRequest =  // WebhookMinusEditObjectMinusV1MinusRequest | 
try {
    val result : WebhookMinusEditObjectMinusV1MinusResponse = apiInstance.webhookEditObjectV1(pkiWebhookID, webhookMinusEditObjectMinusV1MinusRequest)
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
 **webhookMinusEditObjectMinusV1MinusRequest** | [**WebhookMinusEditObjectMinusV1MinusRequest**](WebhookMinusEditObjectMinusV1MinusRequest.md)|  |

### Return type

[**WebhookMinusEditObjectMinusV1MinusResponse**](WebhookMinusEditObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhookGetHistoryV1"></a>
# **webhookGetHistoryV1**
> WebhookMinusGetHistoryMinusV1MinusResponse webhookGetHistoryV1(pkiWebhookID, eWebhookHistoryinterval)

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
    val result : WebhookMinusGetHistoryMinusV1MinusResponse = apiInstance.webhookGetHistoryV1(pkiWebhookID, eWebhookHistoryinterval)
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

[**WebhookMinusGetHistoryMinusV1MinusResponse**](WebhookMinusGetHistoryMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="webhookGetListV1"></a>
# **webhookGetListV1**
> WebhookMinusGetListMinusV1MinusResponse webhookGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

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
val acceptLanguage : HeaderMinusAcceptMinusLanguage =  // HeaderMinusAcceptMinusLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : WebhookMinusGetListMinusV1MinusResponse = apiInstance.webhookGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
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
 **iRowOffset** | **kotlin.Int**|  | [optional]
 **acceptLanguage** | [**HeaderMinusAcceptMinusLanguage**](.md)|  | [optional] [enum: *, en, fr]
 **sFilter** | **kotlin.String**|  | [optional]

### Return type

[**WebhookMinusGetListMinusV1MinusResponse**](WebhookMinusGetListMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="webhookGetObjectV1"></a>
# **webhookGetObjectV1**
> WebhookMinusGetObjectMinusV1MinusResponse webhookGetObjectV1(pkiWebhookID)

Retrieve an existing Webhook



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectWebhookApi()
val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : WebhookMinusGetObjectMinusV1MinusResponse = apiInstance.webhookGetObjectV1(pkiWebhookID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectWebhookApi#webhookGetObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectWebhookApi#webhookGetObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiWebhookID** | **kotlin.Int**|  |

### Return type

[**WebhookMinusGetObjectMinusV1MinusResponse**](WebhookMinusGetObjectMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="webhookTestV1"></a>
# **webhookTestV1**
> WebhookMinusTestMinusV1MinusResponse webhookTestV1(pkiWebhookID, body)

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
    val result : WebhookMinusTestMinusV1MinusResponse = apiInstance.webhookTestV1(pkiWebhookID, body)
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

[**WebhookMinusTestMinusV1MinusResponse**](WebhookMinusTestMinusV1MinusResponse.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


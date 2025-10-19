# ObjectBuyercontractApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**buyercontractGetCommunicationCountV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationCountV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationCount | Retrieve Communication count |
| [**buyercontractGetCommunicationListV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationListV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationList | Retrieve Communication list |
| [**buyercontractGetCommunicationrecipientsV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationrecipientsV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationrecipients | Retrieve Buyercontract&#39;s Communicationrecipient |
| [**buyercontractGetCommunicationsendersV1**](ObjectBuyercontractApi.md#buyercontractGetCommunicationsendersV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationsenders | Retrieve Buyercontract&#39;s Communicationsender |
| [**buyercontractGetListV1**](ObjectBuyercontractApi.md#buyercontractGetListV1) | **GET** /1/object/buyercontract/getList | Retrieve Buyercontract list |
| [**buyercontractImportIntoEDMV1**](ObjectBuyercontractApi.md#buyercontractImportIntoEDMV1) | **POST** /1/object/buyercontract/{pkiBuyercontractID}/importIntoEDM | Import attachments into the Buyercontract |


<a id="buyercontractGetCommunicationCountV1"></a>
# **buyercontractGetCommunicationCountV1**
> BuyercontractGetCommunicationCountV1Response buyercontractGetCommunicationCountV1(pkiBuyercontractID)

Retrieve Communication count



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBuyercontractApi()
val pkiBuyercontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BuyercontractGetCommunicationCountV1Response = apiInstance.buyercontractGetCommunicationCountV1(pkiBuyercontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationCountV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationCountV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBuyercontractID** | **kotlin.Int**|  | |

### Return type

[**BuyercontractGetCommunicationCountV1Response**](BuyercontractGetCommunicationCountV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="buyercontractGetCommunicationListV1"></a>
# **buyercontractGetCommunicationListV1**
> BuyercontractGetCommunicationListV1Response buyercontractGetCommunicationListV1(pkiBuyercontractID)

Retrieve Communication list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBuyercontractApi()
val pkiBuyercontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BuyercontractGetCommunicationListV1Response = apiInstance.buyercontractGetCommunicationListV1(pkiBuyercontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationListV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBuyercontractID** | **kotlin.Int**|  | |

### Return type

[**BuyercontractGetCommunicationListV1Response**](BuyercontractGetCommunicationListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="buyercontractGetCommunicationrecipientsV1"></a>
# **buyercontractGetCommunicationrecipientsV1**
> BuyercontractGetCommunicationrecipientsV1Response buyercontractGetCommunicationrecipientsV1(pkiBuyercontractID)

Retrieve Buyercontract&#39;s Communicationrecipient



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBuyercontractApi()
val pkiBuyercontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BuyercontractGetCommunicationrecipientsV1Response = apiInstance.buyercontractGetCommunicationrecipientsV1(pkiBuyercontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationrecipientsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationrecipientsV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBuyercontractID** | **kotlin.Int**|  | |

### Return type

[**BuyercontractGetCommunicationrecipientsV1Response**](BuyercontractGetCommunicationrecipientsV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="buyercontractGetCommunicationsendersV1"></a>
# **buyercontractGetCommunicationsendersV1**
> BuyercontractGetCommunicationsendersV1Response buyercontractGetCommunicationsendersV1(pkiBuyercontractID)

Retrieve Buyercontract&#39;s Communicationsender



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBuyercontractApi()
val pkiBuyercontractID : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : BuyercontractGetCommunicationsendersV1Response = apiInstance.buyercontractGetCommunicationsendersV1(pkiBuyercontractID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationsendersV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBuyercontractApi#buyercontractGetCommunicationsendersV1")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pkiBuyercontractID** | **kotlin.Int**|  | |

### Return type

[**BuyercontractGetCommunicationsendersV1Response**](BuyercontractGetCommunicationsendersV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="buyercontractGetListV1"></a>
# **buyercontractGetListV1**
> BuyercontractGetListV1Response buyercontractGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Buyercontract list

Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eBuyercontractStep | Imported&lt;br&gt;Active&lt;br&gt;Modified&lt;br&gt;ContractEnded&lt;br&gt;ExpiredContract&lt;br&gt;Bought | | eBuyercontractType | Rent&lt;br&gt;Sale&lt;br&gt;RentOrSale |

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBuyercontractApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : BuyercontractGetListV1Response = apiInstance.buyercontractGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBuyercontractApi#buyercontractGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBuyercontractApi#buyercontractGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiBuyercontractID_ASC, pkiBuyercontractID_DESC, fkiInscriptiontypeID_ASC, fkiInscriptiontypeID_DESC, sInscriptiontypeNameX_ASC, sInscriptiontypeNameX_DESC, eBuyercontractStep_ASC, eBuyercontractStep_DESC, dBuyercontractMinimumprice_ASC, dBuyercontractMinimumprice_DESC, dBuyercontractMaximumprice_ASC, dBuyercontractMaximumprice_DESC, eBuyercontractType_ASC, eBuyercontractType_DESC, dtBuyercontractDate_ASC, dtBuyercontractDate_DESC, dtBuyercontractExpirationdate_ASC, dtBuyercontractExpirationdate_DESC, bBuyercontractIsactive_ASC, bBuyercontractIsactive_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**BuyercontractGetListV1Response**](BuyercontractGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="buyercontractImportIntoEDMV1"></a>
# **buyercontractImportIntoEDMV1**
> BuyercontractImportIntoEDMV1Response buyercontractImportIntoEDMV1(pkiBuyercontractID, buyercontractImportIntoEDMV1Request)

Import attachments into the Buyercontract



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectBuyercontractApi()
val pkiBuyercontractID : kotlin.Int = 56 // kotlin.Int | 
val buyercontractImportIntoEDMV1Request : BuyercontractImportIntoEDMV1Request =  // BuyercontractImportIntoEDMV1Request | 
try {
    val result : BuyercontractImportIntoEDMV1Response = apiInstance.buyercontractImportIntoEDMV1(pkiBuyercontractID, buyercontractImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectBuyercontractApi#buyercontractImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectBuyercontractApi#buyercontractImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiBuyercontractID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **buyercontractImportIntoEDMV1Request** | [**BuyercontractImportIntoEDMV1Request**](BuyercontractImportIntoEDMV1Request.md)|  | |

### Return type

[**BuyercontractImportIntoEDMV1Response**](BuyercontractImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ObjectEzdoctemplatefieldtypecategoryApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ezdoctemplatefieldtypecategoryGetAutocompleteV2**](ObjectEzdoctemplatefieldtypecategoryApi.md#ezdoctemplatefieldtypecategoryGetAutocompleteV2) | **GET** /2/object/ezdoctemplatefieldtypecategory/getAutocomplete/{sSelector} | Retrieve Ezdoctemplatefieldtypecategorys and IDs |


<a id="ezdoctemplatefieldtypecategoryGetAutocompleteV2"></a>
# **ezdoctemplatefieldtypecategoryGetAutocompleteV2**
> EzdoctemplatefieldtypecategoryGetAutocompleteV2Response ezdoctemplatefieldtypecategoryGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)

Retrieve Ezdoctemplatefieldtypecategorys and IDs

Get the list of Ezdoctemplatefieldtypecategory to be used in a dropdown or autocomplete control.

### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEzdoctemplatefieldtypecategoryApi()
val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezdoctemplatefieldtypecategorys to return
val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
try {
    val result : EzdoctemplatefieldtypecategoryGetAutocompleteV2Response = apiInstance.ezdoctemplatefieldtypecategoryGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEzdoctemplatefieldtypecategoryApi#ezdoctemplatefieldtypecategoryGetAutocompleteV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEzdoctemplatefieldtypecategoryApi#ezdoctemplatefieldtypecategoryGetAutocompleteV2")
    e.printStackTrace()
}
```

### Parameters
| **sSelector** | **kotlin.String**| The type of Ezdoctemplatefieldtypecategorys to return | [enum: All] |
| **eFilterActive** | **kotlin.String**| Specify which results we want to display. | [optional] [default to Active] [enum: All, Active, Inactive] |
| **sQuery** | **kotlin.String**| Allow to filter the returned results | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |

### Return type

[**EzdoctemplatefieldtypecategoryGetAutocompleteV2Response**](EzdoctemplatefieldtypecategoryGetAutocompleteV2Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


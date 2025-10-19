# ObjectSupplierApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**supplierGetListV1**](ObjectSupplierApi.md#supplierGetListV1) | **GET** /1/object/supplier/getList | Retrieve Supplier list |
| [**supplierImportIntoEDMV1**](ObjectSupplierApi.md#supplierImportIntoEDMV1) | **POST** /1/object/supplier/{pkiSupplierID}/importIntoEDM | Import attachments into the Supplier |


<a id="supplierGetListV1"></a>
# **supplierGetListV1**
> SupplierGetListV1Response supplierGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Supplier list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSupplierApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : SupplierGetListV1Response = apiInstance.supplierGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSupplierApi#supplierGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSupplierApi#supplierGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiSupplierID_ASC, pkiSupplierID_DESC, fkiPaymentmethodID_ASC, fkiPaymentmethodID_DESC, sSupplierName_ASC, sSupplierName_DESC, sSupplierCode_ASC, sSupplierCode_DESC, sSupplierAccount_ASC, sSupplierAccount_DESC, bSupplierIsactive_ASC, bSupplierIsactive_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC, sPaymentmethodDescriptionX_ASC, sPaymentmethodDescriptionX_DESC, sElectronicfundstransferbankaccountTransit_ASC, sElectronicfundstransferbankaccountTransit_DESC, sElectronicfundstransferbankaccountInstitution_ASC, sElectronicfundstransferbankaccountInstitution_DESC, sElectronicfundstransferbankaccountAccount_ASC, sElectronicfundstransferbankaccountAccount_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**SupplierGetListV1Response**](SupplierGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="supplierImportIntoEDMV1"></a>
# **supplierImportIntoEDMV1**
> SupplierImportIntoEDMV1Response supplierImportIntoEDMV1(pkiSupplierID, supplierImportIntoEDMV1Request)

Import attachments into the Supplier



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectSupplierApi()
val pkiSupplierID : kotlin.Int = 56 // kotlin.Int | 
val supplierImportIntoEDMV1Request : SupplierImportIntoEDMV1Request =  // SupplierImportIntoEDMV1Request | 
try {
    val result : SupplierImportIntoEDMV1Response = apiInstance.supplierImportIntoEDMV1(pkiSupplierID, supplierImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectSupplierApi#supplierImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectSupplierApi#supplierImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiSupplierID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supplierImportIntoEDMV1Request** | [**SupplierImportIntoEDMV1Request**](SupplierImportIntoEDMV1Request.md)|  | |

### Return type

[**SupplierImportIntoEDMV1Response**](SupplierImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


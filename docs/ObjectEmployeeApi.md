# ObjectEmployeeApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**employeeGetListV1**](ObjectEmployeeApi.md#employeeGetListV1) | **GET** /1/object/employee/getList | Retrieve Employee list |
| [**employeeImportIntoEDMV1**](ObjectEmployeeApi.md#employeeImportIntoEDMV1) | **POST** /1/object/employee/{pkiEmployeeID}/importIntoEDM | Import attachments into the Employee |


<a id="employeeGetListV1"></a>
# **employeeGetListV1**
> EmployeeGetListV1Response employeeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)

Retrieve Employee list



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEmployeeApi()
val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
val iRowMax : kotlin.Int = 56 // kotlin.Int | 
val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
val sFilter : kotlin.String = sFilter_example // kotlin.String | 
try {
    val result : EmployeeGetListV1Response = apiInstance.employeeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEmployeeApi#employeeGetListV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEmployeeApi#employeeGetListV1")
    e.printStackTrace()
}
```

### Parameters
| **eOrderBy** | **kotlin.String**| Specify how you want the results to be sorted | [optional] [enum: pkiEmployeeID_ASC, pkiEmployeeID_DESC, fkiDepartmentID_ASC, fkiDepartmentID_DESC, sEmployeeCode_ASC, sEmployeeCode_DESC, sEmployeeInternalcode_ASC, sEmployeeInternalcode_DESC, bEmployeeIsactive_ASC, bEmployeeIsactive_DESC, dtEmployeeHiredate_ASC, dtEmployeeHiredate_DESC, dtEmployeeLeavedate_ASC, dtEmployeeLeavedate_DESC, sDepartmentNameX_ASC, sDepartmentNameX_DESC, sContactFirstname_ASC, sContactFirstname_DESC, sContactLastname_ASC, sContactLastname_DESC, sPhoneE164_ASC, sPhoneE164_DESC, sEmailAddress_ASC, sEmailAddress_DESC, sAddressCivic_ASC, sAddressCivic_DESC, sAddressStreet_ASC, sAddressStreet_DESC, sAddressSuite_ASC, sAddressSuite_DESC, sAddressCity_ASC, sAddressCity_DESC, sAddressZip_ASC, sAddressZip_DESC, sProvinceNameX_ASC, sProvinceNameX_DESC, sCountryNameX_ASC, sCountryNameX_DESC] |
| **iRowMax** | **kotlin.Int**|  | [optional] |
| **iRowOffset** | **kotlin.Int**|  | [optional] [default to 0] |
| **acceptLanguage** | [**HeaderAcceptLanguage**](.md)|  | [optional] [enum: *, en, fr] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sFilter** | **kotlin.String**|  | [optional] |

### Return type

[**EmployeeGetListV1Response**](EmployeeGetListV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="employeeImportIntoEDMV1"></a>
# **employeeImportIntoEDMV1**
> EmployeeImportIntoEDMV1Response employeeImportIntoEDMV1(pkiEmployeeID, employeeImportIntoEDMV1Request)

Import attachments into the Employee



### Example
```kotlin
// Import classes:
//import eZmaxApi.infrastructure.*
//import eZmaxApi.models.*

val apiInstance = ObjectEmployeeApi()
val pkiEmployeeID : kotlin.Int = 56 // kotlin.Int | 
val employeeImportIntoEDMV1Request : EmployeeImportIntoEDMV1Request =  // EmployeeImportIntoEDMV1Request | 
try {
    val result : EmployeeImportIntoEDMV1Response = apiInstance.employeeImportIntoEDMV1(pkiEmployeeID, employeeImportIntoEDMV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ObjectEmployeeApi#employeeImportIntoEDMV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ObjectEmployeeApi#employeeImportIntoEDMV1")
    e.printStackTrace()
}
```

### Parameters
| **pkiEmployeeID** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeImportIntoEDMV1Request** | [**EmployeeImportIntoEDMV1Request**](EmployeeImportIntoEDMV1Request.md)|  | |

### Return type

[**EmployeeImportIntoEDMV1Response**](EmployeeImportIntoEDMV1Response.md)

### Authorization


Configure Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


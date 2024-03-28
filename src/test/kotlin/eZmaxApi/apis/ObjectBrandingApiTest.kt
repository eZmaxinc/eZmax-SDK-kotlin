/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import eZmaxApi.apis.ObjectBrandingApi
import eZmaxApi.models.BrandingCreateObjectV1Request
import eZmaxApi.models.BrandingCreateObjectV1Response
import eZmaxApi.models.BrandingEditObjectV1Request
import eZmaxApi.models.BrandingEditObjectV1Response
import eZmaxApi.models.BrandingGetAutocompleteV2Response
import eZmaxApi.models.BrandingGetListV1Response
import eZmaxApi.models.BrandingGetObjectV2Response
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.HeaderAcceptLanguage

class ObjectBrandingApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectBrandingApi
        //val apiInstance = ObjectBrandingApi()

        // to test brandingCreateObjectV1
        should("test brandingCreateObjectV1") {
            // uncomment below to test brandingCreateObjectV1
            //val brandingCreateObjectV1Request : BrandingCreateObjectV1Request =  // BrandingCreateObjectV1Request | 
            //val result : BrandingCreateObjectV1Response = apiInstance.brandingCreateObjectV1(brandingCreateObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test brandingEditObjectV1
        should("test brandingEditObjectV1") {
            // uncomment below to test brandingEditObjectV1
            //val pkiBrandingID : kotlin.Int = 56 // kotlin.Int | 
            //val brandingEditObjectV1Request : BrandingEditObjectV1Request =  // BrandingEditObjectV1Request | 
            //val result : BrandingEditObjectV1Response = apiInstance.brandingEditObjectV1(pkiBrandingID, brandingEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test brandingGetAutocompleteV2
        should("test brandingGetAutocompleteV2") {
            // uncomment below to test brandingGetAutocompleteV2
            //val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Brandings to return
            //val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
            //val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val result : BrandingGetAutocompleteV2Response = apiInstance.brandingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
            //result shouldBe ("TODO")
        }

        // to test brandingGetListV1
        should("test brandingGetListV1") {
            // uncomment below to test brandingGetListV1
            //val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
            //val iRowMax : kotlin.Int = 56 // kotlin.Int | 
            //val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val sFilter : kotlin.String = sFilter_example // kotlin.String | 
            //val result : BrandingGetListV1Response = apiInstance.brandingGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
            //result shouldBe ("TODO")
        }

        // to test brandingGetObjectV2
        should("test brandingGetObjectV2") {
            // uncomment below to test brandingGetObjectV2
            //val pkiBrandingID : kotlin.Int = 56 // kotlin.Int | 
            //val result : BrandingGetObjectV2Response = apiInstance.brandingGetObjectV2(pkiBrandingID)
            //result shouldBe ("TODO")
        }

    }
}

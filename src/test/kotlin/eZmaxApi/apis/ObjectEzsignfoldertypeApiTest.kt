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

import eZmaxApi.apis.ObjectEzsignfoldertypeApi
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.EzsignfoldertypeCreateObjectV2Request
import eZmaxApi.models.EzsignfoldertypeCreateObjectV2Response
import eZmaxApi.models.EzsignfoldertypeEditObjectV1Request
import eZmaxApi.models.EzsignfoldertypeEditObjectV1Response
import eZmaxApi.models.EzsignfoldertypeEditObjectV2Request
import eZmaxApi.models.EzsignfoldertypeEditObjectV2Response
import eZmaxApi.models.EzsignfoldertypeGetAutocompleteV2Response
import eZmaxApi.models.EzsignfoldertypeGetListV1Response
import eZmaxApi.models.EzsignfoldertypeGetObjectV2Response
import eZmaxApi.models.EzsignfoldertypeGetObjectV3Response
import eZmaxApi.models.HeaderAcceptLanguage

class ObjectEzsignfoldertypeApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectEzsignfoldertypeApi
        //val apiInstance = ObjectEzsignfoldertypeApi()

        // to test ezsignfoldertypeCreateObjectV2
        should("test ezsignfoldertypeCreateObjectV2") {
            // uncomment below to test ezsignfoldertypeCreateObjectV2
            //val ezsignfoldertypeCreateObjectV2Request : EzsignfoldertypeCreateObjectV2Request =  // EzsignfoldertypeCreateObjectV2Request | 
            //val result : EzsignfoldertypeCreateObjectV2Response = apiInstance.ezsignfoldertypeCreateObjectV2(ezsignfoldertypeCreateObjectV2Request)
            //result shouldBe ("TODO")
        }

        // to test ezsignfoldertypeEditObjectV1
        should("test ezsignfoldertypeEditObjectV1") {
            // uncomment below to test ezsignfoldertypeEditObjectV1
            //val pkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | 
            //val ezsignfoldertypeEditObjectV1Request : EzsignfoldertypeEditObjectV1Request =  // EzsignfoldertypeEditObjectV1Request | 
            //val result : EzsignfoldertypeEditObjectV1Response = apiInstance.ezsignfoldertypeEditObjectV1(pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test ezsignfoldertypeEditObjectV2
        should("test ezsignfoldertypeEditObjectV2") {
            // uncomment below to test ezsignfoldertypeEditObjectV2
            //val pkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | 
            //val ezsignfoldertypeEditObjectV2Request : EzsignfoldertypeEditObjectV2Request =  // EzsignfoldertypeEditObjectV2Request | 
            //val result : EzsignfoldertypeEditObjectV2Response = apiInstance.ezsignfoldertypeEditObjectV2(pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV2Request)
            //result shouldBe ("TODO")
        }

        // to test ezsignfoldertypeGetAutocompleteV2
        should("test ezsignfoldertypeGetAutocompleteV2") {
            // uncomment below to test ezsignfoldertypeGetAutocompleteV2
            //val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezsignfoldertypes to return
            //val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
            //val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val result : EzsignfoldertypeGetAutocompleteV2Response = apiInstance.ezsignfoldertypeGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
            //result shouldBe ("TODO")
        }

        // to test ezsignfoldertypeGetListV1
        should("test ezsignfoldertypeGetListV1") {
            // uncomment below to test ezsignfoldertypeGetListV1
            //val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
            //val iRowMax : kotlin.Int = 56 // kotlin.Int | 
            //val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val sFilter : kotlin.String = sFilter_example // kotlin.String | 
            //val result : EzsignfoldertypeGetListV1Response = apiInstance.ezsignfoldertypeGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
            //result shouldBe ("TODO")
        }

        // to test ezsignfoldertypeGetObjectV2
        should("test ezsignfoldertypeGetObjectV2") {
            // uncomment below to test ezsignfoldertypeGetObjectV2
            //val pkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | 
            //val result : EzsignfoldertypeGetObjectV2Response = apiInstance.ezsignfoldertypeGetObjectV2(pkiEzsignfoldertypeID)
            //result shouldBe ("TODO")
        }

        // to test ezsignfoldertypeGetObjectV3
        should("test ezsignfoldertypeGetObjectV3") {
            // uncomment below to test ezsignfoldertypeGetObjectV3
            //val pkiEzsignfoldertypeID : kotlin.Int = 56 // kotlin.Int | 
            //val result : EzsignfoldertypeGetObjectV3Response = apiInstance.ezsignfoldertypeGetObjectV3(pkiEzsignfoldertypeID)
            //result shouldBe ("TODO")
        }

    }
}

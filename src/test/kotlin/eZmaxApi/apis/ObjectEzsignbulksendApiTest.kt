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

import eZmaxApi.apis.ObjectEzsignbulksendApi
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.EzsignbulksendCreateEzsignbulksendtransmissionV1Request
import eZmaxApi.models.EzsignbulksendCreateEzsignbulksendtransmissionV1Response
import eZmaxApi.models.EzsignbulksendCreateObjectV1Request
import eZmaxApi.models.EzsignbulksendCreateObjectV1Response
import eZmaxApi.models.EzsignbulksendDeleteObjectV1Response
import eZmaxApi.models.EzsignbulksendEditObjectV1Request
import eZmaxApi.models.EzsignbulksendEditObjectV1Response
import eZmaxApi.models.EzsignbulksendGetEzsignbulksendtransmissionsV1Response
import eZmaxApi.models.EzsignbulksendGetEzsignsignaturesAutomaticV1Response
import eZmaxApi.models.EzsignbulksendGetFormsDataV1Response
import eZmaxApi.models.EzsignbulksendGetListV1Response
import eZmaxApi.models.EzsignbulksendGetObjectV2Response
import eZmaxApi.models.EzsignbulksendReorderV1Request
import eZmaxApi.models.EzsignbulksendReorderV1Response
import eZmaxApi.models.HeaderAcceptLanguage

class ObjectEzsignbulksendApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectEzsignbulksendApi
        //val apiInstance = ObjectEzsignbulksendApi()

        // to test ezsignbulksendCreateEzsignbulksendtransmissionV1
        should("test ezsignbulksendCreateEzsignbulksendtransmissionV1") {
            // uncomment below to test ezsignbulksendCreateEzsignbulksendtransmissionV1
            //val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
            //val ezsignbulksendCreateEzsignbulksendtransmissionV1Request : EzsignbulksendCreateEzsignbulksendtransmissionV1Request =  // EzsignbulksendCreateEzsignbulksendtransmissionV1Request | 
            //val result : EzsignbulksendCreateEzsignbulksendtransmissionV1Response = apiInstance.ezsignbulksendCreateEzsignbulksendtransmissionV1(pkiEzsignbulksendID, ezsignbulksendCreateEzsignbulksendtransmissionV1Request)
            //result shouldBe ("TODO")
        }

        // to test ezsignbulksendCreateObjectV1
        should("test ezsignbulksendCreateObjectV1") {
            // uncomment below to test ezsignbulksendCreateObjectV1
            //val ezsignbulksendCreateObjectV1Request : EzsignbulksendCreateObjectV1Request =  // EzsignbulksendCreateObjectV1Request | 
            //val result : EzsignbulksendCreateObjectV1Response = apiInstance.ezsignbulksendCreateObjectV1(ezsignbulksendCreateObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test ezsignbulksendDeleteObjectV1
        should("test ezsignbulksendDeleteObjectV1") {
            // uncomment below to test ezsignbulksendDeleteObjectV1
            //val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
            //val result : EzsignbulksendDeleteObjectV1Response = apiInstance.ezsignbulksendDeleteObjectV1(pkiEzsignbulksendID)
            //result shouldBe ("TODO")
        }

        // to test ezsignbulksendEditObjectV1
        should("test ezsignbulksendEditObjectV1") {
            // uncomment below to test ezsignbulksendEditObjectV1
            //val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
            //val ezsignbulksendEditObjectV1Request : EzsignbulksendEditObjectV1Request =  // EzsignbulksendEditObjectV1Request | 
            //val result : EzsignbulksendEditObjectV1Response = apiInstance.ezsignbulksendEditObjectV1(pkiEzsignbulksendID, ezsignbulksendEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test ezsignbulksendGetCsvTemplateV1
        should("test ezsignbulksendGetCsvTemplateV1") {
            // uncomment below to test ezsignbulksendGetCsvTemplateV1
            //val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
            //val eCsvSeparator : kotlin.String = eCsvSeparator_example // kotlin.String | Separator that will be used to separate fields
            //val result : kotlin.String = apiInstance.ezsignbulksendGetCsvTemplateV1(pkiEzsignbulksendID, eCsvSeparator)
            //result shouldBe ("TODO")
        }

        // to test ezsignbulksendGetEzsignbulksendtransmissionsV1
        should("test ezsignbulksendGetEzsignbulksendtransmissionsV1") {
            // uncomment below to test ezsignbulksendGetEzsignbulksendtransmissionsV1
            //val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
            //val result : EzsignbulksendGetEzsignbulksendtransmissionsV1Response = apiInstance.ezsignbulksendGetEzsignbulksendtransmissionsV1(pkiEzsignbulksendID)
            //result shouldBe ("TODO")
        }

        // to test ezsignbulksendGetEzsignsignaturesAutomaticV1
        should("test ezsignbulksendGetEzsignsignaturesAutomaticV1") {
            // uncomment below to test ezsignbulksendGetEzsignsignaturesAutomaticV1
            //val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
            //val result : EzsignbulksendGetEzsignsignaturesAutomaticV1Response = apiInstance.ezsignbulksendGetEzsignsignaturesAutomaticV1(pkiEzsignbulksendID)
            //result shouldBe ("TODO")
        }

        // to test ezsignbulksendGetFormsDataV1
        should("test ezsignbulksendGetFormsDataV1") {
            // uncomment below to test ezsignbulksendGetFormsDataV1
            //val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
            //val result : EzsignbulksendGetFormsDataV1Response = apiInstance.ezsignbulksendGetFormsDataV1(pkiEzsignbulksendID)
            //result shouldBe ("TODO")
        }

        // to test ezsignbulksendGetListV1
        should("test ezsignbulksendGetListV1") {
            // uncomment below to test ezsignbulksendGetListV1
            //val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
            //val iRowMax : kotlin.Int = 56 // kotlin.Int | 
            //val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val sFilter : kotlin.String = sFilter_example // kotlin.String | 
            //val result : EzsignbulksendGetListV1Response = apiInstance.ezsignbulksendGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
            //result shouldBe ("TODO")
        }

        // to test ezsignbulksendGetObjectV2
        should("test ezsignbulksendGetObjectV2") {
            // uncomment below to test ezsignbulksendGetObjectV2
            //val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
            //val result : EzsignbulksendGetObjectV2Response = apiInstance.ezsignbulksendGetObjectV2(pkiEzsignbulksendID)
            //result shouldBe ("TODO")
        }

        // to test ezsignbulksendReorderV1
        should("test ezsignbulksendReorderV1") {
            // uncomment below to test ezsignbulksendReorderV1
            //val pkiEzsignbulksendID : kotlin.Int = 56 // kotlin.Int | 
            //val ezsignbulksendReorderV1Request : EzsignbulksendReorderV1Request =  // EzsignbulksendReorderV1Request | 
            //val result : EzsignbulksendReorderV1Response = apiInstance.ezsignbulksendReorderV1(pkiEzsignbulksendID, ezsignbulksendReorderV1Request)
            //result shouldBe ("TODO")
        }

    }
}

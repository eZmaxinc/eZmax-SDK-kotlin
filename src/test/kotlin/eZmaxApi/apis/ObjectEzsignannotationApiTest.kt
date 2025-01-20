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

import eZmaxApi.apis.ObjectEzsignannotationApi
import eZmaxApi.models.CommonResponse
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.EzsignannotationCreateObjectV1Request
import eZmaxApi.models.EzsignannotationCreateObjectV1Response
import eZmaxApi.models.EzsignannotationEditObjectV1Request
import eZmaxApi.models.EzsignannotationGetObjectV2Response

class ObjectEzsignannotationApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectEzsignannotationApi
        //val apiInstance = ObjectEzsignannotationApi()

        // to test ezsignannotationCreateObjectV1
        should("test ezsignannotationCreateObjectV1") {
            // uncomment below to test ezsignannotationCreateObjectV1
            //val ezsignannotationCreateObjectV1Request : EzsignannotationCreateObjectV1Request =  // EzsignannotationCreateObjectV1Request | 
            //val result : EzsignannotationCreateObjectV1Response = apiInstance.ezsignannotationCreateObjectV1(ezsignannotationCreateObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test ezsignannotationDeleteObjectV1
        should("test ezsignannotationDeleteObjectV1") {
            // uncomment below to test ezsignannotationDeleteObjectV1
            //val pkiEzsignannotationID : kotlin.Int = 56 // kotlin.Int | 
            //val result : CommonResponse = apiInstance.ezsignannotationDeleteObjectV1(pkiEzsignannotationID)
            //result shouldBe ("TODO")
        }

        // to test ezsignannotationEditObjectV1
        should("test ezsignannotationEditObjectV1") {
            // uncomment below to test ezsignannotationEditObjectV1
            //val pkiEzsignannotationID : kotlin.Int = 56 // kotlin.Int | 
            //val ezsignannotationEditObjectV1Request : EzsignannotationEditObjectV1Request =  // EzsignannotationEditObjectV1Request | 
            //val result : CommonResponse = apiInstance.ezsignannotationEditObjectV1(pkiEzsignannotationID, ezsignannotationEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test ezsignannotationGetObjectV2
        should("test ezsignannotationGetObjectV2") {
            // uncomment below to test ezsignannotationGetObjectV2
            //val pkiEzsignannotationID : kotlin.Int = 56 // kotlin.Int | 
            //val result : EzsignannotationGetObjectV2Response = apiInstance.ezsignannotationGetObjectV2(pkiEzsignannotationID)
            //result shouldBe ("TODO")
        }

    }
}

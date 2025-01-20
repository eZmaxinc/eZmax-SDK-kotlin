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

import eZmaxApi.apis.ObjectEzsignformfieldgroupApi
import eZmaxApi.models.CommonResponse
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.EzsignformfieldgroupCreateObjectV1Request
import eZmaxApi.models.EzsignformfieldgroupCreateObjectV1Response
import eZmaxApi.models.EzsignformfieldgroupEditObjectV1Request
import eZmaxApi.models.EzsignformfieldgroupGetObjectV2Response

class ObjectEzsignformfieldgroupApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectEzsignformfieldgroupApi
        //val apiInstance = ObjectEzsignformfieldgroupApi()

        // to test ezsignformfieldgroupCreateObjectV1
        should("test ezsignformfieldgroupCreateObjectV1") {
            // uncomment below to test ezsignformfieldgroupCreateObjectV1
            //val ezsignformfieldgroupCreateObjectV1Request : EzsignformfieldgroupCreateObjectV1Request =  // EzsignformfieldgroupCreateObjectV1Request | 
            //val result : EzsignformfieldgroupCreateObjectV1Response = apiInstance.ezsignformfieldgroupCreateObjectV1(ezsignformfieldgroupCreateObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test ezsignformfieldgroupDeleteObjectV1
        should("test ezsignformfieldgroupDeleteObjectV1") {
            // uncomment below to test ezsignformfieldgroupDeleteObjectV1
            //val pkiEzsignformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
            //val result : CommonResponse = apiInstance.ezsignformfieldgroupDeleteObjectV1(pkiEzsignformfieldgroupID)
            //result shouldBe ("TODO")
        }

        // to test ezsignformfieldgroupEditObjectV1
        should("test ezsignformfieldgroupEditObjectV1") {
            // uncomment below to test ezsignformfieldgroupEditObjectV1
            //val pkiEzsignformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
            //val ezsignformfieldgroupEditObjectV1Request : EzsignformfieldgroupEditObjectV1Request =  // EzsignformfieldgroupEditObjectV1Request | 
            //val result : CommonResponse = apiInstance.ezsignformfieldgroupEditObjectV1(pkiEzsignformfieldgroupID, ezsignformfieldgroupEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test ezsignformfieldgroupGetObjectV2
        should("test ezsignformfieldgroupGetObjectV2") {
            // uncomment below to test ezsignformfieldgroupGetObjectV2
            //val pkiEzsignformfieldgroupID : kotlin.Int = 56 // kotlin.Int | 
            //val result : EzsignformfieldgroupGetObjectV2Response = apiInstance.ezsignformfieldgroupGetObjectV2(pkiEzsignformfieldgroupID)
            //result shouldBe ("TODO")
        }

    }
}

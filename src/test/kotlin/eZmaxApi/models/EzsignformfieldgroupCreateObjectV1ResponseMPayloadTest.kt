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

package eZmaxApi.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import eZmaxApi.models.EzsignformfieldgroupCreateObjectV1ResponseMPayload

class EzsignformfieldgroupCreateObjectV1ResponseMPayloadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignformfieldgroupCreateObjectV1ResponseMPayload
        //val modelInstance = EzsignformfieldgroupCreateObjectV1ResponseMPayload()

        // to test the property `aPkiEzsignformfieldgroupID` - An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
        should("test aPkiEzsignformfieldgroupID") {
            // uncomment below to test the property
            //modelInstance.aPkiEzsignformfieldgroupID shouldBe ("TODO")
        }

    }
}

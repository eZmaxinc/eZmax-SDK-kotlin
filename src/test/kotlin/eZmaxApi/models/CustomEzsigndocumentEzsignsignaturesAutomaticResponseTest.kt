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

import eZmaxApi.models.CustomEzsigndocumentEzsignsignaturesAutomaticResponse
import eZmaxApi.models.CustomEzsignsignatureEzsignsignaturesAutomaticResponse

class CustomEzsigndocumentEzsignsignaturesAutomaticResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomEzsigndocumentEzsignsignaturesAutomaticResponse
        //val modelInstance = CustomEzsigndocumentEzsignsignaturesAutomaticResponse()

        // to test the property `pkiEzsigndocumentID` - The unique ID of the Ezsigndocument
        should("test pkiEzsigndocumentID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigndocumentID shouldBe ("TODO")
        }

        // to test the property `sEzsigndocumentName` - The name of the document that will be presented to Ezsignfoldersignerassociations
        should("test sEzsigndocumentName") {
            // uncomment below to test the property
            //modelInstance.sEzsigndocumentName shouldBe ("TODO")
        }

        // to test the property `aObjEzsignsignature`
        should("test aObjEzsignsignature") {
            // uncomment below to test the property
            //modelInstance.aObjEzsignsignature shouldBe ("TODO")
        }

    }
}

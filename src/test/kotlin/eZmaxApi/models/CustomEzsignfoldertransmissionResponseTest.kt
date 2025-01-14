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

import eZmaxApi.models.CustomEzsignfoldertransmissionResponse
import eZmaxApi.models.CustomEzsignfoldertransmissionSignerResponse
import eZmaxApi.models.FieldEEzsignfolderStep

class CustomEzsignfoldertransmissionResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomEzsignfoldertransmissionResponse
        //val modelInstance = CustomEzsignfoldertransmissionResponse()

        // to test the property `pkiEzsignfolderID` - The unique ID of the Ezsignfolder
        should("test pkiEzsignfolderID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignfolderID shouldBe ("TODO")
        }

        // to test the property `sEzsignfolderDescription` - The description of the Ezsignfolder
        should("test sEzsignfolderDescription") {
            // uncomment below to test the property
            //modelInstance.sEzsignfolderDescription shouldBe ("TODO")
        }

        // to test the property `eEzsignfolderStep`
        should("test eEzsignfolderStep") {
            // uncomment below to test the property
            //modelInstance.eEzsignfolderStep shouldBe ("TODO")
        }

        // to test the property `iEzsignfolderSignaturetotal` - The number of total signatures that were requested in the Ezsignfolder
        should("test iEzsignfolderSignaturetotal") {
            // uncomment below to test the property
            //modelInstance.iEzsignfolderSignaturetotal shouldBe ("TODO")
        }

        // to test the property `iEzsignfolderFormfieldtotal` - The number of total form fields that were requested in the Ezsignfolder
        should("test iEzsignfolderFormfieldtotal") {
            // uncomment below to test the property
            //modelInstance.iEzsignfolderFormfieldtotal shouldBe ("TODO")
        }

        // to test the property `iEzsignfolderSignaturesigned` - The number of signatures that were signed in the Ezsignfolder.
        should("test iEzsignfolderSignaturesigned") {
            // uncomment below to test the property
            //modelInstance.iEzsignfolderSignaturesigned shouldBe ("TODO")
        }

        // to test the property `aObjEzsignfoldertransmissionSigner`
        should("test aObjEzsignfoldertransmissionSigner") {
            // uncomment below to test the property
            //modelInstance.aObjEzsignfoldertransmissionSigner shouldBe ("TODO")
        }

    }
}

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

import eZmaxApi.models.CustomEzmaxinvoicingEzsigndocumentResponse

class CustomEzmaxinvoicingEzsigndocumentResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomEzmaxinvoicingEzsigndocumentResponse
        //val modelInstance = CustomEzmaxinvoicingEzsigndocumentResponse()

        // to test the property `fkiEzsignfolderID` - The unique ID of the Ezsignfolder
        should("test fkiEzsignfolderID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfolderID shouldBe ("TODO")
        }

        // to test the property `sName`
        should("test sName") {
            // uncomment below to test the property
            //modelInstance.sName shouldBe ("TODO")
        }

        // to test the property `sEzsignfolderDescription` - The description of the Ezsignfolder
        should("test sEzsignfolderDescription") {
            // uncomment below to test the property
            //modelInstance.sEzsignfolderDescription shouldBe ("TODO")
        }

        // to test the property `sEzsigndocumentName` - The name of the document that will be presented to Ezsignfoldersignerassociations
        should("test sEzsigndocumentName") {
            // uncomment below to test the property
            //modelInstance.sEzsigndocumentName shouldBe ("TODO")
        }

        // to test the property `bEzsignfolderAllowed` - Whether you have access to the Ezsignfolder or not
        should("test bEzsignfolderAllowed") {
            // uncomment below to test the property
            //modelInstance.bEzsignfolderAllowed shouldBe ("TODO")
        }

        // to test the property `fkiBillingentityinternalID` - The unique ID of the Billingentityinternal.
        should("test fkiBillingentityinternalID") {
            // uncomment below to test the property
            //modelInstance.fkiBillingentityinternalID shouldBe ("TODO")
        }

    }
}

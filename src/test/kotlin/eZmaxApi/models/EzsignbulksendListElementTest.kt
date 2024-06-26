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

import eZmaxApi.models.EzsignbulksendListElement

class EzsignbulksendListElementTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignbulksendListElement
        //val modelInstance = EzsignbulksendListElement()

        // to test the property `pkiEzsignbulksendID` - The unique ID of the Ezsignbulksend
        should("test pkiEzsignbulksendID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignbulksendID shouldBe ("TODO")
        }

        // to test the property `fkiEzsignfoldertypeID` - The unique ID of the Ezsignfoldertype.
        should("test fkiEzsignfoldertypeID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfoldertypeID shouldBe ("TODO")
        }

        // to test the property `sEzsignbulksendDescription` - The description of the Ezsignbulksend
        should("test sEzsignbulksendDescription") {
            // uncomment below to test the property
            //modelInstance.sEzsignbulksendDescription shouldBe ("TODO")
        }

        // to test the property `sEzsignfoldertypeNameX` - The name of the Ezsignfoldertype in the language of the requester
        should("test sEzsignfoldertypeNameX") {
            // uncomment below to test the property
            //modelInstance.sEzsignfoldertypeNameX shouldBe ("TODO")
        }

        // to test the property `bEzsignbulksendNeedvalidation` - Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation
        should("test bEzsignbulksendNeedvalidation") {
            // uncomment below to test the property
            //modelInstance.bEzsignbulksendNeedvalidation shouldBe ("TODO")
        }

        // to test the property `iEzsignbulksendtransmission` - The total number of Ezsignbulksendtransmissions in the Ezsignbulksend
        should("test iEzsignbulksendtransmission") {
            // uncomment below to test the property
            //modelInstance.iEzsignbulksendtransmission shouldBe ("TODO")
        }

        // to test the property `iEzsignfolder` - The total number of Ezsignfolders in the Ezsignbulksend
        should("test iEzsignfolder") {
            // uncomment below to test the property
            //modelInstance.iEzsignfolder shouldBe ("TODO")
        }

        // to test the property `iEzsigndocument` - The total number of Ezsigndocuments in the Ezsignbulksend
        should("test iEzsigndocument") {
            // uncomment below to test the property
            //modelInstance.iEzsigndocument shouldBe ("TODO")
        }

        // to test the property `iEzsignsignature` - The total number of Ezsignsignature in the Ezsignbulksend
        should("test iEzsignsignature") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignature shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureSigned` - The total number of already signed Ezsignsignature blocks in the Ezsignbulksend
        should("test iEzsignsignatureSigned") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureSigned shouldBe ("TODO")
        }

        // to test the property `bEzsignbulksendIsactive` - Whether the Ezsignbulksend is active or not
        should("test bEzsignbulksendIsactive") {
            // uncomment below to test the property
            //modelInstance.bEzsignbulksendIsactive shouldBe ("TODO")
        }

    }
}

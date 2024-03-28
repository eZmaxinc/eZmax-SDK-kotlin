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

import eZmaxApi.models.EzsignfolderListElement
import eZmaxApi.models.FieldEEzsignfolderStep
import eZmaxApi.models.FieldEEzsignfoldertypePrivacylevel

class EzsignfolderListElementTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignfolderListElement
        //val modelInstance = EzsignfolderListElement()

        // to test the property `pkiEzsignfolderID` - The unique ID of the Ezsignfolder
        should("test pkiEzsignfolderID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignfolderID shouldBe ("TODO")
        }

        // to test the property `fkiEzsignfoldertypeID` - The unique ID of the Ezsignfoldertype.
        should("test fkiEzsignfoldertypeID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfoldertypeID shouldBe ("TODO")
        }

        // to test the property `eEzsignfoldertypePrivacylevel`
        should("test eEzsignfoldertypePrivacylevel") {
            // uncomment below to test the property
            //modelInstance.eEzsignfoldertypePrivacylevel shouldBe ("TODO")
        }

        // to test the property `sEzsignfoldertypeNameX` - The name of the Ezsignfoldertype in the language of the requester
        should("test sEzsignfoldertypeNameX") {
            // uncomment below to test the property
            //modelInstance.sEzsignfoldertypeNameX shouldBe ("TODO")
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

        // to test the property `dtCreatedDate` - The date and time at which the object was created
        should("test dtCreatedDate") {
            // uncomment below to test the property
            //modelInstance.dtCreatedDate shouldBe ("TODO")
        }

        // to test the property `iEzsigndocument` - The total number of Ezsigndocument in the folder
        should("test iEzsigndocument") {
            // uncomment below to test the property
            //modelInstance.iEzsigndocument shouldBe ("TODO")
        }

        // to test the property `iEzsigndocumentEdm` - The total number of Ezsigndocument in the folder that were saved in the edm system
        should("test iEzsigndocumentEdm") {
            // uncomment below to test the property
            //modelInstance.iEzsigndocumentEdm shouldBe ("TODO")
        }

        // to test the property `iEzsignsignature` - The total number of signature blocks in all Ezsigndocuments in the folder
        should("test iEzsignsignature") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignature shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureSigned` - The total number of already signed signature blocks in all Ezsigndocuments in the folder
        should("test iEzsignsignatureSigned") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureSigned shouldBe ("TODO")
        }

        // to test the property `iEzsignformfieldgroup` - The total number of Ezsignformfieldgroup in all Ezsigndocuments in the folder
        should("test iEzsignformfieldgroup") {
            // uncomment below to test the property
            //modelInstance.iEzsignformfieldgroup shouldBe ("TODO")
        }

        // to test the property `iEzsignformfieldgroupCompleted` - The total number of completed Ezsignformfieldgroup in all Ezsigndocuments in the folder
        should("test iEzsignformfieldgroupCompleted") {
            // uncomment below to test the property
            //modelInstance.iEzsignformfieldgroupCompleted shouldBe ("TODO")
        }

        // to test the property `dEzsignfolderCompletedpercentage` - Whether the Ezsignform/Ezsignsignatures has dependencies or not
        should("test dEzsignfolderCompletedpercentage") {
            // uncomment below to test the property
            //modelInstance.dEzsignfolderCompletedpercentage shouldBe ("TODO")
        }

        // to test the property `dtEzsignfolderDelayedsenddate` - The date and time at which the Ezsignfolder will be sent in the future.
        should("test dtEzsignfolderDelayedsenddate") {
            // uncomment below to test the property
            //modelInstance.dtEzsignfolderDelayedsenddate shouldBe ("TODO")
        }

        // to test the property `dtEzsignfolderSentdate` - The date and time at which the Ezsignfolder was sent the last time.
        should("test dtEzsignfolderSentdate") {
            // uncomment below to test the property
            //modelInstance.dtEzsignfolderSentdate shouldBe ("TODO")
        }

        // to test the property `dtEzsignfolderDuedate` - The maximum date and time at which the Ezsignfolder can be signed.
        should("test dtEzsignfolderDuedate") {
            // uncomment below to test the property
            //modelInstance.dtEzsignfolderDuedate shouldBe ("TODO")
        }

        // to test the property `bEzsignformHasdependencies` - Whether the Ezsignform/Ezsignsignatures has dependencies or not
        should("test bEzsignformHasdependencies") {
            // uncomment below to test the property
            //modelInstance.bEzsignformHasdependencies shouldBe ("TODO")
        }

    }
}

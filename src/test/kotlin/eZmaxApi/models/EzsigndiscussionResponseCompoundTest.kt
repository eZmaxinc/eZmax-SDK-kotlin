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

import eZmaxApi.models.EzsigndiscussionResponseCompound
import eZmaxApi.models.DiscussionResponseCompound

class EzsigndiscussionResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigndiscussionResponseCompound
        //val modelInstance = EzsigndiscussionResponseCompound()

        // to test the property `pkiEzsigndiscussionID` - The unique ID of the Ezsigndiscussion
        should("test pkiEzsigndiscussionID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigndiscussionID shouldBe ("TODO")
        }

        // to test the property `fkiEzsignpageID` - The unique ID of the Ezsignpage
        should("test fkiEzsignpageID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignpageID shouldBe ("TODO")
        }

        // to test the property `fkiDiscussionID` - The unique ID of the Discussion
        should("test fkiDiscussionID") {
            // uncomment below to test the property
            //modelInstance.fkiDiscussionID shouldBe ("TODO")
        }

        // to test the property `iEzsigndiscussionX` - The x of the Ezsigndiscussion
        should("test iEzsigndiscussionX") {
            // uncomment below to test the property
            //modelInstance.iEzsigndiscussionX shouldBe ("TODO")
        }

        // to test the property `iEzsigndiscussionY` - The y of the Ezsigndiscussion
        should("test iEzsigndiscussionY") {
            // uncomment below to test the property
            //modelInstance.iEzsigndiscussionY shouldBe ("TODO")
        }

        // to test the property `iEzsigndiscussionPagenumber` - The page number in the Ezsigndocument for the Ezsigndiscussion
        should("test iEzsigndiscussionPagenumber") {
            // uncomment below to test the property
            //modelInstance.iEzsigndiscussionPagenumber shouldBe ("TODO")
        }

        // to test the property `objDiscussion`
        should("test objDiscussion") {
            // uncomment below to test the property
            //modelInstance.objDiscussion shouldBe ("TODO")
        }

    }
}

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

import eZmaxApi.models.DiscussionResponseCompound
import eZmaxApi.models.CustomDiscussionconfigurationResponse
import eZmaxApi.models.DiscussionmembershipResponseCompound
import eZmaxApi.models.DiscussionmessageResponseCompound

class DiscussionResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of DiscussionResponseCompound
        //val modelInstance = DiscussionResponseCompound()

        // to test the property `pkiDiscussionID` - The unique ID of the Discussion
        should("test pkiDiscussionID") {
            // uncomment below to test the property
            //modelInstance.pkiDiscussionID shouldBe ("TODO")
        }

        // to test the property `sDiscussionDescription` - The description of the Discussion
        should("test sDiscussionDescription") {
            // uncomment below to test the property
            //modelInstance.sDiscussionDescription shouldBe ("TODO")
        }

        // to test the property `bDiscussionClosed` - Whether if it's an closed
        should("test bDiscussionClosed") {
            // uncomment below to test the property
            //modelInstance.bDiscussionClosed shouldBe ("TODO")
        }

        // to test the property `iDiscussionmessageCount` - The count of Attachment.
        should("test iDiscussionmessageCount") {
            // uncomment below to test the property
            //modelInstance.iDiscussionmessageCount shouldBe ("TODO")
        }

        // to test the property `iDiscussionmessageCountunread` - The count of Attachment.
        should("test iDiscussionmessageCountunread") {
            // uncomment below to test the property
            //modelInstance.iDiscussionmessageCountunread shouldBe ("TODO")
        }

        // to test the property `aObjDiscussionmembership`
        should("test aObjDiscussionmembership") {
            // uncomment below to test the property
            //modelInstance.aObjDiscussionmembership shouldBe ("TODO")
        }

        // to test the property `aObjDiscussionmessage`
        should("test aObjDiscussionmessage") {
            // uncomment below to test the property
            //modelInstance.aObjDiscussionmessage shouldBe ("TODO")
        }

        // to test the property `dtDiscussionLastread` - The date the Discussion was last read
        should("test dtDiscussionLastread") {
            // uncomment below to test the property
            //modelInstance.dtDiscussionLastread shouldBe ("TODO")
        }

        // to test the property `objDiscussionconfiguration`
        should("test objDiscussionconfiguration") {
            // uncomment below to test the property
            //modelInstance.objDiscussionconfiguration shouldBe ("TODO")
        }

    }
}

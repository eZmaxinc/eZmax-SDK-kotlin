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

import eZmaxApi.models.DiscussionmessageResponseCompound
import eZmaxApi.models.CommonAudit
import eZmaxApi.models.FieldEDiscussionmessageStatus

class DiscussionmessageResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of DiscussionmessageResponseCompound
        //val modelInstance = DiscussionmessageResponseCompound()

        // to test the property `pkiDiscussionmessageID` - The unique ID of the Discussionmessage
        should("test pkiDiscussionmessageID") {
            // uncomment below to test the property
            //modelInstance.pkiDiscussionmessageID shouldBe ("TODO")
        }

        // to test the property `fkiDiscussionID` - The unique ID of the Discussion
        should("test fkiDiscussionID") {
            // uncomment below to test the property
            //modelInstance.fkiDiscussionID shouldBe ("TODO")
        }

        // to test the property `eDiscussionmessageStatus`
        should("test eDiscussionmessageStatus") {
            // uncomment below to test the property
            //modelInstance.eDiscussionmessageStatus shouldBe ("TODO")
        }

        // to test the property `tDiscussionmessageContent` - The content of the Discussionmessage
        should("test tDiscussionmessageContent") {
            // uncomment below to test the property
            //modelInstance.tDiscussionmessageContent shouldBe ("TODO")
        }

        // to test the property `sDiscussionmessageCreatorname` - The name the creator of the Discussionmessage.
        should("test sDiscussionmessageCreatorname") {
            // uncomment below to test the property
            //modelInstance.sDiscussionmessageCreatorname shouldBe ("TODO")
        }

        // to test the property `objAudit`
        should("test objAudit") {
            // uncomment below to test the property
            //modelInstance.objAudit shouldBe ("TODO")
        }

        // to test the property `fkiDiscussionmembershipID` - The unique ID of the Discussionmembership
        should("test fkiDiscussionmembershipID") {
            // uncomment below to test the property
            //modelInstance.fkiDiscussionmembershipID shouldBe ("TODO")
        }

        // to test the property `fkiDiscussionmembershipIDActionrequired` - The unique ID of the Discussionmembership
        should("test fkiDiscussionmembershipIDActionrequired") {
            // uncomment below to test the property
            //modelInstance.fkiDiscussionmembershipIDActionrequired shouldBe ("TODO")
        }

        // to test the property `sDiscussionmessageActionrequiredname` - The name the Actionrequired of the Discussionmessage.
        should("test sDiscussionmessageActionrequiredname") {
            // uncomment below to test the property
            //modelInstance.sDiscussionmessageActionrequiredname shouldBe ("TODO")
        }

    }
}

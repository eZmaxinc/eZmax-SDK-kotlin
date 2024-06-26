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

import eZmaxApi.models.DiscussionmembershipRequest

class DiscussionmembershipRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of DiscussionmembershipRequest
        //val modelInstance = DiscussionmembershipRequest()

        // to test the property `fkiDiscussionID` - The unique ID of the Discussion
        should("test fkiDiscussionID") {
            // uncomment below to test the property
            //modelInstance.fkiDiscussionID shouldBe ("TODO")
        }

        // to test the property `dtDiscussionmembershipJoined` - The joined date of the Discussionmembership
        should("test dtDiscussionmembershipJoined") {
            // uncomment below to test the property
            //modelInstance.dtDiscussionmembershipJoined shouldBe ("TODO")
        }

        // to test the property `pkiDiscussionmembershipID` - The unique ID of the Discussionmembership
        should("test pkiDiscussionmembershipID") {
            // uncomment below to test the property
            //modelInstance.pkiDiscussionmembershipID shouldBe ("TODO")
        }

        // to test the property `fkiUserID` - The unique ID of the User
        should("test fkiUserID") {
            // uncomment below to test the property
            //modelInstance.fkiUserID shouldBe ("TODO")
        }

        // to test the property `fkiUsergroupID` - The unique ID of the Usergroup
        should("test fkiUsergroupID") {
            // uncomment below to test the property
            //modelInstance.fkiUsergroupID shouldBe ("TODO")
        }

        // to test the property `fkiModulesectionID` - The unique ID of the Modulesection
        should("test fkiModulesectionID") {
            // uncomment below to test the property
            //modelInstance.fkiModulesectionID shouldBe ("TODO")
        }

    }
}

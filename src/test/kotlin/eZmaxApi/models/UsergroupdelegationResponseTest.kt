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

import eZmaxApi.models.UsergroupdelegationResponse

class UsergroupdelegationResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UsergroupdelegationResponse
        //val modelInstance = UsergroupdelegationResponse()

        // to test the property `pkiUsergroupdelegationID` - The unique ID of the Usergroupdelegation
        should("test pkiUsergroupdelegationID") {
            // uncomment below to test the property
            //modelInstance.pkiUsergroupdelegationID shouldBe ("TODO")
        }

        // to test the property `fkiUsergroupID` - The unique ID of the Usergroup
        should("test fkiUsergroupID") {
            // uncomment below to test the property
            //modelInstance.fkiUsergroupID shouldBe ("TODO")
        }

        // to test the property `fkiUserID` - The unique ID of the User
        should("test fkiUserID") {
            // uncomment below to test the property
            //modelInstance.fkiUserID shouldBe ("TODO")
        }

        // to test the property `sUserFirstname` - The first name of the user
        should("test sUserFirstname") {
            // uncomment below to test the property
            //modelInstance.sUserFirstname shouldBe ("TODO")
        }

        // to test the property `sUserLastname` - The last name of the user
        should("test sUserLastname") {
            // uncomment below to test the property
            //modelInstance.sUserLastname shouldBe ("TODO")
        }

        // to test the property `sUserLoginname` - The login name of the User.
        should("test sUserLoginname") {
            // uncomment below to test the property
            //modelInstance.sUserLoginname shouldBe ("TODO")
        }

        // to test the property `sUsergroupNameX` - The Name of the Usergroup in the language of the requester
        should("test sUsergroupNameX") {
            // uncomment below to test the property
            //modelInstance.sUsergroupNameX shouldBe ("TODO")
        }

        // to test the property `sEmailAddress` - The email address.
        should("test sEmailAddress") {
            // uncomment below to test the property
            //modelInstance.sEmailAddress shouldBe ("TODO")
        }

    }
}

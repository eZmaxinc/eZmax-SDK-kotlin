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

import eZmaxApi.models.EzsignsignergroupmembershipResponseCompound

class EzsignsignergroupmembershipResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignsignergroupmembershipResponseCompound
        //val modelInstance = EzsignsignergroupmembershipResponseCompound()

        // to test the property `pkiEzsignsignergroupmembershipID` - The unique ID of the Ezsignsignergroupmembership
        should("test pkiEzsignsignergroupmembershipID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignsignergroupmembershipID shouldBe ("TODO")
        }

        // to test the property `fkiEzsignsignergroupID` - The unique ID of the Ezsignsignergroup
        should("test fkiEzsignsignergroupID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignsignergroupID shouldBe ("TODO")
        }

        // to test the property `fkiEzsignsignerID` - The unique ID of the Ezsignsigner
        should("test fkiEzsignsignerID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignsignerID shouldBe ("TODO")
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

    }
}

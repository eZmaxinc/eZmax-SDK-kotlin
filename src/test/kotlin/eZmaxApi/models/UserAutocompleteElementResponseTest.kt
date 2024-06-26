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

import eZmaxApi.models.UserAutocompleteElementResponse
import eZmaxApi.models.FieldEUserType

class UserAutocompleteElementResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UserAutocompleteElementResponse
        //val modelInstance = UserAutocompleteElementResponse()

        // to test the property `eUserType`
        should("test eUserType") {
            // uncomment below to test the property
            //modelInstance.eUserType shouldBe ("TODO")
        }

        // to test the property `sUserName` - The description of the User in the language of the requester
        should("test sUserName") {
            // uncomment below to test the property
            //modelInstance.sUserName shouldBe ("TODO")
        }

        // to test the property `pkiUserID` - The unique ID of the User
        should("test pkiUserID") {
            // uncomment below to test the property
            //modelInstance.pkiUserID shouldBe ("TODO")
        }

        // to test the property `bUserIsactive` - Whether the User is active or not
        should("test bUserIsactive") {
            // uncomment below to test the property
            //modelInstance.bUserIsactive shouldBe ("TODO")
        }

    }
}

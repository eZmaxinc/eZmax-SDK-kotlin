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

import eZmaxApi.models.EzsignfoldersignerassociationResponseCompoundUser

class EzsignfoldersignerassociationResponseCompoundUserTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignfoldersignerassociationResponseCompoundUser
        //val modelInstance = EzsignfoldersignerassociationResponseCompoundUser()

        // to test the property `pkiUserID` - The unique ID of the User
        should("test pkiUserID") {
            // uncomment below to test the property
            //modelInstance.pkiUserID shouldBe ("TODO")
        }

        // to test the property `fkiLanguageID` - The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
        should("test fkiLanguageID") {
            // uncomment below to test the property
            //modelInstance.fkiLanguageID shouldBe ("TODO")
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

        // to test the property `sEmailAddress` - The email address.
        should("test sEmailAddress") {
            // uncomment below to test the property
            //modelInstance.sEmailAddress shouldBe ("TODO")
        }

    }
}

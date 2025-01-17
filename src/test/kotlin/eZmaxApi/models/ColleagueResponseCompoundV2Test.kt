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

import eZmaxApi.models.ColleagueResponseCompoundV2
import eZmaxApi.models.CommonAudit
import eZmaxApi.models.CustomUserNameResponse
import eZmaxApi.models.FieldEColleagueEzsign
import eZmaxApi.models.FieldEColleagueRealestateinprogess

class ColleagueResponseCompoundV2Test : ShouldSpec() {
    init {
        // uncomment below to create an instance of ColleagueResponseCompoundV2
        //val modelInstance = ColleagueResponseCompoundV2()

        // to test the property `pkiColleagueID` - The unique ID of the Colleague
        should("test pkiColleagueID") {
            // uncomment below to test the property
            //modelInstance.pkiColleagueID shouldBe ("TODO")
        }

        // to test the property `fkiUserID` - The unique ID of the User
        should("test fkiUserID") {
            // uncomment below to test the property
            //modelInstance.fkiUserID shouldBe ("TODO")
        }

        // to test the property `fkiUserIDColleague` - The unique ID of the User
        should("test fkiUserIDColleague") {
            // uncomment below to test the property
            //modelInstance.fkiUserIDColleague shouldBe ("TODO")
        }

        // to test the property `bColleagueEzsignemail` - Whether the email can be used by the cloning user in Ezsign
        should("test bColleagueEzsignemail") {
            // uncomment below to test the property
            //modelInstance.bColleagueEzsignemail shouldBe ("TODO")
        }

        // to test the property `bColleagueFinancial` - Whether the cloning user has access to the financial
        should("test bColleagueFinancial") {
            // uncomment below to test the property
            //modelInstance.bColleagueFinancial shouldBe ("TODO")
        }

        // to test the property `bColleagueUsecloneemail` - Whether the cloning user has access to the cloned user email to send communications
        should("test bColleagueUsecloneemail") {
            // uncomment below to test the property
            //modelInstance.bColleagueUsecloneemail shouldBe ("TODO")
        }

        // to test the property `bColleagueAttachment` - Whether the cloning user has access to the attachment
        should("test bColleagueAttachment") {
            // uncomment below to test the property
            //modelInstance.bColleagueAttachment shouldBe ("TODO")
        }

        // to test the property `bColleagueCanafe` - Whether the cloning user has access to canafe
        should("test bColleagueCanafe") {
            // uncomment below to test the property
            //modelInstance.bColleagueCanafe shouldBe ("TODO")
        }

        // to test the property `bColleaguePermission` - Whether the cloning user copies the permission of the cloned user
        should("test bColleaguePermission") {
            // uncomment below to test the property
            //modelInstance.bColleaguePermission shouldBe ("TODO")
        }

        // to test the property `bColleagueRealestatecompleted` - Whether if the cloning user has access to the completed folders in real estate
        should("test bColleagueRealestatecompleted") {
            // uncomment below to test the property
            //modelInstance.bColleagueRealestatecompleted shouldBe ("TODO")
        }

        // to test the property `eColleagueEzsign`
        should("test eColleagueEzsign") {
            // uncomment below to test the property
            //modelInstance.eColleagueEzsign shouldBe ("TODO")
        }

        // to test the property `eColleagueRealestateinprogress`
        should("test eColleagueRealestateinprogress") {
            // uncomment below to test the property
            //modelInstance.eColleagueRealestateinprogress shouldBe ("TODO")
        }

        // to test the property `objUserName`
        should("test objUserName") {
            // uncomment below to test the property
            //modelInstance.objUserName shouldBe ("TODO")
        }

        // to test the property `objAudit`
        should("test objAudit") {
            // uncomment below to test the property
            //modelInstance.objAudit shouldBe ("TODO")
        }

        // to test the property `dtColleagueFrom` - The from of the Colleague
        should("test dtColleagueFrom") {
            // uncomment below to test the property
            //modelInstance.dtColleagueFrom shouldBe ("TODO")
        }

        // to test the property `dtColleagueTo` - The to of the Colleague
        should("test dtColleagueTo") {
            // uncomment below to test the property
            //modelInstance.dtColleagueTo shouldBe ("TODO")
        }

    }
}

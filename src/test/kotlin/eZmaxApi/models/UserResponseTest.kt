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

import eZmaxApi.models.UserResponse
import eZmaxApi.models.CommonAudit
import eZmaxApi.models.EmailResponseCompound
import eZmaxApi.models.FieldEUserEzsignaccess
import eZmaxApi.models.FieldEUserLogintype
import eZmaxApi.models.FieldEUserOrigin
import eZmaxApi.models.FieldEUserType
import eZmaxApi.models.PhoneResponseCompound

class UserResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UserResponse
        //val modelInstance = UserResponse()

        // to test the property `pkiUserID` - The unique ID of the User
        should("test pkiUserID") {
            // uncomment below to test the property
            //modelInstance.pkiUserID shouldBe ("TODO")
        }

        // to test the property `fkiCompanyIDDefault` - The unique ID of the Company
        should("test fkiCompanyIDDefault") {
            // uncomment below to test the property
            //modelInstance.fkiCompanyIDDefault shouldBe ("TODO")
        }

        // to test the property `sCompanyNameX` - The Name of the Company in the language of the requester
        should("test sCompanyNameX") {
            // uncomment below to test the property
            //modelInstance.sCompanyNameX shouldBe ("TODO")
        }

        // to test the property `fkiDepartmentIDDefault` - The unique ID of the Department
        should("test fkiDepartmentIDDefault") {
            // uncomment below to test the property
            //modelInstance.fkiDepartmentIDDefault shouldBe ("TODO")
        }

        // to test the property `sDepartmentNameX` - The Name of the Department in the language of the requester
        should("test sDepartmentNameX") {
            // uncomment below to test the property
            //modelInstance.sDepartmentNameX shouldBe ("TODO")
        }

        // to test the property `fkiTimezoneID` - The unique ID of the Timezone
        should("test fkiTimezoneID") {
            // uncomment below to test the property
            //modelInstance.fkiTimezoneID shouldBe ("TODO")
        }

        // to test the property `sTimezoneName` - The description of the Timezone
        should("test sTimezoneName") {
            // uncomment below to test the property
            //modelInstance.sTimezoneName shouldBe ("TODO")
        }

        // to test the property `fkiLanguageID` - The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
        should("test fkiLanguageID") {
            // uncomment below to test the property
            //modelInstance.fkiLanguageID shouldBe ("TODO")
        }

        // to test the property `sLanguageNameX` - The Name of the Language in the language of the requester
        should("test sLanguageNameX") {
            // uncomment below to test the property
            //modelInstance.sLanguageNameX shouldBe ("TODO")
        }

        // to test the property `objEmail`
        should("test objEmail") {
            // uncomment below to test the property
            //modelInstance.objEmail shouldBe ("TODO")
        }

        // to test the property `fkiBillingentityinternalID` - The unique ID of the Billingentityinternal.
        should("test fkiBillingentityinternalID") {
            // uncomment below to test the property
            //modelInstance.fkiBillingentityinternalID shouldBe ("TODO")
        }

        // to test the property `sBillingentityinternalDescriptionX` - The description of the Billingentityinternal in the language of the requester
        should("test sBillingentityinternalDescriptionX") {
            // uncomment below to test the property
            //modelInstance.sBillingentityinternalDescriptionX shouldBe ("TODO")
        }

        // to test the property `eUserOrigin`
        should("test eUserOrigin") {
            // uncomment below to test the property
            //modelInstance.eUserOrigin shouldBe ("TODO")
        }

        // to test the property `eUserType`
        should("test eUserType") {
            // uncomment below to test the property
            //modelInstance.eUserType shouldBe ("TODO")
        }

        // to test the property `eUserLogintype`
        should("test eUserLogintype") {
            // uncomment below to test the property
            //modelInstance.eUserLogintype shouldBe ("TODO")
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

        // to test the property `eUserEzsignaccess`
        should("test eUserEzsignaccess") {
            // uncomment below to test the property
            //modelInstance.eUserEzsignaccess shouldBe ("TODO")
        }

        // to test the property `bUserIsactive` - Whether the User is active or not
        should("test bUserIsactive") {
            // uncomment below to test the property
            //modelInstance.bUserIsactive shouldBe ("TODO")
        }

        // to test the property `bUserChangepassword` - Whether if the User is forced to change its password
        should("test bUserChangepassword") {
            // uncomment below to test the property
            //modelInstance.bUserChangepassword shouldBe ("TODO")
        }

        // to test the property `objAudit`
        should("test objAudit") {
            // uncomment below to test the property
            //modelInstance.objAudit shouldBe ("TODO")
        }

        // to test the property `fkiAgentID` - The unique ID of the Agent.
        should("test fkiAgentID") {
            // uncomment below to test the property
            //modelInstance.fkiAgentID shouldBe ("TODO")
        }

        // to test the property `fkiBrokerID` - The unique ID of the Broker.
        should("test fkiBrokerID") {
            // uncomment below to test the property
            //modelInstance.fkiBrokerID shouldBe ("TODO")
        }

        // to test the property `fkiAssistantID` - The unique ID of the Assistant.
        should("test fkiAssistantID") {
            // uncomment below to test the property
            //modelInstance.fkiAssistantID shouldBe ("TODO")
        }

        // to test the property `fkiEmployeeID` - The unique ID of the Employee.
        should("test fkiEmployeeID") {
            // uncomment below to test the property
            //modelInstance.fkiEmployeeID shouldBe ("TODO")
        }

        // to test the property `objPhoneHome`
        should("test objPhoneHome") {
            // uncomment below to test the property
            //modelInstance.objPhoneHome shouldBe ("TODO")
        }

        // to test the property `objPhoneSMS`
        should("test objPhoneSMS") {
            // uncomment below to test the property
            //modelInstance.objPhoneSMS shouldBe ("TODO")
        }

        // to test the property `fkiSecretquestionID` - The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father's middle name| |15|Your mother's maiden name| |16|Name of your eldest child| |17|Your spouse's middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat's name| |22|Date of Birth (YYYY-MM-DD)| |22|Secret Code| |22|Your reference code|
        should("test fkiSecretquestionID") {
            // uncomment below to test the property
            //modelInstance.fkiSecretquestionID shouldBe ("TODO")
        }

        // to test the property `fkiModuleIDForm` - The unique ID of the Module
        should("test fkiModuleIDForm") {
            // uncomment below to test the property
            //modelInstance.fkiModuleIDForm shouldBe ("TODO")
        }

        // to test the property `sModuleNameX` - The Name of the Module in the language of the requester
        should("test sModuleNameX") {
            // uncomment below to test the property
            //modelInstance.sModuleNameX shouldBe ("TODO")
        }

        // to test the property `sUserJobtitle` - The job title of the user
        should("test sUserJobtitle") {
            // uncomment below to test the property
            //modelInstance.sUserJobtitle shouldBe ("TODO")
        }

        // to test the property `dtUserLastlogondate` - The last logon date of the User
        should("test dtUserLastlogondate") {
            // uncomment below to test the property
            //modelInstance.dtUserLastlogondate shouldBe ("TODO")
        }

        // to test the property `dtUserPasswordchanged` - The date at which the User's password was last changed
        should("test dtUserPasswordchanged") {
            // uncomment below to test the property
            //modelInstance.dtUserPasswordchanged shouldBe ("TODO")
        }

        // to test the property `dtUserEzsignprepaidexpiration` - The eZsign prepaid expiration date
        should("test dtUserEzsignprepaidexpiration") {
            // uncomment below to test the property
            //modelInstance.dtUserEzsignprepaidexpiration shouldBe ("TODO")
        }

        // to test the property `bUserValidatebyadministration` - Whether if the transactions in which the User is implicated must be validated by administrative personnel or not
        should("test bUserValidatebyadministration") {
            // uncomment below to test the property
            //modelInstance.bUserValidatebyadministration shouldBe ("TODO")
        }

        // to test the property `bUserValidatebydirector` - Whether if the transactions in which the User is implicated must be validated by a director or not
        should("test bUserValidatebydirector") {
            // uncomment below to test the property
            //modelInstance.bUserValidatebydirector shouldBe ("TODO")
        }

        // to test the property `bUserAttachmentautoverified` - Whether if Attachments uploaded by the User must be validated or not
        should("test bUserAttachmentautoverified") {
            // uncomment below to test the property
            //modelInstance.bUserAttachmentautoverified shouldBe ("TODO")
        }

    }
}

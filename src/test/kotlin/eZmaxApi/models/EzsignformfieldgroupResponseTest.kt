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

import eZmaxApi.models.EzsignformfieldgroupResponse
import eZmaxApi.models.EnumTextvalidation
import eZmaxApi.models.FieldEEzsignformfieldgroupSignerrequirement
import eZmaxApi.models.FieldEEzsignformfieldgroupTooltipposition
import eZmaxApi.models.FieldEEzsignformfieldgroupType

class EzsignformfieldgroupResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignformfieldgroupResponse
        //val modelInstance = EzsignformfieldgroupResponse()

        // to test the property `pkiEzsignformfieldgroupID` - The unique ID of the Ezsignformfieldgroup
        should("test pkiEzsignformfieldgroupID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignformfieldgroupID shouldBe ("TODO")
        }

        // to test the property `fkiEzsigndocumentID` - The unique ID of the Ezsigndocument
        should("test fkiEzsigndocumentID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigndocumentID shouldBe ("TODO")
        }

        // to test the property `eEzsignformfieldgroupType`
        should("test eEzsignformfieldgroupType") {
            // uncomment below to test the property
            //modelInstance.eEzsignformfieldgroupType shouldBe ("TODO")
        }

        // to test the property `sEzsignformfieldgroupLabel` - The Label for the Ezsignformfieldgroup
        should("test sEzsignformfieldgroupLabel") {
            // uncomment below to test the property
            //modelInstance.sEzsignformfieldgroupLabel shouldBe ("TODO")
        }

        // to test the property `iEzsignformfieldgroupStep` - The step when the Ezsignsigner will be invited to fill the form fields
        should("test iEzsignformfieldgroupStep") {
            // uncomment below to test the property
            //modelInstance.iEzsignformfieldgroupStep shouldBe ("TODO")
        }

        // to test the property `iEzsignformfieldgroupFilledmin` - The minimum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup
        should("test iEzsignformfieldgroupFilledmin") {
            // uncomment below to test the property
            //modelInstance.iEzsignformfieldgroupFilledmin shouldBe ("TODO")
        }

        // to test the property `iEzsignformfieldgroupFilledmax` - The maximum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup
        should("test iEzsignformfieldgroupFilledmax") {
            // uncomment below to test the property
            //modelInstance.iEzsignformfieldgroupFilledmax shouldBe ("TODO")
        }

        // to test the property `bEzsignformfieldgroupReadonly` - Whether the Ezsignformfieldgroup is read only or not.
        should("test bEzsignformfieldgroupReadonly") {
            // uncomment below to test the property
            //modelInstance.bEzsignformfieldgroupReadonly shouldBe ("TODO")
        }

        // to test the property `eEzsignformfieldgroupSignerrequirement`
        should("test eEzsignformfieldgroupSignerrequirement") {
            // uncomment below to test the property
            //modelInstance.eEzsignformfieldgroupSignerrequirement shouldBe ("TODO")
        }

        // to test the property `sEzsignformfieldgroupDefaultvalue` - The default value for the Ezsignformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |
        should("test sEzsignformfieldgroupDefaultvalue") {
            // uncomment below to test the property
            //modelInstance.sEzsignformfieldgroupDefaultvalue shouldBe ("TODO")
        }

        // to test the property `iEzsignformfieldgroupMaxlength` - The maximum length for the value in the Ezsignformfieldgroup  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
        should("test iEzsignformfieldgroupMaxlength") {
            // uncomment below to test the property
            //modelInstance.iEzsignformfieldgroupMaxlength shouldBe ("TODO")
        }

        // to test the property `bEzsignformfieldgroupEncrypted` - Whether the Ezsignformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
        should("test bEzsignformfieldgroupEncrypted") {
            // uncomment below to test the property
            //modelInstance.bEzsignformfieldgroupEncrypted shouldBe ("TODO")
        }

        // to test the property `eEzsignformfieldgroupTextvalidation`
        should("test eEzsignformfieldgroupTextvalidation") {
            // uncomment below to test the property
            //modelInstance.eEzsignformfieldgroupTextvalidation shouldBe ("TODO")
        }

        // to test the property `sEzsignformfieldgroupRegexp` - A regular expression to indicate what values are acceptable for the Ezsignformfieldgroup.  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
        should("test sEzsignformfieldgroupRegexp") {
            // uncomment below to test the property
            //modelInstance.sEzsignformfieldgroupRegexp shouldBe ("TODO")
        }

        // to test the property `sEzsignformfieldgroupTextvalidationcustommessage` - Description of validation rule. Show by signatory.
        should("test sEzsignformfieldgroupTextvalidationcustommessage") {
            // uncomment below to test the property
            //modelInstance.sEzsignformfieldgroupTextvalidationcustommessage shouldBe ("TODO")
        }

        // to test the property `tEzsignformfieldgroupTooltip` - A tooltip that will be presented to Ezsignsigner about the Ezsignformfieldgroup
        should("test tEzsignformfieldgroupTooltip") {
            // uncomment below to test the property
            //modelInstance.tEzsignformfieldgroupTooltip shouldBe ("TODO")
        }

        // to test the property `eEzsignformfieldgroupTooltipposition`
        should("test eEzsignformfieldgroupTooltipposition") {
            // uncomment below to test the property
            //modelInstance.eEzsignformfieldgroupTooltipposition shouldBe ("TODO")
        }

    }
}

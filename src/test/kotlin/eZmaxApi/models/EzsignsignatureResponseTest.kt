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

import eZmaxApi.models.EzsignsignatureResponse
import eZmaxApi.models.CustomContactNameResponse
import eZmaxApi.models.EnumTextvalidation
import eZmaxApi.models.FieldEEzsignsignatureAttachmentnamesource
import eZmaxApi.models.FieldEEzsignsignatureConsultationtrigger
import eZmaxApi.models.FieldEEzsignsignatureDependencyrequirement
import eZmaxApi.models.FieldEEzsignsignatureFont
import eZmaxApi.models.FieldEEzsignsignatureTooltipposition
import eZmaxApi.models.FieldEEzsignsignatureType
import eZmaxApi.models.SignatureResponseCompound

class EzsignsignatureResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignsignatureResponse
        //val modelInstance = EzsignsignatureResponse()

        // to test the property `pkiEzsignsignatureID` - The unique ID of the Ezsignsignature
        should("test pkiEzsignsignatureID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignsignatureID shouldBe ("TODO")
        }

        // to test the property `fkiEzsigndocumentID` - The unique ID of the Ezsigndocument
        should("test fkiEzsigndocumentID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigndocumentID shouldBe ("TODO")
        }

        // to test the property `fkiEzsignfoldersignerassociationID` - The unique ID of the Ezsignfoldersignerassociation
        should("test fkiEzsignfoldersignerassociationID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfoldersignerassociationID shouldBe ("TODO")
        }

        // to test the property `iEzsignpagePagenumber` - The page number in the Ezsigndocument
        should("test iEzsignpagePagenumber") {
            // uncomment below to test the property
            //modelInstance.iEzsignpagePagenumber shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureX` - The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
        should("test iEzsignsignatureX") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureX shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureY` - The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
        should("test iEzsignsignatureY") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureY shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureStep` - The step when the Ezsignsigner will be invited to sign
        should("test iEzsignsignatureStep") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureStep shouldBe ("TODO")
        }

        // to test the property `eEzsignsignatureType`
        should("test eEzsignsignatureType") {
            // uncomment below to test the property
            //modelInstance.eEzsignsignatureType shouldBe ("TODO")
        }

        // to test the property `objContactName`
        should("test objContactName") {
            // uncomment below to test the property
            //modelInstance.objContactName shouldBe ("TODO")
        }

        // to test the property `fkiEzsignsigningreasonID` - The unique ID of the Ezsignsigningreason
        should("test fkiEzsignsigningreasonID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignsigningreasonID shouldBe ("TODO")
        }

        // to test the property `fkiFontID` - The unique ID of the Font
        should("test fkiFontID") {
            // uncomment below to test the property
            //modelInstance.fkiFontID shouldBe ("TODO")
        }

        // to test the property `sEzsignsigningreasonDescriptionX` - The description of the Ezsignsigningreason in the language of the requester
        should("test sEzsignsigningreasonDescriptionX") {
            // uncomment below to test the property
            //modelInstance.sEzsignsigningreasonDescriptionX shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureHeight` - The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \"200\" for the iEzsignsignatureHeight.
        should("test iEzsignsignatureHeight") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureHeight shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureWidth` - The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \"200\" for the iEzsignsignatureWidth.
        should("test iEzsignsignatureWidth") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureWidth shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureStepadjusted` - The step when the Ezsignsigner will be invited to sign
        should("test iEzsignsignatureStepadjusted") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureStepadjusted shouldBe ("TODO")
        }

        // to test the property `tEzsignsignatureTooltip` - A tooltip that will be presented to Ezsignsigner about the Ezsignsignature
        should("test tEzsignsignatureTooltip") {
            // uncomment below to test the property
            //modelInstance.tEzsignsignatureTooltip shouldBe ("TODO")
        }

        // to test the property `eEzsignsignatureTooltipposition`
        should("test eEzsignsignatureTooltipposition") {
            // uncomment below to test the property
            //modelInstance.eEzsignsignatureTooltipposition shouldBe ("TODO")
        }

        // to test the property `eEzsignsignatureFont`
        should("test eEzsignsignatureFont") {
            // uncomment below to test the property
            //modelInstance.eEzsignsignatureFont shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureValidationstep` - The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments
        should("test iEzsignsignatureValidationstep") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureValidationstep shouldBe ("TODO")
        }

        // to test the property `sEzsignsignatureAttachmentdescription` - The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments
        should("test sEzsignsignatureAttachmentdescription") {
            // uncomment below to test the property
            //modelInstance.sEzsignsignatureAttachmentdescription shouldBe ("TODO")
        }

        // to test the property `eEzsignsignatureAttachmentnamesource`
        should("test eEzsignsignatureAttachmentnamesource") {
            // uncomment below to test the property
            //modelInstance.eEzsignsignatureAttachmentnamesource shouldBe ("TODO")
        }

        // to test the property `eEzsignsignatureConsultationtrigger`
        should("test eEzsignsignatureConsultationtrigger") {
            // uncomment below to test the property
            //modelInstance.eEzsignsignatureConsultationtrigger shouldBe ("TODO")
        }

        // to test the property `bEzsignsignatureHandwritten` - Whether the Ezsignsignature must be handwritten or not when eEzsignsignatureType = Signature.
        should("test bEzsignsignatureHandwritten") {
            // uncomment below to test the property
            //modelInstance.bEzsignsignatureHandwritten shouldBe ("TODO")
        }

        // to test the property `bEzsignsignatureReason` - Whether the Ezsignsignature must include a reason or not when eEzsignsignatureType = Signature.
        should("test bEzsignsignatureReason") {
            // uncomment below to test the property
            //modelInstance.bEzsignsignatureReason shouldBe ("TODO")
        }

        // to test the property `bEzsignsignatureRequired` - Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments, Text or Textarea.
        should("test bEzsignsignatureRequired") {
            // uncomment below to test the property
            //modelInstance.bEzsignsignatureRequired shouldBe ("TODO")
        }

        // to test the property `fkiEzsignfoldersignerassociationIDValidation` - The unique ID of the Ezsignfoldersignerassociation
        should("test fkiEzsignfoldersignerassociationIDValidation") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfoldersignerassociationIDValidation shouldBe ("TODO")
        }

        // to test the property `dtEzsignsignatureDate` - The date the Ezsignsignature was signed
        should("test dtEzsignsignatureDate") {
            // uncomment below to test the property
            //modelInstance.dtEzsignsignatureDate shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureattachmentCount` - The count of Ezsignsignatureattachment
        should("test iEzsignsignatureattachmentCount") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureattachmentCount shouldBe ("TODO")
        }

        // to test the property `sEzsignsignatureDescription` - The value entered while signing Ezsignsignature of eEzsignsignatureType **City**, **FieldText** and **FieldTextarea**
        should("test sEzsignsignatureDescription") {
            // uncomment below to test the property
            //modelInstance.sEzsignsignatureDescription shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureMaxlength` - The maximum length for the value in the Ezsignsignature  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea**
        should("test iEzsignsignatureMaxlength") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureMaxlength shouldBe ("TODO")
        }

        // to test the property `eEzsignsignatureTextvalidation`
        should("test eEzsignsignatureTextvalidation") {
            // uncomment below to test the property
            //modelInstance.eEzsignsignatureTextvalidation shouldBe ("TODO")
        }

        // to test the property `sEzsignsignatureTextvalidationcustommessage` - Description of validation rule. Show by signatory.
        should("test sEzsignsignatureTextvalidationcustommessage") {
            // uncomment below to test the property
            //modelInstance.sEzsignsignatureTextvalidationcustommessage shouldBe ("TODO")
        }

        // to test the property `eEzsignsignatureDependencyrequirement`
        should("test eEzsignsignatureDependencyrequirement") {
            // uncomment below to test the property
            //modelInstance.eEzsignsignatureDependencyrequirement shouldBe ("TODO")
        }

        // to test the property `sEzsignsignatureDefaultvalue` - The default value for the Ezsignsignature  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |
        should("test sEzsignsignatureDefaultvalue") {
            // uncomment below to test the property
            //modelInstance.sEzsignsignatureDefaultvalue shouldBe ("TODO")
        }

        // to test the property `sEzsignsignatureRegexp` - A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom**
        should("test sEzsignsignatureRegexp") {
            // uncomment below to test the property
            //modelInstance.sEzsignsignatureRegexp shouldBe ("TODO")
        }

        // to test the property `objContactNameDelegation`
        should("test objContactNameDelegation") {
            // uncomment below to test the property
            //modelInstance.objContactNameDelegation shouldBe ("TODO")
        }

        // to test the property `objSignature`
        should("test objSignature") {
            // uncomment below to test the property
            //modelInstance.objSignature shouldBe ("TODO")
        }

    }
}

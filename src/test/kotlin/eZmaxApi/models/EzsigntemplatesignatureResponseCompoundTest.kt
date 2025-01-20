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

import eZmaxApi.models.EzsigntemplatesignatureResponseCompound
import eZmaxApi.models.EnumTextvalidation
import eZmaxApi.models.EzsigntemplateelementdependencyResponseCompound
import eZmaxApi.models.EzsigntemplatesignaturecustomdateResponseCompound
import eZmaxApi.models.FieldEEzsigntemplatesignatureAttachmentnamesource
import eZmaxApi.models.FieldEEzsigntemplatesignatureConsultationtrigger
import eZmaxApi.models.FieldEEzsigntemplatesignatureDependencyrequirement
import eZmaxApi.models.FieldEEzsigntemplatesignatureFont
import eZmaxApi.models.FieldEEzsigntemplatesignaturePositioning
import eZmaxApi.models.FieldEEzsigntemplatesignaturePositioningoccurence
import eZmaxApi.models.FieldEEzsigntemplatesignatureTooltipposition
import eZmaxApi.models.FieldEEzsigntemplatesignatureType

class EzsigntemplatesignatureResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplatesignatureResponseCompound
        //val modelInstance = EzsigntemplatesignatureResponseCompound()

        // to test the property `pkiEzsigntemplatesignatureID` - The unique ID of the Ezsigntemplatesignature
        should("test pkiEzsigntemplatesignatureID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigntemplatesignatureID shouldBe ("TODO")
        }

        // to test the property `fkiEzsigntemplatedocumentID` - The unique ID of the Ezsigntemplatedocument
        should("test fkiEzsigntemplatedocumentID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntemplatedocumentID shouldBe ("TODO")
        }

        // to test the property `fkiEzsigntemplatesignerID` - The unique ID of the Ezsigntemplatesigner
        should("test fkiEzsigntemplatesignerID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntemplatesignerID shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatedocumentpagePagenumber` - The page number in the Ezsigntemplatedocument
        should("test iEzsigntemplatedocumentpagePagenumber") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatedocumentpagePagenumber shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatesignatureStep` - The step when the Ezsigntemplatesigner will be invited to sign
        should("test iEzsigntemplatesignatureStep") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatesignatureStep shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplatesignatureType`
        should("test eEzsigntemplatesignatureType") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplatesignatureType shouldBe ("TODO")
        }

        // to test the property `fkiEzsigntemplatesignerIDValidation` - The unique ID of the Ezsigntemplatesigner
        should("test fkiEzsigntemplatesignerIDValidation") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntemplatesignerIDValidation shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplatesignatureHandwritten` - Whether the Ezsigntemplatesignature must be handwritten or not when eEzsigntemplatesignatureType = Signature.
        should("test bEzsigntemplatesignatureHandwritten") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplatesignatureHandwritten shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplatesignatureReason` - Whether the Ezsigntemplatesignature must include a reason or not when eEzsigntemplatesignatureType = Signature.
        should("test bEzsigntemplatesignatureReason") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplatesignatureReason shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplatesignaturePositioning`
        should("test eEzsigntemplatesignaturePositioning") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplatesignaturePositioning shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatesignatureX` - The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
        should("test iEzsigntemplatesignatureX") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatesignatureX shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatesignatureY` - The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
        should("test iEzsigntemplatesignatureY") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatesignatureY shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatesignatureWidth` - The width of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have a width of 2 inches, you would use \"200\" for the iEzsigntemplatesignatureWidth.
        should("test iEzsigntemplatesignatureWidth") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatesignatureWidth shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatesignatureHeight` - The height of the Ezsigntemplatesignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsigntemplatesignature to have an height of 2 inches, you would use \"200\" for the iEzsigntemplatesignatureHeight.
        should("test iEzsigntemplatesignatureHeight") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatesignatureHeight shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplatesignatureConsultationtrigger`
        should("test eEzsigntemplatesignatureConsultationtrigger") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplatesignatureConsultationtrigger shouldBe ("TODO")
        }

        // to test the property `tEzsigntemplatesignatureTooltip` - A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature
        should("test tEzsigntemplatesignatureTooltip") {
            // uncomment below to test the property
            //modelInstance.tEzsigntemplatesignatureTooltip shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplatesignatureTooltipposition`
        should("test eEzsigntemplatesignatureTooltipposition") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplatesignatureTooltipposition shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplatesignatureFont`
        should("test eEzsigntemplatesignatureFont") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplatesignatureFont shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatesignatureValidationstep` - The step when the Ezsigntemplatesigner will be invited to validate the Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments
        should("test iEzsigntemplatesignatureValidationstep") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatesignatureValidationstep shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplatesignatureAttachmentdescription` - The description attached to the attachment name added in Ezsigntemplatesignature of eEzsigntemplatesignatureType Attachments
        should("test sEzsigntemplatesignatureAttachmentdescription") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplatesignatureAttachmentdescription shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplatesignatureAttachmentnamesource`
        should("test eEzsigntemplatesignatureAttachmentnamesource") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplatesignatureAttachmentnamesource shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplatesignatureRequired` - Whether the Ezsigntemplatesignature is required or not. This field is relevant only with Ezsigntemplatesignature with eEzsigntemplatesignatureType = Attachments.
        should("test bEzsigntemplatesignatureRequired") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplatesignatureRequired shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatesignatureMaxlength` - The maximum length for the value in the Ezsigntemplatesignature  This can only be set if eEzsigntemplatesignatureType is **FieldText** or **FieldTextarea**
        should("test iEzsigntemplatesignatureMaxlength") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatesignatureMaxlength shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplatesignatureDefaultvalue` - The default value for the Ezsigntemplatesignature  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |
        should("test sEzsigntemplatesignatureDefaultvalue") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplatesignatureDefaultvalue shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplatesignatureRegexp` - A regular expression to indicate what values are acceptable for the Ezsigntemplatesignature.  This can only be set if eEzsigntemplatesignatureType is **Text** or **Textarea**
        should("test sEzsigntemplatesignatureRegexp") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplatesignatureRegexp shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplatesignatureTextvalidation`
        should("test eEzsigntemplatesignatureTextvalidation") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplatesignatureTextvalidation shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplatesignatureTextvalidationcustommessage` - Description of validation rule. Show by signatory.
        should("test sEzsigntemplatesignatureTextvalidationcustommessage") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplatesignatureTextvalidationcustommessage shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplatesignatureDependencyrequirement`
        should("test eEzsigntemplatesignatureDependencyrequirement") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplatesignatureDependencyrequirement shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplatesignaturePositioningpattern` - The string pattern to search for the positioning. **This is not a regexp**  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates**
        should("test sEzsigntemplatesignaturePositioningpattern") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplatesignaturePositioningpattern shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatesignaturePositioningoffsetx` - The offset X  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates**
        should("test iEzsigntemplatesignaturePositioningoffsetx") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatesignaturePositioningoffsetx shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatesignaturePositioningoffsety` - The offset Y  This will be required if **eEzsigntemplatesignaturePositioning** is set to **PerCoordinates**
        should("test iEzsigntemplatesignaturePositioningoffsety") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatesignaturePositioningoffsety shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplatesignaturePositioningoccurence`
        should("test eEzsigntemplatesignaturePositioningoccurence") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplatesignaturePositioningoccurence shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplatesignatureCustomdate` - Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**)
        should("test bEzsigntemplatesignatureCustomdate") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplatesignatureCustomdate shouldBe ("TODO")
        }

        // to test the property `aObjEzsigntemplatesignaturecustomdate` - An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.
        should("test aObjEzsigntemplatesignaturecustomdate") {
            // uncomment below to test the property
            //modelInstance.aObjEzsigntemplatesignaturecustomdate shouldBe ("TODO")
        }

        // to test the property `aObjEzsigntemplateelementdependency`
        should("test aObjEzsigntemplateelementdependency") {
            // uncomment below to test the property
            //modelInstance.aObjEzsigntemplateelementdependency shouldBe ("TODO")
        }

    }
}

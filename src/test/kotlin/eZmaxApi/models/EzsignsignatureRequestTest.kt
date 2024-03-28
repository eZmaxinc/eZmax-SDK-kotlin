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

import eZmaxApi.models.EzsignsignatureRequest
import eZmaxApi.models.EnumTextvalidation
import eZmaxApi.models.FieldEEzsignsignatureAttachmentnamesource
import eZmaxApi.models.FieldEEzsignsignatureDependencyrequirement
import eZmaxApi.models.FieldEEzsignsignatureFont
import eZmaxApi.models.FieldEEzsignsignatureTooltipposition
import eZmaxApi.models.FieldEEzsignsignatureType

class EzsignsignatureRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignsignatureRequest
        //val modelInstance = EzsignsignatureRequest()

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

        // to test the property `fkiEzsigndocumentID` - The unique ID of the Ezsigndocument
        should("test fkiEzsigndocumentID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigndocumentID shouldBe ("TODO")
        }

        // to test the property `pkiEzsignsignatureID` - The unique ID of the Ezsignsignature
        should("test pkiEzsignsignatureID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignsignatureID shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureWidth` - The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \"200\" for the iEzsignsignatureWidth.
        should("test iEzsignsignatureWidth") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureWidth shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureHeight` - The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \"200\" for the iEzsignsignatureHeight.
        should("test iEzsignsignatureHeight") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureHeight shouldBe ("TODO")
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

        // to test the property `fkiEzsignfoldersignerassociationIDValidation` - The unique ID of the Ezsignfoldersignerassociation
        should("test fkiEzsignfoldersignerassociationIDValidation") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfoldersignerassociationIDValidation shouldBe ("TODO")
        }

        // to test the property `bEzsignsignatureRequired` - Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments.
        should("test bEzsignsignatureRequired") {
            // uncomment below to test the property
            //modelInstance.bEzsignsignatureRequired shouldBe ("TODO")
        }

        // to test the property `eEzsignsignatureAttachmentnamesource`
        should("test eEzsignsignatureAttachmentnamesource") {
            // uncomment below to test the property
            //modelInstance.eEzsignsignatureAttachmentnamesource shouldBe ("TODO")
        }

        // to test the property `sEzsignsignatureAttachmentdescription` - The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments
        should("test sEzsignsignatureAttachmentdescription") {
            // uncomment below to test the property
            //modelInstance.sEzsignsignatureAttachmentdescription shouldBe ("TODO")
        }

        // to test the property `iEzsignsignatureValidationstep` - The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments
        should("test iEzsignsignatureValidationstep") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignatureValidationstep shouldBe ("TODO")
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

        // to test the property `sEzsignsignatureRegexp` - A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom**
        should("test sEzsignsignatureRegexp") {
            // uncomment below to test the property
            //modelInstance.sEzsignsignatureRegexp shouldBe ("TODO")
        }

        // to test the property `eEzsignsignatureDependencyrequirement`
        should("test eEzsignsignatureDependencyrequirement") {
            // uncomment below to test the property
            //modelInstance.eEzsignsignatureDependencyrequirement shouldBe ("TODO")
        }

    }
}

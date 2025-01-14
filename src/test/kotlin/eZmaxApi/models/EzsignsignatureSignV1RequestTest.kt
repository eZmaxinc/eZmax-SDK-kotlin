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

import eZmaxApi.models.EzsignsignatureSignV1Request
import eZmaxApi.models.CommonFile

class EzsignsignatureSignV1RequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignsignatureSignV1Request
        //val modelInstance = EzsignsignatureSignV1Request()

        // to test the property `bIsAutomatic` - Indicates if the Ezsignsignature was part of an automatic process or not.  This can only be true if eEzsignsignatureType is **Acknowledgement**, **City**, **Signature**, **Initials** or **Stamp**. 
        should("test bIsAutomatic") {
            // uncomment below to test the property
            //modelInstance.bIsAutomatic shouldBe ("TODO")
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

        // to test the property `sValue` - The value required for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **City**, **FieldText** or **FieldTextarea**
        should("test sValue") {
            // uncomment below to test the property
            //modelInstance.sValue shouldBe ("TODO")
        }

        // to test the property `eAttachmentsConfirmationDecision` - Whether the attachment are accepted or refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation**
        should("test eAttachmentsConfirmationDecision") {
            // uncomment below to test the property
            //modelInstance.eAttachmentsConfirmationDecision shouldBe ("TODO")
        }

        // to test the property `sAttachmentsRefusalReason` - The reason of refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation**
        should("test sAttachmentsRefusalReason") {
            // uncomment below to test the property
            //modelInstance.sAttachmentsRefusalReason shouldBe ("TODO")
        }

        // to test the property `sSvg` - The SVG of the signature.  This can only be set if eEzsignsignatureType is **Signature**_/_**Initials** and **bIsAutomatic** is false
        should("test sSvg") {
            // uncomment below to test the property
            //modelInstance.sSvg shouldBe ("TODO")
        }

        // to test the property `aObjFile`
        should("test aObjFile") {
            // uncomment below to test the property
            //modelInstance.aObjFile shouldBe ("TODO")
        }

    }
}

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

import eZmaxApi.models.BrandingResponseV3
import eZmaxApi.models.FieldEBrandingAlignlogo
import eZmaxApi.models.FieldEBrandingLogo
import eZmaxApi.models.MultilingualBrandingDescription

class BrandingResponseV3Test : ShouldSpec() {
    init {
        // uncomment below to create an instance of BrandingResponseV3
        //val modelInstance = BrandingResponseV3()

        // to test the property `pkiBrandingID` - The unique ID of the Branding
        should("test pkiBrandingID") {
            // uncomment below to test the property
            //modelInstance.pkiBrandingID shouldBe ("TODO")
        }

        // to test the property `objBrandingDescription`
        should("test objBrandingDescription") {
            // uncomment below to test the property
            //modelInstance.objBrandingDescription shouldBe ("TODO")
        }

        // to test the property `sBrandingDescriptionX` - The Description of the Branding in the language of the requester
        should("test sBrandingDescriptionX") {
            // uncomment below to test the property
            //modelInstance.sBrandingDescriptionX shouldBe ("TODO")
        }

        // to test the property `eBrandingLogo`
        should("test eBrandingLogo") {
            // uncomment below to test the property
            //modelInstance.eBrandingLogo shouldBe ("TODO")
        }

        // to test the property `eBrandingAlignlogo`
        should("test eBrandingAlignlogo") {
            // uncomment below to test the property
            //modelInstance.eBrandingAlignlogo shouldBe ("TODO")
        }

        // to test the property `iBrandingColor` - The primary color. This is a RGB color converted into integer
        should("test iBrandingColor") {
            // uncomment below to test the property
            //modelInstance.iBrandingColor shouldBe ("TODO")
        }

        // to test the property `bBrandingIsactive` - Whether the Branding is active or not
        should("test bBrandingIsactive") {
            // uncomment below to test the property
            //modelInstance.bBrandingIsactive shouldBe ("TODO")
        }

        // to test the property `fkiEmailID` - The unique ID of the Email
        should("test fkiEmailID") {
            // uncomment below to test the property
            //modelInstance.fkiEmailID shouldBe ("TODO")
        }

        // to test the property `sBrandingName` - The name of the Branding  This value will only be set if you wish to overwrite the default name. If you want to keep the default name, leave this property empty
        should("test sBrandingName") {
            // uncomment below to test the property
            //modelInstance.sBrandingName shouldBe ("TODO")
        }

        // to test the property `sEmailAddress` - The email address.
        should("test sEmailAddress") {
            // uncomment below to test the property
            //modelInstance.sEmailAddress shouldBe ("TODO")
        }

    }
}

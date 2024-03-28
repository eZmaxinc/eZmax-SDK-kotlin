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

import eZmaxApi.models.BrandingResponseCompound
import eZmaxApi.models.FieldEBrandingLogo
import eZmaxApi.models.FieldEBrandingLogointerface
import eZmaxApi.models.MultilingualBrandingDescription

class BrandingResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of BrandingResponseCompound
        //val modelInstance = BrandingResponseCompound()

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

        // to test the property `iBrandingColortext` - The color of the text. This is a RGB color converted into integer
        should("test iBrandingColortext") {
            // uncomment below to test the property
            //modelInstance.iBrandingColortext shouldBe ("TODO")
        }

        // to test the property `iBrandingColortextlinkbox` - The color of the text in the link box. This is a RGB color converted into integer
        should("test iBrandingColortextlinkbox") {
            // uncomment below to test the property
            //modelInstance.iBrandingColortextlinkbox shouldBe ("TODO")
        }

        // to test the property `iBrandingColortextbutton` - The color of the text in the button. This is a RGB color converted into integer
        should("test iBrandingColortextbutton") {
            // uncomment below to test the property
            //modelInstance.iBrandingColortextbutton shouldBe ("TODO")
        }

        // to test the property `iBrandingColorbackground` - The color of the background. This is a RGB color converted into integer
        should("test iBrandingColorbackground") {
            // uncomment below to test the property
            //modelInstance.iBrandingColorbackground shouldBe ("TODO")
        }

        // to test the property `iBrandingColorbackgroundbutton` - The color of the background of the button. This is a RGB color converted into integer
        should("test iBrandingColorbackgroundbutton") {
            // uncomment below to test the property
            //modelInstance.iBrandingColorbackgroundbutton shouldBe ("TODO")
        }

        // to test the property `iBrandingColorbackgroundsmallbox` - The color of the background of the small box. This is a RGB color converted into integer
        should("test iBrandingColorbackgroundsmallbox") {
            // uncomment below to test the property
            //modelInstance.iBrandingColorbackgroundsmallbox shouldBe ("TODO")
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

        // to test the property `eBrandingLogointerface`
        should("test eBrandingLogointerface") {
            // uncomment below to test the property
            //modelInstance.eBrandingLogointerface shouldBe ("TODO")
        }

        // to test the property `iBrandingInterfacecolor` - The color of the interface. This is a RGB color converted into integer
        should("test iBrandingInterfacecolor") {
            // uncomment below to test the property
            //modelInstance.iBrandingInterfacecolor shouldBe ("TODO")
        }

        // to test the property `sBrandingLogourl` - The url of the picture used as logo in the Branding
        should("test sBrandingLogourl") {
            // uncomment below to test the property
            //modelInstance.sBrandingLogourl shouldBe ("TODO")
        }

        // to test the property `sBrandingLogointerfaceurl` - The url of the picture used as logo in the Branding
        should("test sBrandingLogointerfaceurl") {
            // uncomment below to test the property
            //modelInstance.sBrandingLogointerfaceurl shouldBe ("TODO")
        }

    }
}

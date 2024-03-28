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

import eZmaxApi.models.BrandingRequest
import eZmaxApi.models.FieldEBrandingLogo
import eZmaxApi.models.FieldEBrandingLogointerface
import eZmaxApi.models.MultilingualBrandingDescription

class BrandingRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of BrandingRequest
        //val modelInstance = BrandingRequest()

        // to test the property `objBrandingDescription`
        should("test objBrandingDescription") {
            // uncomment below to test the property
            //modelInstance.objBrandingDescription shouldBe ("TODO")
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

        // to test the property `pkiBrandingID` - The unique ID of the Branding
        should("test pkiBrandingID") {
            // uncomment below to test the property
            //modelInstance.pkiBrandingID shouldBe ("TODO")
        }

        // to test the property `sBrandingBase64` - The Base64 encoded binary content of the branding logo. This need to match image type selected in eBrandingLogo if you supply an image. If you select 'Default', the logo will be deleted and the default one will be used.
        should("test sBrandingBase64") {
            // uncomment below to test the property
            //modelInstance.sBrandingBase64 shouldBe ("TODO")
        }

        // to test the property `eBrandingLogointerface`
        should("test eBrandingLogointerface") {
            // uncomment below to test the property
            //modelInstance.eBrandingLogointerface shouldBe ("TODO")
        }

        // to test the property `sBrandingLogointerfaceBase64` - The Base64 encoded binary content of the branding logo. This need to match image type selected in eBrandingLogointerface if you supply an image. If you select 'Default', the logo will be deleted and the default one will be used.
        should("test sBrandingLogointerfaceBase64") {
            // uncomment below to test the property
            //modelInstance.sBrandingLogointerfaceBase64 shouldBe ("TODO")
        }

        // to test the property `iBrandingInterfacecolor` - The color of the interface. This is a RGB color converted into integer
        should("test iBrandingInterfacecolor") {
            // uncomment below to test the property
            //modelInstance.iBrandingInterfacecolor shouldBe ("TODO")
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
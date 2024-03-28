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

import eZmaxApi.models.BrandingListElement

class BrandingListElementTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of BrandingListElement
        //val modelInstance = BrandingListElement()

        // to test the property `pkiBrandingID` - The unique ID of the Branding
        should("test pkiBrandingID") {
            // uncomment below to test the property
            //modelInstance.pkiBrandingID shouldBe ("TODO")
        }

        // to test the property `sBrandingDescriptionX` - The Description of the Branding in the language of the requester
        should("test sBrandingDescriptionX") {
            // uncomment below to test the property
            //modelInstance.sBrandingDescriptionX shouldBe ("TODO")
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

    }
}
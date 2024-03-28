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

import eZmaxApi.models.EzsignpageResponse

class EzsignpageResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignpageResponse
        //val modelInstance = EzsignpageResponse()

        // to test the property `pkiEzsignpageID` - The unique ID of the Ezsignpage
        should("test pkiEzsignpageID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignpageID shouldBe ("TODO")
        }

        // to test the property `iEzsignpageWidthimage` - The Width of the page's image in pixels calculated at 100 DPI
        should("test iEzsignpageWidthimage") {
            // uncomment below to test the property
            //modelInstance.iEzsignpageWidthimage shouldBe ("TODO")
        }

        // to test the property `iEzsignpageHeightimage` - The Height of the page's image in pixels calculated at 100 DPI
        should("test iEzsignpageHeightimage") {
            // uncomment below to test the property
            //modelInstance.iEzsignpageHeightimage shouldBe ("TODO")
        }

        // to test the property `iEzsignpageWidthpdf` - The Width of the page in points calculated at 72 DPI
        should("test iEzsignpageWidthpdf") {
            // uncomment below to test the property
            //modelInstance.iEzsignpageWidthpdf shouldBe ("TODO")
        }

        // to test the property `iEzsignpageHeightpdf` - The Height of the page in points calculated at 72 DPI
        should("test iEzsignpageHeightpdf") {
            // uncomment below to test the property
            //modelInstance.iEzsignpageHeightpdf shouldBe ("TODO")
        }

        // to test the property `iEzsignpagePagenumber` - The page number in the Ezsigndocument
        should("test iEzsignpagePagenumber") {
            // uncomment below to test the property
            //modelInstance.iEzsignpagePagenumber shouldBe ("TODO")
        }

        // to test the property `sComputedImageurl` - The Url to the Ezsignpage's rasterized image.  Url will expire after 5 minutes.
        should("test sComputedImageurl") {
            // uncomment below to test the property
            //modelInstance.sComputedImageurl shouldBe ("TODO")
        }

    }
}

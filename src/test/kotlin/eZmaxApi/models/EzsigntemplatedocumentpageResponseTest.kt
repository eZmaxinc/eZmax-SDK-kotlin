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

import eZmaxApi.models.EzsigntemplatedocumentpageResponse

class EzsigntemplatedocumentpageResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplatedocumentpageResponse
        //val modelInstance = EzsigntemplatedocumentpageResponse()

        // to test the property `pkiEzsigntemplatedocumentpageID` - The unique ID of the Ezsigntemplatedocumentpage
        should("test pkiEzsigntemplatedocumentpageID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigntemplatedocumentpageID shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatedocumentpageWidthimage` - The Width of the page's image in pixels calculated at 100 DPI
        should("test iEzsigntemplatedocumentpageWidthimage") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatedocumentpageWidthimage shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatedocumentpageHeightimage` - The Height of the page's image in pixels calculated at 100 DPI
        should("test iEzsigntemplatedocumentpageHeightimage") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatedocumentpageHeightimage shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatedocumentpageWidthpdf` - The Width of the page in points calculated at 72 DPI
        should("test iEzsigntemplatedocumentpageWidthpdf") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatedocumentpageWidthpdf shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatedocumentpageHeightpdf` - The Height of the page in points calculated at 72 DPI
        should("test iEzsigntemplatedocumentpageHeightpdf") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatedocumentpageHeightpdf shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplatedocumentpagePagenumber` - The page number in the Ezsigntemplatedocument
        should("test iEzsigntemplatedocumentpagePagenumber") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatedocumentpagePagenumber shouldBe ("TODO")
        }

        // to test the property `sComputedImageurl` - The Url to the Ezsigntemplatedocumentpage's rasterized image.  Url will expire after 5 minutes.
        should("test sComputedImageurl") {
            // uncomment below to test the property
            //modelInstance.sComputedImageurl shouldBe ("TODO")
        }

    }
}

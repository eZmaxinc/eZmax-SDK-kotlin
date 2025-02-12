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

import eZmaxApi.models.EzsigndocumentExtractTextV1Request

class EzsigndocumentExtractTextV1RequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigndocumentExtractTextV1Request
        //val modelInstance = EzsigndocumentExtractTextV1Request()

        // to test the property `iPage` - The page where the area is located
        should("test iPage") {
            // uncomment below to test the property
            //modelInstance.iPage shouldBe ("TODO")
        }

        // to test the property `eSection` - The section of the page
        should("test eSection") {
            // uncomment below to test the property
            //modelInstance.eSection shouldBe ("TODO")
        }

        // to test the property `iX` - The X coordinate (Horizontal). Require when eSection = 'Region' or eSection is not set.
        should("test iX") {
            // uncomment below to test the property
            //modelInstance.iX shouldBe ("TODO")
        }

        // to test the property `iY` - The Y coordinate (Vertical). Require when eSection = 'Region' or eSection is not set.
        should("test iY") {
            // uncomment below to test the property
            //modelInstance.iY shouldBe ("TODO")
        }

        // to test the property `iWidth` - Area's width. Require when eSection = 'Region' or eSection is not set.
        should("test iWidth") {
            // uncomment below to test the property
            //modelInstance.iWidth shouldBe ("TODO")
        }

        // to test the property `iHeight` - Area's height. Require when eSection = 'Region' or eSection is not set.
        should("test iHeight") {
            // uncomment below to test the property
            //modelInstance.iHeight shouldBe ("TODO")
        }

    }
}

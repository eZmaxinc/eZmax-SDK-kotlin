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

import eZmaxApi.models.CustomWordPositionOccurenceResponse

class CustomWordPositionOccurenceResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomWordPositionOccurenceResponse
        //val modelInstance = CustomWordPositionOccurenceResponse()

        // to test the property `iPage` - The page where the word occurence was found
        should("test iPage") {
            // uncomment below to test the property
            //modelInstance.iPage shouldBe ("TODO")
        }

        // to test the property `iX` - The X coordinate (Horizontal) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).
        should("test iX") {
            // uncomment below to test the property
            //modelInstance.iX shouldBe ("TODO")
        }

        // to test the property `iY` - The Y coordinate (Vertical) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).
        should("test iY") {
            // uncomment below to test the property
            //modelInstance.iY shouldBe ("TODO")
        }

    }
}
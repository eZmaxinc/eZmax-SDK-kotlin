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

import eZmaxApi.models.GlaccountAutocompleteElementResponse

class GlaccountAutocompleteElementResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GlaccountAutocompleteElementResponse
        //val modelInstance = GlaccountAutocompleteElementResponse()

        // to test the property `pkiGlaccountID` - The unique ID of the Glaccount
        should("test pkiGlaccountID") {
            // uncomment below to test the property
            //modelInstance.pkiGlaccountID shouldBe ("TODO")
        }

        // to test the property `iGlaccountCode` - The Code of the Glaccount
        should("test iGlaccountCode") {
            // uncomment below to test the property
            //modelInstance.iGlaccountCode shouldBe ("TODO")
        }

        // to test the property `sGlaccountDescriptionX` - The Description for the Glaccount in the language of the requester
        should("test sGlaccountDescriptionX") {
            // uncomment below to test the property
            //modelInstance.sGlaccountDescriptionX shouldBe ("TODO")
        }

        // to test the property `bGlaccountIsactive` - Whether the Glaccount is active or not
        should("test bGlaccountIsactive") {
            // uncomment below to test the property
            //modelInstance.bGlaccountIsactive shouldBe ("TODO")
        }

    }
}

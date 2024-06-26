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

import eZmaxApi.models.TimezoneAutocompleteElementResponse

class TimezoneAutocompleteElementResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TimezoneAutocompleteElementResponse
        //val modelInstance = TimezoneAutocompleteElementResponse()

        // to test the property `sTimezoneName` - The description of the Timezone
        should("test sTimezoneName") {
            // uncomment below to test the property
            //modelInstance.sTimezoneName shouldBe ("TODO")
        }

        // to test the property `pkiTimezoneID` - The unique ID of the Timezone
        should("test pkiTimezoneID") {
            // uncomment below to test the property
            //modelInstance.pkiTimezoneID shouldBe ("TODO")
        }

        // to test the property `bTimezoneIsactive` - Whether the Timezone is active or not
        should("test bTimezoneIsactive") {
            // uncomment below to test the property
            //modelInstance.bTimezoneIsactive shouldBe ("TODO")
        }

    }
}

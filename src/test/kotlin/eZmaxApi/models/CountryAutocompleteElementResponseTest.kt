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

import eZmaxApi.models.CountryAutocompleteElementResponse

class CountryAutocompleteElementResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CountryAutocompleteElementResponse
        //val modelInstance = CountryAutocompleteElementResponse()

        // to test the property `pkiCountryID` - The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States|
        should("test pkiCountryID") {
            // uncomment below to test the property
            //modelInstance.pkiCountryID shouldBe ("TODO")
        }

        // to test the property `sCountryNameX` - The name of the Country in the language of the requester
        should("test sCountryNameX") {
            // uncomment below to test the property
            //modelInstance.sCountryNameX shouldBe ("TODO")
        }

        // to test the property `sCountryShortname` - The shortname of the Country
        should("test sCountryShortname") {
            // uncomment below to test the property
            //modelInstance.sCountryShortname shouldBe ("TODO")
        }

        // to test the property `bCountryIsactive` - Whether the Country is active or not
        should("test bCountryIsactive") {
            // uncomment below to test the property
            //modelInstance.bCountryIsactive shouldBe ("TODO")
        }

    }
}

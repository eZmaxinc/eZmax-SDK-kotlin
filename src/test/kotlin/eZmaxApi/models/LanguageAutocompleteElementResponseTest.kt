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

import eZmaxApi.models.LanguageAutocompleteElementResponse

class LanguageAutocompleteElementResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of LanguageAutocompleteElementResponse
        //val modelInstance = LanguageAutocompleteElementResponse()

        // to test the property `pkiLanguageID` - The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
        should("test pkiLanguageID") {
            // uncomment below to test the property
            //modelInstance.pkiLanguageID shouldBe ("TODO")
        }

        // to test the property `sLanguageNameX` - The Name of the Language in the language of the requester
        should("test sLanguageNameX") {
            // uncomment below to test the property
            //modelInstance.sLanguageNameX shouldBe ("TODO")
        }

        // to test the property `bLanguageIsactive` - Whether the Language is active or not
        should("test bLanguageIsactive") {
            // uncomment below to test the property
            //modelInstance.bLanguageIsactive shouldBe ("TODO")
        }

    }
}

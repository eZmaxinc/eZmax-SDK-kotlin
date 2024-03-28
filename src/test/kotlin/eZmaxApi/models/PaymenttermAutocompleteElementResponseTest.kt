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

import eZmaxApi.models.PaymenttermAutocompleteElementResponse

class PaymenttermAutocompleteElementResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of PaymenttermAutocompleteElementResponse
        //val modelInstance = PaymenttermAutocompleteElementResponse()

        // to test the property `pkiPaymenttermID` - The unique ID of the Paymentterm
        should("test pkiPaymenttermID") {
            // uncomment below to test the property
            //modelInstance.pkiPaymenttermID shouldBe ("TODO")
        }

        // to test the property `sPaymenttermDescriptionX` - The description of the Paymentterm in the language of the requester
        should("test sPaymenttermDescriptionX") {
            // uncomment below to test the property
            //modelInstance.sPaymenttermDescriptionX shouldBe ("TODO")
        }

        // to test the property `bPaymenttermIsactive` - Whether the Paymentterm is active or not
        should("test bPaymenttermIsactive") {
            // uncomment below to test the property
            //modelInstance.bPaymenttermIsactive shouldBe ("TODO")
        }

    }
}
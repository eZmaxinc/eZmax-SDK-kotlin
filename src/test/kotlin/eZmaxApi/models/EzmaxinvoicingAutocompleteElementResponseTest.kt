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

import eZmaxApi.models.EzmaxinvoicingAutocompleteElementResponse

class EzmaxinvoicingAutocompleteElementResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzmaxinvoicingAutocompleteElementResponse
        //val modelInstance = EzmaxinvoicingAutocompleteElementResponse()

        // to test the property `yyyymmEzmaxinvoicing` - The YYYYMM period of the Ezmaxinvoicing
        should("test yyyymmEzmaxinvoicing") {
            // uncomment below to test the property
            //modelInstance.yyyymmEzmaxinvoicing shouldBe ("TODO")
        }

        // to test the property `pkiEzmaxinvoicingID` - The unique ID of the Ezmaxinvoicing
        should("test pkiEzmaxinvoicingID") {
            // uncomment below to test the property
            //modelInstance.pkiEzmaxinvoicingID shouldBe ("TODO")
        }

        // to test the property `bEzmaxinvoicingIsactive` - Whether the Ezmaxinvoicing is active or not
        should("test bEzmaxinvoicingIsactive") {
            // uncomment below to test the property
            //modelInstance.bEzmaxinvoicingIsactive shouldBe ("TODO")
        }

    }
}

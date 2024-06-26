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

import eZmaxApi.models.CreditcardtypeAutocompleteElementResponse
import eZmaxApi.models.FieldECreditcardtypeCodename

class CreditcardtypeAutocompleteElementResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreditcardtypeAutocompleteElementResponse
        //val modelInstance = CreditcardtypeAutocompleteElementResponse()

        // to test the property `sCreditcardtypeName` - The name of the Creditcardtype
        should("test sCreditcardtypeName") {
            // uncomment below to test the property
            //modelInstance.sCreditcardtypeName shouldBe ("TODO")
        }

        // to test the property `pkiCreditcardtypeID` - The unique ID of the Creditcardtype
        should("test pkiCreditcardtypeID") {
            // uncomment below to test the property
            //modelInstance.pkiCreditcardtypeID shouldBe ("TODO")
        }

        // to test the property `eCreditcardtypeCodename`
        should("test eCreditcardtypeCodename") {
            // uncomment below to test the property
            //modelInstance.eCreditcardtypeCodename shouldBe ("TODO")
        }

    }
}

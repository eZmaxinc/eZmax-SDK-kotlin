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

import eZmaxApi.models.BillingentityinternalproductResponseCompound

class BillingentityinternalproductResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of BillingentityinternalproductResponseCompound
        //val modelInstance = BillingentityinternalproductResponseCompound()

        // to test the property `pkiBillingentityinternalproductID` - The unique ID of the Billingentityinternalproduct
        should("test pkiBillingentityinternalproductID") {
            // uncomment below to test the property
            //modelInstance.pkiBillingentityinternalproductID shouldBe ("TODO")
        }

        // to test the property `fkiBillingentityinternalID` - The unique ID of the Billingentityinternal.
        should("test fkiBillingentityinternalID") {
            // uncomment below to test the property
            //modelInstance.fkiBillingentityinternalID shouldBe ("TODO")
        }

        // to test the property `sBillingentityinternalDescriptionX` - The description of the Billingentityinternal in the language of the requester
        should("test sBillingentityinternalDescriptionX") {
            // uncomment below to test the property
            //modelInstance.sBillingentityinternalDescriptionX shouldBe ("TODO")
        }

        // to test the property `fkiEzmaxproductID` - The unique ID of the Ezmaxproduct
        should("test fkiEzmaxproductID") {
            // uncomment below to test the property
            //modelInstance.fkiEzmaxproductID shouldBe ("TODO")
        }

        // to test the property `sEzmaxproductDescriptionX` - The description of the Ezmaxproduct in the language of the requester
        should("test sEzmaxproductDescriptionX") {
            // uncomment below to test the property
            //modelInstance.sEzmaxproductDescriptionX shouldBe ("TODO")
        }

        // to test the property `fkiBillingentityexternalID` - The unique ID of the Billingentityexternal
        should("test fkiBillingentityexternalID") {
            // uncomment below to test the property
            //modelInstance.fkiBillingentityexternalID shouldBe ("TODO")
        }

        // to test the property `sBillingentityexternalDescription` - The description of the Billingentityexternal
        should("test sBillingentityexternalDescription") {
            // uncomment below to test the property
            //modelInstance.sBillingentityexternalDescription shouldBe ("TODO")
        }

    }
}

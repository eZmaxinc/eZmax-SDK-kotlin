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

import eZmaxApi.models.CreditcardclientRequest
import eZmaxApi.models.CreditcarddetailRequest

class CreditcardclientRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreditcardclientRequest
        //val modelInstance = CreditcardclientRequest()

        // to test the property `bCreditcardclientrelationIsdefault` - Whether if it's an relationisdefault
        should("test bCreditcardclientrelationIsdefault") {
            // uncomment below to test the property
            //modelInstance.bCreditcardclientrelationIsdefault shouldBe ("TODO")
        }

        // to test the property `sCreditcardclientDescription` - The description of the Creditcardclient
        should("test sCreditcardclientDescription") {
            // uncomment below to test the property
            //modelInstance.sCreditcardclientDescription shouldBe ("TODO")
        }

        // to test the property `bCreditcardclientIsactive` - Whether the creditcardclient is active or not
        should("test bCreditcardclientIsactive") {
            // uncomment below to test the property
            //modelInstance.bCreditcardclientIsactive shouldBe ("TODO")
        }

        // to test the property `bCreditcardclientAllowedagencypayment` - Whether if it's an allowedagencypayment
        should("test bCreditcardclientAllowedagencypayment") {
            // uncomment below to test the property
            //modelInstance.bCreditcardclientAllowedagencypayment shouldBe ("TODO")
        }

        // to test the property `bCreditcardclientAllowedroyallepageprotection` - Whether if it's an allowedroyallepageprotection
        should("test bCreditcardclientAllowedroyallepageprotection") {
            // uncomment below to test the property
            //modelInstance.bCreditcardclientAllowedroyallepageprotection shouldBe ("TODO")
        }

        // to test the property `bCreditcardclientAllowedtranquillit` - Whether if it's an allowedtranquillit
        should("test bCreditcardclientAllowedtranquillit") {
            // uncomment below to test the property
            //modelInstance.bCreditcardclientAllowedtranquillit shouldBe ("TODO")
        }

        // to test the property `objCreditcarddetail`
        should("test objCreditcarddetail") {
            // uncomment below to test the property
            //modelInstance.objCreditcarddetail shouldBe ("TODO")
        }

        // to test the property `sCreditcardclientCVV` - The creditcard card CVV
        should("test sCreditcardclientCVV") {
            // uncomment below to test the property
            //modelInstance.sCreditcardclientCVV shouldBe ("TODO")
        }

        // to test the property `pkiCreditcardclientID` - The unique ID of the Creditcardclient
        should("test pkiCreditcardclientID") {
            // uncomment below to test the property
            //modelInstance.pkiCreditcardclientID shouldBe ("TODO")
        }

        // to test the property `fksCreditcardtokenID` - The creditcard token identifier
        should("test fksCreditcardtokenID") {
            // uncomment below to test the property
            //modelInstance.fksCreditcardtokenID shouldBe ("TODO")
        }

    }
}

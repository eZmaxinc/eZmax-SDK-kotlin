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

import eZmaxApi.models.PaymenttermResponse
import eZmaxApi.models.CommonAudit
import eZmaxApi.models.FieldEPaymenttermType
import eZmaxApi.models.MultilingualPaymenttermDescription

class PaymenttermResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of PaymenttermResponse
        //val modelInstance = PaymenttermResponse()

        // to test the property `pkiPaymenttermID` - The unique ID of the Paymentterm
        should("test pkiPaymenttermID") {
            // uncomment below to test the property
            //modelInstance.pkiPaymenttermID shouldBe ("TODO")
        }

        // to test the property `sPaymenttermCode` - The code of the Paymentterm
        should("test sPaymenttermCode") {
            // uncomment below to test the property
            //modelInstance.sPaymenttermCode shouldBe ("TODO")
        }

        // to test the property `ePaymenttermType`
        should("test ePaymenttermType") {
            // uncomment below to test the property
            //modelInstance.ePaymenttermType shouldBe ("TODO")
        }

        // to test the property `iPaymenttermDay` - The day of the Paymentterm
        should("test iPaymenttermDay") {
            // uncomment below to test the property
            //modelInstance.iPaymenttermDay shouldBe ("TODO")
        }

        // to test the property `objPaymenttermDescription`
        should("test objPaymenttermDescription") {
            // uncomment below to test the property
            //modelInstance.objPaymenttermDescription shouldBe ("TODO")
        }

        // to test the property `bPaymenttermIsactive` - Whether the Paymentterm is active or not
        should("test bPaymenttermIsactive") {
            // uncomment below to test the property
            //modelInstance.bPaymenttermIsactive shouldBe ("TODO")
        }

        // to test the property `objAudit`
        should("test objAudit") {
            // uncomment below to test the property
            //modelInstance.objAudit shouldBe ("TODO")
        }

    }
}
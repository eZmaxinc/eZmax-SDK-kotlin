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

import eZmaxApi.models.PhoneRequest
import eZmaxApi.models.FieldEPhoneType

class PhoneRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of PhoneRequest
        //val modelInstance = PhoneRequest()

        // to test the property `fkiPhonetypeID` - The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free|
        should("test fkiPhonetypeID") {
            // uncomment below to test the property
            //modelInstance.fkiPhonetypeID shouldBe ("TODO")
        }

        // to test the property `pkiPhoneID` - The unique ID of the Phone.
        should("test pkiPhoneID") {
            // uncomment below to test the property
            //modelInstance.pkiPhoneID shouldBe ("TODO")
        }

        // to test the property `ePhoneType`
        should("test ePhoneType") {
            // uncomment below to test the property
            //modelInstance.ePhoneType shouldBe ("TODO")
        }

        // to test the property `sPhoneRegion` - The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123
        should("test sPhoneRegion") {
            // uncomment below to test the property
            //modelInstance.sPhoneRegion shouldBe ("TODO")
        }

        // to test the property `sPhoneExchange` - The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123
        should("test sPhoneExchange") {
            // uncomment below to test the property
            //modelInstance.sPhoneExchange shouldBe ("TODO")
        }

        // to test the property `sPhoneNumber` - The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123
        should("test sPhoneNumber") {
            // uncomment below to test the property
            //modelInstance.sPhoneNumber shouldBe ("TODO")
        }

        // to test the property `sPhoneInternational` - The international phone number.
        should("test sPhoneInternational") {
            // uncomment below to test the property
            //modelInstance.sPhoneInternational shouldBe ("TODO")
        }

        // to test the property `sPhoneExtension` - The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
        should("test sPhoneExtension") {
            // uncomment below to test the property
            //modelInstance.sPhoneExtension shouldBe ("TODO")
        }

        // to test the property `sPhoneE164` - A phone number in E.164 Format
        should("test sPhoneE164") {
            // uncomment below to test the property
            //modelInstance.sPhoneE164 shouldBe ("TODO")
        }

    }
}

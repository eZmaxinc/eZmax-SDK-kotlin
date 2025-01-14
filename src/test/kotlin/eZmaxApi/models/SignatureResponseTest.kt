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

import eZmaxApi.models.SignatureResponse

class SignatureResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SignatureResponse
        //val modelInstance = SignatureResponse()

        // to test the property `pkiSignatureID` - The unique ID of the Signature
        should("test pkiSignatureID") {
            // uncomment below to test the property
            //modelInstance.pkiSignatureID shouldBe ("TODO")
        }

        // to test the property `fkiFontID` - The unique ID of the Font
        should("test fkiFontID") {
            // uncomment below to test the property
            //modelInstance.fkiFontID shouldBe ("TODO")
        }

        // to test the property `sSignatureUrl` - The URL of the SVG file for the Signature
        should("test sSignatureUrl") {
            // uncomment below to test the property
            //modelInstance.sSignatureUrl shouldBe ("TODO")
        }

        // to test the property `sSignatureUrlinitials` - The URL of the SVG file for the Initials
        should("test sSignatureUrlinitials") {
            // uncomment below to test the property
            //modelInstance.sSignatureUrlinitials shouldBe ("TODO")
        }

    }
}

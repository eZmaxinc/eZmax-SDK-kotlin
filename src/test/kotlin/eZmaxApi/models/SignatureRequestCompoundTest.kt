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

import eZmaxApi.models.SignatureRequestCompound

class SignatureRequestCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SignatureRequestCompound
        //val modelInstance = SignatureRequestCompound()

        // to test the property `tSignatureSvg` - The svg of the Signature
        should("test tSignatureSvg") {
            // uncomment below to test the property
            //modelInstance.tSignatureSvg shouldBe ("TODO")
        }

        // to test the property `pkiSignatureID` - The unique ID of the Signature
        should("test pkiSignatureID") {
            // uncomment below to test the property
            //modelInstance.pkiSignatureID shouldBe ("TODO")
        }

    }
}

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

import eZmaxApi.models.CommonResponseWarning

class CommonResponseWarningTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CommonResponseWarning
        //val modelInstance = CommonResponseWarning()

        // to test the property `sWarningMessage` - More detail about the warning
        should("test sWarningMessage") {
            // uncomment below to test the property
            //modelInstance.sWarningMessage shouldBe ("TODO")
        }

        // to test the property `eWarningCode` - The warning code. See documentation for valid values
        should("test eWarningCode") {
            // uncomment below to test the property
            //modelInstance.eWarningCode shouldBe ("TODO")
        }

    }
}
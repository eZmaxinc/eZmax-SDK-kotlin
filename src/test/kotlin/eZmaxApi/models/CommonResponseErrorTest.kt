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

import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.FieldEErrorCode

class CommonResponseErrorTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CommonResponseError
        //val modelInstance = CommonResponseError()

        // to test the property `sErrorMessage` - The message giving details about the error
        should("test sErrorMessage") {
            // uncomment below to test the property
            //modelInstance.sErrorMessage shouldBe ("TODO")
        }

        // to test the property `eErrorCode`
        should("test eErrorCode") {
            // uncomment below to test the property
            //modelInstance.eErrorCode shouldBe ("TODO")
        }

    }
}
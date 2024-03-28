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

import eZmaxApi.models.ScimServiceProviderConfigBulk

class ScimServiceProviderConfigBulkTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ScimServiceProviderConfigBulk
        //val modelInstance = ScimServiceProviderConfigBulk()

        // to test the property `supported` - A Boolean value specifying whether or not the operation is supported.
        should("test supported") {
            // uncomment below to test the property
            //modelInstance.supported shouldBe ("TODO")
        }

        // to test the property `maxOperations` - An integer value specifying the maximum number of operations.
        should("test maxOperations") {
            // uncomment below to test the property
            //modelInstance.maxOperations shouldBe ("TODO")
        }

        // to test the property `maxPayloadSize` - An integer value specifying the maximum payload size in bytes.
        should("test maxPayloadSize") {
            // uncomment below to test the property
            //modelInstance.maxPayloadSize shouldBe ("TODO")
        }

    }
}

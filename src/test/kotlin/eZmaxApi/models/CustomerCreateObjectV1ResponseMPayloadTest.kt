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

import eZmaxApi.models.CustomerCreateObjectV1ResponseMPayload

class CustomerCreateObjectV1ResponseMPayloadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomerCreateObjectV1ResponseMPayload
        //val modelInstance = CustomerCreateObjectV1ResponseMPayload()

        // to test the property `aPkiCustomerID` - An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
        should("test aPkiCustomerID") {
            // uncomment below to test the property
            //modelInstance.aPkiCustomerID shouldBe ("TODO")
        }

    }
}

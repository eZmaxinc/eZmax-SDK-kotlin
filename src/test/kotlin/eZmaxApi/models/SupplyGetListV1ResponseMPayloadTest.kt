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

import eZmaxApi.models.SupplyGetListV1ResponseMPayload
import eZmaxApi.models.SupplyListElement

class SupplyGetListV1ResponseMPayloadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SupplyGetListV1ResponseMPayload
        //val modelInstance = SupplyGetListV1ResponseMPayload()

        // to test the property `iRowReturned` - The number of rows returned
        should("test iRowReturned") {
            // uncomment below to test the property
            //modelInstance.iRowReturned shouldBe ("TODO")
        }

        // to test the property `iRowFiltered` - The number of rows matching your filters (if any) or the total number of rows
        should("test iRowFiltered") {
            // uncomment below to test the property
            //modelInstance.iRowFiltered shouldBe ("TODO")
        }

        // to test the property `aObjSupply`
        should("test aObjSupply") {
            // uncomment below to test the property
            //modelInstance.aObjSupply shouldBe ("TODO")
        }

    }
}

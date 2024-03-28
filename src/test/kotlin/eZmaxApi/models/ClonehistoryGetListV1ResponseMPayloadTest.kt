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

import eZmaxApi.models.ClonehistoryGetListV1ResponseMPayload
import eZmaxApi.models.ClonehistoryListElement

class ClonehistoryGetListV1ResponseMPayloadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ClonehistoryGetListV1ResponseMPayload
        //val modelInstance = ClonehistoryGetListV1ResponseMPayload()

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

        // to test the property `aObjClonehistory`
        should("test aObjClonehistory") {
            // uncomment below to test the property
            //modelInstance.aObjClonehistory shouldBe ("TODO")
        }

    }
}
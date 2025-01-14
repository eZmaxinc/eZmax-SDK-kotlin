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

import eZmaxApi.models.EzsignannotationCreateObjectV1ResponseMPayload

class EzsignannotationCreateObjectV1ResponseMPayloadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignannotationCreateObjectV1ResponseMPayload
        //val modelInstance = EzsignannotationCreateObjectV1ResponseMPayload()

        // to test the property `aPkiEzsignannotationID` - An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
        should("test aPkiEzsignannotationID") {
            // uncomment below to test the property
            //modelInstance.aPkiEzsignannotationID shouldBe ("TODO")
        }

    }
}

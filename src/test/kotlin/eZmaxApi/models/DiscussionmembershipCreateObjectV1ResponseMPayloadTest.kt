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

import eZmaxApi.models.DiscussionmembershipCreateObjectV1ResponseMPayload

class DiscussionmembershipCreateObjectV1ResponseMPayloadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of DiscussionmembershipCreateObjectV1ResponseMPayload
        //val modelInstance = DiscussionmembershipCreateObjectV1ResponseMPayload()

        // to test the property `aPkiDiscussionmembershipID` - An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
        should("test aPkiDiscussionmembershipID") {
            // uncomment below to test the property
            //modelInstance.aPkiDiscussionmembershipID shouldBe ("TODO")
        }

    }
}
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

import eZmaxApi.models.EzsignsignergroupmembershipCreateObjectV1ResponseMPayload

class EzsignsignergroupmembershipCreateObjectV1ResponseMPayloadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignsignergroupmembershipCreateObjectV1ResponseMPayload
        //val modelInstance = EzsignsignergroupmembershipCreateObjectV1ResponseMPayload()

        // to test the property `aPkiEzsignsignergroupmembershipID` - An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
        should("test aPkiEzsignsignergroupmembershipID") {
            // uncomment below to test the property
            //modelInstance.aPkiEzsignsignergroupmembershipID shouldBe ("TODO")
        }

    }
}

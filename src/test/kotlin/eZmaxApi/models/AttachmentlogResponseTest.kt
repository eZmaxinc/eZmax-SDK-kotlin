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

import eZmaxApi.models.AttachmentlogResponse
import eZmaxApi.models.FieldEAttachmentlogType

class AttachmentlogResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AttachmentlogResponse
        //val modelInstance = AttachmentlogResponse()

        // to test the property `fkiAttachmentID` - The unique ID of the Attachment.
        should("test fkiAttachmentID") {
            // uncomment below to test the property
            //modelInstance.fkiAttachmentID shouldBe ("TODO")
        }

        // to test the property `fkiUserID` - The unique ID of the User
        should("test fkiUserID") {
            // uncomment below to test the property
            //modelInstance.fkiUserID shouldBe ("TODO")
        }

        // to test the property `dtAttachmentlogDatetime` - The created date
        should("test dtAttachmentlogDatetime") {
            // uncomment below to test the property
            //modelInstance.dtAttachmentlogDatetime shouldBe ("TODO")
        }

        // to test the property `eAttachmentlogType`
        should("test eAttachmentlogType") {
            // uncomment below to test the property
            //modelInstance.eAttachmentlogType shouldBe ("TODO")
        }

        // to test the property `sAttachmentlogDetail` - The additionnal detail
        should("test sAttachmentlogDetail") {
            // uncomment below to test the property
            //modelInstance.sAttachmentlogDetail shouldBe ("TODO")
        }

    }
}

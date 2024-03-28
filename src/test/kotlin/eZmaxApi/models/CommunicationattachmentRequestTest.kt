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

import eZmaxApi.models.CommunicationattachmentRequest

class CommunicationattachmentRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CommunicationattachmentRequest
        //val modelInstance = CommunicationattachmentRequest()

        // to test the property `pkiCommunicationattachmentID` - The unique ID of the Communicationattachment
        should("test pkiCommunicationattachmentID") {
            // uncomment below to test the property
            //modelInstance.pkiCommunicationattachmentID shouldBe ("TODO")
        }

        // to test the property `fkiAttachmentID` - The unique ID of the Attachment.
        should("test fkiAttachmentID") {
            // uncomment below to test the property
            //modelInstance.fkiAttachmentID shouldBe ("TODO")
        }

        // to test the property `fkiInvoiceID` - The unique ID of the Invoice.
        should("test fkiInvoiceID") {
            // uncomment below to test the property
            //modelInstance.fkiInvoiceID shouldBe ("TODO")
        }

        // to test the property `fkiSalarypreparationID` - The unique ID of the Salarypreparation.
        should("test fkiSalarypreparationID") {
            // uncomment below to test the property
            //modelInstance.fkiSalarypreparationID shouldBe ("TODO")
        }

    }
}

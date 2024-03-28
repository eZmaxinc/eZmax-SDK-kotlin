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

package eZmaxApi.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import eZmaxApi.apis.ObjectInvoiceApi
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.InvoiceGetAttachmentsV1Response
import eZmaxApi.models.InvoiceGetCommunicationListV1Response

class ObjectInvoiceApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectInvoiceApi
        //val apiInstance = ObjectInvoiceApi()

        // to test invoiceGetAttachmentsV1
        should("test invoiceGetAttachmentsV1") {
            // uncomment below to test invoiceGetAttachmentsV1
            //val pkiInvoiceID : kotlin.Int = 56 // kotlin.Int | 
            //val result : InvoiceGetAttachmentsV1Response = apiInstance.invoiceGetAttachmentsV1(pkiInvoiceID)
            //result shouldBe ("TODO")
        }

        // to test invoiceGetCommunicationListV1
        should("test invoiceGetCommunicationListV1") {
            // uncomment below to test invoiceGetCommunicationListV1
            //val pkiInvoiceID : kotlin.Int = 56 // kotlin.Int | 
            //val result : InvoiceGetCommunicationListV1Response = apiInstance.invoiceGetCommunicationListV1(pkiInvoiceID)
            //result shouldBe ("TODO")
        }

    }
}

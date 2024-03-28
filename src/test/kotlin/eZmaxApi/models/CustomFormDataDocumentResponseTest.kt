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

import eZmaxApi.models.CustomFormDataDocumentResponse
import eZmaxApi.models.CustomFormDataSignerResponse

class CustomFormDataDocumentResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomFormDataDocumentResponse
        //val modelInstance = CustomFormDataDocumentResponse()

        // to test the property `pkiEzsigndocumentID` - The unique ID of the Ezsigndocument
        should("test pkiEzsigndocumentID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigndocumentID shouldBe ("TODO")
        }

        // to test the property `fkiEzsignfolderID` - The unique ID of the Ezsignfolder
        should("test fkiEzsignfolderID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfolderID shouldBe ("TODO")
        }

        // to test the property `sEzsigndocumentName` - The name of the document that will be presented to Ezsignfoldersignerassociations
        should("test sEzsigndocumentName") {
            // uncomment below to test the property
            //modelInstance.sEzsigndocumentName shouldBe ("TODO")
        }

        // to test the property `dtModifiedDate` - The date and time at which the object was last modified
        should("test dtModifiedDate") {
            // uncomment below to test the property
            //modelInstance.dtModifiedDate shouldBe ("TODO")
        }

        // to test the property `aObjFormDataSigner`
        should("test aObjFormDataSigner") {
            // uncomment below to test the property
            //modelInstance.aObjFormDataSigner shouldBe ("TODO")
        }

    }
}

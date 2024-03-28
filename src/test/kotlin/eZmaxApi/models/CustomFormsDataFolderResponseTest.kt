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

import eZmaxApi.models.CustomFormsDataFolderResponse
import eZmaxApi.models.CustomFormDataDocumentResponse

class CustomFormsDataFolderResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomFormsDataFolderResponse
        //val modelInstance = CustomFormsDataFolderResponse()

        // to test the property `pkiEzsignfolderID` - The unique ID of the Ezsignfolder
        should("test pkiEzsignfolderID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignfolderID shouldBe ("TODO")
        }

        // to test the property `sEzsignfolderDescription` - The description of the Ezsignfolder
        should("test sEzsignfolderDescription") {
            // uncomment below to test the property
            //modelInstance.sEzsignfolderDescription shouldBe ("TODO")
        }

        // to test the property `aObjFormDataDocument`
        should("test aObjFormDataDocument") {
            // uncomment below to test the property
            //modelInstance.aObjFormDataDocument shouldBe ("TODO")
        }

    }
}

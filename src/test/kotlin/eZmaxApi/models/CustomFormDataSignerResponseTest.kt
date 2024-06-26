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

import eZmaxApi.models.CustomFormDataSignerResponse
import eZmaxApi.models.CustomFormDataEzsignformfieldgroupResponse

class CustomFormDataSignerResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomFormDataSignerResponse
        //val modelInstance = CustomFormDataSignerResponse()

        // to test the property `fkiEzsignfoldersignerassociationID` - The unique ID of the Ezsignfoldersignerassociation
        should("test fkiEzsignfoldersignerassociationID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfoldersignerassociationID shouldBe ("TODO")
        }

        // to test the property `sContactFirstname` - The First name of the contact
        should("test sContactFirstname") {
            // uncomment below to test the property
            //modelInstance.sContactFirstname shouldBe ("TODO")
        }

        // to test the property `sContactLastname` - The Last name of the contact
        should("test sContactLastname") {
            // uncomment below to test the property
            //modelInstance.sContactLastname shouldBe ("TODO")
        }

        // to test the property `aObjEzsignformfieldgroup`
        should("test aObjEzsignformfieldgroup") {
            // uncomment below to test the property
            //modelInstance.aObjEzsignformfieldgroup shouldBe ("TODO")
        }

        // to test the property `fkiUserID` - The unique ID of the User
        should("test fkiUserID") {
            // uncomment below to test the property
            //modelInstance.fkiUserID shouldBe ("TODO")
        }

    }
}

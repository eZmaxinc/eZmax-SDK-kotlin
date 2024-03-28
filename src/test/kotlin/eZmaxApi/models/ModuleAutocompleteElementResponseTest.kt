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

import eZmaxApi.models.ModuleAutocompleteElementResponse

class ModuleAutocompleteElementResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ModuleAutocompleteElementResponse
        //val modelInstance = ModuleAutocompleteElementResponse()

        // to test the property `pkiModuleID` - The unique ID of the Module
        should("test pkiModuleID") {
            // uncomment below to test the property
            //modelInstance.pkiModuleID shouldBe ("TODO")
        }

        // to test the property `sModuleNameX` - The Name of the Module in the language of the requester
        should("test sModuleNameX") {
            // uncomment below to test the property
            //modelInstance.sModuleNameX shouldBe ("TODO")
        }

        // to test the property `bModuleIsactive` - Whether the Module is active or not
        should("test bModuleIsactive") {
            // uncomment below to test the property
            //modelInstance.bModuleIsactive shouldBe ("TODO")
        }

    }
}
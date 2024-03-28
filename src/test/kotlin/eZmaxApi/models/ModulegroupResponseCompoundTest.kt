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

import eZmaxApi.models.ModulegroupResponseCompound
import eZmaxApi.models.ModuleResponseCompound

class ModulegroupResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ModulegroupResponseCompound
        //val modelInstance = ModulegroupResponseCompound()

        // to test the property `pkiModulegroupID` - The unique ID of the Modulegroup
        should("test pkiModulegroupID") {
            // uncomment below to test the property
            //modelInstance.pkiModulegroupID shouldBe ("TODO")
        }

        // to test the property `sModulegroupNameX` - The name of the Modulegroup in the language of the requester
        should("test sModulegroupNameX") {
            // uncomment below to test the property
            //modelInstance.sModulegroupNameX shouldBe ("TODO")
        }

        // to test the property `aObjModule`
        should("test aObjModule") {
            // uncomment below to test the property
            //modelInstance.aObjModule shouldBe ("TODO")
        }

    }
}

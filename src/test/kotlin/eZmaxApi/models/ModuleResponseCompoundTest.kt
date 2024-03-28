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

import eZmaxApi.models.ModuleResponseCompound
import eZmaxApi.models.ModulesectionResponseCompound

class ModuleResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ModuleResponseCompound
        //val modelInstance = ModuleResponseCompound()

        // to test the property `pkiModuleID` - The unique ID of the Module
        should("test pkiModuleID") {
            // uncomment below to test the property
            //modelInstance.pkiModuleID shouldBe ("TODO")
        }

        // to test the property `fkiModulegroupID` - The unique ID of the Modulegroup
        should("test fkiModulegroupID") {
            // uncomment below to test the property
            //modelInstance.fkiModulegroupID shouldBe ("TODO")
        }

        // to test the property `eModuleInternalname` - The Internal name of the Module.  This is theoretically an enum field but there are so many possibles values we decided not to list them all.
        should("test eModuleInternalname") {
            // uncomment below to test the property
            //modelInstance.eModuleInternalname shouldBe ("TODO")
        }

        // to test the property `sModuleNameX` - The Name of the Module in the language of the requester
        should("test sModuleNameX") {
            // uncomment below to test the property
            //modelInstance.sModuleNameX shouldBe ("TODO")
        }

        // to test the property `bModuleRegistered` - Whether the Module is registered or not
        should("test bModuleRegistered") {
            // uncomment below to test the property
            //modelInstance.bModuleRegistered shouldBe ("TODO")
        }

        // to test the property `bModuleRegisteredapi` - Whether the Module is registered or not for api use
        should("test bModuleRegisteredapi") {
            // uncomment below to test the property
            //modelInstance.bModuleRegisteredapi shouldBe ("TODO")
        }

        // to test the property `aObjModulesection`
        should("test aObjModulesection") {
            // uncomment below to test the property
            //modelInstance.aObjModulesection shouldBe ("TODO")
        }

    }
}
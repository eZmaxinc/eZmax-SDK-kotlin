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

import eZmaxApi.models.SupplyRequest
import eZmaxApi.models.MultilingualSupplyDescription

class SupplyRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SupplyRequest
        //val modelInstance = SupplyRequest()

        // to test the property `fkiVariableexpenseID` - The unique ID of the Variableexpense
        should("test fkiVariableexpenseID") {
            // uncomment below to test the property
            //modelInstance.fkiVariableexpenseID shouldBe ("TODO")
        }

        // to test the property `sSupplyCode` - The code of the Supply
        should("test sSupplyCode") {
            // uncomment below to test the property
            //modelInstance.sSupplyCode shouldBe ("TODO")
        }

        // to test the property `objSupplyDescription`
        should("test objSupplyDescription") {
            // uncomment below to test the property
            //modelInstance.objSupplyDescription shouldBe ("TODO")
        }

        // to test the property `dSupplyUnitprice` - The unit price of the Supply
        should("test dSupplyUnitprice") {
            // uncomment below to test the property
            //modelInstance.dSupplyUnitprice shouldBe ("TODO")
        }

        // to test the property `bSupplyIsactive` - Whether the supply is active or not
        should("test bSupplyIsactive") {
            // uncomment below to test the property
            //modelInstance.bSupplyIsactive shouldBe ("TODO")
        }

        // to test the property `bSupplyVariableprice` - Whether if the price is variable
        should("test bSupplyVariableprice") {
            // uncomment below to test the property
            //modelInstance.bSupplyVariableprice shouldBe ("TODO")
        }

        // to test the property `pkiSupplyID` - The unique ID of the Supply
        should("test pkiSupplyID") {
            // uncomment below to test the property
            //modelInstance.pkiSupplyID shouldBe ("TODO")
        }

        // to test the property `fkiGlaccountID` - The unique ID of the Glaccount
        should("test fkiGlaccountID") {
            // uncomment below to test the property
            //modelInstance.fkiGlaccountID shouldBe ("TODO")
        }

        // to test the property `fkiGlaccountcontainerID` - The unique ID of the Glaccountcontainer
        should("test fkiGlaccountcontainerID") {
            // uncomment below to test the property
            //modelInstance.fkiGlaccountcontainerID shouldBe ("TODO")
        }

    }
}

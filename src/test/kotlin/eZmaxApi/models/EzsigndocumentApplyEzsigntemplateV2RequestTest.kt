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

import eZmaxApi.models.EzsigndocumentApplyEzsigntemplateV2Request

class EzsigndocumentApplyEzsigntemplateV2RequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigndocumentApplyEzsigntemplateV2Request
        //val modelInstance = EzsigndocumentApplyEzsigntemplateV2Request()

        // to test the property `fkiEzsigntemplateID` - The unique ID of the Ezsigntemplate
        should("test fkiEzsigntemplateID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntemplateID shouldBe ("TODO")
        }

        // to test the property `aSEzsigntemplatesigner`
        should("test aSEzsigntemplatesigner") {
            // uncomment below to test the property
            //modelInstance.aSEzsigntemplatesigner shouldBe ("TODO")
        }

        // to test the property `aPkiEzsignfoldersignerassociationID`
        should("test aPkiEzsignfoldersignerassociationID") {
            // uncomment below to test the property
            //modelInstance.aPkiEzsignfoldersignerassociationID shouldBe ("TODO")
        }

    }
}
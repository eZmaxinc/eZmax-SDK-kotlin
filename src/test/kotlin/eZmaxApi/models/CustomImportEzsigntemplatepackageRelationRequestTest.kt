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

import eZmaxApi.models.CustomImportEzsigntemplatepackageRelationRequest

class CustomImportEzsigntemplatepackageRelationRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomImportEzsigntemplatepackageRelationRequest
        //val modelInstance = CustomImportEzsigntemplatepackageRelationRequest()

        // to test the property `fkiEzsignfoldersignerassociationID` - The unique ID of the Ezsignfoldersignerassociation
        should("test fkiEzsignfoldersignerassociationID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfoldersignerassociationID shouldBe ("TODO")
        }

        // to test the property `fkiEzsigntemplatepackagesignerID` - The unique ID of the Ezsigntemplatepackagesigner
        should("test fkiEzsigntemplatepackagesignerID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntemplatepackagesignerID shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplatepackagesignerDescription` - The description of the Ezsigntemplatepackagesigner
        should("test sEzsigntemplatepackagesignerDescription") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplatepackagesignerDescription shouldBe ("TODO")
        }

    }
}

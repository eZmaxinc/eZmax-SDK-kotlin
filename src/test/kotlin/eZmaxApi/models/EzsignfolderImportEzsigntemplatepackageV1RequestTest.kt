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

import eZmaxApi.models.EzsignfolderImportEzsigntemplatepackageV1Request
import eZmaxApi.models.CustomImportEzsigntemplatepackageRelationRequest

class EzsignfolderImportEzsigntemplatepackageV1RequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignfolderImportEzsigntemplatepackageV1Request
        //val modelInstance = EzsignfolderImportEzsigntemplatepackageV1Request()

        // to test the property `fkiEzsigntemplatepackageID` - The unique ID of the Ezsigntemplatepackage
        should("test fkiEzsigntemplatepackageID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntemplatepackageID shouldBe ("TODO")
        }

        // to test the property `dtEzsigndocumentDuedate` - The maximum date and time at which the Ezsigndocument can be signed.
        should("test dtEzsigndocumentDuedate") {
            // uncomment below to test the property
            //modelInstance.dtEzsigndocumentDuedate shouldBe ("TODO")
        }

        // to test the property `aObjImportEzsigntemplatepackageRelation`
        should("test aObjImportEzsigntemplatepackageRelation") {
            // uncomment below to test the property
            //modelInstance.aObjImportEzsigntemplatepackageRelation shouldBe ("TODO")
        }

    }
}
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

import eZmaxApi.models.EzsigntemplateelementdependencyRequest
import eZmaxApi.models.FieldEEzsigntemplateelementdependencyOperator
import eZmaxApi.models.FieldEEzsigntemplateelementdependencyValidation

class EzsigntemplateelementdependencyRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplateelementdependencyRequest
        //val modelInstance = EzsigntemplateelementdependencyRequest()

        // to test the property `eEzsigntemplateelementdependencyValidation`
        should("test eEzsigntemplateelementdependencyValidation") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplateelementdependencyValidation shouldBe ("TODO")
        }

        // to test the property `pkiEzsigntemplateelementdependencyID` - The unique ID of the Ezsigntemplateelementdependency
        should("test pkiEzsigntemplateelementdependencyID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigntemplateelementdependencyID shouldBe ("TODO")
        }

        // to test the property `fkiEzsigntemplateformfieldIDValidation` - The unique ID of the Ezsigntemplateformfield
        should("test fkiEzsigntemplateformfieldIDValidation") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntemplateformfieldIDValidation shouldBe ("TODO")
        }

        // to test the property `fkiEzsigntemplateformfieldgroupIDValidation` - The unique ID of the Ezsigntemplateformfieldgroup
        should("test fkiEzsigntemplateformfieldgroupIDValidation") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntemplateformfieldgroupIDValidation shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplateelementdependencyEzsigntemplateformfieldgrouplabel` - The Label for the Ezsigntemplateformfieldgroup
        should("test sEzsigntemplateelementdependencyEzsigntemplateformfieldgrouplabel") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplateelementdependencyEzsigntemplateformfieldgrouplabel shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplateelementdependencyEzsigntemplateformfieldlabel` - The Label for the Ezsigntemplateformfield
        should("test sEzsigntemplateelementdependencyEzsigntemplateformfieldlabel") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplateelementdependencyEzsigntemplateformfieldlabel shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplateelementdependencySelected` - Whether if it's selected or not when using eEzsigntemplateelementdependencyValidation = Selected
        should("test bEzsigntemplateelementdependencySelected") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplateelementdependencySelected shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplateelementdependencyOperator`
        should("test eEzsigntemplateelementdependencyOperator") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplateelementdependencyOperator shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplateelementdependencyValue` - The value of the Ezsignelementdependency
        should("test sEzsigntemplateelementdependencyValue") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplateelementdependencyValue shouldBe ("TODO")
        }

    }
}

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

import eZmaxApi.models.EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayload

class EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayloadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayload
        //val modelInstance = EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayload()

        // to test the property `bEzsigntemplatepackageNeedvalidation` - Whether the Ezsignbulksend was automatically modified and needs a manual validation
        should("test bEzsigntemplatepackageNeedvalidation") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplatepackageNeedvalidation shouldBe ("TODO")
        }

        // to test the property `bEzsignbulksendNeedvalidation` - Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation
        should("test bEzsignbulksendNeedvalidation") {
            // uncomment below to test the property
            //modelInstance.bEzsignbulksendNeedvalidation shouldBe ("TODO")
        }

    }
}
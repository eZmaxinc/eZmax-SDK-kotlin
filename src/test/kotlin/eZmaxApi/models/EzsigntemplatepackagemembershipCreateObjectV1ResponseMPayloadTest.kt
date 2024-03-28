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

import eZmaxApi.models.EzsigntemplatepackagemembershipCreateObjectV1ResponseMPayload

class EzsigntemplatepackagemembershipCreateObjectV1ResponseMPayloadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplatepackagemembershipCreateObjectV1ResponseMPayload
        //val modelInstance = EzsigntemplatepackagemembershipCreateObjectV1ResponseMPayload()

        // to test the property `aPkiEzsigntemplatepackagemembershipID` - An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
        should("test aPkiEzsigntemplatepackagemembershipID") {
            // uncomment below to test the property
            //modelInstance.aPkiEzsigntemplatepackagemembershipID shouldBe ("TODO")
        }

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

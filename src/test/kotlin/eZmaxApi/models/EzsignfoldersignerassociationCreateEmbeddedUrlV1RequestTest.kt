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

import eZmaxApi.models.EzsignfoldersignerassociationCreateEmbeddedUrlV1Request

class EzsignfoldersignerassociationCreateEmbeddedUrlV1RequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignfoldersignerassociationCreateEmbeddedUrlV1Request
        //val modelInstance = EzsignfoldersignerassociationCreateEmbeddedUrlV1Request()

        // to test the property `sReturnUrl` - The return Url to redirect after the signing is completed
        should("test sReturnUrl") {
            // uncomment below to test the property
            //modelInstance.sReturnUrl shouldBe ("TODO")
        }

        // to test the property `sIframedomain` - Domain protection for the iFrame
        should("test sIframedomain") {
            // uncomment below to test the property
            //modelInstance.sIframedomain shouldBe ("TODO")
        }

        // to test the property `bIsiframe` - Whether the url would be in an iFrame or not
        should("test bIsiframe") {
            // uncomment below to test the property
            //modelInstance.bIsiframe shouldBe ("TODO")
        }

    }
}

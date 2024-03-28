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

import eZmaxApi.models.EzsignbulksendResponse
import eZmaxApi.models.CommonAudit
import eZmaxApi.models.FieldEEzsignfoldertypePrivacylevel

class EzsignbulksendResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignbulksendResponse
        //val modelInstance = EzsignbulksendResponse()

        // to test the property `pkiEzsignbulksendID` - The unique ID of the Ezsignbulksend
        should("test pkiEzsignbulksendID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignbulksendID shouldBe ("TODO")
        }

        // to test the property `fkiEzsignfoldertypeID` - The unique ID of the Ezsignfoldertype.
        should("test fkiEzsignfoldertypeID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfoldertypeID shouldBe ("TODO")
        }

        // to test the property `fkiLanguageID` - The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
        should("test fkiLanguageID") {
            // uncomment below to test the property
            //modelInstance.fkiLanguageID shouldBe ("TODO")
        }

        // to test the property `sLanguageNameX` - The Name of the Language in the language of the requester
        should("test sLanguageNameX") {
            // uncomment below to test the property
            //modelInstance.sLanguageNameX shouldBe ("TODO")
        }

        // to test the property `eEzsignfoldertypePrivacylevel`
        should("test eEzsignfoldertypePrivacylevel") {
            // uncomment below to test the property
            //modelInstance.eEzsignfoldertypePrivacylevel shouldBe ("TODO")
        }

        // to test the property `sEzsignfoldertypeNameX` - The name of the Ezsignfoldertype in the language of the requester
        should("test sEzsignfoldertypeNameX") {
            // uncomment below to test the property
            //modelInstance.sEzsignfoldertypeNameX shouldBe ("TODO")
        }

        // to test the property `sEzsignbulksendDescription` - The description of the Ezsignbulksend
        should("test sEzsignbulksendDescription") {
            // uncomment below to test the property
            //modelInstance.sEzsignbulksendDescription shouldBe ("TODO")
        }

        // to test the property `tEzsignbulksendNote` - Note about the Ezsignbulksend
        should("test tEzsignbulksendNote") {
            // uncomment below to test the property
            //modelInstance.tEzsignbulksendNote shouldBe ("TODO")
        }

        // to test the property `bEzsignbulksendNeedvalidation` - Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation
        should("test bEzsignbulksendNeedvalidation") {
            // uncomment below to test the property
            //modelInstance.bEzsignbulksendNeedvalidation shouldBe ("TODO")
        }

        // to test the property `bEzsignbulksendIsactive` - Whether the Ezsignbulksend is active or not
        should("test bEzsignbulksendIsactive") {
            // uncomment below to test the property
            //modelInstance.bEzsignbulksendIsactive shouldBe ("TODO")
        }

        // to test the property `objAudit`
        should("test objAudit") {
            // uncomment below to test the property
            //modelInstance.objAudit shouldBe ("TODO")
        }

    }
}
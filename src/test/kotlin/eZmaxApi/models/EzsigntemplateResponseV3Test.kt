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

import eZmaxApi.models.EzsigntemplateResponseV3
import eZmaxApi.models.CommonAudit
import eZmaxApi.models.FieldEEzsigntemplateRecognition
import eZmaxApi.models.FieldEEzsigntemplateType

class EzsigntemplateResponseV3Test : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplateResponseV3
        //val modelInstance = EzsigntemplateResponseV3()

        // to test the property `pkiEzsigntemplateID` - The unique ID of the Ezsigntemplate
        should("test pkiEzsigntemplateID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigntemplateID shouldBe ("TODO")
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

        // to test the property `sEzsigntemplateDescription` - The description of the Ezsigntemplate
        should("test sEzsigntemplateDescription") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplateDescription shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplateAdminonly` - Whether the Ezsigntemplate can be accessed by admin users only (eUserType=Normal)
        should("test bEzsigntemplateAdminonly") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplateAdminonly shouldBe ("TODO")
        }

        // to test the property `objAudit`
        should("test objAudit") {
            // uncomment below to test the property
            //modelInstance.objAudit shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplateEditallowed` - Whether the Ezsigntemplate if allowed to edit or not
        should("test bEzsigntemplateEditallowed") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplateEditallowed shouldBe ("TODO")
        }

        // to test the property `fkiEzsigntemplatedocumentID` - The unique ID of the Ezsigntemplatedocument
        should("test fkiEzsigntemplatedocumentID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntemplatedocumentID shouldBe ("TODO")
        }

        // to test the property `fkiEzsignfoldertypeID` - The unique ID of the Ezsignfoldertype.
        should("test fkiEzsignfoldertypeID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfoldertypeID shouldBe ("TODO")
        }

        // to test the property `fkiEzdoctemplatedocumentID` - The unique ID of the Ezdoctemplatedocument
        should("test fkiEzdoctemplatedocumentID") {
            // uncomment below to test the property
            //modelInstance.fkiEzdoctemplatedocumentID shouldBe ("TODO")
        }

        // to test the property `sEzdoctemplatedocumentNameX` - The name of the Ezdoctemplatedocument in the language of the requester
        should("test sEzdoctemplatedocumentNameX") {
            // uncomment below to test the property
            //modelInstance.sEzdoctemplatedocumentNameX shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplateExternaldescription` - The external description of the Ezsigntemplate
        should("test sEzsigntemplateExternaldescription") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplateExternaldescription shouldBe ("TODO")
        }

        // to test the property `tEzsigntemplateComment` - The comment of the Ezsigntemplate
        should("test tEzsigntemplateComment") {
            // uncomment below to test the property
            //modelInstance.tEzsigntemplateComment shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplateRecognition`
        should("test eEzsigntemplateRecognition") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplateRecognition shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplateFilenameregexp` - The filename regexp of the Ezsigntemplate.
        should("test sEzsigntemplateFilenameregexp") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplateFilenameregexp shouldBe ("TODO")
        }

        // to test the property `sEzsignfoldertypeNameX` - The name of the Ezsignfoldertype in the language of the requester
        should("test sEzsignfoldertypeNameX") {
            // uncomment below to test the property
            //modelInstance.sEzsignfoldertypeNameX shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplateType`
        should("test eEzsigntemplateType") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplateType shouldBe ("TODO")
        }

    }
}

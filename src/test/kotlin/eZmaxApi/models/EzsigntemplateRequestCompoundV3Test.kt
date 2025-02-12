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

import eZmaxApi.models.EzsigntemplateRequestCompoundV3
import eZmaxApi.models.FieldEEzsigntemplateRecognition
import eZmaxApi.models.FieldEEzsigntemplateType

class EzsigntemplateRequestCompoundV3Test : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplateRequestCompoundV3
        //val modelInstance = EzsigntemplateRequestCompoundV3()

        // to test the property `fkiLanguageID` - The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
        should("test fkiLanguageID") {
            // uncomment below to test the property
            //modelInstance.fkiLanguageID shouldBe ("TODO")
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

        // to test the property `eEzsigntemplateType`
        should("test eEzsigntemplateType") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplateType shouldBe ("TODO")
        }

        // to test the property `pkiEzsigntemplateID` - The unique ID of the Ezsigntemplate
        should("test pkiEzsigntemplateID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigntemplateID shouldBe ("TODO")
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

    }
}

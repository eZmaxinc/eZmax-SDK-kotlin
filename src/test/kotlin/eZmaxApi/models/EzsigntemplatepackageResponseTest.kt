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

import eZmaxApi.models.EzsigntemplatepackageResponse

class EzsigntemplatepackageResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplatepackageResponse
        //val modelInstance = EzsigntemplatepackageResponse()

        // to test the property `pkiEzsigntemplatepackageID` - The unique ID of the Ezsigntemplatepackage
        should("test pkiEzsigntemplatepackageID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigntemplatepackageID shouldBe ("TODO")
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

        // to test the property `sEzsigntemplatepackageDescription` - The description of the Ezsigntemplatepackage
        should("test sEzsigntemplatepackageDescription") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplatepackageDescription shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplatepackageAdminonly` - Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType=Normal)
        should("test bEzsigntemplatepackageAdminonly") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplatepackageAdminonly shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplatepackageNeedvalidation` - Whether the Ezsignbulksend was automatically modified and needs a manual validation
        should("test bEzsigntemplatepackageNeedvalidation") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplatepackageNeedvalidation shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplatepackageIsactive` - Whether the Ezsigntemplatepackage is active or not
        should("test bEzsigntemplatepackageIsactive") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplatepackageIsactive shouldBe ("TODO")
        }

        // to test the property `sEzsignfoldertypeNameX` - The name of the Ezsignfoldertype in the language of the requester
        should("test sEzsignfoldertypeNameX") {
            // uncomment below to test the property
            //modelInstance.sEzsignfoldertypeNameX shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplatepackageEditallowed` - Whether the Ezsigntemplatepackage if allowed to edit or not
        should("test bEzsigntemplatepackageEditallowed") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplatepackageEditallowed shouldBe ("TODO")
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

    }
}

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

import eZmaxApi.models.EzsigntemplateRequestCompound

class EzsigntemplateRequestCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplateRequestCompound
        //val modelInstance = EzsigntemplateRequestCompound()

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

        // to test the property `pkiEzsigntemplateID` - The unique ID of the Ezsigntemplate
        should("test pkiEzsigntemplateID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigntemplateID shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplateFilenamepattern` - The filename pattern of the Ezsigntemplate
        should("test sEzsigntemplateFilenamepattern") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplateFilenamepattern shouldBe ("TODO")
        }

    }
}

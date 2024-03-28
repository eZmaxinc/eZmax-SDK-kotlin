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

import eZmaxApi.models.EzsigntemplatepackageRequestCompound

class EzsigntemplatepackageRequestCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplatepackageRequestCompound
        //val modelInstance = EzsigntemplatepackageRequestCompound()

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

        // to test the property `bEzsigntemplatepackageIsactive` - Whether the Ezsigntemplatepackage is active or not
        should("test bEzsigntemplatepackageIsactive") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplatepackageIsactive shouldBe ("TODO")
        }

        // to test the property `pkiEzsigntemplatepackageID` - The unique ID of the Ezsigntemplatepackage
        should("test pkiEzsigntemplatepackageID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigntemplatepackageID shouldBe ("TODO")
        }

    }
}

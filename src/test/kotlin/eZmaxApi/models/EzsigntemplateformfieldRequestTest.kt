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

import eZmaxApi.models.EzsigntemplateformfieldRequest
import eZmaxApi.models.FieldEEzsigntemplateformfieldDependencyrequirement
import eZmaxApi.models.FieldEEzsigntemplateformfieldPositioning
import eZmaxApi.models.FieldEEzsigntemplateformfieldPositioningoccurence

class EzsigntemplateformfieldRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplateformfieldRequest
        //val modelInstance = EzsigntemplateformfieldRequest()

        // to test the property `iEzsigntemplatedocumentpagePagenumber` - The page number in the Ezsigntemplatedocument
        should("test iEzsigntemplatedocumentpagePagenumber") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplatedocumentpagePagenumber shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplateformfieldLabel` - The Label for the Ezsigntemplateformfield
        should("test sEzsigntemplateformfieldLabel") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplateformfieldLabel shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplateformfieldWidth` - The Width of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22-65535     | | Radio                     | 22           | | Text                      | 22-65535     | | Textarea                  | 22-65535     |
        should("test iEzsigntemplateformfieldWidth") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplateformfieldWidth shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplateformfieldHeight` - The Height of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22           | | Radio                     | 22           | | Text                      | 22           | | Textarea                  | 22-65535     | 
        should("test iEzsigntemplateformfieldHeight") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplateformfieldHeight shouldBe ("TODO")
        }

        // to test the property `pkiEzsigntemplateformfieldID` - The unique ID of the Ezsigntemplateformfield
        should("test pkiEzsigntemplateformfieldID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigntemplateformfieldID shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplateformfieldPositioning`
        should("test eEzsigntemplateformfieldPositioning") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplateformfieldPositioning shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplateformfieldValue` - The value for the Ezsigntemplateformfield
        should("test sEzsigntemplateformfieldValue") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplateformfieldValue shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplateformfieldX` - The X coordinate (Horizontal) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
        should("test iEzsigntemplateformfieldX") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplateformfieldX shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplateformfieldY` - The Y coordinate (Vertical) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
        should("test iEzsigntemplateformfieldY") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplateformfieldY shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplateformfieldAutocomplete` - Whether the Ezsigntemplateformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsigntemplateformfieldgroupType is **Text**
        should("test bEzsigntemplateformfieldAutocomplete") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplateformfieldAutocomplete shouldBe ("TODO")
        }

        // to test the property `bEzsigntemplateformfieldSelected` - Whether the Ezsigntemplateformfield is selected or not by default.  This can only be set if eEzsigntemplateformfieldgroupType is **Checkbox** or **Radio**
        should("test bEzsigntemplateformfieldSelected") {
            // uncomment below to test the property
            //modelInstance.bEzsigntemplateformfieldSelected shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplateformfieldDependencyrequirement`
        should("test eEzsigntemplateformfieldDependencyrequirement") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplateformfieldDependencyrequirement shouldBe ("TODO")
        }

        // to test the property `sEzsigntemplateformfieldPositioningpattern` - The string pattern to search for the positioning. **This is not a regexp**  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**
        should("test sEzsigntemplateformfieldPositioningpattern") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplateformfieldPositioningpattern shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplateformfieldPositioningoffsetx` - The offset X  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**
        should("test iEzsigntemplateformfieldPositioningoffsetx") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplateformfieldPositioningoffsetx shouldBe ("TODO")
        }

        // to test the property `iEzsigntemplateformfieldPositioningoffsety` - The offset Y  This will be required if **eEzsigntemplateformfieldPositioning** is set to **PerCoordinates**
        should("test iEzsigntemplateformfieldPositioningoffsety") {
            // uncomment below to test the property
            //modelInstance.iEzsigntemplateformfieldPositioningoffsety shouldBe ("TODO")
        }

        // to test the property `eEzsigntemplateformfieldPositioningoccurence`
        should("test eEzsigntemplateformfieldPositioningoccurence") {
            // uncomment below to test the property
            //modelInstance.eEzsigntemplateformfieldPositioningoccurence shouldBe ("TODO")
        }

    }
}

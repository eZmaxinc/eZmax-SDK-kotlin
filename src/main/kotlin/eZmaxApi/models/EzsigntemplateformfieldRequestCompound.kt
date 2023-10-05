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

import eZmaxApi.models.EzsigntemplateelementdependencyRequestCompound
import eZmaxApi.models.FieldEEzsigntemplateformfieldDependencyrequirement

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsigntemplateformfield Object and children to create a complete structure
 *
 * @param iEzsigntemplatedocumentpagePagenumber The page number in the Ezsigntemplatedocument
 * @param sEzsigntemplateformfieldLabel The Label for the Ezsigntemplateformfield
 * @param iEzsigntemplateformfieldX The X coordinate (Horizontal) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
 * @param iEzsigntemplateformfieldY The Y coordinate (Vertical) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
 * @param iEzsigntemplateformfieldWidth The Width of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22-65535     | | Radio                     | 22           | | Text                      | 22-65535     | | Textarea                  | 22-65535     |
 * @param iEzsigntemplateformfieldHeight The Height of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22           | | Radio                     | 22           | | Text                      | 22           | | Textarea                  | 22-65535     | 
 * @param pkiEzsigntemplateformfieldID The unique ID of the Ezsigntemplateformfield
 * @param sEzsigntemplateformfieldValue The value for the Ezsigntemplateformfield
 * @param bEzsigntemplateformfieldAutocomplete Whether the Ezsigntemplateformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsigntemplateformfieldgroupType is **Text**
 * @param bEzsigntemplateformfieldSelected Whether the Ezsigntemplateformfield is selected or not by default.  This can only be set if eEzsigntemplateformfieldgroupType is **Checkbox** or **Radio**
 * @param eEzsigntemplateformfieldDependencyrequirement 
 * @param aObjEzsigntemplateelementdependency 
 */


data class EzsigntemplateformfieldRequestCompound (

    /* The page number in the Ezsigntemplatedocument */
    @Json(name = "iEzsigntemplatedocumentpagePagenumber")
    val iEzsigntemplatedocumentpagePagenumber: kotlin.Int,

    /* The Label for the Ezsigntemplateformfield */
    @Json(name = "sEzsigntemplateformfieldLabel")
    val sEzsigntemplateformfieldLabel: kotlin.String,

    /* The X coordinate (Horizontal) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 2 inches from the left border of the page, you would use \"200\" for the X coordinate. */
    @Json(name = "iEzsigntemplateformfieldX")
    val iEzsigntemplateformfieldX: kotlin.Int,

    /* The Y coordinate (Vertical) where to put the Ezsigntemplateformfield on the Ezsigntemplatepage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplateformfield 3 inches from the top border of the page, you would use \"300\" for the Y coordinate. */
    @Json(name = "iEzsigntemplateformfieldY")
    val iEzsigntemplateformfieldY: kotlin.Int,

    /* The Width of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22-65535     | | Radio                     | 22           | | Text                      | 22-65535     | | Textarea                  | 22-65535     | */
    @Json(name = "iEzsigntemplateformfieldWidth")
    val iEzsigntemplateformfieldWidth: kotlin.Int,

    /* The Height of the Ezsigntemplateformfield in pixels calculated at 100 DPI  The allowed values are varying based on the eEzsigntemplateformfieldgroupType.  | eEzsigntemplateformfieldgroupType | Valid values | | ------------------------- | ------------ | | Checkbox                  | 22           | | Dropdown                  | 22           | | Radio                     | 22           | | Text                      | 22           | | Textarea                  | 22-65535     |  */
    @Json(name = "iEzsigntemplateformfieldHeight")
    val iEzsigntemplateformfieldHeight: kotlin.Int,

    /* The unique ID of the Ezsigntemplateformfield */
    @Json(name = "pkiEzsigntemplateformfieldID")
    val pkiEzsigntemplateformfieldID: kotlin.Int? = null,

    /* The value for the Ezsigntemplateformfield */
    @Json(name = "sEzsigntemplateformfieldValue")
    val sEzsigntemplateformfieldValue: kotlin.String? = null,

    /* Whether the Ezsigntemplateformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** */
    @Json(name = "bEzsigntemplateformfieldAutocomplete")
    val bEzsigntemplateformfieldAutocomplete: kotlin.Boolean? = null,

    /* Whether the Ezsigntemplateformfield is selected or not by default.  This can only be set if eEzsigntemplateformfieldgroupType is **Checkbox** or **Radio** */
    @Json(name = "bEzsigntemplateformfieldSelected")
    val bEzsigntemplateformfieldSelected: kotlin.Boolean? = null,

    @Json(name = "eEzsigntemplateformfieldDependencyrequirement")
    val eEzsigntemplateformfieldDependencyrequirement: FieldEEzsigntemplateformfieldDependencyrequirement? = null,

    @Json(name = "a_objEzsigntemplateelementdependency")
    val aObjEzsigntemplateelementdependency: kotlin.collections.List<EzsigntemplateelementdependencyRequestCompound>? = null

)


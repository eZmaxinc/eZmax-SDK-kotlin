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

import eZmaxApi.models.EnumHorizontalalignment
import eZmaxApi.models.EzsignelementdependencyResponseCompound
import eZmaxApi.models.FieldEEzsignformfieldDependencyrequirement
import eZmaxApi.models.TextstylestaticResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsignformfield Object and children to create a complete structure
 *
 * @param pkiEzsignformfieldID The unique ID of the Ezsignformfield
 * @param iEzsignpagePagenumber The page number in the Ezsigndocument
 * @param sEzsignformfieldLabel The Label for the Ezsignformfield
 * @param iEzsignformfieldX The X coordinate (Horizontal) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
 * @param iEzsignformfieldY The Y coordinate (Vertical) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
 * @param iEzsignformfieldWidth The Width of the Ezsignformfield in pixels calculated at 100 DPI
 * @param iEzsignformfieldHeight The Height of the Ezsignformfield in pixels calculated at 100 DPI 
 * @param sEzsignformfieldValue The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio
 * @param bEzsignformfieldAutocomplete Whether the Ezsignformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsignformfieldgroupType is **Text**
 * @param bEzsignformfieldSelected Whether the Ezsignformfield is selected or not by default.  This can only be set if eEzsignformfieldgroupType is **Checkbox** or **Radio**
 * @param sEzsignformfieldEnteredvalue This is the value enterred for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is **Dropdown**, **Text** or **Textarea**
 * @param eEzsignformfieldDependencyrequirement 
 * @param eEzsignformfieldHorizontalalignment 
 * @param objTextstylestatic 
 * @param aObjEzsignelementdependency 
 */


data class EzsignformfieldResponseCompound (

    /* The unique ID of the Ezsignformfield */
    @Json(name = "pkiEzsignformfieldID")
    val pkiEzsignformfieldID: kotlin.Int,

    /* The page number in the Ezsigndocument */
    @Json(name = "iEzsignpagePagenumber")
    val iEzsignpagePagenumber: kotlin.Int,

    /* The Label for the Ezsignformfield */
    @Json(name = "sEzsignformfieldLabel")
    val sEzsignformfieldLabel: kotlin.String,

    /* The X coordinate (Horizontal) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 2 inches from the left border of the page, you would use \"200\" for the X coordinate. */
    @Json(name = "iEzsignformfieldX")
    val iEzsignformfieldX: kotlin.Int,

    /* The Y coordinate (Vertical) where to put the Ezsignformfield on the Ezsignpage.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignformfield 3 inches from the top border of the page, you would use \"300\" for the Y coordinate. */
    @Json(name = "iEzsignformfieldY")
    val iEzsignformfieldY: kotlin.Int,

    /* The Width of the Ezsignformfield in pixels calculated at 100 DPI */
    @Json(name = "iEzsignformfieldWidth")
    val iEzsignformfieldWidth: kotlin.Int,

    /* The Height of the Ezsignformfield in pixels calculated at 100 DPI  */
    @Json(name = "iEzsignformfieldHeight")
    val iEzsignformfieldHeight: kotlin.Int,

    /* The value for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is Checkbox or Radio */
    @Json(name = "sEzsignformfieldValue")
    val sEzsignformfieldValue: kotlin.String? = null,

    /* Whether the Ezsignformfield allows the use of the autocomplete of the browser.  This can only be set if eEzsignformfieldgroupType is **Text** */
    @Json(name = "bEzsignformfieldAutocomplete")
    val bEzsignformfieldAutocomplete: kotlin.Boolean? = null,

    /* Whether the Ezsignformfield is selected or not by default.  This can only be set if eEzsignformfieldgroupType is **Checkbox** or **Radio** */
    @Json(name = "bEzsignformfieldSelected")
    val bEzsignformfieldSelected: kotlin.Boolean? = null,

    /* This is the value enterred for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is **Dropdown**, **Text** or **Textarea** */
    @Json(name = "sEzsignformfieldEnteredvalue")
    val sEzsignformfieldEnteredvalue: kotlin.String? = null,

    @Json(name = "eEzsignformfieldDependencyrequirement")
    val eEzsignformfieldDependencyrequirement: FieldEEzsignformfieldDependencyrequirement? = null,

    @Json(name = "eEzsignformfieldHorizontalalignment")
    val eEzsignformfieldHorizontalalignment: EnumHorizontalalignment? = null,

    @Json(name = "objTextstylestatic")
    val objTextstylestatic: TextstylestaticResponseCompound? = null,

    @Json(name = "a_objEzsignelementdependency")
    val aObjEzsignelementdependency: kotlin.collections.List<EzsignelementdependencyResponseCompound>? = null

) {


}


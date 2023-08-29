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

import eZmaxApi.models.EnumFontunderline
import eZmaxApi.models.EnumFontweight
import eZmaxApi.models.EnumHorizontalalignment
import eZmaxApi.models.EnumVerticalalignment

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Styles applied to a Reportcell 
 *
 * @param bReportcellstyleBordertop Whether there is a border at the top of the Reportcell
 * @param bReportcellstyleBorderbottom Whether there is a border at the bottom of the Reportcell
 * @param bReportcellstyleBorderleft Whether there is a border at the left of the Reportcell
 * @param bReportcellstyleBorderright Whether there is a border at the right of the Reportcell
 * @param eReportcellHorizontalalignment 
 * @param eReportcellVerticalalignment 
 * @param eReportcellFontweight 
 * @param eReportcellFontunderline 
 */


data class CommonReportcellstyle (

    /* Whether there is a border at the top of the Reportcell */
    @Json(name = "bReportcellstyleBordertop")
    val bReportcellstyleBordertop: kotlin.Boolean,

    /* Whether there is a border at the bottom of the Reportcell */
    @Json(name = "bReportcellstyleBorderbottom")
    val bReportcellstyleBorderbottom: kotlin.Boolean,

    /* Whether there is a border at the left of the Reportcell */
    @Json(name = "bReportcellstyleBorderleft")
    val bReportcellstyleBorderleft: kotlin.Boolean,

    /* Whether there is a border at the right of the Reportcell */
    @Json(name = "bReportcellstyleBorderright")
    val bReportcellstyleBorderright: kotlin.Boolean,

    @Json(name = "eReportcellHorizontalalignment")
    val eReportcellHorizontalalignment: EnumHorizontalalignment,

    @Json(name = "eReportcellVerticalalignment")
    val eReportcellVerticalalignment: EnumVerticalalignment,

    @Json(name = "eReportcellFontweight")
    val eReportcellFontweight: EnumFontweight,

    @Json(name = "eReportcellFontunderline")
    val eReportcellFontunderline: EnumFontunderline

)


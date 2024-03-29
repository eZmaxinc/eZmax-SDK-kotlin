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

import eZmaxApi.models.EnumMinusFontunderline
import eZmaxApi.models.EnumMinusFontweight
import eZmaxApi.models.EnumMinusHorizontalalignment
import eZmaxApi.models.EnumMinusVerticalalignment

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


data class CommonMinusReportcellstyle (

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
    val eReportcellHorizontalalignment: EnumMinusHorizontalalignment,

    @Json(name = "eReportcellVerticalalignment")
    val eReportcellVerticalalignment: EnumMinusVerticalalignment,

    @Json(name = "eReportcellFontweight")
    val eReportcellFontweight: EnumMinusFontweight,

    @Json(name = "eReportcellFontunderline")
    val eReportcellFontunderline: EnumMinusFontunderline

)


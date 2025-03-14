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

import eZmaxApi.models.CommonReportcellstyle
import eZmaxApi.models.EnumReportdataType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A column in a Reportsection 
 *
 * @param objReportcellstyleDefault 
 * @param iReportcolumnWidth The Reportcolumn width in pixels
 * @param eReportcolumnType 
 */


data class CommonReportcolumn (

    @Json(name = "objReportcellstyleDefault")
    val objReportcellstyleDefault: CommonReportcellstyle,

    /* The Reportcolumn width in pixels */
    @Json(name = "iReportcolumnWidth")
    val iReportcolumnWidth: kotlin.Int,

    @Json(name = "eReportcolumnType")
    val eReportcolumnType: EnumReportdataType

) {


}


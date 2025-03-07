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

import eZmaxApi.models.CommonReport
import eZmaxApi.models.CommonReportcellstyle
import eZmaxApi.models.CommonReportgroupParameter

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A group of reports  Each Reportgroup is for a specific recipient or for a specific context.
 *
 * @param aObjReport 
 * @param aObjReportcellstyleCustom 
 * @param aObjReportgroupParameter 
 * @param sReportgroupFilename The name of the file
 */


data class CommonReportgroup (

    @Json(name = "a_objReport")
    val aObjReport: kotlin.collections.List<CommonReport>,

    @Json(name = "a_objReportcellstyleCustom")
    val aObjReportcellstyleCustom: kotlin.collections.List<CommonReportcellstyle>,

    @Json(name = "a_objReportgroupParameter")
    val aObjReportgroupParameter: kotlin.collections.List<CommonReportgroupParameter>,

    /* The name of the file */
    @Json(name = "sReportgroupFilename")
    val sReportgroupFilename: kotlin.String

) {


}


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

import eZmaxApi.models.CommonReportcell

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A row in a Reportsubsectionpart 
 *
 * @param aObjReportcell 
 * @param iReportrowHeight The reportrow height in pixels
 */


data class CommonReportrow (

    @Json(name = "a_objReportcell")
    val aObjReportcell: kotlin.collections.List<CommonReportcell>,

    /* The reportrow height in pixels */
    @Json(name = "iReportrowHeight")
    val iReportrowHeight: kotlin.Int

) {


}


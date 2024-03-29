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

import eZmaxApi.models.CommonMinusReportcell

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A row in a Reportsubsectionpart 
 *
 * @param aObjReportcell 
 * @param iReportrowHeight The reportrow height in pixels
 */


data class CommonMinusReportrow (

    @Json(name = "a_objReportcell")
    val aObjReportcell: kotlin.collections.List<CommonMinusReportcell>,

    /* The reportrow height in pixels */
    @Json(name = "iReportrowHeight")
    val iReportrowHeight: kotlin.Int

)


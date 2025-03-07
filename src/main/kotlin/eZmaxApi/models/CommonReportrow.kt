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
 * @param objVariableobject A Variable object without predefined property names
 * @param iReportrowHeight The reportrow height in pixels
 */


data class CommonReportrow (

    @Json(name = "a_objReportcell")
    val aObjReportcell: kotlin.collections.List<CommonReportcell>,

    /* A Variable object without predefined property names */
    @Json(name = "objVariableobject")
    val objVariableobject: kotlin.collections.Map<kotlin.String, kotlin.Any>,

    /* The reportrow height in pixels */
    @Json(name = "iReportrowHeight")
    val iReportrowHeight: kotlin.Int

) {


}


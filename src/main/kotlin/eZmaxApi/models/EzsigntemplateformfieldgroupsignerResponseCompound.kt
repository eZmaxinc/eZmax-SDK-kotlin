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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsigntemplateformfieldgroupsigner Object and children
 *
 * @param pkiEzsigntemplateformfieldgroupsignerID The unique ID of the Ezsigntemplateformfieldgroupsigner
 * @param fkiEzsigntemplatesignerID The unique ID of the Ezsigntemplatesigner
 */


data class EzsigntemplateformfieldgroupsignerResponseCompound (

    /* The unique ID of the Ezsigntemplateformfieldgroupsigner */
    @Json(name = "pkiEzsigntemplateformfieldgroupsignerID")
    val pkiEzsigntemplateformfieldgroupsignerID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "fkiEzsigntemplatesignerID")
    val fkiEzsigntemplatesignerID: kotlin.Int

)


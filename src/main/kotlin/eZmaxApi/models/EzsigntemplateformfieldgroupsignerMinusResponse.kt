/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models


import com.squareup.moshi.Json

/**
 * A Ezsigntemplateformfieldgroupsigner Object
 *
 * @param pkiEzsigntemplateformfieldgroupsignerID The unique ID of the Ezsigntemplateformfieldgroupsigner
 * @param fkiEzsigntemplatesignerID The unique ID of the Ezsigntemplatesigner
 */

data class EzsigntemplateformfieldgroupsignerMinusResponse (

    /* The unique ID of the Ezsigntemplateformfieldgroupsigner */
    @Json(name = "pkiEzsigntemplateformfieldgroupsignerID")
    val pkiEzsigntemplateformfieldgroupsignerID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "fkiEzsigntemplatesignerID")
    val fkiEzsigntemplatesignerID: kotlin.Int

)


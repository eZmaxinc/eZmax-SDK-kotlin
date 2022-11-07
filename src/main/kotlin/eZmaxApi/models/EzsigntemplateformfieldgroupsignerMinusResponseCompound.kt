/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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

import eZmaxApi.models.EzsigntemplateformfieldgroupsignerMinusResponse

import com.squareup.moshi.Json

/**
 * An Ezsigntemplateformfieldgroupsigner Object and children
 *
 * @param pkiEzsigntemplateformfieldgroupsignerID The unique ID of the Ezsigntemplateformfieldgroupsigner
 * @param fkiEzsigntemplatesignerID The unique ID of the Ezsigntemplatesigner
 */

data class EzsigntemplateformfieldgroupsignerMinusResponseCompound (

    /* The unique ID of the Ezsigntemplateformfieldgroupsigner */
    @Json(name = "pkiEzsigntemplateformfieldgroupsignerID")
    val pkiEzsigntemplateformfieldgroupsignerID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "fkiEzsigntemplatesignerID")
    val fkiEzsigntemplatesignerID: kotlin.Int

)


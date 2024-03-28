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
 * A Ezsigntemplateglobalsigner Object
 *
 * @param pkiEzsigntemplateglobalsignerID The unique ID of the Ezsigntemplateglobalsigner
 * @param fkiEzsigntemplateglobalID The unique ID of the Ezsigntemplateglobal
 * @param sEzsigntemplateglobalsignerDescription The description of the Ezsigntemplateglobalsigner
 */


data class EzsigntemplateglobalsignerResponseCompound (

    /* The unique ID of the Ezsigntemplateglobalsigner */
    @Json(name = "pkiEzsigntemplateglobalsignerID")
    val pkiEzsigntemplateglobalsignerID: kotlin.Int,

    /* The unique ID of the Ezsigntemplateglobal */
    @Json(name = "fkiEzsigntemplateglobalID")
    val fkiEzsigntemplateglobalID: kotlin.Int,

    /* The description of the Ezsigntemplateglobalsigner */
    @Json(name = "sEzsigntemplateglobalsignerDescription")
    val sEzsigntemplateglobalsignerDescription: kotlin.String

)


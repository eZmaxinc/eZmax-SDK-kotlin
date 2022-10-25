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

import eZmaxApi.models.EzsigntemplatesignerMinusRequest

import com.squareup.moshi.Json

/**
 * A Ezsigntemplatesigner Object and children
 *
 * @param fkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param sEzsigntemplatesignerDescription The description of the Ezsigntemplatesigner
 * @param pkiEzsigntemplatesignerID The unique ID of the Ezsigntemplatesigner
 */

data class EzsigntemplatesignerMinusRequestCompound (

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "fkiEzsigntemplateID")
    val fkiEzsigntemplateID: kotlin.Int,

    /* The description of the Ezsigntemplatesigner */
    @Json(name = "sEzsigntemplatesignerDescription")
    val sEzsigntemplatesignerDescription: kotlin.String,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "pkiEzsigntemplatesignerID")
    val pkiEzsigntemplatesignerID: kotlin.Int? = null

)


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

import eZmaxApi.models.EzsigntemplatepackagesignerMinusResponse

import com.squareup.moshi.Json

/**
 * A Ezsigntemplatepackagesigner Object
 *
 * @param pkiEzsigntemplatepackagesignerID The unique ID of the Ezsigntemplatepackagesigner
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param sEzsigntemplatepackagesignerDescription The description of the Ezsigntemplatepackagesigner
 */

data class EzsigntemplatepackagesignerMinusResponseCompound (

    /* The unique ID of the Ezsigntemplatepackagesigner */
    @Json(name = "pkiEzsigntemplatepackagesignerID")
    val pkiEzsigntemplatepackagesignerID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "fkiEzsigntemplatepackageID")
    val fkiEzsigntemplatepackageID: kotlin.Int,

    /* The description of the Ezsigntemplatepackagesigner */
    @Json(name = "sEzsigntemplatepackagesignerDescription")
    val sEzsigntemplatepackagesignerDescription: kotlin.String

)


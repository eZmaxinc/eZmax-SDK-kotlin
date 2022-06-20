/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
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

import eZmaxApi.models.EzsigntemplatepackagesignerMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}
 *
 * @param pkiEzsigntemplatepackagesignerID The unique ID of the Ezsigntemplatepackagesigner
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param sEzsigntemplatepackagesignerDescription The description of the Ezsigntemplatepackagesigner
 */

data class EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponseMinusMPayload (

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


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

import eZmaxApi.models.EzsignbulksendsignermappingMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID}
 *
 * @param pkiEzsignbulksendsignermappingID The unique ID of the Ezsignbulksendsignermapping
 * @param fkiEzsignbulksendID The unique ID of the Ezsignbulksend
 * @param sEzsignbulksendsignermappingDescription The description of the Ezsignbulksendsignermapping
 * @param fkiUserID The unique ID of the User
 */

data class EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponseMinusMPayload (

    /* The unique ID of the Ezsignbulksendsignermapping */
    @Json(name = "pkiEzsignbulksendsignermappingID")
    val pkiEzsignbulksendsignermappingID: kotlin.Int,

    /* The unique ID of the Ezsignbulksend */
    @Json(name = "fkiEzsignbulksendID")
    val fkiEzsignbulksendID: kotlin.Int,

    /* The description of the Ezsignbulksendsignermapping */
    @Json(name = "sEzsignbulksendsignermappingDescription")
    val sEzsignbulksendsignermappingDescription: kotlin.String,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int? = null

)

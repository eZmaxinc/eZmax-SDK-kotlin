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

import eZmaxApi.models.CommonMinusAudit

import com.squareup.moshi.Json

/**
 * An Ezsignbulksendtransmission Object
 *
 * @param pkiEzsignbulksendtransmissionID The unique ID of the Ezsignbulksendtransmission
 * @param fkiEzsignbulksendID The unique ID of the Ezsignbulksend
 * @param sEzsignbulksendtransmissionDescription The description of the Ezsignbulksendtransmission
 * @param iEzsignbulksendtransmissionErrors The number of errors during the Ezsignbulksendtransmission
 * @param objAudit 
 */

data class EzsignbulksendtransmissionMinusResponse (

    /* The unique ID of the Ezsignbulksendtransmission */
    @Json(name = "pkiEzsignbulksendtransmissionID")
    val pkiEzsignbulksendtransmissionID: kotlin.Int,

    /* The unique ID of the Ezsignbulksend */
    @Json(name = "fkiEzsignbulksendID")
    val fkiEzsignbulksendID: kotlin.Int,

    /* The description of the Ezsignbulksendtransmission */
    @Json(name = "sEzsignbulksendtransmissionDescription")
    val sEzsignbulksendtransmissionDescription: kotlin.String,

    /* The number of errors during the Ezsignbulksendtransmission */
    @Json(name = "iEzsignbulksendtransmissionErrors")
    val iEzsignbulksendtransmissionErrors: kotlin.Int,

    @Json(name = "objAudit")
    val objAudit: CommonMinusAudit

)

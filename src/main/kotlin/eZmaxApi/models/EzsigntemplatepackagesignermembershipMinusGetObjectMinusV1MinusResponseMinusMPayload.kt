/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
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

import eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}
 *
 * @param pkiEzsigntemplatepackagesignermembershipID The unique ID of the Ezsigntemplatepackagesignermembership
 * @param fkiEzsigntemplatepackagemembershipID The unique ID of the Ezsigntemplatepackagemembership
 * @param fkiEzsigntemplatepackagesignerID The unique ID of the Ezsigntemplatepackagesigner
 * @param fkiEzsigntemplatesignerID The unique ID of the Ezsigntemplatesigner
 * @param iEzsigntemplatepackagesignermembershipCopy The Copy number in case of multiple copies.
 */

data class EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponseMinusMPayload (

    /* The unique ID of the Ezsigntemplatepackagesignermembership */
    @Json(name = "pkiEzsigntemplatepackagesignermembershipID")
    val pkiEzsigntemplatepackagesignermembershipID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatepackagemembership */
    @Json(name = "fkiEzsigntemplatepackagemembershipID")
    val fkiEzsigntemplatepackagemembershipID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatepackagesigner */
    @Json(name = "fkiEzsigntemplatepackagesignerID")
    val fkiEzsigntemplatepackagesignerID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "fkiEzsigntemplatesignerID")
    val fkiEzsigntemplatesignerID: kotlin.Int,

    /* The Copy number in case of multiple copies. */
    @Json(name = "iEzsigntemplatepackagesignermembershipCopy")
    val iEzsigntemplatepackagesignermembershipCopy: kotlin.Int? = null

)


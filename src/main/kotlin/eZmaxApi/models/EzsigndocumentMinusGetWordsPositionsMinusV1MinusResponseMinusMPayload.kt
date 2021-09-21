/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.48
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

import eZmaxApi.models.WordPositionMinusResponse

import com.squareup.moshi.Json

/**
 * Payload for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions API Request
 *
 * @param aSWords An array of words with an array of pages and positions X,Y  They are returned with the sames words that was sent in the request.
 */

data class EzsigndocumentMinusGetWordsPositionsMinusV1MinusResponseMinusMPayload (

    /* An array of words with an array of pages and positions X,Y  They are returned with the sames words that was sent in the request. */
    @Json(name = "a_sWords")
    val aSWords: kotlin.collections.List<WordPositionMinusResponse>

)

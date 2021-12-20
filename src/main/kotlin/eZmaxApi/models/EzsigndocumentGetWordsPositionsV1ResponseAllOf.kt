/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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

import eZmaxApi.models.CustomMinusWordPositionWordMinusResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param mPayload Payload for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions API Request
 */

data class EzsigndocumentGetWordsPositionsV1ResponseAllOf (

    /* Payload for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions API Request */
    @Json(name = "mPayload")
    val mPayload: kotlin.collections.List<CustomMinusWordPositionWordMinusResponse>

)


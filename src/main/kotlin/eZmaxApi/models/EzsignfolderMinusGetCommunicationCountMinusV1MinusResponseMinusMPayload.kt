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

/**
 * Response for GET /1/object/ezsignfolder/{pkiEzsignfolderID}/getCommunicationCount
 *
 * @param iCommunicationCount The count of Communication.
 */


data class EzsignfolderMinusGetCommunicationCountMinusV1MinusResponseMinusMPayload (

    /* The count of Communication. */
    @Json(name = "iCommunicationCount")
    val iCommunicationCount: kotlin.Int

)

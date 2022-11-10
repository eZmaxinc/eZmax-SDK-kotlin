/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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


import com.squareup.moshi.Json

/**
 * Request for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/send
 *
 * @param tExtraMessage A custom text message that will be added to the email sent.
 */

data class EzsignfolderMinusSendMinusV1MinusRequest (

    /* A custom text message that will be added to the email sent. */
    @Json(name = "tExtraMessage")
    val tExtraMessage: kotlin.String

)


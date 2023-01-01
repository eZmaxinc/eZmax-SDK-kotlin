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

import eZmaxApi.models.FieldMinusECommunicationexternalrecipientType
import eZmaxApi.models.PhoneMinusResponseCompound

import com.squareup.moshi.Json

/**
 * A Communicationexternalrecipient Object
 *
 * @param pkiCommunicationexternalrecipientID The unique ID of the Communicationexternalrecipient
 * @param eCommunicationexternalrecipientType 
 * @param sCommunicationexternalrecipientName The Name of the Communicationexternalrecipient
 * @param sEmailAddress The email address.
 * @param objPhoneSms 
 */


data class CommunicationexternalrecipientMinusResponse (

    /* The unique ID of the Communicationexternalrecipient */
    @Json(name = "pkiCommunicationexternalrecipientID")
    val pkiCommunicationexternalrecipientID: kotlin.Int,

    @Json(name = "eCommunicationexternalrecipientType")
    val eCommunicationexternalrecipientType: FieldMinusECommunicationexternalrecipientType,

    /* The Name of the Communicationexternalrecipient */
    @Json(name = "sCommunicationexternalrecipientName")
    val sCommunicationexternalrecipientName: kotlin.String,

    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String? = null,

    @Json(name = "objPhoneSms")
    val objPhoneSms: PhoneMinusResponseCompound? = null

)

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

import eZmaxApi.models.DescriptionstaticMinusResponseCompound
import eZmaxApi.models.EmailstaticMinusResponseCompound
import eZmaxApi.models.FieldMinusECommunicationexternalrecipientType
import eZmaxApi.models.PhonestaticMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Communicationexternalrecipient Object
 *
 * @param pkiCommunicationexternalrecipientID The unique ID of the Communicationexternalrecipient
 * @param eCommunicationexternalrecipientType 
 * @param objDescriptionstatic 
 * @param objEmailstatic 
 * @param objPhonestatic 
 */


data class CommunicationexternalrecipientMinusResponse (

    /* The unique ID of the Communicationexternalrecipient */
    @Json(name = "pkiCommunicationexternalrecipientID")
    val pkiCommunicationexternalrecipientID: kotlin.Int,

    @Json(name = "eCommunicationexternalrecipientType")
    val eCommunicationexternalrecipientType: FieldMinusECommunicationexternalrecipientType,

    @Json(name = "objDescriptionstatic")
    val objDescriptionstatic: DescriptionstaticMinusResponseCompound,

    @Json(name = "objEmailstatic")
    val objEmailstatic: EmailstaticMinusResponseCompound? = null,

    @Json(name = "objPhonestatic")
    val objPhonestatic: PhonestaticMinusResponseCompound? = null

)


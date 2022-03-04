/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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

import eZmaxApi.models.EzsigndocumentlogMinusResponse
import eZmaxApi.models.FieldMinusEEzsigndocumentlogType

import com.squareup.moshi.Json

/**
 * An Ezsigndocumentlog Object and children to create a complete structure
 *
 * @param fkiUserID The unique ID of the User
 * @param fkiEzsignsignerID The unique ID of the Ezsignsigner
 * @param dtEzsigndocumentlogDatetime The date and time at which the event was logged
 * @param eEzsigndocumentlogType 
 * @param sEzsigndocumentlogDetail The detail of the Ezsigndocumentlog
 * @param sEzsigndocumentlogLastname The last name of the User or Ezsignsigner
 * @param sEzsigndocumentlogFirstname The first name of the User or Ezsignsigner
 * @param sEzsigndocumentlogIP Represent an IP address.
 */

data class EzsigndocumentlogMinusResponseCompound (

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int?,

    /* The unique ID of the Ezsignsigner */
    @Json(name = "fkiEzsignsignerID")
    val fkiEzsignsignerID: kotlin.Int?,

    /* The date and time at which the event was logged */
    @Json(name = "dtEzsigndocumentlogDatetime")
    val dtEzsigndocumentlogDatetime: kotlin.String,

    @Json(name = "eEzsigndocumentlogType")
    val eEzsigndocumentlogType: FieldMinusEEzsigndocumentlogType,

    /* The detail of the Ezsigndocumentlog */
    @Json(name = "sEzsigndocumentlogDetail")
    val sEzsigndocumentlogDetail: kotlin.String,

    /* The last name of the User or Ezsignsigner */
    @Json(name = "sEzsigndocumentlogLastname")
    val sEzsigndocumentlogLastname: kotlin.String,

    /* The first name of the User or Ezsignsigner */
    @Json(name = "sEzsigndocumentlogFirstname")
    val sEzsigndocumentlogFirstname: kotlin.String,

    /* Represent an IP address. */
    @Json(name = "sEzsigndocumentlogIP")
    val sEzsigndocumentlogIP: kotlin.String

)


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

import eZmaxApi.models.MultilingualMinusNotificationsubsectionName

import com.squareup.moshi.Json

/**
 * A Notificationsubsection Object
 *
 * @param pkiNotificationsubsectionID The unique ID of the Notificationsubsection
 * @param fkiNotificationsectionID The unique ID of the Notificationsection
 * @param sNotificationsubsectionNameX The name of the Notificationsubsection in the language of the requester
 * @param objNotificationsubsectionName 
 * @param sNotificationsectionNameX The name of the Notificationsection in the language of the requester
 */

data class NotificationsubsectionMinusResponse (

    /* The unique ID of the Notificationsubsection */
    @Json(name = "pkiNotificationsubsectionID")
    val pkiNotificationsubsectionID: kotlin.Int,

    /* The unique ID of the Notificationsection */
    @Json(name = "fkiNotificationsectionID")
    val fkiNotificationsectionID: kotlin.Int,

    /* The name of the Notificationsubsection in the language of the requester */
    @Json(name = "sNotificationsubsectionNameX")
    val sNotificationsubsectionNameX: kotlin.String,

    @Json(name = "objNotificationsubsectionName")
    val objNotificationsubsectionName: MultilingualMinusNotificationsubsectionName? = null,

    /* The name of the Notificationsection in the language of the requester */
    @Json(name = "sNotificationsectionNameX")
    val sNotificationsectionNameX: kotlin.String? = null

)


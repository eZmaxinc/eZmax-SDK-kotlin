/**
 * eZmax API Definition (Full)
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


import com.squareup.moshi.Json

/**
 * A Notificationtest Object
 *
 * @param pkiNotificationtestID The unique ID of the Notificationtest
 * @param fkiNotificationsubsectionID The unique ID of the Notificationsubsection
 * @param sNotificationtestFunction The function name of the Notificationtest
 * @param sNotificationtestNameX The name of the Notificationtest in the language of the requester
 */

data class NotificationtestMinusResponse (

    /* The unique ID of the Notificationtest */
    @Json(name = "pkiNotificationtestID")
    val pkiNotificationtestID: kotlin.Int,

    /* The unique ID of the Notificationsubsection */
    @Json(name = "fkiNotificationsubsectionID")
    val fkiNotificationsubsectionID: kotlin.Int,

    /* The function name of the Notificationtest */
    @Json(name = "sNotificationtestFunction")
    val sNotificationtestFunction: kotlin.String,

    /* The name of the Notificationtest in the language of the requester */
    @Json(name = "sNotificationtestNameX")
    val sNotificationtestNameX: kotlin.String

)


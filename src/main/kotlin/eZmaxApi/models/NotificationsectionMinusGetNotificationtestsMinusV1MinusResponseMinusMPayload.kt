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

import eZmaxApi.models.CustomMinusNotificationsubsectiongetnotificationtestsMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/notificationsection/{pkiNotificationsectionID}/getNotificationtests
 *
 * @param aObjNotificationsubsection 
 */


data class NotificationsectionMinusGetNotificationtestsMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objNotificationsubsection")
    val aObjNotificationsubsection: kotlin.collections.List<CustomMinusNotificationsubsectiongetnotificationtestsMinusResponse>

)


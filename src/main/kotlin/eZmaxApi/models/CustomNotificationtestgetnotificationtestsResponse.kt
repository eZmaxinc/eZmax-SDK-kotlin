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

import eZmaxApi.models.FieldENotificationpreferenceStatus
import eZmaxApi.models.MultilingualNotificationtestName

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Notificationtest Object in the context of getNotificationtests
 *
 * @param pkiNotificationtestID The unique ID of the Notificationtest
 * @param objNotificationtestName 
 * @param fkiNotificationsubsectionID The unique ID of the Notificationsubsection
 * @param sNotificationtestFunction The function name of the Notificationtest
 * @param sNotificationtestNameX The name of the Notificationtest in the language of the requester
 * @param eNotificationpreferenceStatus 
 * @param iNotificationtest The number of elements returned by the Notificationtest
 */


data class CustomNotificationtestgetnotificationtestsResponse (

    /* The unique ID of the Notificationtest */
    @Json(name = "pkiNotificationtestID")
    val pkiNotificationtestID: kotlin.Int,

    @Json(name = "objNotificationtestName")
    val objNotificationtestName: MultilingualNotificationtestName,

    /* The unique ID of the Notificationsubsection */
    @Json(name = "fkiNotificationsubsectionID")
    val fkiNotificationsubsectionID: kotlin.Int,

    /* The function name of the Notificationtest */
    @Json(name = "sNotificationtestFunction")
    val sNotificationtestFunction: kotlin.String,

    /* The name of the Notificationtest in the language of the requester */
    @Json(name = "sNotificationtestNameX")
    val sNotificationtestNameX: kotlin.String,

    @Json(name = "eNotificationpreferenceStatus")
    val eNotificationpreferenceStatus: FieldENotificationpreferenceStatus,

    /* The number of elements returned by the Notificationtest */
    @Json(name = "iNotificationtest")
    val iNotificationtest: kotlin.Int

)

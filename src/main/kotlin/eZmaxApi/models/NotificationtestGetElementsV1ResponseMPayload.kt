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
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/notificationtest/{pkiNotificationtestID}/getElements
 *
 * @param pkiNotificationtestID The unique ID of the Notificationtest
 * @param sNotificationtestFunction The function name of the Notificationtest
 * @param aSVariableobjectProperty 
 * @param aObjVariableobject 
 */


data class NotificationtestGetElementsV1ResponseMPayload (

    /* The unique ID of the Notificationtest */
    @Json(name = "pkiNotificationtestID")
    val pkiNotificationtestID: kotlin.Int,

    /* The function name of the Notificationtest */
    @Json(name = "sNotificationtestFunction")
    val sNotificationtestFunction: kotlin.String,

    @Json(name = "a_sVariableobjectProperty")
    val aSVariableobjectProperty: kotlin.collections.List<kotlin.String>,

    @Json(name = "a_objVariableobject")
    val aObjVariableobject: kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>

) {


}


/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
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
 * Name of the Notificationtest
 *
 * @param sNotificationtestName1 The name of the Notificationtest in French
 * @param sNotificationtestName2 The name of the Notificationtest in English
 */

data class MultilingualMinusNotificationtestName (

    /* The name of the Notificationtest in French */
    @Json(name = "sNotificationtestName1")
    val sNotificationtestName1: kotlin.String? = null,

    /* The name of the Notificationtest in English */
    @Json(name = "sNotificationtestName2")
    val sNotificationtestName2: kotlin.String? = null

)


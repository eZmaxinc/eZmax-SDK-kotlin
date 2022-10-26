/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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
 * Name of the Notificationsubsection
 *
 * @param sNotificationsubsectionName1 The name of the Notificationsubsection in French
 * @param sNotificationsubsectionName2 The name of the Notificationsubsection in English
 */

data class MultilingualMinusNotificationsubsectionName (

    /* The name of the Notificationsubsection in French */
    @Json(name = "sNotificationsubsectionName1")
    val sNotificationsubsectionName1: kotlin.String? = null,

    /* The name of the Notificationsubsection in English */
    @Json(name = "sNotificationsubsectionName2")
    val sNotificationsubsectionName2: kotlin.String? = null

)


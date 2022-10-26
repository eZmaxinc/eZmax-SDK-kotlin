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

import eZmaxApi.models.FieldMinusENotificationpreferenceStatus

import com.squareup.moshi.Json

/**
 * 
 *
 * @param eNotificationpreferenceStatus 
 * @param iNotificationtest The number of elements returned by the Notificationtest
 */

data class CustomNotificationtestgetnotificationtestsResponseAllOf (

    @Json(name = "eNotificationpreferenceStatus")
    val eNotificationpreferenceStatus: FieldMinusENotificationpreferenceStatus,

    /* The number of elements returned by the Notificationtest */
    @Json(name = "iNotificationtest")
    val iNotificationtest: kotlin.Int

)


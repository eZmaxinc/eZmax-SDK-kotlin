/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
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

import eZmaxApi.models.AttemptMinusResponse

import com.squareup.moshi.Json

/**
 * An Attempt object and children to create a complete structure
 *
 * @param dtAttemptStart Represent a Date Time. The timezone is the one configured in the User's profile.
 * @param sAttemptResult The Success or Failure message of the attempt when we tried to call the URL to deliver the webhook event.
 * @param iAttemptDuration The number of second it took to process the webhook or get an error
 */

data class AttemptMinusResponseCompound (

    /* Represent a Date Time. The timezone is the one configured in the User's profile. */
    @Json(name = "dtAttemptStart")
    val dtAttemptStart: kotlin.String,

    /* The Success or Failure message of the attempt when we tried to call the URL to deliver the webhook event. */
    @Json(name = "sAttemptResult")
    val sAttemptResult: kotlin.String,

    /* The number of second it took to process the webhook or get an error */
    @Json(name = "iAttemptDuration")
    val iAttemptDuration: kotlin.Int

)


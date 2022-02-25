/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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
 * Payload for the /1/module/user/createEzsignuser API Request
 *
 * @param aSEmailAddressSuccess An array of email addresses that succeeded.
 * @param aSEmailAddressFailure An array of email addresses that failed.
 */

data class UserMinusCreateEzsignuserMinusV1MinusResponseMinusMPayload (

    /* An array of email addresses that succeeded. */
    @Json(name = "a_sEmailAddressSuccess")
    val aSEmailAddressSuccess: kotlin.collections.List<kotlin.String>,

    /* An array of email addresses that failed. */
    @Json(name = "a_sEmailAddressFailure")
    val aSEmailAddressFailure: kotlin.collections.List<kotlin.String>

)


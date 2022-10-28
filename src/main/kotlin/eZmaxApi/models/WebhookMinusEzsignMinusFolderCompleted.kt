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

import eZmaxApi.models.AttemptMinusResponseCompound
import eZmaxApi.models.CommonMinusWebhook
import eZmaxApi.models.CustomMinusWebhookMinusResponse
import eZmaxApi.models.EzsignfolderMinusResponse
import eZmaxApi.models.WebhookEzsignFolderCompletedAllOf

import com.squareup.moshi.Json

/**
 * This is the base Webhook object
 *
 * @param objEzsignfolder 
 * @param objWebhook 
 * @param aObjAttempt An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt.
 */

data class WebhookMinusEzsignMinusFolderCompleted (

    @Json(name = "objEzsignfolder")
    val objEzsignfolder: EzsignfolderMinusResponse,

    @Json(name = "objWebhook")
    val objWebhook: CustomMinusWebhookMinusResponse,

    /* An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt. */
    @Json(name = "a_objAttempt")
    val aObjAttempt: kotlin.collections.List<AttemptMinusResponseCompound>

)


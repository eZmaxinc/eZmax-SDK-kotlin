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

import eZmaxApi.models.AttemptResponseCompound
import eZmaxApi.models.CustomWebhookResponse
import eZmaxApi.models.EzsignsignatureResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * This is the base Webhook object
 *
 * @param objWebhook 
 * @param aObjAttempt An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt.
 * @param objEzsignsignature 
 */


data class WebhookEzsignSignatureSigned (

    @Json(name = "objWebhook")
    val objWebhook: CustomWebhookResponse,

    /* An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt. */
    @Json(name = "a_objAttempt")
    val aObjAttempt: kotlin.collections.List<AttemptResponseCompound>,

    @Json(name = "objEzsignsignature")
    val objEzsignsignature: EzsignsignatureResponse

) {


}


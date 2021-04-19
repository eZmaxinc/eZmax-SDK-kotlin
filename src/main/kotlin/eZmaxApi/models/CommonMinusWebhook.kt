/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.40
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.models

import eZmaxApi.models.AttemptMinusResponse
import eZmaxApi.models.WebhookMinusResponse

import com.squareup.moshi.Json

/**
 * This is the base Webhook object
 * @param objWebhook 
 * @param aObjAttempt An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt.
 */

data class CommonMinusWebhook (
    @Json(name = "objWebhook")
    val objWebhook: WebhookMinusResponse,
    /* An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt. */
    @Json(name = "a_objAttempt")
    val aObjAttempt: kotlin.collections.List<AttemptMinusResponse>
)


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

import eZmaxApi.models.CustomCommunicationrecipientsrecipientResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Generic CommunicationrecipientsGroup Response
 *
 * @param sCommunicationrecipientsgroupLabel The label for the Communicationrecipientsgroup
 * @param aObjCommunicationrecipientsrecipient 
 */


data class CustomCommunicationrecipientsgroupResponse (

    /* The label for the Communicationrecipientsgroup */
    @Json(name = "sCommunicationrecipientsgroupLabel")
    val sCommunicationrecipientsgroupLabel: kotlin.String,

    @Json(name = "a_objCommunicationrecipientsrecipient")
    val aObjCommunicationrecipientsrecipient: kotlin.collections.List<CustomCommunicationrecipientsrecipientResponse>

)


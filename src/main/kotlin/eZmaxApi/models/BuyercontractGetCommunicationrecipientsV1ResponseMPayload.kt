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

import eZmaxApi.models.CustomCommunicationrecipientsgroupResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationrecipients
 *
 * @param aObjCommunicationrecipientsgroup 
 */


data class BuyercontractGetCommunicationrecipientsV1ResponseMPayload (

    @Json(name = "a_objCommunicationrecipientsgroup")
    val aObjCommunicationrecipientsgroup: kotlin.collections.List<CustomCommunicationrecipientsgroupResponse>

) {


}


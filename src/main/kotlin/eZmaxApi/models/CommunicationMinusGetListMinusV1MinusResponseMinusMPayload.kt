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

import eZmaxApi.models.CommunicationMinusListElement

import com.squareup.moshi.Json

/**
 * Payload for GET /1/module/communication/getList
 *
 * @param aObjCommunication 
 */


data class CommunicationMinusGetListMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objCommunication")
    val aObjCommunication: kotlin.collections.List<CommunicationMinusListElement>

)


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

import eZmaxApi.models.CustomMinusFormDataDocumentMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getFormData
 *
 * @param objFormDataDocument 
 */


data class EzsigndocumentMinusGetFormDataMinusV1MinusResponseMinusMPayload (

    @Json(name = "objFormDataDocument")
    val objFormDataDocument: CustomMinusFormDataDocumentMinusResponse

)


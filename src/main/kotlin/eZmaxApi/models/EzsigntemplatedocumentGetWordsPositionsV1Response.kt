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

import eZmaxApi.models.CommonResponseObjDebug
import eZmaxApi.models.CommonResponseObjDebugPayload
import eZmaxApi.models.CustomWordPositionWordResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for POST /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions
 *
 * @param objDebugPayload 
 * @param mPayload Payload for POST /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions
 * @param objDebug 
 */


data class EzsigntemplatedocumentGetWordsPositionsV1Response (

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonResponseObjDebugPayload,

    /* Payload for POST /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions */
    @Json(name = "mPayload")
    val mPayload: kotlin.collections.List<CustomWordPositionWordResponse>,

    @Json(name = "objDebug")
    val objDebug: CommonResponseObjDebug? = null

)


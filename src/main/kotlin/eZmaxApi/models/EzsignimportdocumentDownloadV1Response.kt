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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/ezsignimportdocument/{pkiEzsignimportdocumentID}/download
 *
 * @param objDebugPayload 
 * @param mPayload Response for GET /1/object/ezsignimportdocument/{pkiEzsignimportdocumentID}/download
 * @param objDebug 
 */


data class EzsignimportdocumentDownloadV1Response (

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonResponseObjDebugPayload,

    /* Response for GET /1/object/ezsignimportdocument/{pkiEzsignimportdocumentID}/download */
    @Json(name = "mPayload")
    val mPayload: kotlin.Any,

    @Json(name = "objDebug")
    val objDebug: CommonResponseObjDebug? = null

) {


}


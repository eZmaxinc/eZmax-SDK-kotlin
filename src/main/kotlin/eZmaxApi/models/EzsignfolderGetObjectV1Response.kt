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
import eZmaxApi.models.EzsignfolderResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/ezsignfolder/{pkiEzsignfolderID}
 *
 * @param objDebugPayload 
 * @param mPayload Payload for GET /1/object/ezsignfolder/{pkiEzsignfolderID}
 * @param objDebug 
 */


data class EzsignfolderGetObjectV1Response (

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonResponseObjDebugPayload,

    /* Payload for GET /1/object/ezsignfolder/{pkiEzsignfolderID} */
    @Json(name = "mPayload")
    val mPayload: EzsignfolderResponseCompound,

    @Json(name = "objDebug")
    val objDebug: CommonResponseObjDebug? = null

) {


}


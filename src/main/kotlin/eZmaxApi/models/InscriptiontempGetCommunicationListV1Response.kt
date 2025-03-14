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
import eZmaxApi.models.CommonResponseObjDebugPayloadGetList
import eZmaxApi.models.InscriptiontempGetCommunicationListV1ResponseMPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationList
 *
 * @param objDebugPayload 
 * @param mPayload 
 * @param objDebug 
 */


data class InscriptiontempGetCommunicationListV1Response (

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonResponseObjDebugPayloadGetList,

    @Json(name = "mPayload")
    val mPayload: InscriptiontempGetCommunicationListV1ResponseMPayload,

    @Json(name = "objDebug")
    val objDebug: CommonResponseObjDebug? = null

) {


}


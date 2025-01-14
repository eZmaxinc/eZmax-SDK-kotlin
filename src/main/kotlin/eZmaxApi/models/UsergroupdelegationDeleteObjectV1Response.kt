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
 * Response for DELETE /1/object/usergroupdelegation/{pkiUsergroupdelegationID}
 *
 * @param objDebugPayload 
 * @param objDebug 
 */


data class UsergroupdelegationDeleteObjectV1Response (

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonResponseObjDebugPayload,

    @Json(name = "objDebug")
    val objDebug: CommonResponseObjDebug? = null

) {


}


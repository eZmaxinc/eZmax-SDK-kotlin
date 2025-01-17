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

import eZmaxApi.models.CommonResponse
import eZmaxApi.models.CommonResponseObjDebug
import eZmaxApi.models.CommonResponseObjDebugPayload
import eZmaxApi.models.UsergroupEditPermissionsV1ResponseMPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for PUT /1/object/usergroup/{pkiUsergroupID}/editPermissions
 *
 * @param objDebugPayload 
 * @param mPayload 
 * @param objDebug 
 */


data class UsergroupEditPermissionsV1Response (

    @Json(name = "objDebugPayload")
    override val objDebugPayload: CommonResponseObjDebugPayload,

    @Json(name = "mPayload")
    val mPayload: UsergroupEditPermissionsV1ResponseMPayload,

    @Json(name = "objDebug")
    override val objDebug: CommonResponseObjDebug? = null

) : CommonResponse {


}


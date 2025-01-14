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

import eZmaxApi.models.ApikeyGenerateDelegatedCredentialsV1ResponseMPayload
import eZmaxApi.models.CommonResponseObjDebug
import eZmaxApi.models.CommonResponseObjDebugPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for POST /1/object/apikey/generateDelegatedCredentials
 *
 * @param objDebugPayload 
 * @param mPayload 
 * @param objDebug 
 */


data class ApikeyGenerateDelegatedCredentialsV1Response (

    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonResponseObjDebugPayload,

    @Json(name = "mPayload")
    val mPayload: ApikeyGenerateDelegatedCredentialsV1ResponseMPayload,

    @Json(name = "objDebug")
    val objDebug: CommonResponseObjDebug? = null

) {


}


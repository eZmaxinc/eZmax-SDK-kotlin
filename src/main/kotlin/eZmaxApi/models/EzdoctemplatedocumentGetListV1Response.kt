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

import eZmaxApi.models.CommonResponseGetList
import eZmaxApi.models.CommonResponseObjDebug
import eZmaxApi.models.CommonResponseObjDebugPayloadGetList
import eZmaxApi.models.EzdoctemplatedocumentGetListV1ResponseMPayload

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/ezdoctemplatedocument/getList
 *
 * @param objDebugPayload 
 * @param mPayload 
 * @param objDebug 
 */


data class EzdoctemplatedocumentGetListV1Response (

    @Json(name = "objDebugPayload")
    override val objDebugPayload: CommonResponseObjDebugPayloadGetList,

    @Json(name = "mPayload")
    val mPayload: EzdoctemplatedocumentGetListV1ResponseMPayload,

    @Json(name = "objDebug")
    override val objDebug: CommonResponseObjDebug? = null

) : CommonResponseGetList {


}


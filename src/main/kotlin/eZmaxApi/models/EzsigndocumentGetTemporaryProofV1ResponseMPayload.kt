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

import eZmaxApi.models.EzsigndocumentlogResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof
 *
 * @param aObjEzsigndocumentlog 
 */


data class EzsigndocumentGetTemporaryProofV1ResponseMPayload (

    @Json(name = "a_objEzsigndocumentlog")
    val aObjEzsigndocumentlog: kotlin.collections.List<EzsigndocumentlogResponseCompound>

) {


}


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

import eZmaxApi.models.EzdoctemplatedocumentResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID}
 *
 * @param objEzdoctemplatedocument 
 */


data class EzdoctemplatedocumentGetObjectV2ResponseMPayload (

    @Json(name = "objEzdoctemplatedocument")
    val objEzdoctemplatedocument: EzdoctemplatedocumentResponseCompound

) {


}


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

import eZmaxApi.models.EzsignformfieldgroupResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}
 *
 * @param objEzsignformfieldgroup 
 */


data class EzsignformfieldgroupGetObjectV2ResponseMPayload (

    @Json(name = "objEzsignformfieldgroup")
    val objEzsignformfieldgroup: EzsignformfieldgroupResponseCompound

) {


}


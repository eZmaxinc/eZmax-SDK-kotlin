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

import eZmaxApi.models.UsergroupMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/usergroup/{pkiUsergroupID}
 *
 * @param objUsergroup 
 */


data class UsergroupMinusGetObjectMinusV2MinusResponseMinusMPayload (

    @Json(name = "objUsergroup")
    val objUsergroup: UsergroupMinusResponseCompound

)


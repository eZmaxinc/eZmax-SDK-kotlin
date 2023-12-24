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

import eZmaxApi.models.ScimGroupMember

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param displayName The Name of the Usergroup in the language of the requester
 * @param id 
 * @param members 
 */


data class ScimGroup (

    /* The Name of the Usergroup in the language of the requester */
    @Json(name = "displayName")
    val displayName: kotlin.String,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "members")
    val members: kotlin.collections.List<ScimGroupMember>? = null

)

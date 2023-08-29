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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Usergroup List Element
 *
 * @param pkiUsergroupID The unique ID of the Usergroup
 * @param sUsergroupNameX The Name of the Usergroup in the language of the requester
 * @param iCountUser Number of users in group
 */


data class UsergroupListElement (

    /* The unique ID of the Usergroup */
    @Json(name = "pkiUsergroupID")
    val pkiUsergroupID: kotlin.Int,

    /* The Name of the Usergroup in the language of the requester */
    @Json(name = "sUsergroupNameX")
    val sUsergroupNameX: kotlin.String,

    /* Number of users in group */
    @Json(name = "iCountUser")
    val iCountUser: kotlin.Int

)


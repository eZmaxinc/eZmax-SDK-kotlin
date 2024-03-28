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
 * A Usergroupexternal AutocompleteElement Response
 *
 * @param pkiUsergroupexternalID The unique ID of the Usergroupexternal
 * @param sUsergroupexternalName The name of the Usergroupexternal
 * @param bUsergroupexternalIsactive Whether the Usergroupexternal is active or not
 */


data class UsergroupexternalAutocompleteElementResponse (

    /* The unique ID of the Usergroupexternal */
    @Json(name = "pkiUsergroupexternalID")
    val pkiUsergroupexternalID: kotlin.Int,

    /* The name of the Usergroupexternal */
    @Json(name = "sUsergroupexternalName")
    val sUsergroupexternalName: kotlin.String,

    /* Whether the Usergroupexternal is active or not */
    @Json(name = "bUsergroupexternalIsactive")
    val bUsergroupexternalIsactive: kotlin.Boolean

)

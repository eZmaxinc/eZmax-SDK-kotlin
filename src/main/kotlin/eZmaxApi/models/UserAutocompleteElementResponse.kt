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

import eZmaxApi.models.FieldEUserType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A User AutocompleteElement Response
 *
 * @param eUserType 
 * @param sUserName The description of the User in the language of the requester
 * @param pkiUserID The unique ID of the User
 * @param bUserIsactive Whether the User is active or not
 */


data class UserAutocompleteElementResponse (

    @Json(name = "eUserType")
    val eUserType: FieldEUserType,

    /* The description of the User in the language of the requester */
    @Json(name = "sUserName")
    val sUserName: kotlin.String,

    /* The unique ID of the User */
    @Json(name = "pkiUserID")
    val pkiUserID: kotlin.Int,

    /* Whether the User is active or not */
    @Json(name = "bUserIsactive")
    val bUserIsactive: kotlin.Boolean

) {


}


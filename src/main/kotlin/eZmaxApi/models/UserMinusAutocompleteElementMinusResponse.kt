/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.FieldMinusEUserType

import com.squareup.moshi.Json

/**
 * A User AutocompleteElement Response
 *
 * @param eUserType 
 * @param sUserName The description of the User in the language of the requester
 * @param pkiUserID The unique ID of the User
 * @param bUserIsactive Whether the User is active or not
 */

data class UserMinusAutocompleteElementMinusResponse (

    @Json(name = "eUserType")
    val eUserType: FieldMinusEUserType,

    /* The description of the User in the language of the requester */
    @Json(name = "sUserName")
    val sUserName: kotlin.String,

    /* The unique ID of the User */
    @Json(name = "pkiUserID")
    val pkiUserID: kotlin.Int,

    /* Whether the User is active or not */
    @Json(name = "bUserIsactive")
    val bUserIsactive: kotlin.Boolean

)


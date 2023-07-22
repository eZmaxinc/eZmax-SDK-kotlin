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

import eZmaxApi.models.MultilingualMinusApikeyDescription

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Apikey Object
 *
 * @param fkiUserID The unique ID of the User
 * @param objApikeyDescription 
 * @param pkiApikeyID The unique ID of the Apikey
 * @param bApikeyIsactive Whether the apikey is active or not
 */


data class ApikeyMinusRequest (

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int,

    @Json(name = "objApikeyDescription")
    val objApikeyDescription: MultilingualMinusApikeyDescription,

    /* The unique ID of the Apikey */
    @Json(name = "pkiApikeyID")
    val pkiApikeyID: kotlin.Int? = null,

    /* Whether the apikey is active or not */
    @Json(name = "bApikeyIsactive")
    val bApikeyIsactive: kotlin.Boolean? = null

)


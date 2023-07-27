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

import eZmaxApi.models.MultilingualMinusEzsignsignergroupDescription

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsignsignergroup Object
 *
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param objEzsignsignergroupDescription 
 * @param pkiEzsignsignergroupID The unique ID of the Ezsignsignergroup
 */


data class EzsignsignergroupMinusRequest (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,

    @Json(name = "objEzsignsignergroupDescription")
    val objEzsignsignergroupDescription: MultilingualMinusEzsignsignergroupDescription,

    /* The unique ID of the Ezsignsignergroup */
    @Json(name = "pkiEzsignsignergroupID")
    val pkiEzsignsignergroupID: kotlin.Int? = null

)


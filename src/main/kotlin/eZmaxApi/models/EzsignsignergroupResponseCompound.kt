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

import eZmaxApi.models.MultilingualEzsignsignergroupDescription

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsignsignergroup Object
 *
 * @param pkiEzsignsignergroupID The unique ID of the Ezsignsignergroup
 * @param objEzsignsignergroupDescription 
 * @param sEzsignsignergroupDescriptionX The Description of the Ezsignsignergroup in the language of the requester
 */


data class EzsignsignergroupResponseCompound (

    /* The unique ID of the Ezsignsignergroup */
    @Json(name = "pkiEzsignsignergroupID")
    val pkiEzsignsignergroupID: kotlin.Int,

    @Json(name = "objEzsignsignergroupDescription")
    val objEzsignsignergroupDescription: MultilingualEzsignsignergroupDescription,

    /* The Description of the Ezsignsignergroup in the language of the requester */
    @Json(name = "sEzsignsignergroupDescriptionX")
    val sEzsignsignergroupDescriptionX: kotlin.String? = null

)

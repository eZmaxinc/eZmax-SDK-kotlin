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

import eZmaxApi.models.MultilingualEzsignsigningreasonDescription

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsignsigningreason Object
 *
 * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
 * @param objEzsignsigningreasonDescription 
 * @param bEzsignsigningreasonIsactive Whether the ezsignsigningreason is active or not
 */


data class EzsignsigningreasonResponse (

    /* The unique ID of the Ezsignsigningreason */
    @Json(name = "pkiEzsignsigningreasonID")
    val pkiEzsignsigningreasonID: kotlin.Int,

    @Json(name = "objEzsignsigningreasonDescription")
    val objEzsignsigningreasonDescription: MultilingualEzsignsigningreasonDescription,

    /* Whether the ezsignsigningreason is active or not */
    @Json(name = "bEzsignsigningreasonIsactive")
    val bEzsignsigningreasonIsactive: kotlin.Boolean

) {


}


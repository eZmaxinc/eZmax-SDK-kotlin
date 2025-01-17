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

import eZmaxApi.models.EzsignsigningreasonRequest
import eZmaxApi.models.MultilingualEzsignsigningreasonDescription

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsignsigningreason Object and children
 *
 * @param objEzsignsigningreasonDescription 
 * @param bEzsignsigningreasonIsactive Whether the ezsignsigningreason is active or not
 * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
 */


class EzsignsigningreasonRequestCompound (

    @Json(name = "objEzsignsigningreasonDescription")
    override val objEzsignsigningreasonDescription: MultilingualEzsignsigningreasonDescription,

    /* Whether the ezsignsigningreason is active or not */
    @Json(name = "bEzsignsigningreasonIsactive")
    override val bEzsignsigningreasonIsactive: kotlin.Boolean,

    /* The unique ID of the Ezsignsigningreason */
    @Json(name = "pkiEzsignsigningreasonID")
    override val pkiEzsignsigningreasonID: kotlin.Int? = null

) : EzsignsigningreasonRequest {


}


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
 * A Ezsignsigningreason List Element
 *
 * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
 * @param sEzsignsigningreasonDescriptionX The description of the Ezsignsigningreason in the language of the requester
 * @param bEzsignsigningreasonIsactive Whether the ezsignsigningreason is active or not
 */


data class EzsignsigningreasonListElement (

    /* The unique ID of the Ezsignsigningreason */
    @Json(name = "pkiEzsignsigningreasonID")
    val pkiEzsignsigningreasonID: kotlin.Int,

    /* The description of the Ezsignsigningreason in the language of the requester */
    @Json(name = "sEzsignsigningreasonDescriptionX")
    val sEzsignsigningreasonDescriptionX: kotlin.String,

    /* Whether the ezsignsigningreason is active or not */
    @Json(name = "bEzsignsigningreasonIsactive")
    val bEzsignsigningreasonIsactive: kotlin.Boolean

)


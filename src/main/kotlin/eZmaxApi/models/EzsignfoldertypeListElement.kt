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

import eZmaxApi.models.FieldEEzsignfoldertypePrivacylevel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsignfoldertype List Element
 *
 * @param pkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param eEzsignfoldertypePrivacylevel 
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param bEzsignfoldertypeIsactive Whether the Ezsignfoldertype is active or not
 */


data class EzsignfoldertypeListElement (

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "pkiEzsignfoldertypeID")
    val pkiEzsignfoldertypeID: kotlin.Int,

    @Json(name = "eEzsignfoldertypePrivacylevel")
    val eEzsignfoldertypePrivacylevel: FieldEEzsignfoldertypePrivacylevel,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String,

    /* Whether the Ezsignfoldertype is active or not */
    @Json(name = "bEzsignfoldertypeIsactive")
    val bEzsignfoldertypeIsactive: kotlin.Boolean

)

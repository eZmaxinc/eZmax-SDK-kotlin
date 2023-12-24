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
 * A Ezsignfoldertype AutocompleteElement Response
 *
 * @param eEzsignfoldertypePrivacylevel 
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param pkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param bEzsignfoldertypeIsactive Whether the Ezsignfoldertype is active or not
 */


data class EzsignfoldertypeAutocompleteElementResponse (

    @Json(name = "eEzsignfoldertypePrivacylevel")
    val eEzsignfoldertypePrivacylevel: FieldEEzsignfoldertypePrivacylevel,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "pkiEzsignfoldertypeID")
    val pkiEzsignfoldertypeID: kotlin.Int,

    /* Whether the Ezsignfoldertype is active or not */
    @Json(name = "bEzsignfoldertypeIsactive")
    val bEzsignfoldertypeIsactive: kotlin.Boolean

)

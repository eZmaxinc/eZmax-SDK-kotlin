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
 * A Ezsigntemplate AutocompleteElement Response
 *
 * @param eEzsignfoldertypePrivacylevel 
 * @param sEzsigntemplateDescription The description of the Ezsigntemplate
 * @param pkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param bEzsigntemplateIsactive Whether the Ezsigntemplate is active or not
 */


data class EzsigntemplateAutocompleteElementResponse (

    @Json(name = "eEzsignfoldertypePrivacylevel")
    val eEzsignfoldertypePrivacylevel: FieldEEzsignfoldertypePrivacylevel,

    /* The description of the Ezsigntemplate */
    @Json(name = "sEzsigntemplateDescription")
    val sEzsigntemplateDescription: kotlin.String,

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "pkiEzsigntemplateID")
    val pkiEzsigntemplateID: kotlin.Int,

    /* Whether the Ezsigntemplate is active or not */
    @Json(name = "bEzsigntemplateIsactive")
    val bEzsigntemplateIsactive: kotlin.Boolean

) {


}


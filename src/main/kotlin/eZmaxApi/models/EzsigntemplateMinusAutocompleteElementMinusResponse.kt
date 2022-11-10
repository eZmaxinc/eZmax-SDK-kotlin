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

import eZmaxApi.models.FieldMinusEEzsignfoldertypePrivacylevel

import com.squareup.moshi.Json

/**
 * A Ezsigntemplate AutocompleteElement Response
 *
 * @param eEzsignfoldertypePrivacylevel 
 * @param sEzsigntemplateDescription The description of the Ezsigntemplate
 * @param pkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param bEzsigntemplateIsactive Whether the Ezsigntemplate is active or not
 */

data class EzsigntemplateMinusAutocompleteElementMinusResponse (

    @Json(name = "eEzsignfoldertypePrivacylevel")
    val eEzsignfoldertypePrivacylevel: FieldMinusEEzsignfoldertypePrivacylevel,

    /* The description of the Ezsigntemplate */
    @Json(name = "sEzsigntemplateDescription")
    val sEzsigntemplateDescription: kotlin.String,

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "pkiEzsigntemplateID")
    val pkiEzsigntemplateID: kotlin.Int,

    /* Whether the Ezsigntemplate is active or not */
    @Json(name = "bEzsigntemplateIsactive")
    val bEzsigntemplateIsactive: kotlin.Boolean

)


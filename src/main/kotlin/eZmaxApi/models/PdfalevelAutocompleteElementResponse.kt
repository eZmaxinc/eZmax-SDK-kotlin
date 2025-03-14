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
 * A Pdfalevel AutocompleteElement Response
 *
 * @param pkiPdfalevelID The unique ID of the Pdfalevel
 * @param sPdfalevelName The name of the Pdfalevel
 * @param bPdfalevelIsactive Whether the Pdfalevel is active or not
 */


data class PdfalevelAutocompleteElementResponse (

    /* The unique ID of the Pdfalevel */
    @Json(name = "pkiPdfalevelID")
    val pkiPdfalevelID: kotlin.Int,

    /* The name of the Pdfalevel */
    @Json(name = "sPdfalevelName")
    val sPdfalevelName: kotlin.String,

    /* Whether the Pdfalevel is active or not */
    @Json(name = "bPdfalevelIsactive")
    val bPdfalevelIsactive: kotlin.Boolean

) {


}


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
 * A Company AutocompleteElement Response
 *
 * @param pkiCompanyID The unique ID of the Company
 * @param sCompanyNameX The Name of the Company in the language of the requester
 * @param bCompanyIsactive Whether the Company is active or not
 */


data class CompanyAutocompleteElementResponse (

    /* The unique ID of the Company */
    @Json(name = "pkiCompanyID")
    val pkiCompanyID: kotlin.Int,

    /* The Name of the Company in the language of the requester */
    @Json(name = "sCompanyNameX")
    val sCompanyNameX: kotlin.String,

    /* Whether the Company is active or not */
    @Json(name = "bCompanyIsactive")
    val bCompanyIsactive: kotlin.Boolean

) {


}


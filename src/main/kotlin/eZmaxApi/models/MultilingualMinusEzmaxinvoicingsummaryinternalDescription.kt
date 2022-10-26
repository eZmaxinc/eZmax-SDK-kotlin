/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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


import com.squareup.moshi.Json

/**
 * Description of the Ezmaxinvoicingsummaryinternal
 *
 * @param sEzmaxinvoicingsummaryinternalDescription1 The Ezmaxinvoicingsummaryinternal description in french
 * @param sEzmaxinvoicingsummaryinternalDescription2 The Ezmaxinvoicingsummaryinternal description in english
 */

data class MultilingualMinusEzmaxinvoicingsummaryinternalDescription (

    /* The Ezmaxinvoicingsummaryinternal description in french */
    @Json(name = "sEzmaxinvoicingsummaryinternalDescription1")
    val sEzmaxinvoicingsummaryinternalDescription1: kotlin.String? = null,

    /* The Ezmaxinvoicingsummaryinternal description in english */
    @Json(name = "sEzmaxinvoicingsummaryinternalDescription2")
    val sEzmaxinvoicingsummaryinternalDescription2: kotlin.String? = null

)


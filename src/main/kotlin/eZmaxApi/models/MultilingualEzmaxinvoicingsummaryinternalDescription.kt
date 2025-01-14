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
 * Description of the Ezmaxinvoicingsummaryinternal
 *
 * @param sEzmaxinvoicingsummaryinternalDescription1 The Ezmaxinvoicingsummaryinternal description in French
 * @param sEzmaxinvoicingsummaryinternalDescription2 The Ezmaxinvoicingsummaryinternal description in English
 */


data class MultilingualEzmaxinvoicingsummaryinternalDescription (

    /* The Ezmaxinvoicingsummaryinternal description in French */
    @Json(name = "sEzmaxinvoicingsummaryinternalDescription1")
    val sEzmaxinvoicingsummaryinternalDescription1: kotlin.String? = null,

    /* The Ezmaxinvoicingsummaryinternal description in English */
    @Json(name = "sEzmaxinvoicingsummaryinternalDescription2")
    val sEzmaxinvoicingsummaryinternalDescription2: kotlin.String? = null

) {


}


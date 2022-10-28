/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
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
 * A Ezmaxinvoicing AutocompleteElement Response
 *
 * @param yyyymmEzmaxinvoicing The YYYYMM period of the Ezmaxinvoicing
 * @param pkiEzmaxinvoicingID The unique ID of the Ezmaxinvoicing
 * @param bEzmaxinvoicingIsactive Whether the Ezmaxinvoicing is active or not
 */

data class EzmaxinvoicingMinusAutocompleteElementMinusResponse (

    /* The YYYYMM period of the Ezmaxinvoicing */
    @Json(name = "yyyymmEzmaxinvoicing")
    val yyyymmEzmaxinvoicing: kotlin.String,

    /* The unique ID of the Ezmaxinvoicing */
    @Json(name = "pkiEzmaxinvoicingID")
    val pkiEzmaxinvoicingID: kotlin.Int,

    /* Whether the Ezmaxinvoicing is active or not */
    @Json(name = "bEzmaxinvoicingIsactive")
    val bEzmaxinvoicingIsactive: kotlin.Boolean

)


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
 * A Custom Ezmaxpricing Object
 *
 * @param pkiEzmaxpricingID The unique ID of the Ezmaxpricing
 * @param dEzmaxpricingRebateezsignallagents The rebate offered when eZsign is taken for all agents
 * @param dtEzmaxpricingStart The start date of the Ezmaxpricing
 * @param dtEzmaxpricingEnd The end date of the Ezmaxpricing
 */


data class CustomMinusEzmaxpricingMinusResponse (

    /* The unique ID of the Ezmaxpricing */
    @Json(name = "pkiEzmaxpricingID")
    val pkiEzmaxpricingID: kotlin.Int,

    /* The rebate offered when eZsign is taken for all agents */
    @Json(name = "dEzmaxpricingRebateezsignallagents")
    val dEzmaxpricingRebateezsignallagents: kotlin.String,

    /* The start date of the Ezmaxpricing */
    @Json(name = "dtEzmaxpricingStart")
    val dtEzmaxpricingStart: kotlin.String,

    /* The end date of the Ezmaxpricing */
    @Json(name = "dtEzmaxpricingEnd")
    val dtEzmaxpricingEnd: kotlin.String? = null

)


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

import eZmaxApi.models.MultilingualEzmaxinvoicingsummaryinternalDescription

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezmaxinvoicingsummaryinternal Object
 *
 * @param objEzmaxinvoicingsummaryinternalDescription 
 * @param sEzmaxinvoicingsummaryinternalDescriptionX The Ezmaxinvoicingsummaryinternal description in the language of the requester
 * @param fkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param sBillingentityinternalDescriptionX The description of the Billingentityinternal in the language of the requester
 * @param pkiEzmaxinvoicingsummaryinternalID The unique ID of the Ezmaxinvoicingsummaryinternal
 * @param fkiEzmaxinvoicingID The unique ID of the Ezmaxinvoicing
 */


data class EzmaxinvoicingsummaryinternalResponse (

    @Json(name = "objEzmaxinvoicingsummaryinternalDescription")
    val objEzmaxinvoicingsummaryinternalDescription: MultilingualEzmaxinvoicingsummaryinternalDescription,

    /* The Ezmaxinvoicingsummaryinternal description in the language of the requester */
    @Json(name = "sEzmaxinvoicingsummaryinternalDescriptionX")
    val sEzmaxinvoicingsummaryinternalDescriptionX: kotlin.String,

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "fkiBillingentityinternalID")
    val fkiBillingentityinternalID: kotlin.Int,

    /* The description of the Billingentityinternal in the language of the requester */
    @Json(name = "sBillingentityinternalDescriptionX")
    val sBillingentityinternalDescriptionX: kotlin.String,

    /* The unique ID of the Ezmaxinvoicingsummaryinternal */
    @Json(name = "pkiEzmaxinvoicingsummaryinternalID")
    val pkiEzmaxinvoicingsummaryinternalID: kotlin.Int? = null,

    /* The unique ID of the Ezmaxinvoicing */
    @Json(name = "fkiEzmaxinvoicingID")
    val fkiEzmaxinvoicingID: kotlin.Int? = null

)


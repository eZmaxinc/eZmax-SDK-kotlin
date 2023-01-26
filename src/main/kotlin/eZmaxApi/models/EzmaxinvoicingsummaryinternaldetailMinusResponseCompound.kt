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

/**
 * A Ezmaxinvoicingsummaryinternaldetail Object
 *
 * @param fkiEzmaxproductID The unique ID of the Ezmaxproduct
 * @param sEzmaxproductDescriptionX The description of the Ezmaxproduct in the language of the requester
 * @param fkiBillingentityexternalID The unique ID of the Billingentityexternal
 * @param sBillingentityexternalDescription The description of the Billingentityexternal
 * @param dEzmaxinvoicingsummaryinternaldetailCountreal The count item invoiced for the product
 * @param dEzmaxinvoicingsummaryinternaldetailSubtotal The subtotal invoiced for the product
 * @param dEzmaxinvoicingsummaryinternaldetailRebate The rebate for the product
 * @param dEzmaxinvoicingsummaryinternaldetailTotal The total invoiced for the product
 * @param bEzmaxinvoicingsummaryinternaldetailAdjustment Whether if it's an adjustment
 * @param tEzmaxproductHelpX The help message of the Ezmaxproduct in the language of the requester
 * @param pkiEzmaxinvoicingsummaryinternaldetailID The unique ID of the Ezmaxinvoicingsummaryinternaldetail
 * @param fkiEzmaxinvoicingsummaryinternalID The unique ID of the Ezmaxinvoicingsummaryinternal
 */


data class EzmaxinvoicingsummaryinternaldetailMinusResponseCompound (

    /* The unique ID of the Ezmaxproduct */
    @Json(name = "fkiEzmaxproductID")
    val fkiEzmaxproductID: kotlin.Int,

    /* The description of the Ezmaxproduct in the language of the requester */
    @Json(name = "sEzmaxproductDescriptionX")
    val sEzmaxproductDescriptionX: kotlin.String,

    /* The unique ID of the Billingentityexternal */
    @Json(name = "fkiBillingentityexternalID")
    val fkiBillingentityexternalID: kotlin.Int,

    /* The description of the Billingentityexternal */
    @Json(name = "sBillingentityexternalDescription")
    val sBillingentityexternalDescription: kotlin.String,

    /* The count item invoiced for the product */
    @Json(name = "dEzmaxinvoicingsummaryinternaldetailCountreal")
    val dEzmaxinvoicingsummaryinternaldetailCountreal: kotlin.String,

    /* The subtotal invoiced for the product */
    @Json(name = "dEzmaxinvoicingsummaryinternaldetailSubtotal")
    val dEzmaxinvoicingsummaryinternaldetailSubtotal: kotlin.String,

    /* The rebate for the product */
    @Json(name = "dEzmaxinvoicingsummaryinternaldetailRebate")
    val dEzmaxinvoicingsummaryinternaldetailRebate: kotlin.String,

    /* The total invoiced for the product */
    @Json(name = "dEzmaxinvoicingsummaryinternaldetailTotal")
    val dEzmaxinvoicingsummaryinternaldetailTotal: kotlin.String,

    /* Whether if it's an adjustment */
    @Json(name = "bEzmaxinvoicingsummaryinternaldetailAdjustment")
    val bEzmaxinvoicingsummaryinternaldetailAdjustment: kotlin.Boolean,

    /* The help message of the Ezmaxproduct in the language of the requester */
    @Json(name = "tEzmaxproductHelpX")
    val tEzmaxproductHelpX: kotlin.String,

    /* The unique ID of the Ezmaxinvoicingsummaryinternaldetail */
    @Json(name = "pkiEzmaxinvoicingsummaryinternaldetailID")
    val pkiEzmaxinvoicingsummaryinternaldetailID: kotlin.Int? = null,

    /* The unique ID of the Ezmaxinvoicingsummaryinternal */
    @Json(name = "fkiEzmaxinvoicingsummaryinternalID")
    val fkiEzmaxinvoicingsummaryinternalID: kotlin.Int? = null

)


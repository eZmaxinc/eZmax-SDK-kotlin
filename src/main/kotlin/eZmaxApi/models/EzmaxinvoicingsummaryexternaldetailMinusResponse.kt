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
 * A Ezmaxinvoicingsummaryexternaldetail Object
 *
 * @param fkiEzmaxproductID The unique ID of the Ezmaxproduct
 * @param sEzmaxproductDescriptionX The description of the Ezmaxproduct in the language of the requester
 * @param dEzmaxinvoicingsummaryexternaldetailCountreal The count item invoiced for the product
 * @param dEzmaxinvoicingsummaryexternaldetailSubtotal The subtotal invoiced for the product
 * @param dEzmaxinvoicingsummaryexternaldetailRebate The rebate for the product
 * @param dEzmaxinvoicingsummaryexternaldetailTotal The total invoiced for the product
 * @param bEzmaxinvoicingsummaryexternaldetailAdjustment Whether it's an adjustment
 * @param tEzmaxproductHelpX The help message of the Ezmaxproduct in the language of the requester
 * @param pkiEzmaxinvoicingsummaryexternaldetailID The unique ID of the Ezmaxinvoicingsummaryexternaldetail
 * @param fkiEzmaxinvoicingsummaryexternalID The unique ID of the Ezmaxinvoicingsummaryexternal
 */


data class EzmaxinvoicingsummaryexternaldetailMinusResponse (

    /* The unique ID of the Ezmaxproduct */
    @Json(name = "fkiEzmaxproductID")
    val fkiEzmaxproductID: kotlin.Int,

    /* The description of the Ezmaxproduct in the language of the requester */
    @Json(name = "sEzmaxproductDescriptionX")
    val sEzmaxproductDescriptionX: kotlin.String,

    /* The count item invoiced for the product */
    @Json(name = "dEzmaxinvoicingsummaryexternaldetailCountreal")
    val dEzmaxinvoicingsummaryexternaldetailCountreal: kotlin.String,

    /* The subtotal invoiced for the product */
    @Json(name = "dEzmaxinvoicingsummaryexternaldetailSubtotal")
    val dEzmaxinvoicingsummaryexternaldetailSubtotal: kotlin.String,

    /* The rebate for the product */
    @Json(name = "dEzmaxinvoicingsummaryexternaldetailRebate")
    val dEzmaxinvoicingsummaryexternaldetailRebate: kotlin.String,

    /* The total invoiced for the product */
    @Json(name = "dEzmaxinvoicingsummaryexternaldetailTotal")
    val dEzmaxinvoicingsummaryexternaldetailTotal: kotlin.String,

    /* Whether it's an adjustment */
    @Json(name = "bEzmaxinvoicingsummaryexternaldetailAdjustment")
    val bEzmaxinvoicingsummaryexternaldetailAdjustment: kotlin.Boolean,

    /* The help message of the Ezmaxproduct in the language of the requester */
    @Json(name = "tEzmaxproductHelpX")
    val tEzmaxproductHelpX: kotlin.String,

    /* The unique ID of the Ezmaxinvoicingsummaryexternaldetail */
    @Json(name = "pkiEzmaxinvoicingsummaryexternaldetailID")
    val pkiEzmaxinvoicingsummaryexternaldetailID: kotlin.Int? = null,

    /* The unique ID of the Ezmaxinvoicingsummaryexternal */
    @Json(name = "fkiEzmaxinvoicingsummaryexternalID")
    val fkiEzmaxinvoicingsummaryexternalID: kotlin.Int? = null

)


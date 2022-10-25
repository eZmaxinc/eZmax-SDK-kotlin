/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
 * A Ezmaxinvoicingsummaryglobal Object
 *
 * @param fkiEzmaxproductID The unique ID of the Ezmaxproduct
 * @param sEzmaxproductDescriptionX The description of the Ezmaxproduct in the language of the requester
 * @param dtEzmaxinvoicingsummaryglobalStart The start date for the Ezmaxinvoicingsummaryglobal
 * @param dtEzmaxinvoicingsummaryglobalEnd The end date for the Ezmaxinvoicingsummaryglobal
 * @param iEzmaxinvoicingsummaryglobalDays The number of days for the Ezmaxinvoicingsummaryglobal
 * @param dEzmaxinvoicingsummaryglobalCountreal The The count item calculated
 * @param dEzmaxinvoicingsummaryglobalCountbilled The The count item billed
 * @param dEzmaxinvoicingsummaryglobalSubtotal The Ezmaxinvoicingsummaryglobal subtotal
 * @param dEzmaxinvoicingsummaryglobalRebateamount The rebate amount for the Ezmaxinvoicingsummaryglobal
 * @param dEzmaxinvoicingsummaryglobalRebatepercent The rebate percentage of the Ezmaxinvoicingsummaryglobal
 * @param dEzmaxinvoicingsummaryglobalRebatetotal The rebate amount total for the Ezmaxinvoicingsummaryglobal
 * @param dEzmaxinvoicingsummaryglobalTotal The Ezmaxinvoicingsummaryglobal total
 * @param bEzmaxinvoicingsummaryglobalAdjustment Whether it is adjustment for the Ezmaxinvoicingsummaryglobal
 * @param pkiEzmaxinvoicingsummaryglobalID The unique ID of the Ezmaxinvoicingsummaryglobal
 * @param fkiEzmaxinvoicingID The unique ID of the Ezmaxinvoicing
 * @param dEzmaxinvoicingsummaryglobalRepresentative The amount of commission for the representative
 * @param dEzmaxinvoicingsummaryglobalPartner The amount of commission for the partner
 * @param dEzmaxinvoicingsummaryglobalNet The net amount of the Ezmaxinvoicingsummaryglobal
 */

data class EzmaxinvoicingsummaryglobalMinusResponse (

    /* The unique ID of the Ezmaxproduct */
    @Json(name = "fkiEzmaxproductID")
    val fkiEzmaxproductID: kotlin.Int,

    /* The description of the Ezmaxproduct in the language of the requester */
    @Json(name = "sEzmaxproductDescriptionX")
    val sEzmaxproductDescriptionX: kotlin.String,

    /* The start date for the Ezmaxinvoicingsummaryglobal */
    @Json(name = "dtEzmaxinvoicingsummaryglobalStart")
    val dtEzmaxinvoicingsummaryglobalStart: kotlin.String,

    /* The end date for the Ezmaxinvoicingsummaryglobal */
    @Json(name = "dtEzmaxinvoicingsummaryglobalEnd")
    val dtEzmaxinvoicingsummaryglobalEnd: kotlin.String,

    /* The number of days for the Ezmaxinvoicingsummaryglobal */
    @Json(name = "iEzmaxinvoicingsummaryglobalDays")
    val iEzmaxinvoicingsummaryglobalDays: kotlin.Int,

    /* The The count item calculated */
    @Json(name = "dEzmaxinvoicingsummaryglobalCountreal")
    val dEzmaxinvoicingsummaryglobalCountreal: kotlin.String,

    /* The The count item billed */
    @Json(name = "dEzmaxinvoicingsummaryglobalCountbilled")
    val dEzmaxinvoicingsummaryglobalCountbilled: kotlin.String,

    /* The Ezmaxinvoicingsummaryglobal subtotal */
    @Json(name = "dEzmaxinvoicingsummaryglobalSubtotal")
    val dEzmaxinvoicingsummaryglobalSubtotal: kotlin.String,

    /* The rebate amount for the Ezmaxinvoicingsummaryglobal */
    @Json(name = "dEzmaxinvoicingsummaryglobalRebateamount")
    val dEzmaxinvoicingsummaryglobalRebateamount: kotlin.String,

    /* The rebate percentage of the Ezmaxinvoicingsummaryglobal */
    @Json(name = "dEzmaxinvoicingsummaryglobalRebatepercent")
    val dEzmaxinvoicingsummaryglobalRebatepercent: kotlin.String,

    /* The rebate amount total for the Ezmaxinvoicingsummaryglobal */
    @Json(name = "dEzmaxinvoicingsummaryglobalRebatetotal")
    val dEzmaxinvoicingsummaryglobalRebatetotal: kotlin.String,

    /* The Ezmaxinvoicingsummaryglobal total */
    @Json(name = "dEzmaxinvoicingsummaryglobalTotal")
    val dEzmaxinvoicingsummaryglobalTotal: kotlin.String,

    /* Whether it is adjustment for the Ezmaxinvoicingsummaryglobal */
    @Json(name = "bEzmaxinvoicingsummaryglobalAdjustment")
    val bEzmaxinvoicingsummaryglobalAdjustment: kotlin.Boolean,

    /* The unique ID of the Ezmaxinvoicingsummaryglobal */
    @Json(name = "pkiEzmaxinvoicingsummaryglobalID")
    val pkiEzmaxinvoicingsummaryglobalID: kotlin.Int? = null,

    /* The unique ID of the Ezmaxinvoicing */
    @Json(name = "fkiEzmaxinvoicingID")
    val fkiEzmaxinvoicingID: kotlin.Int? = null,

    /* The amount of commission for the representative */
    @Json(name = "dEzmaxinvoicingsummaryglobalRepresentative")
    val dEzmaxinvoicingsummaryglobalRepresentative: kotlin.String? = null,

    /* The amount of commission for the partner */
    @Json(name = "dEzmaxinvoicingsummaryglobalPartner")
    val dEzmaxinvoicingsummaryglobalPartner: kotlin.String? = null,

    /* The net amount of the Ezmaxinvoicingsummaryglobal */
    @Json(name = "dEzmaxinvoicingsummaryglobalNet")
    val dEzmaxinvoicingsummaryglobalNet: kotlin.String? = null

)

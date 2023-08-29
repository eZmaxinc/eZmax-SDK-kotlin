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

import eZmaxApi.models.EzmaxinvoicingsummaryexternaldetailResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezmaxinvoicingsummaryexternal Object
 *
 * @param fkiBillingentityexternalID The unique ID of the Billingentityexternal
 * @param sBillingentityexternalDescription The description of the Billingentityexternal
 * @param sEzmaxinvoicingsummaryexternalDescription The description of the Ezmaxinvoicingsummaryexternal
 * @param aObjEzmaxinvoicingsummaryexternaldetail 
 * @param pkiEzmaxinvoicingsummaryexternalID The unique ID of the Ezmaxinvoicingsummaryexternal
 * @param fkiEzmaxinvoicingID The unique ID of the Ezmaxinvoicing
 */


data class EzmaxinvoicingsummaryexternalResponseCompound (

    /* The unique ID of the Billingentityexternal */
    @Json(name = "fkiBillingentityexternalID")
    val fkiBillingentityexternalID: kotlin.Int,

    /* The description of the Billingentityexternal */
    @Json(name = "sBillingentityexternalDescription")
    val sBillingentityexternalDescription: kotlin.String,

    /* The description of the Ezmaxinvoicingsummaryexternal */
    @Json(name = "sEzmaxinvoicingsummaryexternalDescription")
    val sEzmaxinvoicingsummaryexternalDescription: kotlin.String,

    @Json(name = "a_objEzmaxinvoicingsummaryexternaldetail")
    val aObjEzmaxinvoicingsummaryexternaldetail: kotlin.collections.List<EzmaxinvoicingsummaryexternaldetailResponseCompound>,

    /* The unique ID of the Ezmaxinvoicingsummaryexternal */
    @Json(name = "pkiEzmaxinvoicingsummaryexternalID")
    val pkiEzmaxinvoicingsummaryexternalID: kotlin.Int? = null,

    /* The unique ID of the Ezmaxinvoicing */
    @Json(name = "fkiEzmaxinvoicingID")
    val fkiEzmaxinvoicingID: kotlin.Int? = null

)


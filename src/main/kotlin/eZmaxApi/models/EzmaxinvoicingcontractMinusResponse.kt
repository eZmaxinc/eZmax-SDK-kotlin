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

import eZmaxApi.models.CommonMinusAudit
import eZmaxApi.models.FieldMinusEEzmaxinvoicingcontractPaymenttype

import com.squareup.moshi.Json

/**
 * A Ezmaxinvoicingcontract Object
 *
 * @param pkiEzmaxinvoicingcontractID The unique ID of the Ezmaxinvoicingcontract
 * @param eEzmaxinvoicingcontractPaymenttype 
 * @param iEzmaxinvoicingcontractLength The length in years of the Ezmaxinvoicingcontract
 * @param dtEzmaxinvoicingcontractStart The start date of the Ezmaxinvoicingcontract
 * @param dtEzmaxinvoicingcontractEnd The end date of the Ezmaxinvoicingcontract
 * @param dEzmaxinvoicingcontractLicense The price of the license
 * @param dEzmaxinvoicingcontract121qa The price for 121QA
 * @param bEzmaxinvoicingcontractEzsignallagents Whether eZsign is for all agents
 * @param objAudit 
 */


data class EzmaxinvoicingcontractMinusResponse (

    /* The unique ID of the Ezmaxinvoicingcontract */
    @Json(name = "pkiEzmaxinvoicingcontractID")
    val pkiEzmaxinvoicingcontractID: kotlin.Int,

    @Json(name = "eEzmaxinvoicingcontractPaymenttype")
    val eEzmaxinvoicingcontractPaymenttype: FieldMinusEEzmaxinvoicingcontractPaymenttype,

    /* The length in years of the Ezmaxinvoicingcontract */
    @Json(name = "iEzmaxinvoicingcontractLength")
    val iEzmaxinvoicingcontractLength: kotlin.Int,

    /* The start date of the Ezmaxinvoicingcontract */
    @Json(name = "dtEzmaxinvoicingcontractStart")
    val dtEzmaxinvoicingcontractStart: kotlin.String,

    /* The end date of the Ezmaxinvoicingcontract */
    @Json(name = "dtEzmaxinvoicingcontractEnd")
    val dtEzmaxinvoicingcontractEnd: kotlin.String,

    /* The price of the license */
    @Json(name = "dEzmaxinvoicingcontractLicense")
    val dEzmaxinvoicingcontractLicense: kotlin.String,

    /* The price for 121QA */
    @Json(name = "dEzmaxinvoicingcontract121qa")
    val dEzmaxinvoicingcontract121qa: kotlin.String,

    /* Whether eZsign is for all agents */
    @Json(name = "bEzmaxinvoicingcontractEzsignallagents")
    val bEzmaxinvoicingcontractEzsignallagents: kotlin.Boolean,

    @Json(name = "objAudit")
    val objAudit: CommonMinusAudit

)


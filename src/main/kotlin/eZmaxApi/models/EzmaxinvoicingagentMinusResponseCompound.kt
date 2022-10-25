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

import eZmaxApi.models.CustomMinusContactNameMinusResponse
import eZmaxApi.models.EzmaxinvoicingagentMinusResponse
import eZmaxApi.models.EzmaxinvoicingagentResponseCompoundAllOf
import eZmaxApi.models.FieldMinusEEzmaxinvoicingagentVariationezmax
import eZmaxApi.models.FieldMinusEEzmaxinvoicingagentVariationezsign

import com.squareup.moshi.Json

/**
 * A Ezmaxinvoicingagent Object
 *
 * @param fkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param sBillingentityinternalDescriptionX The description of the Billingentityinternal in the language of the requester
 * @param iEzmaxinvoicingagentSession The number of sessions
 * @param iEzmaxinvoicingagentCloned The number of times this user was cloned
 * @param iEzmaxinvoicingagentInvoice The number of invoices
 * @param iEzmaxinvoicingagentInscription The number of inscriptions
 * @param iEzmaxinvoicingagentInscriptionactive The number of active inscriptions
 * @param iEzmaxinvoicingagentSale The number of sales
 * @param iEzmaxinvoicingagentOtherincome The number of otherincomes
 * @param iEzmaxinvoicingagentCommissioncalculation The number of commission calculations
 * @param iEzmaxinvoicingagentEzsigndocument The number of ezsign documents
 * @param bEzmaxinvoicingagentEzsignaccount Whether the agent has an eZsign account
 * @param bEzmaxinvoicingagentBillableezmax Whether it is billable for eZmax
 * @param eEzmaxinvoicingagentVariationezmax 
 * @param bEzmaxinvoicingagentBillableezsign Whether it is billable for eZsign
 * @param eEzmaxinvoicingagentVariationezsign 
 * @param objContactName 
 * @param pkiEzmaxinvoicingagentID The unique ID of the Ezmaxinvoicingagent
 * @param fkiEzmaxinvoicingID The unique ID of the Ezmaxinvoicing
 * @param fkiAgentID The unique ID of the Agent.
 * @param fkiBrokerID The unique ID of the Broker.
 */

data class EzmaxinvoicingagentMinusResponseCompound (

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "fkiBillingentityinternalID")
    val fkiBillingentityinternalID: kotlin.Int,

    /* The description of the Billingentityinternal in the language of the requester */
    @Json(name = "sBillingentityinternalDescriptionX")
    val sBillingentityinternalDescriptionX: kotlin.String,

    /* The number of sessions */
    @Json(name = "iEzmaxinvoicingagentSession")
    val iEzmaxinvoicingagentSession: kotlin.Int,

    /* The number of times this user was cloned */
    @Json(name = "iEzmaxinvoicingagentCloned")
    val iEzmaxinvoicingagentCloned: kotlin.Int,

    /* The number of invoices */
    @Json(name = "iEzmaxinvoicingagentInvoice")
    val iEzmaxinvoicingagentInvoice: kotlin.Int,

    /* The number of inscriptions */
    @Json(name = "iEzmaxinvoicingagentInscription")
    val iEzmaxinvoicingagentInscription: kotlin.Int,

    /* The number of active inscriptions */
    @Json(name = "iEzmaxinvoicingagentInscriptionactive")
    val iEzmaxinvoicingagentInscriptionactive: kotlin.Int,

    /* The number of sales */
    @Json(name = "iEzmaxinvoicingagentSale")
    val iEzmaxinvoicingagentSale: kotlin.Int,

    /* The number of otherincomes */
    @Json(name = "iEzmaxinvoicingagentOtherincome")
    val iEzmaxinvoicingagentOtherincome: kotlin.Int,

    /* The number of commission calculations */
    @Json(name = "iEzmaxinvoicingagentCommissioncalculation")
    val iEzmaxinvoicingagentCommissioncalculation: kotlin.Int,

    /* The number of ezsign documents */
    @Json(name = "iEzmaxinvoicingagentEzsigndocument")
    val iEzmaxinvoicingagentEzsigndocument: kotlin.Int,

    /* Whether the agent has an eZsign account */
    @Json(name = "bEzmaxinvoicingagentEzsignaccount")
    val bEzmaxinvoicingagentEzsignaccount: kotlin.Boolean,

    /* Whether it is billable for eZmax */
    @Json(name = "bEzmaxinvoicingagentBillableezmax")
    val bEzmaxinvoicingagentBillableezmax: kotlin.Boolean,

    @Json(name = "eEzmaxinvoicingagentVariationezmax")
    val eEzmaxinvoicingagentVariationezmax: FieldMinusEEzmaxinvoicingagentVariationezmax,

    /* Whether it is billable for eZsign */
    @Json(name = "bEzmaxinvoicingagentBillableezsign")
    val bEzmaxinvoicingagentBillableezsign: kotlin.Boolean,

    @Json(name = "eEzmaxinvoicingagentVariationezsign")
    val eEzmaxinvoicingagentVariationezsign: FieldMinusEEzmaxinvoicingagentVariationezsign,

    @Json(name = "objContactName")
    val objContactName: CustomMinusContactNameMinusResponse,

    /* The unique ID of the Ezmaxinvoicingagent */
    @Json(name = "pkiEzmaxinvoicingagentID")
    val pkiEzmaxinvoicingagentID: kotlin.Int? = null,

    /* The unique ID of the Ezmaxinvoicing */
    @Json(name = "fkiEzmaxinvoicingID")
    val fkiEzmaxinvoicingID: kotlin.Int? = null,

    /* The unique ID of the Agent. */
    @Json(name = "fkiAgentID")
    val fkiAgentID: kotlin.Int? = null,

    /* The unique ID of the Broker. */
    @Json(name = "fkiBrokerID")
    val fkiBrokerID: kotlin.Int? = null

)


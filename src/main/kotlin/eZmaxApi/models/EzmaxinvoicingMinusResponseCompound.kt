/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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

import eZmaxApi.models.CommonMinusAudit
import eZmaxApi.models.CustomMinusEzmaxinvoicingEzsigndocumentMinusResponse
import eZmaxApi.models.CustomMinusEzmaxinvoicingEzsignfolderMinusResponse
import eZmaxApi.models.CustomMinusEzmaxpricingMinusResponse
import eZmaxApi.models.EzmaxinvoicingMinusResponse
import eZmaxApi.models.EzmaxinvoicingResponseCompoundAllOf
import eZmaxApi.models.EzmaxinvoicingagentMinusResponseCompound
import eZmaxApi.models.EzmaxinvoicingcontractMinusResponseCompound
import eZmaxApi.models.EzmaxinvoicingsummaryexternalMinusResponseCompound
import eZmaxApi.models.EzmaxinvoicingsummaryglobalMinusResponseCompound
import eZmaxApi.models.EzmaxinvoicingsummaryinternalMinusResponseCompound
import eZmaxApi.models.EzmaxinvoicinguserMinusResponseCompound
import eZmaxApi.models.FieldMinusEEzmaxinvoicingPaymenttype

import com.squareup.moshi.Json

/**
 * A Ezmaxinvoicing Object
 *
 * @param fkiEzmaxinvoicingcontractID The unique ID of the Ezmaxinvoicingcontract
 * @param fkiEzmaxpricingID The unique ID of the Ezmaxpricing
 * @param fkiSystemconfigurationtypeID The unique ID of the Systemconfigurationtype
 * @param sSystemconfigurationtypeDescriptionX The description of the Systemconfigurationtype in the language of the requester
 * @param yyyymmEzmaxinvoicing The YYYYMM period of the Ezmaxinvoicing
 * @param iEzmaxinvoicingDays The number of days invoiced
 * @param eEzmaxinvoicingPaymenttype 
 * @param dEzmaxinvoicingRebatepaymenttype The percentage of rebate depending of the payment type
 * @param iEzmaxinvoicingContractlength The length of the contract in years
 * @param dEzmaxinvoicingRebatecontractlength The percentage of rebate depending of the contract length
 * @param bEzmaxinvoicingRebateEzsignallagents Whether the rebate for eZsign is for all agents
 * @param objEzmaxinvoicingcontract 
 * @param objEzmaxpricing 
 * @param aObjEzmaxinvoicingsummaryglobal 
 * @param aObjEzmaxinvoicingsummaryexternal 
 * @param aObjEzmaxinvoicingsummaryinternal 
 * @param aObjEzmaxinvoicingagent 
 * @param aObjEzmaxinvoicinguser 
 * @param aObjEzmaxinvoicingezsignfolder 
 * @param aObjEzmaxinvoicingezsigndocument 
 * @param pkiEzmaxinvoicingID The unique ID of the Ezmaxinvoicing
 * @param objAudit 
 */

data class EzmaxinvoicingMinusResponseCompound (

    /* The unique ID of the Ezmaxinvoicingcontract */
    @Json(name = "fkiEzmaxinvoicingcontractID")
    val fkiEzmaxinvoicingcontractID: kotlin.Int,

    /* The unique ID of the Ezmaxpricing */
    @Json(name = "fkiEzmaxpricingID")
    val fkiEzmaxpricingID: kotlin.Int,

    /* The unique ID of the Systemconfigurationtype */
    @Json(name = "fkiSystemconfigurationtypeID")
    val fkiSystemconfigurationtypeID: kotlin.Int,

    /* The description of the Systemconfigurationtype in the language of the requester */
    @Json(name = "sSystemconfigurationtypeDescriptionX")
    val sSystemconfigurationtypeDescriptionX: kotlin.String,

    /* The YYYYMM period of the Ezmaxinvoicing */
    @Json(name = "yyyymmEzmaxinvoicing")
    val yyyymmEzmaxinvoicing: kotlin.String,

    /* The number of days invoiced */
    @Json(name = "iEzmaxinvoicingDays")
    val iEzmaxinvoicingDays: kotlin.Int,

    @Json(name = "eEzmaxinvoicingPaymenttype")
    val eEzmaxinvoicingPaymenttype: FieldMinusEEzmaxinvoicingPaymenttype,

    /* The percentage of rebate depending of the payment type */
    @Json(name = "dEzmaxinvoicingRebatepaymenttype")
    val dEzmaxinvoicingRebatepaymenttype: kotlin.String,

    /* The length of the contract in years */
    @Json(name = "iEzmaxinvoicingContractlength")
    val iEzmaxinvoicingContractlength: kotlin.Int,

    /* The percentage of rebate depending of the contract length */
    @Json(name = "dEzmaxinvoicingRebatecontractlength")
    val dEzmaxinvoicingRebatecontractlength: kotlin.String,

    /* Whether the rebate for eZsign is for all agents */
    @Json(name = "bEzmaxinvoicingRebateEzsignallagents")
    val bEzmaxinvoicingRebateEzsignallagents: kotlin.Boolean,

    @Json(name = "objEzmaxinvoicingcontract")
    val objEzmaxinvoicingcontract: EzmaxinvoicingcontractMinusResponseCompound,

    @Json(name = "objEzmaxpricing")
    val objEzmaxpricing: CustomMinusEzmaxpricingMinusResponse,

    @Json(name = "a_objEzmaxinvoicingsummaryglobal")
    val aObjEzmaxinvoicingsummaryglobal: kotlin.collections.List<EzmaxinvoicingsummaryglobalMinusResponseCompound>,

    @Json(name = "a_objEzmaxinvoicingsummaryexternal")
    val aObjEzmaxinvoicingsummaryexternal: kotlin.collections.List<EzmaxinvoicingsummaryexternalMinusResponseCompound>,

    @Json(name = "a_objEzmaxinvoicingsummaryinternal")
    val aObjEzmaxinvoicingsummaryinternal: kotlin.collections.List<EzmaxinvoicingsummaryinternalMinusResponseCompound>,

    @Json(name = "a_objEzmaxinvoicingagent")
    val aObjEzmaxinvoicingagent: kotlin.collections.List<EzmaxinvoicingagentMinusResponseCompound>,

    @Json(name = "a_objEzmaxinvoicinguser")
    val aObjEzmaxinvoicinguser: kotlin.collections.List<EzmaxinvoicinguserMinusResponseCompound>,

    @Json(name = "a_objEzmaxinvoicingezsignfolder")
    val aObjEzmaxinvoicingezsignfolder: kotlin.collections.List<CustomMinusEzmaxinvoicingEzsignfolderMinusResponse>,

    @Json(name = "a_objEzmaxinvoicingezsigndocument")
    val aObjEzmaxinvoicingezsigndocument: kotlin.collections.List<CustomMinusEzmaxinvoicingEzsigndocumentMinusResponse>,

    /* The unique ID of the Ezmaxinvoicing */
    @Json(name = "pkiEzmaxinvoicingID")
    val pkiEzmaxinvoicingID: kotlin.Int? = null,

    @Json(name = "objAudit")
    val objAudit: CommonMinusAudit? = null

)


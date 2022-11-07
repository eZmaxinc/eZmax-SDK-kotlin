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

import eZmaxApi.models.CustomMinusEzmaxinvoicingEzsigndocumentMinusResponse
import eZmaxApi.models.CustomMinusEzmaxinvoicingEzsignfolderMinusResponse
import eZmaxApi.models.CustomMinusEzmaxpricingMinusResponse
import eZmaxApi.models.EzmaxinvoicingagentMinusResponseCompound
import eZmaxApi.models.EzmaxinvoicingcontractMinusResponseCompound
import eZmaxApi.models.EzmaxinvoicingsummaryexternalMinusResponseCompound
import eZmaxApi.models.EzmaxinvoicingsummaryglobalMinusResponseCompound
import eZmaxApi.models.EzmaxinvoicingsummaryinternalMinusResponseCompound
import eZmaxApi.models.EzmaxinvoicinguserMinusResponseCompound

import com.squareup.moshi.Json

/**
 * 
 *
 * @param objEzmaxinvoicingcontract 
 * @param objEzmaxpricing 
 * @param aObjEzmaxinvoicingsummaryglobal 
 * @param aObjEzmaxinvoicingsummaryexternal 
 * @param aObjEzmaxinvoicingsummaryinternal 
 * @param aObjEzmaxinvoicingagent 
 * @param aObjEzmaxinvoicinguser 
 * @param aObjEzmaxinvoicingezsignfolder 
 * @param aObjEzmaxinvoicingezsigndocument 
 */

data class EzmaxinvoicingResponseCompoundAllOf (

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
    val aObjEzmaxinvoicingezsigndocument: kotlin.collections.List<CustomMinusEzmaxinvoicingEzsigndocumentMinusResponse>

)


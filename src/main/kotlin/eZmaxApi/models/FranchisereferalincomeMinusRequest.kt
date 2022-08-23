/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
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
 * An Franchisereferalincome Object
 *
 * @param fkiFranchisebrokerID The unique ID of the Franchisebroker
 * @param fkiFranchisereferalincomeprogramID The unique ID of the Franchisereferalincomeprogram
 * @param fkiPeriodID The unique ID of the Period
 * @param dFranchisereferalincomeLoan The loan amount
 * @param dFranchisereferalincomeFranchiseamount The amount that will be given to the franchise
 * @param dFranchisereferalincomeFranchisoramount The amount that will be kept by the franchisor
 * @param dFranchisereferalincomeAgentamount The amount that will be given to the agent
 * @param dtFranchisereferalincomeDisbursed The date the amounts were disbursed
 * @param tFranchisereferalincomeComment Comment about the transaction
 * @param fkiFranchiseofficeID The unique ID of the Franchisereoffice
 * @param sFranchisereferalincomeRemoteid 
 * @param pkiFranchisereferalincomeID The unique ID of the Franchisereferalincome
 */

data class FranchisereferalincomeMinusRequest (

    /* The unique ID of the Franchisebroker */
    @Json(name = "fkiFranchisebrokerID")
    val fkiFranchisebrokerID: kotlin.Int,

    /* The unique ID of the Franchisereferalincomeprogram */
    @Json(name = "fkiFranchisereferalincomeprogramID")
    val fkiFranchisereferalincomeprogramID: kotlin.Int,

    /* The unique ID of the Period */
    @Json(name = "fkiPeriodID")
    val fkiPeriodID: kotlin.Int,

    /* The loan amount */
    @Json(name = "dFranchisereferalincomeLoan")
    val dFranchisereferalincomeLoan: kotlin.String,

    /* The amount that will be given to the franchise */
    @Json(name = "dFranchisereferalincomeFranchiseamount")
    val dFranchisereferalincomeFranchiseamount: kotlin.String,

    /* The amount that will be kept by the franchisor */
    @Json(name = "dFranchisereferalincomeFranchisoramount")
    val dFranchisereferalincomeFranchisoramount: kotlin.String,

    /* The amount that will be given to the agent */
    @Json(name = "dFranchisereferalincomeAgentamount")
    val dFranchisereferalincomeAgentamount: kotlin.String,

    /* The date the amounts were disbursed */
    @Json(name = "dtFranchisereferalincomeDisbursed")
    val dtFranchisereferalincomeDisbursed: kotlin.String,

    /* Comment about the transaction */
    @Json(name = "tFranchisereferalincomeComment")
    val tFranchisereferalincomeComment: kotlin.String,

    /* The unique ID of the Franchisereoffice */
    @Json(name = "fkiFranchiseofficeID")
    val fkiFranchiseofficeID: kotlin.Int,

    /*  */
    @Json(name = "sFranchisereferalincomeRemoteid")
    val sFranchisereferalincomeRemoteid: kotlin.String,

    /* The unique ID of the Franchisereferalincome */
    @Json(name = "pkiFranchisereferalincomeID")
    val pkiFranchisereferalincomeID: kotlin.Int? = null

)


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

import eZmaxApi.models.CustomMinusContactNameMinusResponse
import eZmaxApi.models.FieldMinusEEzmaxinvoicinguserVariationezsign

import com.squareup.moshi.Json

/**
 * A Ezmaxinvoicinguser Object
 *
 * @param fkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param sBillingentityinternalDescriptionX The description of the Billingentityinternal in the language of the requester
 * @param fkiUserID The unique ID of the User
 * @param iEzmaxinvoicinguserEzsigndocument The number of ezsign documents
 * @param bEzmaxinvoicinguserEzsignaccount Whether there is an eZsign account
 * @param bEzmaxinvoicinguserBillableezsign Whether it is billable for eZsign
 * @param eEzmaxinvoicinguserVariationezsign 
 * @param objContactName 
 * @param pkiEzmaxinvoicinguserID The unique ID of the Ezmaxinvoicinguser
 * @param fkiEzmaxinvoicingID The unique ID of the Ezmaxinvoicing
 */


data class EzmaxinvoicinguserMinusResponseCompound (

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "fkiBillingentityinternalID")
    val fkiBillingentityinternalID: kotlin.Int,

    /* The description of the Billingentityinternal in the language of the requester */
    @Json(name = "sBillingentityinternalDescriptionX")
    val sBillingentityinternalDescriptionX: kotlin.String,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int,

    /* The number of ezsign documents */
    @Json(name = "iEzmaxinvoicinguserEzsigndocument")
    val iEzmaxinvoicinguserEzsigndocument: kotlin.Int,

    /* Whether there is an eZsign account */
    @Json(name = "bEzmaxinvoicinguserEzsignaccount")
    val bEzmaxinvoicinguserEzsignaccount: kotlin.Boolean,

    /* Whether it is billable for eZsign */
    @Json(name = "bEzmaxinvoicinguserBillableezsign")
    val bEzmaxinvoicinguserBillableezsign: kotlin.Boolean,

    @Json(name = "eEzmaxinvoicinguserVariationezsign")
    val eEzmaxinvoicinguserVariationezsign: FieldMinusEEzmaxinvoicinguserVariationezsign,

    @Json(name = "objContactName")
    val objContactName: CustomMinusContactNameMinusResponse,

    /* The unique ID of the Ezmaxinvoicinguser */
    @Json(name = "pkiEzmaxinvoicinguserID")
    val pkiEzmaxinvoicinguserID: kotlin.Int? = null,

    /* The unique ID of the Ezmaxinvoicing */
    @Json(name = "fkiEzmaxinvoicingID")
    val fkiEzmaxinvoicingID: kotlin.Int? = null

)


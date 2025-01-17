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

import eZmaxApi.models.CreditcardclientRequest
import eZmaxApi.models.CreditcarddetailRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Creditcardclient Object and children
 *
 * @param bCreditcardclientrelationIsdefault Whether if it's the creditcardclient is the default one
 * @param sCreditcardclientDescription The description of the Creditcardclient
 * @param bCreditcardclientAllowedcompanypayment Whether if it's an allowedagencypayment
 * @param bCreditcardclientAllowedezsign Whether if it's an allowedroyallepageprotection
 * @param bCreditcardclientAllowedtranquillit Whether if it's an allowedtranquillit
 * @param objCreditcarddetail 
 * @param sCreditcardclientCVV The creditcard card CVV
 * @param pkiCreditcardclientID The unique ID of the Creditcardclient
 * @param fksCreditcardtokenID The creditcard token identifier
 */


class CreditcardclientRequestCompound (

    /* Whether if it's the creditcardclient is the default one */
    @Json(name = "bCreditcardclientrelationIsdefault")
    override val bCreditcardclientrelationIsdefault: kotlin.Boolean,

    /* The description of the Creditcardclient */
    @Json(name = "sCreditcardclientDescription")
    override val sCreditcardclientDescription: kotlin.String,

    /* Whether if it's an allowedagencypayment */
    @Json(name = "bCreditcardclientAllowedcompanypayment")
    override val bCreditcardclientAllowedcompanypayment: kotlin.Boolean,

    /* Whether if it's an allowedroyallepageprotection */
    @Json(name = "bCreditcardclientAllowedezsign")
    override val bCreditcardclientAllowedezsign: kotlin.Boolean,

    /* Whether if it's an allowedtranquillit */
    @Json(name = "bCreditcardclientAllowedtranquillit")
    override val bCreditcardclientAllowedtranquillit: kotlin.Boolean,

    @Json(name = "objCreditcarddetail")
    override val objCreditcarddetail: CreditcarddetailRequest,

    /* The creditcard card CVV */
    @Json(name = "sCreditcardclientCVV")
    override val sCreditcardclientCVV: kotlin.String,

    /* The unique ID of the Creditcardclient */
    @Json(name = "pkiCreditcardclientID")
    override val pkiCreditcardclientID: kotlin.Int? = null,

    /* The creditcard token identifier */
    @Json(name = "fksCreditcardtokenID")
    override val fksCreditcardtokenID: kotlin.String? = null

) : CreditcardclientRequest {


}


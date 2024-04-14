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
import com.squareup.moshi.JsonClass

/**
 * A Creditcardclient List Element
 *
 * @param pkiCreditcardclientID The unique ID of the Creditcardclient
 * @param fkiCreditcarddetailID The unique ID of the Creditcarddetail
 * @param bCreditcardclientrelationIsdefault Whether if it's an relationisdefault
 * @param sCreditcardclientDescription The description of the Creditcardclient
 * @param bCreditcardclientIsactive Whether the creditcardclient is active or not
 * @param bCreditcardclientAllowedagencypayment Whether if it's an allowedagencypayment
 * @param bCreditcardclientAllowedroyallepageprotection Whether if it's an allowedroyallepageprotection
 * @param bCreditcardclientAllowedtranquillit Whether if it's an allowedtranquillit
 * @param iCreditcarddetailExpirationmonth The expirationmonth of the Creditcarddetail
 * @param iCreditcarddetailExpirationyear The expirationyear of the Creditcarddetail
 * @param sCreditcarddetailNumbermasked The numbermasked of the Creditcarddetail
 */


data class CreditcardclientListElement (

    /* The unique ID of the Creditcardclient */
    @Json(name = "pkiCreditcardclientID")
    val pkiCreditcardclientID: kotlin.Int,

    /* The unique ID of the Creditcarddetail */
    @Json(name = "fkiCreditcarddetailID")
    val fkiCreditcarddetailID: kotlin.Int,

    /* Whether if it's an relationisdefault */
    @Json(name = "bCreditcardclientrelationIsdefault")
    val bCreditcardclientrelationIsdefault: kotlin.Boolean,

    /* The description of the Creditcardclient */
    @Json(name = "sCreditcardclientDescription")
    val sCreditcardclientDescription: kotlin.String,

    /* Whether the creditcardclient is active or not */
    @Json(name = "bCreditcardclientIsactive")
    val bCreditcardclientIsactive: kotlin.Boolean,

    /* Whether if it's an allowedagencypayment */
    @Json(name = "bCreditcardclientAllowedagencypayment")
    val bCreditcardclientAllowedagencypayment: kotlin.Boolean,

    /* Whether if it's an allowedroyallepageprotection */
    @Json(name = "bCreditcardclientAllowedroyallepageprotection")
    val bCreditcardclientAllowedroyallepageprotection: kotlin.Boolean,

    /* Whether if it's an allowedtranquillit */
    @Json(name = "bCreditcardclientAllowedtranquillit")
    val bCreditcardclientAllowedtranquillit: kotlin.Boolean,

    /* The expirationmonth of the Creditcarddetail */
    @Json(name = "iCreditcarddetailExpirationmonth")
    val iCreditcarddetailExpirationmonth: kotlin.Int,

    /* The expirationyear of the Creditcarddetail */
    @Json(name = "iCreditcarddetailExpirationyear")
    val iCreditcarddetailExpirationyear: kotlin.Int,

    /* The numbermasked of the Creditcarddetail */
    @Json(name = "sCreditcarddetailNumbermasked")
    val sCreditcarddetailNumbermasked: kotlin.String

)

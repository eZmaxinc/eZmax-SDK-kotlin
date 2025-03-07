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

import eZmaxApi.models.FieldEPaymentgatewayProcessor

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Paymentgateway List Element
 *
 * @param pkiPaymentgatewayID The unique ID of the Paymentgateway
 * @param fkiCreditcardmerchantID The unique ID of the Creditcardmerchant
 * @param ePaymentgatewayProcessor 
 * @param sPaymentgatewayDescriptionX The description of the Paymentgateway in the language of the requester
 */


data class PaymentgatewayListElement (

    /* The unique ID of the Paymentgateway */
    @Json(name = "pkiPaymentgatewayID")
    val pkiPaymentgatewayID: kotlin.Int,

    /* The unique ID of the Creditcardmerchant */
    @Json(name = "fkiCreditcardmerchantID")
    val fkiCreditcardmerchantID: kotlin.Int,

    @Json(name = "ePaymentgatewayProcessor")
    val ePaymentgatewayProcessor: FieldEPaymentgatewayProcessor,

    /* The description of the Paymentgateway in the language of the requester */
    @Json(name = "sPaymentgatewayDescriptionX")
    val sPaymentgatewayDescriptionX: kotlin.String

) {


}


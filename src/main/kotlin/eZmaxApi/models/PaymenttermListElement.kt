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

import eZmaxApi.models.FieldEPaymenttermType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Paymentterm List Element
 *
 * @param pkiPaymenttermID The unique ID of the Paymentterm
 * @param sPaymenttermCode The code of the Paymentterm
 * @param ePaymenttermType 
 * @param iPaymenttermDay The day of the Paymentterm
 * @param sPaymenttermDescriptionX The description of the Paymentterm in the language of the requester
 * @param bPaymenttermIsactive Whether the Paymentterm is active or not
 */


data class PaymenttermListElement (

    /* The unique ID of the Paymentterm */
    @Json(name = "pkiPaymenttermID")
    val pkiPaymenttermID: kotlin.Int,

    /* The code of the Paymentterm */
    @Json(name = "sPaymenttermCode")
    val sPaymenttermCode: kotlin.String,

    @Json(name = "ePaymenttermType")
    val ePaymenttermType: FieldEPaymenttermType,

    /* The day of the Paymentterm */
    @Json(name = "iPaymenttermDay")
    val iPaymenttermDay: kotlin.Int,

    /* The description of the Paymentterm in the language of the requester */
    @Json(name = "sPaymenttermDescriptionX")
    val sPaymenttermDescriptionX: kotlin.String,

    /* Whether the Paymentterm is active or not */
    @Json(name = "bPaymenttermIsactive")
    val bPaymenttermIsactive: kotlin.Boolean

)


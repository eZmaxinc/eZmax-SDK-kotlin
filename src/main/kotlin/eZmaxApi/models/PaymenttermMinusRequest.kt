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

import eZmaxApi.models.MultilingualMinusPaymenttermDescription

import com.squareup.moshi.Json

/**
 * A Paymentterm Object
 *
 * @param sPaymenttermCode The code of the Paymentterm
 * @param objPaymenttermDescription 
 * @param bPaymenttermIsactive Whether the Paymentterm is active or not
 * @param pkiPaymenttermID The unique ID of the Paymentterm
 */


data class PaymenttermMinusRequest (

    /* The code of the Paymentterm */
    @Json(name = "sPaymenttermCode")
    val sPaymenttermCode: kotlin.String,

    @Json(name = "objPaymenttermDescription")
    val objPaymenttermDescription: MultilingualMinusPaymenttermDescription,

    /* Whether the Paymentterm is active or not */
    @Json(name = "bPaymenttermIsactive")
    val bPaymenttermIsactive: kotlin.Boolean,

    /* The unique ID of the Paymentterm */
    @Json(name = "pkiPaymenttermID")
    val pkiPaymenttermID: kotlin.Int? = null

)


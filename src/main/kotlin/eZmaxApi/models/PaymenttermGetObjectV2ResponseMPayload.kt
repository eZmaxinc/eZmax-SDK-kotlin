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

import eZmaxApi.models.PaymenttermResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/paymentterm/{pkiPaymenttermID}
 *
 * @param objPaymentterm 
 */


data class PaymenttermGetObjectV2ResponseMPayload (

    @Json(name = "objPaymentterm")
    val objPaymentterm: PaymenttermResponseCompound

) {


}


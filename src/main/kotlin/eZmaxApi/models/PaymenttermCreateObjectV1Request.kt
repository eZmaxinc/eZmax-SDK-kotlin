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

import eZmaxApi.models.PaymenttermRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/paymentterm
 *
 * @param aObjPaymentterm 
 */


data class PaymenttermCreateObjectV1Request (

    @Json(name = "a_objPaymentterm")
    val aObjPaymentterm: kotlin.collections.List<PaymenttermRequestCompound>

) {


}


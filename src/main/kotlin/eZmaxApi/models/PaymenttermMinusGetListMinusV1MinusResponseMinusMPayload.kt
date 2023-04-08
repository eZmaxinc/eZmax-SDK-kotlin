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

import eZmaxApi.models.PaymenttermMinusListElement

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/paymentterm/getList
 *
 * @param aObjPaymentterm 
 * @param iRowReturned The number of rows returned
 * @param iRowFiltered The number of rows matching your filters (if any) or the total number of rows
 */


data class PaymenttermMinusGetListMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objPaymentterm")
    val aObjPaymentterm: kotlin.collections.List<PaymenttermMinusListElement>,

    /* The number of rows returned */
    @Json(name = "iRowReturned")
    val iRowReturned: kotlin.Int,

    /* The number of rows matching your filters (if any) or the total number of rows */
    @Json(name = "iRowFiltered")
    val iRowFiltered: kotlin.Int

)

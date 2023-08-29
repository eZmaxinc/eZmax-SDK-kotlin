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

import eZmaxApi.models.PaymenttermAutocompleteElementResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/paymentterm/getAutocomplete
 *
 * @param aObjPaymentterm An array of Paymentterm autocomplete element response.
 */


data class PaymenttermGetAutocompleteV2ResponseMPayload (

    /* An array of Paymentterm autocomplete element response. */
    @Json(name = "a_objPaymentterm")
    val aObjPaymentterm: kotlin.collections.List<PaymenttermAutocompleteElementResponse>? = null

)


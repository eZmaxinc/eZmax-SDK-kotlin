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
 * Description of the Paymentterm
 *
 * @param sPaymenttermDescription1 The description of the Paymentterm in French
 * @param sPaymenttermDescription2 The description of the Paymentterm in English
 */


data class MultilingualPaymenttermDescription (

    /* The description of the Paymentterm in French */
    @Json(name = "sPaymenttermDescription1")
    val sPaymenttermDescription1: kotlin.String? = null,

    /* The description of the Paymentterm in English */
    @Json(name = "sPaymenttermDescription2")
    val sPaymenttermDescription2: kotlin.String? = null

)

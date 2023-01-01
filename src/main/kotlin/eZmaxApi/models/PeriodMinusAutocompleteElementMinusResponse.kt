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

/**
 * A Period AutocompleteElement Response
 *
 * @param sPeriodYYYYMM The period YYYYMM
 * @param pkiPeriodID The unique ID of the Period
 * @param bPeriodIsactive Whether the Period is active or not
 */


data class PeriodMinusAutocompleteElementMinusResponse (

    /* The period YYYYMM */
    @Json(name = "sPeriodYYYYMM")
    val sPeriodYYYYMM: kotlin.String,

    /* The unique ID of the Period */
    @Json(name = "pkiPeriodID")
    val pkiPeriodID: kotlin.Int,

    /* Whether the Period is active or not */
    @Json(name = "bPeriodIsactive")
    val bPeriodIsactive: kotlin.Boolean

)


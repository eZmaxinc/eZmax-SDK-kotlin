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
 * A Ezmaxinvoicingcommission Object
 *
 * @param dtEzmaxinvoicingcommissionStart The start date for the Ezmaxinvoicingcommission
 * @param dtEzmaxinvoicingcommissionEnd The end date for the Ezmaxinvoicingcommission
 * @param iEzmaxinvoicingcommissionDays This is the number of days during the month on which the Ezmaxinvoigcommission applies
 * @param dEzmaxinvoicingcommissionAmount The amount of Ezmaxinvoicingcommission
 * @param pkiEzmaxinvoicingcommissionID The unique ID of the Ezmaxinvoicingcommission
 * @param fkiEzmaxinvoicingsummaryglobalID The unique ID of the Ezmaxinvoicingsummaryglobal
 * @param fkiEzmaxpartnerID The unique ID of the Ezmaxpartner
 * @param fkiEzmaxrepresentativeID The unique ID of the Ezmaxrepresentative
 */


data class EzmaxinvoicingcommissionMinusResponse (

    /* The start date for the Ezmaxinvoicingcommission */
    @Json(name = "dtEzmaxinvoicingcommissionStart")
    val dtEzmaxinvoicingcommissionStart: kotlin.String,

    /* The end date for the Ezmaxinvoicingcommission */
    @Json(name = "dtEzmaxinvoicingcommissionEnd")
    val dtEzmaxinvoicingcommissionEnd: kotlin.String,

    /* This is the number of days during the month on which the Ezmaxinvoigcommission applies */
    @Json(name = "iEzmaxinvoicingcommissionDays")
    val iEzmaxinvoicingcommissionDays: kotlin.Int,

    /* The amount of Ezmaxinvoicingcommission */
    @Json(name = "dEzmaxinvoicingcommissionAmount")
    val dEzmaxinvoicingcommissionAmount: kotlin.String,

    /* The unique ID of the Ezmaxinvoicingcommission */
    @Json(name = "pkiEzmaxinvoicingcommissionID")
    val pkiEzmaxinvoicingcommissionID: kotlin.Int? = null,

    /* The unique ID of the Ezmaxinvoicingsummaryglobal */
    @Json(name = "fkiEzmaxinvoicingsummaryglobalID")
    val fkiEzmaxinvoicingsummaryglobalID: kotlin.Int? = null,

    /* The unique ID of the Ezmaxpartner */
    @Json(name = "fkiEzmaxpartnerID")
    val fkiEzmaxpartnerID: kotlin.Int? = null,

    /* The unique ID of the Ezmaxrepresentative */
    @Json(name = "fkiEzmaxrepresentativeID")
    val fkiEzmaxrepresentativeID: kotlin.Int? = null

)


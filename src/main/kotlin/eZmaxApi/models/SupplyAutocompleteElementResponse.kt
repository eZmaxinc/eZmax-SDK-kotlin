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
 * A Supply AutocompleteElement Response
 *
 * @param pkiSupplyID The unique ID of the Supply
 * @param sSupplyDescriptionX The description of the Supply in the language of the requester
 * @param bSupplyIsactive Whether the supply is active or not
 */


data class SupplyAutocompleteElementResponse (

    /* The unique ID of the Supply */
    @Json(name = "pkiSupplyID")
    val pkiSupplyID: kotlin.Int,

    /* The description of the Supply in the language of the requester */
    @Json(name = "sSupplyDescriptionX")
    val sSupplyDescriptionX: kotlin.String,

    /* Whether the supply is active or not */
    @Json(name = "bSupplyIsactive")
    val bSupplyIsactive: kotlin.Boolean

) {


}


/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
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
 * A Franchisebroker AutocompleteElement Response
 *
 * @param sFranchisebrokerName The name of the Franchisebroker in the language of the requester
 * @param pkiFranchisebrokerID The unique ID of the Franchisebroker
 * @param bFranchisebrokerIsactive Whether the Franchisebroker is active or not
 */

data class FranchisebrokerMinusAutocompleteElementMinusResponse (

    /* The name of the Franchisebroker in the language of the requester */
    @Json(name = "sFranchisebrokerName")
    val sFranchisebrokerName: kotlin.String,

    /* The unique ID of the Franchisebroker */
    @Json(name = "pkiFranchisebrokerID")
    val pkiFranchisebrokerID: kotlin.Int,

    /* Whether the Franchisebroker is active or not */
    @Json(name = "bFranchisebrokerIsactive")
    val bFranchisebrokerIsactive: kotlin.Boolean

)


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

import eZmaxApi.models.UsergroupMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/usergroup/getAutocomplete
 *
 * @param aObjUsergroup An array of Usergroup autocomplete element response.
 */


data class UsergroupMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Usergroup autocomplete element response. */
    @Json(name = "a_objUsergroup")
    val aObjUsergroup: kotlin.collections.List<UsergroupMinusAutocompleteElementMinusResponse>

)


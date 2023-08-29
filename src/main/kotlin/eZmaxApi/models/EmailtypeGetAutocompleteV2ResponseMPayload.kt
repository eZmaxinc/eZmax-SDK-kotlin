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

import eZmaxApi.models.EmailtypeAutocompleteElementResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/emailtype/getAutocomplete
 *
 * @param aObjEmailtype An array of Emailtype autocomplete element response.
 */


data class EmailtypeGetAutocompleteV2ResponseMPayload (

    /* An array of Emailtype autocomplete element response. */
    @Json(name = "a_objEmailtype")
    val aObjEmailtype: kotlin.collections.List<EmailtypeAutocompleteElementResponse>? = null

)


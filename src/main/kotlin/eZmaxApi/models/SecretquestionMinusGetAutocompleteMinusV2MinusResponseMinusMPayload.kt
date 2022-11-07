/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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

import eZmaxApi.models.SecretquestionMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json

/**
 * Payload for POST /2/object/secretquestion/getAutocomplete
 *
 * @param aObjSecretquestion An array of Secretquestion autocomplete element response.
 */

data class SecretquestionMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Secretquestion autocomplete element response. */
    @Json(name = "a_objSecretquestion")
    val aObjSecretquestion: kotlin.collections.List<SecretquestionMinusAutocompleteElementMinusResponse>

)


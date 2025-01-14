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

import eZmaxApi.models.SecretquestionAutocompleteElementResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/secretquestion/getAutocomplete
 *
 * @param aObjSecretquestion An array of Secretquestion autocomplete element response.
 */


data class SecretquestionGetAutocompleteV2ResponseMPayload (

    /* An array of Secretquestion autocomplete element response. */
    @Json(name = "a_objSecretquestion")
    val aObjSecretquestion: kotlin.collections.List<SecretquestionAutocompleteElementResponse>

) {


}


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

import eZmaxApi.models.CustomerAutocompleteElementResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/customer/getAutocomplete
 *
 * @param aObjCustomer An array of Customer autocomplete element response.
 */


data class CustomerGetAutocompleteV2ResponseMPayload (

    /* An array of Customer autocomplete element response. */
    @Json(name = "a_objCustomer")
    val aObjCustomer: kotlin.collections.List<CustomerAutocompleteElementResponse>

) {


}


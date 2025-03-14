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
 * A Customer AutocompleteElement Response
 *
 * @param pkiCustomerID The unique ID of the Customer.
 * @param sCustomerName The name of the Customer
 * @param bCustomerIsactive Whether the customer is active or not
 */


data class CustomerAutocompleteElementResponse (

    /* The unique ID of the Customer. */
    @Json(name = "pkiCustomerID")
    val pkiCustomerID: kotlin.Int,

    /* The name of the Customer */
    @Json(name = "sCustomerName")
    val sCustomerName: kotlin.String,

    /* Whether the customer is active or not */
    @Json(name = "bCustomerIsactive")
    val bCustomerIsactive: kotlin.Boolean

) {


}


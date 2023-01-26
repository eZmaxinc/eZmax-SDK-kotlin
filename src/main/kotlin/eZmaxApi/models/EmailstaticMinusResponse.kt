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
 * An Emailstatic Object
 *
 * @param pkiEmailstaticID The unique ID of the Emailstatic
 * @param sEmailstaticAddress The email address.
 */


data class EmailstaticMinusResponse (

    /* The unique ID of the Emailstatic */
    @Json(name = "pkiEmailstaticID")
    val pkiEmailstaticID: kotlin.Int,

    /* The email address. */
    @Json(name = "sEmailstaticAddress")
    val sEmailstaticAddress: kotlin.String

)


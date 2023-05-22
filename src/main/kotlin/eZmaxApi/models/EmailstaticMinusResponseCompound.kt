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
 * An Emailstatic Object and children to create a complete structure
 *
 * @param pkiEmailstaticID The unique ID of the Emailstatic
 * @param sEmailstaticAddress The email address.
 */


data class EmailstaticMinusResponseCompound (

    /* The unique ID of the Emailstatic */
    @Json(name = "pkiEmailstaticID")
    val pkiEmailstaticID: kotlin.Int,

    /* The email address. */
    @Json(name = "sEmailstaticAddress")
    val sEmailstaticAddress: kotlin.String

)


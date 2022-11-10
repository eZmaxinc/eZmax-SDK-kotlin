/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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
 * A Custom ContactName Object
 *
 * @param sContactFirstname The First name of the contact
 * @param sContactLastname The Last name of the contact
 * @param sContactCompany The Company name of the contact
 */

data class CustomMinusContactNameMinusResponse (

    /* The First name of the contact */
    @Json(name = "sContactFirstname")
    val sContactFirstname: kotlin.String? = null,

    /* The Last name of the contact */
    @Json(name = "sContactLastname")
    val sContactLastname: kotlin.String? = null,

    /* The Company name of the contact */
    @Json(name = "sContactCompany")
    val sContactCompany: kotlin.String? = null

)


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

import eZmaxApi.models.CustomMinusContactNameMinusResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param objContactName 
 */

data class EzmaxinvoicingcommissionResponseCompoundAllOf (

    @Json(name = "objContactName")
    val objContactName: CustomMinusContactNameMinusResponse? = null

)


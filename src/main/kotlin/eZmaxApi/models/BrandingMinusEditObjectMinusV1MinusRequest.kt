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

import eZmaxApi.models.BrandingMinusRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for PUT /1/object/branding/{pkiBrandingID}
 *
 * @param objBranding 
 */


data class BrandingMinusEditObjectMinusV1MinusRequest (

    @Json(name = "objBranding")
    val objBranding: BrandingMinusRequestCompound

)


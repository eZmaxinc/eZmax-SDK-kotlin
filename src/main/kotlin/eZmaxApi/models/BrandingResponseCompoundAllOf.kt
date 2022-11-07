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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param sBrandingLogourl The url of the picture used as logo in the Branding
 */

data class BrandingResponseCompoundAllOf (

    /* The url of the picture used as logo in the Branding */
    @Json(name = "sBrandingLogourl")
    val sBrandingLogourl: kotlin.String? = null

)


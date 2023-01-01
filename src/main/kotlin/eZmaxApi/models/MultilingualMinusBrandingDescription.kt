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
 * Description of the Branding
 *
 * @param sBrandingDescription1 The description of the Branding in French
 * @param sBrandingDescription2 The description of the Branding in English
 */


data class MultilingualMinusBrandingDescription (

    /* The description of the Branding in French */
    @Json(name = "sBrandingDescription1")
    val sBrandingDescription1: kotlin.String? = null,

    /* The description of the Branding in English */
    @Json(name = "sBrandingDescription2")
    val sBrandingDescription2: kotlin.String? = null

)


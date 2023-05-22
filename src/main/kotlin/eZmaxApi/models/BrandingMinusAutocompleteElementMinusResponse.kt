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
 * Branding AutocompleteElement Response
 *
 * @param sBrandingDescriptionX The Description of the Branding in the language of the requester
 * @param pkiBrandingID The unique ID of the Branding
 * @param bBrandingIsactive Whether the Branding is active or not
 */


data class BrandingMinusAutocompleteElementMinusResponse (

    /* The Description of the Branding in the language of the requester */
    @Json(name = "sBrandingDescriptionX")
    val sBrandingDescriptionX: kotlin.String,

    /* The unique ID of the Branding */
    @Json(name = "pkiBrandingID")
    val pkiBrandingID: kotlin.Int,

    /* Whether the Branding is active or not */
    @Json(name = "bBrandingIsactive")
    val bBrandingIsactive: kotlin.Boolean

)


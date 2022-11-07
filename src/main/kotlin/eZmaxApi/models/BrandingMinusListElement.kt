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
 * A Branding List Element
 *
 * @param pkiBrandingID The unique ID of the Branding
 * @param sBrandingDescriptionX The Description of the Branding in the language of the requester
 * @param iBrandingColortext The color of the text. This is a RGB color converted into integer
 * @param iBrandingColortextlinkbox The color of the text in the link box. This is a RGB color converted into integer
 * @param iBrandingColortextbutton The color of the text in the button. This is a RGB color converted into integer
 * @param iBrandingColorbackground The color of the background. This is a RGB color converted into integer
 * @param iBrandingColorbackgroundbutton The color of the background of the button. This is a RGB color converted into integer
 * @param iBrandingColorbackgroundsmallbox The color of the background of the small box. This is a RGB color converted into integer
 * @param bBrandingIsactive Whether the Branding is active or not
 */

data class BrandingMinusListElement (

    /* The unique ID of the Branding */
    @Json(name = "pkiBrandingID")
    val pkiBrandingID: kotlin.Int,

    /* The Description of the Branding in the language of the requester */
    @Json(name = "sBrandingDescriptionX")
    val sBrandingDescriptionX: kotlin.String,

    /* The color of the text. This is a RGB color converted into integer */
    @Json(name = "iBrandingColortext")
    val iBrandingColortext: kotlin.Int,

    /* The color of the text in the link box. This is a RGB color converted into integer */
    @Json(name = "iBrandingColortextlinkbox")
    val iBrandingColortextlinkbox: kotlin.Int,

    /* The color of the text in the button. This is a RGB color converted into integer */
    @Json(name = "iBrandingColortextbutton")
    val iBrandingColortextbutton: kotlin.Int,

    /* The color of the background. This is a RGB color converted into integer */
    @Json(name = "iBrandingColorbackground")
    val iBrandingColorbackground: kotlin.Int,

    /* The color of the background of the button. This is a RGB color converted into integer */
    @Json(name = "iBrandingColorbackgroundbutton")
    val iBrandingColorbackgroundbutton: kotlin.Int,

    /* The color of the background of the small box. This is a RGB color converted into integer */
    @Json(name = "iBrandingColorbackgroundsmallbox")
    val iBrandingColorbackgroundsmallbox: kotlin.Int,

    /* Whether the Branding is active or not */
    @Json(name = "bBrandingIsactive")
    val bBrandingIsactive: kotlin.Boolean

)


/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
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

import eZmaxApi.models.BrandingMinusRequest
import eZmaxApi.models.FieldMinusEBrandingLogo
import eZmaxApi.models.MultilingualMinusBrandingDescription

import com.squareup.moshi.Json

/**
 * A Branding Object and children
 *
 * @param objBrandingDescription 
 * @param eBrandingLogo 
 * @param iBrandingColortext The color of the text. This is a RGB color converted into integer
 * @param iBrandingColortextlinkbox The color of the text in the link box. This is a RGB color converted into integer
 * @param iBrandingColortextbutton The color of the text in the button. This is a RGB color converted into integer
 * @param iBrandingColorbackground The color of the background. This is a RGB color converted into integer
 * @param iBrandingColorbackgroundbutton The color of the background of the button. This is a RGB color converted into integer
 * @param iBrandingColorbackgroundsmallbox The color of the background of the small box. This is a RGB color converted into integer
 * @param bBrandingIsactive Whether the Branding is active or not
 * @param pkiBrandingID The unique ID of the Branding
 * @param sBrandingBase64 The Base64 encoded binary content of the branding logo. This need to match image type selected in eBrandingLogo if you supply an image. If you select 'Default', the logo will be deleted and the default one will be used.
 */

data class BrandingMinusRequestCompound (

    @Json(name = "objBrandingDescription")
    val objBrandingDescription: MultilingualMinusBrandingDescription,

    @Json(name = "eBrandingLogo")
    val eBrandingLogo: FieldMinusEBrandingLogo,

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
    val bBrandingIsactive: kotlin.Boolean,

    /* The unique ID of the Branding */
    @Json(name = "pkiBrandingID")
    val pkiBrandingID: kotlin.Int? = null,

    /* The Base64 encoded binary content of the branding logo. This need to match image type selected in eBrandingLogo if you supply an image. If you select 'Default', the logo will be deleted and the default one will be used. */
    @Json(name = "sBrandingBase64")
    val sBrandingBase64: kotlin.ByteArray? = null

)


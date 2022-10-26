/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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
 * An Ezsigntemplatedocumentpage Object
 *
 * @param pkiEzsigntemplatedocumentpageID The unique ID of the Ezsigntemplatedocumentpage
 * @param iEzsigntemplatedocumentpageWidthimage The Width of the page's image in pixels calculated at 100 DPI
 * @param iEzsigntemplatedocumentpageHeightimage The Height of the page's image in pixels calculated at 100 DPI
 * @param iEzsigntemplatedocumentpageWidthpdf The Width of the page in points calculated at 72 DPI
 * @param iEzsigntemplatedocumentpageHeightpdf The Height of the page in points calculated at 72 DPI
 * @param iEzsigntemplatedocumentpagePagenumber The page number in the Ezsigntemplatedocument
 * @param sComputedImageurl The Url to the Ezsigntemplatedocumentpage's rasterized image.  Url will expire after 5 minutes.
 */

data class EzsigntemplatedocumentpageMinusResponse (

    /* The unique ID of the Ezsigntemplatedocumentpage */
    @Json(name = "pkiEzsigntemplatedocumentpageID")
    val pkiEzsigntemplatedocumentpageID: kotlin.Int,

    /* The Width of the page's image in pixels calculated at 100 DPI */
    @Json(name = "iEzsigntemplatedocumentpageWidthimage")
    val iEzsigntemplatedocumentpageWidthimage: kotlin.Int,

    /* The Height of the page's image in pixels calculated at 100 DPI */
    @Json(name = "iEzsigntemplatedocumentpageHeightimage")
    val iEzsigntemplatedocumentpageHeightimage: kotlin.Int,

    /* The Width of the page in points calculated at 72 DPI */
    @Json(name = "iEzsigntemplatedocumentpageWidthpdf")
    val iEzsigntemplatedocumentpageWidthpdf: kotlin.Int,

    /* The Height of the page in points calculated at 72 DPI */
    @Json(name = "iEzsigntemplatedocumentpageHeightpdf")
    val iEzsigntemplatedocumentpageHeightpdf: kotlin.Int,

    /* The page number in the Ezsigntemplatedocument */
    @Json(name = "iEzsigntemplatedocumentpagePagenumber")
    val iEzsigntemplatedocumentpagePagenumber: kotlin.Int,

    /* The Url to the Ezsigntemplatedocumentpage's rasterized image.  Url will expire after 5 minutes. */
    @Json(name = "sComputedImageurl")
    val sComputedImageurl: kotlin.String

)


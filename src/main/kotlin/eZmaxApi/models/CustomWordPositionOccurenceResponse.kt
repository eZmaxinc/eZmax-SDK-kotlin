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
 * A Word Position Object
 *
 * @param iPage The page where the word occurence was found
 * @param iX The X coordinate (Horizontal) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).
 * @param iY The Y coordinate (Vertical) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch).
 */


data class CustomWordPositionOccurenceResponse (

    /* The page where the word occurence was found */
    @Json(name = "iPage")
    val iPage: kotlin.Int? = null,

    /* The X coordinate (Horizontal) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch). */
    @Json(name = "iX")
    val iX: kotlin.Int? = null,

    /* The Y coordinate (Vertical) where the Word occurence was found.  Coordinate is calculated at 100dpi (dot per inch). */
    @Json(name = "iY")
    val iY: kotlin.Int? = null

) {


}


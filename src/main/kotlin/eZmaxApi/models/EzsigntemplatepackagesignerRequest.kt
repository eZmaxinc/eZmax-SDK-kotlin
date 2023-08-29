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
 * A Ezsigntemplatepackagesigner Object
 *
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param sEzsigntemplatepackagesignerDescription The description of the Ezsigntemplatepackagesigner
 * @param pkiEzsigntemplatepackagesignerID The unique ID of the Ezsigntemplatepackagesigner
 */


data class EzsigntemplatepackagesignerRequest (

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "fkiEzsigntemplatepackageID")
    val fkiEzsigntemplatepackageID: kotlin.Int,

    /* The description of the Ezsigntemplatepackagesigner */
    @Json(name = "sEzsigntemplatepackagesignerDescription")
    val sEzsigntemplatepackagesignerDescription: kotlin.String,

    /* The unique ID of the Ezsigntemplatepackagesigner */
    @Json(name = "pkiEzsigntemplatepackagesignerID")
    val pkiEzsigntemplatepackagesignerID: kotlin.Int? = null

)


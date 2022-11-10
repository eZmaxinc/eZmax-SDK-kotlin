/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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
 * A Ezsigntemplatepackagesigner Object
 *
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param sEzsigntemplatepackagesignerDescription The description of the Ezsigntemplatepackagesigner
 * @param pkiEzsigntemplatepackagesignerID The unique ID of the Ezsigntemplatepackagesigner
 */

data class EzsigntemplatepackagesignerMinusRequest (

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


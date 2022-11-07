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

import eZmaxApi.models.EzsignbulksenddocumentmappingMinusRequest

import com.squareup.moshi.Json

/**
 * A Ezsignbulksenddocumentmapping Object and children
 *
 * @param fkiEzsignbulksendID The unique ID of the Ezsignbulksend
 * @param pkiEzsignbulksenddocumentmappingID The unique ID of the Ezsignbulksenddocumentmapping.
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param fkiEzsigntemplateID The unique ID of the Ezsigntemplate
 */

data class EzsignbulksenddocumentmappingMinusRequestCompound (

    /* The unique ID of the Ezsignbulksend */
    @Json(name = "fkiEzsignbulksendID")
    val fkiEzsignbulksendID: kotlin.Int,

    /* The unique ID of the Ezsignbulksenddocumentmapping. */
    @Json(name = "pkiEzsignbulksenddocumentmappingID")
    val pkiEzsignbulksenddocumentmappingID: kotlin.Int? = null,

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "fkiEzsigntemplatepackageID")
    val fkiEzsigntemplatepackageID: kotlin.Int? = null,

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "fkiEzsigntemplateID")
    val fkiEzsigntemplateID: kotlin.Int? = null

)


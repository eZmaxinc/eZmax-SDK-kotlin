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
 * A Ezsignbulksenddocumentmapping Object
 *
 * @param pkiEzsignbulksenddocumentmappingID The unique ID of the Ezsignbulksenddocumentmapping.
 * @param fkiEzsignbulksendID The unique ID of the Ezsignbulksend
 * @param iEzsignbulksenddocumentmappingOrder The order in which the Ezsigntemplate or Ezsigntemplatepackage will be presented to the signatory in the Ezsignfolder.
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param fkiEzsigntemplateID The unique ID of the Ezsigntemplate
 */

data class EzsignbulksenddocumentmappingMinusResponse (

    /* The unique ID of the Ezsignbulksenddocumentmapping. */
    @Json(name = "pkiEzsignbulksenddocumentmappingID")
    val pkiEzsignbulksenddocumentmappingID: kotlin.Int,

    /* The unique ID of the Ezsignbulksend */
    @Json(name = "fkiEzsignbulksendID")
    val fkiEzsignbulksendID: kotlin.Int,

    /* The order in which the Ezsigntemplate or Ezsigntemplatepackage will be presented to the signatory in the Ezsignfolder. */
    @Json(name = "iEzsignbulksenddocumentmappingOrder")
    val iEzsignbulksenddocumentmappingOrder: kotlin.Int,

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "fkiEzsigntemplatepackageID")
    val fkiEzsigntemplatepackageID: kotlin.Int? = null,

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "fkiEzsigntemplateID")
    val fkiEzsigntemplateID: kotlin.Int? = null

)


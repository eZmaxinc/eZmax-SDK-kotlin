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

import eZmaxApi.models.CustomMinusImportEzsigntemplatepackageRelationMinusRequest

import com.squareup.moshi.Json

/**
 * Request for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage
 *
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param dtEzsigndocumentDuedate The maximum date and time at which the Ezsigndocument can be signed.
 * @param aObjImportEzsigntemplatepackageRelation 
 */

data class EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusRequest (

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "fkiEzsigntemplatepackageID")
    val fkiEzsigntemplatepackageID: kotlin.Int,

    /* The maximum date and time at which the Ezsigndocument can be signed. */
    @Json(name = "dtEzsigndocumentDuedate")
    val dtEzsigndocumentDuedate: kotlin.String,

    @Json(name = "a_objImportEzsigntemplatepackageRelation")
    val aObjImportEzsigntemplatepackageRelation: kotlin.collections.List<CustomMinusImportEzsigntemplatepackageRelationMinusRequest>

)


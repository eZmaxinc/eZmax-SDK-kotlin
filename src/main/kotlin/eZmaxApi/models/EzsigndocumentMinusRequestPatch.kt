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


import com.squareup.moshi.Json

/**
 * An Ezsigndocument Object
 *
 * @param dtEzsigndocumentDuedate The maximum date and time at which the Ezsigndocument can be signed.
 * @param sEzsigndocumentName The name of the document that will be presented to Ezsignfoldersignerassociations
 */

data class EzsigndocumentMinusRequestPatch (

    /* The maximum date and time at which the Ezsigndocument can be signed. */
    @Json(name = "dtEzsigndocumentDuedate")
    val dtEzsigndocumentDuedate: kotlin.String? = null,

    /* The name of the document that will be presented to Ezsignfoldersignerassociations */
    @Json(name = "sEzsigndocumentName")
    val sEzsigndocumentName: kotlin.String? = null

)


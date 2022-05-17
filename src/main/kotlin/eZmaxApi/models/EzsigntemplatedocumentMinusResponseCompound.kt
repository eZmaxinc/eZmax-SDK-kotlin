/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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

import eZmaxApi.models.EzsigntemplatedocumentMinusResponse

import com.squareup.moshi.Json

/**
 * A Ezsigntemplatedocument Object
 *
 * @param pkiEzsigntemplatedocumentID The unique ID of the Ezsigntemplatedocument
 * @param fkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param sEzsigntemplatedocumentName The name of the Ezsigntemplatedocument.
 * @param iEzsigntemplatedocumentPagetotal The number of pages in the Ezsigntemplatedocument.
 * @param iEzsigntemplatedocumentSignaturetotal The number of total signatures in the Ezsigntemplate.
 */

data class EzsigntemplatedocumentMinusResponseCompound (

    /* The unique ID of the Ezsigntemplatedocument */
    @Json(name = "pkiEzsigntemplatedocumentID")
    val pkiEzsigntemplatedocumentID: kotlin.Int,

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "fkiEzsigntemplateID")
    val fkiEzsigntemplateID: kotlin.Int,

    /* The name of the Ezsigntemplatedocument. */
    @Json(name = "sEzsigntemplatedocumentName")
    val sEzsigntemplatedocumentName: kotlin.String,

    /* The number of pages in the Ezsigntemplatedocument. */
    @Json(name = "iEzsigntemplatedocumentPagetotal")
    val iEzsigntemplatedocumentPagetotal: kotlin.Int,

    /* The number of total signatures in the Ezsigntemplate. */
    @Json(name = "iEzsigntemplatedocumentSignaturetotal")
    val iEzsigntemplatedocumentSignaturetotal: kotlin.Int

)


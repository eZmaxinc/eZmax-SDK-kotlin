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
 * Payload for POST /1/object/ezsigntemplatepackagemembership
 *
 * @param aPkiEzsigntemplatepackagemembershipID An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
 * @param bEzsigntemplatepackageNeedvalidation Whether the Ezsignbulksend was automatically modified and needs a manual validation
 * @param bEzsignbulksendNeedvalidation Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation
 */

data class EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponseMinusMPayload (

    /* An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request. */
    @Json(name = "a_pkiEzsigntemplatepackagemembershipID")
    val aPkiEzsigntemplatepackagemembershipID: kotlin.collections.List<kotlin.Int>,

    /* Whether the Ezsignbulksend was automatically modified and needs a manual validation */
    @Json(name = "bEzsigntemplatepackageNeedvalidation")
    val bEzsigntemplatepackageNeedvalidation: kotlin.Boolean,

    /* Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation */
    @Json(name = "bEzsignbulksendNeedvalidation")
    val bEzsignbulksendNeedvalidation: kotlin.Boolean

)


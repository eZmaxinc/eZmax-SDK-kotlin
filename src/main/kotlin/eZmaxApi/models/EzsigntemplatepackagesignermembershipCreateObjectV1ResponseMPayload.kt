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
 * Payload for POST /1/object/ezsigntemplatepackagesignermembership
 *
 * @param aPkiEzsigntemplatepackagesignermembershipID An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
 */


data class EzsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload (

    /* An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request. */
    @Json(name = "a_pkiEzsigntemplatepackagesignermembershipID")
    val aPkiEzsigntemplatepackagesignermembershipID: kotlin.collections.List<kotlin.Int>

) {


}


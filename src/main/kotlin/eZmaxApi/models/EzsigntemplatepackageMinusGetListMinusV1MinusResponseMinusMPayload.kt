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

import eZmaxApi.models.CommonMinusGetListMinusV1MinusResponseMinusMPayload
import eZmaxApi.models.EzsigntemplatepackageGetListV1ResponseMPayloadAllOf
import eZmaxApi.models.EzsigntemplatepackageMinusListElement

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/ezsigntemplatepackage/getList
 *
 * @param aObjEzsigntemplatepackage 
 * @param iRowReturned The number of rows returned
 * @param iRowFiltered The number of rows matching your filters (if any) or the total number of rows
 */

data class EzsigntemplatepackageMinusGetListMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objEzsigntemplatepackage")
    val aObjEzsigntemplatepackage: kotlin.collections.List<EzsigntemplatepackageMinusListElement>,

    /* The number of rows returned */
    @Json(name = "iRowReturned")
    val iRowReturned: kotlin.Int,

    /* The number of rows matching your filters (if any) or the total number of rows */
    @Json(name = "iRowFiltered")
    val iRowFiltered: kotlin.Int

)


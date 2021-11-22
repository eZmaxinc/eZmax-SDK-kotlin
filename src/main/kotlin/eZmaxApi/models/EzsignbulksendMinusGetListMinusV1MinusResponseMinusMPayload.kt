/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.3
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
import eZmaxApi.models.EzsignbulksendGetListV1ResponseMPayloadAllOf
import eZmaxApi.models.EzsignbulksendMinusListElement

import com.squareup.moshi.Json

/**
 * Payload for the /1/object/ezsignbulksend/getList API Request
 *
 * @param iRowReturned The number of rows returned
 * @param iRowFiltered The number of rows matching your filters (if any) or the total number of rows
 * @param aObjEzsignfolder 
 */

data class EzsignbulksendMinusGetListMinusV1MinusResponseMinusMPayload (

    /* The number of rows returned */
    @Json(name = "iRowReturned")
    val iRowReturned: kotlin.Int,

    /* The number of rows matching your filters (if any) or the total number of rows */
    @Json(name = "iRowFiltered")
    val iRowFiltered: kotlin.Int,

    @Json(name = "a_objEzsignfolder")
    val aObjEzsignfolder: kotlin.collections.List<EzsignbulksendMinusListElement>? = null

)


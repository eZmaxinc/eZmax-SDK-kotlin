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

import eZmaxApi.models.CommonMinusGetListMinusV1MinusResponseMinusMPayload
import eZmaxApi.models.EzsignfoldertypeGetListV1ResponseMPayloadAllOf
import eZmaxApi.models.EzsignfoldertypeMinusListElement

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/ezsignfoldertype/getList
 *
 * @param aObjEzsignfoldertype 
 * @param iRowReturned The number of rows returned
 * @param iRowFiltered The number of rows matching your filters (if any) or the total number of rows
 */

data class EzsignfoldertypeMinusGetListMinusV1MinusResponseMinusMPayload (

    /*  */
    @Json(name = "a_objEzsignfoldertype")
    val aObjEzsignfoldertype: kotlin.collections.List<EzsignfoldertypeMinusListElement>,

    /* The number of rows returned */
    @Json(name = "iRowReturned")
    val iRowReturned: kotlin.Int,

    /* The number of rows matching your filters (if any) or the total number of rows */
    @Json(name = "iRowFiltered")
    val iRowFiltered: kotlin.Int

)


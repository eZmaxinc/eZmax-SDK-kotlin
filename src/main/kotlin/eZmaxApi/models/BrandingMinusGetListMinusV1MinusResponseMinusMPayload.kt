/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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

import eZmaxApi.models.BrandingGetListV1ResponseMPayloadAllOf
import eZmaxApi.models.BrandingMinusListElement
import eZmaxApi.models.CommonMinusGetListMinusV1MinusResponseMinusMPayload

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/branding/getList
 *
 * @param aObjBranding 
 * @param iRowReturned The number of rows returned
 * @param iRowFiltered The number of rows matching your filters (if any) or the total number of rows
 */

data class BrandingMinusGetListMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objBranding")
    val aObjBranding: kotlin.collections.List<BrandingMinusListElement>,

    /* The number of rows returned */
    @Json(name = "iRowReturned")
    val iRowReturned: kotlin.Int,

    /* The number of rows matching your filters (if any) or the total number of rows */
    @Json(name = "iRowFiltered")
    val iRowFiltered: kotlin.Int

)


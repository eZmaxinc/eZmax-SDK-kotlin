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

import eZmaxApi.models.UserstagedListElement

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/userstaged/getList
 *
 * @param iRowReturned The number of rows returned
 * @param iRowFiltered The number of rows matching your filters (if any) or the total number of rows
 * @param aObjUserstaged 
 */


data class UserstagedGetListV1ResponseMPayload (

    /* The number of rows returned */
    @Json(name = "iRowReturned")
    val iRowReturned: kotlin.Int,

    /* The number of rows matching your filters (if any) or the total number of rows */
    @Json(name = "iRowFiltered")
    val iRowFiltered: kotlin.Int,

    @Json(name = "a_objUserstaged")
    val aObjUserstaged: kotlin.collections.List<UserstagedListElement>

) {


}


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

import eZmaxApi.models.CommonGetListV1ResponseMPayload
import eZmaxApi.models.EzsignfolderListElement

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /1/object/ezsignfolder/getList
 *
 * @param iRowReturned The number of rows returned
 * @param iRowFiltered The number of rows matching your filters (if any) or the total number of rows
 * @param aObjEzsignfolder 
 */


data class EzsignfolderGetListV1ResponseMPayload (

    /* The number of rows returned */
    @Json(name = "iRowReturned")
    override val iRowReturned: kotlin.Int,

    /* The number of rows matching your filters (if any) or the total number of rows */
    @Json(name = "iRowFiltered")
    override val iRowFiltered: kotlin.Int,

    @Json(name = "a_objEzsignfolder")
    val aObjEzsignfolder: kotlin.collections.List<EzsignfolderListElement>

) : CommonGetListV1ResponseMPayload {


}


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

import eZmaxApi.models.SupplyRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/supply
 *
 * @param aObjSupply 
 */


data class SupplyCreateObjectV1Request (

    @Json(name = "a_objSupply")
    val aObjSupply: kotlin.collections.List<SupplyRequestCompound>

) {


}


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

import eZmaxApi.models.UsergroupRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/usergroup
 *
 * @param aObjUsergroup 
 */


data class UsergroupCreateObjectV1Request (

    @Json(name = "a_objUsergroup")
    val aObjUsergroup: kotlin.collections.List<UsergroupRequestCompound>

) {


}


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

import eZmaxApi.models.PermissionRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for POST /1/object/permission
 *
 * @param aObjPermission 
 */


data class PermissionCreateObjectV1Request (

    @Json(name = "a_objPermission")
    val aObjPermission: kotlin.collections.List<PermissionRequest>

) {


}


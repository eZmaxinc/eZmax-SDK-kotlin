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

import eZmaxApi.models.PermissionMinusRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for PUT /1/object/user/{pkiUserID}/editPermissions
 *
 * @param aObjPermission 
 */


data class UserMinusEditPermissionsMinusV1MinusRequest (

    @Json(name = "a_objPermission")
    val aObjPermission: kotlin.collections.List<PermissionMinusRequestCompound>

)


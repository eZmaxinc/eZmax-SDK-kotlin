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

import eZmaxApi.models.UsergroupmembershipMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/usergroup/{pkiUsergroupID}/getUsergroupmemberships
 *
 * @param aObjUsergroupmembership 
 */


data class UsergroupMinusGetUsergroupmembershipsMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objUsergroupmembership")
    val aObjUsergroupmembership: kotlin.collections.List<UsergroupmembershipMinusResponseCompound>

)


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

import eZmaxApi.models.SubnetMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response for GET /1/object/user/{pkiUserID}/getSubnets
 *
 * @param aObjSubnet 
 */


data class UserMinusGetSubnetsMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objSubnet")
    val aObjSubnet: kotlin.collections.List<SubnetMinusResponseCompound>

)


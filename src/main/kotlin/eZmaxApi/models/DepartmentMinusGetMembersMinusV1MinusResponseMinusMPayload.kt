/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
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


import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/department/{pkiDepartmentID}/getMembers
 *
 * @param aFkiAgentID 
 * @param aFkiBrokerID 
 * @param aFkiCustomerID 
 * @param aFkiEmployeeID 
 */

data class DepartmentMinusGetMembersMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_fkiAgentID")
    val aFkiAgentID: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "a_fkiBrokerID")
    val aFkiBrokerID: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "a_fkiCustomerID")
    val aFkiCustomerID: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "a_fkiEmployeeID")
    val aFkiEmployeeID: kotlin.collections.List<kotlin.Int>? = null

)


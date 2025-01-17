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

import eZmaxApi.models.MultilingualSubnetDescription
import eZmaxApi.models.SubnetRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Subnet Object and children
 *
 * @param objSubnetDescription 
 * @param iSubnetNetwork The network of the Subnet in integer form. For example 8.8.8.0 would be 134744064
 * @param iSubnetMask The mask of the Subnet  in integer form. For example 255.255.255.0 would be 4294967040
 * @param pkiSubnetID The unique ID of the Subnet
 * @param fkiUserID The unique ID of the User
 * @param fkiApikeyID The unique ID of the Apikey
 */


class SubnetRequestCompound (

    @Json(name = "objSubnetDescription")
    override val objSubnetDescription: MultilingualSubnetDescription,

    /* The network of the Subnet in integer form. For example 8.8.8.0 would be 134744064 */
    @Json(name = "iSubnetNetwork")
    override val iSubnetNetwork: kotlin.Long,

    /* The mask of the Subnet  in integer form. For example 255.255.255.0 would be 4294967040 */
    @Json(name = "iSubnetMask")
    override val iSubnetMask: kotlin.Long,

    /* The unique ID of the Subnet */
    @Json(name = "pkiSubnetID")
    override val pkiSubnetID: kotlin.Int? = null,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    override val fkiUserID: kotlin.Int? = null,

    /* The unique ID of the Apikey */
    @Json(name = "fkiApikeyID")
    override val fkiApikeyID: kotlin.Int? = null

) : SubnetRequest {


}


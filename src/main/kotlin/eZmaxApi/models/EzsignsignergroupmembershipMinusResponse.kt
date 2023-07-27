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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsignsignergroupmembership Object
 *
 * @param pkiEzsignsignergroupmembershipID The unique ID of the Ezsignsignergroupmembership
 * @param fkiEzsignsignergroupID The unique ID of the Ezsignsignergroup
 * @param fkiEzsignsignerID The unique ID of the Ezsignsigner
 * @param fkiUserID The unique ID of the User
 * @param fkiUsergroupID The unique ID of the Usergroup
 */


data class EzsignsignergroupmembershipMinusResponse (

    /* The unique ID of the Ezsignsignergroupmembership */
    @Json(name = "pkiEzsignsignergroupmembershipID")
    val pkiEzsignsignergroupmembershipID: kotlin.Int,

    /* The unique ID of the Ezsignsignergroup */
    @Json(name = "fkiEzsignsignergroupID")
    val fkiEzsignsignergroupID: kotlin.Int,

    /* The unique ID of the Ezsignsigner */
    @Json(name = "fkiEzsignsignerID")
    val fkiEzsignsignerID: kotlin.Int,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int,

    /* The unique ID of the Usergroup */
    @Json(name = "fkiUsergroupID")
    val fkiUsergroupID: kotlin.Int

)


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

import eZmaxApi.models.UsergroupdelegationRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Usergroupdelegation Object and children
 *
 * @param fkiUsergroupID The unique ID of the Usergroup
 * @param fkiUserID The unique ID of the User
 * @param pkiUsergroupdelegationID The unique ID of the Usergroupdelegation
 */


class UsergroupdelegationRequestCompound (

    /* The unique ID of the Usergroup */
    @Json(name = "fkiUsergroupID")
    override val fkiUsergroupID: kotlin.Int,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    override val fkiUserID: kotlin.Int,

    /* The unique ID of the Usergroupdelegation */
    @Json(name = "pkiUsergroupdelegationID")
    override val pkiUsergroupdelegationID: kotlin.Int? = null

) : UsergroupdelegationRequest {


}


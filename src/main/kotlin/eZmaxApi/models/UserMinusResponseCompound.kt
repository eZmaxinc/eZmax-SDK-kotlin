/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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

import eZmaxApi.models.CommonMinusAudit
import eZmaxApi.models.FieldMinusEUserType
import eZmaxApi.models.UserMinusResponse

import com.squareup.moshi.Json

/**
 * A User Object and children to create a complete structure
 *
 * @param pkiUserID The unique ID of the User
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param eUserType 
 * @param sUserFirstname The First name of the user
 * @param sUserLastname The Last name of the user
 * @param sUserLoginname The Login name of the User.
 * @param objAudit 
 */

data class UserMinusResponseCompound (

    /* The unique ID of the User */
    @Json(name = "pkiUserID")
    val pkiUserID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    @Json(name = "eUserType")
    val eUserType: FieldMinusEUserType,

    /* The First name of the user */
    @Json(name = "sUserFirstname")
    val sUserFirstname: kotlin.String,

    /* The Last name of the user */
    @Json(name = "sUserLastname")
    val sUserLastname: kotlin.String,

    /* The Login name of the User. */
    @Json(name = "sUserLoginname")
    val sUserLoginname: kotlin.String,

    @Json(name = "objAudit")
    val objAudit: CommonMinusAudit

)


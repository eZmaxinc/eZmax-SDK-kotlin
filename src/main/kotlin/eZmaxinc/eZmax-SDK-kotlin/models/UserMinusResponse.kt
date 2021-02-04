/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
*
* The version of the OpenAPI document: 1.0.28
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models

import eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusAudit
import eZmaxinc/eZmax-SDK-kotlin.models.FieldMinusEUserType
import eZmaxinc/eZmax-SDK-kotlin.models.UserResponseAllOf

import com.squareup.moshi.Json

/**
 * A User Object
 * @param pkiUserID The unique ID of the User
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param eUserType 
 * @param sUserFirstname The First name of the user
 * @param sUserLastname The Last name of the user
 * @param sUserLoginname The Login name of the User.
 * @param objAudit 
 */

data class UserMinusResponse (
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


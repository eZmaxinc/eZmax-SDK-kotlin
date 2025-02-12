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
 * A form Signer Object in the context of an Ezsignfoldertransmissions
 *
 * @param fkiUserID The unique ID of the User
 * @param fkiEzsignsignergroupID The unique ID of the Ezsignsignergroup
 * @param sContactFirstname The First name of the contact
 * @param sContactLastname The Last name of the contact
 * @param sEzsignsignergroupDescriptionX The Description of the Ezsignsignergroup in the language of the requester
 */


data class CustomEzsignfolderezsigntemplatepublicSignerResponse (

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int? = null,

    /* The unique ID of the Ezsignsignergroup */
    @Json(name = "fkiEzsignsignergroupID")
    val fkiEzsignsignergroupID: kotlin.Int? = null,

    /* The First name of the contact */
    @Json(name = "sContactFirstname")
    val sContactFirstname: kotlin.String? = null,

    /* The Last name of the contact */
    @Json(name = "sContactLastname")
    val sContactLastname: kotlin.String? = null,

    /* The Description of the Ezsignsignergroup in the language of the requester */
    @Json(name = "sEzsignsignergroupDescriptionX")
    val sEzsignsignergroupDescriptionX: kotlin.String? = null

) {


}


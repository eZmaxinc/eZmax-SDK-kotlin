/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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

import eZmaxApi.models.CustomMinusFormDataEzsignformfieldgroupMinusResponse

import com.squareup.moshi.Json

/**
 * A form Data Signer Object
 *
 * @param fkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation
 * @param sContactFirstname The First name of the contact
 * @param sContactLastname The Last name of the contact
 * @param aObjEzsignformfieldgroup 
 * @param fkiUserID The unique ID of the User
 */

data class CustomMinusFormDataSignerMinusResponse (

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "fkiEzsignfoldersignerassociationID")
    val fkiEzsignfoldersignerassociationID: kotlin.Int,

    /* The First name of the contact */
    @Json(name = "sContactFirstname")
    val sContactFirstname: kotlin.String,

    /* The Last name of the contact */
    @Json(name = "sContactLastname")
    val sContactLastname: kotlin.String,

    @Json(name = "a_objEzsignformfieldgroup")
    val aObjEzsignformfieldgroup: kotlin.collections.List<CustomMinusFormDataEzsignformfieldgroupMinusResponse>,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int? = null

)


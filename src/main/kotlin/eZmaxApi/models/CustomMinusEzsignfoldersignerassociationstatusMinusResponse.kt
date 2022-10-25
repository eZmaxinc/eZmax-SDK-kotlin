/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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

import eZmaxApi.models.CustomMinusEzsignsignaturestatusMinusResponse

import com.squareup.moshi.Json

/**
 * A Ezsignfoldersignerassociationstatus Object and children to create a complete structure
 *
 * @param fkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation
 * @param sEzsignfoldersignerassociationstatusLastname The last name of the Ezsignsigner
 * @param sEzsignfoldersignerassociationstatusFirstname The first name of the Ezsignsigner
 * @param aObjEzsignsignaturestatus 
 */

data class CustomMinusEzsignfoldersignerassociationstatusMinusResponse (

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "fkiEzsignfoldersignerassociationID")
    val fkiEzsignfoldersignerassociationID: kotlin.Int,

    /* The last name of the Ezsignsigner */
    @Json(name = "sEzsignfoldersignerassociationstatusLastname")
    val sEzsignfoldersignerassociationstatusLastname: kotlin.String,

    /* The first name of the Ezsignsigner */
    @Json(name = "sEzsignfoldersignerassociationstatusFirstname")
    val sEzsignfoldersignerassociationstatusFirstname: kotlin.String,

    @Json(name = "a_objEzsignsignaturestatus")
    val aObjEzsignsignaturestatus: kotlin.collections.List<CustomMinusEzsignsignaturestatusMinusResponse>

)


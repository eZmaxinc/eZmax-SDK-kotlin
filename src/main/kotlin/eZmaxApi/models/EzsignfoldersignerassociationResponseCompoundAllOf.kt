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

import eZmaxApi.models.EzsignfoldersignerassociationMinusResponseCompoundMinusUser
import eZmaxApi.models.EzsignsignerMinusResponseCompound
import eZmaxApi.models.EzsignsignergroupMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param objEzsignsignergroup 
 * @param objUser 
 * @param objEzsignsigner 
 */


data class EzsignfoldersignerassociationResponseCompoundAllOf (

    @Json(name = "objEzsignsignergroup")
    val objEzsignsignergroup: EzsignsignergroupMinusResponseCompound? = null,

    @Json(name = "objUser")
    val objUser: EzsignfoldersignerassociationMinusResponseCompoundMinusUser? = null,

    @Json(name = "objEzsignsigner")
    val objEzsignsigner: EzsignsignerMinusResponseCompound? = null

)


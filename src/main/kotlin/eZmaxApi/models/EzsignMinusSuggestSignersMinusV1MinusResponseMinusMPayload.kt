/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
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

import eZmaxApi.models.CustomMinusUserMinusResponse
import eZmaxApi.models.EzsignfoldersignerassociationMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /1/module/ezsign/suggestSigners
 *
 * @param aObjEzsignfoldersignerassociation 
 * @param aObjUserTeam 
 * @param aObjUser 
 */

data class EzsignMinusSuggestSignersMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objEzsignfoldersignerassociation")
    val aObjEzsignfoldersignerassociation: kotlin.collections.List<EzsignfoldersignerassociationMinusResponseCompound>,

    @Json(name = "a_objUserTeam")
    val aObjUserTeam: kotlin.collections.List<CustomMinusUserMinusResponse>,

    @Json(name = "a_objUser")
    val aObjUser: kotlin.collections.List<CustomMinusUserMinusResponse>

)


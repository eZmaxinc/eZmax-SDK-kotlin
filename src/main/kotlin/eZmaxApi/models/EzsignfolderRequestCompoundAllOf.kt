/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.48
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

import eZmaxApi.models.EzsignfoldersignerassociationMinusRequest

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aEzsignfoldersignerassociation An array of signers that will be invited to sign the Ezsigndocuments
 */

data class EzsignfolderRequestCompoundAllOf (

    /* An array of signers that will be invited to sign the Ezsigndocuments */
    @Json(name = "a_Ezsignfoldersignerassociation")
    val aEzsignfoldersignerassociation: kotlin.collections.List<EzsignfoldersignerassociationMinusRequest>

)

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

import eZmaxApi.models.EzsignsignerMinusRequestCompound

import com.squareup.moshi.Json

/**
 * 
 *
 * @param objEzsignsigner 
 */

data class EzsignfoldersignerassociationRequestCompoundAllOf (

    @Json(name = "objEzsignsigner")
    val objEzsignsigner: EzsignsignerMinusRequestCompound? = null

)

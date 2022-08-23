/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param bEzsignfoldersignerassociationHasactionableelementsCurrent Indicates if the Ezsignfoldersignerassociation has actionable elements in the current step
 * @param bEzsignfoldersignerassociationHasactionableelementsFuture Indicates if the Ezsignfoldersignerassociation has actionable elements in a future step
 */

data class CustomEzsignfoldersignerassociationActionableElementResponseAllOf (

    /* Indicates if the Ezsignfoldersignerassociation has actionable elements in the current step */
    @Json(name = "bEzsignfoldersignerassociationHasactionableelementsCurrent")
    val bEzsignfoldersignerassociationHasactionableelementsCurrent: kotlin.Boolean,

    /* Indicates if the Ezsignfoldersignerassociation has actionable elements in a future step */
    @Json(name = "bEzsignfoldersignerassociationHasactionableelementsFuture")
    val bEzsignfoldersignerassociationHasactionableelementsFuture: kotlin.Boolean? = null

)


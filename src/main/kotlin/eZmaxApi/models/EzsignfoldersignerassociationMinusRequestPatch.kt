/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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
 * An Ezsignfoldersignerassociation Object
 *
 * @param tEzsignfoldersignerassociationMessage A custom text message that will be added to the email sent.
 */

data class EzsignfoldersignerassociationMinusRequestPatch (

    /* A custom text message that will be added to the email sent. */
    @Json(name = "tEzsignfoldersignerassociationMessage")
    val tEzsignfoldersignerassociationMessage: kotlin.String? = null

)


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
 * Request for POST /3/object/ezsignfolder/{pkiEzsignfolderID}/send
 *
 * @param tEzsignfolderMessage A custom text message that will be added to the email sent.
 * @param aFkiEzsignfoldersignerassociationID 
 * @param dtEzsignfolderDelayedsenddate The date and time at which the Ezsignfolder will be sent in the future.
 */


data class EzsignfolderSendV3Request (

    /* A custom text message that will be added to the email sent. */
    @Json(name = "tEzsignfolderMessage")
    val tEzsignfolderMessage: kotlin.String,

    @Json(name = "a_fkiEzsignfoldersignerassociationID")
    val aFkiEzsignfoldersignerassociationID: kotlin.collections.List<kotlin.Int>,

    /* The date and time at which the Ezsignfolder will be sent in the future. */
    @Json(name = "dtEzsignfolderDelayedsenddate")
    val dtEzsignfolderDelayedsenddate: kotlin.String? = null

)


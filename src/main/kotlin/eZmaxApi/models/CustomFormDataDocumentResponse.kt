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

import eZmaxApi.models.CustomFormDataSignerResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A form Data Document Object 
 *
 * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param sEzsigndocumentName The name of the document that will be presented to Ezsignfoldersignerassociations
 * @param dtModifiedDate The date and time at which the object was last modified
 * @param aObjFormDataSigner 
 */


data class CustomFormDataDocumentResponse (

    /* The unique ID of the Ezsigndocument */
    @Json(name = "pkiEzsigndocumentID")
    val pkiEzsigndocumentID: kotlin.Int,

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,

    /* The name of the document that will be presented to Ezsignfoldersignerassociations */
    @Json(name = "sEzsigndocumentName")
    val sEzsigndocumentName: kotlin.String,

    /* The date and time at which the object was last modified */
    @Json(name = "dtModifiedDate")
    val dtModifiedDate: kotlin.String,

    @Json(name = "a_objFormDataSigner")
    val aObjFormDataSigner: kotlin.collections.List<CustomFormDataSignerResponse>

) {


}


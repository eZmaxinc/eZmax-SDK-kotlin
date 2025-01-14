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

import eZmaxApi.models.CustomEzsignfoldertransmissionSignerResponse
import eZmaxApi.models.FieldEEzsignfolderStep

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsignfolder Object in the context of an Ezsignbulksendtransmission
 *
 * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param sEzsignfolderDescription The description of the Ezsignfolder
 * @param eEzsignfolderStep 
 * @param iEzsignfolderSignaturetotal The number of total signatures that were requested in the Ezsignfolder
 * @param iEzsignfolderFormfieldtotal The number of total form fields that were requested in the Ezsignfolder
 * @param iEzsignfolderSignaturesigned The number of signatures that were signed in the Ezsignfolder.
 * @param aObjEzsignfoldertransmissionSigner 
 */


data class CustomEzsignfoldertransmissionResponse (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "pkiEzsignfolderID")
    val pkiEzsignfolderID: kotlin.Int,

    /* The description of the Ezsignfolder */
    @Json(name = "sEzsignfolderDescription")
    val sEzsignfolderDescription: kotlin.String,

    @Json(name = "eEzsignfolderStep")
    val eEzsignfolderStep: FieldEEzsignfolderStep,

    /* The number of total signatures that were requested in the Ezsignfolder */
    @Json(name = "iEzsignfolderSignaturetotal")
    val iEzsignfolderSignaturetotal: kotlin.Int,

    /* The number of total form fields that were requested in the Ezsignfolder */
    @Json(name = "iEzsignfolderFormfieldtotal")
    val iEzsignfolderFormfieldtotal: kotlin.Int,

    /* The number of signatures that were signed in the Ezsignfolder. */
    @Json(name = "iEzsignfolderSignaturesigned")
    val iEzsignfolderSignaturesigned: kotlin.Int,

    @Json(name = "a_objEzsignfoldertransmissionSigner")
    val aObjEzsignfoldertransmissionSigner: kotlin.collections.List<CustomEzsignfoldertransmissionSignerResponse>

) {


}


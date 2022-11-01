/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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

import eZmaxApi.models.CustomMinusEzsignfoldertransmissionSignerMinusResponse
import eZmaxApi.models.FieldMinusEEzsignfolderStep

import com.squareup.moshi.Json

/**
 * An Ezsignfolder Object in the context of an Ezsignbulksendtransmission
 *
 * @param pkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param eEzsignfolderStep 
 * @param iEzsignfolderSignaturetotal The number of total signatures that were requested in the Ezsignfolder
 * @param iEzsignfolderSignaturesigned The number of signatures that were signed in the Ezsignfolder.
 * @param aObjEzsignfoldertransmissionSigner 
 */

data class CustomMinusEzsignfoldertransmissionMinusResponse (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "pkiEzsignfolderID")
    val pkiEzsignfolderID: kotlin.Int,

    @Json(name = "eEzsignfolderStep")
    val eEzsignfolderStep: FieldMinusEEzsignfolderStep,

    /* The number of total signatures that were requested in the Ezsignfolder */
    @Json(name = "iEzsignfolderSignaturetotal")
    val iEzsignfolderSignaturetotal: kotlin.Int,

    /* The number of signatures that were signed in the Ezsignfolder. */
    @Json(name = "iEzsignfolderSignaturesigned")
    val iEzsignfolderSignaturesigned: kotlin.Int,

    @Json(name = "a_objEzsignfoldertransmissionSigner")
    val aObjEzsignfoldertransmissionSigner: kotlin.collections.List<CustomMinusEzsignfoldertransmissionSignerMinusResponse>

)


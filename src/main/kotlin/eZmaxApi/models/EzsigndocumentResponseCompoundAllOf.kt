/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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

import eZmaxApi.models.CustomMinusEzsignfoldersignerassociationstatusMinusResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param iEzsigndocumentStepformtotal The total number of steps in the form filling phase
 * @param iEzsigndocumentStepformcurrent The current step in the form filling phase
 * @param iEzsigndocumentStepsignaturetotal The total number of steps in the signature filling phase
 * @param iEzsigndocumentStepsignatureCurrent The current step in the signature phase
 * @param aObjEzsignfoldersignerassociationstatus 
 */

data class EzsigndocumentResponseCompoundAllOf (

    /* The total number of steps in the form filling phase */
    @Json(name = "iEzsigndocumentStepformtotal")
    val iEzsigndocumentStepformtotal: kotlin.Int,

    /* The current step in the form filling phase */
    @Json(name = "iEzsigndocumentStepformcurrent")
    val iEzsigndocumentStepformcurrent: kotlin.Int,

    /* The total number of steps in the signature filling phase */
    @Json(name = "iEzsigndocumentStepsignaturetotal")
    val iEzsigndocumentStepsignaturetotal: kotlin.Int,

    /* The current step in the signature phase */
    @Json(name = "iEzsigndocumentStepsignatureCurrent")
    val iEzsigndocumentStepsignatureCurrent: kotlin.Int,

    @Json(name = "a_objEzsignfoldersignerassociationstatus")
    val aObjEzsignfoldersignerassociationstatus: kotlin.collections.List<CustomMinusEzsignfoldersignerassociationstatusMinusResponse>

)


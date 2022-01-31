/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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
 * A Ezsignsignaturestatus Object and children to create a complete structure
 *
 * @param eEzsignsignaturestatusSteptype Type of step
 * @param iEzsignsignaturestatusStep The step at which the Ezsignsigner will be invited to sign or fill the form fields
 * @param iEzsignsignaturestatusTotal The total number of signature or form fields the Ezsignsigner must process at the current step
 * @param iEzsignsignaturestatusSigned The number of signature or form fields the Ezsignsigner has already processed at the current step
 */

data class CustomMinusEzsignsignaturestatusMinusResponse (

    /* Type of step */
    @Json(name = "eEzsignsignaturestatusSteptype")
    val eEzsignsignaturestatusSteptype: CustomMinusEzsignsignaturestatusMinusResponse.EEzsignsignaturestatusSteptype,

    /* The step at which the Ezsignsigner will be invited to sign or fill the form fields */
    @Json(name = "iEzsignsignaturestatusStep")
    val iEzsignsignaturestatusStep: kotlin.Int,

    /* The total number of signature or form fields the Ezsignsigner must process at the current step */
    @Json(name = "iEzsignsignaturestatusTotal")
    val iEzsignsignaturestatusTotal: kotlin.Int,

    /* The number of signature or form fields the Ezsignsigner has already processed at the current step */
    @Json(name = "iEzsignsignaturestatusSigned")
    val iEzsignsignaturestatusSigned: kotlin.Int

) {

    /**
     * Type of step
     *
     * Values: Form,Signature
     */
    enum class EEzsignsignaturestatusSteptype(val value: kotlin.String) {
        @Json(name = "Form") Form("Form"),
        @Json(name = "Signature") Signature("Signature");
    }
}

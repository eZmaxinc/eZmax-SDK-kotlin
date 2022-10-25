/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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

import eZmaxApi.models.CustomEzmaxinvoicingEzsignfolderResponseAllOf

import com.squareup.moshi.Json

/**
 * An EzmaxinvoicingEzsignfolder object containing information about the Ezmaxinvoicing for an Ezsignfolder
 *
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param sEzsignfolderDescription The description of the Ezsignfolder
 * @param bEzsigntsarequirementBillable Whether the TSA requirement is billable or not
 * @param bEzsignfolderMfaused Whether the MFA was used or not for the Ezsignfolder
 * @param bEzsignfolderPaymentused Whether there was a signature is of type payment
 * @param bEzsignfolderAllowed 
 */

data class CustomMinusEzmaxinvoicingEzsignfolderMinusResponse (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,

    /* The description of the Ezsignfolder */
    @Json(name = "sEzsignfolderDescription")
    val sEzsignfolderDescription: kotlin.String,

    /* Whether the TSA requirement is billable or not */
    @Json(name = "bEzsigntsarequirementBillable")
    val bEzsigntsarequirementBillable: kotlin.Boolean,

    /* Whether the MFA was used or not for the Ezsignfolder */
    @Json(name = "bEzsignfolderMfaused")
    val bEzsignfolderMfaused: kotlin.Boolean,

    /* Whether there was a signature is of type payment */
    @Json(name = "bEzsignfolderPaymentused")
    val bEzsignfolderPaymentused: kotlin.Boolean,

    @Json(name = "bEzsignfolderAllowed")
    val bEzsignfolderAllowed: kotlin.Boolean

)


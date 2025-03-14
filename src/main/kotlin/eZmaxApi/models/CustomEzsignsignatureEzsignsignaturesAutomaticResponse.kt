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

import eZmaxApi.models.FieldEEzsignsignatureType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsignsignature Object in the context of an EzsignsignaturesAutomatic path
 *
 * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature
 * @param eEzsignsignatureType 
 * @param iEzsignpagePagenumber The page number in the Ezsigndocument
 */


data class CustomEzsignsignatureEzsignsignaturesAutomaticResponse (

    /* The unique ID of the Ezsignsignature */
    @Json(name = "pkiEzsignsignatureID")
    val pkiEzsignsignatureID: kotlin.Int,

    @Json(name = "eEzsignsignatureType")
    val eEzsignsignatureType: FieldEEzsignsignatureType,

    /* The page number in the Ezsigndocument */
    @Json(name = "iEzsignpagePagenumber")
    val iEzsignpagePagenumber: kotlin.Int

) {


}


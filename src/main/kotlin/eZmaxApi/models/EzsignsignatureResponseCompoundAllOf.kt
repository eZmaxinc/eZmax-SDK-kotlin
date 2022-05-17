/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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

import eZmaxApi.models.EzsignsignaturecustomdateMinusResponseCompound

import com.squareup.moshi.Json

/**
 * 
 *
 * @param bEzsignsignatureCustomdate Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**)
 * @param aObjEzsignsignaturecustomdate An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.
 */

data class EzsignsignatureResponseCompoundAllOf (

    /* Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**) */
    @Json(name = "bEzsignsignatureCustomdate")
    val bEzsignsignatureCustomdate: kotlin.Boolean? = null,

    /* An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all. */
    @Json(name = "a_objEzsignsignaturecustomdate")
    val aObjEzsignsignaturecustomdate: kotlin.collections.List<EzsignsignaturecustomdateMinusResponseCompound>? = null

)


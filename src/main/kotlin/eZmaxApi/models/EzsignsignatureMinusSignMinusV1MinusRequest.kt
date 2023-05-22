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
 * Request for POST /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign
 *
 * @param bIsAutomatic Indicates if the Ezsignsignature was part of an automatic process or not.  This can only be true if eEzsignsignatureType is **Acknowledgement**, **City**, **Handwritten**, **Initials**, **Name** or **Stamp**. 
 * @param sValue The value required for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **City**, **FieldText** or **FieldTextarea**
 */


data class EzsignsignatureMinusSignMinusV1MinusRequest (

    /* Indicates if the Ezsignsignature was part of an automatic process or not.  This can only be true if eEzsignsignatureType is **Acknowledgement**, **City**, **Handwritten**, **Initials**, **Name** or **Stamp**.  */
    @Json(name = "bIsAutomatic")
    val bIsAutomatic: kotlin.Boolean,

    /* The value required for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **City**, **FieldText** or **FieldTextarea** */
    @Json(name = "sValue")
    val sValue: kotlin.String? = null

)


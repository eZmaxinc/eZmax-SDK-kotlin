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

import eZmaxApi.models.EzsigntemplatepackagemembershipResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID}
 *
 * @param objEzsigntemplatepackagemembership 
 */


data class EzsigntemplatepackagemembershipGetObjectV2ResponseMPayload (

    @Json(name = "objEzsigntemplatepackagemembership")
    val objEzsigntemplatepackagemembership: EzsigntemplatepackagemembershipResponseCompound

) {


}


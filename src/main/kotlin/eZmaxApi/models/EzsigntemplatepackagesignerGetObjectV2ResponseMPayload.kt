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

import eZmaxApi.models.EzsigntemplatepackagesignerResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}
 *
 * @param objEzsigntemplatepackagesigner 
 */


data class EzsigntemplatepackagesignerGetObjectV2ResponseMPayload (

    @Json(name = "objEzsigntemplatepackagesigner")
    val objEzsigntemplatepackagesigner: EzsigntemplatepackagesignerResponseCompound

) {


}


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

import eZmaxApi.models.EzsignuserRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for PUT /1/object/ezsignuser/{pkiEzsignuserID}
 *
 * @param objEzsignuser 
 */


data class EzsignuserEditObjectV1Request (

    @Json(name = "objEzsignuser")
    val objEzsignuser: EzsignuserRequestCompound

) {


}


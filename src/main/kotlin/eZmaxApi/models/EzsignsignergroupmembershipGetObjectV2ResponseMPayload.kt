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

import eZmaxApi.models.EzsignsignergroupmembershipResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for GET /2/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID}
 *
 * @param objEzsignsignergroupmembership 
 */


data class EzsignsignergroupmembershipGetObjectV2ResponseMPayload (

    @Json(name = "objEzsignsignergroupmembership")
    val objEzsignsignergroupmembership: EzsignsignergroupmembershipResponseCompound

) {


}


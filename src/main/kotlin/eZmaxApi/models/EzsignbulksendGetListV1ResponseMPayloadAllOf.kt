/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
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

import eZmaxApi.models.EzsignbulksendMinusListElement

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aObjEzsignbulksend 
 */

data class EzsignbulksendGetListV1ResponseMPayloadAllOf (

    @Json(name = "a_objEzsignbulksend")
    val aObjEzsignbulksend: kotlin.collections.List<EzsignbulksendMinusListElement>

)


/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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

import eZmaxApi.models.CustomMinusWordPositionOccurenceMinusResponse

import com.squareup.moshi.Json

/**
 * A Word Position Object
 *
 * @param sWord The searched word
 * @param aObjWordPositionOccurence The found occurences for the seached word
 */

data class CustomMinusWordPositionWordMinusResponse (

    /* The searched word */
    @Json(name = "sWord")
    val sWord: kotlin.String,

    /* The found occurences for the seached word */
    @Json(name = "a_objWordPositionOccurence")
    val aObjWordPositionOccurence: kotlin.collections.List<CustomMinusWordPositionOccurenceMinusResponse>

)


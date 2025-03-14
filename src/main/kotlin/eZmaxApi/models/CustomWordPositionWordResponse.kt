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

import eZmaxApi.models.CustomWordPositionOccurenceResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Word Position Object
 *
 * @param sWord The searched word
 * @param aObjWordPositionOccurence The found occurences for the seached word
 */


data class CustomWordPositionWordResponse (

    /* The searched word */
    @Json(name = "sWord")
    val sWord: kotlin.String,

    /* The found occurences for the seached word */
    @Json(name = "a_objWordPositionOccurence")
    val aObjWordPositionOccurence: kotlin.collections.List<CustomWordPositionOccurenceResponse>

) {


}


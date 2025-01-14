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
 * The description of the Userlogintype
 *
 * @param sUserlogintypeDescription1 The description of the Userlogintype in French
 * @param sUserlogintypeDescription2 The description of the Userlogintype in English
 */


data class MultilingualUserlogintypeDescription (

    /* The description of the Userlogintype in French */
    @Json(name = "sUserlogintypeDescription1")
    val sUserlogintypeDescription1: kotlin.String? = null,

    /* The description of the Userlogintype in English */
    @Json(name = "sUserlogintypeDescription2")
    val sUserlogintypeDescription2: kotlin.String? = null

) {


}


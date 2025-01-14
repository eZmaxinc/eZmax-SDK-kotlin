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
 * Description of the Ezsignsignergroup
 *
 * @param sEzsignsignergroupDescription1 The description of the Ezsignsignergroup in French
 * @param sEzsignsignergroupDescription2 The description of the Ezsignsignergroup in English
 */


data class MultilingualEzsignsignergroupDescription (

    /* The description of the Ezsignsignergroup in French */
    @Json(name = "sEzsignsignergroupDescription1")
    val sEzsignsignergroupDescription1: kotlin.String? = null,

    /* The description of the Ezsignsignergroup in English */
    @Json(name = "sEzsignsignergroupDescription2")
    val sEzsignsignergroupDescription2: kotlin.String? = null

) {


}


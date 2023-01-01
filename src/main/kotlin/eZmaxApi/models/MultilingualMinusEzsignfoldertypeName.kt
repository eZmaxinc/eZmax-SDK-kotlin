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

/**
 * Name of the Ezsignfoldertype
 *
 * @param sEzsignfoldertypeName1 The name of the Ezsignfoldertype in French
 * @param sEzsignfoldertypeName2 The name of the Ezsignfoldertype in English
 */


data class MultilingualMinusEzsignfoldertypeName (

    /* The name of the Ezsignfoldertype in French */
    @Json(name = "sEzsignfoldertypeName1")
    val sEzsignfoldertypeName1: kotlin.String? = null,

    /* The name of the Ezsignfoldertype in English */
    @Json(name = "sEzsignfoldertypeName2")
    val sEzsignfoldertypeName2: kotlin.String? = null

)


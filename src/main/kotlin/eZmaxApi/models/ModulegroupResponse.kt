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
 * A Modulegroup Object
 *
 * @param pkiModulegroupID The unique ID of the Modulegroup
 * @param sModulegroupNameX The name of the Modulegroup in the language of the requester
 */


data class ModulegroupResponse (

    /* The unique ID of the Modulegroup */
    @Json(name = "pkiModulegroupID")
    val pkiModulegroupID: kotlin.Int,

    /* The name of the Modulegroup in the language of the requester */
    @Json(name = "sModulegroupNameX")
    val sModulegroupNameX: kotlin.String

) {


}


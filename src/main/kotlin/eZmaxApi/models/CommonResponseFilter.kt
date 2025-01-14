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
 * Definition of Filters for getList
 *
 * @param aAutoType List of filters that can be used in *sFilter* (Automatic types)
 * @param aAutoTypeHaving List of computed filters that can be used in *sFilter* (Automatic types)
 * @param aEnum List of filters that can be used in *sFilter* (Enum types)
 */


data class CommonResponseFilter (

    /* List of filters that can be used in *sFilter* (Automatic types) */
    @Json(name = "a_AutoType")
    val aAutoType: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    /* List of computed filters that can be used in *sFilter* (Automatic types) */
    @Json(name = "a_AutoTypeHaving")
    val aAutoTypeHaving: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    /* List of filters that can be used in *sFilter* (Enum types) */
    @Json(name = "a_Enum")
    val aEnum: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.String>>? = null

) {


}


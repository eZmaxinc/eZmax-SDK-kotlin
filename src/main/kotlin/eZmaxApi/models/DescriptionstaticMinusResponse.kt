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
 * A Descriptionstatic Object
 *
 * @param pkiDescriptionstaticID The unique ID of the Descriptionstatic
 * @param sDescriptionstaticDescription The description of the Descriptionstatic
 */


data class DescriptionstaticMinusResponse (

    /* The unique ID of the Descriptionstatic */
    @Json(name = "pkiDescriptionstaticID")
    val pkiDescriptionstaticID: kotlin.Int,

    /* The description of the Descriptionstatic */
    @Json(name = "sDescriptionstaticDescription")
    val sDescriptionstaticDescription: kotlin.String

)


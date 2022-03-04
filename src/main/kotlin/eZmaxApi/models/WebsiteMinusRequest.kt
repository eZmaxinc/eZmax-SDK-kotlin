/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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


import com.squareup.moshi.Json

/**
 * A Website Object
 *
 * @param fkiWebsitetypeID The unique ID of the Websitetype.  Valid values:  |Value|Description| |-|-| |1|Website| |2|Twitter| |3|Facebook| |4|Survey|
 * @param sWebsiteAddress The URL of the website.
 */

data class WebsiteMinusRequest (

    /* The unique ID of the Websitetype.  Valid values:  |Value|Description| |-|-| |1|Website| |2|Twitter| |3|Facebook| |4|Survey| */
    @Json(name = "fkiWebsitetypeID")
    val fkiWebsitetypeID: kotlin.Int,

    /* The URL of the website. */
    @Json(name = "sWebsiteAddress")
    val sWebsiteAddress: kotlin.String

)


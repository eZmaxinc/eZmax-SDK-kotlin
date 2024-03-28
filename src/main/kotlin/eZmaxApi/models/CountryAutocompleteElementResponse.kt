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
 * A Country AutocompleteElement Response
 *
 * @param pkiCountryID The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States|
 * @param sCountryNameX The name of the Country in the language of the requester
 * @param sCountryShortname The shortname of the Country
 * @param bCountryIsactive Whether the Country is active or not
 */


data class CountryAutocompleteElementResponse (

    /* The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States| */
    @Json(name = "pkiCountryID")
    val pkiCountryID: kotlin.Int,

    /* The name of the Country in the language of the requester */
    @Json(name = "sCountryNameX")
    val sCountryNameX: kotlin.String,

    /* The shortname of the Country */
    @Json(name = "sCountryShortname")
    val sCountryShortname: kotlin.String,

    /* Whether the Country is active or not */
    @Json(name = "bCountryIsactive")
    val bCountryIsactive: kotlin.Boolean

)

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
 * A Contacttitle AutocompleteElement Response
 *
 * @param pkiContacttitleID The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)|
 * @param sContacttitleNameX The name of the Contacttitle in the language of the requester
 */


data class ContacttitleAutocompleteElementResponse (

    /* The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)| */
    @Json(name = "pkiContacttitleID")
    val pkiContacttitleID: kotlin.Int,

    /* The name of the Contacttitle in the language of the requester */
    @Json(name = "sContacttitleNameX")
    val sContacttitleNameX: kotlin.String

) {


}


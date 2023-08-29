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
 * A Emailtype AutocompleteElement Response
 *
 * @param pkiEmailtypeID The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home|
 * @param sEmailtypeNameX The name of the Emailtype in the language of the requester
 * @param bEmailtypeIsactive Whether the Emailtype is active or not
 */


data class EmailtypeAutocompleteElementResponse (

    /* The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| */
    @Json(name = "pkiEmailtypeID")
    val pkiEmailtypeID: kotlin.Int,

    /* The name of the Emailtype in the language of the requester */
    @Json(name = "sEmailtypeNameX")
    val sEmailtypeNameX: kotlin.String,

    /* Whether the Emailtype is active or not */
    @Json(name = "bEmailtypeIsactive")
    val bEmailtypeIsactive: kotlin.Boolean

)


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
 * An Email Object and children to create a complete structure
 *
 * @param fkiEmailtypeID The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home|
 * @param sEmailAddress The email address.
 * @param pkiEmailID The unique ID of the Email
 */


data class EmailMinusRequestCompound (

    /* The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| */
    @Json(name = "fkiEmailtypeID")
    val fkiEmailtypeID: kotlin.Int,

    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String,

    /* The unique ID of the Email */
    @Json(name = "pkiEmailID")
    val pkiEmailID: kotlin.Int? = null

)


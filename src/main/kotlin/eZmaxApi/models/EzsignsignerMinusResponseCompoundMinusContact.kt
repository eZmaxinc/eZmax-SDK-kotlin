/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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
 * A Ezsignsigner->Contact Object and children to create a complete structure
 *
 * @param sContactFirstname The First name of the contact
 * @param sContactLastname The Last name of the contact
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sEmailAddress The email address.
 * @param sPhoneE164 A phone number in E.164 Format
 * @param sPhoneE164Cell A phone number in E.164 Format
 */

data class EzsignsignerMinusResponseCompoundMinusContact (

    /* The First name of the contact */
    @Json(name = "sContactFirstname")
    val sContactFirstname: kotlin.String,

    /* The Last name of the contact */
    @Json(name = "sContactLastname")
    val sContactLastname: kotlin.String,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String? = null,

    /* A phone number in E.164 Format */
    @Json(name = "sPhoneE164")
    val sPhoneE164: kotlin.String? = null,

    /* A phone number in E.164 Format */
    @Json(name = "sPhoneE164Cell")
    val sPhoneE164Cell: kotlin.String? = null

)


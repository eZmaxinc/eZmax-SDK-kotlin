/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
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
 * @param pkiContactID The unique ID of the Contact
 * @param sContactFirstname The First name of the contact
 * @param sContactLastname The Last name of the contact
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sEmailAddress The email address.
 * @param sPhoneE164 A phone number in E.164 Format
 * @param sPhoneExtension The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
 * @param sPhoneE164Cell A phone number in E.164 Format
 */

data class EzsignsignerMinusResponseCompoundMinusContact (

    /* The unique ID of the Contact */
    @Json(name = "pkiContactID")
    val pkiContactID: kotlin.Int,

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

    /* The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers */
    @Json(name = "sPhoneExtension")
    val sPhoneExtension: kotlin.String? = null,

    /* A phone number in E.164 Format */
    @Json(name = "sPhoneE164Cell")
    val sPhoneE164Cell: kotlin.String? = null

)


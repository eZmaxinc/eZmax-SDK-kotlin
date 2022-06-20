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
 * Request for POST /1/module/user/createEzsignuser
 *
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sUserFirstname The First name of the user
 * @param sUserLastname The Last name of the user
 * @param sEmailAddress The email address.
 * @param sPhoneRegion The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123
 * @param sPhoneExchange The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123
 * @param sPhoneNumber The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123
 * @param sPhoneExtension The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
 */

data class UserMinusCreateEzsignuserMinusV1MinusRequest (

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The First name of the user */
    @Json(name = "sUserFirstname")
    val sUserFirstname: kotlin.String,

    /* The Last name of the user */
    @Json(name = "sUserLastname")
    val sUserLastname: kotlin.String,

    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String,

    /* The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123 */
    @Json(name = "sPhoneRegion")
    val sPhoneRegion: kotlin.String,

    /* The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123 */
    @Json(name = "sPhoneExchange")
    val sPhoneExchange: kotlin.String,

    /* The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123 */
    @Json(name = "sPhoneNumber")
    val sPhoneNumber: kotlin.String,

    /* The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers */
    @Json(name = "sPhoneExtension")
    val sPhoneExtension: kotlin.String? = null

)


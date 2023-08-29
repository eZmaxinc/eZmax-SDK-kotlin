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

import eZmaxApi.models.FieldEPhoneType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Phone Object and children to create a complete structure
 *
 * @param fkiPhonetypeID The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free|
 * @param pkiPhoneID The unique ID of the Phone.
 * @param ePhoneType 
 * @param sPhoneRegion The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123
 * @param sPhoneExchange The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123
 * @param sPhoneNumber The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123
 * @param sPhoneInternational The international phone number.
 * @param sPhoneExtension The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
 * @param sPhoneE164 A phone number in E.164 Format
 */


data class PhoneRequestCompound (

    /* The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free| */
    @Json(name = "fkiPhonetypeID")
    val fkiPhonetypeID: kotlin.Int,

    /* The unique ID of the Phone. */
    @Json(name = "pkiPhoneID")
    val pkiPhoneID: kotlin.Int? = null,

    @Json(name = "ePhoneType")
    @Deprecated(message = "This property is deprecated.")
    val ePhoneType: FieldEPhoneType? = null,

    /* The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123 */
    @Json(name = "sPhoneRegion")
    @Deprecated(message = "This property is deprecated.")
    val sPhoneRegion: kotlin.String? = null,

    /* The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123 */
    @Json(name = "sPhoneExchange")
    @Deprecated(message = "This property is deprecated.")
    val sPhoneExchange: kotlin.String? = null,

    /* The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123 */
    @Json(name = "sPhoneNumber")
    @Deprecated(message = "This property is deprecated.")
    val sPhoneNumber: kotlin.String? = null,

    /* The international phone number. */
    @Json(name = "sPhoneInternational")
    @Deprecated(message = "This property is deprecated.")
    val sPhoneInternational: kotlin.String? = null,

    /* The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers */
    @Json(name = "sPhoneExtension")
    val sPhoneExtension: kotlin.String? = null,

    /* A phone number in E.164 Format */
    @Json(name = "sPhoneE164")
    val sPhoneE164: kotlin.String? = null

)


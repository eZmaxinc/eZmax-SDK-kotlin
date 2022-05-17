/**
 * eZmax API Definition (Full)
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

import eZmaxApi.models.FieldMinusEPhoneType
import eZmaxApi.models.PhoneMinusRequest

import com.squareup.moshi.Json

/**
 * A Phone Object and children to create a complete structure
 *
 * @param fkiPhonetypeID The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free|
 * @param ePhoneType 
 * @param sPhoneRegion The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123
 * @param sPhoneExchange The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123
 * @param sPhoneNumber The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123
 * @param sPhoneInternational A phone number in E.164 Format
 * @param sPhoneExtension The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
 */

data class PhoneMinusRequestCompound (

    /* The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free| */
    @Json(name = "fkiPhonetypeID")
    val fkiPhonetypeID: kotlin.Int,

    @Json(name = "ePhoneType")
    val ePhoneType: FieldMinusEPhoneType,

    /* The region of the phone number. (For a North America Number only)  The region is the \"514\" section in this sample phone number: (514) 990-1516 x123 */
    @Json(name = "sPhoneRegion")
    val sPhoneRegion: kotlin.String? = null,

    /* The exchange of the phone number. (For a North America Number only)  The exchange is the \"990\" section in this sample phone number: (514) 990-1516 x123 */
    @Json(name = "sPhoneExchange")
    val sPhoneExchange: kotlin.String? = null,

    /* The number of the phone number. (For a North America Number only)  The number is the \"1516\" section in this sample phone number: (514) 990-1516 x123 */
    @Json(name = "sPhoneNumber")
    val sPhoneNumber: kotlin.String? = null,

    /* A phone number in E.164 Format */
    @Json(name = "sPhoneInternational")
    val sPhoneInternational: kotlin.String? = null,

    /* The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers */
    @Json(name = "sPhoneExtension")
    val sPhoneExtension: kotlin.String? = null

)


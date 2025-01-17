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
import eZmaxApi.models.PhoneResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Phone Object and children to create a complete structure
 *
 * @param pkiPhoneID The unique ID of the Phone.
 * @param fkiPhonetypeID The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free|
 * @param ePhoneType 
 * @param sPhoneE164 A phone number in E.164 Format
 * @param sPhoneExtension The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
 * @param bPhoneInternational Indicate the phone number is an international phone number.
 */


data class PhoneResponseCompound (

    /* The unique ID of the Phone. */
    @Json(name = "pkiPhoneID")
    override val pkiPhoneID: kotlin.Int,

    /* The unique ID of the Phonetype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Mobile| |4|Fax| |5|Pager| |6|Toll Free| */
    @Json(name = "fkiPhonetypeID")
    override val fkiPhonetypeID: kotlin.Int,

    @Json(name = "ePhoneType")
    @Deprecated(message = "This property is deprecated.")
    override val ePhoneType: FieldEPhoneType? = null,

    /* A phone number in E.164 Format */
    @Json(name = "sPhoneE164")
    override val sPhoneE164: kotlin.String? = null,

    /* The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers */
    @Json(name = "sPhoneExtension")
    override val sPhoneExtension: kotlin.String? = null,

    /* Indicate the phone number is an international phone number. */
    @Json(name = "bPhoneInternational")
    val bPhoneInternational: kotlin.Boolean? = null

) : PhoneResponse {


}


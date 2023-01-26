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

/**
 * A Phonestatic Object and children to create a complete structure
 *
 * @param pkiPhonestaticID The unique ID of the Phone.
 * @param sPhonestaticE164 A phone number in E.164 Format
 * @param sPhonestaticExtension The extension of the phone number.
 */


data class PhonestaticMinusResponseCompound (

    /* The unique ID of the Phone. */
    @Json(name = "pkiPhonestaticID")
    val pkiPhonestaticID: kotlin.Int,

    /* A phone number in E.164 Format */
    @Json(name = "sPhonestaticE164")
    val sPhonestaticE164: kotlin.String? = null,

    /* The extension of the phone number. */
    @Json(name = "sPhonestaticExtension")
    val sPhonestaticExtension: kotlin.String? = null

)

